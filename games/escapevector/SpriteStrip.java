/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteStrip extends IntrusiveNode {
    private Sprite[] sprites;
    private int spacing;
    static hf field_p;
    static dh field_g;
    static String field_j;
    static String[] field_i;
    static String field_o;
    static char[] field_n;
    static char[][] field_k;
    private int width;
    static String field_h;

    public static void releaseStatics(int guard) {
        field_k = (char[][]) null;
        field_o = null;
        field_j = null;
        int var1 = -112 % ((-22 - guard) / 61);
        field_p = null;
        field_g = null;
        field_n = null;
        field_i = null;
        field_h = null;
    }

    private final void updateWidth(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        this.width = 0;
        if (null == this.sprites) {
          return;
        }
        if (0 == this.sprites.length) {
          return;
        }
        if (guard <= 84) {
          SpriteStrip.releaseStatics(-24);
        }
        for (int var2 = 0; this.sprites.length > var2; var2++) {
          Sprite var3 = this.sprites[var2];
          if (var3 != null) {
            this.width = this.width + var3.fullWidth;
            this.width = this.width + this.spacing;
          }
        }
    }

    final void draw(int guard, int x, int y) {
        int var6 = EscapeVector.obfuscationControl;
        if (guard != 103) {
          field_n = (char[]) null;
        }
        if (this.sprites == null) {
          return;
        }
        if (this.sprites.length == 0) {
          return;
        }
        for (int var4 = 0; var4 < this.sprites.length; var4++) {
          Sprite var5 = this.sprites[var4];
          if (var5 != null) {
            var5.e(x, y);
            x = x + var5.fullWidth;
            x = x + this.spacing;
          }
        }
    }

    final int width(int guard) {
        if (guard != 11384) {
          this.updateWidth((byte) -120);
        }
        return this.width;
    }

    SpriteStrip(Sprite[] sprites, int spacing) {
        try {
          this.spacing = spacing;
          this.sprites = sprites;
          this.updateWidth((byte) 112);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "tc.<init>(" + (sprites != null ? "{...}" : "null") + ',' + spacing + ')');
        }
    }

    static {
        field_p = new hf();
        field_g = new dh();
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_i = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_o = "Skip Tutorial";
        field_h = "SPACE or SHIFT";
        field_k = new char[][]{new char[]{(char)8364, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)381}, new char[]{(char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)382, (char)376}};
    }
}
