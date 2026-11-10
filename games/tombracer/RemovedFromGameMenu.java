/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RemovedFromGameMenu extends MenuScreen {
    static int[] field_s;
    static String field_r;
    static String field_q;

    final static void f(byte param0) {
        tga.field_a.f(8, 16384);
        if (param0 != -6) {
          field_r = (String) null;
        }
    }

    final static void d(byte param0) {
        String var2 = null;
        if (null != wra.field_b) {
          var2 = wra.field_b;
          String var1 = var2;
          ClampOperator.a(LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(86, mu.field_Bb, new String[]{var2}), param0 + 15047);
          wra.field_b = null;
        }
        if (param0 == 118) {
          return;
        }
        field_q = (String) null;
    }

    final void draw(byte param0, boolean param1) {
        if (!param1) {
          return;
        }
        Room.field_j.a(0, 0);
        gg.field_f.a((aaa.a(false) - gg.field_f.paddedHeight()) / 2, (SwitchLinkList.b(0) - gg.field_f.paddedWidth()) / 2);
        MembersUpsellMenu.a(ValidatedTextInputWidget.field_L.toUpperCase(), 2431750, SingleChildWidget.field_v, -1, 60 + (SwitchLinkList.b(param0 + 28) - gg.field_f.paddedWidth()) / 2, aaa.a(false) / 2, -1);
        SocketConnector.a(OpenGlBuffer.field_i, 1, kn.field_p, 2431750, 20, 200, 1, -100 + SwitchLinkList.b(param0 + 28) / 2, aaa.a(false) / 2 - 150, -1, (byte) 60, 300);
        super.draw(param0, param1);
    }

    public static void releaseStatics(byte param0) {
        int var1 = -61 % ((65 - param0) / 47);
        field_q = null;
        field_s = null;
        field_r = null;
    }

    final int getItemRight(int param0, byte param1) {
        if (param1 == -48) {
          return this.getItemX((byte) 117, param0) + this.items[param0].e(-163);
        }
        field_q = (String) null;
        return this.getItemX((byte) 117, param0) + this.items[param0].e(-163);
    }

    final int getItemX(byte param0, int param1) {
        if (param0 > 111) {
          return aaa.a(false) - this.items[param1].e(-163) >> 1;
        }
        field_r = (String) null;
        return aaa.a(false) - this.items[param1].e(-163) >> 1;
    }

    RemovedFromGameMenu(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    static {
        field_s = new int[]{0};
        field_q = "Disruptive behaviour";
        field_r = "<%0> has left.";
    }
}
