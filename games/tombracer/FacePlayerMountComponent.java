/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FacePlayerMountComponent extends PrefabComponent {
    static ta field_F;
    private int field_G;
    static String field_H;

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return true;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_F = (ta) null;
          return false;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          if (param0) {
            field_F = (ta) null;
          }
          super.encode(param0, param1);
          param1.writeBits((byte) 72, this.field_G, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "kt.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    FacePlayerMountComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_G = 4;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        FacePlayerLocomotor var5 = null;
        ModelCodec var6 = null;
        TrapBaseModel var7 = null;
        Trap var8 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new Trap(param2, param0);
          var8.setSize((byte) -11, this.height, this.width);
          var8.setObstructionLevel(param1, 0);
          var8.setCollisionLevel(1, (byte) -12, true);
          var8.setWeight((byte) -3, 6);
          var8.setFloating((byte) 17, false);
          var8.setPushMode(126, 2);
          var8.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new FacePlayerLocomotor(param2, param0);
          var5.a(8 * this.field_G, (byte) 127);
          var8.addLocomotor(var5, 0);
          var6 = rm.field_a;
          var7 = (TrapBaseModel) (var6.createModel(16, param1 ^ 82));
          var7.b(8022, 2);
          var8.addModel(var5, (byte) 124, var7);
          stackIn_1_0 = var8;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("kt.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(62, 2097152, 2097152);
        this.setMounts((byte) 109, new ComponentMount[]{new ComponentMount(0, 0, 2097152, 0, 8)});
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
          return 7;
        }
        return 7;
    }

    FacePlayerMountComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_G = 4;
        try {
          this.field_G = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "kt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_F = null;
        if (param0 > -74) {
          field_F = (ta) null;
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
          return true;
        }
        return true;
    }

    static {
        field_H = "Service unavailable";
    }
}
