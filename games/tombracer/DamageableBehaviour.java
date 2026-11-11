/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DamageableBehaviour extends Behaviour {
    private int maxStunPoints;
    private FlagSet vulnerabilities;
    private int health;
    private int field_u;
    private FlagSet healingEffectTypes;
    private boolean targetsOwnTrap;
    static String field_x;
    private int stunTicks;
    private int field_p;
    private int maxHealth;
    private int field_q;
    private int field_y;
    private int stunPoints;
    static int[] field_o;

    final FlagSet getVulnerabilities(byte param0) {
        int var2 = -44 / ((-56 - param0) / 45);
        return this.vulnerabilities;
    }

    private final Trap getTargetTrap(int param0) {
        int var2 = -100 / ((48 - param0) / 57);
        if (this.targetsOwnTrap) {
          return this.trap;
        }
        return this.getRoot(6);
    }

    private final void destroyTarget(byte param0) {
        Trap var2 = null;
        Trap var2Lifetime1;
        if (param0 > 54) {
          var2 = this.getTargetTrap(123);
          var2.destroy(2, (byte) 9);
          return;
        }
        this.field_q = 119;
        var2Lifetime1 = this.getTargetTrap(123);
        var2Lifetime1.destroy(2, (byte) 9);
    }

    private final int reactToEffect(int param0, Effect param1) {
        int var3_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.type;
          if (param0 <= 71) {
            stackIn_2_0 = 13;
            return stackIn_2_0;
          }
          if (0 < this.health &&
            this.isVulnerableTo(var3_int, (byte) 10)) {
            this.health = this.health - param1.size;
            if (this.health <= 0) {
              this.destroyTarget((byte) 121);
            } else {
              if (this.stunPoints > 0 &&
                !this.getTargetTrap(-106).isFrozen((byte) -99)) {
                this.stunPoints = this.stunPoints - param1.size;
                if (0 >= this.stunPoints) {
                  this.stunTarget(true);
                }
              }
            }
            stackIn_15_0 = param1.size;
            return stackIn_15_0;
          }
          if (0 < this.health &&
            this.isHealedBy((byte) -94, var3_int)) {
            this.health = this.health + param1.size;
            if (this.health > this.maxHealth) {
              this.health = this.maxHealth;
            }
            stackIn_22_0 = param1.size;
            return stackIn_22_0;
          }
          stackIn_24_0 = 0;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("cu.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void attachToTrap(boolean param0, Trap param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          super.attachToTrap(param0, param1);
          for (var3_int = 0; var3_int < 6; var3_int++) {
            if (this.vulnerabilities.get(0, var3_int) ||
              this.healingEffectTypes.get(0, var3_int)) {
              param1.setHandlesEffectType(26492, true, var3_int);
            }
          }
          this.field_p = this.field_y;
          this.stunPoints = this.maxStunPoints;
          this.field_q = this.field_u;
          this.health = this.maxHealth;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cu.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          return -123;
        }
        return 24;
    }

    private final boolean isVulnerableTo(int param0, byte param1) {
        if (param1 != 10) {
          this.stunPoints = 0;
          return this.vulnerabilities.get(0, param0);
        }
        return this.vulnerabilities.get(0, param0);
    }

    final void setStunParameters(int param0, int param1, int param2, int param3) {
        this.maxStunPoints = param0;
        this.field_y = param1;
        if (param2 < 29) {
          return;
        }
        this.stunTicks = param3;
    }

    private final void stunTarget(boolean param0) {
        if (!param0) {
          return;
        }
        this.stunPoints = this.maxStunPoints;
        this.getTargetTrap(110).setFreezeTicks(this.stunTicks, -127);
    }

    final int onAreaEffect(int param0, int param1, Effect param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -96 / ((param4 - 62) / 52);
          stackIn_1_0 = this.reactToEffect(94, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("cu.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static IndexedSprite loadIndexedSprite(boolean param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (GameApplet.loadSpriteSheet(param0, param1, param3, param2)) {
            return InvertOperator.buildIndexedSprite((byte) 120);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cu.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final void tick(int param0) {
        if (this.field_p > 0) {
          this.field_p = this.field_p - 1;
          if (this.field_p == 0) {
            this.stunPoints = this.stunPoints + 1;
            this.field_p = this.field_y;
            if (this.maxStunPoints < this.stunPoints) {
              this.stunPoints = this.maxStunPoints;
            }
          }
        }
        if (this.field_q > 0) {
          this.field_q = this.field_q - 1;
          if (this.field_q == 0) {
            this.health = this.health + 1;
            this.field_q = this.field_u;
            if (this.health > this.maxHealth) {
              this.health = this.maxHealth;
            }
          }
        }
        if (param0 == 5418) {
          return;
        }
        this.field_q = -100;
    }

    final int onProjectileEffect(int param0, Projectile param1, Effect param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25940) {
            this.vulnerabilities = (FlagSet) null;
          }
          stackIn_3_0 = this.reactToEffect(76, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cu.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -127, !this.targetsOwnTrap ? 0 : 1, 1);
          param1.writeBits((byte) -29, this.maxStunPoints, 8);
          param1.writeBits((byte) -127, this.maxHealth, 8);
          param1.writeBits((byte) -128, this.field_u, 4);
          param1.writeBits((byte) -126, this.field_y, 4);
          param1.writeBits((byte) 107, this.stunTicks, 8);
          this.vulnerabilities.encode(param1, (byte) -120);
          this.healingEffectTypes.encode(param1, (byte) -120);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cu.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    DamageableBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_u = 0;
          this.maxStunPoints = 25;
          this.stunTicks = 25;
          this.maxHealth = 50;
          this.field_y = 10;
          this.targetsOwnTrap = false;
          this.vulnerabilities = new FlagSet(6);
          this.vulnerabilities.set(3, -17075, true);
          this.vulnerabilities.set(0, -17075, true);
          this.healingEffectTypes = new FlagSet(6);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_x = null;
        field_o = null;
        if (param0 != -1) {
          field_x = (String) null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 >= -67) {
          ResourceArchive var4 = (ResourceArchive) null;
          DamageableBehaviour.loadIndexedSprite(true, -98, (ResourceArchive) null, 106);
          if (!(TripBeamComponent.hasAnyMask52(param1, param2, 52) | ((param1 & 458752) != 0 ? true : false))) {
            return C2SChooseRewardPacket.a(true, param1, param2) ? true : false;
          }
          return true;
        }
        if (TripBeamComponent.hasAnyMask52(param1, param2, 52) | ((param1 & 458752) != 0 ? true : false)) {
          return true;
        }
        if (!C2SChooseRewardPacket.a(true, param1, param2)) {
          return false;
        }
        return true;
    }

    final int onBeamEffect(int param0, Effect param1, BeamSegment param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -85) {
            stackIn_4_0 = this.reactToEffect(127, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -55;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("cu.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    DamageableBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.targetsOwnTrap = param1.readBits((byte) 44, 1) == 1 ? true : false;
          this.maxStunPoints = param1.readBits((byte) 44, 8);
          this.maxHealth = param1.readBits((byte) 44, 8);
          this.field_u = param1.readBits((byte) 44, 4);
          this.field_y = param1.readBits((byte) 44, 4);
          this.stunTicks = param1.readBits((byte) 44, 8);
          this.vulnerabilities = new FlagSet(6, param0.formatVersion, param1);
          this.healingEffectTypes = new FlagSet(6, param0.formatVersion, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final boolean isHealedBy(byte param0, int param1) {
        int var3 = -126 / ((19 - param0) / 56);
        return this.healingEffectTypes.get(0, param1);
    }

    final int hashState(int param0, int param1) {
        param0 = CurveOperator.mixHash((byte) 27, param0, this.health);
        if (param1 < -48) {
          param0 = CurveOperator.mixHash((byte) 59, param0, this.stunPoints);
          return param0;
        }
        return 119;
    }

    final void setTargetsOwnTrap(byte param0, boolean param1) {
        if (param0 == 0) {
          this.targetsOwnTrap = param1 ? true : false;
          return;
        }
        this.destroyTarget((byte) -127);
        this.targetsOwnTrap = param1 ? true : false;
    }

    final void setHealthParameters(int param0, int param1, int param2) {
        if (param2 != 0) {
          return;
        }
        this.maxHealth = param1;
        this.field_u = param0;
    }

    static {
        field_x = "Music: ";
    }
}
