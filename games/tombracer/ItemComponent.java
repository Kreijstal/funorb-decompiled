/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ItemComponent extends PrefabComponent {
    static String field_F;

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.hasAngle((byte) 87);
          return false;
        }
        return false;
    }

    Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        Trap stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var4.setObstructionLevel(0, 0);
          var4.setCollisionLevel(0, (byte) -12, true);
          var4.setWeight((byte) -3, 0);
          var4.setFloating((byte) 17, false);
          var4.setPushable(true, 125);
          if (param1 != 3) {
            field_F = (String) null;
          }
          var4.a(98, true);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("lea.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return -111;
        }
        return 7;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lea.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_F = null;
        int var1 = 92 / ((-13 - param0) / 58);
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return false;
    }

    ItemComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.setSize(param0 ^ 14, 2097152, 2097152);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          field_F = (String) null;
          return false;
        }
        return false;
    }

    ItemComponent(Room param0, int param1) {
        super(param0, param1);
    }

    static {
        field_F = "My Best: <%0>";
    }
}
