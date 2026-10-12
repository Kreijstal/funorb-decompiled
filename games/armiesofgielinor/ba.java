/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ConsoleCommand {
    static int secondPreviousOpcode;
    static String[] field_E;

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -24872) {
            field_E = (String[]) null;
          }
          stackIn_3_0 = new ConsoleValue(SkeletonLimitMarker.a((byte) 119));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ba.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    ba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void g(int param0) {
        if (param0 < 68) {
          return;
        }
        lt.field_g.a(new ce(), (byte) 66);
    }

    public static void i(int param0) {
        field_E = null;
        if (param0 <= 111) {
          secondPreviousOpcode = 29;
        }
    }

    final static int h(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 > -103) {
            secondPreviousOpcode = 107;
          }
          var1_int = 0;
          while (Unit.pollKeyEvent((byte) -52)) {
            MovementPlanner.field_z.pollNavigationKeys((byte) -120);
            if (!MovementPlanner.field_z.hasActivationInput((byte) 82)) {
              continue;
            }
            var1_int = 1;
          }
          MovementPlanner.field_z.updatePointerSelection(0, DiskCacheWorker.a((byte) -47, TeleportAction.pointerPressY, BattleTutorial.pointerPressX), DiskCacheWorker.a((byte) 93, ko.pointerY, AiPlanningStrategy.pointerX));
          if (MovementPlanner.field_z.hasActivationInput((byte) 46)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            MovementPlanner.field_z.selectedIndex >= 0) {
            var2 = SpellMenuGroup.field_m[MovementPlanner.field_z.selectedIndex];
            if (var2 == 2) {
              CombatPresentation.n(-112);
            }
          }
          stackIn_18_0 = var2;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "ba.D(" + param0 + ')');
        }
    }

    static {
        secondPreviousOpcode = -1;
        field_E = new String[]{"This unit is immobilised and unable to move for 1 turn", "This unit is immobilised and unable to move for <%0> turns"};
    }
}
