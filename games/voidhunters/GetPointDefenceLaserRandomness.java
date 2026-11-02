/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPointDefenceLaserRandomness extends ConsoleCommand {
    static Object field_q;
    static int field_r;
    static String field_o;
    static int field_p;

    GetPointDefenceLaserRandomness(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard >= -119) {
            field_r = 64;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(79, 124));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wpa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        field_q = null;
        if (!param0) {
          field_o = (String) null;
        }
    }

    final static String a(int param0) {
        if (dw.field_c == SetCountermeasureLauncherAimspeed.field_r) {
          return SetResourceNodeCaptureTime.field_p;
        }
        if (!GetBombletSprayPushMultiplier.field_p.a(4)) {
          return GetBombletSprayPushMultiplier.field_p.b(4);
        }
        if (param0 != 52) {
          GetPointDefenceLaserRandomness.b(true);
          if (dw.field_c == SetShipTeamAction.field_b) {
            return GetBombletSprayPushMultiplier.field_p.b(4);
          }
          return qsb.field_d;
        }
        if (dw.field_c == SetShipTeamAction.field_b) {
          return GetBombletSprayPushMultiplier.field_p.b(4);
        }
        return qsb.field_d;
    }

    static {
        field_o = "More suggestions";
        field_r = 87;
        field_p = 52;
    }
}
