/*
 * Decompiled by CFR-JS 0.4.0.
 */
class WeaponDefinition {
    static boolean field_a;

    final int getProjectileRange(int param0) {
        int var2 = 86 % ((param0 - 55) / 58);
        return this.getProjectileSpeed((byte) -56) * this.getProjectileLifetime((byte) 118);
    }

    int getProjectileVelocityRandomness(byte param0) {
        if (param0 > -12) {
          return 45;
        }
        return 0;
    }

    int getFiringSoundId(boolean param0) {
        if (param0) {
          field_a = true;
          return -1;
        }
        return -1;
    }

    boolean autoTargetsThreats(int param0) {
        if (param0 != -2291) {
          this.getFiringLeeway(62);
          return false;
        }
        return false;
    }

    boolean hasRecoil(byte param0) {
        if (param0 < 18) {
          field_a = true;
          return true;
        }
        return true;
    }

    int getProjectileLifetime(byte param0) {
        int var2 = 66 % ((param0 + 48) / 43);
        return Particle.field_x;
    }

    int getSpinUpSpeed(int param0) {
        if (param0 != 1024) {
          this.getReloadTime((byte) 1);
          return 0;
        }
        return 0;
    }

    int getEnergyCost(int param0) {
        if (param0 != 0) {
          field_a = false;
          return 50;
        }
        return 50;
    }

    int getReloadTime(byte param0) {
        if (param0 <= 0) {
          return -15;
        }
        return 0;
    }

    boolean usesTargetDisplacementVelocity(int param0) {
        int var2 = -12 / ((54 - param0) / 54);
        return false;
    }

    int getAimSpeed(int param0) {
        if (param0 != 0) {
          return -113;
        }
        return 128;
    }

    int getProjectileType(int param0) {
        if (param0 != 0) {
          this.getSpinUpSpeed(-94);
          return 0;
        }
        return 0;
    }

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (GetFighterRepairAmount.field_p != null) {
            GetFighterRepairAmount.field_p.nameSuggestions.setSuggestions(args, 0);
          }
          if (null != OpenGlEnvironmentMappedWaterEffect.field_j) {
            OpenGlEnvironmentMappedWaterEffect.field_j.suggestionsPanel.setSuggestions(args, param1 - 11113);
          }
          if (param1 == 11113) {
            return;
          }
          field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("mfb.U(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getFiringLeeway(int param0) {
        if (param0 != 27918) {
          this.getAimSpeed(84);
          return NebulaFieldFactory.field_b;
        }
        return NebulaFieldFactory.field_b;
    }

    int getMaxSpinSpeed(byte param0) {
        if (param0 <= 27) {
          field_a = true;
          return 0;
        }
        return 0;
    }

    int getProjectileCount(boolean param0) {
        if (param0) {
          String[] var3 = (String[]) null;
          WeaponDefinition.a((String[]) null, 41);
          return 1;
        }
        return 1;
    }

    int getPulseDuration(byte param0) {
        int var2 = 71 % ((param0 - 75) / 46);
        return 0;
    }

    int getProjectileDamage(int param0) {
        if (param0 != 2769) {
          return 83;
        }
        return 5;
    }

    boolean aimsDirectlyAtTarget(boolean param0) {
        if (!param0) {
          field_a = false;
          return false;
        }
        return false;
    }

    boolean hasSustainedPulse(int param0) {
        if (param0 != 1024) {
          return true;
        }
        return false;
    }

    int getProjectileSpeed(byte param0) {
        if (param0 >= -52) {
          this.getPulseDuration((byte) 118);
          return 256;
        }
        return 256;
    }

    int getAimArc(int param0) {
        int var2 = -40 / ((7 - param0) / 47);
        return 1024;
    }

    int getPulseFadeTime(byte param0) {
        if (param0 != -63) {
          field_a = true;
          return 0;
        }
        return 0;
    }

    static {
        field_a = false;
    }
}
