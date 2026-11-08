/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheEntry extends DualLinkNode {
    static QuickChatDynamicCommand field_A;
    int weight;
    static int[][] field_C;
    static AudioOutput field_D;
    static String field_B;
    static String ticketingGotowebsite;
    static float field_w;
    static int field_z;
    static int field_F;
    static String ballsetPlasmaGroup0;
    static UiComponent field_x;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        IntegerSyntaxSupport.field_f = param4;
        ReportAbuseDialog.field_Nb = param0;
        BallEvent.field_a = param2;
        if (param6 != 1727215554) {
          CacheEntry.releaseStatics(-21);
        }
        ChatPanelSupport.field_f = param3;
        if (IntegerSyntaxSupport.field_f - param1 >= ChatPanelSupport.field_f - param5) {
          stackIn_5_0 = -param5 + ChatPanelSupport.field_f;
        } else {
          stackIn_5_0 = IntegerSyntaxSupport.field_f - param1;
        }
        MembershipBenefitsScreen.field_I = stackIn_5_0;
        if (param1 + IntegerSyntaxSupport.field_f <= param5 + ChatPanelSupport.field_f) {
          stackIn_8_0 = ChatPanelSupport.field_f + param5;
        } else {
          stackIn_8_0 = param1 + IntegerSyntaxSupport.field_f;
        }
        QuickChatPhraseRegistry.field_f = stackIn_8_0;
        if (ReportAbuseDialog.field_Nb - param5 <= -param1 + BallEvent.field_a) {
          stackIn_11_0 = -param5 + ReportAbuseDialog.field_Nb;
        } else {
          stackIn_11_0 = BallEvent.field_a - param1;
        }
        SharedRateScaleSupport.field_a = stackIn_11_0;
        if (BallEvent.field_a + param1 <= param5 + ReportAbuseDialog.field_Nb) {
          stackIn_14_0 = param5 + ReportAbuseDialog.field_Nb;
        } else {
          stackIn_14_0 = param1 + BallEvent.field_a;
        }
        IntegerSyntaxSupport.field_c = stackIn_14_0;
        if (SharedRateScaleSupport.field_a < SoftwareRasterizer.clipTop << 2) {
          if (SoftwareRasterizer.clipTop << 2 > IntegerSyntaxSupport.field_c) {
            IntegerSyntaxSupport.field_c = SoftwareRasterizer.clipTop << 2;
          }
          SharedRateScaleSupport.field_a = SoftwareRasterizer.clipTop << 2;
        }
        if (SoftwareRasterizer.clipLeft << 2 > MembershipBenefitsScreen.field_I) {
          MembershipBenefitsScreen.field_I = SoftwareRasterizer.clipLeft << 2;
          if (QuickChatPhraseRegistry.field_f < SoftwareRasterizer.clipLeft << 2) {
            QuickChatPhraseRegistry.field_f = SoftwareRasterizer.clipLeft << 2;
          }
        }
        if (IntegerSyntaxSupport.field_c > SoftwareRasterizer.clipBottom << 2) {
          IntegerSyntaxSupport.field_c = SoftwareRasterizer.clipBottom << 2;
          if (SharedRateScaleSupport.field_a > SoftwareRasterizer.clipBottom << 2) {
            SharedRateScaleSupport.field_a = SoftwareRasterizer.clipBottom << 2;
          }
        }
        if (QuickChatPhraseRegistry.field_f > SoftwareRasterizer.clipRight << 2) {
          if (MembershipBenefitsScreen.field_I > SoftwareRasterizer.clipRight << 2) {
            MembershipBenefitsScreen.field_I = SoftwareRasterizer.clipRight << 2;
          }
          QuickChatPhraseRegistry.field_f = SoftwareRasterizer.clipRight << 2;
        }
    }

    final static void g(int param0) {
        DisplayModeSupport.field_c[16].setItems(FullscreenDisplayMode.field_m, true);
        DisplayModeSupport.field_c[15].setItems(UsernameAvailabilityValidator.field_t, true);
        DisplayModeSupport.field_c[17].setItems(LoginMethod.field_k, true);
        int var1 = 125 % ((-17 - param0) / 34);
        if (!LobbyPlayerLookupSupport.a(true)) {
          DisplayModeSupport.field_c[3].setItems(OpacityWidget.field_O, true);
          DisplayModeSupport.field_c[10].setItems(CanvasInputAttachmentSupport.field_h, true);
          DisplayModeSupport.field_c[11].setItems(AccountCreationDialog.field_Hb, true);
          DisplayModeSupport.field_c[12].setItems(ScrollPaneWithFooter.field_Nb, true);
          DisplayModeSupport.field_c[8].setItems(KillerBallSkin.field_r, true);
          DisplayModeSupport.field_c[24].setItems(SingleChildWidget.field_G, true);
          DisplayModeSupport.field_c[9].setItems(GrowableIntListFactory.field_d, true);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_63_2 = null;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        String stackIn_70_2 = null;
        String stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = Pool.field_O;
        try {
          ChatMessageLine.field_o = true;
          ClientException.field_h = param2;
          if (ClientException.field_h == 0) {
            var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, StatefulTextPainter.fsNonmember, TransformRotationSupport.field_f, 0);
            var4 = 3 + var3_int;
            IterableNodeHashTable.field_c = new int[var4];
            TransformRotationSupport.field_j = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              IterableNodeHashTable.field_c[var5] = -1;
            }
            ByteStorage.field_c = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              TransformRotationSupport.field_j[var5] = LoginRequestSupport.field_c[var5];
            }
            TransformRotationSupport.field_j[var4 - 3] = "";
            TransformRotationSupport.field_j[var4 - 2] = CompressedContainerSupport.fsButtonMembers;
            IterableNodeHashTable.field_c[-2 + var4] = 0;
            ByteStorage.field_c[0] = 4;
            TransformRotationSupport.field_j[-1 + var4] = DirectByteStorage.fsButtonClose;
            IterableNodeHashTable.field_c[var4 - 1] = 1;
            ByteStorage.field_c[1] = 5;
          } else if (ClientException.field_h == 1) {
            var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, StatefulTextPainter.fsNonmember, TransformRotationSupport.field_f, 0);
            var4 = 2 + var3_int;
            TransformRotationSupport.field_j = new String[var4];
            IterableNodeHashTable.field_c = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              IterableNodeHashTable.field_c[var5] = -1;
            }
            ByteStorage.field_c = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              TransformRotationSupport.field_j[var5] = LoginRequestSupport.field_c[var5];
            }
            TransformRotationSupport.field_j[-2 + var4] = "";
            TransformRotationSupport.field_j[var4 - 1] = DirectByteStorage.fsButtonClose;
            IterableNodeHashTable.field_c[var4 - 1] = 0;
            ByteStorage.field_c[0] = 5;
          } else if (ClientException.field_h != 2) {
            if (ClientException.field_h == 3) {
              if (StatefulTextPainter.field_s.field_k) {
                var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, LoginRequestSupport.fsUnavailable, TransformRotationSupport.field_f, param1 ^ 4);
              } else {
                var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, ValidationIconWidget.fsUnavailableTrySignedApplet, TransformRotationSupport.field_f, 0);
              }
              var4 = 2 + var3_int;
              IterableNodeHashTable.field_c = new int[var4];
              TransformRotationSupport.field_j = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                IterableNodeHashTable.field_c[var5] = -1;
              }
              ByteStorage.field_c = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                TransformRotationSupport.field_j[var5] = LoginRequestSupport.field_c[var5];
              }
              TransformRotationSupport.field_j[-2 + var4] = "";
              TransformRotationSupport.field_j[-1 + var4] = DirectByteStorage.fsButtonClose;
              IterableNodeHashTable.field_c[-1 + var4] = 0;
              ByteStorage.field_c[0] = 5;
            } else if (4 == ClientException.field_h) {
              var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, QuickChatPhraseRegistry.fsFocus, TransformRotationSupport.field_f, 0);
              var4 = 2 + var3_int;
              IterableNodeHashTable.field_c = new int[var4];
              TransformRotationSupport.field_j = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                IterableNodeHashTable.field_c[var5] = -1;
              }
              ByteStorage.field_c = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                TransformRotationSupport.field_j[var5] = LoginRequestSupport.field_c[var5];
              }
              TransformRotationSupport.field_j[-2 + var4] = "";
              TransformRotationSupport.field_j[var4 - 1] = DirectByteStorage.fsButtonClose;
              IterableNodeHashTable.field_c[-1 + var4] = 0;
              ByteStorage.field_c[0] = 5;
            } else {
              if (ClientException.field_h != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, DebugTuningSupport.fsTimeout, TransformRotationSupport.field_f, param1 ^ 4);
              var4 = 3 + var3_int;
              IterableNodeHashTable.field_c = new int[var4];
              TransformRotationSupport.field_j = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                IterableNodeHashTable.field_c[var5] = -1;
              }
              ByteStorage.field_c = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                TransformRotationSupport.field_j[var5] = LoginRequestSupport.field_c[var5];
              }
              TransformRotationSupport.field_j[var4 - 3] = "";
              TransformRotationSupport.field_j[var4 - 2] = AppletContainerSupport.fsButtonTryagain;
              IterableNodeHashTable.field_c[var4 - 2] = 0;
              ByteStorage.field_c[0] = 3;
              TransformRotationSupport.field_j[var4 - 1] = DirectByteStorage.fsButtonClose;
              IterableNodeHashTable.field_c[-1 + var4] = 1;
              ByteStorage.field_c[1] = 5;
            }
          } else {
            var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, AccountWelcomePanel.substituteTemplateArguments(new String[]{"<br><%0><br>"}, param1 - 5, MonotonicClock.fsAcceptCountdownSing), TransformRotationSupport.field_f, 0);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(LoginRequestSupport.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            NanoTickClock.field_n = new String[var4];
            ArrayOperations.copy(LoginRequestSupport.field_c, 0, NanoTickClock.field_n, 0, var4);
            MusicCrossfadeStream.field_H = new String[-1 + var3_int - var4];
            ArrayOperations.copy(LoginRequestSupport.field_c, 1 + var4, MusicCrossfadeStream.field_H, 0, -var4 + var3_int - 1);
            var4 = -1;
            var3_int = DualLinkNode.a(DraggableWidget.field_T, LoginRequestSupport.field_c, AccountWelcomePanel.substituteTemplateArguments(new String[]{"<br><%0><br>"}, -1, SoundCache.fsAcceptCountdownPl), TransformRotationSupport.field_f, 0);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(LoginRequestSupport.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            MultiHandleSliderWidget.field_W = new String[var4];
            ArrayOperations.copy(LoginRequestSupport.field_c, 0, MultiHandleSliderWidget.field_W, 0, var4);
            KeyHandler.field_a = new String[-1 + (var3_int - var4)];
            ArrayOperations.copy(LoginRequestSupport.field_c, 1 + var4, KeyHandler.field_a, 0, -1 + (-var4 + var3_int));
            if (NanoTickClock.field_n.length >= MultiHandleSliderWidget.field_W.length) {
              stackIn_52_0 = NanoTickClock.field_n.length;
            } else {
              stackIn_52_0 = MultiHandleSliderWidget.field_W.length;
            }
            var5 = stackIn_52_0;
            if (MusicCrossfadeStream.field_H.length < KeyHandler.field_a.length) {
              stackIn_55_0 = KeyHandler.field_a.length;
            } else {
              stackIn_55_0 = MusicCrossfadeStream.field_H.length;
            }
            var6 = stackIn_55_0;
            var7 = var5 + (7 + var6);
            IterableNodeHashTable.field_c = new int[var7];
            TransformRotationSupport.field_j = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              IterableNodeHashTable.field_c[var8] = -1;
            }
            TransformRotationSupport.field_j[1] = AppletUrlSupport.fsButtonAccept;
            ByteStorage.field_c = new int[2];
            IterableNodeHashTable.field_c[1] = 0;
            TransformRotationSupport.field_j[0] = ProjectedLineSupport.fsAcceptBeforeaccept;
            IterableNodeHashTable.field_c[3] = 1;
            TransformRotationSupport.field_j[3] = ArchiveIndex.fsButtonCancel;
            ByteStorage.field_c[1] = 2;
            TransformRotationSupport.field_j[2] = DisplayNamePanel.fsAcceptAfteraccept;
            TransformRotationSupport.field_j[5] = "";
            TransformRotationSupport.field_j[4] = TranslatedUiText.field_c;
            ByteStorage.field_c[0] = 5;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_62_0 = TransformRotationSupport.field_j;
              stackIn_62_1 = var8Lifetime2 + 6;
              if (-var5 + (MultiHandleSliderWidget.field_W.length + var8Lifetime2) < 0) {
                stackIn_63_2 = "";
              } else {
                stackIn_63_2 = MultiHandleSliderWidget.field_W[MultiHandleSliderWidget.field_W.length + var8Lifetime2 - var5];
              }
              stackIn_62_0[stackIn_62_1] = stackIn_63_2;
            }
            TransformRotationSupport.field_j[var5 + 6] = null;
            IterableNodeHashTable.field_c[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_67_0 = TransformRotationSupport.field_j;
              stackIn_67_1 = var5 + 7 + var8Lifetime3;
              stackIn_67_2 = KeyHandler.field_a.length;
              stackIn_67_3 = var8Lifetime3;
              if (stackIn_67_2 > stackIn_67_3) {
                stackIn_70_2 = KeyHandler.field_a[var8Lifetime3];
              } else {
                stackIn_70_2 = "";
              }
              stackIn_67_0[stackIn_67_1] = stackIn_70_2;
            }
            QuickChatPhraseDefinition.field_y = MonotonicClock.monotonicTimeMillis((byte) -119);
          }
          LabeledChildWidget.field_W.itemCount = ByteStorage.field_c.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < TransformRotationSupport.field_j.length; var4Lifetime1++) {
            stackIn_90_0 = TransformRotationSupport.field_j[var4Lifetime1];
            stackIn_91_1 = !(IterableNodeHashTable.field_c[var4Lifetime1] < 0);
            var5Lifetime1 = WidgetContainer.measureSharedTextWidth(stackIn_90_0, stackIn_91_1, false);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (ClientException.field_h == 2) {
            var10 = NanoTickClock.field_n;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = WidgetContainer.measureSharedTextWidth(var11, false, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = MusicCrossfadeStream.field_H;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = WidgetContainer.measureSharedTextWidth(var12, false, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          PlasmaTableScene.field_Z = BrowserCookieWriter.field_c - (var3_intLifetime1 >> 1);
          MonotonicClock.field_a = (IterableDualLinkDeque.field_e + NineBallRules.field_h << 1) * LabeledChildWidget.field_W.itemCount;
          VertexNormal.field_i = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + BrowserCookieWriter.field_c);
          for (var4Lifetime2 = 0; var4Lifetime2 < TransformRotationSupport.field_j.length; var4Lifetime2++) {
            stackIn_114_0 = MonotonicClock.field_a;
            if (0 > IterableNodeHashTable.field_c[var4Lifetime2]) {
              stackIn_115_1 = ShotRecord.field_y;
            } else {
              stackIn_115_1 = WidgetContainer.field_I;
            }
            MonotonicClock.field_a = stackIn_114_0 + stackIn_115_1;
          }
          PasswordValidator.field_n = ClientInputResetSupport.field_e - (MonotonicClock.field_a >> 1);
          IntegerRecordProtocolSupport.field_b = new int[TransformRotationSupport.field_j.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = PasswordValidator.field_n;
          if (param1 != 4) {
            return;
          }
          while (var4Lifetime3 < TransformRotationSupport.field_j.length) {
            var6Lifetime1 = IterableNodeHashTable.field_c[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = WidgetContainer.measureSharedTextWidth(TransformRotationSupport.field_j[var4Lifetime3], true, false);
              var8Lifetime1 = BrowserCookieWriter.field_c - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + IterableDualLinkDeque.field_e;
              IntegerRecordProtocolSupport.field_b[var4Lifetime3] = new int[4];
              IntegerRecordProtocolSupport.field_b[var4Lifetime3][0] = var8Lifetime1 - MeshSymmetrySupport.field_b;
              IntegerRecordProtocolSupport.field_b[var4Lifetime3][1] = var5Lifetime3;
              IntegerRecordProtocolSupport.field_b[var4Lifetime3][2] = var7Lifetime2 + (MeshSymmetrySupport.field_b << 1);
              IntegerRecordProtocolSupport.field_b[var4Lifetime3][3] = (NineBallRules.field_h << 1) + WidgetContainer.field_I;
              var5Lifetime3 = var5Lifetime3 + (IterableDualLinkDeque.field_e + ((NineBallRules.field_h << 1) + WidgetContainer.field_I));
            } else {
              var5Lifetime3 = var5Lifetime3 + ShotRecord.field_y;
            }
            var4Lifetime3++;
          }
          if (ClientException.field_h != 2) {
            LabeledChildWidget.field_W.initializeSelection(param0, 0, AlternateLongAndTextLoginPayload.a(ReflectionReplySupport.field_i, DebouncedValidationProvider.field_f, 0), true);
          } else {
            LabeledChildWidget.field_W.initializeSelection(param0, -1, -1, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "kk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract boolean isReferenceBacked(int param0);

    abstract Object getValue(byte param0);

    CacheEntry(int param0) {
        this.weight = param0;
    }

    public static void releaseStatics(int param0) {
        field_x = null;
        field_B = null;
        field_A = null;
        ticketingGotowebsite = null;
        field_C = (int[][]) null;
        field_D = null;
        if (param0 != 1) {
          CacheEntry.a(-127, 17, -14, 121, -101, -122, -96);
        }
        ballsetPlasmaGroup0 = null;
    }

    static {
        ticketingGotowebsite = "Visit the Account Management section on the main site to view.";
        field_A = new QuickChatDynamicCommand(4, 1, 1, 1);
        field_F = 1;
        ballsetPlasmaGroup0 = "<col=ff9999>Reds</col>";
    }
}
