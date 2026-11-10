/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CActionPacket extends IntrusiveNode implements GamePacket {
    private int[][] playerOrders;
    static String field_g;
    private boolean[] hasPlayerOrders;

    public final void decode(BitPacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          param0.beginBitAccess((byte) 125);
          for (var3_int = 0; this.playerOrders.length > var3_int; var3_int++) {
            stackIn_5_0 = this.hasPlayerOrders;
            stackIn_5_1 = var3_int;
            stackIn_6_2 = (param0.readBits((byte) 44, 1) == 1);
            stackIn_5_0[stackIn_5_1] = stackIn_6_2;
            if (this.hasPlayerOrders[var3_int]) {
              for (var4 = 0; var4 < this.playerOrders[var3_int].length; var4++) {
                this.playerOrders[var3_int][var4] = vp.a(param0.readBits((byte) 44, 7), param1 - 6468);
              }
            }
          }
          if (param1 != -19) {
            this.hasPlayerOrders = (boolean[]) null;
            param0.endBitAccess((byte) 98);
          } else {
            param0.endBitAccess((byte) 98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("tt.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "S2CActionPacket playerOrders:";
        for (var2 = 0; this.playerOrders.length > var2; var2++) {
          var1 = var1 + " " + this.hasPlayerOrders[var2];
        }
        return var1;
    }

    final static Weapon createWeaponPreset(int param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -1) {
          S2CActionPacket.a(59);
        }
        var2 = param1;
        if (4 == var2) {
          return eo.D((byte) -110);
        }
        if (var2 == 0) {
          return gda.a(true);
        }
        if (var2 == 1) {
          return ik.b(-17698);
        }
        if (2 == var2) {
          return mr.a((byte) 125);
        }
        throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        try {
          param1.beginBitWrite(8);
          var3_int = 0;
          if (param0 != 200) {
            this.hasPlayerOrders = (boolean[]) null;
          }
          while (var3_int < this.playerOrders.length) {
            param1.writeBits((byte) 71, this.hasPlayerOrders[var3_int] ? 1 : 0, 1);
            if (this.hasPlayerOrders[var3_int]) {
              for (var4 = 0; var4 < this.playerOrders[var3_int].length; var4++) {
                param1.writeBits((byte) -23, uja.a(-47, this.playerOrders[var3_int][var4]), 7);
              }
            }
            var3_int++;
          }
          param1.endBitWrite(param0 - 1826190886);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tt.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
          cn var2 = (cn) null;
          S2CActionPacket.a((cn) null, (byte) -100);
        }
        field_g = null;
    }

    final static boolean a(cn param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 101 / ((param1 - 15) / 60);
          stackIn_1_0 = param0.a(0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("tt.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1) {
        if (param0) {
          return true;
        }
        return this.hasPlayerOrders[param1];
    }

    S2CActionPacket(int param0) {
        this.playerOrders = new int[param0][8];
        this.hasPlayerOrders = new boolean[param0];
    }

    final int a(boolean param0, int param1, int param2) {
        if (param0) {
          cn var5 = (cn) null;
          S2CActionPacket.a((cn) null, (byte) 42);
        }
        return this.playerOrders[param1][param2];
    }

    static {
        field_g = "Return to Main Menu";
    }
}
