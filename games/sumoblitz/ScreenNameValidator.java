/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenNameValidator extends TextInputValidator {
    static String field_g;
    private boolean available;
    private String lastCheckedName;

    ScreenNameValidator(TextInputWidget field) {
        super(field);
        this.available = false;
    }

    final void invalidateAvailability(int guard) {
        this.lastCheckedName = null;
        if (guard != -1) {
          ScreenNameValidator.a(false, -24, (byte) -79);
        }
    }

    final static void d(byte param0) {
        if (param0 != -112) {
          field_g = (String) null;
        }
        if (!AccountPacketReader.isGuestSession((byte) 9) &&
          !TimedSceneEffect.field_r) {
          if (MatchingTextValidator.field_g == null) {
            MatchingTextValidator.field_g = EmailSyntaxValidator.requestServerIntArray((byte) -92, 4);
          }
          if (MatchingTextValidator.field_g.complete) {
            LoginIdentifierSupport.field_e = LoginIdentifierSupport.field_e | MatchingTextValidator.field_g.firstValue;
            OpenGlTransparentWaterEffect.field_e = OpenGlTransparentWaterEffect.field_e & ~MatchingTextValidator.field_g.firstValue;
            TimedSceneEffect.field_r = true;
            MatchingTextValidator.field_g = null;
          }
        }
        if (null == Drone.field_g) {
          ResourceArchive.b(6);
        }
    }

    final static void sendServerIntArrayRead(int guard, int opcode) {
        if (guard < 107) {
          ScreenNameValidator.sendServerIntArrayRead(-41, -16);
        }
        IsaacPacketBuffer var2 = InwardSparkParticle.field_v;
        var2.writeCipherByte(opcode, 8);
        var2.writeByte((byte) 116, 1);
        var2.writeByte((byte) 107, 2);
    }

    final String messageForText(int guard, String text) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountServiceResult var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) text);
          var3 = CacheIoWorker.a(false, var5);
          if (guard != 0) {
            ScreenNameValidator.releaseStatics((byte) 14);
          }
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!text.equals(this.lastCheckedName)) {
            var4 = im.pollNameAvailability((byte) -109, text);
            if (var4 == null) {
              return null;
            }
            if (var4.errorMessage != null) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.available = var4.success;
            this.lastCheckedName = text;
          }
          if (this.available) {
            return PrimitiveType.nameIsAvailableText;
          }
          stackIn_16_0 = LegacyOpenGlReflectionEffect.field_e;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ou.B(").append(guard).append(',');
          if (text == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final ValidationStatus validateText(byte guard, String text) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ValidationStatus stackIn_3_0 = null;
        ValidationStatus stackIn_11_0 = null;
        ValidationStatus stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) text);
          if (!LegacyOpenGlShoreWaveWaterEffect.a(var4, (byte) 53)) {
            stackIn_3_0 = AccountConnectionPhase.INVALID;
            return stackIn_3_0;
          }
          if (guard != 26) {
            this.invalidateAvailability(-22);
          }
          if (!text.equals(this.lastCheckedName)) {
            var3 = im.pollNameAvailability((byte) -71, text);
            if (var3 != null &&
              var3.errorMessage == null) {
              this.available = var3.success;
              this.lastCheckedName = text;
            } else {
              stackIn_11_0 = FullscreenPromptController.PENDING;
              return stackIn_11_0;
            }
          }
          if (!this.available) {
            stackIn_16_0 = AccountConnectionPhase.INVALID;
          } else {
            stackIn_16_0 = PerlinNoiseFactory.VALID;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ou.E(").append(guard).append(',');
          if (text == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 119 % ((-43 - param0) / 63);
        field_g = null;
    }

    final static void a(boolean param0, int param1, byte param2) {
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        String stackIn_49_2 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        boolean stackIn_91_2 = false;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
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
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          LimitedRandomAccessFile.field_d = true;
          DroneChargeParticle.field_s = param1;
          if (0 == DroneChargeParticle.field_s) {
            var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, IntrusiveNode.fullscreenPlayIsAnText);
            var4 = 3 + var3_int;
            IntIndexHashTable.field_c = new String[var4];
            LegacyOpenGlPostProcessManager.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              LegacyOpenGlPostProcessManager.field_a[var5] = -1;
            }
            ByteArrayPool.field_b = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
            }
            IntIndexHashTable.field_c[-3 + var4] = "";
            IntIndexHashTable.field_c[-2 + var4] = AudioServiceThread.membersText;
            LegacyOpenGlPostProcessManager.field_a[-2 + var4] = 0;
            ByteArrayPool.field_b[0] = 4;
            IntIndexHashTable.field_c[-1 + var4] = DraggableWidget.closeText;
            LegacyOpenGlPostProcessManager.field_a[-1 + var4] = 1;
            ByteArrayPool.field_b[1] = 5;
          } else if (DroneChargeParticle.field_s == 1) {
            var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, IntrusiveNode.fullscreenPlayIsAnText);
            var4 = var3_int + 2;
            LegacyOpenGlPostProcessManager.field_a = new int[var4];
            IntIndexHashTable.field_c = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              LegacyOpenGlPostProcessManager.field_a[var5] = -1;
            }
            ByteArrayPool.field_b = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
            }
            IntIndexHashTable.field_c[-2 + var4] = "";
            IntIndexHashTable.field_c[-1 + var4] = DraggableWidget.closeText;
            LegacyOpenGlPostProcessManager.field_a[var4 - 1] = 0;
            ByteArrayPool.field_b[0] = 5;
          } else if (DroneChargeParticle.field_s != 2) {
            if (DroneChargeParticle.field_s == 3) {
              if (!lt.field_m.field_f) {
                var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, LegacyOpenGlGraphicsToolkit.unfortunatelyYourConfigurationDoesnText);
              } else {
                var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, FallbackShaderEffect.field_f);
              }
              var4 = var3_int + 2;
              LegacyOpenGlPostProcessManager.field_a = new int[var4];
              IntIndexHashTable.field_c = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                LegacyOpenGlPostProcessManager.field_a[var5] = -1;
              }
              ByteArrayPool.field_b = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
              }
              IntIndexHashTable.field_c[-2 + var4] = "";
              IntIndexHashTable.field_c[-1 + var4] = DraggableWidget.closeText;
              LegacyOpenGlPostProcessManager.field_a[-1 + var4] = 0;
              ByteArrayPool.field_b[0] = 5;
            } else if (4 == DroneChargeParticle.field_s) {
              var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, LimitedRandomAccessFile.field_c);
              var4 = var3_int + 2;
              IntIndexHashTable.field_c = new String[var4];
              LegacyOpenGlPostProcessManager.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                LegacyOpenGlPostProcessManager.field_a[var5] = -1;
              }
              ByteArrayPool.field_b = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
              }
              IntIndexHashTable.field_c[-2 + var4] = "";
              IntIndexHashTable.field_c[var4 - 1] = DraggableWidget.closeText;
              LegacyOpenGlPostProcessManager.field_a[var4 - 1] = 0;
              ByteArrayPool.field_b[0] = 5;
            } else {
              if (DroneChargeParticle.field_s != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, OpenGlBuffer.fullscreenModeWasCancelledText);
              var4 = 3 + var3_int;
              LegacyOpenGlPostProcessManager.field_a = new int[var4];
              IntIndexHashTable.field_c = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                LegacyOpenGlPostProcessManager.field_a[var5] = -1;
              }
              ByteArrayPool.field_b = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
              }
              IntIndexHashTable.field_c[-3 + var4] = "";
              IntIndexHashTable.field_c[var4 - 2] = FullscreenMembershipDialog.tryAgainText;
              LegacyOpenGlPostProcessManager.field_a[-2 + var4] = 0;
              ByteArrayPool.field_b[0] = 3;
              IntIndexHashTable.field_c[var4 - 1] = DraggableWidget.closeText;
              LegacyOpenGlPostProcessManager.field_a[var4 - 1] = 1;
              ByteArrayPool.field_b[1] = 5;
            }
          } else {
            var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, LegacyOpenGlInterleavedStream.formatIndexedTokens(ClientExceptionSupport.ifYouDoNothingText, new String[]{"<br><%0><br>"}, (byte) -128));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(GameInstructions.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            no.field_b = new String[var4];
            ArrayUtils.copy(GameInstructions.field_c, 0, no.field_b, 0, var4);
            TickClock.field_c = new String[-1 - var4 + var3_int];
            ArrayUtils.copy(GameInstructions.field_c, var4 + 1, TickClock.field_c, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = DelegatingCanvas.a(GameInstructions.field_c, ValidatedTextInputWidget.field_R, LegacyOpenGlVertexBuffer.field_j, false, LegacyOpenGlInterleavedStream.formatIndexedTokens(lq.field_a, new String[]{"<br><%0><br>"}, (byte) -128));
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(GameInstructions.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ResizingDialog.field_F = new String[var4];
            ArrayUtils.copy(GameInstructions.field_c, 0, ResizingDialog.field_F, 0, var4);
            TickClock.field_b = new String[-1 + (-var4 + var3_int)];
            ArrayUtils.copy(GameInstructions.field_c, var4 + 1, TickClock.field_b, 0, -1 - var4 + var3_int);
            if (no.field_b.length >= ResizingDialog.field_F.length) {
              stackIn_31_0 = no.field_b.length;
            } else {
              stackIn_31_0 = ResizingDialog.field_F.length;
            }
            var5 = stackIn_31_0;
            if (TickClock.field_b.length <= TickClock.field_c.length) {
              stackIn_34_0 = TickClock.field_c.length;
            } else {
              stackIn_34_0 = TickClock.field_b.length;
            }
            var6 = stackIn_34_0;
            var7 = var6 + 7 + var5;
            IntIndexHashTable.field_c = new String[var7];
            LegacyOpenGlPostProcessManager.field_a = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              LegacyOpenGlPostProcessManager.field_a[var8] = -1;
            }
            ByteArrayPool.field_b = new int[2];
            IntIndexHashTable.field_c[0] = NanoTickClock.clickText;
            IntIndexHashTable.field_c[1] = km.acceptText;
            LegacyOpenGlPostProcessManager.field_a[1] = 0;
            ByteArrayPool.field_b[1] = 2;
            ByteArrayPool.field_b[0] = 5;
            LegacyOpenGlPostProcessManager.field_a[3] = 1;
            IntIndexHashTable.field_c[5] = "";
            IntIndexHashTable.field_c[3] = up.cancelText;
            IntIndexHashTable.field_c[2] = ClientStackTraceFormatter.toKeepFullscreenOrText;
            IntIndexHashTable.field_c[4] = OpenGlShaderProgram.toReturnToTheText;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_41_0 = IntIndexHashTable.field_c;
              stackIn_41_1 = var8Lifetime2 + 6;
              if (ResizingDialog.field_F.length + (var8Lifetime2 - var5) < 0) {
                stackIn_42_2 = "";
              } else {
                stackIn_42_2 = ResizingDialog.field_F[var8Lifetime2 + ResizingDialog.field_F.length - var5];
              }
              stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            }
            IntIndexHashTable.field_c[6 + var5] = null;
            LegacyOpenGlPostProcessManager.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_46_0 = IntIndexHashTable.field_c;
              stackIn_46_1 = var5 + (7 + var8Lifetime3);
              stackIn_46_2 = ~TickClock.field_b.length;
              stackIn_46_3 = ~var8Lifetime3;
              if (stackIn_46_2 >= stackIn_46_3) {
                stackIn_49_2 = "";
              } else {
                stackIn_49_2 = TickClock.field_b[var8Lifetime3];
              }
              stackIn_46_0[stackIn_46_1] = stackIn_49_2;
            }
            LegacyOpenGlEffectManager.field_f = IntroMeshResources.monotonicTimeMillis(-17);
          }
          RendererPreference.field_a.itemCount = ByteArrayPool.field_b.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < IntIndexHashTable.field_c.length; var4Lifetime1++) {
            stackIn_90_0 = -27;
            stackIn_90_1 = IntIndexHashTable.field_c[var4Lifetime1];
            stackIn_91_2 = !(LegacyOpenGlPostProcessManager.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(stackIn_90_0, stackIn_90_1, stackIn_91_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (DroneChargeParticle.field_s == 2) {
            var11 = no.field_b;
            var4_ref_String__ = var11;
            for (var5Lifetime2 = 0; var11.length > var5Lifetime2; var5Lifetime2++) {
              var12 = var11[var5Lifetime2];
              var7Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(-42, var12, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = TickClock.field_c;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var13 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(-120, var13, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          VertexStreamLayout.field_b = -(var3_intLifetime1 >> 1) + BeveledCheckboxRenderer.field_a;
          PlayingSound.field_n = var3_intLifetime1 + BeveledCheckboxRenderer.field_a - (var3_intLifetime1 >> 1);
          RenderPresentationException.field_d = RendererPreference.field_a.itemCount * (TextLayout.field_b + DroneIntroductionOverlay.field_a << 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < IntIndexHashTable.field_c.length; var4Lifetime2++) {
            stackIn_116_0 = RenderPresentationException.field_d;
            if (0 <= LegacyOpenGlPostProcessManager.field_a[var4Lifetime2]) {
              stackIn_117_1 = LegacyOpenGlUnderwaterEffect.field_h;
            } else {
              stackIn_117_1 = GameClientShell.field_t;
            }
            RenderPresentationException.field_d = stackIn_116_0 + stackIn_117_1;
          }
          ProxyAuthenticationRequiredException.field_f = -(RenderPresentationException.field_d >> 1) + ComboState.field_b;
          var4Lifetime3 = -96 % ((param2 - 48) / 57);
          HardwareAnimatedWaterEffect.field_g = new int[IntIndexHashTable.field_c.length][];
          var5Lifetime3 = 0;
          var6Lifetime1 = ProxyAuthenticationRequiredException.field_f;
          while (IntIndexHashTable.field_c.length > var5Lifetime3) {
            var7Lifetime2 = LegacyOpenGlPostProcessManager.field_a[var5Lifetime3];
            if (var7Lifetime2 < 0) {
              var6Lifetime1 = var6Lifetime1 + GameClientShell.field_t;
            } else {
              var8Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(-116, IntIndexHashTable.field_c[var5Lifetime3], true);
              var9 = -(var8Lifetime1 >> 1) + BeveledCheckboxRenderer.field_a;
              var6Lifetime1 = var6Lifetime1 + DroneIntroductionOverlay.field_a;
              HardwareAnimatedWaterEffect.field_g[var5Lifetime3] = new int[4];
              HardwareAnimatedWaterEffect.field_g[var5Lifetime3][0] = var9 - DebouncedInputValidator.field_b;
              HardwareAnimatedWaterEffect.field_g[var5Lifetime3][1] = var6Lifetime1;
              HardwareAnimatedWaterEffect.field_g[var5Lifetime3][2] = (DebouncedInputValidator.field_b << 1) + var8Lifetime1;
              var6Lifetime1 = var6Lifetime1 + (DroneIntroductionOverlay.field_a + (TextLayout.field_b << 1) + LegacyOpenGlUnderwaterEffect.field_h);
              HardwareAnimatedWaterEffect.field_g[var5Lifetime3][3] = (TextLayout.field_b << 1) + LegacyOpenGlUnderwaterEffect.field_h;
            }
            var5Lifetime3++;
          }
          if (DroneChargeParticle.field_s == 2) {
            RendererPreference.field_a.resetSelection(param0, 84, -1, -1);
          } else {
            RendererPreference.field_a.resetSelection(param0, -27, OpenGlAssemblyProgram.b(pi.field_e, 1882601153, PointLight.mouseX), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "ou.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "save";
    }
}
