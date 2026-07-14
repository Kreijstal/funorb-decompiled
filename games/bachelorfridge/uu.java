/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu extends sna {
    static String field_zb;
    private int field_wb;
    int field_Cb;
    static ee field_vb;
    private String field_xb;
    private String field_Bb;
    private kv field_Ab;
    static boolean field_yb;

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (param1 != 83) {
            field_vb = null;
        }
        for (var4 = 0; var4 < param0; var4++) {
            var6[var4] = param2;
        }
        return new String(var6);
    }

    public static void f(byte param0) {
        field_vb = null;
        if (param0 < 9) {
            String discarded$0 = uu.a(127, 25, 'ﾍ');
        }
        field_zb = null;
    }

    uu(kv param0, int param1, String param2, int param3) {
        ((uu) this).field_Bb = param2;
        ((uu) this).field_p = 102;
        ((uu) this).field_wb = param3;
        ((uu) this).field_sb = 402;
        ((uu) this).field_Ab = param0;
        ((uu) this).field_Cb = param1;
        ((uu) this).field_xb = fw.field_h[((uu) this).field_Cb].field_c;
        ((uu) this).field_v = this.b(true);
        ((uu) this).a(-1, new sna("buy", (sna) null, 294, 70, 80, 20, qd.field_l));
    }

    private final kv b(boolean param0) {
        String var3 = null;
        kv var4 = null;
        L0: {
          var4 = new kv(400, 102);
          var4.b();
          dg.c(0, 0, 400, 102, 16777215);
          dg.e(0, 0, 380, 8698113);
          dg.e(0, 1, 380, 8698113);
          dg.e(0, 100, 380, 8698113);
          dg.e(0, 101, 380, 8698113);
          dg.c(15, 16, 62, 56, 16768634);
          ((uu) this).field_Ab.e(18, 10);
          dg.c(86, 10, 288, 24, 16700507);
          jha.field_g.c(((uu) this).field_Bb, 102, 26, 11796224, -1);
          hfa.field_z.c(((uu) this).field_Bb, 102, 26, 65793, -1);
          int discarded$1 = g.field_g.a(((uu) this).field_xb, 102, 36, 240, 70, 8553090, -1, 0, 0, 14);
          var3 = lga.a(param0, new String[1], vla.field_u);
          jha.field_g.a(var3, 43, 86, 16699649, -1);
          hfa.field_z.a(var3, 43, 86, 65793, -1);
          dg.e(294, 70, 80, 20, 9, 8698113);
          jha.field_g.a(qd.field_l, 334, 84, 16777215, -1);
          hfa.field_z.a(qd.field_l, 334, 84, 16204, -1);
          if (-1 > (dm.field_f ^ -1)) {
            break L0;
          } else {
            if (!fw.field_h[((uu) this).field_Cb].field_e) {
              jha.field_g.b(dj.field_b, 288, 92, 16736256, -1);
              break L0;
            } else {
              break L0;
            }
          }
        }
        dg.c(8, 10, 75, 83, 2, 16694784);
        hga.field_U.a((byte) -27);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = "The actions have now changed to its attack abilities. Click one of these to activate it and then choose one of the yellow squares to direct your attack there, the red squares shows those your attack will affect.";
    }
}
