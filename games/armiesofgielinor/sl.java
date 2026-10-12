/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_a;
    int field_d;
    int field_e;
    byte[] field_c;
    int field_h;
    int field_g;
    static String field_i;
    boolean field_f;
    int[] field_j;
    private int field_b;

    final boolean a(int param0, int param1, CipherPacketBuffer param2) {
        RuntimeException var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_c) {
            return true;
          }
          param2.readBytes(0, param0, this.field_b, this.field_c);
          if (param1 != -1) {
            return true;
          }
          this.field_b = this.field_b + param0;
          stackIn_9_0 = !(this.field_b < this.field_c.length);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("sl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, PacketBuffer param1) {
        try {
          this.b(8, param1);
          param1.a(this.field_c, param0, this.field_c.length, 104);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "sl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        PacketBuffer stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param1.writeByte(1, this.field_g);
          param1.writeByte(param0 - 7, this.field_e);
          param1.writeShort(true, this.field_d);
          stackIn_3_0 = (PacketBuffer) (param1);
          stackIn_3_1 = true;
          if (this.field_f) {
            stackIn_4_2 = 1;
          } else {
            stackIn_4_2 = 0;
          }
          ((PacketBuffer) (Object) stackIn_3_0).writeShort(stackIn_3_1, stackIn_4_2);
          if (this.field_j != null) {
            param1.writeByte(1, this.field_j.length);
            for (var3_int = 0; this.field_j.length > var3_int; var3_int++) {
              param1.writeInt((byte) -74, this.field_j[var3_int]);
            }
          } else {
            param1.writeByte(1, 0);
          }
          param1.writeByte(1, this.field_h);
          param1.writeInt((byte) -72, this.field_c.length);
          if (param0 != 8) {
            sl.a(25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        int var1 = -54 % ((param0 + 65) / 39);
    }

    sl(PacketBuffer param0, int param1, boolean param2) {
        int var5 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        try {
          this.field_b = -1;
          this.field_g = param0.readUnsignedByte(0);
          this.field_e = param0.readUnsignedByte(0);
          this.field_d = param0.readUnsignedShort((byte) -104);
          stackIn_4_1 = (param0.readUnsignedShort((byte) -104) == 1);
          this.field_f = stackIn_4_1;
          if (param1 > 7) {
            var4_int = param0.readUnsignedByte(0);
            if (var4_int > 0) {
              this.field_j = new int[var4_int];
              for (var5 = 0; var5 < this.field_j.length; var5++) {
                this.field_j[var5] = param0.readInt(1);
              }
            }
            if (param1 > 8) {
              this.field_h = param0.readUnsignedByte(0);
            }
          }
          var4_intLifetime1 = param0.readInt(1);
          if (var4_intLifetime1 < 100000 &&
            var4_intLifetime1 > 0) {
            this.field_c = new byte[var4_intLifetime1];
            if (param2) {
              this.field_b = 0;
              return;
            }
            this.field_b = -1;
            param0.readBytes(0, var4_intLifetime1, 0, this.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("sl.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    sl(int param0, int param1, Battlefield param2, int param3, boolean param4) {
        PacketBuffer var7 = null;
        try {
          this.field_e = param1;
          this.field_g = param0;
          this.field_b = -1;
          var7 = new PacketBuffer(30000);
          param2.writeLegacySnapshot(var7, -25771, param2.campaignMission.playerSlot);
          this.field_c = var7.g((byte) -82);
          this.field_h = param2.eliminatedPlayerMask;
          this.field_f = param4 ? true : false;
          this.field_d = param3;
          this.field_j = new int[param2.playerMana.length];
          vm.a(param2.playerMana, 0, this.field_j, 0, param2.playerMana.length);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "sl.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Elixirs to improve the abilities of your units.";
        field_i = "Rating";
    }
}
