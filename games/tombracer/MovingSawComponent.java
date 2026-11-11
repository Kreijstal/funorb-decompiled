/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MovingSawComponent extends PathMoverComponent {
    static su field_M;
    static char[] field_O;
    static int field_N;

    final static int reverseBits(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 15) {
            MovingSawComponent.releaseStatics((byte) 58);
          }
          var3_int = 0;
          while (param2 > 0) {
            var3_int = 1 & param0 | var3_int << 1;
            param2--;
            param0 = param0 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var3), "uk.TB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    MovingSawComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          return true;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_M = (su) null;
          return 7;
        }
        return 7;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        PathMoveLocomotor var5 = null;
        ConstantEffectBehaviour var6 = null;
        Effect var7 = null;
        Trap var8 = null;
        SimpleBlockBehaviour var9 = null;
        ModelCodec var10 = null;
        HazardModel var11 = null;
        Trap var12 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var12 = new Trap(param2, param0);
          var12.setSize((byte) -11, this.height, this.width);
          var12.setObstructionLevel(0, param1 ^ param1);
          var12.setCollisionLevel(4, (byte) -12, true);
          var12.setWeight((byte) -3, 0);
          var12.setFloating((byte) 17, true);
          var5 = this.createPathMove((byte) 125, param2, param0);
          var12.addLocomotor(var5, 0);
          var6 = new ConstantEffectBehaviour(param2, param0);
          var7 = new Effect(0, 10);
          var7.setDeathMessageIndex(1, 15);
          var6.a(true, var7);
          var6.setLocked((byte) -24, true);
          var12.addBehaviour((byte) 83, (Behaviour) (var6));
          var8 = new Trap(param2, param0);
          var8.setSize((byte) -11, 1048576, 1048576);
          var8.setObstructionLevel(3, param1 ^ 3);
          var8.setCollisionLevel(3, (byte) -12, true);
          var8.setWeight((byte) -3, 0);
          var8.setFloating((byte) 17, true);
          var9 = new SimpleBlockBehaviour(param2, param0);
          var8.addBehaviour((byte) 83, (Behaviour) (var9));
          var12.addChild(-128, var8);
          var10 = rm.field_a;
          var11 = (HazardModel) (var10.createModel(8, param1 + 119));
          var11.a(false, 1);
          var12.addModel(var6, (byte) 124, var11);
          stackIn_1_0 = var12;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uk.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
          return false;
        }
        return true;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_O = (char[]) null;
          return true;
        }
        return true;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          MovingSawComponent.releaseStatics((byte) -72);
          return false;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "uk.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean A(int param0) {
        int var2 = 16 % ((0 - param0) / 60);
        return true;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(66, 4194304, 4194304);
    }

    MovingSawComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          this.A(-19);
          return false;
        }
        return false;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -102 / ((-92 - param1) / 34);
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_M = null;
        field_O = null;
        if (param0 < 112) {
          MovingSawComponent.a(27, (byte) 64, 114);
        }
    }

    static {
        field_O = new char[128];
        field_M = new su(0, 2, 2, 1);
    }
}
