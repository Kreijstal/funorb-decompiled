/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LaunchFightersOrderDefinition extends SpecialOrderDefinition {
    static int field_d;

    LaunchFightersOrderDefinition() {
    }

    final static Sprite[] createBeveledSpriteTiles(int param0, int param1, int param2, int param3) {
        if (param2 <= 110) {
          return (Sprite[]) null;
        }
        return BeveledSpriteTileFactory.createBeveledSpriteTiles(param0, param1, 1, param3, true);
    }

    final int getIconId(byte param0) {
        if (param0 <= 79) {
          this.getCooldown((byte) -127);
          return 107;
        }
        return 107;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          field_d = 30;
          return SetPedrosRepairMode.field_p;
        }
        return SetPedrosRepairMode.field_p;
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          field_d = -94;
          return MapClearanceRectangleFactory.field_b;
        }
        return MapClearanceRectangleFactory.field_b;
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          field_d = -16;
          return false;
        }
        return false;
    }

    final static int pollMenuAction(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = VoidHunters.field_G;
        try {
          var1_int = 0;
          if (param0 != -31515) {
            field_d = 3;
          }
          while (UiAngleDial.pollKeyEvent(127)) {
            UiAngleDialRenderer.field_c.updateVerticalSelection((byte) -94);
            if (!UiAngleDialRenderer.field_c.isActivationRequested((byte) -96)) {
              continue;
            }
            var1_int = 1;
          }
          UiAngleDialRenderer.field_c.updatePointerSelection(SetBuildViewAutozoomEndOnAction.hitTestMenuItem(AppletCookieWriter.field_a, param0 ^ -29724, Particle.field_H), 5620, SetBuildViewAutozoomEndOnAction.hitTestMenuItem(OpenGlFaceAttachment.field_b, 3841, PlayerGameData.field_b));
          if (UiAngleDialRenderer.field_c.isActivationRequested((byte) -126)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            0 <= UiAngleDialRenderer.field_c.selectedIndex) {
            var2 = PlayerGameData.field_e[UiAngleDialRenderer.field_c.selectedIndex];
            if (var2 == 2) {
              SetMissionTerrainSpaceProbability.setMessageBoxOpen(false);
            }
          }
          stackIn_15_0 = var2;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1), "vdb.C(" + param0 + ')');
        }
    }

    static {
        field_d = 250;
    }
}
