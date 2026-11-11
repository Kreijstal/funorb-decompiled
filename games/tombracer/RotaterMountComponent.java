/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RotaterMountComponent extends PrefabComponent {
    private int field_F;
    static double field_J;
    static IntrusiveDeque field_H;
    static int field_L;
    static fta field_G;
    static UiComponent field_K;
    static int field_I;

    public static void releaseStatics(int param0) {
        if (param0 > 19) {
          field_G = null;
          field_K = null;
          field_H = null;
          return;
        }
        RotaterMountComponent.updateMusicFadeIn((byte) 98);
        field_G = null;
        field_K = null;
        field_H = null;
    }

    final void mirror(Room param0, int param1) {
        try {
          super.mirror(param0, param1);
          this.field_F = -this.field_F;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "sua.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(-113, 2097152, 2097152);
        this.setMounts((byte) 89, new ComponentMount[]{new ComponentMount(0, 0, 2097152, 0, 8)});
    }

    final static void updateMusicFadeIn(byte param0) {
        int var1 = 0;
        if (HardwareRidgedWaterNoise.field_v < 224) {
          var1 = HardwareRidgedWaterNoise.field_v % 32;
          mp.setMusicVolume(2, -var1 + (HardwareRidgedWaterNoise.field_v + 32));
          if (param0 != 63) {
            RotaterMountComponent.A(63);
            return;
          }
          return;
        }
        mp.setMusicVolume(2, 256);
        if (param0 != 63) {
          RotaterMountComponent.A(63);
          return;
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          field_K = (UiComponent) null;
          return true;
        }
        return true;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -38, dqa.toOffsetBinary(!param0 ? true : false, this.field_F, 5), 5);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "sua.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        RotateLocomotor var5 = null;
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
          var8.setPushMode(param1 ^ 109, 2);
          var8.addBehaviour((byte) 83, (Behaviour) (new SimpleBlockBehaviour(param2, param0)));
          var5 = new RotateLocomotor(param2, param0);
          var5.setRotationSpeed((byte) -124, this.field_F * 8);
          var8.addLocomotor(var5, 0);
          var6 = rm.field_a;
          var7 = (TrapBaseModel) (var6.createModel(16, 124));
          var7.setVariant(8022, 2);
          var8.addModel(var5, (byte) 124, var7);
          stackIn_1_0 = var8;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("sua.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    RotaterMountComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_F = 4;
        try {
          this.field_F = CoinItemComponent.fromOffsetBinary(true, 5, param2.readBits((byte) 44, 5));
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "sua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_H = (IntrusiveDeque) null;
          return false;
        }
        return false;
    }

    final static byte[] decompressContainer(byte[] param0, int param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param0);
          var3 = var9.readUnsignedByte(255);
          var4 = var9.readInt(124);
          if (param1 > -99) {
            RotaterMountComponent.A(-108);
          }
          if (var4 >= 0 && (0 == PitComponent.field_H ||
            !(PitComponent.field_H < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.readBytes(var13, 0, -86, var4);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var9.readInt(-127);
            if (var5_int >= 0 && (PitComponent.field_H == 0 ||
              !(var5_int > PitComponent.field_H))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                Bzip2Decompressor.decompress(var12, var5_int, param0, var4, 9);
              } else {
                var7 = ScoreStandings.field_e;
                synchronized (var7) {
                  ScoreStandings.field_e.inflateInto((byte) -34, var12, var9);
                }
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("sua.UB(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          Room var3 = (Room) null;
          this.mirror((Room) null, -35);
          return 7;
        }
        return 7;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return false;
    }

    RotaterMountComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_F = 4;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return true;
    }

    final static goa A(int param0) {
        String var1 = cs.a((byte) -112);
        if (param0 < 46) {
          return (goa) null;
        }
        if (var1 == null) {
          return new goa(cs.a((byte) 94), CollisionGrid.a(32));
        }
        if (var1.indexOf('@') >= 0) {
          var1 = "";
          return new goa(cs.a((byte) 94), CollisionGrid.a(32));
        }
        return new goa(cs.a((byte) 94), CollisionGrid.a(32));
    }

    static {
        field_J = 0.0;
        field_H = new IntrusiveDeque();
        field_G = new fta();
    }
}
