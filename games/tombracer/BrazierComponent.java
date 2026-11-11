/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrazierComponent extends PrefabComponent {
    BrazierComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param3 > param0) {
          C2SRoomResultPacket.fillRange((byte) -55, param1, param3, vaa.field_a[param2], param0);
          return;
        }
        C2SRoomResultPacket.fillRange((byte) -55, param1, param0, vaa.field_a[param2], param3);
        if (!param4) {
          return;
        }
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          this.usesBehaviourModels(71);
          return false;
        }
        return false;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 + 174, 2097152, 2097152);
    }

    BrazierComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final static uca[] readLogoMaterials(BitPacketBuffer param0, byte param1) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        uca[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uca[] var4 = null;
        int var6 = 0;
        uca var6_ref_uca = null;
        int var7 = 0;
        int var6Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param0.readBits((byte) 44, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (uca[]) (stackIn_3_0);
          }
          var3 = param0.readBits((byte) 44, 12);
          var4 = new uca[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!CircleMovementLocomotor.readBitFlag(5907, param0)) {
              var6 = param0.readBits((byte) 44, nma.signedBitLength(false, var5 - 1));
              var4[var5] = var4[var6];
            } else {
              var6_ref_uca = new uca();
              param0.readBits((byte) 44, 24);
              param0.readBits((byte) 44, 24);
              var6_ref_uca.field_e = param0.readBits((byte) 44, 24);
              param0.readBits((byte) 44, 9);
              param0.readBits((byte) 44, 12);
              param0.readBits((byte) 44, 12);
              param0.readBits((byte) 44, 12);
              var4[var5] = var6_ref_uca;
            }
          }
          var6Lifetime1 = 64 % ((param1 + 52) / 37);
          stackIn_12_0 = var4;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("uea.SB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return -20;
        }
        return 7;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "uea.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          this.getRenderLayer(7);
          return false;
        }
        return false;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          this.applyDefaults((byte) 37);
          return true;
        }
        return true;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        SimpleBlockBehaviour var5 = null;
        ModelCodec var6 = null;
        FurnitureModel var7 = null;
        LightSourceModel var8 = null;
        Trap var9 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var9.setWeight((byte) -3, 5);
          var5 = new SimpleBlockBehaviour(param2, param0);
          var9.addBehaviour((byte) 83, (Behaviour) (var5));
          var9.setFloating((byte) 17, false);
          var9.setCollisionLevel(1, (byte) -12, false);
          var9.setObstructionLevel(3, param1 - 3);
          var6 = rm.field_a;
          var7 = (FurnitureModel) (var6.createModel(4, 91));
          var7.b(0, (byte) 77);
          var9.addModel((TrapPart) null, (byte) 124, var7);
          var8 = (LightSourceModel) (var6.createModel(5, 74));
          var8.setElevationOffset(64, 122);
          var8.a(true, 16633231);
          var8.b(1, 128);
          var8.a(0, param1, 1, true);
          var9.addModel((TrapPart) null, (byte) 124, var8);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uea.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
    }
}
