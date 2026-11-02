/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetSpinningBladeAimspeed extends ConsoleCommand {
    static String field_o;
    static int field_p;
    static int field_q;

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -113) {
          GetSpinningBladeAimspeed.a(-93);
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 34);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(121, 81));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qmb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetSpinningBladeAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        if (nna.field_C != null) {
          return nna.field_C.a(SetBombletSprayProjectileDamage.field_o, SetClientSideDragging.field_r, -40);
        }
        if (param0 != -22029) {
          return false;
        }
        return false;
    }

    static {
        field_o = "Increases your manoeuvrability";
        field_p = 1;
    }
}
