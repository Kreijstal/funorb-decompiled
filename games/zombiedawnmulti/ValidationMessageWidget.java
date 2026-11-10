/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationMessageWidget extends HotspotTextWidget {
    static QuickChatCommandType field_W;
    private ValidationProvider field_Y;
    static boolean[] field_ab;
    private String field_bb;
    private Sprite field_Z;
    private int field_X;
    static int field_cb;

    final void renderWidget(int param0, int param1, int param2, int param3) {
        String var5;
        ValidationState var6;
        int var13;
        TextWidgetLayout var8;
        int var9;
        int var10;
        int var11;
        int var12;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        Sprite var18;
        int var11Lifetime1;
        int var12Lifetime1;
        ValidationState var6Lifetime1;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = this.field_Y.getDebouncedValidationState(102);
        if (var6 != PortalView.field_H &&
          var6 != DraggableWidget.field_I) {
          var5 = this.field_Y.getDebouncedValidationMessage(-120);
          if (var5 == null) {
            var5 = this.field_bb;
          }
        } else {
          var5 = SpriteHotspot.field_n;
        }
        if (!var5.equals(this.field_j)) {
          this.field_j = var5;
          this.rebuildHotspotBounds((byte) 94);
        }
        super.renderWidget(param0, param1, param2, param3);
        var6Lifetime1 = this.field_Y.getDebouncedValidationState(97);
        var8 = (TextWidgetLayout) ((Object) this.painter);
        var9 = this.field_y + param3;
        var10 = var8.getTextOriginY((UiWidget) (this), 0, param1) + (var8.getTextLayout((UiWidget) (this), param0 - 99).height((byte) -111) >> 1);
        if (PortalView.field_H == var6Lifetime1) {
          var18 = RubbleChunk.field_I[0];
          var11 = var18.fullWidth << 1;
          var12 = var18.field_u << 1;
          if (this.field_Z == null) {
            this.field_Z = new Sprite(var11, var12);
            MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
          } else {
            if (this.field_Z.width < var11) {
              this.field_Z = new Sprite(var11, var12);
              MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
            } else {
              if (this.field_Z.height < var12) {
                this.field_Z = new Sprite(var11, var12);
                MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
              } else {
                MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
                SoftwareRasterizer.clear();
              }
            }
          }
          var18.drawRotatedAboutPivot(112, 144, var18.fullWidth << 4, var18.field_u << 4, -this.field_X << 10, 4096);
          RasterStackHelpers.popRaster(true);
          this.field_Z.drawAdditive(var9 - (var18.fullWidth >> 1), var10 - var18.field_u, 256);
          return;
        }
        if (DraggableWidget.field_I != var6Lifetime1) {
          if (PowerGaugeHelpers.field_b == var6Lifetime1) {
            var15 = RubbleChunk.field_I[2];
            var15.drawAdditive(var9, var10 - (var15.height >> 1), 256);
            return;
          }
          if (var6Lifetime1 == AudioStartupHelpers.field_b) {
            var16 = RubbleChunk.field_I[1];
            var16.drawAdditive(var9, -(var16.height >> 1) + var10, 256);
          }
          return;
        }
        var17 = RubbleChunk.field_I[0];
        var11Lifetime1 = var17.fullWidth << 1;
        var12Lifetime1 = var17.field_u << 1;
        if (this.field_Z == null) {
          this.field_Z = new Sprite(var11Lifetime1, var12Lifetime1);
          MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
        } else {
          if (this.field_Z.width < var11Lifetime1) {
            this.field_Z = new Sprite(var11Lifetime1, var12Lifetime1);
            MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
          } else {
            if (this.field_Z.height < var12Lifetime1) {
              this.field_Z = new Sprite(var11Lifetime1, var12Lifetime1);
              MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
            } else {
              MusicPatchLoadHelpers.pushSpriteRaster(0, this.field_Z);
              SoftwareRasterizer.clear();
            }
          }
        }
        var17.drawRotatedAboutPivot(112, 144, var17.fullWidth << 4, var17.field_u << 4, -this.field_X << 10, 4096);
        RasterStackHelpers.popRaster(true);
        this.field_Z.drawAdditive(var9 - (var17.fullWidth >> 1), var10 - var17.field_u, 256);
        return;
    }

    final static void resendPendingSubmissions(int param0, byte param1) {
        int var2_int = 0;
        IntrusiveNode var3 = null;
        int var4 = 0;
        MusicPatchNode var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = (MusicPatchNode) (QuickChatCategoryRegistry.field_a.last(92));
          while (var5 != null) {
            StatSubmissionHelpers.sendStatSubmission((byte) 99, var5, param0);
            var5 = (MusicPatchNode) (QuickChatCategoryRegistry.field_a.previous(6));
          }
          var2_int = -37 / ((-63 - param1) / 58);
          var3 = UnitStateEvent.field_j.last(48);
          while (var3 != null) {
            UiComponentNode.sendRequestHeader(true, param0);
            var3 = UnitStateEvent.field_j.previous(6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "km.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void updatePointerState(int param0, UiWidget param1, int param2, int param3) {
        try {
          this.field_X = this.field_X + 1;
          if (param0 != -5407) {
            ValidationMessageWidget.releaseStatics(56);
          }
          super.updatePointerState(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "km.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_W = null;
        field_ab = null;
    }

    final static void initializeSocialPanels(ResourceArchive param0, byte param1) {
        UiComponent var5 = null;
        UiComponent var6 = null;
        UiComponent var3 = null;
        try {
          SimUnit.field_T = ByteArrayPool.loadSpriteByName("basic", "display_name_changed", param0, 11091);
          StrongCacheEntry.field_B = new ScrollPaneWithFooter(0L, BirthDateEntryPanel.field_Q, TutorialAndMenuHelpers.field_a, PlayModeChoiceDialog.field_I);
          UsernameSuggestionsPanel.field_L = new ScrollPaneWithFooter(0L, BirthDateEntryPanel.field_Q, ProgramNoteUsage.field_i, TabbedOverlayPanel.field_d);
          SimUnit.field_O = new UiComponent(0L, (UiComponent) null);
          DisplayNameRequestHelpers.field_b = new UiComponent(0L, IntroScreen.field_m);
          DisplayNameRequestHelpers.field_b.field_R = 1;
          AccountTextGlobals.field_f = new UiComponent(0L, SleepAndNameHelpers.field_a, GameScreen.field_r);
          PlayerContextMenu.field_c = new UiComponent(0L, ArchiveAvailabilityHelpers.field_g, PowerupBar.field_h);
          MiasmaParticle.field_J = new UiComponent(0L, LobbyRequestHelpers.field_b);
          if (param1 > -106) {
            ValidationMessageWidget.openGuestLoginPanel(-103);
          }
          SimUnit.field_O.addChild((byte) 50, DisplayNameRequestHelpers.field_b);
          SimUnit.field_O.addChild((byte) 50, AccountTextGlobals.field_f);
          SimUnit.field_O.addChild((byte) 50, PlayerContextMenu.field_c);
          SimUnit.field_O.addChild((byte) 50, StrongCacheEntry.field_B);
          SimUnit.field_O.addChild((byte) 50, MiasmaParticle.field_J);
          StrongCacheEntry.field_B.field_Jb.field_Jb.copyStyle((byte) -32, IntroScreen.field_m);
          StrongCacheEntry.field_B.field_Jb.field_Jb.field_lb = 1;
          var5 = StrongCacheEntry.field_B.field_Jb.field_Jb;
          var6 = var5;
          var6.field_R = 1;
          UsernameSuggestionsPanel.field_L.field_Jb.field_Jb.copyStyle((byte) -32, IntroScreen.field_m);
          UsernameSuggestionsPanel.field_L.field_Jb.field_Jb.field_lb = 1;
          var3 = UsernameSuggestionsPanel.field_L.field_Jb.field_Jb;
          var3.field_R = 1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "km.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String getHoverText(byte param0) {
        int var2 = 82 / ((param0 - 53) / 57);
        return null;
    }

    final boolean requestKeyboardFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("km.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void openGuestLoginPanel(int param0) {
        if (!ZombieDrop.field_N) {
          throw new IllegalStateException();
        }
        MenuInputState.field_m = true;
        DualLinkNodeHashTable.showLoginDialog(-86, false);
        LoginSuccessHelpers.field_b = param0;
    }

    final static ChatMessage findChatLineAt(int param0, int param1, int param2, int param3) {
        boolean stackIn_43_0 = false;
        boolean stackIn_47_0 = false;
        boolean stackIn_56_0 = false;
        boolean stackIn_60_0 = false;
        boolean stackIn_68_0 = false;
        boolean stackIn_72_0 = false;
        boolean stackIn_79_0 = false;
        boolean stackIn_83_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ChatMessage var8_ref_ka;
        int var9;
        ChatMessage var9_ref_ka;
        int var10;
        String var10_ref_String;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime1Lifetime1;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = null;
        NetworkArchiveRequest.field_A.field_Gb.field_Cb.clear(-30986);
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + MoveOrderMarker.field_g; var7 >= 0; var7--) {
          var8_ref_ka = ValidationIconWidget.field_M[var7];
          var9 = 0;
          if (!PendingRankingRequest.field_m &&
            var5 < InfectionEvent.field_m) {
            var10 = CipherPacketBuffer.getChatFilterMode(var8_ref_ka.field_l, true);
            if (var8_ref_ka.getFilterPriority(true) >= var10 && (var8_ref_ka.field_k ||
              !RandomHelpers.isIgnored(var8_ref_ka.field_e, 1020))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (var8_ref_ka.field_q == null ||
              LevelFileListHolder.field_b) {
              if (null == var8_ref_ka.field_q) {
                SceneObject.field_D = SceneObject.field_D + 1;
              }
              var10_ref_String = ChatAndOptionHelpers.formatChatPrefix(-126, var8_ref_ka);
              var11 = var10_ref_String + BitmapFont.escapeMarkup(var8_ref_ka.field_d);
              var12 = UiComponent.getChatMessageColour(var8_ref_ka, (byte) -63);
              var8_ref_ka.field_q = new UiComponent(0L, IntHashIndex.field_f, var11);
              var6 = var6 + param2;
              var8_ref_ka.field_q.field_xb = (8355711 & IntHashIndex.field_f.field_xb >> 1) + var12 - ((var12 & 16711422) >> 1);
              var8_ref_ka.field_q.field_ob = (8355711 & IntHashIndex.field_f.field_ob >> 1) + (var12 - ((var12 & 16711422) >> 1));
              var8_ref_ka.field_q.field_yb = MusicCrossfadeStream.field_A;
              var8_ref_ka.field_q.field_M = var12;
            }
            var5++;
          } else {
            var8_ref_ka.field_q = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; MoveOrderMarker.field_g > var8; var8++) {
          var9_ref_ka = ValidationIconWidget.field_M[var8];
          if (var9_ref_ka.field_q != null) {
            NetworkArchiveRequest.field_A.field_Gb.addChild((byte) 50, var9_ref_ka.field_q);
            var9_ref_ka.field_q.setBounds(param2, var7Lifetime1, var9_ref_ka.field_q.getPreferredWidth(0), param3, -3344);
            var7Lifetime1 = var7Lifetime1 + param2;
            if (0 != var9_ref_ka.field_q.field_T) {
              var4 = var9_ref_ka;
            }
          }
        }
        var8Lifetime1 = -var7Lifetime1 - (-var6 - (NetworkArchiveRequest.field_A.field_Gb.field_z + NetworkArchiveRequest.field_A.field_Gb.field_I));
        NetworkArchiveRequest.field_A.field_Gb.field_Q = NetworkArchiveRequest.field_A.field_Gb.field_Q + var8Lifetime1;
        var9Lifetime1 = -121 / ((-54 - param0) / 40);
        NetworkArchiveRequest.field_A.field_Gb.field_z = NetworkArchiveRequest.field_A.field_Gb.field_z - var8Lifetime1;
        if (LevelFileListHolder.field_b) {
          NetworkArchiveRequest.field_A.field_Gb.field_z = var7Lifetime1;
        }
        NetworkArchiveRequest.field_A.field_Gb.field_I = var7Lifetime1 - NetworkArchiveRequest.field_A.field_Gb.field_z;
        if (!LevelFileListHolder.field_b) {
          if (HotspotTextWidget.field_N) {
            if (null == ClickMarker.field_v) {
              var10Lifetime1 = NetworkArchiveRequest.field_A.field_Jb.field_z + (-NetworkArchiveRequest.field_A.field_Gb.field_z - NetworkArchiveRequest.field_A.field_Gb.field_I);
              if (!CachedTextLayout.field_h) {
                NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
                stackIn_68_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime1);
                CachedTextLayout.field_h = stackIn_68_0;
              } else {
                NetworkArchiveRequest.field_A.field_Gb.field_mb = var10Lifetime1 - NetworkArchiveRequest.field_A.field_Gb.field_Q;
                NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
                stackIn_72_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime1);
                CachedTextLayout.field_h = stackIn_72_0;
              }
              return (ChatMessage) (var4);
            }
            CachedTextLayout.field_h = true;
          }
          var10Lifetime1Lifetime1 = NetworkArchiveRequest.field_A.field_Jb.field_z + (-NetworkArchiveRequest.field_A.field_Gb.field_z - NetworkArchiveRequest.field_A.field_Gb.field_I);
          if (!CachedTextLayout.field_h) {
            NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
            stackIn_79_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime1Lifetime1);
            CachedTextLayout.field_h = stackIn_79_0;
          } else {
            NetworkArchiveRequest.field_A.field_Gb.field_mb = var10Lifetime1Lifetime1 - NetworkArchiveRequest.field_A.field_Gb.field_Q;
            NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
            stackIn_83_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime1Lifetime1);
            CachedTextLayout.field_h = stackIn_83_0;
          }
          return (ChatMessage) (var4);
        }
        NetworkArchiveRequest.field_A.field_Gb.field_mb = 0;
        LevelFileListHolder.field_b = false;
        NetworkArchiveRequest.field_A.field_Gb.field_Q = -NetworkArchiveRequest.field_A.field_Gb.field_z + NetworkArchiveRequest.field_A.field_Jb.field_z;
        CachedTextLayout.field_h = true;
        if (!HotspotTextWidget.field_N) {
          var10Lifetime2 = NetworkArchiveRequest.field_A.field_Jb.field_z + (-NetworkArchiveRequest.field_A.field_Gb.field_z - NetworkArchiveRequest.field_A.field_Gb.field_I);
          if (!CachedTextLayout.field_h) {
            NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
            stackIn_43_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime2);
            CachedTextLayout.field_h = stackIn_43_0;
          } else {
            NetworkArchiveRequest.field_A.field_Gb.field_mb = var10Lifetime2 - NetworkArchiveRequest.field_A.field_Gb.field_Q;
            NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
            stackIn_47_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime2);
            CachedTextLayout.field_h = stackIn_47_0;
          }
        } else {
          if (null != ClickMarker.field_v) {
            CachedTextLayout.field_h = true;
          }
          var10Lifetime2 = NetworkArchiveRequest.field_A.field_Jb.field_z + (-NetworkArchiveRequest.field_A.field_Gb.field_z - NetworkArchiveRequest.field_A.field_Gb.field_I);
          if (!CachedTextLayout.field_h) {
            NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
            stackIn_60_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime2);
            CachedTextLayout.field_h = stackIn_60_0;
          } else {
            NetworkArchiveRequest.field_A.field_Gb.field_mb = var10Lifetime2 - NetworkArchiveRequest.field_A.field_Gb.field_Q;
            NetworkArchiveRequest.field_A.scrollContent(2 * (param2 * param1), 112, param2, true);
            stackIn_56_0 = (NetworkArchiveRequest.field_A.field_Gb.field_Q + NetworkArchiveRequest.field_A.field_Gb.field_mb == var10Lifetime2);
            CachedTextLayout.field_h = stackIn_56_0;
          }
        }
        return (ChatMessage) (var4);
    }

    ValidationMessageWidget(ValidationProvider param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, SimUnit.getDefaultTextPainter((byte) 120));
        try {
          this.field_bb = param1;
          this.field_Y = param0;
          this.setWidgetBounds(param2, param3, 28972, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_W = new QuickChatCommandType(4, 1, 1, 1);
        field_cb = 480;
    }
}
