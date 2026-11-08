/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends DualLinkNode {
    int field_v;
    private LegacyOpenGlGraphicsToolkit field_u;
    private long field_t;
    static int field_x;
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

    private final void f(int param0) {
        if (this.field_t > 0L) {
          this.field_u.field_y.releasePbuffer(this.field_t);
          this.field_t = 0L;
        }
        if (param0 == 30611) {
          return;
        }
        this.field_u = (LegacyOpenGlGraphicsToolkit) null;
    }

    final static String a(byte param0) {
        String var1 = "";
        if (no.field_a != null) {
          var1 = no.field_a.a((byte) 48);
        }
        if (param0 <= -53) {
          if (0 == var1.length()) {
            var1 = kf.f(1);
          }
          if (var1.length() == 0) {
            var1 = kq.playerText;
          }
          return var1;
        }
        field_w = (String[]) null;
        if (0 == var1.length()) {
          var1 = kf.f(1);
        }
        if (var1.length() == 0) {
          var1 = kq.playerText;
        }
        return var1;
    }

    protected final void finalize() throws Throwable {
        this.f(30611);
        super.finalize();
    }

    final long e(int param0) {
        if (param0 >= -68) {
          return -90L;
        }
        return this.field_t;
    }

    wh(LegacyOpenGlGraphicsToolkit param0, int param1, int param2) {
        try {
          this.field_u = param0;
          this.field_v = param1 * param2;
          this.field_t = this.field_u.field_y.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        clickToAssignPointsText = "click to assign points <br> right-click to remove points";
        field_x = 64;
        field_w = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
