/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSpriteArrayFactory {
    static int field_a;
    static String field_d;
    static MonochromeBitmapFont wizardFont;
    static int field_c;
    static int field_f;
    static int[] field_b;
    static int field_e;

    public static void releaseStatics(byte param0) {
        wizardFont = null;
        field_d = null;
        field_b = null;
        if (param0 != -62) {
          field_f = 72;
        }
    }

    final static IndexedSprite[] buildDecodedIndexedSprites(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        IndexedSprite[] var1 = new IndexedSprite[wb.field_f];
        if (param0 >= 48) {
          for (var2 = 0; wb.field_f > var2; var2++) {
            var1[var2] = new IndexedSprite(ProgressDialog.field_bb, PlatformActor.field_v, GameMenu.field_q[var2], AccountFormText.field_h[var2], ImageProducerRasterBuffer.field_k[var2], MouseInputHandler.field_b[var2], TextFieldValidator.field_j[var2], DecodedSpritePalette.palette);
          }
          ClientException.a(0);
          return var1;
        }
        return (IndexedSprite[]) null;
    }

    static {
        field_d = "Waiting for fonts";
        field_c = 0;
    }
}
