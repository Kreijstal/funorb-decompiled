/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends SceneWidget {
    String field_Nb;
    static boolean field_Jb;
    static int field_Qb;
    static String field_Mb;
    static Sprite[] field_Hb;
    SceneWidget field_Pb;
    SceneWidget field_Ob;
    int field_Kb;
    String field_Ib;
    String field_Gb;
    static String field_Lb;
    String field_Fb;
    SceneWidget field_Eb;
    private static String field_Rb;

    public static void j(int param0) {
        if (param0 != -25942) {
          im.j(-7);
          field_Hb = null;
          field_Lb = null;
          field_Mb = null;
          return;
        }
        field_Hb = null;
        field_Lb = null;
        field_Mb = null;
    }

    im() {
        super(0L, (SceneWidget) null);
    }

    static {
        field_Rb = "im.A(";
        field_Mb = "Waiting for graphics";
        field_Jb = false;
        field_Lb = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
