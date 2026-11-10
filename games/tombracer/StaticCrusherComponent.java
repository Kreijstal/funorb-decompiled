/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StaticCrusherComponent extends PrefabComponent {
    static String field_G;
    static byte[] field_F;

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.getRenderLayer(13);
          return true;
        }
        return true;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          StaticCrusherComponent.releaseStatics((byte) -56);
          return 7;
        }
        return 7;
    }

    StaticCrusherComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_G = null;
        field_F = null;
        if (param0 >= -97) {
          field_G = (String) null;
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return false;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          if (param0) {
            BitPacketBuffer var4 = (BitPacketBuffer) null;
            this.encode(true, (BitPacketBuffer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wfa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(117, 4194304, 4194304);
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        CrusherBehaviour var5 = null;
        ModelCodec var6 = null;
        CrusherModel var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var4.setWeight((byte) -3, 20);
          var4.setObstructionLevel(param1, param1 ^ 3);
          var4.setFloating((byte) 17, true);
          var4.setCollisionLevel(4, (byte) -12, true);
          var5 = new CrusherBehaviour(param2, param0);
          var5.setTimings(50, 8, param1 ^ 2, 25, 6);
          var5.b((byte) 72, true);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (CrusherModel) (var6.createModel(11, 114));
          var4.a(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("wfa.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, BitPacketBuffer param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        BitPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = (BitPacketBuffer) (param2);
          stackIn_2_1 = -128;
          if (param0) {
            stackIn_3_2 = 1;
          } else {
            stackIn_3_2 = 0;
          }
          ((BitPacketBuffer) (Object) stackIn_2_0).writeBits((byte) stackIn_2_1, stackIn_3_2, 1);
          var3_int = -96 % ((param1 - 62) / 35);
          stackIn_4_0 = param0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wfa.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return false;
    }

    StaticCrusherComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_G = "Walk into these mirrors holding <img=8><img=9> to drag them around. Reflect carefully before handling dangerous laser beams.";
        field_F = new byte[520];
    }
}
