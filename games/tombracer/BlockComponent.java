/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlockComponent extends PrefabComponent {
    static String[] restartMessages;

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        SimpleBlockBehaviour var9 = null;
        DamageableBehaviour var10 = null;
        FlagSet var11 = null;
        ModelCodec var12 = null;
        BlockModel var13 = null;
        int var14 = 0;
        Trap var15 = null;
        Trap stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          var15 = new Trap(param2, param0);
          var15.setSize((byte) -11, this.height, this.width);
          if (this.typeId == 49) {
            var7 = 10;
            var5 = 8;
            var8 = 50;
            var6 = 50;
          } else {
            if (this.typeId == 0) {
              var6 = 25;
              var7 = 0;
              var8 = 50;
            } else {
              var8 = 1;
              var6 = 5;
              var7 = 1;
            }
            var5 = 4;
          }
          var15.a((byte) -3, var5);
          var15.h(param1, 0);
          var15.setPushable(true, param1 + 119);
          var15.g(param1 + 97, 1);
          var15.b((byte) 17, false);
          var15.a(1, (byte) -12, true);
          var9 = new SimpleBlockBehaviour(param2, param0);
          var15.addBehaviour((byte) 83, (Behaviour) (var9));
          var15.d(var6, -1);
          var10 = new DamageableBehaviour(param2, param0);
          var10.b(1, var8, param1 - 3);
          var11 = var10.j((byte) -106);
          var11.setAll(false, 67);
          var11.set(0, -17075, true);
          var15.addBehaviour((byte) 83, (Behaviour) (var10));
          var12 = rm.field_a;
          var13 = (BlockModel) (var12.createModel(7, 92));
          var13.b(107, var7);
          var15.a((TrapPart) null, (byte) 124, var13);
          stackIn_8_0 = var15;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("si.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          this.hasSize(16);
          return false;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        if (param0 < 115) {
          restartMessages = (String[]) null;
          restartMessages = null;
          return;
        }
        restartMessages = null;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          this.q((byte) 98);
          return false;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "si.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          Room var3 = (Room) null;
          this.createTrap(false, -29, (Room) null);
          return false;
        }
        return false;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          restartMessages = (String[]) null;
          return false;
        }
        return false;
    }

    BlockComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final static int A(int param0) {
        if (param0 <= 12) {
          BlockComponent.A(-47);
          IntrusiveDequeCursor.field_a.a(-121);
          if (wg.field_l.c(81)) {
            return 0;
          }
          return ArchiveNetworkClient.b((byte) -66);
        }
        IntrusiveDequeCursor.field_a.a(-121);
        if (wg.field_l.c(81)) {
          return 0;
        }
        return ArchiveNetworkClient.b((byte) -66);
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.q((byte) 57);
          return 7;
        }
        return 7;
    }

    BlockComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final static int a(int param0, int param1, int param2, boolean param3) {
        if (param2 <= 94) {
          restartMessages = (String[]) null;
          return PowerUpItemBehaviour.r(-95);
        }
        return PowerUpItemBehaviour.r(-95);
    }

    final void q(byte param0) {
        super.q(param0);
        if (this.typeId != 49) {
          this.b(-78, 2097152, 2097152);
          return;
        }
        this.b(param0 ^ -82, 4194304, 4194304);
    }

    static {
        restartMessages = new String[]{"<%0> reset", "<%0> tried again", "<%0> lost the will to carry on", "<%0> goofed", "<%0> decided they were trapped", "<%0> had a rethink", "<%0> restarted the room", "<%0> realised that failure was inevitable", "<%0>'s lack of concentration got them into trouble"};
    }
}
