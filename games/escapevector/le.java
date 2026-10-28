/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static QuickChatDynamicCommand field_a;
    static String field_b;
    static long field_c;

    public static void releaseStatics(int guard) {
        if (guard < 40) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static String b(int param0) {
        if (fc.field_a < 2) {
          return ee.field_a;
        }
        if (PasswordValidator.field_p != null) {
          if (!PasswordValidator.field_p.ensureIndex(0)) {
            return md.field_H;
          }
          return gj.field_g;
        }
        if (!ii.field_a.ensureIndex(0)) {
          return TextFieldValidator.field_l;
        }
        if (!ii.field_a.tryLoadNamedGroup(0, "commonui")) {
          return DebouncedValidator.field_d + " - " + ii.field_a.namedGroupProgress("commonui", 0) + "%";
        }
        if (!w.field_ab.ensureIndex(0)) {
          return CipherPacketBuffer.field_o;
        }
        if (!w.field_ab.tryLoadNamedGroup(0, "commonui")) {
          return qf.field_h + " - " + w.field_ab.namedGroupProgress("commonui", param0 ^ 1) + "%";
        }
        if (param0 != 1) {
          field_a = (QuickChatDynamicCommand) null;
        }
        if (!pl.field_j.ensureIndex(0)) {
          return ff.field_a;
        }
        if (!pl.field_j.tryLoadAllGroups((byte) -119)) {
          return IntrusiveDequeCursor.field_b + " - " + pl.field_j.overallProgress(-67) + "%";
        }
        return field_b;
    }

    static {
        field_a = new QuickChatDynamicCommand(12, 0, 1, 0);
        field_b = "Please wait...";
    }
}
