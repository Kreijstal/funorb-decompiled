/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SnakePitComponent extends PrefabComponent {
    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        BitPacketBuffer var5 = null;
        Trap stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            var5 = (BitPacketBuffer) null;
            this.encode(true, (BitPacketBuffer) null);
          }
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var4.setStatCategory(1, 146366800);
          var4.addBehaviour((byte) 83, (Behaviour) (new SnakePitBehaviour(param2, false)));
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("saa.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          this.hasAngle((byte) -40);
          return false;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "saa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return false;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
    }

    SnakePitComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    SnakePitComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.getRenderLayer(51);
          return 4;
        }
        return 4;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return true;
    }

    static {
    }
}
