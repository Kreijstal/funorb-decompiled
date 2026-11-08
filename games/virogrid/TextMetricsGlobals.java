/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextMetricsGlobals {
    static int field_h;
    static AccountRequestReply field_c;
    static int[] field_j;
    String field_k;
    int field_m;
    String field_e;
    static String field_g;
    Js5Archive field_f;
    String field_b;
    static int[] field_a;
    static String textViewcontrolsZoomout;
    static String field_d;
    static Sprite field_l;

    final static TypeCode findTypeById(byte param0, int param1) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        TypeCode[] var5 = TextFieldPainter.getQuickChatParameterTypes((byte) -104);
        TypeCode[] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
          if (var5[var3].field_a == param1) {
            return var5[var3];
          }
        }
        if (param0 == 0) {
          return null;
        }
        return (TypeCode) null;
    }

    final static void closeNameEntryPopup(byte param0) {
        LobbyGame.field_Xb = null;
        int var1 = -40 % ((param0 - 23) / 51);
    }

    public static void releaseStatics(byte param0) {
        textViewcontrolsZoomout = null;
        field_a = null;
        field_d = null;
        field_j = null;
        int var1 = -23 % ((61 - param0) / 41);
        field_c = null;
        field_g = null;
        field_l = null;
    }

    final static void setMenuTextMetrics(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != 90) {
          return;
        }
        DelegatingCanvas.field_e = param4;
        LoadingProgressDialog.field_bb = param0;
        LongAndTextLoginPayload.field_m = param2;
        DebouncedValidator.field_c = param3;
    }

    private TextMetricsGlobals() throws Throwable {
        throw new Error();
    }

    final static void setTextLayoutMetrics(int param0, byte param1, int param2, int param3, int param4) {
        LabeledChildWidget.field_L = param0;
        NameCharacterHelpers.field_b = param3;
        if (param1 != -127) {
          TextMetricsGlobals.releaseStatics((byte) 0);
        }
        UsernameAvailabilityValidator.field_o = param2;
        MusicCrossfadeStream.field_l = param4;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_g = "Cancel";
        field_j = new int[256];
        field_a = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
          field_a[var0] = var0 * 1 + 65536 * (var0 / 4) + var0 / 4 * 256;
        }
        for (var0Lifetime1 = 0; 256 > var0Lifetime1; var0Lifetime1++) {
          field_j[var0Lifetime1] = var0Lifetime1 / 2 * 256 + 1 * (var0Lifetime1 / 2) + var0Lifetime1 / 2 * 65536;
        }
        textViewcontrolsZoomout = "Zoom out";
        field_d = "Show all lobby chat";
    }
}
