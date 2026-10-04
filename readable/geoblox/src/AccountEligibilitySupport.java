/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountEligibilitySupport {
    static int[] firstVertexTransformedZ;
    static String pleaseTryAgainText;
    static boolean loginReturnAllowed;
    static int field_d;
    static ResourceArchive musicScoreArchive;

    public static void clearAccountEligibilityResources(int methodGuard) {
        pleaseTryAgainText = null;
        firstVertexTransformedZ = null;
        if (methodGuard != -15647) {
            return;
        }
        musicScoreArchive = null;
    }

    final static boolean isAccountCreationBlocked(int methodGuard) {
        int guardResidue = -59 / ((methodGuard - 34) / 41);
        return ClientFlowToken.hasAccountIneligibilityMarker((byte) -109, NodeHashTableIterator.c(118));
    }

    static {
        pleaseTryAgainText = "Please try again in a few minutes.";
        firstVertexTransformedZ = new int[8192];
        field_d = 10;
    }
}
