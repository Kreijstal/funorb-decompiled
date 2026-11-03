/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    volatile boolean field_v;
    static TickClock field_y;
    boolean field_t;
    static int[] field_z;
    static String[] field_w;
    static int[] field_A;
    boolean field_x;
    static wm field_u;

    final static void a(byte param0) {
        ui.field_f = new Sprite(7, 25);
        ui.field_f.c();
        SoftwareRasterizer.d(0, 0, 28, 25, 7, 16711935);
        SoftwareRasterizer.e(0, 0, 28, 25, 7, 65793);
        ClientException.field_f.a(19692);
        NameAvailabilityValidator.field_q = new Sprite(7, 25);
        NameAvailabilityValidator.field_q.c();
        SoftwareRasterizer.e(1, 3, 28, 21, 6, 16777215);
        SoftwareRasterizer.e(1, 2, 28, 21, 6, 16777215);
        if (param0 > 91) {
          SoftwareRasterizer.e(0, 2, 28, 21, 6, 65793);
          ClientException.field_f.a(19692);
          di.field_c = new Sprite(8, 25);
          di.field_c.c();
          SoftwareRasterizer.e(SoftwareRasterizer.field_j - 28, 3, 28, 21, 6, 16777215);
          SoftwareRasterizer.e(-28 + SoftwareRasterizer.field_j, 2, 28, 21, 6, 16777215);
          SoftwareRasterizer.e(-28 + (SoftwareRasterizer.field_j - 1), 2, 28, 21, 6, 65793);
          ClientException.field_f.a(19692);
          return;
        }
        ArchiveRequest.a((byte) 36);
        SoftwareRasterizer.e(0, 2, 28, 21, 6, 65793);
        ClientException.field_f.a(19692);
        di.field_c = new Sprite(8, 25);
        di.field_c.c();
        SoftwareRasterizer.e(SoftwareRasterizer.field_j - 28, 3, 28, 21, 6, 16777215);
        SoftwareRasterizer.e(-28 + SoftwareRasterizer.field_j, 2, 28, 21, 6, 16777215);
        SoftwareRasterizer.e(-28 + (SoftwareRasterizer.field_j - 1), 2, 28, 21, 6, 65793);
        ClientException.field_f.a(19692);
    }

    public static void b(byte param0) {
        field_A = null;
        field_z = null;
        field_w = null;
        field_y = null;
        field_u = null;
        if (param0 >= -91) {
          field_z = (int[]) null;
        }
    }

    abstract byte[] h(int param0);

    abstract int g(int param0);

    ArchiveRequest() {
        this.field_v = true;
    }

    static {
        field_z = new int[128];
        field_w = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_u = new wm(9, 0, 4, 1);
    }
}
