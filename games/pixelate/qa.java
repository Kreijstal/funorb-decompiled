/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends RuntimeException {
    static int field_e;
    Throwable field_c;
    static ha field_f;
    static String[] field_a;
    static String field_b;
    String field_d;
    static tf field_g;
    private static String field_z;

    public static void a(boolean param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
    }

    final static tf[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 3) {
          tf[] discarded$2 = qa.a(-72, -103, -103, -51);
          return ap.a(param1, param0, 5, param2, 1);
        } else {
          return ap.a(param1, param0, 5, param2, 1);
        }
    }

    qa(Throwable param0, String param1) {
        ((qa) this).field_d = param1;
        ((qa) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "qa.A(";
        field_e = 3;
        field_a = new String[]{"Challenge Mode: Get a score of 10,000.", "Challenge Mode: Get a score of 50,000.", "Challenge Mode: Get a score of 100,000.", "Challenge Mode: Get a score of 250,000.", "Challenge Mode: Get to level 30.", "Challenge Mode: Get to level 40.", "Challenge Mode: Get to level 50.", "Challenge Mode: Completely refill the timer after level 10.", "Challenge Mode: Complete a puzzle after level 10 without using the available buffer zone.", "Challenge Mode: Complete a puzzle after level 10 without placing a tile incorrectly.", "Challenge Mode: Complete a puzzle after level 10 without placing a tile incorrectly or using the available buffer zone.", "Challenge Mode: Constantly hold 'SPACE' for the first 5 levels.", "Multiplayer: Get your Rating over 1300.", "Multiplayer: Get your Rating over 2000.", "Puzzle Mode: Complete puzzles 1-25.", "Puzzle Mode: Complete puzzles 1-50.", "Challenge Mode: Complete all five puzzles in a level without using the available buffer zone.", "Challenge Mode: Constantly hold 'SPACE' for the first 10 levels.", "Challenge Mode: Create an inverted image of any puzzle.", "Challenge Mode: Create a mirror image of any asymmetric puzzle.", "Challenge Mode: Complete a puzzle without ever rotating a piece.", "Challenge Mode: Drop 100 pieces on one puzzle."};
        field_b = "You cannot join this game - it is in progress";
    }
}
