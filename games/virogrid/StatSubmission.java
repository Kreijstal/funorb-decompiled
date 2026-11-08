/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatSubmission extends IntrusiveNode {
    int field_i;
    static String field_o;
    int field_j;
    static String field_l;
    int field_n;
    int field_h;
    int field_k;
    static String field_p;
    int field_g;
    static String field_m;

    final static void startLoginRequest(byte param0, String param1, String param2, boolean param3) {
        try {
          MathAndCookieHelpers.field_d = param1;
          MouseTrailPoint.field_g = param2;
          if (param0 <= 98) {
            StatSubmission.evaluateGuardResidue(-84);
          }
          IterableNodeHashTable.showOverlayMessage(param3, NameCharacterHelpers.field_a, false);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void evaluateGuardResidue(int param0) {
        int var1 = -105 / ((-9 - param0) / 56);
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        field_o = null;
        int var1 = 84 / ((param0 - 23) / 62);
        field_l = null;
        field_p = null;
    }

    private StatSubmission() throws Throwable {
        throw new Error();
    }

    static {
        field_o = "You have been removed from <%0>'s game.";
        field_l = "Invalid name";
        field_p = "Unable to add name - system busy";
        field_m = "Your rating is <%0>";
    }
}
