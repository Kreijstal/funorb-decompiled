/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ErrorPrintHelpers {
    static UiComponent field_c;
    static String field_f;
    static boolean[] field_a;
    static boolean field_b;
    static int[] field_e;
    static String field_d;

    final static void printError(byte param0, String param1) {
        System.out.println("Error: " + NameSuggestionsPanel.replaceAll(true, "%0a", "\n", param1));
        if (param0 <= 43) {
          field_c = (UiComponent) null;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > -113) {
          return;
        }
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_e = null;
    }

    final static String getStatusText(int param0) {
        if (param0 != 11137) {
          field_d = (String) null;
          return ScrollPane.field_Nb;
        }
        return ScrollPane.field_Nb;
    }

    static {
        field_f = "<%0> has lost connection.";
        field_a = new boolean[112];
        field_b = false;
        field_d = "You must play 1 more rated game before playing with the current options.";
    }
}
