/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_a;
    static ValidationState field_d;
    String field_c;
    static int[] field_e;
    String field_b;

    final static void a(byte param0) {
        ChatMessage.field_e[44] = 71;
        ChatMessage.field_e[61] = 27;
        ChatMessage.field_e[46] = 72;
        ChatMessage.field_e[47] = 73;
        ChatMessage.field_e[59] = 57;
        if (param0 > 85) {
          ChatMessage.field_e[91] = 42;
          ChatMessage.field_e[92] = 74;
          ChatMessage.field_e[93] = 43;
          ChatMessage.field_e[45] = 26;
          ChatMessage.field_e[222] = 58;
          ChatMessage.field_e[192] = 28;
          ChatMessage.field_e[520] = 59;
          return;
        }
        lm.clearStatics(false);
        ChatMessage.field_e[91] = 42;
        ChatMessage.field_e[92] = 74;
        ChatMessage.field_e[93] = 43;
        ChatMessage.field_e[45] = 26;
        ChatMessage.field_e[222] = 58;
        ChatMessage.field_e[192] = 28;
        ChatMessage.field_e[520] = 59;
    }

    public static void clearStatics(boolean param0) {
        field_a = null;
        field_d = null;
        if (!param0) {
          lm.clearStatics(false);
          field_e = null;
          return;
        }
        field_e = null;
    }

    static {
        field_a = "Game Type: Conquest";
        field_e = new int[]{2, 21, 22, 7, 6, 14};
        field_d = new ValidationState();
    }
}
