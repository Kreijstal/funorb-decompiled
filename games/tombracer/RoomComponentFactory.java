/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoomComponentFactory implements RoomComponentCodec {
    static int field_b;
    static float[] field_a;

    public final RoomComponent readComponent(BitPacketBuffer param0, int param1, Room param2) {
        RuntimeException var4 = null;
        RoomComponent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 55) {
            field_a = (float[]) null;
          }
          stackIn_3_0 = this.readComponent(param0, param2, (byte) -7, (RoomComponent) null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rn.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public RoomComponentFactory() {
        dsa.componentTypeNames = new String[63];
        dsa.componentTypeNames[46] = "Rope Bridge, Horizontal";
        dsa.componentTypeNames[57] = "Fragile Block";
        dsa.componentTypeNames[59] = "Fixed Mirror";
        dsa.componentTypeNames[58] = "Boulder";
        dsa.componentTypeNames[7] = "Brazier";
        dsa.componentTypeNames[61] = "Maze: All Platforms";
        dsa.componentTypeNames[40] = "Plant, Grassy";
        dsa.componentTypeNames[28] = "Blade Shooter";
        dsa.componentTypeNames[13] = "Item: Key";
        dsa.componentTypeNames[42] = "Tracking Crusher";
        dsa.componentTypeNames[21] = "Door 4x1";
        dsa.componentTypeNames[48] = "Item: Revolver";
        dsa.componentTypeNames[22] = "Key Switch";
        dsa.componentTypeNames[5] = "Portal";
        dsa.componentTypeNames[45] = "Empty Doorway 4x1";
        dsa.componentTypeNames[47] = "Rope Bridge, Vertical";
        dsa.componentTypeNames[34] = "Track X Mount";
        dsa.componentTypeNames[9] = "Gas Trap";
        dsa.componentTypeNames[19] = "Pushable Mirror";
        dsa.componentTypeNames[30] = "Rotater Mount";
        dsa.componentTypeNames[24] = "Cauldron";
        dsa.componentTypeNames[15] = "Moving Wall";
        dsa.componentTypeNames[36] = "Simple Hover Mount";
        dsa.componentTypeNames[3] = "Pressure Switch 1x1";
        dsa.componentTypeNames[41] = "Plant, Flower";
        dsa.componentTypeNames[12] = "Item: Idol";
        dsa.componentTypeNames[17] = "Moving Platform";
        dsa.componentTypeNames[38] = "Plant, Green";
        dsa.componentTypeNames[32] = "Sweeper-180 Mount";
        dsa.componentTypeNames[18] = "Pillar";
        dsa.componentTypeNames[62] = "Wall Crusher";
        dsa.componentTypeNames[53] = "White Light Sensor";
        dsa.componentTypeNames[0] = "Pushable Block";
        dsa.componentTypeNames[23] = "Trip Beam";
        dsa.componentTypeNames[49] = "Pushable Block 2x2";
        dsa.componentTypeNames[25] = "Arrow Shooter";
        dsa.componentTypeNames[29] = "Wheeled Mount";
        dsa.componentTypeNames[31] = "Sweeper-90 Mount";
        dsa.componentTypeNames[52] = "White Light Shooter";
        dsa.componentTypeNames[51] = "Maze: Pushable Blocks";
        dsa.componentTypeNames[8] = "Moving Saw";
        dsa.componentTypeNames[4] = "Pressure Switch 2x2";
        dsa.componentTypeNames[44] = "Empty Doorway 3x1";
        dsa.componentTypeNames[33] = "Face Player Mount";
        dsa.componentTypeNames[55] = "Pressure Switch Y";
        dsa.componentTypeNames[2] = "Pit o' Doom";
        dsa.componentTypeNames[35] = "Track Y Mount";
        dsa.componentTypeNames[14] = "Skeleton";
        dsa.componentTypeNames[16] = "Platform";
        dsa.componentTypeNames[6] = "Torch";
        dsa.componentTypeNames[39] = "Plant, Red";
        dsa.componentTypeNames[37] = "Pushable Mount";
        dsa.componentTypeNames[1] = "Snake Pit";
        dsa.componentTypeNames[60] = "Hidden Platform";
        dsa.componentTypeNames[50] = "Maze: Platforms";
        dsa.componentTypeNames[20] = "Door 3x1";
        dsa.componentTypeNames[56] = "Invisible Touch Switch";
        dsa.componentTypeNames[54] = "Pressure Switch X";
        dsa.componentTypeNames[10] = "Item: Coin";
        dsa.componentTypeNames[26] = "Laser Shooter";
        dsa.componentTypeNames[11] = "Item: Coin Bag";
        dsa.componentTypeNames[43] = "Static Crusher";
        dsa.componentTypeNames[27] = "Flame Shooter";
    }

    public static void a(byte param0) {
        if (param0 >= -103) {
          RoomComponentFactory.a(8);
        }
        field_a = null;
    }

    private final RoomComponent createComponent(int param0, Room param1, int param2) {
        RoomComponent stackIn_3_0 = null;
        BlockComponent stackIn_102_0 = null;
        SnakePitComponent stackIn_104_0 = null;
        PitComponent stackIn_106_0 = null;
        PressureSwitchComponent stackIn_108_0 = null;
        PressureSwitchComponent stackIn_110_0 = null;
        PortalComponent stackIn_112_0 = null;
        TorchComponent stackIn_114_0 = null;
        BrazierComponent stackIn_116_0 = null;
        MovingSawComponent stackIn_118_0 = null;
        GasTrapComponent stackIn_120_0 = null;
        CoinItemComponent stackIn_122_0 = null;
        CoinBagItemComponent stackIn_124_0 = null;
        IdolItemComponent stackIn_126_0 = null;
        KeyItemComponent stackIn_128_0 = null;
        SkeletonComponent stackIn_130_0 = null;
        MovingWallComponent stackIn_132_0 = null;
        PlatformComponent stackIn_134_0 = null;
        MovingPlatformComponent stackIn_136_0 = null;
        PillarComponent stackIn_138_0 = null;
        MirrorComponent stackIn_140_0 = null;
        DoorwayComponent stackIn_142_0 = null;
        DoorwayComponent stackIn_144_0 = null;
        KeySwitchComponent stackIn_146_0 = null;
        TripBeamComponent stackIn_148_0 = null;
        CauldronComponent stackIn_150_0 = null;
        ArrowShooterComponent stackIn_152_0 = null;
        LaserShooterComponent stackIn_154_0 = null;
        FlameShooterComponent stackIn_156_0 = null;
        BladeShooterComponent stackIn_158_0 = null;
        WheeledMountComponent stackIn_160_0 = null;
        RotaterMountComponent stackIn_162_0 = null;
        SweeperMountComponent stackIn_164_0 = null;
        SweeperMountComponent stackIn_166_0 = null;
        FacePlayerMountComponent stackIn_168_0 = null;
        TrackMountComponent stackIn_170_0 = null;
        TrackMountComponent stackIn_172_0 = null;
        SimpleHoverMountComponent stackIn_174_0 = null;
        PushableMountComponent stackIn_176_0 = null;
        PlantComponent stackIn_178_0 = null;
        PlantComponent stackIn_180_0 = null;
        PlantComponent stackIn_182_0 = null;
        PlantComponent stackIn_184_0 = null;
        TrackingCrusherComponent stackIn_186_0 = null;
        StaticCrusherComponent stackIn_188_0 = null;
        DoorwayComponent stackIn_190_0 = null;
        DoorwayComponent stackIn_192_0 = null;
        RopeBridgeComponent stackIn_194_0 = null;
        RopeBridgeComponent stackIn_196_0 = null;
        RevolverItemComponent stackIn_198_0 = null;
        BlockComponent stackIn_200_0 = null;
        PlatformMazeComponent stackIn_202_0 = null;
        PushableBlockMazeComponent stackIn_204_0 = null;
        WhiteLightShooterComponent stackIn_206_0 = null;
        WhiteLightSensorComponent stackIn_208_0 = null;
        PressureSwitchComponent stackIn_210_0 = null;
        PressureSwitchComponent stackIn_212_0 = null;
        InvisibleTouchSwitchComponent stackIn_214_0 = null;
        BlockComponent stackIn_216_0 = null;
        BoulderComponent stackIn_218_0 = null;
        MirrorComponent stackIn_220_0 = null;
        PlatformComponent stackIn_222_0 = null;
        AllPlatformsMazeComponent stackIn_224_0 = null;
        WallCrusherComponent stackIn_226_0 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        String stackIn_231_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -29748) {
            stackIn_3_0 = (RoomComponent) null;
            return stackIn_3_0;
          }
          var4_int = param2;
          if (var4_int == 0) {
            stackIn_102_0 = new BlockComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_102_0);
          }
          if (var4_int == 1) {
            stackIn_104_0 = new SnakePitComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_104_0);
          }
          if (var4_int == 2) {
            stackIn_106_0 = new PitComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_106_0);
          }
          if (3 == var4_int) {
            stackIn_108_0 = new PressureSwitchComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_108_0);
          }
          if (var4_int == 4) {
            stackIn_110_0 = new PressureSwitchComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_110_0);
          }
          if (5 == var4_int) {
            stackIn_112_0 = new PortalComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_112_0);
          }
          if (6 == var4_int) {
            stackIn_114_0 = new TorchComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_114_0);
          }
          if (var4_int == 7) {
            stackIn_116_0 = new BrazierComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_116_0);
          }
          if (var4_int == 8) {
            stackIn_118_0 = new MovingSawComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_118_0);
          }
          if (var4_int == 9) {
            stackIn_120_0 = new GasTrapComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_120_0);
          }
          if (var4_int == 10) {
            stackIn_122_0 = new CoinItemComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_122_0);
          }
          if (var4_int == 11) {
            stackIn_124_0 = new CoinBagItemComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_124_0);
          }
          if (var4_int == 12) {
            stackIn_126_0 = new IdolItemComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_126_0);
          }
          if (var4_int == 13) {
            stackIn_128_0 = new KeyItemComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_128_0);
          }
          if (var4_int == 14) {
            stackIn_130_0 = new SkeletonComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_130_0);
          }
          if (var4_int == 15) {
            stackIn_132_0 = new MovingWallComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_132_0);
          }
          if (var4_int == 16) {
            stackIn_134_0 = new PlatformComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_134_0);
          }
          if (var4_int == 17) {
            stackIn_136_0 = new MovingPlatformComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_136_0);
          }
          if (var4_int == 18) {
            stackIn_138_0 = new PillarComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_138_0);
          }
          if (19 == var4_int) {
            stackIn_140_0 = new MirrorComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_140_0);
          }
          if (var4_int == 20) {
            stackIn_142_0 = new DoorwayComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_142_0);
          }
          if (var4_int == 21) {
            stackIn_144_0 = new DoorwayComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_144_0);
          }
          if (22 == var4_int) {
            stackIn_146_0 = new KeySwitchComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_146_0);
          }
          if (var4_int == 23) {
            stackIn_148_0 = new TripBeamComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_148_0);
          }
          if (24 == var4_int) {
            stackIn_150_0 = new CauldronComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_150_0);
          }
          if (25 == var4_int) {
            stackIn_152_0 = new ArrowShooterComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_152_0);
          }
          if (var4_int == 26) {
            stackIn_154_0 = new LaserShooterComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_154_0);
          }
          if (27 == var4_int) {
            stackIn_156_0 = new FlameShooterComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_156_0);
          }
          if (var4_int == 28) {
            stackIn_158_0 = new BladeShooterComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_158_0);
          }
          if (29 == var4_int) {
            stackIn_160_0 = new WheeledMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_160_0);
          }
          if (var4_int == 30) {
            stackIn_162_0 = new RotaterMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_162_0);
          }
          if (var4_int == 31) {
            stackIn_164_0 = new SweeperMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_164_0);
          }
          if (32 == var4_int) {
            stackIn_166_0 = new SweeperMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_166_0);
          }
          if (var4_int == 33) {
            stackIn_168_0 = new FacePlayerMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_168_0);
          }
          if (var4_int == 34) {
            stackIn_170_0 = new TrackMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_170_0);
          }
          if (35 == var4_int) {
            stackIn_172_0 = new TrackMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_172_0);
          }
          if (var4_int == 36) {
            stackIn_174_0 = new SimpleHoverMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_174_0);
          }
          if (var4_int == 37) {
            stackIn_176_0 = new PushableMountComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_176_0);
          }
          if (var4_int == 38) {
            stackIn_178_0 = new PlantComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_178_0);
          }
          if (39 == var4_int) {
            stackIn_180_0 = new PlantComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_180_0);
          }
          if (var4_int == 40) {
            stackIn_182_0 = new PlantComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_182_0);
          }
          if (var4_int == 41) {
            stackIn_184_0 = new PlantComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_184_0);
          }
          if (var4_int == 42) {
            stackIn_186_0 = new TrackingCrusherComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_186_0);
          }
          if (var4_int == 43) {
            stackIn_188_0 = new StaticCrusherComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_188_0);
          }
          if (var4_int == 44) {
            stackIn_190_0 = new DoorwayComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_190_0);
          }
          if (var4_int == 45) {
            stackIn_192_0 = new DoorwayComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_192_0);
          }
          if (var4_int == 46) {
            stackIn_194_0 = new RopeBridgeComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_194_0);
          }
          if (var4_int == 47) {
            stackIn_196_0 = new RopeBridgeComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_196_0);
          }
          if (48 == var4_int) {
            stackIn_198_0 = new RevolverItemComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_198_0);
          }
          if (var4_int == 49) {
            stackIn_200_0 = new BlockComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_200_0);
          }
          if (var4_int == 50) {
            stackIn_202_0 = new PlatformMazeComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_202_0);
          }
          if (var4_int == 51) {
            stackIn_204_0 = new PushableBlockMazeComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_204_0);
          }
          if (var4_int == 52) {
            stackIn_206_0 = new WhiteLightShooterComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_206_0);
          }
          if (var4_int == 53) {
            stackIn_208_0 = new WhiteLightSensorComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_208_0);
          }
          if (var4_int == 54) {
            stackIn_210_0 = new PressureSwitchComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_210_0);
          }
          if (55 == var4_int) {
            stackIn_212_0 = new PressureSwitchComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_212_0);
          }
          if (56 == var4_int) {
            stackIn_214_0 = new InvisibleTouchSwitchComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_214_0);
          }
          if (var4_int == 57) {
            stackIn_216_0 = new BlockComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_216_0);
          }
          if (58 == var4_int) {
            stackIn_218_0 = new BoulderComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_218_0);
          }
          if (59 == var4_int) {
            stackIn_220_0 = new MirrorComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_220_0);
          }
          if (var4_int == 60) {
            stackIn_222_0 = new PlatformComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_222_0);
          }
          if (var4_int == 61) {
            stackIn_224_0 = new AllPlatformsMazeComponent(param1, param2);
            return (RoomComponent) ((Object) stackIn_224_0);
          }
          if (var4_int != 62) {
            throw new IllegalStateException("Unrecognised component type: " + param2);
          }
          stackIn_226_0 = new WallCrusherComponent(param1, param2);
          return (RoomComponent) ((Object) stackIn_226_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_230_0 = var4;
          stackIn_230_1 = new StringBuilder().append("rn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_231_2 = "null";
          } else {
            stackIn_231_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_230_0), ((StringBuilder) (Object) stackIn_230_1).append(stackIn_231_2).append(',').append(param2).append(')').toString());
        }
    }

    public final RoomComponent readComponent(BitPacketBuffer param0, Room param1, byte param2, RoomComponent param3) {
        BlockComponent stackIn_102_0 = null;
        SnakePitComponent stackIn_104_0 = null;
        PitComponent stackIn_106_0 = null;
        PressureSwitchComponent stackIn_108_0 = null;
        PressureSwitchComponent stackIn_110_0 = null;
        PortalComponent stackIn_112_0 = null;
        TorchComponent stackIn_114_0 = null;
        BrazierComponent stackIn_116_0 = null;
        MovingSawComponent stackIn_118_0 = null;
        GasTrapComponent stackIn_120_0 = null;
        CoinItemComponent stackIn_122_0 = null;
        CoinBagItemComponent stackIn_124_0 = null;
        IdolItemComponent stackIn_126_0 = null;
        KeyItemComponent stackIn_128_0 = null;
        SkeletonComponent stackIn_130_0 = null;
        MovingWallComponent stackIn_132_0 = null;
        PlatformComponent stackIn_134_0 = null;
        MovingPlatformComponent stackIn_136_0 = null;
        PillarComponent stackIn_138_0 = null;
        MirrorComponent stackIn_140_0 = null;
        DoorwayComponent stackIn_142_0 = null;
        DoorwayComponent stackIn_144_0 = null;
        KeySwitchComponent stackIn_146_0 = null;
        TripBeamComponent stackIn_148_0 = null;
        CauldronComponent stackIn_150_0 = null;
        ArrowShooterComponent stackIn_152_0 = null;
        LaserShooterComponent stackIn_154_0 = null;
        FlameShooterComponent stackIn_156_0 = null;
        BladeShooterComponent stackIn_158_0 = null;
        WheeledMountComponent stackIn_160_0 = null;
        RotaterMountComponent stackIn_162_0 = null;
        SweeperMountComponent stackIn_164_0 = null;
        SweeperMountComponent stackIn_166_0 = null;
        FacePlayerMountComponent stackIn_168_0 = null;
        TrackMountComponent stackIn_170_0 = null;
        TrackMountComponent stackIn_172_0 = null;
        SimpleHoverMountComponent stackIn_174_0 = null;
        PushableMountComponent stackIn_176_0 = null;
        PlantComponent stackIn_178_0 = null;
        PlantComponent stackIn_180_0 = null;
        PlantComponent stackIn_182_0 = null;
        PlantComponent stackIn_184_0 = null;
        TrackingCrusherComponent stackIn_186_0 = null;
        StaticCrusherComponent stackIn_188_0 = null;
        DoorwayComponent stackIn_190_0 = null;
        DoorwayComponent stackIn_192_0 = null;
        RopeBridgeComponent stackIn_194_0 = null;
        RopeBridgeComponent stackIn_196_0 = null;
        RevolverItemComponent stackIn_198_0 = null;
        BlockComponent stackIn_200_0 = null;
        PlatformMazeComponent stackIn_202_0 = null;
        PushableBlockMazeComponent stackIn_204_0 = null;
        WhiteLightShooterComponent stackIn_206_0 = null;
        WhiteLightSensorComponent stackIn_208_0 = null;
        PressureSwitchComponent stackIn_210_0 = null;
        PressureSwitchComponent stackIn_212_0 = null;
        InvisibleTouchSwitchComponent stackIn_214_0 = null;
        BlockComponent stackIn_216_0 = null;
        BoulderComponent stackIn_218_0 = null;
        MirrorComponent stackIn_220_0 = null;
        PlatformComponent stackIn_222_0 = null;
        AllPlatformsMazeComponent stackIn_224_0 = null;
        WallCrusherComponent stackIn_226_0 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        String stackIn_231_2 = null;
        StringBuilder stackIn_233_1 = null;
        String stackIn_234_2 = null;
        StringBuilder stackIn_236_1 = null;
        String stackIn_237_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param0.b((byte) 44, 10);
          if (param2 != -7) {
            field_a = (float[]) null;
          }
          var6 = var5_int;
          if (0 == var6) {
            stackIn_102_0 = new BlockComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_102_0);
          }
          if (var6 == 1) {
            stackIn_104_0 = new SnakePitComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_104_0);
          }
          if (2 == var6) {
            stackIn_106_0 = new PitComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_106_0);
          }
          if (var6 == 3) {
            stackIn_108_0 = new PressureSwitchComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_108_0);
          }
          if (4 == var6) {
            stackIn_110_0 = new PressureSwitchComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_110_0);
          }
          if (var6 == 5) {
            stackIn_112_0 = new PortalComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_112_0);
          }
          if (6 == var6) {
            stackIn_114_0 = new TorchComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_114_0);
          }
          if (var6 == 7) {
            stackIn_116_0 = new BrazierComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_116_0);
          }
          if (var6 == 8) {
            stackIn_118_0 = new MovingSawComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_118_0);
          }
          if (var6 == 9) {
            stackIn_120_0 = new GasTrapComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_120_0);
          }
          if (var6 == 10) {
            stackIn_122_0 = new CoinItemComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_122_0);
          }
          if (var6 == 11) {
            stackIn_124_0 = new CoinBagItemComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_124_0);
          }
          if (var6 == 12) {
            stackIn_126_0 = new IdolItemComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_126_0);
          }
          if (var6 == 13) {
            stackIn_128_0 = new KeyItemComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_128_0);
          }
          if (var6 == 14) {
            stackIn_130_0 = new SkeletonComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_130_0);
          }
          if (15 == var6) {
            stackIn_132_0 = new MovingWallComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_132_0);
          }
          if (var6 == 16) {
            stackIn_134_0 = new PlatformComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_134_0);
          }
          if (var6 == 17) {
            stackIn_136_0 = new MovingPlatformComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_136_0);
          }
          if (var6 == 18) {
            stackIn_138_0 = new PillarComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_138_0);
          }
          if (var6 == 19) {
            stackIn_140_0 = new MirrorComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_140_0);
          }
          if (var6 == 20) {
            stackIn_142_0 = new DoorwayComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_142_0);
          }
          if (21 == var6) {
            stackIn_144_0 = new DoorwayComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_144_0);
          }
          if (var6 == 22) {
            stackIn_146_0 = new KeySwitchComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_146_0);
          }
          if (23 == var6) {
            stackIn_148_0 = new TripBeamComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_148_0);
          }
          if (var6 == 24) {
            stackIn_150_0 = new CauldronComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_150_0);
          }
          if (var6 == 25) {
            stackIn_152_0 = new ArrowShooterComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_152_0);
          }
          if (var6 == 26) {
            stackIn_154_0 = new LaserShooterComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_154_0);
          }
          if (var6 == 27) {
            stackIn_156_0 = new FlameShooterComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_156_0);
          }
          if (28 == var6) {
            stackIn_158_0 = new BladeShooterComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_158_0);
          }
          if (var6 == 29) {
            stackIn_160_0 = new WheeledMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_160_0);
          }
          if (var6 == 30) {
            stackIn_162_0 = new RotaterMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_162_0);
          }
          if (31 == var6) {
            stackIn_164_0 = new SweeperMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_164_0);
          }
          if (var6 == 32) {
            stackIn_166_0 = new SweeperMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_166_0);
          }
          if (var6 == 33) {
            stackIn_168_0 = new FacePlayerMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_168_0);
          }
          if (var6 == 34) {
            stackIn_170_0 = new TrackMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_170_0);
          }
          if (var6 == 35) {
            stackIn_172_0 = new TrackMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_172_0);
          }
          if (36 == var6) {
            stackIn_174_0 = new SimpleHoverMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_174_0);
          }
          if (var6 == 37) {
            stackIn_176_0 = new PushableMountComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_176_0);
          }
          if (var6 == 38) {
            stackIn_178_0 = new PlantComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_178_0);
          }
          if (var6 == 39) {
            stackIn_180_0 = new PlantComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_180_0);
          }
          if (40 == var6) {
            stackIn_182_0 = new PlantComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_182_0);
          }
          if (var6 == 41) {
            stackIn_184_0 = new PlantComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_184_0);
          }
          if (var6 == 42) {
            stackIn_186_0 = new TrackingCrusherComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_186_0);
          }
          if (var6 == 43) {
            stackIn_188_0 = new StaticCrusherComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_188_0);
          }
          if (var6 == 44) {
            stackIn_190_0 = new DoorwayComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_190_0);
          }
          if (var6 == 45) {
            stackIn_192_0 = new DoorwayComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_192_0);
          }
          if (var6 == 46) {
            stackIn_194_0 = new RopeBridgeComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_194_0);
          }
          if (var6 == 47) {
            stackIn_196_0 = new RopeBridgeComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_196_0);
          }
          if (var6 == 48) {
            stackIn_198_0 = new RevolverItemComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_198_0);
          }
          if (var6 == 49) {
            stackIn_200_0 = new BlockComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_200_0);
          }
          if (var6 == 50) {
            stackIn_202_0 = new PlatformMazeComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_202_0);
          }
          if (var6 == 51) {
            stackIn_204_0 = new PushableBlockMazeComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_204_0);
          }
          if (52 == var6) {
            stackIn_206_0 = new WhiteLightShooterComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_206_0);
          }
          if (var6 == 53) {
            stackIn_208_0 = new WhiteLightSensorComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_208_0);
          }
          if (54 == var6) {
            stackIn_210_0 = new PressureSwitchComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_210_0);
          }
          if (var6 == 55) {
            stackIn_212_0 = new PressureSwitchComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_212_0);
          }
          if (var6 == 56) {
            stackIn_214_0 = new InvisibleTouchSwitchComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_214_0);
          }
          if (var6 == 57) {
            stackIn_216_0 = new BlockComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_216_0);
          }
          if (58 == var6) {
            stackIn_218_0 = new BoulderComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_218_0);
          }
          if (59 == var6) {
            stackIn_220_0 = new MirrorComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_220_0);
          }
          if (var6 == 60) {
            stackIn_222_0 = new PlatformComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_222_0);
          }
          if (var6 == 61) {
            stackIn_224_0 = new AllPlatformsMazeComponent(param1, var5_int, param0, param3);
            return (RoomComponent) ((Object) stackIn_224_0);
          }
          if (var6 != 62) {
            throw new IllegalStateException("Unrecognised component type: " + var5_int);
          }
          stackIn_226_0 = new WallCrusherComponent(param1, var5_int, param0, param3);
          return (RoomComponent) ((Object) stackIn_226_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_230_0 = var5;
          stackIn_230_1 = new StringBuilder().append("rn.A(");
          if (param0 == null) {
            stackIn_231_2 = "null";
          } else {
            stackIn_231_2 = "{...}";
          }
          stackIn_233_1 = ((StringBuilder) (Object) stackIn_230_1).append(stackIn_231_2).append(',');
          if (param1 == null) {
            stackIn_234_2 = "null";
          } else {
            stackIn_234_2 = "{...}";
          }
          stackIn_236_1 = ((StringBuilder) (Object) stackIn_233_1).append(stackIn_234_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_237_2 = "null";
          } else {
            stackIn_237_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_230_0), ((StringBuilder) (Object) stackIn_236_1).append(stackIn_237_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 27) {
          field_b = 58;
        }
        return oea.field_i != null ? true : false;
    }

    public final RoomComponent createSkeletonComponent(Room param0, byte param1) {
        RuntimeException var3 = null;
        RoomComponent stackIn_2_0 = null;
        RoomComponent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 109) {
            stackIn_4_0 = this.createComponent(-29748, param0, 14);
            return stackIn_4_0;
          }
          stackIn_2_0 = (RoomComponent) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rn.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void writeComponent(RoomComponent param0, int param1, BitPacketBuffer param2) {
        try {
          param2.a((byte) -127, param0.r(12), 10);
          param0.a(false, param2);
          if (param1 != -16097) {
            field_a = (float[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 0;
        field_a = new float[2];
    }
}
