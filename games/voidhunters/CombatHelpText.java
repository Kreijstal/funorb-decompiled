/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CombatHelpText {
    static String slowTargetHint;
    static int field_b;
    static boolean field_c;
    static String spawnEnemyAtMouseText;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        spawnEnemyAtMouseText = null;
        slowTargetHint = null;
        if (param0) {
          CombatHelpText.clearSharedReferences(false);
        }
    }

    static {
        field_z = "jw.A(";
        field_c = false;
        field_b = 0;
        slowTargetHint = "Deadly against slow moving targets";
        spawnEnemyAtMouseText = "Spawn enemy ship at mouse";
    }
}
