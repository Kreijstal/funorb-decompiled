/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt {
    static ValidationStatus PENDING;

    final static float[] a(byte param0, float[] param1, float param2) {
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
          if (param0 >= -6) {
            stackIn_2_0 = (float[]) null;
            return stackIn_2_0;
          }
          var4[0] = (float)(Math.cos((double)param2) * (double)param1[0] - Math.sin((double)param2) * (double)param1[1]);
          var4[1] = (float)(Math.cos((double)param2) * (double)param1[1] + Math.sin((double)param2) * (double)param1[0]);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("kt.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (param0 < 99) {
          return;
        }
        AlternateUsernameCredentials.b((byte) -113);
    }

    final static int a(int param0) {
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
            RendererPreference.field_a.a((byte) 63);
            if (RendererPreference.field_a.d(-31260)) {
              var1_int = 1;
            }
            if (TextureCombineOperation.field_a != 13) {
              continue;
            }
            var2 = 1;
          }
          RendererPreference.field_a.a(true, OpenGlAssemblyProgram.b(AgeValidator.field_f, 1882601153, LoginCredentialType.field_a), OpenGlAssemblyProgram.b(pi.field_e, 1882601153, ko.field_p));
          if (RendererPreference.field_a.d(-31260)) {
            var1_int = 1;
          }
          var4 = -89 / ((param0 - 67) / 48);
          var3 = 0;
          if (var1_int != 0 &&
            RendererPreference.field_a.field_g >= 0) {
            var3 = jo.field_b[RendererPreference.field_a.field_g];
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
            var5 = -LegacyOpenGlEffectManager.field_f + wq.monotonicTimeMillis(-84);
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kt.A(" + param0 + ')');
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
