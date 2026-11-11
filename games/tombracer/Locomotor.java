/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Locomotor extends IntrusiveNode implements Switchable, noa, TrapPart {
    private Room room;
    boolean enabled;
    private SwitchableId field_g;
    Trap trap;
    boolean locked;
    private SwitchableId field_h;
    static String field_m;
    static String field_l;
    boolean stopped;

    final Room getRoom(boolean param0) {
        if (!param0) {
          return (Room) null;
        }
        return this.room;
    }

    public final boolean isEnabled(int param0) {
        if (param0 >= -49) {
          return false;
        }
        return this.enabled;
    }

    public final Trap getTrap(byte param0) {
        int var2 = 73 / ((-32 - param0) / 50);
        return this.trap;
    }

    void encode(BitPacketBuffer param0, byte param1) {
        param0.writeBits((byte) 61, this.getTypeId(1), 6);
        if (param1 > -78) {
          return;
        }
        try {
          param0.writeBits((byte) -126, !this.enabled ? 0 : 1, 1);
          param0.writeBits((byte) 107, !this.locked ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wda.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean isStopped(byte param0) {
        if (param0 != 87) {
          field_m = (String) null;
          if (null != this.trap) {
            return this.stopped ? true : false;
          }
          return true;
        }
        if (null == this.trap) {
          return true;
        }
        if (!this.stopped) {
          return false;
        }
        return true;
    }

    void a(boolean param0, byte param1, SwitchableIdAllocator param2, SwitchableIdAllocator param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != null) {
            this.field_h = param2.allocate(-75, param0);
          }
          if (param3 != null) {
            this.field_g = param3.allocate(-47, false);
          }
          if (param1 <= -106) {
            return;
          }
          this.tick((byte) -110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("wda.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public void toggle(int param0) {
        if (!this.locked) {
          this.enabled = !this.enabled ? true : false;
          int var2 = -124 / ((param0 - 28) / 49);
          return;
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 0) {
          this.enabled = false;
          return SpawnerBehaviour.a((byte) 8, 4, param1);
        }
        return SpawnerBehaviour.a((byte) 8, 4, param1);
    }

    final int getTrapInitialLocalX(byte param0) {
        if (param0 >= -43) {
          this.a(-18, true);
          return this.trap.getInitialLocalX(80);
        }
        return this.trap.getInitialLocalX(80);
    }

    void mirror(byte param0) {
        if (param0 > -116) {
          this.enabled = false;
        }
    }

    abstract void applyConstraint(int param0);

    abstract int getTypeId(int param0);

    abstract void tick(byte param0);

    public static void releaseStatics(int param0) {
        field_l = null;
        field_m = null;
        if (param0 != 12072) {
          Locomotor.releaseStatics(-112);
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
          this.room = (Room) null;
          return NodeHashTable.a(param0, 122, 4);
        }
        return NodeHashTable.a(param0, 122, 4);
    }

    Locomotor(Room param0, BitPacketBuffer param1, boolean param2) {
        this(param0, param2);
        RuntimeException var4 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_4_1 = (param1.readBits((byte) 44, 1) == 1);
          this.enabled = stackIn_4_1;
          if (param0.formatVersion < 22) {
            return;
          }
          stackIn_9_1 = (param1.readBits((byte) 44, 1) == 1);
          this.locked = stackIn_9_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("wda.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract int hashState(int param0, int param1);

    final Switchable a(boolean param0, int param1, int param2) {
        if (param1 != 1) {
          this.stopped = false;
          if (WhirlpoolDigest.matchesSwitchableId(param2, param0, -27201, (Switchable) (this))) {
            return (Switchable) (this);
          }
          return null;
        }
        if (WhirlpoolDigest.matchesSwitchableId(param2, param0, -27201, (Switchable) (this))) {
          return (Switchable) (this);
        }
        return null;
    }

    final void setEnabled(boolean param0, boolean param1) {
        if (this.locked) {
          return;
        }
        this.enabled = param1 ? true : false;
        if (!param0) {
          this.stopped = false;
        }
    }

    public final SwitchableId getLocalId(byte param0) {
        if (param0 != 84) {
          return (SwitchableId) null;
        }
        return this.field_g;
    }

    public final SwitchableId getGlobalId(int param0) {
        if (param0 != 31974) {
          Locomotor.releaseStatics(-9);
          return this.field_h;
        }
        return this.field_h;
    }

    final int getTrapInitialLocalY(boolean param0) {
        if (param0) {
          field_m = (String) null;
          return this.trap.getInitialLocalY((byte) -124);
        }
        return this.trap.getInitialLocalY((byte) -124);
    }

    void attachToTrap(int param0, Trap param1) {
        try {
          this.trap = param1;
          if (param0 < 35) {
            this.getLocalId((byte) 25);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wda.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final SwitchableScope getScope(byte param0) {
        if (param0 < 105) {
          return (SwitchableScope) null;
        }
        return (SwitchableScope) ((Object) this.trap.getRoot(0));
    }

    final int getTrapInitialAngle(boolean param0) {
        if (!param0) {
          this.locked = true;
          return this.trap.getInitialAngle(0);
        }
        return this.trap.getInitialAngle(0);
    }

    Locomotor(Room param0, boolean param1) {
        this.enabled = true;
        this.locked = false;
        this.stopped = false;
        IntPoint discarded$0 = new IntPoint();
        try {
          this.room = param0;
          this.a(param1, (byte) -119, param0.getTrapIdAllocator(116), (SwitchableIdAllocator) null);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_m = "<%0> has declined the invitation.";
        field_l = "Concluded";
    }
}
