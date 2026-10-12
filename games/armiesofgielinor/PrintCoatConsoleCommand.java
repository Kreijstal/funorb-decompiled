/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PrintCoatConsoleCommand extends ConsoleCommand {
    static int secondPreviousOpcode;
    static String[] field_E;

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException failure = null;
        ConsoleValue result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != -24872) {
            field_E = (String[]) null;
          }
          result = new ConsoleValue(SkeletonLimitMarker.printCurrentCoat((byte) 119));
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ba.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    PrintCoatConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
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
