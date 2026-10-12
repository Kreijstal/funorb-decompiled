/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HelloConsoleCommand extends ConsoleCommand {
    static String field_E;

    final static boolean a(int param0, byte param1) {
        if (param0 == -1) {
          return true;
        }
        if (param1 == -98) {
          return (hf.field_a & 1 << param0) != 0 ? true : false;
        }
        field_E = (String) null;
        return (hf.field_a & 1 << param0) != 0 ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, RgbSprite[] param4, int param5) {
        try {
          if (param2 >= -112) {
            field_E = (String) null;
          }
          param4[0].f(param1, param0, param5);
          param4[1].d(param4[1].pixelWidth + param1, param0, -(param4[2].pixelWidth << 1) + param3, param4[2].pixelHeight, param5);
          param4[2].f(param3 + (param1 - param4[2].pixelWidth), param0, param5);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "re.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException failure = null;
        ConsoleValue guardResult = null;
        ConsoleValue result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard == -24872) {
            result = new ConsoleValue(vv.consoleGreeting((byte) -62));
            return result;
          }
          guardResult = (ConsoleValue) null;
          return guardResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("re.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_E = null;
        if (param0 > -14) {
          field_E = (String) null;
        }
    }

    HelloConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    static {
        field_E = "Spectate";
    }
}
