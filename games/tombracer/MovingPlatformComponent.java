/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MovingPlatformComponent extends PathMoverComponent {
    static String field_P;
    private int field_M;
    static SpriteData[] field_O;
    static int field_N;

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          MovingPlatformComponent.releaseStatics((byte) 71);
          return false;
        }
        return false;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.getRenderLayer(7);
          return true;
        }
        return true;
    }

    final boolean A(int param0) {
        int var2 = 88 % ((0 - param0) / 60);
        return true;
    }

    final boolean storesSpeed(int param0) {
        if (param0 != 1760) {
          field_P = (String) null;
          return true;
        }
        return true;
    }

    MovingPlatformComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        try {
          this.field_M = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ps.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          this.A(105);
          return true;
        }
        return true;
    }

    MovingPlatformComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.applyDefaults((byte) -40);
          return 3;
        }
        return 3;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        PlatformBehaviour var5 = null;
        PathMoveLocomotor var6 = null;
        ModelCodec var7 = null;
        PlatformModel var8 = null;
        Trap stackIn_2_0 = null;
        Trap stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var5 = new PlatformBehaviour(param2, false);
          var5.setWeightThreshold(-5, this.field_M);
          var5.setLocked((byte) -24, true);
          if (param1 != 3) {
            stackIn_2_0 = (Trap) null;
            return stackIn_2_0;
          }
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = this.createPathMove((byte) -104, param2, param0);
          var4.addLocomotor(var6, 0);
          var7 = rm.field_a;
          var8 = (PlatformModel) (var7.createModel(17, 88));
          var8.setStyle(2, (byte) 23);
          var4.addModel(var5, (byte) 124, var8);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("ps.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) 84, this.field_M, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ps.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_O = null;
        int var1 = -40 % ((3 - param0) / 35);
        field_P = null;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
    }

    static {
        field_P = "Bronze Medal Award";
    }
}
