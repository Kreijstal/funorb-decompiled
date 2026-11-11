/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DropInMenuScreen extends MenuScreen {
    DropAnimation field_q;

    void update(boolean param0, boolean param1, int param2) {
        super.update(param0, param1, param2);
        this.field_q.updateFall((byte) -125, param0, !param1 ? true : false);
    }

    final static boolean hasFlag2048(int param0, int param1, int param2) {
        if (param2 != 2048) {
          return false;
        }
        return (param0 & 2048) != 0 ? true : false;
    }

    final void draw(byte param0, boolean param1) {
        int var3 = this.field_q.getPosition(-82);
        IntArrayRequest.field_h.draw(0, var3);
        this.drawPanelContent(param1, var3, (byte) -104);
        super.draw(param0, param1);
    }

    final void onShow(int param0, int param1, boolean param2) {
        super.onShow(param0 ^ param0, param1, param2);
        this.field_q.startDrop(-65);
    }

    DropInMenuScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_q = new DropAnimation();
    }

    abstract void drawPanelContent(boolean param0, int param1, byte param2);

    static {
    }
}
