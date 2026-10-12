/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ConsoleCommand extends DualLinkedNode {
    static String field_y;
    static String field_D;
    Class[] parameterTypes;
    String displaySignature;
    static int[] field_z;
    static String field_w;
    static String[] field_C;
    String commandName;
    static String field_x;
    static int[][] field_v;

    public final String toString() {
        return this.displaySignature;
    }

    abstract ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments);

    public static void d(byte param0) {
        field_D = null;
        field_v = (int[][]) null;
        field_y = null;
        field_C = null;
        field_w = null;
        field_z = null;
        field_x = null;
        if (param0 <= 68) {
          field_w = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, nr param3) {
        try {
          if (param1 != 96) {
            nr var5 = (nr) null;
            ConsoleCommand.a(125, (byte) -9, 20, (nr) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dr.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean matches(String requestedName, byte obfuscationGuard, ConsoleValue[] arguments) {
        int argumentIndex = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String nameDescription = null;
        StringBuilder errorContextWithName = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        int guardQuotient = 0;
        RuntimeException failure = null;
        Class argumentType = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.commandName.equals(requestedName)) {
            return false;
          }
          if (this.parameterTypes.length != arguments.length) {
            return false;
          }
          guardQuotient = -96 / ((-2 - obfuscationGuard) / 52);
          for (argumentIndex = 0; argumentIndex < this.parameterTypes.length; argumentIndex++) {
            if (arguments[argumentIndex].primitive) {
              argumentType = CampaignMenuEntry.getBoxedPrimitiveType(arguments[argumentIndex].payload, (byte) -75);
              if (Boolean.TYPE == argumentType &&
                this.parameterTypes[argumentIndex] != Boolean.TYPE) {
                return false;
              }
              if (Character.TYPE == argumentType &&
                this.parameterTypes[argumentIndex] != Character.TYPE) {
                return false;
              }
              if (RevivalEvent.isConsoleNumericType(false, argumentType) &&
                !RevivalEvent.isConsoleNumericType(false, this.parameterTypes[argumentIndex])) {
                return false;
              }
            } else {
              if (!this.parameterTypes[argumentIndex].isInstance(arguments[argumentIndex].payload)) {
                return false;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("dr.E(");
          if (requestedName == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          errorContextWithName = ((StringBuilder) (Object) errorContext).append(nameDescription).append(',').append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContextWithName).append(argumentsDescription).append(')').toString());
        }
    }

    ConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        StringBuilder signatureBuilder = null;
        StringBuilder signatureBuilderAlias = null;
        int parameterIndex = 0;
        StringBuilder typeAppendResult = null;
        StringBuilder separatorAppendResult = null;
        StringBuilder closingAppendResult = null;
        StringBuilder descriptionAppendResult = null;
        try {
          this.parameterTypes = parameterTypes;
          this.commandName = commandName;
          signatureBuilder = new StringBuilder(this.commandName).append('(');
          signatureBuilderAlias = signatureBuilder;
          for (parameterIndex = 0; parameterIndex < this.parameterTypes.length; parameterIndex++) {
            typeAppendResult = signatureBuilder.append(SummonRequest.consoleTypeName(640, this.parameterTypes[parameterIndex]));
            if (-1 + this.parameterTypes.length > parameterIndex) {
              separatorAppendResult = signatureBuilderAlias.append(", ");
            }
          }
          closingAppendResult = signatureBuilderAlias.append(')');
          if (description != null) {
            descriptionAppendResult = signatureBuilderAlias.append("     <col=ffaaff>" + description + "</col>");
          }
          this.displaySignature = signatureBuilderAlias.toString();
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "dr.<init>(" + (commandName != null ? "{...}" : "null") + ',' + (parameterTypes != null ? "{...}" : "null") + ',' + (description != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_y = "Manoeuvres";
        field_D = "Close";
        field_w = "(+<%0>)";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_z = new int[16];
        for (var0 = 0; field_z.length > var0; var0++) {
          var1 = var0 + 1;
          field_z[var0] = Math.min(oe.bitwiseOr(oe.bitwiseOr(rn.bitwiseAnd(var1 << 16, 16729482), rn.bitwiseAnd(-2046820097, var1) << 8), rn.bitwiseAnd(var1 << 2, 252)), 267583488);
          field_z[var0] = oe.bitwiseOr(rn.bitwiseAnd(16515326, field_z[var0]), rn.bitwiseAnd(32512, field_z[var0] >> 1));
          var2 = gq.a(field_z[var0]);
          var2 = var2 & 655359;
          var3 = 255 & var2;
          if (var3 > 5) {
            var3 = 5;
          }
          var2 = -256 & var2 | var3;
          field_z[var0] = gq.b(var2);
        }
        field_v = new int[8][16];
    }
}
