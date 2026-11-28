/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String[] field_a;
    static wb[] field_d;
    static String field_c;
    static String field_b;

    final static boolean b(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 5) {
          return false;
        }
        stackIn_6_0 = (cd.field_e >= 10) && (13 <= DequeWidgetContainer.field_A);
        return stackIn_6_0;
    }

    final static void a(byte param0) {
        RgbSprite var1 = null;
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = Main.field_T;
        int var3Lifetime1;
        try {
          var1 = new RgbSprite(540, 140);
          dl.a(-78, var1);
          TriangleRasterizer.useRasterClip();
          SoftwareRasterizer.clearRaster();
          h.field_F = 0;
          de.b(30);
          var2 = var1.copy();
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          rc.field_i.bindAsRenderTarget();
          var3Lifetime1 = -29 / ((param0 - 1) / 58);
          var1.drawHalfSize(0, 0);
          gg.a(14756);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ri.B(" + param0 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -2) {
          field_b = (String) null;
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
