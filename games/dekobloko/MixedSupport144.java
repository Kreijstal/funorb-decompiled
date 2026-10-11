/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport144 {
    static String stringState0588;
    static boolean booleanState0209;
    static String stringState0589;
    static int integerState0848;
    static String stringState0590;

    public static void performAction1941(int integerArgument1) {
        if (integerArgument1 == 27067) {
          stringState0589 = null;
          stringState0590 = null;
          stringState0588 = null;
          return;
        }
        booleanState0209 = false;
        stringState0589 = null;
        stringState0590 = null;
        stringState0588 = null;
    }

    final static StringBuilder computeStringBuilder1942(StringBuilder stringBuilderArgument1, int integerArgument2, int integerArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        StringBuilder stackStringBuilderLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = stringBuilderArgument1.length();
          stringBuilderArgument1.setLength(integerArgument3);
          if (integerArgument2 != -23510) {
            stringState0588 = (String) null;
          }
          for (integerLocal1 = integerLocal2; integerArgument3 > integerLocal1; integerLocal1++) {
            stringBuilderArgument1.setCharAt(integerLocal1, characterArgument4);
          }
          stackStringBuilderLocal5 = (StringBuilder) (stringBuilderArgument1);
          return stackStringBuilderLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal3 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal3;
          stackStringBuilderLocal7 = new StringBuilder().append("vf.B(");
          if (stringBuilderArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(characterArgument4).append(')').toString());
        }
    }

    static {
        stringState0589 = "Please enter your date of birth to enable chat:";
        stringState0588 = "Fruit";
        stringState0590 = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
