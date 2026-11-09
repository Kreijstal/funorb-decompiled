/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlPbuffer extends DualLinkNode {
    int pixelCount;
    private LegacyOpenGlGraphicsToolkit toolkit;
    private long pbuffer;
    static int maxHeapMiB;
    static String clickToAssignPointsText;
    static int field_s;
    static String[] field_w;

    public static void releaseStatics(int param0) {
        clickToAssignPointsText = null;
        if (param0 != -1) {
          return;
        }
        field_w = null;
    }

    private final void close(int guard) {
        if (this.pbuffer > 0L) {
          this.toolkit.field_y.releasePbuffer(this.pbuffer);
          this.pbuffer = 0L;
        }
        if (guard == 30611) {
          return;
        }
        this.toolkit = (LegacyOpenGlGraphicsToolkit) null;
    }

    final static String playerLabel(byte guard) {
        String var1 = "";
        if (no.field_a != null) {
          var1 = no.field_a.identifier((byte) 48);
        }
        if (guard <= -53) {
          if (0 == var1.length()) {
            var1 = LegacyOpenGlRenderbuffer.f(1);
          }
          if (var1.length() == 0) {
            var1 = FullscreenMembershipDialog.playerText;
          }
          return var1;
        }
        field_w = (String[]) null;
        if (0 == var1.length()) {
          var1 = LegacyOpenGlRenderbuffer.f(1);
        }
        if (var1.length() == 0) {
          var1 = FullscreenMembershipDialog.playerText;
        }
        return var1;
    }

    protected final void finalize() throws Throwable {
        this.close(30611);
        super.finalize();
    }

    final long handle(int guard) {
        if (guard >= -68) {
          return -90L;
        }
        return this.pbuffer;
    }

    LegacyOpenGlPbuffer(LegacyOpenGlGraphicsToolkit toolkit, int width, int height) {
        try {
          this.toolkit = toolkit;
          this.pixelCount = width * height;
          this.pbuffer = this.toolkit.field_y.createPbuffer(width, height);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wh.<init>(" + (toolkit != null ? "{...}" : "null") + ',' + width + ',' + height + ')');
        }
    }

    static {
        clickToAssignPointsText = "click to assign points <br> right-click to remove points";
        maxHeapMiB = 64;
        field_w = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
