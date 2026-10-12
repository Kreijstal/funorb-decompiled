/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends IntrusiveNode {
    static String field_o;
    static String field_l;
    int field_n;
    static String field_q;
    static boolean field_k;
    int field_m;
    static RgbSprite[] field_p;

    final static RgbSprite e(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var1;
        Object var3;
        int[] var5_ref_int__;
        int var7;
        int[] var9;
        int[] var11;
        int[] var13;
        byte[] var16;
        byte[] var17;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var1 = qm.field_K[0] * c.field_e[0];
        var17 = AnimationPlayer.field_j[0];
        if (param0 != 12722) {
          bj.a(-13);
        }
        if (!MapTile.field_e[0]) {
          var9 = new int[var1];
          for (var5 = 0; var1 > var5; var5++) {
            var9[var5] = MovementPresentation.field_j[rn.bitwiseAnd(255, (int) var17[var5])];
          }
          var3 = new RgbSprite(lg.field_d, wr.field_J, j.field_e[0], CampaignMenuButton.field_g[0], qm.field_K[0], c.field_e[0], var9);
        } else {
          var16 = CampaignMenuEntry.field_z[0];
          var13 = new int[var1];
          var11 = var13;
          var5_ref_int__ = var11;
          for (var6 = 0; var6 < var1; var6++) {
            var5_ref_int__[var6] = oe.bitwiseOr(rn.bitwiseAnd(255, (int) var16[var6]) << 24, MovementPresentation.field_j[rn.bitwiseAnd(255, (int) var17[var6])]);
          }
          var3 = new nj(lg.field_d, wr.field_J, j.field_e[0], CampaignMenuButton.field_g[0], qm.field_K[0], c.field_e[0], var13);
        }
        rj.d((byte) 113);
        return (RgbSprite) (var3);
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 0) {
          return;
        }
        field_p = null;
        field_q = null;
        field_o = null;
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
        field_q = "Equipment to sway the battle in your favour.";
        field_l = "Sandbox";
        field_k = true;
        field_o = "Highscores";
    }
}
