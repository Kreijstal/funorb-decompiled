/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetGrapplingHookAimspeed extends ConsoleCommand {
    static phb[] field_o;
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
            if (qr.field_g > param2) {
              return -1;
            }
            if (param2 >= qr.field_g + GetRadialMenuRadius.field_o.field_q) {
              return -1;
            }
            if (SetShipPersistence.field_q > param1) {
              return -1;
            }
            if (GetRadialMenuRadius.field_o.field_p + SetShipPersistence.field_q <= param1) {
              return -1;
            }
            return 1;
          }
          if (qr.field_g <= param2 &&
            param2 < qr.field_g + GetRadialMenuRadius.field_o.field_q &&
            SetShipPersistence.field_q <= param1 &&
            GetRadialMenuRadius.field_o.field_p + SetShipPersistence.field_q > param1) {
            return 1;
          }
          return -1;
        }
        if (GetRadialMenuRadius.field_o.field_q + GetUseNiceTrails.field_r <= param2) {
          if (param0 != -1) {
            GetGrapplingHookAimspeed.a(109, -32, 51);
            if (qr.field_g <= param2 &&
              param2 < qr.field_g + GetRadialMenuRadius.field_o.field_q &&
              SetShipPersistence.field_q <= param1 &&
              GetRadialMenuRadius.field_o.field_p + SetShipPersistence.field_q > param1) {
              return 1;
            }
            return -1;
          }
          if (qr.field_g <= param2 &&
            param2 < qr.field_g + GetRadialMenuRadius.field_o.field_q &&
            SetShipPersistence.field_q <= param1 &&
            GetRadialMenuRadius.field_o.field_p + SetShipPersistence.field_q > param1) {
            return 1;
          }
          return -1;
        }
        if (param1 >= GetCountermeasuresPulseRadius.field_p &&
          GetRadialMenuRadius.field_o.field_p + GetCountermeasuresPulseRadius.field_p > param1) {
          return 0;
        }
        if (param0 != -1) {
          GetGrapplingHookAimspeed.a(109, -32, 51);
          if (qr.field_g <= param2 &&
            param2 < qr.field_g + GetRadialMenuRadius.field_o.field_q &&
            SetShipPersistence.field_q <= param1 &&
            GetRadialMenuRadius.field_o.field_p + SetShipPersistence.field_q > param1) {
            return 1;
          }
          return -1;
        }
        if (qr.field_g <= param2 &&
          param2 < qr.field_g + GetRadialMenuRadius.field_o.field_q &&
          SetShipPersistence.field_q <= param1 &&
          GetRadialMenuRadius.field_o.field_p + SetShipPersistence.field_q > param1) {
          return 1;
        }
        return -1;
    }

    final static cp a(int param0, PacketBuffer param1) {
        RuntimeException var2 = null;
        cp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 121) {
            field_o = (phb[]) null;
          }
          stackIn_3_0 = new cp(param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.c((byte) -77), param1.e((byte) -113));
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
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
