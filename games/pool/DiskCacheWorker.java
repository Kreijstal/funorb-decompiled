/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static int field_b;
    private DualLinkDeque requestQueue;
    static int field_d;
    static UiComponent field_f;
    static String[] instructionsTitles;
    static int[] field_g;
    private boolean stopRequested;
    private Thread thread;
    int pendingRequestCount;
    static String mpXWantstodraw;

    final DiskArchiveRequest queueRead(byte param0, SectorCacheStore param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskArchiveRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new DiskArchiveRequest();
          var4.field_x = false;
          var4.field_N = 3;
          var4.field_m = (long)param2;
          var4.field_R = param1;
          this.enqueueRequest(var4, -19789);
          if (param0 != 58) {
            this.requestQueue = (DualLinkDeque) null;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("rn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final DiskArchiveRequest readNow(int param0, SectorCacheStore param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        DiskArchiveRequest var7 = null;
        int var9 = 0;
        DiskArchiveRequest stackIn_9_0 = null;
        DiskArchiveRequest stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = Pool.field_O;
        try {
          var4 = new DiskArchiveRequest();
          var4.field_N = 1;
          var5 = 2 / ((10 - param0) / 52);
          var6 = this.requestQueue;
          synchronized (var6) {
            var7 = (DiskArchiveRequest) (this.requestQueue.first((byte) 110));
            while (var7 != null) {
              if (var7.field_m == (long)param2 &&
                param1 == var7.field_R &&
                2 == var7.field_N) {
                var4.pending = false;
                var4.field_Q = var7.field_Q;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var7 = (DiskArchiveRequest) (this.requestQueue.next((byte) -97));
            }
          }
          var4.field_Q = param1.read((byte) -110, param2);
          var4.pending = false;
          var4.field_x = true;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("rn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void enqueueRequest(DiskArchiveRequest param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.requestQueue;
          synchronized (var3) {
            this.requestQueue.addLast(param0, false);
            this.pendingRequestCount = this.pendingRequestCount + 1;
            this.requestQueue.notifyAll();
          }
          if (param1 != -19789) {
            this.run();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rn.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          DiskArchiveRequest var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Pool.field_O;
          while (!this.stopRequested) {
            var2 = this.requestQueue;
            synchronized (var2) {
              var7 = (DiskArchiveRequest) (this.requestQueue.removeFirst(0));
              if (var7 == null) {
                try {
                  this.requestQueue.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.pendingRequestCount = this.pendingRequestCount - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (2 != var7.field_N) {
                if (var7.field_N != 3) {
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_Q = var7.field_R.read((byte) -110, (int)var7.field_m);
                  var7.pending = false;
                }
              } else {
                var7.field_R.write((int)var7.field_m, -12875, var7.field_Q.length, var7.field_Q);
                var7.pending = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              GrowableIntList.reportClientError((Throwable) ((Object) var2_ref), (String) null, -8555);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.pending = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void updateLobbyFrame(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        CacheEntry.field_B = null;
        BallEvent.showRemovedFromGameNotice((byte) 4);
        param6 = IntKeyLookup.updateInputOverlays(param0, param3, param11, param9, param6, (byte) 33, param10);
        UsernameSuggestionsPanel.updateLobbyInterface(param1, param6, param8, param13, param5, 13375, param2, param4, param7, param3);
        int var14 = 36 / ((param12 + 84) / 37);
        ViewportController.updateIgnoreListInteraction(param4, -108, param1);
        DialogLayer.updateBottomChatPanel(param1, param6, 0, param11);
    }

    final static void initializeLobbyGamePanels(String[][] param0, String[] param1, String[] param2, int param3, byte param4, byte[] param5, Sprite[][] param6, Sprite[][] param7, int param8, int param9, String[] param10, int[] param11, String[][] param12, byte[] param13, ResourceArchive param14) {
        AlignedIconLabel[] array$0 = null;
        AlignedIconLabel[] array$1 = null;
        AlignedIconLabel[] array$2 = null;
        int var19 = 0;
        UiComponent stackIn_8_0;
        UiComponent stackIn_8_1;
        long stackIn_8_2;
        UiComponent stackIn_8_3;
        UiComponent stackIn_9_0 = null;
        UiComponent stackIn_9_1 = null;
        String stackIn_9_4 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        UiComponent var16 = null;
        int var17_int = 0;
        UiComponent var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        UiComponent var23 = null;
        UiComponent var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = Pool.field_O;
        try {
          ModelOriginSupport.field_r = param1;
          BufferedFile.field_p = param12;
          AccountStateQuery.field_u = param13;
          DiskArchiveRequest.field_T = param11;
          ValidationMessageWidget.field_R = param10;
          TransformSupport.field_c = param0;
          CompressedContainerSupport.field_f = param2;
          GradientPaletteSupport.field_d = param7;
          ArchiveRequest.field_E = param5;
          ParticleTrail.field_g = param8;
          SpriteSheetLoadSupport.field_d = param6;
          PotEvent.field_l = param9;
          IntrusiveNodeHashTable.field_i = NameEntryPopup.loadSpritesByName(0, "lobby", param14, "gameprivacy");
          QuickChatMenuSupport.field_c = NameEntryPopup.loadSpritesByName(0, "lobby", param14, "ratedgame");
          RasterBuffer.field_a = NameEntryPopup.loadSpritesByName(0, "lobby", param14, "opentome");
          PackedColorSupport.field_f = NameEntryPopup.loadSpritesByName(0, "lobby", param14, "allowspectators");
          ChatMessage.field_i = new String[5];
          ChatMessage.field_i[4] = CipherPacketBuffer.multiconstOpen;
          ChatMessage.field_i[2] = DialogLayer.multiconstFriends;
          ChatMessage.field_i[0] = ArchiveAvailabilitySupport.multiconstInviteOnly;
          ChatMessage.field_i[1] = UsernameAvailabilityValidator.multiconstClan;
          ChatMessage.field_i[3] = ChatReplacementSupport.multiconstSimilarRating;
          QuickChatMenuSupport.field_e = new UiComponent(0L, (UiComponent) null);
          MeshBoundsSupport.field_f = new UiComponent(0L, LoginEncryptionSupport.field_d, MenuScreenBase.muLobbyName);
          if (param4 <= 59) {
            return;
          }
          CueAim.field_a = new UiComponent(0L, Under13NoticePanel.field_Q, IntKeyLookup.muLobbyRating);
          DebugTuningSlider.field_c = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), AlternateLongAndTextLoginPayload.field_n, RasterBuffer.field_f);
          QuickChatMenuSupport.field_e.addChild(116, MeshBoundsSupport.field_f);
          if (AccountStateQuery.field_p) {
            QuickChatMenuSupport.field_e.addChild(-94, CueAim.field_a);
          }
          QuickChatMenuSupport.field_e.addChild(-113, DebugTuningSlider.field_c);
          DebugTuningSlider.field_c.viewport.copyStyle((byte) -87, AlignedIconLabel.field_Lb);
          DebugTuningSlider.field_c.viewport.verticalAlignment = 1;
          var23 = DebugTuningSlider.field_c.viewport;
          var24 = var23;
          var24.horizontalAlignment = 1;
          SceneNodeEntry.field_m = new UiComponent(0L, AlignedIconLabel.field_Lb);
          SceneNodeEntry.field_m.horizontalAlignment = 1;
          ProgressBarWidget.field_K = new UiComponent(0L, ScoreboardNameRecord.field_d, CompressedContainerSupport.returntomainmenu.toUpperCase());
          BrowserUrlSupport.field_d = new UiComponent(0L, MonotonicClock.field_d, PlasmaBallSkin.muGamelistAllGames.toUpperCase());
          NameNormalizationSupport.field_a = new UiComponent(0L, CheckboxWidget.field_P);
          MessageDialogContent.field_N = new UiComponent(0L, LoginEncryptionSupport.field_d, IntKeyLookup.muGamelistStatus);
          MeshColorSupport.field_c = new UiComponent(0L, LobbyPanelLayoutSupport.field_e, ByteStorage.muGamelistOwner);
          KillerBallSkin.field_p = new UiComponent(0L, LobbyPanelLayoutSupport.field_e, Cp1252DecodingSupport.muGamelistPlayers);
          Camera.field_g = new UiComponent(0L, LobbyPanelLayoutSupport.field_e, FixedPointVectorSupport.muGamelistAvgRating);
          DualLinkDequeIterator.field_e = new UiComponent(0L, LobbyPanelLayoutSupport.field_e, LabeledChildWidget.muGamelistOptions);
          ClientUiResourceState.field_f = new UiComponent(0L, Under13NoticePanel.field_Q, LoginMethod.muGamelistElapsedTime);
          BufferedSocket.field_m = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), AlternateLongAndTextLoginPayload.field_n, RasterBuffer.field_f);
          field_f = new UiComponent(0L, LobbyPlayerLookupSupport.field_c, AccountMenuText.muPlayRated.toUpperCase());
          field_f.enabled = AccountStateQuery.field_p;
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = 0L;
          stackIn_8_3 = LobbyPlayerLookupSupport.field_c;
          if (AccountStateQuery.field_p) {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = ArchiveProvider.muCreateUnrated;
          } else {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = WidgetContainer.newgame;
          }
          RasterStateSupport.field_b = new UiComponent(stackIn_8_2, stackIn_8_3, ((String) (Object) stackIn_9_4).toUpperCase());
          IntegerRecordSubmission.field_n = new UiComponent(0L, (UiComponent) null);
          IntegerRecordSubmission.field_n.addChild(65, BrowserUrlSupport.field_d);
          IntegerRecordSubmission.field_n.addChild(-93, NameNormalizationSupport.field_a);
          NameNormalizationSupport.field_a.addChild(78, MessageDialogContent.field_N);
          NameNormalizationSupport.field_a.addChild(-106, MeshColorSupport.field_c);
          NameNormalizationSupport.field_a.addChild(19, KillerBallSkin.field_p);
          if (AccountStateQuery.field_p) {
            NameNormalizationSupport.field_a.addChild(119, Camera.field_g);
          }
          NameNormalizationSupport.field_a.addChild(-117, DualLinkDequeIterator.field_e);
          NameNormalizationSupport.field_a.addChild(104, ClientUiResourceState.field_f);
          NameNormalizationSupport.field_a.addChild(-127, BufferedSocket.field_m);
          if (AccountStateQuery.field_p) {
            IntegerRecordSubmission.field_n.addChild(-97, field_f);
          }
          IntegerRecordSubmission.field_n.addChild(-96, RasterStateSupport.field_b);
          PacketDiagnosticsSupport.field_b = new UiComponent(0L, AlignedIconLabel.field_Lb);
          PacketDiagnosticsSupport.field_b.horizontalAlignment = 1;
          PacketDiagnosticsSupport.field_b.verticalAlignment = 0;
          SpriteResourceSupport.field_a = new UiComponent(0L, NineSliceFrameSupport.field_d, ReflectionReplySupport.ok.toUpperCase());
          ModelOriginSupport.field_q = new UiComponent(0L, AccountStateQuery.field_m);
          ModelOriginSupport.field_q.addChild(52, PacketDiagnosticsSupport.field_b);
          ModelOriginSupport.field_q.addChild(-124, SpriteResourceSupport.field_a);
          LimitedRandomAccessFile.field_j = new UiComponent(0L, AlternateLongAndTextLoginPayload.field_n);
          LimitedRandomAccessFile.field_j.copyStyle((byte) -87, AlignedIconLabel.field_Lb);
          LimitedRandomAccessFile.field_j.verticalAlignment = 1;
          var16 = LimitedRandomAccessFile.field_j;
          var16.horizontalAlignment = 1;
          ProjectedLineSupport.field_d = new UiComponent(0L, (UiComponent) null);
          MarkerSliderPainter.field_c = new UiComponent(0L, AlignedIconLabel.field_Lb);
          MarkerSliderPainter.field_c.horizontalAlignment = 1;
          LoginRequiredScreen.field_M = new UiComponent(0L, LoginEncryptionSupport.field_d, MenuScreenBase.muLobbyName);
          MenuScreenBase.field_a = new UiComponent(0L, Under13NoticePanel.field_Q, IntKeyLookup.muLobbyRating);
          DualLinkDeque.field_f = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), AlternateLongAndTextLoginPayload.field_n, RasterBuffer.field_f);
          ProjectedLineSupport.field_d.addChild(-119, MarkerSliderPainter.field_c);
          ProjectedLineSupport.field_d.addChild(-104, LoginRequiredScreen.field_M);
          if (AccountStateQuery.field_p) {
            ProjectedLineSupport.field_d.addChild(9, MenuScreenBase.field_a);
          }
          ProjectedLineSupport.field_d.addChild(-109, DualLinkDeque.field_f);
          ContentTransitionDialog.field_ob = new UiComponent(0L, ScoreboardNameRecord.field_d, GlowParticle.returntolobby.toUpperCase());
          ProxyConnectorSupport.field_e = new UiComponent(0L, MonotonicClock.field_d);
          MusicCrossfadeStream.field_x = new UiComponent(0L, CheckboxWidget.field_P);
          IntegerRecordSubmission.field_q = new UiComponent(0L, MirroredSceneSupport.field_b, ArchiveRequest.muOptions.toUpperCase());
          IntegerRecordSubmission.field_v = new UiComponent[4 + param3];
          FreePlayRules.field_f = new AlignedIconLabel[param3 + 4][];
          IntegerRecordSubmission.field_v[0] = new UiComponent(0L, GameApplet.field_a, DelayedServerPacket.muOptionsWhocanjoin);
          FreePlayRules.field_f[0] = new AlignedIconLabel[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            FreePlayRules.field_f[0][1 + var17_int] = new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, IntrusiveNodeHashTable.field_i[var17_int], ChatMessage.field_i[var17_int]);
          }
          if (DiskArchiveRequest.field_T.length >= 2) {
            IntegerRecordSubmission.field_v[1] = new UiComponent(0L, GameApplet.field_a, ArchiveAvailabilitySupport.muOptionsPlayers);
            array$0 = new AlignedIconLabel[DiskArchiveRequest.field_T.length + 1];
            FreePlayRules.field_f[1] = array$0;
            FreePlayRules.field_f[1][0] = new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, (Sprite) null, AudioService.muOptionsDontmind);
            for (var17_intLifetime1 = 0; DiskArchiveRequest.field_T.length > var17_intLifetime1; var17_intLifetime1++) {
              FreePlayRules.field_f[1][1 + var17_intLifetime1] = new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, (Sprite) null, Integer.toString(DiskArchiveRequest.field_T[var17_intLifetime1]));
            }
          }
          IntegerRecordSubmission.field_v[2] = new UiComponent(0L, GameApplet.field_a, BitmapTextLayout.muOptionsAllowSpectate);
          FreePlayRules.field_f[2] = new AlignedIconLabel[]{new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, (Sprite) null, AudioService.muOptionsDontmind), new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, PackedColorSupport.field_f[0], ByteStorage.no), new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, PackedColorSupport.field_f[1], MeshSymmetrySupport.yes)};
          if (1 < ParticleTrail.field_g) {
            IntegerRecordSubmission.field_v[3] = new UiComponent(0L, GameApplet.field_a, NameNormalizationSupport.muOptionsRatedgametype);
            array$1 = new AlignedIconLabel[1 + ParticleTrail.field_g];
            FreePlayRules.field_f[3] = array$1;
            FreePlayRules.field_f[3][0] = new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, (Sprite) null, AudioService.muOptionsDontmind);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < ParticleTrail.field_g; var17_intLifetime2++) {
              FreePlayRules.field_f[3][var17_intLifetime2 + 1] = new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, (Sprite) null, ModelOriginSupport.field_r[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param3 > var17_intLifetime3; var17_intLifetime3++) {
            IntegerRecordSubmission.field_v[var17_intLifetime3 + 4] = new UiComponent(0L, GameApplet.field_a, ValidationMessageWidget.field_R[var17_intLifetime3]);
            array$2 = new AlignedIconLabel[ArchiveLoadSequence.bitwiseAnd(255, (int) ArchiveRequest.field_E[var17_intLifetime3]) + 1];
            FreePlayRules.field_f[4 + var17_intLifetime3] = array$2;
            FreePlayRules.field_f[4 + var17_intLifetime3][0] = new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, (Sprite) null, AudioService.muOptionsDontmind);
            for (var18 = 0; var18 < (255 & ArchiveRequest.field_E[var17_intLifetime3]); var18++) {
              if (null == SpriteSheetLoadSupport.field_d) {
                var19_ref = null;
              } else {
                if (SpriteSheetLoadSupport.field_d[var17_intLifetime3] == null) {
                  var19_ref = null;
                } else {
                  var19_ref = SpriteSheetLoadSupport.field_d[var17_intLifetime3][var18];
                }
              }
              if (TransformSupport.field_c != null) {
                if (TransformSupport.field_c[var17_intLifetime3] == null) {
                  var20 = null;
                } else {
                  var20 = TransformSupport.field_c[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              FreePlayRules.field_f[4 + var17_intLifetime3][1 + var18] = new AlignedIconLabel(0L, FaceNormal.field_c, (UiComponent) null, UiWidget.field_A, (Sprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; 4 + param3 > var17_intLifetime4; var17_intLifetime4++) {
            if (IntegerRecordSubmission.field_v[var17_intLifetime4] != null) {
              IntegerRecordSubmission.field_v[var17_intLifetime4].lineSpacing = 11;
            }
            if (null != FreePlayRules.field_f[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; FreePlayRules.field_f[var17_intLifetime4].length > var18Lifetime1; var18Lifetime1++) {
                if (FreePlayRules.field_f[var17_intLifetime4][var18Lifetime1] != null &&
                  FreePlayRules.field_f[var17_intLifetime4][var18Lifetime1].label != null) {
                  FreePlayRules.field_f[var17_intLifetime4][var18Lifetime1].label.lineSpacing = 11;
                }
              }
            }
          }
          CanvasInputAttachmentSupport.field_b = new UiComponent(0L, LobbyPlayerLookupSupport.field_c);
          MeshBoundsSupport.field_c = new UiComponent(0L, LobbyPlayerLookupSupport.field_c);
          TextHotspotRegion.field_o = new UiComponent(0L, TimeTrialSelectScreen.field_M);
          TextHotspotRegion.field_o.copyStyle((byte) -87, AlignedIconLabel.field_Lb);
          var17 = TextHotspotRegion.field_o;
          TextHotspotRegion.field_o.verticalAlignment = 1;
          var17.horizontalAlignment = 1;
          Bzip2DecoderState.field_f = new UiComponent(0L, (UiComponent) null);
          Bzip2DecoderState.field_f.addChild(65, ProxyConnectorSupport.field_e);
          Bzip2DecoderState.field_f.addChild(-111, MusicCrossfadeStream.field_x);
          MusicCrossfadeStream.field_x.addChild(12, IntegerRecordSubmission.field_q);
          for (var18Lifetime2 = 0; var18Lifetime2 < 4 + param3; var18Lifetime2++) {
            if ((1 != var18Lifetime2 ||
              !(DiskArchiveRequest.field_T.length < 2)) && (3 != var18Lifetime2 ||
              !(1 >= ParticleTrail.field_g))) {
              MusicCrossfadeStream.field_x.addChild(92, IntegerRecordSubmission.field_v[var18Lifetime2]);
              for (var19 = 0; FreePlayRules.field_f[var18Lifetime2].length > var19; var19++) {
                if (FreePlayRules.field_f[var18Lifetime2][var19] != null) {
                  MusicCrossfadeStream.field_x.addChild(37, FreePlayRules.field_f[var18Lifetime2][var19]);
                }
              }
            }
          }
          Bzip2DecoderState.field_f.addChild(-120, CanvasInputAttachmentSupport.field_b);
          Bzip2DecoderState.field_f.addChild(-117, MeshBoundsSupport.field_c);
          Bzip2DecoderState.field_f.addChild(-121, TextHotspotRegion.field_o);
          Pool.field_P = new UiComponent(0L, DiskArchiveRequest.field_J, LimitedRandomAccessFile.muInvitePlayers.toUpperCase());
          AccountContentDialog.field_vb = new UiComponent(0L, NineSliceFrameSupport.field_d, ChatInputSupport.close.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_80_0 = var15;
          stackIn_80_1 = new StringBuilder().append("rn.G(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',');
          if (param1 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param2 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',');
          if (param6 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',');
          if (param7 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',');
          if (param11 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',');
          if (param12 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',');
          if (param13 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',');
          if (param14 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
        }
    }

    final void shutdown(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          this.stopRequested = true;
          var2 = this.requestQueue;
          synchronized (var2) {
            this.requestQueue.notifyAll();
          }
          try {
            this.thread.join();
            if (param0 != -11307) {
              this.pendingRequestCount = -90;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          this.thread = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DiskArchiveRequest queueWrite(byte[] param0, SectorCacheStore param1, byte param2, int param3) {
        DiskArchiveRequest var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        DiskArchiveRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new DiskArchiveRequest();
          var5.field_N = 2;
          var5.field_Q = param0;
          var5.field_R = param1;
          var5.field_x = false;
          var5.field_m = (long)param3;
          var6 = -13 / ((-21 - param2) / 57);
          this.enqueueRequest(var5, -19789);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("rn.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 10) {
          instructionsTitles = (String[]) null;
        }
        instructionsTitles = null;
        field_g = null;
        mpXWantstodraw = null;
        field_f = null;
    }

    DiskCacheWorker(PlatformTaskDispatcher param0) {
        AsyncRequest var2 = null;
        this.requestQueue = new DualLinkDeque();
        this.stopRequested = false;
        this.pendingRequestCount = 0;
        try {
          var2 = param0.startThread(90, 5, (Runnable) (this));
          while (0 == var2.field_f) {
            SoundCache.sleepMillis(-78, 10L);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.thread = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        instructionsTitles = new String[]{"Eight-ball Pool: Basics", "Eight-ball Pool: What is a Foul?", "Eight-ball Pool: Fouls", "Nine-ball Pool: Basics", "Time Trial Pool", "Killer Pool", "Controls: Camera", "Controls: Shot Mode", "Tips", "Glossary"};
        mpXWantstodraw = "<%0> wants to draw.";
    }
}
