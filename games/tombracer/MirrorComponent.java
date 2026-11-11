/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MirrorComponent extends PrefabComponent {
    static SpriteData field_F;
    static UiComponent field_I;
    static int[] field_H;
    static TextureFilter field_G;

    final static boolean hasAnyMask55(int param0, int param1, int param2) {
        if (param0 != -17275) {
          field_F = (SpriteData) null;
        }
        return (55 & param2) != 0 ? true : false;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_H = (int[]) null;
          return false;
        }
        return false;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 ^ -66, 2097152, 2097152);
    }

    final static boolean hasAnyMask384(int param0, int param1, int param2) {
        if (param0 != -26571) {
          field_G = (TextureFilter) null;
        }
        return (384 & param1) != 0 ? true : false;
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_F = null;
        if (param0 != 4) {
          field_F = (SpriteData) null;
        }
        field_G = null;
        field_I = null;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          PacketBuffer var3 = (PacketBuffer) null;
          MirrorComponent.decodeTextureOperator((PacketBuffer) null, -27);
          return false;
        }
        return false;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          field_H = (int[]) null;
        }
        return 7;
    }

    MirrorComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final static TextureOperator decodeTextureOperator(PacketBuffer param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        TextureOperator var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        TextureOperator stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          param0.readUnsignedByte(255);
          var2_int = param0.readUnsignedByte(param1 + 255);
          var3 = TreasureValuesOverlay.createTextureOperator((byte) -62, var2_int);
          var3.cacheRowCount = param0.readUnsignedByte(param1 + 255);
          var4 = param0.readUnsignedByte(param1 ^ 255);
          for (var5 = param1; var5 < var4; var5++) {
            var6 = param0.readUnsignedByte(param1 + 255);
            var3.decodeParameter((byte) 107, param0, var6);
          }
          var3.onDecoded((byte) 116);
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("aw.TB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    MirrorComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "aw.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return true;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        SimpleBlockBehaviour var5 = null;
        Trap var6 = null;
        MirrorBehaviour var7 = null;
        ModelCodec var8 = null;
        int var10 = 0;
        Trap var11 = null;
        TrapBaseModel var12 = null;
        TrapBaseModel var13 = null;
        BlockModel var14 = null;
        Trap stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var11 = new Trap(param2, param0);
          var4 = var11;
          var11.setSize((byte) -11, this.height, this.width);
          var11.setWeight((byte) -3, 4);
          var11.setObstructionLevel(param1, param1 - 3);
          if (this.typeId != 19) {
            var11.setPushable(false, 120);
          } else {
            var11.setPushable(true, 117);
          }
          var11.setPushMode(104, 1);
          var11.setFloating((byte) 17, false);
          var11.setCollisionLevel(1, (byte) -12, true);
          var5 = new SimpleBlockBehaviour(param2, param0);
          var5.setPassesBeams(-28592, true);
          var11.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = new Trap(param2, param0);
          var6.setSize((byte) -11, this.height, this.width);
          var6.setWeight((byte) -3, 0);
          var7 = new MirrorBehaviour(param2, param0);
          var6.addBehaviour((byte) 83, (Behaviour) (var7));
          var11.addChild(-98, var6);
          var8 = rm.field_a;
          if (this.typeId != 19) {
            var13 = (TrapBaseModel) (var8.createModel(16, param1 ^ 105));
            var13.setVariant(8022, 4);
            var11.addModel((TrapPart) null, (byte) 124, var13);
          } else {
            var12 = (TrapBaseModel) (var8.createModel(16, 127));
            var12.setVariant(param1 + 8019, 1);
            var11.addModel((TrapPart) null, (byte) 124, var12);
          }
          var14 = (BlockModel) (var8.createModel(7, 125));
          var14.setVariant(param1 + 116, 9);
          var11.addModel(var7, (byte) 124, var14);
          stackIn_8_0 = var11;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("aw.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_H = new int[]{0};
        field_G = new TextureFilter();
    }
}
