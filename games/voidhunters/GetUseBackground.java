/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseBackground extends ConsoleCommand {
    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = SetDetachmentMode.a(false, (byte) 100, param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("oc.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var2;
        var2 = VoidHunters.field_G;
        if (0 < lia.field_b) {
          lia.field_b = lia.field_b - 1;
        } else {
          if (nf.field_a > 0) {
            nf.field_a = nf.field_a - 1;
          } else {
            if (SetExplosionPushMultiplier.field_p > 0) {
              SetExplosionPushMultiplier.field_p = SetExplosionPushMultiplier.field_p - 1;
            }
          }
        }
        if (~lia.field_b < param0) {
          moa.a(true);
        }
        if (nf.field_a > 0) {
          lkb.a(nf.field_a, (byte) -107);
        }
        if (SetExplosionPushMultiplier.field_p <= 0) {
          return;
        }
        lkb.a(SetExplosionPushMultiplier.field_p, (byte) -124);
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
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(AwardVictoryToWinnerAction.field_b);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oc.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetUseBackground(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
