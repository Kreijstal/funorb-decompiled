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

    final static void createTimerBarCapSprites(byte param0) {
        ui.field_f = new Sprite(7, 25);
        ui.field_f.makeRasterTarget();
        SoftwareRasterizer.fillRoundedRectangle(0, 0, 28, 25, 7, 16711935);
        SoftwareRasterizer.drawRoundedRectangle(0, 0, 28, 25, 7, 65793);
        ClientException.field_f.bindRaster(19692);
        NameAvailabilityValidator.field_q = new Sprite(7, 25);
        NameAvailabilityValidator.field_q.makeRasterTarget();
        SoftwareRasterizer.drawRoundedRectangle(1, 3, 28, 21, 6, 16777215);
        SoftwareRasterizer.drawRoundedRectangle(1, 2, 28, 21, 6, 16777215);
        if (param0 > 91) {
          SoftwareRasterizer.drawRoundedRectangle(0, 2, 28, 21, 6, 65793);
          ClientException.field_f.bindRaster(19692);
          di.field_c = new Sprite(8, 25);
          di.field_c.makeRasterTarget();
          SoftwareRasterizer.drawRoundedRectangle(SoftwareRasterizer.field_j - 28, 3, 28, 21, 6, 16777215);
          SoftwareRasterizer.drawRoundedRectangle(-28 + SoftwareRasterizer.field_j, 2, 28, 21, 6, 16777215);
          SoftwareRasterizer.drawRoundedRectangle(-28 + (SoftwareRasterizer.field_j - 1), 2, 28, 21, 6, 65793);
          ClientException.field_f.bindRaster(19692);
          return;
        }
        ArchiveRequest.createTimerBarCapSprites((byte) 36);
        SoftwareRasterizer.drawRoundedRectangle(0, 2, 28, 21, 6, 65793);
        ClientException.field_f.bindRaster(19692);
        di.field_c = new Sprite(8, 25);
        di.field_c.makeRasterTarget();
        SoftwareRasterizer.drawRoundedRectangle(SoftwareRasterizer.field_j - 28, 3, 28, 21, 6, 16777215);
        SoftwareRasterizer.drawRoundedRectangle(-28 + SoftwareRasterizer.field_j, 2, 28, 21, 6, 16777215);
        SoftwareRasterizer.drawRoundedRectangle(-28 + (SoftwareRasterizer.field_j - 1), 2, 28, 21, 6, 65793);
        ClientException.field_f.bindRaster(19692);
    }

    public static void releaseStatics(byte param0) {
        field_A = null;
        field_z = null;
        field_w = null;
        field_y = null;
        field_u = null;
        if (param0 >= -91) {
          field_z = (int[]) null;
        }
    }

    abstract byte[] getData(int param0);

    abstract int getProgressPercent(int param0);

    ArchiveRequest() {
        this.field_v = true;
    }

    static {
        field_z = new int[128];
        field_w = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_u = new wm(9, 0, 4, 1);
    }
}
