/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetDebrisPartitioned extends ConsoleCommand {
    static int[] field_o;

    final static boolean a(int param0, int param1) {
        if (param1 != 9) {
          GetDebrisPartitioned.b(false);
          if (4 > param0) {
            return false;
          }
          if (13 != param0) {
            return true;
          }
          return false;
        }
        if (4 > param0) {
          return false;
        }
        if (13 != param0) {
          return true;
        }
        return false;
    }

    GetDebrisPartitioned(String param0, Class[] param1, String param2) {
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
            GetDebrisPartitioned.b(true);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(9, 111));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qta.A(");
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
        if (param0) {
          GetDebrisPartitioned.a(-80, 94);
        }
    }

    static {
    }
}
