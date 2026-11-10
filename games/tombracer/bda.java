/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends TextureOperator {
    static int field_m;

    final int[] getMonochromeRow(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int[] var8 = this.field_i.a((byte) 66, param1);
        int[] var3 = var8;
        if (this.field_i.field_d) {
          var4 = sj.field_b[param1];
          for (var5 = 0; var5 < ns.field_g; var5++) {
            var8[var5] = this.d(param0 + 1876, ht.field_Fb[var5], var4) % 4096;
          }
        }
        if (param0 != 1) {
          BitPacketBuffer var7 = (BitPacketBuffer) null;
          bda.readBehaviour(true, (byte) 12, (Room) null, (BitPacketBuffer) null);
        }
        return var3;
    }

    final static Behaviour readBehaviour(boolean param0, byte param1, Room param2, BitPacketBuffer param3) {
        ConstantEffectBehaviour stackIn_51_0 = null;
        ConveyorBehaviour stackIn_53_0 = null;
        CrusherBehaviour stackIn_55_0 = null;
        DarknessBehaviour stackIn_57_0 = null;
        BeamShooterBehaviour stackIn_59_0 = null;
        EffectSwitchBehaviour stackIn_61_0 = null;
        PowerUpItemBehaviour stackIn_63_0 = null;
        WeaponItemBehaviour stackIn_65_0 = null;
        PowerDownItemBehaviour stackIn_67_0 = null;
        SimpleConditionBehaviour stackIn_69_0 = null;
        PitBehaviour stackIn_71_0 = null;
        PlatformBehaviour stackIn_73_0 = null;
        SafeZoneBehaviour stackIn_76_0 = null;
        SimpleBlockBehaviour stackIn_78_0 = null;
        PressureSwitchBehaviour stackIn_80_0 = null;
        RandomMazeBehaviour stackIn_82_0 = null;
        SimpleBlockBehaviour stackIn_84_0 = null;
        SimpleActionBehaviour stackIn_86_0 = null;
        SnakePitBehaviour stackIn_88_0 = null;
        SpawnerBehaviour stackIn_90_0 = null;
        TouchSwitchBehaviour stackIn_92_0 = null;
        WeaponShooterBehaviour stackIn_94_0 = null;
        TimeSwitchBehaviour stackIn_96_0 = null;
        PlayerSensorBehaviour stackIn_98_0 = null;
        TextSpewerBehaviour stackIn_100_0 = null;
        DamageableBehaviour stackIn_102_0 = null;
        MiscItemBehaviour stackIn_104_0 = null;
        WindZoneBehaviour stackIn_106_0 = null;
        VortexBehaviour stackIn_108_0 = null;
        PortalBehaviour stackIn_110_0 = null;
        MirrorBehaviour stackIn_112_0 = null;
        TripBeamBehaviour stackIn_114_0 = null;
        FuseBehaviour stackIn_116_0 = null;
        KeyLockBehaviour stackIn_118_0 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_123_2 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        SimpleBlockBehaviour var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param3.readBits((byte) 44, 6);
          var5 = 81 / ((-38 - param1) / 57);
          var6_int = var4_int;
          if (var6_int == 0) {
            stackIn_51_0 = new ConstantEffectBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_51_0);
          }
          if (var6_int == 1) {
            stackIn_53_0 = new ConveyorBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_53_0);
          }
          if (var6_int == 2) {
            stackIn_55_0 = new CrusherBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_55_0);
          }
          if (var6_int == 3) {
            stackIn_57_0 = new DarknessBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_57_0);
          }
          if (var6_int == 4) {
            stackIn_59_0 = new BeamShooterBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_59_0);
          }
          if (var6_int == 18) {
            stackIn_61_0 = new EffectSwitchBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_61_0);
          }
          if (var6_int == 7) {
            stackIn_63_0 = new PowerUpItemBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_63_0);
          }
          if (var6_int == 5) {
            stackIn_65_0 = new WeaponItemBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_65_0);
          }
          if (var6_int == 6) {
            stackIn_67_0 = new PowerDownItemBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_67_0);
          }
          if (var6_int == 13) {
            stackIn_69_0 = new SimpleConditionBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_69_0);
          }
          if (var6_int == 8) {
            stackIn_71_0 = new PitBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_71_0);
          }
          if (var6_int == 9) {
            stackIn_73_0 = new PlatformBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_73_0);
          }
          if (var6_int == 10) {
            if (7 <= param2.formatVersion) {
              stackIn_76_0 = new SafeZoneBehaviour(param2, param3, param0);
              return (Behaviour) ((Object) stackIn_76_0);
            }
            var6 = new SimpleBlockBehaviour(param2, param0);
            stackIn_78_0 = var6;
            return (Behaviour) ((Object) stackIn_78_0);
          }
          if (var6_int == 17) {
            stackIn_80_0 = new PressureSwitchBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_80_0);
          }
          if (11 == var6_int) {
            stackIn_82_0 = new RandomMazeBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_82_0);
          }
          if (var6_int == 12) {
            stackIn_84_0 = new SimpleBlockBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_84_0);
          }
          if (var6_int == 14) {
            stackIn_86_0 = new SimpleActionBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_86_0);
          }
          if (var6_int == 15) {
            stackIn_88_0 = new SnakePitBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_88_0);
          }
          if (var6_int == 16) {
            stackIn_90_0 = new SpawnerBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_90_0);
          }
          if (var6_int == 19) {
            stackIn_92_0 = new TouchSwitchBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_92_0);
          }
          if (var6_int == 20) {
            stackIn_94_0 = new WeaponShooterBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_94_0);
          }
          if (21 == var6_int) {
            stackIn_96_0 = new TimeSwitchBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_96_0);
          }
          if (var6_int == 22) {
            stackIn_98_0 = new PlayerSensorBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_98_0);
          }
          if (23 == var6_int) {
            stackIn_100_0 = new TextSpewerBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_100_0);
          }
          if (var6_int == 24) {
            stackIn_102_0 = new DamageableBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_102_0);
          }
          if (var6_int == 25) {
            stackIn_104_0 = new MiscItemBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_104_0);
          }
          if (var6_int == 26) {
            stackIn_106_0 = new WindZoneBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_106_0);
          }
          if (27 == var6_int) {
            stackIn_108_0 = new VortexBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_108_0);
          }
          if (var6_int == 28) {
            stackIn_110_0 = new PortalBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_110_0);
          }
          if (var6_int == 29) {
            stackIn_112_0 = new MirrorBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_112_0);
          }
          if (var6_int == 30) {
            stackIn_114_0 = new TripBeamBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_114_0);
          }
          if (var6_int == 31) {
            stackIn_116_0 = new FuseBehaviour(param2, param3, param0);
            return (Behaviour) ((Object) stackIn_116_0);
          }
          if (32 != var6_int) {
            throw new IllegalStateException("Unrecognised behaviour type: " + var4_int);
          }
          stackIn_118_0 = new KeyLockBehaviour(param2, param3, param0);
          return (Behaviour) ((Object) stackIn_118_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_122_0 = var4;
          stackIn_122_1 = new StringBuilder().append("bda.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_123_2 = "null";
          } else {
            stackIn_123_2 = "{...}";
          }
          stackIn_125_1 = ((StringBuilder) (Object) stackIn_122_1).append(stackIn_123_2).append(',');
          if (param3 == null) {
            stackIn_126_2 = "null";
          } else {
            stackIn_126_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_122_0), ((StringBuilder) (Object) stackIn_125_1).append(stackIn_126_2).append(')').toString());
        }
    }

    public bda() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        if (param0 != 1877) {
          field_m = -3;
        }
        int var4 = param1 + param2 * 57;
        var4 = var4 << 1 ^ var4;
        return 4096 - (2147483647 & 1376312589 + (var4 * (var4 * 15731) + 789221) * var4) / 262144;
    }

    static {
        field_m = 50;
    }
}
