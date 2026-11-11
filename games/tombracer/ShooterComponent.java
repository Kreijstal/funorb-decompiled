/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ShooterComponent extends PrefabComponent {
    private boolean randomPhase;
    static String field_G;
    private int timingPatternId;
    private int phaseOffset;

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.timingPatternId = -66;
          return true;
        }
        return true;
    }

    void encode(boolean param0, BitPacketBuffer param1) {
        try {
          if (param0) {
            Room var4 = (Room) null;
            this.applyTimingPattern((byte) -1, (mra) null, (Room) null);
          }
          super.encode(param0, param1);
          if (this.usesTimingPattern(-1)) {
            param1.writeBits((byte) 124, this.timingPatternId, 4);
            if (!this.usesPhaseOffset(-23309)) {
              return;
            }
            if (this.canRandomisePhase(128)) {
              param1.writeBits((byte) 14, !this.randomPhase ? 0 : 1, 1);
            }
            if (!this.randomPhase) {
              param1.writeBits((byte) 104, this.phaseOffset, 4);
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ge.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean usesTimingPattern(int param0);

    abstract boolean usesPhaseOffset(int param0);

    ShooterComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        try {
          if (!this.usesTimingPattern(-1)) {
            return;
          }
          this.timingPatternId = param2.readBits((byte) 44, 4);
          if (this.usesPhaseOffset(-23309)) {
            if (this.canRandomisePhase(128)) {
              this.randomPhase = param2.readBits((byte) 44, 1) == 1 ? true : false;
            }
            if (this.randomPhase) {
              return;
            }
            this.phaseOffset = param2.readBits((byte) 44, 4);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 92) {
          return;
        }
        field_G = null;
    }

    ShooterComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final void addMuzzleLight(Trap param0, int param1, Behaviour param2, int param3) {
        ModelCodec var5 = null;
        LightSourceModel var6 = null;
        try {
          var5 = rm.field_a;
          var6 = (LightSourceModel) (var5.createModel(5, 87));
          var6.a(true, param3);
          var6.b(1, 96);
          var6.setElevationOffset(16, 120);
          var6.a(param1, 0, 1, false);
          param0.addModel(param2, (byte) 124, var6);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ge.CC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void applyTimingPattern(byte param0, mra param1, Room param2) {
        RuntimeException var4 = null;
        IsaacCipher var5 = null;
        Weapon var6 = null;
        int var7 = 0;
        TimingPattern var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 43) {
            return;
          }
          if (!this.usesTimingPattern(param0 - 44)) {
            return;
          }
          var8 = PlatformComponent.createTimingPattern(this.timingPatternId, 23688);
          if (this.usesPhaseOffset(-23309)) {
            if (this.randomPhase) {
              var5 = param2.getRandom(-85);
              this.phaseOffset = var5.nextBounded(16, param0 - 43);
              if (!(param1 instanceof WeaponShooterBehaviour)) {
                var8.setPhaseOffset(false, this.phaseOffset * var8.getTotalDuration((byte) -94) / 16);
                param1.setTimingPattern(102, var8);
                return;
              }
              var6 = ((WeaponShooterBehaviour) (param1)).getWeapon(-2);
              if (var6 != null) {
                var7 = var6.getFireCooldown(true);
                if (var7 > 0) {
                  var6.setCooldown(var5.nextBounded(var7, 0), false);
                }
              }
            }
            var8.setPhaseOffset(false, this.phaseOffset * var8.getTotalDuration((byte) -94) / 16);
          }
          param1.setTimingPattern(102, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ge.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean hasRandomPhase(byte param0) {
        if (param0 < 64) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
          return this.randomPhase;
        }
        return this.randomPhase;
    }

    abstract boolean canRandomisePhase(int param0);

    final boolean storesInitialOnBit(int param0) {
        if (param0 != 6) {
          return false;
        }
        return true;
    }

    static {
        field_G = "Report abuse";
    }
}
