/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MovingWallComponent extends PathMoverComponent {
    static String field_M;
    static IntrusiveDeque field_N;

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        SimpleBlockBehaviour var5 = null;
        PathMoveLocomotor var6 = null;
        ModelCodec var7 = null;
        WallModel var8 = null;
        Trap var9 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.b((byte) -11, this.field_k, this.field_l);
          var9.h(param1, 0);
          var9.a(1, (byte) -12, true);
          var9.g(param1 ^ 109, 2);
          var9.a((byte) -3, 20);
          var9.b((byte) 17, true);
          var5 = new SimpleBlockBehaviour(param2, param0);
          var9.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = this.createPathMove((byte) 124, param2, param0);
          var9.addLocomotor(var6, param1 ^ 3);
          var7 = rm.field_a;
          var8 = (WallModel) (var7.createModel(15, 111));
          var9.a((TrapPart) null, (byte) 124, var8);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("tca.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tca.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_N = null;
        if (param0 != 15) {
          MovingWallComponent.releaseStatics(-122);
          field_M = null;
          return;
        }
        field_M = null;
    }

    final int t(int param0) {
        if (param0 != 8) {
          return -24;
        }
        return 7;
    }

    final boolean A(int param0) {
        int var2 = 103 % ((param0 - 0) / 60);
        return true;
    }

    MovingWallComponent(Room param0, int param1) {
        super(param0, param1);
    }

    MovingWallComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          this.z(95);
          return true;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
          this.v(46);
          return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          this.s(-76);
          return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          this.v(-96);
          return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          field_N = (IntrusiveDeque) null;
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        field_M = "To server list";
        field_N = new IntrusiveDeque();
    }
}
