/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SlowBurstParticle extends TimedSceneEffect {
    private int velocityXQ8;
    static TextureCombineOperation MODULATE;
    private int initialLifetime;
    private int velocityYQ8;
    static int[] field_z;
    boolean field_u;
    static ContentDialog field_y;
    private int textureKind;

    final static void e(int param0) {
        SoftwareRenderBuffer.a(5178);
        ReflectionCheck.setAccountDialogResult(param0, param0 - 31);
    }

    final boolean updateAndIsExpired(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.initialLifetime <= this.remainingTicks) {
        } else {
          this.x = this.x + this.velocityXQ8;
          this.y = this.y + this.velocityYQ8;
          this.velocityXQ8 = this.velocityXQ8 * 251 / 300;
          this.velocityYQ8 = this.velocityYQ8 * 251 / 300;
          if (this.velocityXQ8 >= 0) {
            this.velocityXQ8 = this.velocityXQ8 + 1;
          } else {
            this.velocityXQ8 = this.velocityXQ8 - 1;
          }
          if (this.velocityYQ8 >= 0) {
            this.velocityYQ8 = this.velocityYQ8 + 1;
          } else {
            this.velocityYQ8 = this.velocityYQ8 - 1;
          }
        }
        if (param0 != -2567) {
          return true;
        }
        return super.updateAndIsExpired(-2567);
    }

    final static boolean f(int param0) {
        if (null != IntroLogoRenderer.field_a[0]) {
          return false;
        }
        DirectByteArrayStorage.a(135, 38, 148, 2, new int[]{0, 23, 24, 3, 2, 14, 11}, 0, 492);
        DirectByteArrayStorage.a(150, 38, 170, param0 - 3, new int[]{1, 28, 12, 13, 3, 7}, 1, 470);
        DirectByteArrayStorage.a(150, 38, 170, param0 - 3, new int[]{12, 13, 27, 4, param0}, 8, 470);
        DirectByteArrayStorage.a(400, 38, 150, 2, new int[]{15, 5}, 2, 490);
        DirectByteArrayStorage.a(430, 38, 170, 2, new int[]{18, 6, 17}, 3, 470);
        DirectByteArrayStorage.a(430, 38, 170, 2, new int[]{15, 5}, 4, 470);
        DirectByteArrayStorage.a(430, 38, 170, 2, new int[]{2, 5}, 5, 470);
        DirectByteArrayStorage.a(200, 96, 170, param0 - 3, new int[]{15, 16}, 6, 470);
        DirectByteArrayStorage.a(390, 38, 170, 2, new int[]{29, 5}, 7, 468);
        DirectByteArrayStorage.a(400, 38, 200, 2, new int[]{30, 6}, 9, 440);
        DirectByteArrayStorage.a(370, 38, 200, 2, new int[]{31, 32}, 10, 440);
        DirectByteArrayStorage.a(240, 38, 200, 2, new int[]{28, 33}, 11, 440);
        DirectByteArrayStorage.a(370, 38, 200, 2, new int[]{33}, 12, 440);
        SocketJs5Client.field_q = (int)((double)LoginTextResources.field_b.a(GameClientShell.field_u[12], 0) * 1.5);
        int var1 = (int)((double)LoginTextResources.field_b.a(GameClientShell.field_u[13], 0) * 1.5);
        if (SocketJs5Client.field_q < var1) {
          SocketJs5Client.field_q = var1;
        }
        GameProgressUpdate.field_o = new ResetStatsConfirmationOverlay();
        return true;
    }

    public static void releaseStatics(boolean param0) {
        field_y = null;
        field_z = null;
        MODULATE = null;
        if (!param0) {
          SlowBurstParticle.readFourStatHiscores((byte) 28);
        }
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.textureKind == 0) {
            IntroductionOverlaySupport.field_a.drawRotated((float)(this.x >> 8), (float)(this.y >> 8), 2048, 0, 3, 16777215 + (this.remainingTicks * (256 / this.initialLifetime) << 24), 1);
          } else {
            ParticleSpriteResources.sparkSprite.drawRotated((float)(this.x >> 8), (float)(this.y >> 8), 8192, 0, 0, (256 / this.initialLifetime * this.remainingTicks << 24) + this.color, 1);
          }
          if (guard > -121) {
            MODULATE = (TextureCombineOperation) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vi.C(");
          if (toolkit == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    SlowBurstParticle(int lifetimeTicks, int xQ8, int yQ8, int color, int velocityXQ8, int velocityYQ8, int textureKind) {
        super(lifetimeTicks, xQ8, yQ8, color);
        this.textureKind = textureKind;
        this.velocityYQ8 = velocityYQ8;
        this.initialLifetime = lifetimeTicks;
        this.velocityXQ8 = velocityXQ8;
    }

    final static void readFourStatHiscores(byte guard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        FourStatHiscoreRequest var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        IsaacPacketBuffer var13 = null;
        int var14 = 0;
        IsaacPacketBuffer var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -77) {
            return;
          }
          var13 = NativeLibraryExtractor.field_a;
          var15 = var13;
          var2 = var15.readUnsignedByte(-31302);
          var3 = (FourStatHiscoreRequest) (EmailValidationError.field_a.first(122));
          while (var3 != null) {
            if (var2 != var3.requestId) {
              var3 = (FourStatHiscoreRequest) (EmailValidationError.field_a.next((byte) 18));
              continue;
            }
            break;
          }
          if (var3 == null) {
            LegacyOpenGlTextureCache.closeAccountSocket((byte) -115);
            return;
          }
          var4 = var15.readUnsignedByte(-31302);
          if (var4 != 0) {
            var5 = var3.rowLimit;
            RenderPresentationException.field_b[0] = QueuedIntArrayRequest.field_o;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              RenderPresentationException.field_b[var6_int] = var13.readCp1252String(-1);
            }
            AlternateUsernameCredentials.b(var4, -2147483648, var5);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              ArenaPad.a(var15, (byte) 61);
              if (var6_intLifetime1 == 0) {
                HardwareUnlitEffect.a(ReassignUpgradesScreen.field_l, DisplayModeConfirmationDialog.field_U, true, var6_intLifetime1, SoftLruCache.field_f, LegacyWaterTextureResources.field_d);
              } else {
                HardwareUnlitEffect.a(ReassignUpgradesScreen.field_l, DisplayModeConfirmationDialog.field_U, true, var6_intLifetime1, SoftLruCache.field_f, LegacyWaterTextureResources.field_d);
              }
            }
            AccountConnectionPhase.a(13136, var5);
            var6 = new String[2][var5];
            var19 = new int[2][var5 * 4];
            var8 = LoginCredentials.field_d;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = FourIntReadRequest.field_q[var9];
              var6[0][var10] = RenderPresentationException.field_b[var11];
              var19[0][var10 * 4] = LoginFieldValue.field_a[var11];
              var19[0][var10 * 4 + 1] = ContentTransitionPhase.field_f[var11];
              var19[0][2 + 4 * var10] = LegacyOpenGlInterleavedStream.field_c[var11];
              var19[0][var10 * 4 + 3] = field_z[var11];
              if (AccountUiBootstrap.isCurrentUserName(RenderPresentationException.field_b[var11], (byte) -25) &&
                field_z[var11] + ContentTransitionPhase.field_f[var11] + LegacyOpenGlInterleavedStream.field_c[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = FourIntReadRequest.field_q[var9Lifetime1 + var5];
              var6[1][var14] = RenderPresentationException.field_b[var11Lifetime1];
              var19[1][4 * var14] = LoginFieldValue.field_a[var11Lifetime1];
              var19[1][1 + 4 * var14] = ContentTransitionPhase.field_f[var11Lifetime1];
              var19[1][2 + 4 * var14] = LegacyOpenGlInterleavedStream.field_c[var11Lifetime1];
              var19[1][var14 * 4 + 3] = field_z[var11Lifetime1];
              if (AccountUiBootstrap.isCurrentUserName(RenderPresentationException.field_b[var11Lifetime1], (byte) -25) &&
                ContentTransitionPhase.field_f[var11Lifetime1] - (-LegacyOpenGlInterleavedStream.field_c[var11Lifetime1] - field_z[var11Lifetime1]) == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var14++;
              var9Lifetime1++;
            }
            var3.unlink(false);
            return;
          }
          var3.unlink(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "vi.A(" + guard + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        SessionStatisticsSubmission var4 = null;
        HiscoreRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = (SessionStatisticsSubmission) (HuffmanDecoder.field_f.first(85));
          while (var4 != null) {
            FourStatHiscoreRequest.sendSessionStatistics((byte) -120, param0, var4);
            var4 = (SessionStatisticsSubmission) (HuffmanDecoder.field_f.next((byte) 18));
          }
          var5 = (HiscoreRequest) (HiscoreRequestQueue.pending.first(109));
          while (var5 != null) {
            FourIntReadRequest.sendHiscoreRequest((byte) -65, param0, var5);
            var5 = (HiscoreRequest) (HiscoreRequestQueue.pending.next((byte) 18));
          }
          if (param1 > -63) {
            field_z = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "vi.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static String discardContinuationText(int baseIndex, boolean secondFlag, boolean thirdFlag, boolean firstFlag) {
        int var4 = baseIndex;
        if (firstFlag) {
          var4 += 4;
        }
        if (secondFlag) {
          var4 += 2;
        }
        if (thirdFlag) {
          var4++;
        }
        return RasterColorTables.field_f[var4];
    }

    static {
        MODULATE = new TextureCombineOperation();
    }
}
