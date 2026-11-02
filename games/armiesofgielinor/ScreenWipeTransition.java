/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenWipeTransition {
    static boolean field_a;
    static int[] field_b;
    private int field_l;
    private int[] snapshot;
    static NodeDeque field_c;
    private int field_k;
    private int width;
    private int field_g;
    static String field_i;
    private int height;
    private byte[] thresholds;
    static int campaignPacketWord2;
    static boolean[] field_m;

    private final void captureScreen(int startColumn) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        RadialSummonMenu.playDefaultSoundWithIntGuard(70, ClientUiNode.field_v[13]);
        for (var2 = startColumn; this.width > var2; var2++) {
          for (var3 = 0; var3 < this.height; var3++) {
            this.snapshot[var2 + this.width * var3] = SoftwareRaster.pixels[this.field_l + var2 + (this.field_k + var3) * SoftwareRaster.width];
          }
        }
    }

    private final int triangleWave(int position, int period, int obfuscationGuard) {
        int var4 = FloorModSupport.floorModWithOffset(position, 1, period);
        if (var4 > period / 2) {
          var4 = period - var4;
        }
        if (obfuscationGuard != 13) {
          return -127;
        }
        return var4;
    }

    final void draw(int obfuscationGuard, int progress) {
        int var3 = 0;
        int var4 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 8) {
          ScreenWipeTransition.releaseStatics((byte) -21);
        }
        for (var3 = 0; this.width > var3; var3++) {
          for (var4 = 0; this.height > var4; var4++) {
            var5 = this.width * var4 + var3;
            var6 = this.field_l + (var3 + SoftwareRaster.width * (var4 + this.field_k));
            if (this.thresholds[var5] > progress) {
              if (this.thresholds[var5] <= 8 + progress) {
                var7 = SoftwareRaster.pixels[var6];
                var8 = this.snapshot[var5];
                var9 = (-progress + this.thresholds[var5]) * 256 / 8;
                SoftwareRaster.pixels[var6] = AccountRegistrationDialog.bitwiseOr(AccountRegistrationDialog.bitwiseOr(var9 * ProceduralMapSupport.bitwiseAnd(var8, 255) + ProceduralMapSupport.bitwiseAnd(var7, 255) * (-var9 + 256) >> 8, ProceduralMapSupport.bitwiseAnd(var9 * (ProceduralMapSupport.bitwiseAnd(var8, 65280) >> 8) + (-var9 + 256) * (ProceduralMapSupport.bitwiseAnd(var7, 65280) >> 8), 65280)), ProceduralMapSupport.bitwiseAnd((ProceduralMapSupport.bitwiseAnd(var7, 16711680) >> 16) * (256 - var9) + (ProceduralMapSupport.bitwiseAnd(var8, 16711680) >> 16) * var9 << 8, 16711851));
              } else {
                SoftwareRaster.pixels[var6] = this.snapshot[var5];
              }
            }
          }
        }
    }

    public static void releaseStatics(byte obfuscationGuard) {
        field_m = null;
        field_c = null;
        field_b = null;
        field_i = null;
        if (obfuscationGuard != -109) {
          ScreenWipeTransition.releaseStatics((byte) 9);
        }
    }

    public ScreenWipeTransition() {
        int var3 = 0;
        int var4 = 0;
        int var2 = 0;
        int var2Lifetime1;
        this.field_l = 0;
        this.field_k = 0;
        this.height = FixedSquareRootSupport.field_b.height;
        this.width = FixedSquareRootSupport.field_b.width;
        this.field_g = 50;
        this.thresholds = new byte[this.height * this.width];
        this.snapshot = new int[this.width * this.height];
        int[] var9 = new int[this.height];
        int[] var7 = var9;
        int[] var6 = var7;
        int[] var1 = var6;
        for (var2 = 1; var2 < this.height; var2++) {
          var6[var2] = (int)(40.0 * Math.sin(3.141592653589793 * (double)var2 / (double)this.height * 6.0));
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.width; var2Lifetime1++) {
          for (var3 = 0; var3 < this.height; var3++) {
            var4 = (5 * this.triangleWave(var9[var3] + var2Lifetime1, 160, 13) - var3 * 2 + 1160) * (-8 + this.field_g) / 1280;
            this.thresholds[this.width * var3 + var2Lifetime1] = (byte)var4;
          }
        }
        this.captureScreen(0);
    }

    static {
        field_b = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 9};
        field_i = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_c = new NodeDeque();
        field_m = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, true, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, true, false, false, false, true, false};
    }
}
