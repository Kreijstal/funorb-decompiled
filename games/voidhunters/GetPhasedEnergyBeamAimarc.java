/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPhasedEnergyBeamAimarc extends ConsoleCommand {
    static String field_o;

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
          return false;
        }
        return 0 != (param0 & 16) ? true : false;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 16) {
          GetPhasedEnergyBeamAimarc.a(-34, false, 111);
        }
    }

    final static void a(llb param0, llb param1, boolean param2) {
        if (param1.field_lb == null) {
          param1.field_lb = new IntrusiveDeque();
        }
        if (param0.field_lb == null) {
          param0.field_lb = new IntrusiveDeque();
        }
        if (ae.field_f == null) {
          ae.field_f = new pr(64);
        }
        if (null == TeamNodeCondition.field_c) {
          TeamNodeCondition.field_c = new pr(64);
        }
        mr.field_M = param1.field_lb;
        if (!param2) {
          return;
        }
        try {
          SetPointDefenceLaserProjectileOndamageParticles.field_o = param0.field_lb;
          ija.a(85);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "plb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(137, 114));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("plb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetPhasedEnergyBeamAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Get the most kills in the time limit";
    }
}
