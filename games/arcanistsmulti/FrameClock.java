/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FrameClock {
    static PlatformTask field_a;
    static String field_c;
    static SceneWidget field_e;
    static SceneWidget field_d;
    static volatile int field_b;

    final int sleepAndCountTicks(long param0, int param1) {
        long var4 = this.nanosUntilNextTick((byte) 52);
        if (var4 > 0L) {
          LobbyLayoutHelpers.sleepMillis(var4, 1);
        }
        if (param1 != -1) {
          field_e = (SceneWidget) null;
        }
        return this.waitForTicks(param0, (byte) -44);
    }

    final static String charToString(int param0, char param1) {
        if (param0 != 3) {
          field_a = (PlatformTask) null;
        }
        return String.valueOf(param1);
    }

    final static void drawGameListView(int param0, boolean param1, boolean param2) {
        SceneScrollPane stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        SceneWidget stackIn_21_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5 = null;
        PlayerInfoPanel var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PlayerActionMenu var16 = null;
        PlayerActionMenu var17 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2) {
            FrameClock.charToString(-89, '\002');
          }
          stackIn_5_0 = PasswordCheckHelpers.field_c.field_Db;
          stackIn_6_1 = (PasswordCheckHelpers.field_h == PasswordCheckHelpers.field_c.field_Db);
          var3_int = ((SceneScrollPane) (Object) stackIn_5_0).relayout(stackIn_6_1, (byte) 98, ImageProducerRasterBuffer.field_r + 2, 2, param0 * (ImageProducerRasterBuffer.field_r * 3 + 6), param1) ? 1 : 0;
          var4 = PasswordCheckHelpers.field_c.field_Eb.field_G;
          if (SpriteState.field_t != 2 &&
            SpriteState.field_t != 1) {
            PasswordCheckHelpers.field_c.field_ub = false;
            PasswordCheckHelpers.field_c.field_Db.field_Hb.field_rb = JaggrabDownloader.field_l;
            SpriteDecodeHelpers.resetChildOffsets((byte) -104, PasswordCheckHelpers.field_c.field_Eb);
            return;
          }
          PasswordCheckHelpers.field_c.field_Db.field_Hb.field_rb = null;
          PasswordCheckHelpers.field_c.field_ub = true;
          var5 = null;
          var6 = (PlayerInfoPanel) (var4.first(12623));
          while (var6 != null) {
            var7 = 0;
            if (var6.field_G == null) {
              var6.field_Jb = new SceneWidget(0L, NoticeHelpers.field_j);
              var6.addChild(var6.field_Jb, 96);
              var6.field_Mb = new SceneWidget(0L, NoticeHelpers.field_j);
              var6.addChild(var6.field_Mb, 112);
              var7 = 1;
              var6.markTreeDirty((byte) 20);
            }
            var6.field_x = PasswordCheckHelpers.field_c.field_Eb.field_x;
            var6.field_Jb.setBounds(var6.field_x, 0, 0, ImageProducerRasterBuffer.field_r, (byte) -120);
            var8 = 0;
            if (var6.field_Gb != null &&
              !var6.field_Gb.equals("")) {
              var6.field_Mb.field_eb = 16737894;
              var6.field_Mb.field_W = EmptyPainter.field_d;
              var8 = 1;
              var6.field_Mb.setBounds(EmptyPainter.field_d.field_n + 3, 0, 0, ImageProducerRasterBuffer.field_r, (byte) -120);
            }
            var9 = 0;
            var10 = var6.field_x;
            if (var8 != 0) {
              var9 = EmptyPainter.field_d.field_n + 3;
              var10 = var10 - var9;
            }
            stackIn_21_0 = var6.field_Jb;
            if (var10 > 0) {
              stackIn_22_1 = BitmapFont.truncateWithEllipsis(var6.field_Jb.field_Z, var6.field_Cb, var10);
            } else {
              stackIn_22_1 = var6.field_Cb;
            }
            stackIn_21_0.field_rb = stackIn_22_1;
            stackIn_25_0 = (var6.field_Jb.field_rb.equals(var6.field_Cb)) ? 0 : 1;
            var11 = stackIn_25_0;
            var6.field_Jb.setBounds(var10, var9, 0, ImageProducerRasterBuffer.field_r, (byte) -120);
            if (var3_int == 0) {
              var6.field_B = ImageProducerRasterBuffer.field_r - var6.field_I;
            }
            if (var7 != 0) {
              PasswordCheckHelpers.field_c.field_Eb.positionAfter((byte) 125, (SceneWidget) (var5), var6, 2);
            }
            if (null != var6.field_Mb &&
              var6.field_Mb.field_C) {
              TextLayout.field_c = var6.field_Gb;
            } else {
              if (var6.field_Jb.field_C &&
                var11 != 0) {
                TextLayout.field_c = var6.field_Cb;
              }
            }
            var5 = var6;
            if (var6.field_U != 0) {
              ArcanistsMulti.openInfoPanel(-26335, (int[]) null, PasswordCheckHelpers.field_c.field_Db, var6.field_Ib, 0L, -1, -1, var6.field_Cb, var6);
              var16 = PackedShortHelpers.field_c;
              var13_ref_String = NumericDateInputWidget.field_M;
              var16.field_l.addAction(7, var13_ref_String, (byte) -26);
              var17 = PackedShortHelpers.field_c;
              var13 = QueuedResponse.field_h;
              var14 = ConfirmedNameValidator.field_s;
              var17.field_l.openAt(0, 0, -29466, var14, var13);
            }
            var6 = (PlayerInfoPanel) (var4.next(0));
          }
          if (PasswordCheckHelpers.field_c.field_Jb.field_U != 0) {
            PasswordFieldPainter.field_A = new SceneTextInput(PasswordCheckHelpers.field_c.field_Jb.field_V, PasswordCheckHelpers.field_c.field_Jb.field_nb, PasswordCheckHelpers.field_c.field_Jb.field_x, PasswordCheckHelpers.field_c.field_Jb.field_I, SecondaryNodeDequeIterator.field_a, MusicVolumeHelpers.field_a, IntrusiveNode.field_c, IntrusiveNode.field_c);
            TextLine.field_h = 2;
          }
          if (PasswordCheckHelpers.field_c.field_Lb.field_U == 0) {
            return;
          }
          PasswordFieldPainter.field_A = new SceneTextInput(PasswordCheckHelpers.field_c.field_Lb.field_V, PasswordCheckHelpers.field_c.field_Lb.field_nb, PasswordCheckHelpers.field_c.field_Lb.field_x, PasswordCheckHelpers.field_c.field_Lb.field_I, ResizableViewResizeListener.field_i, MusicVolumeHelpers.field_a, IntrusiveNode.field_c, IntrusiveNode.field_c);
          TextLine.field_h = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "hg.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract long nanosUntilNextTick(byte param0);

    abstract int waitForTicks(long param0, byte param1);

    final static void attachKeyboardInput(int param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(CredentialKind.field_a);
          if (param0 != 1) {
            FrameClock.sinTable(36, -123);
          }
          param1.addFocusListener(CredentialKind.field_a);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "hg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int applyLoginResponse(byte param0, int param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        ClipState.field_m = 0;
        ThreeButtonPanel.field_E = null;
        field_a = null;
        int var2 = MainMenuDialog.field_Hb;
        MainMenuDialog.field_Hb = QueuedPacket.field_h;
        if (param1 == 51) {
          GrowableIntList.field_c.field_o = 2;
        } else {
          if (param1 != 50) {
            GrowableIntList.field_c.field_o = 1;
          } else {
            GrowableIntList.field_c.field_o = 5;
          }
        }
        GrowableIntList.field_c.field_i = GrowableIntList.field_c.field_i + 1;
        QueuedPacket.field_h = var2;
        if (GrowableIntList.field_c.field_i >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (GrowableIntList.field_c.field_i >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (!(GrowableIntList.field_c.field_i < 4)) {
          return 1;
        }
        if (param0 != 110) {
          field_e = (SceneWidget) null;
        }
        return -1;
    }

    final static int sinTable(int param0, int param1) {
        if (param1 != -52) {
          FrameClock.charToString(87, '|');
        }
        return MeshRasterState.field_c[param0 & 2047];
    }

    final static boolean isMessageShowing(int param0) {
        if (param0 != 0) {
          return true;
        }
        return ValidationStatusIcon.field_O.loadMasterIndex((byte) -52);
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -97) {
          FrameClock.drawGameListView(48, true, false);
        }
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static void reattachInput(boolean param0) {
        HuffmanCodec.restoreWindowedMode(6);
        if (LoginMessageTable.field_c != null) {
          UiComponent.attachInputListeners(LoginMessageTable.field_c, (byte) 91);
        }
        CompoundButton.clearKeyQueue((byte) 45);
        TermsNoticePanel.clearPendingMouseHandler((byte) -23);
        PatchEnvelopeSet.closeNetworkResources(11670);
        if (IntensityTableHelpers.isLobbyConnected(!param0 ? true : false)) {
          StatusMessageHelpers.field_e.writeOpcode((byte) -107, 1);
          KeepAliveHelpers.sendKeepAlive(0, (byte) 94);
        }
        ProxySocketConnector.closeActiveConnection(param0);
    }

    final static void initializeChatFilter(ResourceArchive param0, boolean param1, ResourceArchive param2, byte param3) {
        try {
          if (param3 > -97) {
            field_b = 88;
          }
          Bzip2State.initializeLobbyWidgets(FlagSumHelpers.field_b, SpellProjectile.field_A, NameCheckHelpers.field_d, BattleUnit.field_S, MouseWheelHandler.field_c, param1, BevelBoxPainter.field_f, NameTable.field_k, 27874, MouseWheelHandler.field_d, IntrusiveNode.field_c, IntrusiveDeque.field_i);
          ArchiveProvider.field_a = QueuedPacket.loadSpriteSheet(param2, "chatfilter", "lobby", 119);
          CredentialParseHelpers.field_b[2] = TextButton.field_A;
          CredentialParseHelpers.field_b[1] = HuffmanCodec.field_d;
          CredentialParseHelpers.field_b[0] = GzipDecoder.field_e;
          ClientIOException.initializeQuickChat(DiskCacheRequest.field_w, param0, 3896);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "hg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    abstract void reset(int param0);

    static {
        field_c = "Create a free account to start using this feature";
        field_b = 0;
    }
}
