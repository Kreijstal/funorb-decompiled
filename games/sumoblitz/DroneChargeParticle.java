/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DroneChargeParticle extends TimedSceneEffect {
    private int velocityYQ8;
    static int field_s;
    private int textureKind;
    private Drone drone;
    static boolean field_w;
    private int velocityXQ8;
    static SpriteData[] field_v;
    static int[] field_z;

    final void render(GraphicsToolkit toolkit, int guard) {
        RuntimeException var3 = null;
        GraphicsToolkit var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != this.textureKind) {
            ParticleSpriteResources.sparkSprite.draw(this.drone.xQ8 + this.x >> 8, this.drone.yQ8 + this.y >> 8, 0, this.color + (4 * this.remainingTicks << 24), 1);
          } else {
            IntroductionOverlaySupport.field_a.drawRotated((float)(this.drone.xQ8 + this.x >> 8), (float)(this.y + this.drone.yQ8 >> 8), 1024, 0, 3, 16777215 + (this.remainingTicks * 4 << 24), 1);
          }
          if (guard <= -121) {
            return;
          }
          var4 = (GraphicsToolkit) null;
          this.render((GraphicsToolkit) null, 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cl.C(");
          if (toolkit == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 4) {
          return;
        }
        field_z = null;
        field_v = null;
    }

    final static void initializeMenuLabels(int param0) {
        if (null != GameClientShell.menuActionLabels) {
          return;
        }
        GameClientShell.menuActionLabels = new String[34];
        GameClientShell.menuActionLabels[16] = DroneVariantScoring.discardText;
        GameClientShell.menuActionLabels[1] = WhirlpoolTables.resumeGameText;
        GameClientShell.menuActionLabels[5] = RenderPresentationException.menuText;
        GameClientShell.menuActionLabels[11] = RasterBuffer.quitText;
        GameClientShell.menuActionLabels[14] = LegacyOpenGlRenderbuffer.achievementsText;
        GameClientShell.menuActionLabels[6] = RenderPresentationException.menuText;
        GameClientShell.menuActionLabels[12] = TurbulenceNoise3D.soundText;
        GameClientShell.menuActionLabels[7] = RendererPreference.endGameText;
        GameClientShell.menuActionLabels[0] = SpriteSheetSupport.startGameText;
        GameClientShell.menuActionLabels[3] = WidgetTheme.instructionsText;
        int var1 = 56 % ((param0 + 26) / 42);
        GameClientShell.menuActionLabels[15] = OpenGlTexture3D.logInCreateAccountText;
        GameClientShell.menuActionLabels[4] = ResourceArchive.field_j;
        GameClientShell.menuActionLabels[2] = MouseInputHandler.field_a;
        GameClientShell.menuActionLabels[13] = HardwareBufferSet.musicText;
        GameClientShell.menuActionLabels[21] = DropDownListWidget.regularText;
        GameClientShell.menuActionLabels[25] = AccountUiBootstrap.difficultyText;
        GameClientShell.menuActionLabels[18] = CompactMeshGeometry.previousText;
        GameClientShell.menuActionLabels[10] = PlayingSound.scoreFilterLabels[2];
        GameClientShell.menuActionLabels[27] = FallbackShaderEffect.field_g;
        GameClientShell.menuActionLabels[23] = CubeMapSource.challengeText;
        GameClientShell.menuActionLabels[24] = MatchingTextValidator.optionsText;
        GameClientShell.menuActionLabels[17] = FadingWidget.nextText;
        GameClientShell.menuActionLabels[28] = IntroPreparation.restartLevelText;
        GameClientShell.menuActionLabels[19] = LoadingStatusText.arcadeGameText;
        GameClientShell.menuActionLabels[22] = MusicPatch.editorText;
        BufferedSocket.field_i = new String[]{ArchiveLoadingStage.highText, DiskCacheDataFile.lowText};
        GameClientShell.menuActionLabels[33] = AccountRequestState.levelSelectText;
        GameClientShell.menuActionLabels[26] = ServerDataReadRequest.resetStatsText;
        GameClientShell.menuActionLabels[9] = PlayingSound.scoreFilterLabels[1];
        GameClientShell.menuActionLabels[20] = TimedSceneEffect.challengeText;
        GameClientShell.menuActionLabels[32] = AccountRequestState.levelSelectText;
        GameClientShell.menuActionLabels[8] = PlayingSound.scoreFilterLabels[0];
        GameClientShell.menuActionLabels[29] = ProjectionMode.reassignText;
        GameClientShell.menuActionLabels[30] = ScreenNameValidator.field_g;
        GameClientShell.menuActionLabels[31] = VertexAttribute.continueText;
    }

    final boolean updateAndIsExpired(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -2567) {
          field_z = (int[]) null;
          if (this.remainingTicks >= 64) {
            return super.updateAndIsExpired(-2567);
          }
          this.y = this.y + this.velocityYQ8;
          this.x = this.x + this.velocityXQ8;
          this.velocityXQ8 = this.velocityXQ8 * 251 / 285;
          this.velocityYQ8 = this.velocityYQ8 * 251 / 285;
          if (0 > this.velocityYQ8) {
            this.velocityYQ8 = this.velocityYQ8 - 1;
            if (this.velocityXQ8 >= 0) {
              this.velocityXQ8 = this.velocityXQ8 + 1;
              return super.updateAndIsExpired(-2567);
            }
            this.velocityXQ8 = this.velocityXQ8 - 1;
            return super.updateAndIsExpired(-2567);
          }
          this.velocityYQ8 = this.velocityYQ8 + 1;
          if (this.velocityXQ8 >= 0) {
            this.velocityXQ8 = this.velocityXQ8 + 1;
            return super.updateAndIsExpired(-2567);
          }
          this.velocityXQ8 = this.velocityXQ8 - 1;
          return super.updateAndIsExpired(-2567);
        }
        if (this.remainingTicks >= 64) {
          return super.updateAndIsExpired(-2567);
        }
        this.y = this.y + this.velocityYQ8;
        this.x = this.x + this.velocityXQ8;
        this.velocityXQ8 = this.velocityXQ8 * 251 / 285;
        this.velocityYQ8 = this.velocityYQ8 * 251 / 285;
        if (0 > this.velocityYQ8) {
          this.velocityYQ8 = this.velocityYQ8 - 1;
          if (this.velocityXQ8 >= 0) {
            this.velocityXQ8 = this.velocityXQ8 + 1;
            return super.updateAndIsExpired(-2567);
          }
          this.velocityXQ8 = this.velocityXQ8 - 1;
          return super.updateAndIsExpired(-2567);
        }
        this.velocityYQ8 = this.velocityYQ8 + 1;
        if (this.velocityXQ8 >= 0) {
          this.velocityXQ8 = this.velocityXQ8 + 1;
          return super.updateAndIsExpired(-2567);
        }
        this.velocityXQ8 = this.velocityXQ8 - 1;
        return super.updateAndIsExpired(-2567);
    }

    DroneChargeParticle(int lifetimeTicks, int offsetXQ8, int offsetYQ8, int color, int velocityXQ8, int velocityYQ8, int textureKind, Drone drone) {
        super(lifetimeTicks, offsetXQ8, offsetYQ8, color);
        try {
          this.textureKind = textureKind;
          this.velocityXQ8 = velocityXQ8;
          this.drone = drone;
          this.velocityYQ8 = velocityYQ8;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cl.<init>(" + lifetimeTicks + ',' + offsetXQ8 + ',' + offsetYQ8 + ',' + color + ',' + velocityXQ8 + ',' + velocityYQ8 + ',' + textureKind + ',' + (drone != null ? "{...}" : "null") + ')');
        }
    }

    final static void sendFourIntUpdate(byte guard, FourIntUpdateRequest request, int opcode) {
        IsaacPacketBuffer var5 = InwardSparkParticle.outgoingPacket;
        var5.writeCipherByte(opcode, guard ^ -105);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        var5.writeByte((byte) 84, 1);
        var5.writeByte((byte) 103, request.byteKey);
        if (guard != -97) {
          return;
        }
        try {
          var5.writeSignedSmart(request.smartKey, (byte) -17);
          var5.writeInt(48, request.firstValue);
          var5.writeInt(48, request.secondValue);
          var5.writeInt(48, request.thirdValue);
          var5.writeInt(48, request.fourthValue);
          var5.appendCrc32(var4, false);
          var5.patchByteLength(var5.position - var4, guard - 13648);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cl.D(" + guard + ',' + (request != null ? "{...}" : "null") + ',' + opcode + ')');
        }
    }

    static {
        field_z = new int[2];
    }
}
