/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureLineShape extends TextureRasterShape {
    private int endX;
    private int startX;
    private int startY;
    static BufferedSocket pendingArchiveSocket;
    static GameResourceLoader field_i;
    private int endY;

    final void drawFilledAndOutline(int param0, byte param1, int param2) {
        if (param1 != 110) {
          this.startY = -72;
        }
    }

    final static boolean isLoginUiReady(boolean param0) {
        if (!param0) {
          TextureLineShape.isLoginUiReady(true);
          if (GetSpinningBladeAimspeed.field_q < 10) {
            return false;
          }
          if (UiDraggableContainer.field_z >= 13) {
            return true;
          }
          return false;
        }
        if (GetSpinningBladeAimspeed.field_q < 10) {
          return false;
        }
        if (UiDraggableContainer.field_z >= 13) {
          return true;
        }
        return false;
    }

    final static int sinAngle(int param0, int param1) {
        if (param1 <= 36) {
          return 103;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return 6144 <= param0 ? -FixedPointTrigonometry.quarterSine[8192 - param0] : -FixedPointTrigonometry.quarterSine[param0 - 4096];
        }
        return 2048 > param0 ? FixedPointTrigonometry.quarterSine[param0] : FixedPointTrigonometry.quarterSine[-param0 + 4096];
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 30826) {
          pendingArchiveSocket = (BufferedSocket) null;
          field_i = null;
          pendingArchiveSocket = null;
          return;
        }
        field_i = null;
        pendingArchiveSocket = null;
    }

    final void drawFilled(byte param0, int param1, int param2) {
        if (param0 != -112) {
          this.startX = 94;
        }
    }

    TextureLineShape(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.startY = param1;
        this.endY = param3;
        this.endX = param2;
        this.startX = param0;
    }

    final static void configureNativeLibraryPlatform(PlatformService param0, byte param1, ResourceArchive param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          SetSniperCannonEnergyUsed.field_p = "";
          SetExplosionPushMultiplier.field_q = param2;
          MessageLog.field_c = param0;
          if (MessageFactory.field_b.startsWith("win")) {
            SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "windows/";
          } else {
            if (MessageFactory.field_b.startsWith("linux")) {
              SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "linux/";
            } else {
              if (MessageFactory.field_b.startsWith("mac")) {
                SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "macos/";
              }
            }
          }
          var3_int = -92 % ((param1 - 67) / 49);
          if (MessageLog.field_c.microsoftJvm) {
            SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "msjava/";
            return;
          }
          if (!MessageFactory.field_a.startsWith("amd64") &&
            !MessageFactory.field_a.startsWith("x86_64")) {
            if (!MessageFactory.field_a.startsWith("i386") &&
              !MessageFactory.field_a.startsWith("i486") &&
              !MessageFactory.field_a.startsWith("i586") &&
              !MessageFactory.field_a.startsWith("x86")) {
              if (MessageFactory.field_a.startsWith("ppc")) {
                SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "ppc/";
                return;
              }
              SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "universal/";
              return;
            }
            SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "x86/";
            return;
          }
          SetSniperCannonEnergyUsed.field_p = SetSniperCannonEnergyUsed.field_p + "x86_64/";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("eu.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void drawOutline(byte param0, int param1, int param2) {
        int var4 = param2 * this.startX >> 12;
        int var5 = this.endX * param2 >> 12;
        int var6 = param1 * this.startY >> 12;
        int var7 = param1 * this.endY >> 12;
        GetBurstFireMaxEnergy.a(var6, var5, (byte) 84, var4, var7, this.outlineColor);
        int var8 = -73 / ((param0 + 48) / 40);
    }

    static {
    }
}
