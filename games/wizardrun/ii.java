/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String field_d;
    static Js5Transport field_f;
    static PlatformActor[] field_e;
    static String field_b;
    static int field_a;
    static int field_c;

    public static void releaseStatics(int param0) {
        field_d = null;
        field_f = null;
        if (param0 != 1000) {
          return;
        }
        field_b = null;
        field_e = null;
    }

    final static NameAvailabilityRequest createAvailableNameResult(int param0, boolean param1) {
        NameAvailabilityRequest var2 = null;
        NameAvailabilityRequest var2Lifetime1;
        if (param0 == -29309) {
          var2 = new NameAvailabilityRequest(true);
          var2.field_d = param1 ? true : false;
          return var2;
        }
        ii.createAvailableNameResult(123, false);
        var2Lifetime1 = new NameAvailabilityRequest(true);
        var2Lifetime1.field_d = param1 ? true : false;
        return var2Lifetime1;
    }

    static {
        field_e = new PlatformActor[1000];
        field_d = "Email (Login):";
        field_b = "Unfortunately we are unable to create an account for you at this time.";
    }
}
