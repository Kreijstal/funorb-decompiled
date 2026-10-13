/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static boolean field_a;
    static int[] field_b;
    private int field_l;
    private int[] field_e;
    static NodeDeque field_c;
    private int field_k;
    private int field_h;
    private int field_g;
    static String field_i;
    private int field_f;
    private byte[] field_d;
    static int campaignPacketWord2;
    static boolean[] field_m;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        RadialSummonMenu.playDefaultSoundWithIntGuard(70, ClientUiNode.field_v[13]);
        for (var2 = param0; this.field_h > var2; var2++) {
          for (var3 = 0; var3 < this.field_f; var3++) {
            this.field_e[var2 + this.field_h * var3] = SoftwareRaster.pixels[this.field_l + var2 + (this.field_k + var3) * SoftwareRaster.width];
          }
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = th.floorModWithOffset(param0, 1, param1);
        if (var4 > param1 / 2) {
          var4 = param1 - var4;
        }
        if (param2 != 13) {
          return -127;
        }
        return var4;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 8) {
          cg.a((byte) -21);
        }
        for (var3 = 0; this.field_h > var3; var3++) {
          for (var4 = 0; this.field_f > var4; var4++) {
            var5 = this.field_h * var4 + var3;
            var6 = this.field_l + (var3 + SoftwareRaster.width * (var4 + this.field_k));
            if (this.field_d[var5] > param1) {
              if (this.field_d[var5] <= 8 + param1) {
                var7 = SoftwareRaster.pixels[var6];
                var8 = this.field_e[var5];
                var9 = (-param1 + this.field_d[var5]) * 256 / 8;
                SoftwareRaster.pixels[var6] = AccountRegistrationDialog.bitwiseOr(AccountRegistrationDialog.bitwiseOr(var9 * rn.bitwiseAnd(var8, 255) + rn.bitwiseAnd(var7, 255) * (-var9 + 256) >> 8, rn.bitwiseAnd(var9 * (rn.bitwiseAnd(var8, 65280) >> 8) + (-var9 + 256) * (rn.bitwiseAnd(var7, 65280) >> 8), 65280)), rn.bitwiseAnd((rn.bitwiseAnd(var7, 16711680) >> 16) * (256 - var9) + (rn.bitwiseAnd(var8, 16711680) >> 16) * var9 << 8, 16711851));
              } else {
                SoftwareRaster.pixels[var6] = this.field_e[var5];
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_c = null;
        field_b = null;
        field_i = null;
        if (param0 != -109) {
          cg.a((byte) 9);
        }
    }

    public cg() {
        int var3 = 0;
        int var4 = 0;
        int var2 = 0;
        int var2Lifetime1;
        this.field_l = 0;
        this.field_k = 0;
        this.field_f = so.field_b.field_g;
        this.field_h = so.field_b.field_a;
        this.field_g = 50;
        this.field_d = new byte[this.field_f * this.field_h];
        this.field_e = new int[this.field_h * this.field_f];
        int[] var9 = new int[this.field_f];
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var1 = var6;
        for (var2 = 1; var2 < this.field_f; var2++) {
          var6[var2] = (int)(40.0 * Math.sin(3.141592653589793 * (double)var2 / (double)this.field_f * 6.0));
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_h; var2Lifetime1++) {
          for (var3 = 0; var3 < this.field_f; var3++) {
            var4 = (5 * this.a(var9[var3] + var2Lifetime1, 160, 13) - var3 * 2 + 1160) * (-8 + this.field_g) / 1280;
            this.field_d[this.field_h * var3 + var2Lifetime1] = (byte)var4;
          }
        }
        this.a(0);
    }

    static {
        field_b = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 9};
        field_i = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_c = new NodeDeque();
        field_m = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, true, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, true, false, false, false, true, false};
    }
}
