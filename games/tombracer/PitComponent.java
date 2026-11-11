/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PitComponent extends PrefabComponent {
    private int field_F;
    static int field_H;
    static ResourceArchive field_G;
    static int[] field_I;

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          this.hasSize(40);
          return true;
        }
        return true;
    }

    PitComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.formatVersion < 21) {
            return;
          }
          this.field_F = param2.readBits((byte) 44, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("oma.<init>(");
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

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) 24, this.field_F, 2);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "oma.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          PitComponent.releaseStatics((byte) 9);
          return 4;
        }
        return 4;
    }

    final boolean usesBehaviourModels(int param0) {
        if (param0 != 0) {
          field_H = 119;
          return false;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 24) {
          field_G = (ResourceArchive) null;
          field_I = null;
          field_G = null;
          return;
        }
        field_I = null;
        field_G = null;
    }

    PitComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return false;
    }

    final void offsetPosition(int param0, boolean param1) {
        super.offsetPosition(param0, param1);
        int var3 = this.x;
        int var4 = this.y;
        int var5 = var3 - this.width / 2;
        int var6 = -(this.height / 2) + var4;
        int var7 = this.width / 2 + var3;
        if (var5 <= param0) {
          var5 = 0;
        }
        if (param0 >= var6) {
          var6 = 0;
        }
        int var8 = var4 + this.height / 2;
        int var9 = this.room.getWidth((byte) -86);
        if (var9 - param0 <= var7) {
          var7 = var9;
        }
        int var10 = this.room.getHeight(-104);
        var3 = (-var5 + var7) / 2 + var5;
        if (var10 - param0 <= var8) {
          var8 = var10;
        }
        var4 = (var8 - var6) / 2 + var6;
        this.width = -var5 + var7;
        this.height = -var6 + var8;
        this.x = var3;
        this.y = var4;
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          field_H = -47;
          return false;
        }
        return false;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        PitBehaviour var5 = null;
        ModelCodec var6 = null;
        PitModel var7 = null;
        int var8 = 0;
        Trap var9 = null;
        Trap stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var9 = new Trap(param2, param0);
          var9.setSize((byte) -11, this.height, this.width);
          var5 = new PitBehaviour(param2, param0);
          if (param1 != 3) {
            this.isSwitchable(48);
          }
          var9.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (PitModel) (var6.createModel(10, 111));
          var8 = this.field_F;
          if (0 == var8) {
            var7.setStyle(2097152, 0);
            var5.a(16, false);
          } else {
            if (var8 == 1) {
              var7.setStyle(param1 + 2097149, 1);
              var5.a(16, true);
            } else {
              var7.setStyle(2097152, 0);
              var5.a(16, false);
            }
          }
          var9.addModel(var5, (byte) 124, var7);
          stackIn_9_0 = var9;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("oma.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_H = 0;
        field_I = new int[2];
    }
}
