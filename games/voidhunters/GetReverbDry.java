/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetReverbDry extends ConsoleCommand {
    final static void a(int param0) {
        if (param0 > -108) {
          return;
        }
        GetArmageddonLength.field_r = new IntrusiveDeque();
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            GetReverbDry.a(-97);
          }
          stackIn_3_0 = new ConsoleValue(GetMissileLauncherProjectiles.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wq.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetReverbDry(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean e(byte param0) {
        if (param0 != 105) {
          GetReverbDry.a(22);
          if (null != GetLagStandardDeviationOut.field_o) {
            return true;
          }
          if (oaa.a((byte) -128)) {
            return true;
          }
          if (null != Asteroid.field_v) {
            return true;
          }
          if (!kfa.a(-26243)) {
            return false;
          }
          return true;
        }
        if (null != GetLagStandardDeviationOut.field_o) {
          return true;
        }
        if (oaa.a((byte) -128)) {
          return true;
        }
        if (null != Asteroid.field_v) {
          return true;
        }
        if (!kfa.a(-26243)) {
          return false;
        }
        return true;
    }

    static {
    }
}
