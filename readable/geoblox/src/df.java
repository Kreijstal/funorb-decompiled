/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class df {
    static String endGameText;
    static IndexedSprite spaceBackgroundSprite;

    abstract qg a(byte param0);

    abstract void a(int param0, qc param1);

    final static void a(boolean param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(pg.field_c);
            param1.removeMouseMotionListener(pg.field_c);
            if (param0) {
                spaceBackgroundSprite = (IndexedSprite) null;
            }
            param1.removeFocusListener(pg.field_c);
            s.field_I = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "df.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ob b(byte param0) {
        if (param0 <= 11) {
            df.b((byte) 74);
            return uf.field_e;
        }
        return uf.field_e;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            endGameText = (String) null;
            spaceBackgroundSprite = null;
            endGameText = null;
            return;
        }
        spaceBackgroundSprite = null;
        endGameText = null;
    }

    static {
        endGameText = "End Game";
    }
}
