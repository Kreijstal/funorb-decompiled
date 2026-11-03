/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HelpTipDialog extends MessageDialog {
    private int field_K;
    static int[] field_F;
    static nm[][] field_I;
    static String field_G;
    static int[] field_J;
    static int field_H;

    public static void g(byte param0) {
        field_F = null;
        field_G = null;
        field_J = null;
        if (param0 < -92) {
          field_I = (nm[][]) null;
          return;
        }
        field_I = (nm[][]) null;
        field_I = (nm[][]) null;
    }

    final void handleResult(int param0, int param1) {
        int var5 = 0;
        boolean[] var3;
        int var4;
        int var6;
        boolean[] var7;
        var6 = Kickabout.field_G;
        super.handleResult(84, param1);
        if (PlayArea.a(100)) {
          return;
        }
        var7 = GameLoopApplet.field_E.field_J;
        var3 = var7;
        if (param0 < 60) {
          return;
        }
        if (var7[this.field_K]) {
          return;
        }
        var7[this.field_K] = true;
        if (!PlayArea.a(100)) {
          var4 = 0;
          for (var5 = 0; var7.length > var5; var5++) {
            if (var7[var5]) {
              var4 = var4 | 1 << var5;
            }
          }
          or.field_d.b(69, (byte) 119);
          or.field_d.writeInt(-57, var4);
        }
    }

    HelpTipDialog(int param0) {
        super(param0);
        this.field_K = -12 + param0 + 1;
    }

    final int dialogWidth(int param0) {
        if (param0 != -1379118556) {
          field_F = (int[]) null;
          return 400;
        }
        return 400;
    }

    static {
        field_F = new int[8192];
        field_J = new int[5];
        field_J[1] = 204800;
        field_J[4] = 655360;
        field_J[0] = 409600;
        field_J[2] = 204800;
        field_J[3] = 180224;
        field_G = "Play the game without logging in just yet";
        field_H = 6;
    }
}
