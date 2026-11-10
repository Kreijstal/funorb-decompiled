/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SweeperMountComponent extends PrefabComponent {
    static int field_H;
    private int field_G;
    static String field_F;
    static String field_I;

    public static void releaseStatics(int param0) {
        field_I = null;
        if (param0 != 7) {
          SweeperMountComponent.releaseStatics(-16);
          field_F = null;
          return;
        }
        field_F = null;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        SweepRotateLocomotor var5 = null;
        int var6 = 0;
        int var7_int = 0;
        Trap var9 = null;
        Trap stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ModelCodec var7 = null;
        TrapBaseModel var8 = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var9.setObstructionLevel(param1, param1 - 3);
          var9.setCollisionLevel(1, (byte) -12, true);
          var9.setWeight((byte) -3, 6);
          var9.setFloating((byte) 17, false);
          var9.setPushMode(param1 ^ 126, 2);
          var9.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new SweepRotateLocomotor(param2, param0);
          var5.a((byte) -35, 8 * this.field_G);
          var6 = 2048;
          var7_int = this.getTypeId(12);
          if (var7_int == 31) {
            var5.a(true, var6);
          } else {
            if (32 == var7_int) {
              var5.a(true, var6 * 2);
            }
          }
          var9.addLocomotor(var5, 0);
          var7 = rm.field_a;
          var8 = (TrapBaseModel) (var7.createModel(16, param1 ^ 107));
          var8.b(param1 ^ 8021, 2);
          var9.a(var5, (byte) 124, var8);
          stackIn_6_0 = var9;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ona.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
          return true;
        }
        return true;
    }

    final static int b(int param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
          return -34;
        }
        var2 = param1;
        if (1 == var2) {
          return 3;
        }
        if (var2 == 3) {
          return 1;
        }
        if (var2 == 4) {
          return 0;
        }
        if (var2 == 0) {
          return 4;
        }
        if (var2 == 7) {
          return 5;
        }
        if (var2 != 5) {
          return param1;
        }
        return 7;
    }

    final void mirror(Room param0, int param1) {
        try {
          super.mirror(param0, param1);
          this.field_G = -this.field_G;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ona.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -126, dqa.toOffsetBinary(true, this.field_G, 5), 5);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ona.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    SweeperMountComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_G = 4;
        try {
          this.field_G = CoinItemComponent.fromOffsetBinary(true, 5, param2.readBits((byte) 44, 5));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ona.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(false, (BitPacketBuffer) null);
          return true;
        }
        return true;
    }

    SweeperMountComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_G = 4;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          Room var3 = (Room) null;
          this.createTrap(true, -127, (Room) null);
          return false;
        }
        return false;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(-107, 2097152, 2097152);
        this.setMounts((byte) 95, new ComponentMount[]{new ComponentMount(0, 0, 2097152, 0, 8)});
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_I = (String) null;
          return 7;
        }
        return 7;
    }

    static {
        field_F = "Bloom: ";
        field_I = "Asking to join <%0>'s game...";
    }
}
