/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetGrapplingHookCooldown extends ConsoleCommand {
    static IntrusiveDeque field_o;
    static String field_p;

    SetGrapplingHookCooldown(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          SetMachineGunEnergyUsed.a(202, 62, arguments[0].a(32));
          if (obfuscationGuard >= -119) {
            var4 = (java.awt.Canvas) null;
            SetGrapplingHookCooldown.a((byte) -17, (java.awt.Canvas) null);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        try {
          mv.a(10009, (java.awt.Component) ((Object) param1));
          ts.a((java.awt.Component) ((Object) param1), 1);
          if (GetWaitForPlayers.field_o != null) {
            GetWaitForPlayers.field_o.a(-16, (java.awt.Component) ((Object) param1));
          }
          int var2_int = 13 / ((16 - param0) / 56);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -63) {
          field_o = (IntrusiveDeque) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static void a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != fwa.field_g &&
            null != fwa.field_g.field_e) {
            fwa.field_g.field_e.a(param1, param2, false);
          }
          if (param0 == 202) {
            return;
          }
          var4 = (String) null;
          SetGrapplingHookCooldown.a(-93, (String) null, -78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_p = "<%0> left";
        field_o = new IntrusiveDeque();
    }
}
