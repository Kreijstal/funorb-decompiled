/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static int[] field_i;
    static int[] field_a;
    static String acceptdraw;
    static Sprite[][] field_f;
    static int[] field_h;
    static Sprite[] field_e;
    static SceneNode field_d;
    static nl field_b;
    static String escCancelthisline;
    static boolean field_c;

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
          field_c = false;
          Bzip2DecoderState.field_D.drawRoot((byte) -79, param1);
          return;
        }
        Bzip2DecoderState.field_D.drawRoot((byte) -79, param1);
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_i = null;
        field_e = null;
        if (param0 > 56) {
          field_a = null;
          acceptdraw = null;
          escCancelthisline = null;
          field_f = (Sprite[][]) null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        StrongCacheEntry.field_J = param1;
        if (HighscoresScreen.field_P != BufferedFile.field_h) {
          var2 = BufferedFile.field_h * BufferedFile.field_h;
          var3 = -(HighscoresScreen.field_P * HighscoresScreen.field_P) + var2;
          param1 = param1 + var3 * (-param1 + AwtEventQueueSupport.field_g) / var2;
        }
        IntLookupQuery.field_q.setBounds(param1, param0 - 2147483625, RasterSnapshot.field_u, 640, 120);
        Camera.a(ja.field_b, param0 + AwtEventQueueSupport.field_g, 0, 640, 5, 125, CueAim.field_j);
    }

    static {
        field_f = new Sprite[][]{null, null, null, null};
        acceptdraw = "Accept draw";
        field_h = ta.buildGradientPalette(new int[]{0, 0, 8, 16777215, 32, 0, 65, 0}, -120);
        field_i = ta.buildGradientPalette(new int[]{0, 0, 8, 16724753, 32, 0, 65, 0}, -120);
        field_a = new int[field_h.length];
        field_b = new nl();
        escCancelthisline = "ESC - cancel this line";
        field_c = true;
    }
}
