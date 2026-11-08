/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidationHelpers {
    static String field_d;
    static String field_a;
    static SceneWidget field_c;
    static RgbSprite field_b;

    final static void resetReflectionCheckQueue(byte param0) {
        if (param0 > -87) {
          field_d = (String) null;
          PopupMenuHelpers.field_d = new NodeDeque();
          return;
        }
        PopupMenuHelpers.field_d = new NodeDeque();
    }

    final static EmailFormatError validateEmailAddress(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        EmailFormatError var5 = null;
        EmailFormatError stackIn_6_0 = null;
        EmailFormatError stackIn_9_0 = null;
        EmailFormatError stackIn_12_0 = null;
        EmailFormatError stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            EmailValidationHelpers.releaseStatics(108);
          }
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (-1 == var2_int) {
              stackIn_9_0 = RankingQuery.field_A;
              return stackIn_9_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var5 = StripedProgressBar.validateEmailLocalPart(110, var3);
            if (var5 == null) {
              stackIn_14_0 = DropTargetWidget.validateEmailDomain(var4, false);
              return stackIn_14_0;
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_6_0 = DisplayNameAndAudioHelpers.field_f;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("gm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -1) {
          return;
        }
        field_b = null;
    }

    static {
        field_d = "<%1> couldn't avoid the mighty enormo-laser";
        field_a = "C";
    }
}
