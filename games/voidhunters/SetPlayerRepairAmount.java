/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPlayerRepairAmount extends ConsoleCommand {
    static llb field_q;
    static String field_o;
    static String field_p;

    SetPlayerRepairAmount(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e(int param0) {
        if (GetAngularForceDownshift.field_p != SetClientSideDragging.field_q.field_b) {
          GetPhasedEnergyBeamProjectiles.field_o = GetPhasedEnergyBeamProjectiles.field_o + (SetClientSideDragging.field_q.field_b - GetAngularForceDownshift.field_p);
          GetAngularForceDownshift.field_p = SetClientSideDragging.field_q.field_b;
          if (param0 > ~tb.field_b) {
            tb.field_b = tb.field_b - 1;
            if (!(tb.field_b <= 0)) {
              cs.b((byte) -31);
            }
            return;
          }
          if (!(tb.field_b <= 0)) {
            cs.b((byte) -31);
          }
          return;
        }
        if (param0 <= ~tb.field_b) {
          if (!(tb.field_b <= 0)) {
            cs.b((byte) -31);
          }
          return;
        }
        tb.field_b = tb.field_b - 1;
        if (!(tb.field_b <= 0)) {
          cs.b((byte) -31);
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
            SetPlayerRepairAmount.e(-68);
          }
          SetMachineGunEnergyUsed.a(227, 62, arguments[0].a(12));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vj.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_q = null;
        int var1 = -29 / ((param0 + 16) / 58);
        field_p = null;
    }

    static {
        field_o = "Fighter bay";
        field_p = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
