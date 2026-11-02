/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMissionTimeLimit extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        vfa var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (vfa) null;
            SetMissionTimeLimit.a((vfa) null, -90);
          }
          SetMachineGunEnergyUsed.a(59, 62, arguments[0].a(98));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gv.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        be var3 = new be();
        var3.index = param1;
        var3.value = param0;
        SetBuildViewAutozoomEndOnAction.a(0, var3, RequestNewestBlackboxRecording.field_p, 70);
        if (param2 == -10923) {
          return;
        }
        vfa var4 = (vfa) null;
        SetMissionTimeLimit.a((vfa) null, -41);
    }

    SetMissionTimeLimit(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(vfa param0, int param1) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 <= 9) {
            SetMissionTimeLimit.a(-34, -13, 122);
          }
          efb.field_b = param0;
          if (null != efb.field_b &&
            efb.field_b.field_b) {
            stackIn_7_0 = 1;
          } else {
            stackIn_7_0 = 0;
          }
          mb.h(stackIn_7_0, 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("gv.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
