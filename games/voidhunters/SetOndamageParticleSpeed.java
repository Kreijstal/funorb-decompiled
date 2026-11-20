/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetOndamageParticleSpeed extends ConsoleCommand {
    static int[] field_o;
    static boolean field_p;

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != 2051507073) {
          SetOndamageParticleSpeed.clearSharedReferences(-30);
        }
    }

    SetOndamageParticleSpeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          UiAngleDialRenderer.field_a = arguments[0].intValue(50);
          if (obfuscationGuard > -119) {
            SetOndamageParticleSpeed.a(15, 1, 90, -10, -70, -82, 78, -25);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vbb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int var40Lifetime1;
        int var41Lifetime1;
        int var42Lifetime1;
        int var43Lifetime1;
        var47 = VoidHunters.field_G;
        try {
          var8_int = 0;
          var9 = param7;
          var10 = 0;
          var11 = param5 - param3;
          var12 = param7 - param3;
          var13 = param5 * param5;
          var14 = param7 * param7;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << 1;
          if (param0 != 2051507073) {
            SetOndamageParticleSpeed.pushRasterState(-74);
          }
          var18 = var13 << 1;
          var19 = var16 << 1;
          var20 = var15 << 1;
          var21 = param7 << 1;
          var22 = var12 << 1;
          var23 = var17 + var13 * (-var21 + 1);
          var24 = -(var18 * (var21 - 1)) + var14;
          var25 = var15 * (-var22 + 1) + var19;
          var26 = -((-1 + var22) * var20) + var16;
          var27 = var13 << 2;
          var28 = var14 << 2;
          var29 = var15 << 2;
          var30 = var16 << 2;
          var31 = 3 * var17;
          var32 = (-3 + var21) * var18;
          var33 = 3 * var19;
          var34 = (-3 + var22) * var20;
          var35 = var28;
          var36 = var27 * (-1 + param7);
          var37 = var30;
          var38 = var29 * (-1 + var12);
          if (param2 >= NebulaField.field_c &&
            param2 <= EnvironmentReflectionGpuMaterialEffect.field_i) {
            var57 = ResourceNode.field_b[param2];
            var40 = IntrusiveNode.clamp(param0 ^ 2051537426, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, -param5 + param6);
            var41 = IntrusiveNode.clamp(31123, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, param5 + param6);
            var42 = IntrusiveNode.clamp(31123, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, param6 - var11);
            var43 = IntrusiveNode.clamp(param0 ^ 2051537426, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, param6 + var11);
            GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var42, var57, (byte) 75, var40);
            GetSalvoRepairTimeMultiplier.fillArraySpan(param4, var43, var57, (byte) 75, var42);
            GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var41, var57, (byte) 75, var43);
          }
          while (true) {
            if (var9 <= 0) {
              return;
            }
            stackIn_10_0 = (var12 < var9) ? 0 : 1;
            var39 = stackIn_10_0;
            if (var23 < 0) {
              while (var23 < 0) {
                var24 = var24 + var35;
                var23 = var23 + var31;
                var8_int++;
                var31 = var31 + var28;
                var35 = var35 + var28;
              }
            }
            if (var39 != 0) {
              if (var25 < 0) {
                while (var25 < 0) {
                  var26 = var26 + var37;
                  var25 = var25 + var33;
                  var37 = var37 + var30;
                  var33 = var33 + var30;
                  var10++;
                }
              }
              if (var26 < 0) {
                var25 = var25 + var33;
                var26 = var26 + var37;
                var33 = var33 + var30;
                var10++;
                var37 = var37 + var30;
              }
              var26 = var26 - var34;
              var25 = var25 - var38;
              var38 = var38 - var29;
              var34 = var34 - var29;
            }
            if (var24 < 0) {
              var23 = var23 + var31;
              var24 = var24 + var35;
              var31 = var31 + var28;
              var8_int++;
              var35 = var35 + var28;
            }
            var23 = var23 - var36;
            var24 = var24 - var32;
            var36 = var36 - var27;
            var9--;
            var32 = var32 - var27;
            var40Lifetime1 = -var9 + param2;
            var41Lifetime1 = var9 + param2;
            if (var41Lifetime1 < NebulaField.field_c) {
              continue;
            }
            if (var40Lifetime1 > EnvironmentReflectionGpuMaterialEffect.field_i) {
              continue;
            }
            var42Lifetime1 = IntrusiveNode.clamp(31123, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, var8_int + param6);
            var43Lifetime1 = IntrusiveNode.clamp(31123, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, param6 - var8_int);
            if (var39 == 0) {
              if (var40Lifetime1 >= NebulaField.field_c) {
                GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var42Lifetime1, ResourceNode.field_b[var40Lifetime1], (byte) 75, var43Lifetime1);
              }
              if (var41Lifetime1 > EnvironmentReflectionGpuMaterialEffect.field_i) {
                continue;
              }
              GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var42Lifetime1, ResourceNode.field_b[var41Lifetime1], (byte) 75, var43Lifetime1);
              continue;
            }
            var44 = IntrusiveNode.clamp(param0 - 2051475950, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, var10 + param6);
            var45 = IntrusiveNode.clamp(31123, OpenGlTexture3D.field_j, GetCountermeasureLauncherProjectiles.field_o, param6 - var10);
            if (var40Lifetime1 >= NebulaField.field_c) {
              var58 = ResourceNode.field_b[var40Lifetime1];
              GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var45, var58, (byte) 75, var43Lifetime1);
              GetSalvoRepairTimeMultiplier.fillArraySpan(param4, var44, var58, (byte) 75, var45);
              GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var42Lifetime1, var58, (byte) 75, var44);
            }
            if (var41Lifetime1 > EnvironmentReflectionGpuMaterialEffect.field_i) {
              continue;
            }
            var59 = ResourceNode.field_b[var41Lifetime1];
            GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var45, var59, (byte) 75, var43Lifetime1);
            GetSalvoRepairTimeMultiplier.fillArraySpan(param4, var44, var59, (byte) 75, var45);
            GetSalvoRepairTimeMultiplier.fillArraySpan(param1, var42Lifetime1, var59, (byte) 75, var44);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var8), "vbb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void pushRasterState(int param0) {
        SoftwareRasterState var1 = (SoftwareRasterState) (GetPlayerRepairTime.rasterStatePool.removeLast((byte) -113));
        if (var1 == null) {
          var1 = new SoftwareRasterState();
        }
        if (param0 != 3) {
          SetOndamageParticleSpeed.pushRasterState(15);
        }
        var1.setState(SoftwareRasterizer2D.height, SoftwareRasterizer2D.pixels, SoftwareRasterizer2D.clipTop, (byte) -88, SoftwareRasterizer2D.clipRight, SoftwareRasterizer2D.clipBottom, SoftwareRasterizer2D.width, SoftwareRasterizer2D.clipLeft);
        NineSliceSprite.rasterStateStack.addLast(-10258, var1);
    }

    static {
        field_p = true;
        field_o = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
