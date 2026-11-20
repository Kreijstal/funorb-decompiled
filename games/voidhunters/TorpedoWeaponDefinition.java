/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TorpedoWeaponDefinition extends WeaponDefinition {
    static String field_d;
    static Hashtable preferences;
    static String[] field_c;
    static String field_b;

    final int getEnergyCost(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
          return SetLaserAimarc.field_o;
        }
        return SetLaserAimarc.field_o;
    }

    final int getAimSpeed(int param0) {
        if (param0 != 0) {
          preferences = (Hashtable) null;
          return OpenGlUnderwaterMaterialEffect.field_n;
        }
        return OpenGlUnderwaterMaterialEffect.field_n;
    }

    public static void clearSharedReferences(byte param0) {
        field_d = null;
        if (param0 != 75) {
          return;
        }
        preferences = null;
        field_b = null;
        field_c = null;
    }

    final int getReloadTime(byte param0) {
        if (param0 <= 0) {
          field_b = (String) null;
          return GetPhysicsCollisionGrapplingHookForceMultiplier.field_o;
        }
        return GetPhysicsCollisionGrapplingHookForceMultiplier.field_o;
    }

    final int getProjectileType(int param0) {
        if (param0 != 0) {
          return 98;
        }
        return 1;
    }

    final int getProjectileCount(boolean param0) {
        if (param0) {
          this.getAimArc(23);
          return GetLagStandardDeviationIn.field_p;
        }
        return GetLagStandardDeviationIn.field_p;
    }

    final int getAimArc(int param0) {
        int var2 = 57 % ((7 - param0) / 47);
        return OpenGlVertexNormal.field_i;
    }

    final int getProjectileSpeed(byte param0) {
        if (param0 >= -52) {
          this.getFiringSoundId(true);
          return SetArmageddonLength.field_p;
        }
        return SetArmageddonLength.field_p;
    }

    final int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          return 46;
        }
        return QuickChatPhraseLoader.field_b;
    }

    final int getFiringSoundId(boolean param0) {
        if (param0) {
          this.getReloadTime((byte) -9);
          return 3;
        }
        return 3;
    }

    final int getProjectileLifetime(byte param0) {
        int var2 = 126 % ((-48 - param0) / 43);
        return SetGrapplingHookRopeChangeRate.field_o;
    }

    final int getProjectileVelocityRandomness(byte param0) {
        if (param0 >= -12) {
          preferences = (Hashtable) null;
          return GetBombletSprayProjectileDamage.field_p;
        }
        return GetBombletSprayProjectileDamage.field_p;
    }

    TorpedoWeaponDefinition() {
    }

    static {
        field_c = new String[]{"Level editing", "Events", "Conditions", "Actions", "Event editing", "Map zones & Res nodes", "Misc", "Chassis", "Thrusters", "Basic weapons", "Advanced weapons", "Arms", "Hull pieces", "Defences", "Special"};
        field_b = "Waiting for fonts";
        field_d = "Weapon Energy";
        preferences = new Hashtable();
    }
}
