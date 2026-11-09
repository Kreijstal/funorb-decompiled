/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextureGeneratorNode extends IntrusiveNode {
    static String defeatText;
    static int musicVolume;

    final static Sprite[] loadOpaqueSprites(byte guard, int groupId, ResourceArchive archive, int fileId) {
        RuntimeException var4 = null;
        Sprite[] stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!SpriteSheetSupport.decodeSpriteSheet(archive, groupId, fileId, -23046)) {
            return null;
          }
          if (guard <= -79) {
            stackIn_7_0 = DisplaySizeController.takeDecodedOpaqueSprites(255);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tt.J(").append(guard).append(',').append(groupId).append(',');
          if (archive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(fileId).append(')').toString());
        }
    }

    final static void restoreUpgradeAllocation(int guard) {
        if (guard == 30692) {
          ResourceArchive.selectedSpeedLevel = PasswordInputRenderer.upgradeAllocation[0];
          LegacyOpenGlEffectManager.selectedTractionLevel = PasswordInputRenderer.upgradeAllocation[1];
          hc.selectedBounceLevel = PasswordInputRenderer.upgradeAllocation[2];
          return;
        }
        defeatText = (String) null;
        ResourceArchive.selectedSpeedLevel = PasswordInputRenderer.upgradeAllocation[0];
        LegacyOpenGlEffectManager.selectedTractionLevel = PasswordInputRenderer.upgradeAllocation[1];
        hc.selectedBounceLevel = PasswordInputRenderer.upgradeAllocation[2];
    }

    public static void releaseStatics(boolean param0) {
        defeatText = null;
        if (!param0) {
          defeatText = (String) null;
        }
    }

    TextureGeneratorNode(int unusedInputCount, boolean unusedFlag) {
    }

    final static int brightDroneTypeColor(byte guard, int type) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var2Lifetime4;
        if (guard >= -127) {
          musicVolume = -86;
          var3 = type;
          if (var3 != 6) {
            if (var3 == 7) {
              var2 = UiStyleNode.droneTypeColor(-26346, 0);
            } else {
              var2 = UiStyleNode.droneTypeColor(-26346, type);
            }
            return ((8388607 ^ var2 >> 1) & 8355711) + var2;
          }
          var2Lifetime4 = UiStyleNode.droneTypeColor(-26346, 0);
          return ((8388607 ^ var2Lifetime4 >> 1) & 8355711) + var2Lifetime4;
        }
        var3Lifetime1 = type;
        if (var3Lifetime1 == 6) {
          var2Lifetime1 = UiStyleNode.droneTypeColor(-26346, 0);
          return ((8388607 ^ var2Lifetime1 >> 1) & 8355711) + var2Lifetime1;
        }
        if (var3Lifetime1 != 7) {
          var2Lifetime2 = UiStyleNode.droneTypeColor(-26346, type);
          return ((8388607 ^ var2Lifetime2 >> 1) & 8355711) + var2Lifetime2;
        }
        var2Lifetime3 = UiStyleNode.droneTypeColor(-26346, 0);
        return ((8388607 ^ var2Lifetime3 >> 1) & 8355711) + var2Lifetime3;
    }

    static {
        defeatText = "DEFEAT.";
        musicVolume = 256;
    }
}
