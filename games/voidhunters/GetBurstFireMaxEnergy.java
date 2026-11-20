/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBurstFireMaxEnergy extends ConsoleCommand {
    static MidiCrossfadeStream musicStream;
    static boolean field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_o = true;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(43, 85));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ew.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void setTeamChatName(int param0, String param1) {
        try {
          LoginForm.teamChatName = param1;
          if (param0 != 1043) {
            GetBurstFireMaxEnergy.clearSharedReferences(false);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ew.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          return;
        }
        musicStream = null;
    }

    GetBurstFireMaxEnergy(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void drawClippedLine(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        var14 = VoidHunters.field_G;
        var6 = -param3 + param1;
        var7 = param4 - param0;
        if (var6 == 0) {
          if (var7 != 0) {
            Message.drawClippedVerticalLine(-119, param3, param5, param4, param0);
          }
          return;
        }
        if (0 == var7) {
          SetMinimapWidth.fillClippedHorizontalSpan(param0, param1, (byte) 111, param5, param3);
          return;
        }
        if (param2 < 45) {
          return;
        }
        var12 = (var7 << 12) / var6;
        var13 = param0 - (var12 * param3 >> 12);
        if (param3 < OpenGlTexture3D.rasterClipMinX) {
          var8 = OpenGlTexture3D.rasterClipMinX;
          var10 = var13 + (OpenGlTexture3D.rasterClipMinX * var12 >> 12);
          if (OpenGlTexture3D.rasterClipMinX > param1) {
            var11 = (OpenGlTexture3D.rasterClipMinX * var12 >> 12) + var13;
            var9 = OpenGlTexture3D.rasterClipMinX;
          } else {
            if (GetCountermeasureLauncherProjectiles.rasterClipMaxX < param1) {
              var11 = var13 + (GetCountermeasureLauncherProjectiles.rasterClipMaxX * var12 >> 12);
              var9 = GetCountermeasureLauncherProjectiles.rasterClipMaxX;
            } else {
              var9 = param1;
              var11 = param4;
            }
          }
          if (NebulaField.rasterClipMinY <= var11) {
            if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var11) {
              var11 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
              var9 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
            }
          } else {
            var11 = NebulaField.rasterClipMinY;
            var9 = (NebulaField.rasterClipMinY - var13 << 12) / var12;
          }
          if (NebulaField.rasterClipMinY > var10) {
            var10 = NebulaField.rasterClipMinY;
            var8 = (-var13 + NebulaField.rasterClipMinY << 12) / var12;
          } else {
            if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var10) {
              var8 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
              var10 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
            }
          }
          SetOndamageParticleLife.a(param5, var9, -1, var10, var11, var8);
          return;
        }
        if (GetCountermeasureLauncherProjectiles.rasterClipMaxX < param3) {
          var10Lifetime1 = var13 + (var12 * GetCountermeasureLauncherProjectiles.rasterClipMaxX >> 12);
          var8Lifetime1 = GetCountermeasureLauncherProjectiles.rasterClipMaxX;
          if (OpenGlTexture3D.rasterClipMinX > param1) {
            var11Lifetime1 = (OpenGlTexture3D.rasterClipMinX * var12 >> 12) + var13;
            var9Lifetime1 = OpenGlTexture3D.rasterClipMinX;
          } else {
            if (GetCountermeasureLauncherProjectiles.rasterClipMaxX < param1) {
              var11Lifetime1 = var13 + (GetCountermeasureLauncherProjectiles.rasterClipMaxX * var12 >> 12);
              var9Lifetime1 = GetCountermeasureLauncherProjectiles.rasterClipMaxX;
            } else {
              var9Lifetime1 = param1;
              var11Lifetime1 = param4;
            }
          }
          if (NebulaField.rasterClipMinY > var11Lifetime1) {
            var11Lifetime1 = NebulaField.rasterClipMinY;
            var9Lifetime1 = (NebulaField.rasterClipMinY - var13 << 12) / var12;
          } else {
            if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var11Lifetime1) {
              var11Lifetime1 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
              var9Lifetime1 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
            }
          }
          if (NebulaField.rasterClipMinY > var10Lifetime1) {
            var10Lifetime1 = NebulaField.rasterClipMinY;
            var8Lifetime1 = (-var13 + NebulaField.rasterClipMinY << 12) / var12;
          } else {
            if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var10Lifetime1) {
              var8Lifetime1 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
              var10Lifetime1 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
            }
          }
          SetOndamageParticleLife.a(param5, var9Lifetime1, -1, var10Lifetime1, var11Lifetime1, var8Lifetime1);
          return;
        }
        var8Lifetime2 = param3;
        var10Lifetime2 = param0;
        if (OpenGlTexture3D.rasterClipMinX > param1) {
          var11Lifetime2 = (OpenGlTexture3D.rasterClipMinX * var12 >> 12) + var13;
          var9Lifetime2 = OpenGlTexture3D.rasterClipMinX;
          if (NebulaField.rasterClipMinY > var11Lifetime2) {
            var11Lifetime2 = NebulaField.rasterClipMinY;
            var9Lifetime2 = (NebulaField.rasterClipMinY - var13 << 12) / var12;
          } else {
            if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var11Lifetime2) {
              var11Lifetime2 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
              var9Lifetime2 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
            }
          }
          if (NebulaField.rasterClipMinY > var10Lifetime2) {
            var10Lifetime2 = NebulaField.rasterClipMinY;
            var8Lifetime2 = (-var13 + NebulaField.rasterClipMinY << 12) / var12;
          } else {
            if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var10Lifetime2) {
              var8Lifetime2 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
              var10Lifetime2 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
            }
          }
          SetOndamageParticleLife.a(param5, var9Lifetime2, -1, var10Lifetime2, var11Lifetime2, var8Lifetime2);
          return;
        }
        if (GetCountermeasureLauncherProjectiles.rasterClipMaxX < param1) {
          var11Lifetime3 = var13 + (GetCountermeasureLauncherProjectiles.rasterClipMaxX * var12 >> 12);
          var9Lifetime3 = GetCountermeasureLauncherProjectiles.rasterClipMaxX;
        } else {
          var9Lifetime3 = param1;
          var11Lifetime3 = param4;
        }
        if (NebulaField.rasterClipMinY > var11Lifetime3) {
          var11Lifetime3 = NebulaField.rasterClipMinY;
          var9Lifetime3 = (NebulaField.rasterClipMinY - var13 << 12) / var12;
        } else {
          if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var11Lifetime3) {
            var11Lifetime3 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
            var9Lifetime3 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
          }
        }
        if (NebulaField.rasterClipMinY > var10Lifetime2) {
          var10Lifetime2 = NebulaField.rasterClipMinY;
          var8Lifetime2 = (-var13 + NebulaField.rasterClipMinY << 12) / var12;
        } else {
          if (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY < var10Lifetime2) {
            var8Lifetime2 = (EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY - var13 << 12) / var12;
            var10Lifetime2 = EnvironmentReflectionGpuMaterialEffect.rasterClipMaxY;
          }
        }
        SetOndamageParticleLife.a(param5, var9Lifetime3, -1, var10Lifetime2, var11Lifetime3, var8Lifetime2);
        return;
    }

    static {
        field_o = true;
    }
}
