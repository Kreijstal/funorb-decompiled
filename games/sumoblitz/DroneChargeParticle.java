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
            im.field_a.draw(this.drone.xQ8 + this.x >> 8, this.drone.yQ8 + this.y >> 8, 0, this.color + (4 * this.remainingTicks << 24), 1);
          } else {
            uc.field_a.drawRotated((float)(this.drone.xQ8 + this.x >> 8), (float)(this.y + this.drone.yQ8 >> 8), 1024, 0, 3, 16777215 + (this.remainingTicks * 4 << 24), 1);
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
        if (null != GameClientShell.field_u) {
          return;
        }
        GameClientShell.field_u = new String[34];
        GameClientShell.field_u[16] = vp.discardText;
        GameClientShell.field_u[1] = WhirlpoolTables.resumeGameText;
        GameClientShell.field_u[5] = RenderPresentationException.menuText;
        GameClientShell.field_u[11] = RasterBuffer.quitText;
        GameClientShell.field_u[14] = LegacyOpenGlRenderbuffer.achievementsText;
        GameClientShell.field_u[6] = RenderPresentationException.menuText;
        GameClientShell.field_u[12] = ff.soundText;
        GameClientShell.field_u[7] = nj.endGameText;
        GameClientShell.field_u[0] = k.startGameText;
        GameClientShell.field_u[3] = cp.instructionsText;
        int var1 = 56 % ((param0 + 26) / 42);
        GameClientShell.field_u[15] = OpenGlTexture3D.logInCreateAccountText;
        GameClientShell.field_u[4] = ResourceArchive.field_j;
        GameClientShell.field_u[2] = MouseInputHandler.field_a;
        GameClientShell.field_u[13] = gu.musicText;
        GameClientShell.field_u[21] = DropDownListWidget.regularText;
        GameClientShell.field_u[25] = ea.difficultyText;
        GameClientShell.field_u[18] = CompactMeshGeometry.previousText;
        GameClientShell.field_u[10] = PlayingSound.scoreFilterLabels[2];
        GameClientShell.field_u[27] = ni.field_g;
        GameClientShell.field_u[23] = pt.challengeText;
        GameClientShell.field_u[24] = nq.optionsText;
        GameClientShell.field_u[17] = FadingWidget.nextText;
        GameClientShell.field_u[28] = ss.restartLevelText;
        GameClientShell.field_u[19] = dn.arcadeGameText;
        GameClientShell.field_u[22] = MusicPatch.editorText;
        BufferedSocket.field_i = new String[]{mn.highText, bc.lowText};
        GameClientShell.field_u[33] = mm.levelSelectText;
        GameClientShell.field_u[26] = lh.resetStatsText;
        GameClientShell.field_u[9] = PlayingSound.scoreFilterLabels[1];
        GameClientShell.field_u[20] = TimedSceneEffect.challengeText;
        GameClientShell.field_u[32] = mm.levelSelectText;
        GameClientShell.field_u[8] = PlayingSound.scoreFilterLabels[0];
        GameClientShell.field_u[29] = hv.reassignText;
        GameClientShell.field_u[30] = ou.field_g;
        GameClientShell.field_u[31] = VertexAttribute.continueText;
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

    final static void a(byte param0, lt param1, int param2) {
        pl var5 = InwardSparkParticle.field_v;
        var5.g(param2, param0 ^ -105);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        var5.writeByte((byte) 84, 1);
        var5.writeByte((byte) 103, param1.field_k);
        if (param0 != -97) {
          return;
        }
        try {
          var5.writeSignedSmart(param1.field_o, (byte) -17);
          var5.writeInt(48, param1.field_n);
          var5.writeInt(48, param1.field_p);
          var5.writeInt(48, param1.field_q);
          var5.writeInt(48, param1.field_l);
          var5.appendCrc32(var4, false);
          var5.patchByteLength(var5.position - var4, param0 - 13648);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_z = new int[2];
    }
}
