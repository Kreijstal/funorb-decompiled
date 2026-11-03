/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MainMenuScreen extends MenuScreen {
    static AudioOutput field_t;
    static boolean field_s;
    static AccountRequestDialog field_r;
    static MidiPcmStream field_q;
    static String field_p;
    static String field_o;

    final static void g(byte param0) {
        if (el.field_b == 10) {
          tj.h(20);
          el.field_b = 11;
        } else {
          if (!ri.a(-88)) {
            tj.h(20);
            el.field_b = 11;
          }
        }
        EmailCredentials.field_f = true;
        if (param0 > 36) {
          return;
        }
        MainMenuScreen.g((byte) 72);
    }

    final void draw(int param0) {
        NumericDateInputWidget.field_W[0].drawTransparent(0, 45);
        if (param0 != 11) {
          return;
        }
        this.drawRows((byte) -71);
    }

    public static void releaseStatics(byte param0) {
        field_p = null;
        field_r = null;
        int var1 = 127 % ((-44 - param0) / 39);
        field_o = null;
        field_q = null;
        field_t = null;
    }

    MainMenuScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void onCancel(byte param0) {
        if (param0 > -13) {
          field_t = (AudioOutput) null;
        }
    }

    static {
        field_o = "You have 1 unread message!";
        field_p = "Orb points: ";
    }
}
