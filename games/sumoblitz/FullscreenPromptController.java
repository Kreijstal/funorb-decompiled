/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenPromptController {
    static ValidationStatus PENDING;

    final static float[] rotateVector(byte guard, float[] vector, float angle) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_2_0 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new float[2];
          var3 = var4;
          if (guard >= -6) {
            stackIn_2_0 = (float[]) null;
            return stackIn_2_0;
          }
          var4[0] = (float)(Math.cos((double)angle) * (double)vector[0] - Math.sin((double)angle) * (double)vector[1]);
          var4[1] = (float)(Math.cos((double)angle) * (double)vector[1] + Math.sin((double)angle) * (double)vector[0]);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("kt.C(").append(guard).append(',');
          if (vector == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(angle).append(')').toString());
        }
    }

    final static void initializeGraphicsOptions(byte guard) {
        if (guard < 99) {
          return;
        }
        AlternateUsernameCredentials.initializeGraphicsOptionsLayer((byte) -113);
    }

    final static int pollPromptInput(int guard) {
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (EmailCredentials.c(-105)) {
            RendererPreference.field_a.handleVerticalNavigation((byte) 63);
            if (RendererPreference.field_a.isActivated(-31260)) {
              var1_int = 1;
            }
            if (TextureCombineOperation.field_a != 13) {
              continue;
            }
            var2 = 1;
          }
          RendererPreference.field_a.updatePointerSelection(true, OpenGlAssemblyProgram.b(AgeValidator.field_f, 1882601153, LoginCredentialType.field_a), OpenGlAssemblyProgram.b(ArenaDefinitionCodec.field_e, 1882601153, PointLight.mouseX));
          if (RendererPreference.field_a.isActivated(-31260)) {
            var1_int = 1;
          }
          var4 = -89 / ((guard - 67) / 48);
          var3 = 0;
          if (var1_int != 0 &&
            RendererPreference.field_a.selectedIndex >= 0) {
            var3 = ByteArrayPool.field_b[RendererPreference.field_a.selectedIndex];
            if (var3 == 2) {
              GraphicsToolkit.b(23639);
            } else if (var3 == 5) {
              GraphicsToolkit.b(23639);
            }
          } else {
            if (var2 != 0 &&
              DroneChargeParticle.field_s != 2) {
              GraphicsToolkit.b(23639);
            }
          }
          if (var3 == 0 &&
            2 == DroneChargeParticle.field_s) {
            var5 = -LegacyOpenGlEffectManager.field_f + IntroMeshResources.monotonicTimeMillis(-84);
            var7 = (int)((10999L - var5) / 1000L);
            if (var7 <= 0) {
              var3 = 2;
              ScreenNameValidator.a(true, 5, (byte) 118);
            }
          }
          stackIn_30_0 = var3;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kt.A(" + guard + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        PENDING = null;
        if (param0 != -14) {
          PENDING = (ValidationStatus) null;
        }
    }

    static {
        PENDING = new ValidationStatus();
    }
}
