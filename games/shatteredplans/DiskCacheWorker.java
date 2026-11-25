/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static String field_a;
    static int field_b;
    static String field_g;
    static String field_e;
    private DualLinkDeque field_c;
    private Thread field_h;
    private boolean field_f;
    int field_d;

    final static void loadIntroSprites(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        RandomAccessCacheFile.pushLegacyRasterState(-111);
        QuickChatMenu.field_Jb = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro1_1");
        Dialog.field_D = SpriteResourceSupport.loadSpriteByName(param0 - 48, DerelictVictoryChecker.field_n, "intro", "intro1_2");
        DualLinkDeque.field_a = SpriteResourceSupport.loadSpriteByName(param0 ^ 48, DerelictVictoryChecker.field_n, "intro", "intro1_3");
        MeshData.field_F = SpriteResourceSupport.loadSpriteByName(param0 - 48, DerelictVictoryChecker.field_n, "intro", "intro1_flash");
        GameSpriteResources.field_d = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro1_glow");
        SliderPainter.field_e = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro1_glow_fg");
        DualLinkDeque.field_a.bindAsRenderTarget();
        BattleContribution.adjustRectangleSaturationAndBrightness(0, SoftwareRasterizer.field_b, (byte) 24, 0, 0, 64, SoftwareRasterizer.field_k);
        Dialog.field_D.bindAsRenderTarget();
        BattleContribution.adjustRectangleSaturationAndBrightness(0, SoftwareRasterizer.field_b, (byte) 24, 0, 0, 128, SoftwareRasterizer.field_k);
        QuickChatMenu.field_Jb.bindAsRenderTarget();
        MouseWheelInput.desaturateRasterRectangle(0, 0, SoftwareRasterizer.field_k, 0, SoftwareRasterizer.field_b, param0 + 24024);
        SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro2_glow");
        DefendTask.field_s = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro2_earth");
        ClientRuntimeState.field_c = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro2_clouds");
        BirthDateValidator.applyRadialSpriteFade(-174137048, DefendTask.field_s.field_z / 2, DefendTask.field_s, DefendTask.field_s.field_w / 4);
        BirthDateValidator.applyRadialSpriteFade(param0 ^ -174137062, ClientRuntimeState.field_c.field_z / 2, ClientRuntimeState.field_c, ClientRuntimeState.field_c.field_w / 4);
        MessageKind.field_b = new Sprite(640, 430);
        MessageKind.field_b.bindAsRenderTarget();
        for (var1_int = 1; var1_int < 64; var1_int++) {
          var2 = (int)(20.0 * Math.log((double)(63.0f / (float)var1_int)) / Math.log(2.0));
          SoftwareRasterizer.fillCircle(320, 527, var2 + 400, (var1_int << 2) * 65793);
        }
        SoftwareRasterizer.b(4, 4, 0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_k);
        DefensiveAi.field_r = new Sprite(640, 624 - DefendTask.field_s.field_x);
        DefensiveAi.field_r.bindAsRenderTarget();
        for (var1_int = 254; var1_int >= 1; var1_int--) {
          var2 = (int)(Math.log((double)(254.0f / (float)var1_int)) * 40.0 / Math.log(2.0));
          DefendTask.field_s.drawSilhouette(var2 - 5, var2 - DefendTask.field_s.field_x, var1_int * 65793);
        }
        GraphicsSettings.field_e = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro3_stars");
        TabbedPanel.field_Cb = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro3_citybg");
        EmailSyntaxValidator.field_o = SpriteResourceSupport.loadSpriteByName(param0 - 48, DerelictVictoryChecker.field_n, "intro", "intro3_cityfg");
        RoundedFrameSupport.field_c = SpriteResourceSupport.loadSpriteByName(2, DerelictVictoryChecker.field_n, "intro", "intro3_crater");
        var1_int = TabbedPanel.field_Cb.field_z;
        var2 = TabbedPanel.field_Cb.field_w + 60;
        IntNode.field_h = new Sprite(var1_int, var2);
        for (var3 = 0; (var2 - 60) * var1_int > var3; var3++) {
          IntNode.field_h.field_B[var3 + var1_int * 60] = TabbedPanel.field_Cb.field_B[var3];
        }
        var1_int = EmailSyntaxValidator.field_o.field_z;
        IntNode.field_h.field_o = TabbedPanel.field_Cb.field_o;
        IntNode.field_h.field_t = TabbedPanel.field_Cb.field_t;
        IntNode.field_h.field_x = -60 + TabbedPanel.field_Cb.field_x;
        var2 = 60 + EmailSyntaxValidator.field_o.field_w;
        IntNode.field_h.field_p = 60 + TabbedPanel.field_Cb.field_p;
        KeyboardStateSupport.field_f = new Sprite(var1_int, var2);
        for (var3 = 0; (var2 - 60) * var1_int > var3; var3++) {
          KeyboardStateSupport.field_f.field_B[var1_int * 60 + var3] = EmailSyntaxValidator.field_o.field_B[var3];
        }
        KeyboardStateSupport.field_f.field_t = EmailSyntaxValidator.field_o.field_t;
        KeyboardStateSupport.field_f.field_p = EmailSyntaxValidator.field_o.field_p + 60;
        KeyboardStateSupport.field_f.field_x = -60 + EmailSyntaxValidator.field_o.field_x;
        KeyboardStateSupport.field_f.field_o = EmailSyntaxValidator.field_o.field_o;
        IntNode.field_h.bindAsRenderTarget();
        if (param0 != 50) {
          return;
        }
        try {
          SoftwareRasterizer.b(60, 60, 0, 0, IntNode.field_h.field_z, IntNode.field_h.field_w);
          KeyboardStateSupport.field_f.bindAsRenderTarget();
          SoftwareRasterizer.b(60, 60, 0, 0, KeyboardStateSupport.field_f.field_z, KeyboardStateSupport.field_f.field_w);
          AccountBooleanRequest.field_j = GraphicsSettings.field_e.copy();
          AccountBooleanRequest.field_j.rotate180();
          for (var3 = 0; var3 < AccountBooleanRequest.field_j.field_B.length; var3++) {
            var4 = AccountBooleanRequest.field_j.field_B[var3];
            var5 = 8323072 & var4 >> 1;
            var6 = (var5 >> 9 & 32512) + (var4 & 65280);
            var6 = var6 * 3 >> 1;
            if (var6 <= 65280) {
              var6 = var6 & 65280;
            } else {
              var6 = 65280;
            }
            var7 = 255 & var4;
            AccountBooleanRequest.field_j.field_B[var3] = PrivateChatMessage.intOr(PrivateChatMessage.intOr(var6, var5), var7);
          }
          MusicVoice.field_n = DefendTask.field_s.flippedCopy();
          LobbyRoomInteractionSupport.tintSprite((byte) 110, MusicVoice.field_n, 32768);
          var1_int = MusicVoice.field_n.field_z;
          var2 = MusicVoice.field_n.field_z + 120;
          CheckboxPainter.field_b = new Sprite(var1_int, var2);
          CheckboxPainter.field_b.bindAsRenderTarget();
          MusicVoice.field_n.drawSilhouette(0, 120, 4259648);
          SoftwareRasterizer.b(120, 120, 0, 0, var1_int, var2);
          OpacityWidget.popLegacyRasterState(0);
          MapGenerationException.field_a = true;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "rn.C(" + param0 + ')');
        }
    }

    final DiskArchiveRequest read(int param0, SectorCacheStore param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        DiskArchiveRequest var6 = null;
        int var8 = 0;
        DiskArchiveRequest stackIn_8_0 = null;
        DiskArchiveRequest stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = new DiskArchiveRequest();
          var4.field_y = param2;
          var5 = this.field_c;
          synchronized (var5) {
            var6 = (DiskArchiveRequest) (this.field_c.startForward(-128));
            while (var6 != null) {
              if (~var6.field_l == ~(long)param0 &&
                param1 == var6.field_B &&
                var6.field_y == 2) {
                var4.field_w = var6.field_w;
                var4.field_u = false;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (DiskArchiveRequest) (this.field_c.nextForward(32));
            }
          }
          var4.field_w = param1.read(param0, 86);
          var4.field_u = false;
          var4.field_q = true;
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("rn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearStatics(boolean param0) {
        field_a = null;
        if (!param0) {
          return;
        }
        field_g = null;
        field_e = null;
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          DiskArchiveRequest var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          while (!this.field_f) {
            var2 = this.field_c;
            synchronized (var2) {
              var7 = (DiskArchiveRequest) (this.field_c.pollFirst(-49));
              if (var7 != null) {
                this.field_d = this.field_d - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_c.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_y == 2) {
                var7.field_B.write(var7.field_w.length, (int)var7.field_l, var7.field_w, 2);
                var7.field_u = false;
              } else {
                if (3 == var7.field_y) {
                  var7.field_w = var7.field_B.read((int)var7.field_l, 119);
                  var7.field_u = false;
                } else {
                  var7.field_u = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              GameKeyHandler.a(-29901, (Throwable) ((Object) var2_ref), (String) null);
              var7.field_u = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void enqueue(DiskArchiveRequest param0, int param1) {
        DiskArchiveRequest var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_c;
          synchronized (var3) {
            this.field_c.addLast(param0, 32);
            this.field_d = this.field_d + 1;
            if (param1 != 1048576) {
              var5 = (DiskArchiveRequest) null;
              this.enqueue((DiskArchiveRequest) null, 31);
            }
            this.field_c.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rn.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void commitMenuTransition(int param0) {
        if (GameRules.field_c == PlayerRankingRequest.field_o) {
          return;
        }
        if (PointsVictoryChecker.isMenuScreen((byte) -92, GameRules.field_c)) {
          LobbyPlayerEntry.field_Hb[GameRules.field_c].releaseHighscoreRequest((byte) 119);
        }
        TutorialAi.field_x = Wormhole.field_i;
        BirthDateConfirmationForm.field_Q = 0;
        GameRules.field_c = PlayerRankingRequest.field_o;
        if (PlayerRankingRequest.field_o == -3) {
          SoundEffectDefinition.initializeIntro((byte) -126);
        }
        if (0 == PlayerRankingRequest.field_o &&
          !ValidationState.field_b.containsTrack(PaddedContentDialog.field_nb, (byte) -23)) {
          QuickChatCategoryRegistry.transitionMusicTrack(param0 - 1015809, PaddedContentDialog.field_nb, true, 1048576);
        }
        if (PlayerRankingRequest.field_o == -6) {
          LobbyOptionSupport.field_f.writeOpcode(9, 255);
          StripedProgressWidget.field_Q = true;
          PlayerRankingRequest.field_o = GameRules.field_c;
        }
        if (ProxyAuthenticationRequiredException.field_b) {
          if (null != PasswordInputPainter.field_x &&
            PasswordInputPainter.field_x.field_Y != null) {
            PasswordInputPainter.field_x.field_Y.disposeWidgets((byte) -47);
          }
          if (null != SecondaryNodeHashTable.field_g &&
            SecondaryNodeHashTable.field_g.field_Y != null) {
            SecondaryNodeHashTable.field_g.field_Y.disposeWidgets((byte) -47);
          }
          ProxyAuthenticationRequiredException.field_b = false;
          PasswordInputPainter.field_x = null;
          SecondaryNodeHashTable.field_g = null;
        }
        if (LobbyRoomInteractionSupport.field_e) {
          StringList.field_b = null;
          GameKeyHandler.field_a = new IntrusiveDeque();
          ReflectionCheckDecoder.field_a = 0;
          LobbyRoomInteractionSupport.field_e = false;
        }
        if (param0 != 1048576) {
          return;
        }
        if (DiskArchiveRequest.field_A) {
          ProjectsContent.closeClientOverlays((byte) -120);
          UsernameAvailabilityValidator.e((byte) -66);
          TerritoryResourcePanelSupport.clearSocialLists(true);
          DiskArchiveRequest.field_A = false;
        }
    }

    final DiskArchiveRequest queueWrite(int param0, SectorCacheStore param1, int param2, byte[] param3) {
        DiskArchiveRequest var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        DiskArchiveRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new DiskArchiveRequest();
          if (param2 >= -28) {
            var6 = (byte[]) null;
            this.queueWrite(9, (SectorCacheStore) null, -105, (byte[]) null);
          }
          var5.field_q = false;
          var5.field_y = 2;
          var5.field_B = param1;
          var5.field_l = (long)param0;
          var5.field_w = param3;
          this.enqueue(var5, 1048576);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("rn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void initializeLoginUi(int param0, Archive param1, boolean param2, Archive param3, Archive param4) {
        try {
          ChatAndSocialPanel.field_a = CheckboxPainter.a("", -12179);
          if (param0 != 624) {
            DiskCacheWorker.loadIntroSprites((byte) -62);
          }
          ChatAndSocialPanel.field_a.setResult(false, 37);
          SolMapGenerator.a((byte) 87, param1, param4, param3);
          AudioService.initializeAccountDialogs(0);
          PrivateChatMessage.field_l = AccountCreationDialog.field_Fb;
          MatchingTextValidator.field_s = AccountCreationDialog.field_Fb;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "rn.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final DiskArchiveRequest queueRead(SectorCacheStore param0, int param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskArchiveRequest stackIn_2_0 = null;
        DiskArchiveRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 13514) {
            stackIn_2_0 = (DiskArchiveRequest) null;
            return stackIn_2_0;
          }
          var4 = new DiskArchiveRequest();
          var4.field_q = false;
          var4.field_B = param0;
          var4.field_y = 3;
          var4.field_l = (long)param1;
          this.enqueue(var4, 1048576);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("rn.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void shutdown(byte param0) {
        try {
          this.field_f = true;
          synchronized (this.field_c) {
            this.field_c.notifyAll();
          }
          int var2 = -52 % ((param0 + 10) / 61);
          try {
            this.field_h.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void loadIntroResources(PcmStreamMixer param0, int param1, int param2, Archive param3) {
        try {
          ClientContextMenuSupport.field_c = param1 * ArchiveSourceManager.getTargetFrameRate(param2 ^ param2) / 1000;
          ArchiveRequest.decodeLogoAudio(param2 - 1102, param3);
          AccountCreationDialog.loadLogoMeshes(param2 ^ 902, param3);
          AnimatedPanel.a(param3, (byte) 56);
          ReflectionCheck.initializeMeshRasterizer((byte) -47);
          UrlLoader.b((byte) -112);
          LobbyOptionSupport.field_j = -ClientContextMenuSupport.field_c + 0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "rn.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    DiskCacheWorker(PlatformTaskDispatcher param0) {
        PlatformTask var2 = null;
        this.field_c = new DualLinkDeque();
        this.field_f = false;
        this.field_d = 0;
        try {
          var2 = param0.requestThread(true, 5, (Runnable) (this));
          while (var2.field_d == 0) {
            ClientOverlayDrawSupport.sleep((byte) -107, 10L);
          }
          if (var2.field_d == 2) {
            throw new RuntimeException();
          }
          this.field_h = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Go Back";
        field_g = "Shortcut Reference";
        field_e = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
