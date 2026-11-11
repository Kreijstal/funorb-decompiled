/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TorchComponent extends PrefabComponent {
    static boolean field_F;

    TorchComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        ModelCodec var5 = null;
        FurnitureModel var6 = null;
        LightSourceModel var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          var4.setSize((byte) -11, this.height, this.width);
          var4.setWeight((byte) -3, 5);
          var5 = rm.field_a;
          var6 = (FurnitureModel) (var5.createModel(4, 80));
          var6.setVariant(1, (byte) 77);
          var4.addModel((TrapPart) null, (byte) 124, var6);
          var7 = (LightSourceModel) (var5.createModel(5, 88));
          var7.setElevationOffset(64, 119);
          var7.a(true, 16633231);
          var7.b(1, 96);
          var7.a(0, param1, 1, true);
          var4.addModel((TrapPart) null, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ve.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          if (param0) {
            field_F = true;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ve.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          return -121;
        }
        return 7;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          field_F = false;
          return false;
        }
        return false;
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 + 29, 2097152, 2097152);
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
          return false;
        }
        return false;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          Room var3 = (Room) null;
          this.createTrap(true, 119, (Room) null);
          return true;
        }
        return true;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          Room var3 = (Room) null;
          this.createTrap(false, -64, (Room) null);
          return false;
        }
        return false;
    }

    TorchComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_F = false;
    }
}
