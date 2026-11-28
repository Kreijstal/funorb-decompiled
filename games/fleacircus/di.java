/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static int[] field_a;
    static int field_c;
    static int field_d;
    static qk field_b;

    final static void b(int param0) {
        int var1 = ef.a((byte) 30);
        int var2 = MouseWheelInput.c(param0 + 44845);
        if (param0 == -20667) {
          AccountServiceResult.field_d.a(-q.field_d + MidiPcmStream.field_M, param0 + 20667, (q.field_d << 1) + var1, var2 + (InteractiveWidget.field_C << 1), -InteractiveWidget.field_C + GuestPlayConfirmationForm.field_H);
          PasswordValidator.e(-46);
          return;
        }
        di.resetStaticState(43);
        AccountServiceResult.field_d.a(-q.field_d + MidiPcmStream.field_M, param0 + 20667, (q.field_d << 1) + var1, var2 + (InteractiveWidget.field_C << 1), -InteractiveWidget.field_C + GuestPlayConfirmationForm.field_H);
        PasswordValidator.e(-46);
    }

    public static void resetStaticState(int param0) {
        if (param0 != 26189) {
          field_d = -125;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = new int[8192];
    }
}
