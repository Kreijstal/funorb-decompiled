/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetThrusterBindingMoveAndTurnHasOppositeMove extends ConsoleCommand {
    static aba field_o;
    static int field_p;

    public static void f(byte param0) {
        field_o = null;
        if (param0 > -90) {
          SetThrusterBindingMoveAndTurnHasOppositeMove.e((byte) 1);
        }
    }

    SetThrusterBindingMoveAndTurnHasOppositeMove(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static java.awt.Canvas e(byte param0) {
        if (param0 > 62) {
          return null == psb.field_b ? igb.field_a : (java.awt.Canvas) ((Object) psb.field_b);
        }
        field_p = 24;
        return null == psb.field_b ? igb.field_a : (java.awt.Canvas) ((Object) psb.field_b);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(16, 62, arguments[0].a(29));
          if (obfuscationGuard > -119) {
            field_o = (aba) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("df.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = new aba();
        field_p = 0;
    }
}
