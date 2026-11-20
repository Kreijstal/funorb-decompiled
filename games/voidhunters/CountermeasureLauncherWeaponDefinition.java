/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CountermeasureLauncherWeaponDefinition extends WeaponDefinition {
    static Random field_b;
    static int[] field_c;

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          this.getFiringSoundId(true);
          return GpuModelFlagChecks.field_a;
        }
        return GpuModelFlagChecks.field_a;
    }

    final int getAimArc(int param0) {
        int var2 = 63 % ((7 - param0) / 47);
        return LegacyOpenGlTextureCache.field_e;
    }

    final boolean hasRecoil(byte param0) {
        if (param0 < 18) {
          return false;
        }
        return false;
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          field_b = (Random) null;
          return GetShieldsDirectionalRadius.field_p;
        }
        return GetShieldsDirectionalRadius.field_p;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = -96 / ((-48 - param0) / 43);
        return OpenGlIndexBuffer.field_j;
    }

    final int getReloadTime(byte param0) {
        if (param0 < 0) {
          return 34;
        }
        return Particle.field_a;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          this.getProjectileType(108);
          return 6;
        }
        return 6;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          this.hasRecoil((byte) 61);
          return 71;
        }
        return 71;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 >= -52) {
          return -93;
        }
        return SetMissileLauncherEnergyUsed.field_o;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          String var3 = (String) null;
          CountermeasureLauncherWeaponDefinition.canOpenQuickChatPhraseMenu(31, (int[]) null, 36L, (String) null, (byte) 17);
          return RenderResourceNode.field_k;
        }
        return RenderResourceNode.field_k;
    }

    CountermeasureLauncherWeaponDefinition() {
    }

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        int var1 = 29 % ((14 - param0) / 44);
        field_b = null;
    }

    final static boolean canOpenQuickChatPhraseMenu(int param0, int[] param1, long param2, String param3, byte param4) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -3) {
            field_b = (Random) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null && (param0 != 2 ||
            PointDefenceLaserWeaponDefinition.isPrivateChatTargetAvailable(param2, param3, 41))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("jeb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 >= -12) {
          field_c = (int[]) null;
          return TextureBezierShape.field_f;
        }
        return TextureBezierShape.field_f;
    }

    static {
        field_b = new Random();
    }
}
