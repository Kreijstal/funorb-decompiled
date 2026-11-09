/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSlicePanel {
    static java.awt.Canvas field_f;
    static String[] field_b;
    private Sprite[] sprites;
    static boolean[] field_d;
    static PlatformTaskDispatcher field_e;
    static String creatingAJagexAccountText;
    static boolean field_a;
    static int field_g;

    final void draw(int width, int x, int height, int guard, int y) {
        int var6 = -18 % ((-62 - guard) / 63);
        SoftwareTransform3D.drawNineSlice(x, this.sprites, (byte) -34, y, height, width);
    }

    private NineSlicePanel() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        if (param0 == 0) {
          creatingAJagexAccountText = null;
          field_e = null;
          return;
        }
        NineSlicePanel.releaseStatics(-30);
        creatingAJagexAccountText = null;
        field_e = null;
    }

    static {
        field_d = new boolean[25];
        creatingAJagexAccountText = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_g = 0;
    }
}
