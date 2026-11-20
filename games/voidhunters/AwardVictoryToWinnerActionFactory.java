/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwardVictoryToWinnerActionFactory implements GameStateFactory {
    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) 35);
          return (SerializableGameState[]) ((Object) new AwardVictoryToWinnerAction[param1]);
        }
        return (SerializableGameState[]) ((Object) new AwardVictoryToWinnerAction[param1]);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (-param3 + param0 < OpenGlTexture3D.field_j) {
          SetGrapplingHookMinLength.a(param0, param3, param1, -8, param5, param2, param6);
        } else {
          if (GetCountermeasureLauncherProjectiles.field_o < param0 + param3) {
            SetGrapplingHookMinLength.a(param0, param3, param1, -8, param5, param2, param6);
          } else {
            if (NebulaField.field_c > -param3 + param1) {
              SetGrapplingHookMinLength.a(param0, param3, param1, -8, param5, param2, param6);
            } else {
              if (EnvironmentReflectionGpuMaterialEffect.field_i >= param1 + param3) {
                MandelbrotTextureOperation.a(param2, param5, (byte) -103, param3, param0, param1, param6);
              } else {
                SetGrapplingHookMinLength.a(param0, param3, param1, -8, param5, param2, param6);
              }
            }
          }
        }
        if (param4 != 1523) {
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 17 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new AwardVictoryToWinnerAction());
    }

    static {
    }
}
