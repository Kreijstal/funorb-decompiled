/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadStep {
    String groupName;
    int groupId;
    static char keycharTheCharacterUnderQuestionmark;
    static volatile int field_l;
    static String offline;
    String loadingText;
    static IntrusiveDeque field_c;
    String waitingText;
    static Sprite field_k;
    static int[][] field_m;
    ResourceArchive archive;
    static boolean field_e;
    static int[] field_g;
    static UiComponent field_f;

    public static void releaseStatics(byte param0) {
        field_k = null;
        field_m = (int[][]) null;
        field_g = null;
        field_c = null;
        field_f = null;
        offline = null;
        if (param0 > -78) {
          ArchiveLoadStep.releaseStatics((byte) -76);
        }
    }

    private ArchiveLoadStep() throws Throwable {
        throw new Error();
    }

    static {
        keycharTheCharacterUnderQuestionmark = '/';
        field_l = -1;
        offline = "Offline";
        field_c = new IntrusiveDeque();
    }
}
