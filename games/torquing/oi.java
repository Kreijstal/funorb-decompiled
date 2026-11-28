/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 != 0) {
          oi.a(93, (byte) 89);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static IndexedSprite a(byte param0) {
        IndexedSprite var1 = new IndexedSprite(GuestPlayConfirmationForm.field_E, rh.field_d, PacketBuffer.field_o[0], LabeledWidgetContainer.field_G[0], vo.field_b[0], PasswordValidator.field_o[0], pn.field_b[0], cq.field_y);
        go.b(0);
        if (param0 < -59) {
          return var1;
        }
        return (IndexedSprite) null;
    }

    final static void a(int param0, byte param1) {
        if (param1 < 9) {
          field_a = (String) null;
          if (param0 == 50) {
            return;
          }
          throw new IllegalArgumentException();
        }
        if (param0 == 50) {
          return;
        }
        throw new IllegalArgumentException();
    }

    static {
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
