/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s implements qk {
    static int field_a;
    static String field_b;

    final static void b(int param0) {
        int var1 = 0;
        if (32 < ll.field_q) {
          var1 = ll.field_q % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          ef.a(1, -var1 + ll.field_q);
        } else {
          ef.a(1, 0);
        }
        if (param0 < 124) {
          field_b = (String) null;
        }
    }

    final static void a(PacketBuffer param0, int param1, int param2, int param3, int param4) {
        try {
          param0.writeByte((byte) 112, param1);
          param0.writeShort(17, 77);
          param0.writeShort(param3, 107);
          param0.writeShort(param2, param1 + 108);
          param0.writeByte((byte) 109, param4);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "s.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != -1) {
            for (var6_int = 0; 11 > var6_int; var6_int++) {
              var7 = 10;
              if (var6_int < 5) {
                var7 = var6_int * 2 + 2;
              }
              if (5 < var6_int) {
                var7 = (-var6_int + 10) * 2 + 2;
              }
              if (!param2) {
                SoftwareRaster.g(param4 - 5, var6_int + param3 - 5, var7, param0);
              } else {
                SoftwareRaster.g(6 + (param4 - var7), param3 - 5 + var6_int, var7, param0);
              }
            }
          }
          if (-1 != param5) {
            if (!param2) {
              SoftwareRaster.d(-5 + param4, param3 - 5, 11, param5);
              SoftwareRaster.d(param4 - 4, param3 - 5, 5 + param4, param3, param5);
              SoftwareRaster.d(-4 + param4, 5 + param3, param4 + 5, param3, param5);
            } else {
              SoftwareRaster.d(param4 + 5, param3 - 5, 11, param5);
              SoftwareRaster.d(param4 + 4, param3 - 5, -5 + param4, param3, param5);
              SoftwareRaster.d(4 + param4, 5 + param3, param4 - 5, param3, param5);
            }
          }
          if (param4 != -1) {
            return;
          }
          var6_intLifetime1 = param4 - 10;
          var7Lifetime1 = param4 + 10;
          if (param0 != -1) {
            SoftwareRaster.a(var6_intLifetime1, -2 + param3, 20, 5, param0);
            for (var8 = 0; 5 > var8; var8++) {
              if (!param2) {
                SoftwareRaster.d(-var8 + 3 + var7Lifetime1, param3, -7 + (-var8 + 3) + var7Lifetime1, param3 - 7, param0);
                SoftwareRaster.d(var7Lifetime1 + 3 - var8, param3, -7 - var8 + (var7Lifetime1 + 3), 7 + param3, param0);
              } else {
                SoftwareRaster.d(-3 + var6_intLifetime1 + var8, param3, 7 + var6_intLifetime1 + (-3 + var8), param3 - 7, param0);
                SoftwareRaster.d(var8 + var6_intLifetime1 - 3, param3, 7 + (-3 + var6_intLifetime1) + var8, 7 + param3, param0);
              }
            }
          }
          if (param5 != -1) {
            if (param2) {
              SoftwareRaster.d(var6_intLifetime1 - 3, param3, 4 + var6_intLifetime1, -7 + param3, param5);
              SoftwareRaster.g(var6_intLifetime1 + 4, param3 - 7, 4, param5);
              SoftwareRaster.d(8 + var6_intLifetime1, param3 - 7, var6_intLifetime1 + 4, param3 - 3, param5);
              SoftwareRaster.g(4 + var6_intLifetime1, param3 - 3, 16, param5);
              SoftwareRaster.d(var6_intLifetime1 - 3, param3, 4 + var6_intLifetime1, 7 + param3, param5);
              SoftwareRaster.g(4 + var6_intLifetime1, 7 + param3, 4, param5);
              SoftwareRaster.d(var6_intLifetime1 + 8, 7 + param3, var6_intLifetime1 + 4, param3 + 3, param5);
              SoftwareRaster.g(var6_intLifetime1 + 4, param3 + 3, 16, param5);
              SoftwareRaster.d(var7Lifetime1 - 1, param3 - 3, 6, param5);
            } else {
              SoftwareRaster.d(3 + var7Lifetime1, param3, -4 + var7Lifetime1, -7 + param3, param5);
              SoftwareRaster.g(-4 + var7Lifetime1 - 4, param3 - 7, 4, param5);
              SoftwareRaster.d(var7Lifetime1 - 8, -7 + param3, var7Lifetime1 - 4, -3 + param3, param5);
              SoftwareRaster.g(-16 + (-4 + var7Lifetime1), param3 - 3, 16, param5);
              SoftwareRaster.d(3 + var7Lifetime1, param3, var7Lifetime1 - 4, 7 + param3, param5);
              SoftwareRaster.g(-8 + var7Lifetime1, 7 + param3, 4, param5);
              SoftwareRaster.d(-8 + var7Lifetime1, param3 + 7, -4 + var7Lifetime1, 3 + param3, param5);
              SoftwareRaster.g(-4 + var7Lifetime1 - 16, param3 + 3, 16, param5);
              SoftwareRaster.d(var6_intLifetime1, param3 - 3, 6, param5);
            }
          }
          if (!param1) {
            s.b(-92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "s.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param1) {
          field_a = 125;
        }
        var2 = param0;
        if (var2 == 0) {
          return 1;
        }
        if (1 == var2) {
          return 2;
        }
        if (var2 == 2) {
          return 3;
        }
        if (var2 == 3) {
          return 4;
        }
        if (var2 == 4) {
          return 5;
        }
        if (var2 == 20) {
          return 10;
        }
        if (var2 == 5) {
          return 1;
        }
        if (var2 == 6) {
          return 2;
        }
        if (var2 == 7) {
          return 3;
        }
        if (var2 == 8) {
          return 4;
        }
        if (var2 == 9) {
          return 5;
        }
        if (var2 == 10) {
          return 1;
        }
        if (var2 == 11) {
          return 2;
        }
        if (12 == var2) {
          return 5;
        }
        if (var2 == 13) {
          return 10;
        }
        if (14 == var2) {
          return 20;
        }
        return 0;
    }

    final static void a(int param0) {
        if (ag.field_p != null) {
          ag.field_p.g((byte) 103);
        }
        if (r.field_r != null) {
          r.field_r.m(-13521);
        }
        ca.d(-30603);
        if (param0 != 10) {
          field_b = (String) null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -115 % ((param0 - 47) / 58);
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RgbSprite var8 = null;
        try {
          if (param2 != -30) {
            s.a((byte) -83);
          }
          var6_int = param0 + param1.field_o;
          var7 = param1.field_z + param4;
          DualNodeDeque.a(var7, param1.field_x, param1.field_E, var6_int, (byte) 120);
          var8 = t.field_i[1];
          if (param1 instanceof oa &&
            ((oa) (param1)).field_T) {
            var8.a(1 + (var6_int + (param1.field_x - var8.field_z >> 1)), (-var8.field_B + param1.field_E >> 1) + (1 + var7), 256);
          }
          if (param1.d(0)) {
            ha.a(var6_int + 2, -4 + param1.field_x, -4 + param1.field_E, param2 + 30, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("s.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static short[] a(short[] param0, int param1, CipherPacketBuffer param2, boolean param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CipherPacketBuffer var9 = null;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          var4_int = param2.readBits(-118, param1);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          var5 = param2.readBits(20, 4);
          var6 = (short)param2.readBits(-91, 16);
          if (param3) {
            var9 = (CipherPacketBuffer) null;
            s.a((short[]) null, 108, (CipherPacketBuffer) null, false);
          }
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(var6 + param2.readBits(36, var5));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("s.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_b = "<%0> has lost connection.";
    }
}
