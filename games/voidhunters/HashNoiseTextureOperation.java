/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HashNoiseTextureOperation extends TextureOperation {
    static GameStateFactory field_i;
    static String field_j;

    private final int hashCoordinates(int param0, int param1, int param2) {
        if (param2 != 789221) {
          field_j = (String) null;
        }
        int var4 = param1 * 57 + param0;
        var4 = var4 << 1 ^ var4;
        return -((2147483647 & 1376312589 + (789221 + var4 * (var4 * 15731)) * var4) / 262144) + 4096;
    }

    public static void clearSharedReferences(int param0) {
        field_j = null;
        field_i = null;
        if (param0 != 262144) {
          HashNoiseTextureOperation.clearSharedReferences(-121);
        }
    }

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!param1) {
          this.getMonochromeRow(-57, false);
        }
        int[] var7 = this.field_f.getRow((byte) -21, param0);
        int[] var3 = var7;
        if (this.field_f.field_e) {
          var4 = SetSalvoUsesAllEnergy.textureYCoordinates[param0];
          for (var5 = 0; var5 < TextHotspotRegion.textureWidth; var5++) {
            var7[var5] = this.hashCoordinates(BoxBlurTextureOperation.textureXCoordinates[var5], var4, 789221) % 4096;
          }
        }
        return var3;
    }

    public HashNoiseTextureOperation() {
        super(0, true);
    }

    static {
        field_i = (GameStateFactory) ((Object) new VariableConditionFactory());
        field_j = "Type your age in years";
    }
}
