/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyUpdateHelpers {
    static int field_d;
    static int field_b;
    static UiComponent field_c;
    static String field_a;

    private final static void updateLobbyWidgets(boolean param0, int param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ChatMessage var9 = null;
        var7 = TetraLink.field_J;
        try {
          if (Js5Transport.field_g < AnimationPlayer.field_f) {
            Js5Transport.field_g = Js5Transport.field_g + 1;
          }
          if (DropTargetWidget.field_P != WidgetContainer.field_O.field_j) {
            TextureCache.field_f = TextureCache.field_f + (-DropTargetWidget.field_P + WidgetContainer.field_O.field_j);
            DropTargetWidget.field_P = WidgetContainer.field_O.field_j;
          }
          if (0 >= Js5Transport.field_g) {
            return;
          }
          ChatPanelSlideHelpers.layoutAnimatedChatPanel((byte) 85);
          IsaacCipher.field_a.updateInput(0, param0);
          if (null != TextLayoutLine.field_e) {
            if (MenuLabelGlobals.field_a) {
              TextLayoutLine.field_e.processPointerFrame(IsaacCipher.field_a.field_eb, param0, IsaacCipher.field_a.field_z, false);
            } else {
              TextLayoutLine.field_e = null;
            }
          }
          for (var4_int = 0; var4_int < 5; var4_int++) {
            var5 = KeyEventHelpers.field_f[var4_int];
            if (var5 != null) {
              if (0 != var5.field_F) {
                LoadingScreenHelpers.openChatFilterMenu(var4_int, var5, 0);
              }
              var6 = HuffmanCodec.getChatFilterSetting((byte) 79, var4_int);
              HuffmanCodec.field_f[var4_int].field_vb = WeightedLruCache.field_n[var6];
              CheckboxPainter.field_o[var4_int].field_jb = LobbyListHelpers.field_a[var6];
            }
          }
          if (NameAlphabetTable.field_e.field_F != 0) {
            PasswordValidator.field_y = new ReportAbuseDialog(NameAlphabetTable.field_e.field_eb, NameAlphabetTable.field_e.field_z, NameAlphabetTable.field_e.field_Hb, NameAlphabetTable.field_e.field_R, param1, RandomAccessCacheFile.field_h, UiComponent.field_gb, ErrorPrintHelpers.field_c, TextLayoutLine.field_i, GrowableIntList.field_c, NotificationToast.field_n, (String) null, 0L);
          }
          var9 = MusicCrossfadeStream.findChatLineAt(DisplayNameForm.field_Q, param3, GameKeyHandler.field_d, 0);
          if (var9 != null) {
            NameSuggestionsPanel.openChatMessageContextMenu((byte) 111, var9);
          }
          if (param2) {
            return;
          }
          var8 = HuffmanCodec.buildChatInputPrompt((byte) -62);
          if (var8 != null) {
            CheckboxWidget.field_P = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var4), "bj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        if (param0 > -6) {
          LobbyUpdateHelpers.updateLobbyWidgets(false, -43, true, -96);
        }
    }

    final static void tickTransitionCounters(byte param0) {
        int var2;
        int var1;
        var2 = TetraLink.field_J;
        if (0 < DialWidget.field_ab) {
          DialWidget.field_ab = DialWidget.field_ab - 1;
        } else {
          if (MusicPatch.field_t <= 0) {
            if (MiscTextGlobals.field_f > 0) {
              MiscTextGlobals.field_f = MiscTextGlobals.field_f - 1;
            }
          } else {
            MusicPatch.field_t = MusicPatch.field_t - 1;
          }
        }
        if (0 < DialWidget.field_ab) {
          NodeHashTableIterator.layoutLobbySlidePanels((byte) -112);
        }
        if (0 < MusicPatch.field_t) {
          ResizableDialog.layoutSlidingLobbyPanels(MusicPatch.field_t, (byte) 80);
        }
        var1 = -21 % ((param0 + 63) / 50);
        if (MiscTextGlobals.field_f > 0) {
          ResizableDialog.layoutSlidingLobbyPanels(MiscTextGlobals.field_f, (byte) 1);
        }
    }

    final static void layoutAndUpdateLobby(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, boolean param7, int param8, int param9, int param10, int param11, boolean param12, boolean param13) {
        CheckboxWidget.field_P = null;
        MidiNote.postPendingMessage((byte) 90);
        param1 = DateOfBirthValidator.processOverlayInput(param2, param6, (byte) -30, param9, param8, param1, param10);
        WhirlpoolHasher.updateLobbyPanels(-70, param5, param0, param4, param3, param7, param13, param12, param6, param1);
        WidgetTheme.openFriendContextMenu(param4, param12, (byte) -61);
        if (param11 != -869) {
          field_b = -52;
        }
        LobbyUpdateHelpers.updateLobbyWidgets(param1, param10, false, param4);
    }

    final static void setSharedAnimationFrameset(int param0, HuffmanCodec param1) {
        if (param0 != 5) {
          return;
        }
        try {
          ValidationMessageWidget.field_Z = param1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "bj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static QuickChatCommandType getQuickChatCommand(int param0, int param1) {
        int var3 = 0;
        QuickChatCommandType[] var2;
        int var4;
        QuickChatCommandType[] var5;
        var4 = TetraLink.field_J;
        var5 = DialWidgetPainter.getQuickChatCommandTypes(104);
        var2 = var5;
        for (var3 = param0; var5.length > var3; var3++) {
          if (var5[var3].field_d == param1) {
            return var5[var3];
          }
        }
        return null;
    }

    static {
        field_a = "Inviting <%0>";
    }
}
