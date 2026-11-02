/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetWorldWidthUpshift extends ConsoleCommand {
    final static int a(int param0) {
        if (param0 != 24655) {
          return 4;
        }
        return 1;
    }

    final static GraphicsToolkit a(d param0, int param1, int param2, java.awt.Canvas param3, int param4) {
        RuntimeException var5 = null;
        GraphicsToolkit stackIn_2_0 = null;
        sob stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > 20) {
            stackIn_4_0 = new sob(param3, param0, param4, param1);
            return (GraphicsToolkit) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (GraphicsToolkit) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("wmb.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        java.awt.Canvas var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (java.awt.Canvas) null;
            SetWorldWidthUpshift.a((d) null, -53, -128, (java.awt.Canvas) null, -4);
          }
          SetMachineGunEnergyUsed.a(193, 62, arguments[0].a(88));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wmb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetWorldWidthUpshift(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
