/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRsaModulus {
    static java.math.BigInteger modulus;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 >= -123) {
          AccountRsaModulus.releaseStatics(116);
          modulus = null;
          return;
        }
        modulus = null;
    }

    static {
        field_z = "gh.A(";
        modulus = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
