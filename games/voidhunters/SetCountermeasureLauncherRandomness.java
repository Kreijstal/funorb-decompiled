/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetCountermeasureLauncherRandomness extends ConsoleCommand {
    static llb field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(80, 62, arguments[0].intValue(109));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("aha.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = VoidHunters.field_G;
        try {
          var5_int = param2 + param1;
          var6 = param3 + param0;
          if (param2 <= SoftwareRasterizer2D.clipLeft) {
            stackIn_4_0 = SoftwareRasterizer2D.clipLeft;
          } else {
            stackIn_4_0 = param2;
          }
          var7 = stackIn_4_0;
          if (SoftwareRasterizer2D.clipTop < param0) {
            stackIn_7_0 = param0;
          } else {
            stackIn_7_0 = SoftwareRasterizer2D.clipTop;
          }
          var8 = stackIn_7_0;
          if (param4 >= -41) {
            SetCountermeasureLauncherRandomness.clearSharedReferences(110);
          }
          if (SoftwareRasterizer2D.clipRight <= var5_int) {
            stackIn_12_0 = SoftwareRasterizer2D.clipRight;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 < SoftwareRasterizer2D.clipBottom) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = SoftwareRasterizer2D.clipBottom;
          }
          var10 = stackIn_15_0;
          if (param2 >= SoftwareRasterizer2D.clipLeft &&
            SoftwareRasterizer2D.clipRight > param2) {
            var11 = SoftwareRasterizer2D.width * var8 + param2;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              SoftwareRasterizer2D.pixels[var11] = 16777215;
              var11 = var11 + 2 * SoftwareRasterizer2D.width;
            }
          }
          if (SoftwareRasterizer2D.clipTop <= param0 &&
            var6 < SoftwareRasterizer2D.clipBottom) {
            var11Lifetime1 = SoftwareRasterizer2D.width * param0 + var7;
            var12Lifetime1 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              SoftwareRasterizer2D.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= SoftwareRasterizer2D.clipLeft &&
            var5_int < SoftwareRasterizer2D.clipRight) {
            var11Lifetime2 = (var8 + (var5_int - param2 & 1)) * SoftwareRasterizer2D.width + var5_int;
            var12Lifetime2 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              SoftwareRasterizer2D.pixels[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + SoftwareRasterizer2D.width * 2;
            }
          }
          if (SoftwareRasterizer2D.clipTop <= param0) {
            if (SoftwareRasterizer2D.clipBottom <= var6) {
              return;
            }
            var11Lifetime3 = SoftwareRasterizer2D.width * var6 + var7 + (1 & -param0 + var6);
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                return;
              }
              SoftwareRasterizer2D.pixels[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var5), "aha.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != 1511754497) {
          SetCountermeasureLauncherRandomness.a(-121, 80, -93, -27, (byte) -68);
        }
    }

    SetCountermeasureLauncherRandomness(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
