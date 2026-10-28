/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PauseMenuState {
    static MenuInputState input;
    static boolean instructionsVisible;
    private static String field_z;

    public static void releaseStatics(int guard) {
        if (guard != -5691) {
          PauseMenuState.releaseStatics(1);
          input = null;
          return;
        }
        input = null;
    }

    static {
        field_z = "ch.A(";
    }
}
