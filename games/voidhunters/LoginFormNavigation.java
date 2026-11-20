/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginFormNavigation {
    static String field_a;
    static String field_c;
    static int field_b;

    public static void clearSharedReferences(boolean param0) {
        field_a = null;
        field_c = null;
        if (param0) {
          LoginFormNavigation.showEmptyLoginForm(86);
        }
    }

    final static void showEmptyLoginForm(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 <= -94) {
          var2 = (String) null;
          SetDebrisFoundInPairs.showLoginForm((String) null, "", 0);
          return;
        }
        field_c = (String) null;
        var2Lifetime1 = (String) null;
        SetDebrisFoundInPairs.showLoginForm((String) null, "", 0);
    }

    static {
        field_c = "Hide players in <%0>'s game";
        field_a = "OpenGL";
    }
}
