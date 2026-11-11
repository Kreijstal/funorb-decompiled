/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WallCrusherComponent extends PrefabComponent {
    private int field_J;
    private int field_O;
    private int field_L;
    static int field_H;
    private int field_I;
    static SpriteData[] field_F;
    static String field_K;
    private TimeSwitchBehaviour field_G;
    private int field_M;
    private boolean field_N;

    final Switchable getSwitchable(int param0) {
        if (param0 > -60) {
          this.field_M = -115;
          return (Switchable) ((Object) this.field_G);
        }
        return (Switchable) ((Object) this.field_G);
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
    }

    WallCrusherComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_M = 131072;
        this.field_J = 524288;
        this.field_I = 262144;
        this.field_O = 65536;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        SimpleBlockBehaviour var5 = null;
        SimpleMoveLocomotor var6 = null;
        SimpleMoveLocomotor var7 = null;
        int[] var8 = null;
        TimingPattern var9 = null;
        int var10 = 0;
        SwitchState var11 = null;
        ModelCodec var12 = null;
        WallModel var13 = null;
        Trap var14 = null;
        Trap stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var14 = new Trap(param2, param0);
          var14.setSize((byte) -11, this.height, this.width);
          var14.setObstructionLevel(3, 0);
          var14.setCollisionLevel(1, (byte) -12, true);
          var14.setPushMode(param1 + 122, 2);
          var14.setWeight((byte) -3, 20);
          var14.setFloating((byte) 17, true);
          var5 = new SimpleBlockBehaviour(param2, param0);
          var14.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = new SimpleMoveLocomotor(param2, param0);
          var6.setSpeed(this.field_J, 26621);
          var14.addLocomotor(var6, 0);
          var7 = new SimpleMoveLocomotor(param2, param0);
          var7.setSpeed(this.field_I, 26621);
          var7.setDirection(4, 4096);
          var7.toggle(112);
          var14.addLocomotor(var7, param1 ^ param1);
          this.field_G = new TimeSwitchBehaviour(param2, param0);
          var8 = new int[]{this.field_O * 50 >> 16, this.field_M * 50 >> 16};
          var9 = new TimingPattern(var8);
          if (!this.field_N) {
            var10 = this.field_L;
          } else {
            var10 = param2.getRandom(-86).nextBounded(16, 0);
          }
          var10 = var10 * var9.getTotalDuration((byte) -94) / 16;
          var9.setPhaseOffset(false, var10);
          if (var10 > 50 * this.field_O) {
            var6.toggle(-24);
            var7.toggle(-70);
          }
          this.field_G.setTimingPattern(var9, (byte) -120);
          var11 = this.field_G.getSwitchState((byte) -91);
          var11.setUses(0, 55);
          var11.getLinks(param1 - 2).setTargets(9, new Switchable[]{(Switchable) ((Object) var6), (Switchable) ((Object) var7)});
          var14.addBehaviour((byte) 83, (Behaviour) (this.field_G));
          var12 = rm.field_a;
          var13 = (WallModel) (var12.createModel(15, 93));
          var14.addModel((TrapPart) null, (byte) 124, var13);
          stackIn_7_0 = var14;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ga.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    WallCrusherComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        RuntimeException var5 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_M = 131072;
        this.field_J = 524288;
        this.field_I = 262144;
        this.field_O = 65536;
        try {
          this.field_O = NodeHashTable.bitsToFixed16(param2.readBits((byte) 44, 4), 116, 2);
          this.field_J = NodeHashTable.bitsToFixed16(param2.readBits((byte) 44, 8), 100, 4);
          this.field_M = NodeHashTable.bitsToFixed16(param2.readBits((byte) 44, 4), 88, 2);
          this.field_I = NodeHashTable.bitsToFixed16(param2.readBits((byte) 44, 8), 107, 4);
          stackIn_4_1 = (1 == param2.readBits((byte) 44, 1));
          this.field_N = stackIn_4_1;
          if (this.field_N) {
            return;
          }
          this.field_L = param2.readBits((byte) 44, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ga.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean isMatchScreenActive(byte param0) {
        if (param0 > -14) {
          WallCrusherComponent.releaseStatics(-59);
          return SpriteTileOperator.field_t instanceof MatchScreen;
        }
        return SpriteTileOperator.field_t instanceof MatchScreen;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        RuntimeException var3 = null;
        BitPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -128, SpawnerBehaviour.fixed16ToBits((byte) 8, 2, this.field_O), 4);
          param1.writeBits((byte) -127, SpawnerBehaviour.fixed16ToBits((byte) 8, 4, this.field_J), 8);
          param1.writeBits((byte) -4, SpawnerBehaviour.fixed16ToBits((byte) 8, 2, this.field_M), 4);
          param1.writeBits((byte) -17, SpawnerBehaviour.fixed16ToBits((byte) 8, 4, this.field_I), 8);
          stackIn_2_0 = (BitPacketBuffer) (param1);
          stackIn_2_1 = -127;
          if (this.field_N) {
            stackIn_3_2 = 1;
          } else {
            stackIn_3_2 = 0;
          }
          ((BitPacketBuffer) (Object) stackIn_2_0).writeBits((byte) stackIn_2_1, stackIn_3_2, 1);
          if (!this.field_N) {
            param1.writeBits((byte) -33, this.field_L, 4);
          }
          if (!param0) {
            return;
          }
          this.field_J = -119;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ga.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_K = null;
        field_F = null;
        if (param0 != 4096) {
          field_F = (SpriteData[]) null;
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          Room var3 = (Room) null;
          this.createTrap(false, -124, (Room) null);
          return true;
        }
        return true;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.usesBehaviourModels(41);
          return true;
        }
        return true;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return true;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          this.getRenderLayer(108);
          return false;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.hasSize(-115);
          return 7;
        }
        return 7;
    }

    static {
        field_K = "Won <%0> round(s)";
        field_H = 0;
    }
}
