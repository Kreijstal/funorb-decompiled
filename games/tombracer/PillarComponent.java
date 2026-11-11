/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PillarComponent extends PrefabComponent {
    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        SimpleBlockBehaviour var5 = null;
        ModelCodec var6 = null;
        FurnitureModel var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var4.setWeight((byte) -3, 20);
          var5 = new SimpleBlockBehaviour(param2, param0);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var4.setFloating((byte) 17, false);
          var4.setCollisionLevel(1, (byte) -12, false);
          var4.setObstructionLevel(3, param1 - 3);
          var6 = rm.field_a;
          var7 = (FurnitureModel) (var6.createModel(4, 108));
          var7.setVariant(param1, (byte) 77);
          var4.addModel((TrapPart) null, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("m.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "m.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    PillarComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          this.applyDefaults((byte) -16);
          return false;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return true;
    }

    final static int A(int param0) {
        if (!SnakePitTile.a(false)) {
          return -1;
        }
        if (param0 == -7111) {
          return ModelFactory.field_a.topDialogWidth(param0 ^ 7110);
        }
        String var2 = (String) null;
        PillarComponent.loadAnimationSequence((String) null, 34, (ResourceArchive) null, (String) null);
        return ModelFactory.field_a.topDialogWidth(param0 ^ 7110);
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return false;
    }

    PillarComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(-91, 2097152, 2097152);
    }

    final static RoomHeader decodeRoomHeader(int param0, BitPacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RoomHeader stackIn_2_0 = null;
        RoomHeader stackIn_5_0 = null;
        RoomHeader stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = new RoomHeader();
            return stackIn_2_0;
          }
          var2_int = param1.readBits((byte) 44, 8);
          if (param0 == -1) {
            stackIn_7_0 = new RoomHeader(var2_int, param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = (RoomHeader) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("m.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return 47;
        }
        return 7;
    }

    final static AnimationSequence loadAnimationSequence(String param0, int param1, ResourceArchive param2, String param3) {
        RuntimeException var4 = null;
        AnimationSequence stackIn_2_0 = null;
        AnimationSequence stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -123) {
            stackIn_4_0 = new AnimationSequence(param2, param3, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (AnimationSequence) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("m.SB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    static {
    }
}
