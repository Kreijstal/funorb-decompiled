/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static int field_b;
    static String field_c;
    static String[] field_a;

    public static void a(int param0) {
        if (param0 > -80) {
          fs.a((byte) 122);
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        Sprite var22 = null;
        Sprite var23 = null;
        Sprite var24 = null;
        Sprite var21 = null;
        Object var14 = null;
        int[] var18 = SoftwareRasterizer.field_a;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = SoftwareRasterizer.field_g;
        int var8 = SoftwareRasterizer.field_f;
        Sprite var9 = new Sprite(param1, param0 - param1 * 2);
        var9.e();
        SoftwareRasterizer.g(0, 0, param1, -(2 * param1) + param0, param3, param4);
        Sprite var10 = new Sprite(param1, param1);
        var10.e();
        SoftwareRasterizer.fillRect(0, 0, param1, param1, param3);
        Sprite var11 = new Sprite(16, param1);
        var11.e();
        SoftwareRasterizer.fillRect(0, 0, 16, param1, param3);
        if (param5 > 77) {
          var22 = new Sprite(param1, param1);
          var22.e();
          SoftwareRasterizer.fillRect(0, 0, param1, param1, param4);
          var23 = new Sprite(16, param1);
          var23.e();
          SoftwareRasterizer.fillRect(0, 0, 16, param1, param4);
          var14 = null;
          if (param2 > 0) {
            var24 = new Sprite(16, 16);
            var14 = var24;
            var24.e();
            SoftwareRasterizer.fillRect(0, 0, 16, 16, param2);
          }
          SoftwareRasterizer.a(var18, var7, var8);
          return new Sprite[]{var10, var11, var10, var9, (Sprite) (var14), var9, var22, var23, var22};
        }
        field_a = (String[]) null;
        Sprite var19 = new Sprite(param1, param1);
        var19.e();
        SoftwareRasterizer.fillRect(0, 0, param1, param1, param4);
        Sprite var20 = new Sprite(16, param1);
        var20.e();
        SoftwareRasterizer.fillRect(0, 0, 16, param1, param4);
        var14 = null;
        if (param2 > 0) {
          var21 = new Sprite(16, 16);
          var14 = var21;
          var21.e();
          SoftwareRasterizer.fillRect(0, 0, 16, 16, param2);
        }
        SoftwareRasterizer.a(var18, var7, var8);
        return new Sprite[]{var10, var11, var10, var9, (Sprite) (var14), var9, var19, var20, var19};
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, CipherPacketBuffer param7, int param8, int param9) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          var10_int = 59 % ((-62 - param0) / 61);
          var10_intLifetime1 = param7.l(2, 59);
          if (var10_intLifetime1 == 0) {
            if (0 == param9) {
              stackIn_29_0 = 0;
            } else {
              stackIn_29_0 = IsaacRandom.a(param9, -30273, param7);
            }
            return stackIn_29_0;
          }
          if (var10_intLifetime1 == 1) {
            if (param4 == 0) {
              stackIn_22_0 = 0;
            } else {
              stackIn_22_0 = IsaacRandom.a(param4, -30273, param7);
            }
            var11 = stackIn_22_0;
            var12 = param1;
            if (var11 < 0) {
              stackIn_25_0 = -var12 + var11;
            } else {
              stackIn_25_0 = var12 + var11;
            }
            return stackIn_25_0;
          }
          if (var10_intLifetime1 == 2) {
            if (0 == param3) {
              stackIn_6_0 = 0;
            } else {
              stackIn_6_0 = IsaacRandom.a(param3, -30273, param7);
            }
            var11Lifetime1 = stackIn_6_0;
            var12Lifetime1 = param2 + param1;
            if (0 <= var11Lifetime1) {
              stackIn_9_0 = var11Lifetime1 + var12Lifetime1;
            } else {
              stackIn_9_0 = var11Lifetime1 - var12Lifetime1;
            }
            return stackIn_9_0;
          }
          if (var10_intLifetime1 != 3) {
            throw new IllegalStateException();
          }
          if (0 != param8) {
            stackIn_15_0 = IsaacRandom.a(param8, -30273, param7);
          } else {
            stackIn_15_0 = 0;
          }
          var11Lifetime2 = stackIn_15_0;
          var12Lifetime2 = param1 + param6 + param2;
          if (0 <= var11Lifetime2) {
            stackIn_18_0 = var12Lifetime2 + var11Lifetime2;
          } else {
            stackIn_18_0 = var11Lifetime2 - var12Lifetime2;
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_32_0 = var10;
          stackIn_32_1 = new StringBuilder().append("fs.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(int param0, RenderedFootballer param1, int param2) {
        try {
          ui.g(0).a(param1, param0, true);
          if (param2 < 103) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fs.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != -126) {
          field_a = (String[]) null;
          if (PlayerStats.field_p == 0 - ButtonMenuScreen.field_l) {
            PlayerStats.field_p = PlayerStats.field_p + 1;
            return;
          }
          if (PlayerStats.field_p != -ButtonMenuScreen.field_l + 250) {
            PlayerStats.field_p = PlayerStats.field_p + 1;
            return;
          }
          PlayerStats.field_p = PlayerStats.field_p + 1;
          return;
        }
        if (PlayerStats.field_p == 0 - ButtonMenuScreen.field_l) {
          PlayerStats.field_p = PlayerStats.field_p + 1;
          return;
        }
        if (PlayerStats.field_p != -ButtonMenuScreen.field_l + 250) {
          PlayerStats.field_p = PlayerStats.field_p + 1;
          return;
        }
        PlayerStats.field_p = PlayerStats.field_p + 1;
    }

    static {
        field_c = "Staff impersonation";
        field_b = -1;
    }
}
