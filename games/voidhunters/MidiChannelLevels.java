/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiChannelLevels {
    int[] levels;
    static int[] field_b;

    final static void fillRasterRectangleClipped(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          var6_int = IntrusiveNode.clamp(31123, NebulaField.field_c, EnvironmentReflectionGpuMaterialEffect.field_i, param3);
          var7 = IntrusiveNode.clamp(31123, NebulaField.field_c, EnvironmentReflectionGpuMaterialEffect.field_i, param2);
          var8 = IntrusiveNode.clamp(31123, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, param5);
          var9 = IntrusiveNode.clamp(param0 ^ -29743, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, param4);
          for (var10 = var6_int; var7 >= var10; var10++) {
            GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var9, ResourceNode.field_b[var10], (byte) 75, var8);
          }
          if (param0 == -3518) {
            return;
          }
          MidiChannelLevels.clearSharedReferences((byte) 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var6), "cl.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        int var1 = 51 % ((-31 - param0) / 36);
    }

    public MidiChannelLevels() {
        this.levels = new int[16];
    }

    static {
        field_b = new int[8192];
    }
}
