/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PushableMountComponent extends PrefabComponent {
    static efa field_F;

    final void encode(boolean param0, BitPacketBuffer param1) {
        if (param0) {
          return;
        }
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "md.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 + 213, 2097152, 2097152);
        this.setMounts((byte) 80, new ComponentMount[]{new ComponentMount(0, 0, 2097152, 0, 40)});
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_F = (efa) null;
          return false;
        }
        return false;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_F = (efa) null;
          return false;
        }
        return false;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        SimpleBlockBehaviour var5 = null;
        ModelCodec var6 = null;
        BlockModel var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var4.setWeight((byte) -3, 4);
          var4.setObstructionLevel(param1, param1 ^ 3);
          var4.setPushable(true, 122);
          var4.setPushMode(112, 1);
          var4.setFloating((byte) 17, false);
          var4.setCollisionLevel(1, (byte) -12, true);
          var5 = new SimpleBlockBehaviour(param2, param0);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (BlockModel) (var6.createModel(7, 103));
          var7.setVariant(125, 0);
          var4.addModel((TrapPart) null, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("md.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.getRenderLayer(100);
          return 7;
        }
        return 7;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          PushableMountComponent.releaseStatics(-92);
          return false;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        if (param0 < 96) {
          PushableMountComponent.releaseStatics(19);
          field_F = null;
          return;
        }
        field_F = null;
    }

    PushableMountComponent(Room param0, int param1) {
        super(param0, param1);
    }

    PushableMountComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          field_F = (efa) null;
          return false;
        }
        return false;
    }

    static {
    }
}
