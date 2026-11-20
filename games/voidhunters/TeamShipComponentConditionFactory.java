/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeamShipComponentConditionFactory implements GameStateFactory {
    static String field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = -55 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new TeamShipComponentCondition());
    }

    final static boolean a(int param0, DisplayMode param1, DisplayMode param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.width < param1.width) {
            return true;
          }
          if (param1.width == param2.width &&
            param2.height < param1.height) {
            return true;
          }
          if (param0 == -27544) {
            return false;
          }
          field_a = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 < 27) {
          TeamShipComponentConditionFactory.clearSharedReferences((byte) -7);
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) 15);
          return (SerializableGameState[]) ((Object) new TeamShipComponentCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new TeamShipComponentCondition[param1]);
    }

    final static void b(byte param0) {
        int var1;
        int var2;
        var2 = VoidHunters.field_G;
        RemoveEventActionFactory.field_b = false;
        EnvironmentReflectionGpuMaterialEffect.field_j = null;
        if (OpenGlSprite.field_c) {
          SetPointDefenceLaserAimarc.field_o.g(-123);
          if (param0 > 30) {
            return;
          }
          TeamShipComponentConditionFactory.clearSharedReferences((byte) 6);
          return;
        }
        var1 = SetClientSideDragging.field_p;
        if (var1 > 0) {
          if (var1 == 1) {
            EnvironmentReflectionGpuMaterialEffect.field_j = nnb.field_d;
          } else {
            EnvironmentReflectionGpuMaterialEffect.field_j = SetReverbGain.a(OpenGlVertexDeclaration.field_g, new String[]{Integer.toString(var1)}, 119);
          }
          EnvironmentReflectionGpuMaterialEffect.field_j = SetShieldsDirectionalArc.a(0, new CharSequence[]{(CharSequence) ((Object) EnvironmentReflectionGpuMaterialEffect.field_j), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) GetMassDriverProjectileDamage.field_o)});
        }
        SetPointDefenceLaserAimarc.field_o.l((byte) -106);
        gib.a((byte) -89);
        if (param0 > 30) {
          return;
        }
        TeamShipComponentConditionFactory.clearSharedReferences((byte) 6);
        return;
    }

    static {
        field_a = "<%0> wants to join";
    }
}
