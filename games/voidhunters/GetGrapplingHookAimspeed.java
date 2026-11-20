/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetGrapplingHookAimspeed extends ConsoleCommand {
    static Sprite[] field_o;
    static int field_p;

    GetGrapplingHookAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2) {
        if (GetRadialMenuRadius.field_o == null) {
          return -1;
        }
        if (GetUseNiceTrails.field_r > param2) {
          if (param0 != -1) {
            GetGrapplingHookAimspeed.a(109, -32, 51);
            if (SpecularGpuMaterialEffect.field_g > param2) {
              return -1;
            }
            if (param2 >= SpecularGpuMaterialEffect.field_g + GetRadialMenuRadius.field_o.width) {
              return -1;
            }
            if (SetShipPersistence.field_q > param1) {
              return -1;
            }
            if (GetRadialMenuRadius.field_o.height + SetShipPersistence.field_q <= param1) {
              return -1;
            }
            return 1;
          }
          if (SpecularGpuMaterialEffect.field_g <= param2 &&
            param2 < SpecularGpuMaterialEffect.field_g + GetRadialMenuRadius.field_o.width &&
            SetShipPersistence.field_q <= param1 &&
            GetRadialMenuRadius.field_o.height + SetShipPersistence.field_q > param1) {
            return 1;
          }
          return -1;
        }
        if (GetRadialMenuRadius.field_o.width + GetUseNiceTrails.field_r <= param2) {
          if (param0 != -1) {
            GetGrapplingHookAimspeed.a(109, -32, 51);
            if (SpecularGpuMaterialEffect.field_g <= param2 &&
              param2 < SpecularGpuMaterialEffect.field_g + GetRadialMenuRadius.field_o.width &&
              SetShipPersistence.field_q <= param1 &&
              GetRadialMenuRadius.field_o.height + SetShipPersistence.field_q > param1) {
              return 1;
            }
            return -1;
          }
          if (SpecularGpuMaterialEffect.field_g <= param2 &&
            param2 < SpecularGpuMaterialEffect.field_g + GetRadialMenuRadius.field_o.width &&
            SetShipPersistence.field_q <= param1 &&
            GetRadialMenuRadius.field_o.height + SetShipPersistence.field_q > param1) {
            return 1;
          }
          return -1;
        }
        if (param1 >= GetCountermeasuresPulseRadius.field_p &&
          GetRadialMenuRadius.field_o.height + GetCountermeasuresPulseRadius.field_p > param1) {
          return 0;
        }
        if (param0 != -1) {
          GetGrapplingHookAimspeed.a(109, -32, 51);
          if (SpecularGpuMaterialEffect.field_g <= param2 &&
            param2 < SpecularGpuMaterialEffect.field_g + GetRadialMenuRadius.field_o.width &&
            SetShipPersistence.field_q <= param1 &&
            GetRadialMenuRadius.field_o.height + SetShipPersistence.field_q > param1) {
            return 1;
          }
          return -1;
        }
        if (SpecularGpuMaterialEffect.field_g <= param2 &&
          param2 < SpecularGpuMaterialEffect.field_g + GetRadialMenuRadius.field_o.width &&
          SetShipPersistence.field_q <= param1 &&
          GetRadialMenuRadius.field_o.height + SetShipPersistence.field_q > param1) {
          return 1;
        }
        return -1;
    }

    final static TextureBezierShape decodeTextureBezierShape(int param0, PacketBuffer param1) {
        RuntimeException var2 = null;
        TextureBezierShape stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 121) {
            field_o = (Sprite[]) null;
          }
          stackIn_3_0 = new TextureBezierShape(param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readShort(true), param1.readUnsignedMedium((byte) -77), param1.readUnsignedByte((byte) -113));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pmb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(126, 108));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pmb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -1) {
          GetGrapplingHookAimspeed.a(89, -110, -100);
          field_o = null;
          return;
        }
        field_o = null;
    }

    static {
        field_p = 1;
    }
}
