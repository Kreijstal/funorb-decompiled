/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static BackgroundScene field_e;
    static IntrusiveDeque field_c;
    static String[] field_a;
    static byte[] field_d;
    static IntrusiveDeque field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 == 1762) {
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
        LoginCredentials.a(-41);
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static void a(String param0, boolean param1) {
        int var5 = 0;
        LobbyPlayer.field_Wb = true;
        jm.field_h.field_cb = param0;
        int var2_int = ClientException.field_f.field_a;
        int var3 = ClientException.field_f.field_i;
        int var4 = jm.field_h.font.paragraphHeight(param0, 272, jm.field_h.field_mb);
        if (param1) {
          return;
        }
        try {
          var5 = -(var4 / 2) - 110 + var3 / 2 + 7;
          TickClock.field_e.a(var5, -(var5 * 2) + (-120 + var3), (-320 + var2_int) / 2, 256, 320);
          TickClock.field_e.field_zb = OptionsScreen.a(8421504, 16, 11579568, TickClock.field_e.height, 2105376, 3);
          jm.field_h.a(16, -24 + TickClock.field_e.height - 20, 24, 256, -24 + (TickClock.field_e.field_K - 24));
          DelegatingCanvas.field_h.a(-24 + (TickClock.field_e.height - 20), 24, 120, 256, 80);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "rg.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(byte param0, PacketBuffer param1);

    abstract ea b(int param0);

    static {
        field_a = new String[3];
        field_c = new IntrusiveDeque();
        field_b = null;
        field_d = new byte[]{(byte)3, (byte)3};
    }
}
