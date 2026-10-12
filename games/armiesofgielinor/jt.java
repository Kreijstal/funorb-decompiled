/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt {
    static int field_a;

    final static void a(int param0, boolean param1, int param2, int param3) {
        og.updateQuickChatHelp(16756, param1);
        ib.a(40, param1, param3, param2);
        if (param0 != -32216) {
          field_a = 9;
        }
    }

    final static boolean a(byte param0) {
        int var1 = 72 / ((7 - param0) / 51);
        if (EffectPresentation.field_e == null) {
          return false;
        }
        if (EffectPresentation.field_e.handleLegacyNameKey((byte) -101)) {
          return true;
        }
        return false;
    }

    static {
        field_a = 16;
    }
}
