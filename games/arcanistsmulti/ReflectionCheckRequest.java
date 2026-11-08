/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheckRequest extends IntrusiveNode {
    PlatformTask[] field_n;
    int[] field_p;
    PlatformTask[] field_g;
    static String field_q;
    int field_m;
    int[] field_o;
    int field_s;
    static SceneListPanel field_r;
    static boolean field_i;
    static AudioOutput field_k;
    int[] field_j;
    byte[][][] field_l;
    static SceneWidget field_h;

    public static void releaseStatics(int param0) {
        field_k = null;
        field_q = null;
        if (param0 == -791) {
          field_h = null;
          field_r = null;
          return;
        }
        field_r = (SceneListPanel) null;
        field_h = null;
        field_r = null;
    }

    final static int getChatMode(byte param0, int param1) {
        int var2 = 0;
        if (param0 >= 114) {
          if (param1 == 0) {
            var2 = LoginMessageTable.field_h;
          }
          if (param1 == 1) {
            var2 = DateHelpers.field_m;
          }
          if (param1 == 2) {
            var2 = NameTextHelpers.field_b;
          }
          return var2;
        }
        return 99;
    }

    ReflectionCheckRequest() {
    }

    static {
        field_q = "Show all lobby chat";
        field_i = false;
    }
}
