/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseExtraBackground extends ConsoleCommand {
    GetUseExtraBackground(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        uga.field_d = false;
        if (null != fkb.field_m) {
          fkb.field_m.j(16384);
          if (~ow.field_b != param0) {
            dr.a(26718);
            GetLaserAimspeed.field_p = 0;
            return;
          }
          GetLaserAimspeed.field_p = 0;
          return;
        }
        if (~ow.field_b == param0) {
          GetLaserAimspeed.field_p = 0;
          return;
        }
        dr.a(26718);
        GetLaserAimspeed.field_p = 0;
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
            stackIn_4_0 = new ConsoleValue(SetSalvoDamageMultiplier.field_o);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fea.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
