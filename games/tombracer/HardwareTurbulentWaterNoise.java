/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareTurbulentWaterNoise extends TurbulenceNoise3D {
    static String field_o;
    private byte[] field_p;

    final static void f(int param0) {
        if (param0 != -804227775) {
          HardwareTurbulentWaterNoise.createDecodedSprites(-62);
        }
        String var2 = (String) null;
        pr.a(0, "", (String) null);
    }

    final void writeVoxel(int param0, boolean param1, byte param2) {
        if (param1) {
          return;
        }
        int var4 = param0 * 2;
        param2 = (byte)(((255 & param2) >> 1) + 127);
        int incrementValue$0 = var4;
        var4++;
        this.field_p[incrementValue$0] = (byte)param2;
        this.field_p[var4] = (byte)param2;
    }

    final byte[] generate(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return (byte[]) null;
        }
        this.field_p = new byte[param2 * (param3 * param0 * 2)];
        this.generateVolume(param0, param2, param3, (byte) -119);
        return this.field_p;
    }

    HardwareTurbulentWaterNoise() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    public static void releaseStatics(int param0) {
        if (param0 > -26) {
          return;
        }
        field_o = null;
    }

    final static Sprite[] createDecodedSprites(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 < 71) {
          return (Sprite[]) null;
        }
        var1 = new Sprite[fa.field_b];
        for (var2 = 0; var2 < fa.field_b; var2++) {
          var3 = mq.field_b[var2] * iga.field_m[var2];
          var21 = ck.field_c[var2];
          if (!NetworkArchiveRequest.field_n[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var3 > var6; var6++) {
              var10[var6] = mga.field_g[SnakePitBehaviour.bitwiseAnd(255, (int) var21[var6])];
            }
            var1[var2] = new Sprite(ika.field_a, OpenGlRenderbuffer.field_s, LoadLevelCommand.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var22);
          } else {
            var15 = pb.field_l[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = WallTile.bitwiseOr(SnakePitBehaviour.bitwiseAnd(-16777216, var15[var7] << 24), mga.field_g[SnakePitBehaviour.bitwiseAnd(255, (int) var21[var7])]);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(ika.field_a, OpenGlRenderbuffer.field_s, LoadLevelCommand.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var17));
          }
        }
        MazeGenerator.a((byte) 2);
        return var1;
    }

    final static boolean h(int param0) {
        if (param0 != 9807) {
          HardwareTurbulentWaterNoise.h(127);
        }
        return bl.field_a != null ? true : false;
    }

    static {
        field_o = "Bags o' Loot";
    }
}
