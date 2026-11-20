/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointDefenceLaserWeaponDefinition extends WeaponDefinition {
    static EmailValidationError invalidEmailSyntaxError;
    static java.awt.Frame field_c;

    PointDefenceLaserWeaponDefinition() {
    }

    final boolean hasRecoil(byte param0) {
        if (param0 <= 18) {
          this.getFiringSoundId(false);
          return false;
        }
        return false;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          return 72;
        }
        return FullscreenMembershipDialog.field_J;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          invalidEmailSyntaxError = (EmailValidationError) null;
          return 41;
        }
        return 41;
    }

    final int getAimArc(int param0) {
        int var2 = -55 / ((7 - param0) / 47);
        return GetMaxShipSize.field_o;
    }

    final int getReloadTime(byte param0) {
        if (param0 < 0) {
          field_c = (java.awt.Frame) null;
          return GetFighterRepairAmount.field_o;
        }
        return GetFighterRepairAmount.field_o;
    }

    final boolean usesTargetDisplacementVelocity(int param0) {
        int var2 = -111 / ((param0 - 54) / 54);
        return true;
    }

    public static void clearSharedReferences(int param0) {
        invalidEmailSyntaxError = null;
        field_c = null;
        if (param0 != 17036) {
          String var2 = (String) null;
          PointDefenceLaserWeaponDefinition.isPrivateChatTargetAvailable(25L, (String) null, -89);
        }
    }

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          this.getPulseDuration((byte) -16);
          return GetMissionResnetResourceTickTime.field_o;
        }
        return GetMissionResnetResourceTickTime.field_o;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 > -12) {
          this.getProjectileSpeed((byte) -91);
          return GetRadialMenuRadius.field_p;
        }
        return GetRadialMenuRadius.field_p;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          return -72;
        }
        return 3;
    }

    final int getPulseDuration(byte param0) {
        int var2 = -86 % ((param0 - 75) / 46);
        return VariableConditionFactory.field_a;
    }

    final static boolean isPrivateChatTargetAvailable(long param0, String param1, int param2) {
        SocialListEntry var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = FlipTextureOperation.a(param1, 0);
          if (param2 != 41) {
            var5 = (String) null;
            PointDefenceLaserWeaponDefinition.isPrivateChatTargetAvailable(1L, (String) null, 31);
          }
          if (var4 != null &&
            null != var4.field_Ab) {
            return true;
          }
          stackIn_11_0 = (null != SetSpinningBladeSpindamageMultiplier.field_o) && (null != ScrollBarWidget.a(param0, true));
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("ira.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          return 6;
        }
        return GetAngularForceDownshift.field_q;
    }

    final boolean autoTargetsThreats(int param0) {
        if (param0 != -2291) {
          invalidEmailSyntaxError = (EmailValidationError) null;
          return true;
        }
        return true;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 >= -52) {
          invalidEmailSyntaxError = (EmailValidationError) null;
          return SetShipPersistence.field_s;
        }
        return SetShipPersistence.field_s;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          return -95;
        }
        return OpenGlGlyphMask.field_e;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = 106 % ((param0 + 48) / 43);
        return 1;
    }

    static {
        invalidEmailSyntaxError = new EmailValidationError();
    }
}
