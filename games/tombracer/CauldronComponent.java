/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CauldronComponent extends SwitchComponent {
    static u[] field_J;

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        EffectSwitchBehaviour var5 = null;
        SwitchState var6 = null;
        int var7 = 0;
        ModelCodec var8 = null;
        SwitchModel var9 = null;
        Trap var10 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new Trap(param2, param0);
          var10.setSize((byte) -11, this.height, this.width);
          var10.h(3, param1 ^ param1);
          var10.a(1, (byte) -12, false);
          var10.setPushable(false, param1 + 112);
          var10.b((byte) 17, false);
          var10.a((byte) -3, 6);
          var10.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new EffectSwitchBehaviour(param2, param0);
          var5.a(true, 3, (byte) -122);
          var5.a(true, 4, -81);
          var5.a(10, 1, 5, param1 - 2032);
          this.a(var5, (byte) -118);
          var6 = var5.getSwitchState((byte) -101);
          var7 = 25;
          var6.a(var7, 0, 0, 0, 5, 0);
          var10.addBehaviour((byte) 83, (Behaviour) (var5));
          var8 = rm.field_a;
          var9 = (SwitchModel) (var8.createModel(9, 123));
          var9.b(1, (byte) -112);
          var10.a(var5, (byte) 124, var9);
          stackIn_1_0 = var10;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("bia.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          field_J = (u[]) null;
          return false;
        }
        return false;
    }

    CauldronComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return false;
    }

    final static int bitLength(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0) {
          var2 += 16;
          param1 = param1 >>> 16;
        } else {
          if (65536 <= param1) {
            var2 += 16;
            param1 = param1 >>> 16;
          }
        }
        if (param0 != 93) {
          CauldronComponent.bitLength((byte) 58, 116);
        }
        if (256 <= param1) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bia.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          Room var3 = (Room) null;
          this.createTrap(false, -105, (Room) null);
          return 7;
        }
        return 7;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_J = null;
        if (param0 != 4194304) {
          field_J = (u[]) null;
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
          field_J = (u[]) null;
          return true;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        this.setSize(-117, 4194304, 4194304);
    }

    CauldronComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final int B(int param0) {
        if (param0 != 31609) {
          return -38;
        }
        return 3;
    }

    static {
    }
}
