/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InvisibleTouchSwitchComponent extends SwitchComponent {
    static int field_L;
    static Sprite[] field_K;
    static ResourceArchive field_J;

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          field_K = (Sprite[]) null;
          return false;
        }
        return false;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        TouchSwitchBehaviour var5 = null;
        Trap stackIn_2_0 = null;
        Trap stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          if (param1 != 3) {
            stackIn_2_0 = (Trap) null;
            return stackIn_2_0;
          }
          var4.setSize((byte) -11, this.height, this.width);
          var5 = new TouchSwitchBehaviour(param2, param0);
          this.a(var5, (byte) -92);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("nja.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int getMaxTargets(int param0) {
        if (param0 != 31609) {
          this.hasAngle((byte) 84);
          return 3;
        }
        return 3;
    }

    public static void f(boolean param0) {
        field_K = null;
        field_J = null;
        if (param0) {
          field_L = 33;
        }
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          if (param0) {
            field_K = (Sprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nja.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return -122;
        }
        return 5;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return true;
    }

    InvisibleTouchSwitchComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_K = (Sprite[]) null;
          return false;
        }
        return false;
    }

    InvisibleTouchSwitchComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean hasInitialState(byte param0) {
        if (param0 != 93) {
          return false;
        }
        return true;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
    }

    static {
    }
}
