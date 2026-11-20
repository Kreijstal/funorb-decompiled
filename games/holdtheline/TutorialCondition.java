/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialCondition {
    int field_c;
    int field_b;
    int field_e;
    int opcode;
    static String field_a;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 1) {
          return;
        }
        field_a = null;
    }

    final static void readDisplayNameUpdate(byte param0) {
        QuickChatPhraseCache.field_e = RoadStripRenderer.field_e.readCp1252String(-1231);
        CharSequence var2 = (CharSequence) ((Object) QuickChatPhraseCache.field_e);
        ClientLifecycleUtilities.field_e = MidiPcmStream.normalizeAccountName(var2, (byte) 124);
        int var1 = -35 / ((param0 + 63) / 35);
    }

    static {
        field_a = "Select Championship";
    }
}
