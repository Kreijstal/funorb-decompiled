/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetNebulaProximityFadeDownshift extends ConsoleCommand {
    static dja field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        Object var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (Object) null;
            GetNebulaProximityFadeDownshift.a(27, (Object) null, (Object) null);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(0, 86));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("te.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, Object param1, Object param2) {
        try {
          if (param0 != 29786) {
            field_o = (dja) null;
          }
          System.out.println("before=" + param2 + ", now=" + param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "te.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
          field_o = (dja) null;
        }
    }

    GetNebulaProximityFadeDownshift(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = (dja) ((Object) new wqa());
    }
}
