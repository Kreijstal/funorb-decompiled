/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DefeatPlayerConsoleCommand extends ConsoleCommand {
    static ChatMessage[] chatHistory;
    static int[] field_H;
    static long field_E;
    static String field_G;

    final static boolean e(byte param0) {
        if (param0 <= 84) {
          return false;
        }
        return ArchiveIndex.field_g;
    }

    DefeatPlayerConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    final static void h(int param0) {
        int var2 = 0;
        int var1 = SummonRequest.a(true);
        int var2Lifetime1;
        if (param0 == 1976460609) {
          var2 = so.a(param0 - 1976435396);
          sg.field_c.a((byte) -111, var2 + (ov.field_b << 1), BattlefieldTheme.field_f - b.field_k, var1 + (b.field_k << 1), -ov.field_b + InstructionsPanel.field_r);
          SpellCastEvent.h(15);
          return;
        }
        DefeatPlayerConsoleCommand.g(37);
        var2Lifetime1 = so.a(param0 - 1976435396);
        sg.field_c.a((byte) -111, var2Lifetime1 + (ov.field_b << 1), BattlefieldTheme.field_f - b.field_k, var1 + (b.field_k << 1), -ov.field_b + InstructionsPanel.field_r);
        SpellCastEvent.h(15);
    }

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
            this.execute(-83, (ConsoleValue[]) null);
          }
          result = new ConsoleValue(DelayedPacket.defeatPlayerForConsole(arguments[0].asInt(2), (byte) 81));
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("an.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_H = null;
        field_G = null;
        chatHistory = null;
        if (param0 != 1746174305) {
          DefeatPlayerConsoleCommand.g(-72);
        }
    }

    static {
        field_H = new int[4];
        field_G = null;
    }
}
