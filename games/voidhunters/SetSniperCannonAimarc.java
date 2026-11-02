/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSniperCannonAimarc extends ConsoleCommand {
    static ri field_r;
    static ri field_o;
    static String field_q;
    static int field_p;

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref2 = null;
        try {
          try {
            var4 = param0.getGraphics();
            SetClientSideDragging.field_q.a(var4, param2, (byte) 77, param3);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref2 = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          if (param1 == 0) {
            return;
          }
          SetSniperCannonAimarc.e((byte) -76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("dh.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = -24 / ((param0 + 34) / 57);
        field_q = null;
        field_r = null;
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
          SetMachineGunEnergyUsed.a(135, 62, arguments[0].a(92));
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dh.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetSniperCannonAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_r = new ri(6, 0, 4, 2);
        field_q = "<%0> is not on your friend list.";
        field_p = 0;
        field_o = new ri(8, 0, 4, 1);
    }
}
