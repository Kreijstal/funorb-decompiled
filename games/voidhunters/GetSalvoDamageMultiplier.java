/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetSalvoDamageMultiplier extends ConsoleCommand {
    static dka field_r;
    static int field_q;
    static String field_o;
    static int field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_q = -88;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(38, 82));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bta.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetSalvoDamageMultiplier(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        ea var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          var4 = (ea) (oaa.field_k.d(0));
          while (var4 != null) {
            GetCountermeasureLauncherAimspeed.a(var4, 1, param1);
            var4 = (ea) (oaa.field_k.a((byte) 28));
          }
          if (param0 != 50) {
            field_p = -54;
          }
          var2 = GetLagStandardDeviationIn.field_q.d(0);
          while (var2 != null) {
            GetTorqueDownshift.b(-105, param1);
            var2 = GetLagStandardDeviationIn.field_q.a((byte) 9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2_ref), "bta.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void e(byte param0) {
        field_r = null;
        if (param0 > -31) {
          return;
        }
        field_o = null;
    }

    static {
        field_q = 1;
        field_r = new dka(3);
        field_o = "Attempt to build blueprint";
        field_p = 50;
    }
}
