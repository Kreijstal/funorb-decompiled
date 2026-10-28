/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static char[] field_a;
    static String field_b;
    static String field_c;

    final static void a(boolean param0, boolean param1) {
        ch.field_b = true;
        mj.field_d = 0;
        di.field_d = null;
        if (!param1) {
          ChatMessage.clearFrameOffsets((byte) -58);
          ArchiveLoadTask.field_e = new InstructionsScreen(param0);
          return;
        }
        ek.releaseStatics(-110);
        ChatMessage.clearFrameOffsets((byte) -58);
        ArchiveLoadTask.field_e = new InstructionsScreen(param0);
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        int var1 = 34 % ((guard + 63) / 45);
        field_c = null;
        field_b = null;
    }

    static {
        field_b = "Loading levels";
        field_a = new char[128];
        field_c = "Press ESC for Pause Menu or to skip tutorial";
    }
}
