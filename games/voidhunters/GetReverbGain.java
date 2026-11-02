/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetReverbGain extends ConsoleCommand {
    static kb field_o;

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
            stackIn_4_0 = new ConsoleValue(SetMissileLauncherEnergyUsed.field_p);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qf.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetReverbGain(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        dnb var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          var4 = (dnb) (SetGrapplingHookAimarc.field_o.d(0));
          if (param1 != -52) {
            field_o = (kb) null;
          }
          while (var4 != null) {
            nv.a((byte) 88, var4, param0);
            var4 = (dnb) (SetGrapplingHookAimarc.field_o.a((byte) 89));
          }
          var2 = GetBoostersActiveTime.field_q.d(0);
          while (var2 != null) {
            wva.b(param0, 22681);
            var2 = GetBoostersActiveTime.field_q.a((byte) 54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2_ref), "qf.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
          field_o = (kb) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    static {
        uu discarded$0 = new uu();
        field_o = new kb(1);
    }
}
