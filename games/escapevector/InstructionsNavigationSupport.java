/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstructionsNavigationSupport {
    static char[] field_a;
    static String field_b;
    static String field_c;

    final static void openInstructions(boolean pointerDriven, boolean guard) {
        PauseMenuState.instructionsVisible = true;
        mj.field_d = 0;
        di.field_d = null;
        if (!guard) {
          ChatMessage.clearFrameOffsets((byte) -58);
          ArchiveLoadTask.field_e = new InstructionsScreen(pointerDriven);
          return;
        }
        InstructionsNavigationSupport.releaseStatics(-110);
        ChatMessage.clearFrameOffsets((byte) -58);
        ArchiveLoadTask.field_e = new InstructionsScreen(pointerDriven);
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
