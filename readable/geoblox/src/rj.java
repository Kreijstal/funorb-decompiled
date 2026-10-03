/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static int field_i;
    static String quitToWebsiteText;
    int field_f;
    static int avatarTintColor;
    static long field_b;
    int field_d;
    static String loggingInText;
    int field_a;
    int field_h;

    final static void a(byte param0, int param1) {
        if (param0 != 121) {
            quitToWebsiteText = (String) null;
            oj.field_c = 1000000000L / (long)param1;
            return;
        }
        oj.field_c = 1000000000L / (long)param1;
    }

    public static void a(int param0) {
        int var1 = 12 % ((-27 - param0) / 57);
        quitToWebsiteText = null;
        loggingInText = null;
    }

    final static ResourceArchive a(int param0, byte param1, boolean param2, boolean param3, int param4) {
        if (param1 >= -13) {
            return (ResourceArchive) null;
        }
        return IntKeyLookup.createResourceArchive(-90, param0, param3, param4, param2, false);
    }

    final static boolean a(byte param0, ResourceArchive param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 12 % ((-57 - param0) / 57);
          stackIn_1_0 = param1.loadAllGroups(true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("rj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        avatarTintColor = 5167632;
        field_i = 500;
        quitToWebsiteText = "Quit to website";
        loggingInText = "Logging in...";
    }
}
