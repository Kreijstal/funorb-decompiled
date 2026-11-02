/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBurstFireMaxEnergy extends ConsoleCommand {
    static dra field_p;
    static boolean field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_o = true;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(43, 85));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ew.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          vla.field_E = param1;
          if (param0 != 1043) {
            GetBurstFireMaxEnergy.b(false);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ew.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_p = null;
    }

    GetBurstFireMaxEnergy(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        var14 = VoidHunters.field_G;
        var6 = -param3 + param1;
        var7 = param4 - param0;
        if (var6 == 0) {
          if (var7 != 0) {
            Message.a(-119, param3, param5, param4, param0);
          }
          return;
        }
        if (0 == var7) {
          SetMinimapWidth.a(param0, param1, (byte) 111, param5, param3);
          return;
        }
        if (param2 < 45) {
          return;
        }
        var12 = (var7 << 12) / var6;
        var13 = param0 - (var12 * param3 >> 12);
        if (param3 < ob.field_j) {
          var8 = ob.field_j;
          var10 = var13 + (ob.field_j * var12 >> 12);
          if (ob.field_j > param1) {
            var11 = (ob.field_j * var12 >> 12) + var13;
            var9 = ob.field_j;
          } else {
            if (GetCountermeasureLauncherProjectiles.field_o < param1) {
              var11 = var13 + (GetCountermeasureLauncherProjectiles.field_o * var12 >> 12);
              var9 = GetCountermeasureLauncherProjectiles.field_o;
            } else {
              var9 = param1;
              var11 = param4;
            }
          }
          if (NebulaField.field_c <= var11) {
            if (hab.field_i < var11) {
              var11 = hab.field_i;
              var9 = (hab.field_i - var13 << 12) / var12;
            }
          } else {
            var11 = NebulaField.field_c;
            var9 = (NebulaField.field_c - var13 << 12) / var12;
          }
          if (NebulaField.field_c > var10) {
            var10 = NebulaField.field_c;
            var8 = (-var13 + NebulaField.field_c << 12) / var12;
          } else {
            if (hab.field_i < var10) {
              var8 = (hab.field_i - var13 << 12) / var12;
              var10 = hab.field_i;
            }
          }
          SetOndamageParticleLife.a(param5, var9, -1, var10, var11, var8);
          return;
        }
        if (GetCountermeasureLauncherProjectiles.field_o < param3) {
          var10Lifetime1 = var13 + (var12 * GetCountermeasureLauncherProjectiles.field_o >> 12);
          var8Lifetime1 = GetCountermeasureLauncherProjectiles.field_o;
          if (ob.field_j > param1) {
            var11Lifetime1 = (ob.field_j * var12 >> 12) + var13;
            var9Lifetime1 = ob.field_j;
          } else {
            if (GetCountermeasureLauncherProjectiles.field_o < param1) {
              var11Lifetime1 = var13 + (GetCountermeasureLauncherProjectiles.field_o * var12 >> 12);
              var9Lifetime1 = GetCountermeasureLauncherProjectiles.field_o;
            } else {
              var9Lifetime1 = param1;
              var11Lifetime1 = param4;
            }
          }
          if (NebulaField.field_c > var11Lifetime1) {
            var11Lifetime1 = NebulaField.field_c;
            var9Lifetime1 = (NebulaField.field_c - var13 << 12) / var12;
          } else {
            if (hab.field_i < var11Lifetime1) {
              var11Lifetime1 = hab.field_i;
              var9Lifetime1 = (hab.field_i - var13 << 12) / var12;
            }
          }
          if (NebulaField.field_c > var10Lifetime1) {
            var10Lifetime1 = NebulaField.field_c;
            var8Lifetime1 = (-var13 + NebulaField.field_c << 12) / var12;
          } else {
            if (hab.field_i < var10Lifetime1) {
              var8Lifetime1 = (hab.field_i - var13 << 12) / var12;
              var10Lifetime1 = hab.field_i;
            }
          }
          SetOndamageParticleLife.a(param5, var9Lifetime1, -1, var10Lifetime1, var11Lifetime1, var8Lifetime1);
          return;
        }
        var8Lifetime2 = param3;
        var10Lifetime2 = param0;
        if (ob.field_j > param1) {
          var11Lifetime2 = (ob.field_j * var12 >> 12) + var13;
          var9Lifetime2 = ob.field_j;
          if (NebulaField.field_c > var11Lifetime2) {
            var11Lifetime2 = NebulaField.field_c;
            var9Lifetime2 = (NebulaField.field_c - var13 << 12) / var12;
          } else {
            if (hab.field_i < var11Lifetime2) {
              var11Lifetime2 = hab.field_i;
              var9Lifetime2 = (hab.field_i - var13 << 12) / var12;
            }
          }
          if (NebulaField.field_c > var10Lifetime2) {
            var10Lifetime2 = NebulaField.field_c;
            var8Lifetime2 = (-var13 + NebulaField.field_c << 12) / var12;
          } else {
            if (hab.field_i < var10Lifetime2) {
              var8Lifetime2 = (hab.field_i - var13 << 12) / var12;
              var10Lifetime2 = hab.field_i;
            }
          }
          SetOndamageParticleLife.a(param5, var9Lifetime2, -1, var10Lifetime2, var11Lifetime2, var8Lifetime2);
          return;
        }
        if (GetCountermeasureLauncherProjectiles.field_o < param1) {
          var11Lifetime3 = var13 + (GetCountermeasureLauncherProjectiles.field_o * var12 >> 12);
          var9Lifetime3 = GetCountermeasureLauncherProjectiles.field_o;
        } else {
          var9Lifetime3 = param1;
          var11Lifetime3 = param4;
        }
        if (NebulaField.field_c > var11Lifetime3) {
          var11Lifetime3 = NebulaField.field_c;
          var9Lifetime3 = (NebulaField.field_c - var13 << 12) / var12;
        } else {
          if (hab.field_i < var11Lifetime3) {
            var11Lifetime3 = hab.field_i;
            var9Lifetime3 = (hab.field_i - var13 << 12) / var12;
          }
        }
        if (NebulaField.field_c > var10Lifetime2) {
          var10Lifetime2 = NebulaField.field_c;
          var8Lifetime2 = (-var13 + NebulaField.field_c << 12) / var12;
        } else {
          if (hab.field_i < var10Lifetime2) {
            var8Lifetime2 = (hab.field_i - var13 << 12) / var12;
            var10Lifetime2 = hab.field_i;
          }
        }
        SetOndamageParticleLife.a(param5, var9Lifetime3, -1, var10Lifetime2, var11Lifetime3, var8Lifetime2);
        return;
    }

    static {
        field_o = true;
    }
}
