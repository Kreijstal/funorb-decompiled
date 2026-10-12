/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PrintVictoryConditionsConsoleCommand extends ConsoleCommand {
    static int consoleNumberKind;
    static NodeDeque field_F;
    static int field_I;
    static Random animationRandom;
    static String field_H;
    static ResourceArchive field_K;
    static ClientUiComponent field_E;

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException failure = null;
        ConsoleValue[] guardArguments = null;
        ConsoleValue result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != -24872) {
            guardArguments = (ConsoleValue[]) null;
            this.execute(-98, (ConsoleValue[]) null);
          }
          result = new ConsoleValue(InstructionsPanel.describeBattleVictoryConditions(-29288));
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("gg.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    PrintVictoryConditionsConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    public static void g(int param0) {
        field_K = null;
        field_E = null;
        field_H = null;
        field_F = null;
        animationRandom = null;
        if (param0 != -2260) {
          PrintVictoryConditionsConsoleCommand.g(12);
        }
    }

    static {
        consoleNumberKind = 6;
        field_F = new NodeDeque();
        field_H = "Options";
        field_I = 2;
        animationRandom = new Random();
    }
}
