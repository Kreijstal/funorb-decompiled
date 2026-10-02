/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    short[] field_J;
    byte[] field_n;
    static int field_w;
    int[] field_l;
    int[] field_d;
    short[] field_i;
    short[] field_B;
    short[] field_M;
    int[] field_x;
    short[] field_z;
    byte field_v;
    int field_Q;
    int[] field_y;
    int field_N;
    int[] field_p;
    int[] field_a;
    short[] field_e;
    short[] field_u;
    short[] field_K;
    short[] field_O;
    short field_f;
    static int screenTransitionTick;
    int[] field_b;
    private boolean field_D;
    int[] field_L;
    short[] field_c;
    short[] field_P;
    short[] field_r;
    int[] field_C;
    static String reloadGameText;
    short[] field_h;
    int field_H;
    short[] field_G;
    short field_m;
    short[] field_g;
    short[] field_t;
    static IntrusiveDeque field_j;
    int field_s;
    short[] field_k;
    int field_I;
    int field_F;
    short[] field_q;
    short field_o;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Geoblox.field_C;
        for (var6 = 0; var6 < this.field_o; var6++) {
            this.field_O[var6] = (short)(param3 * this.field_O[var6] / param1);
            this.field_q[var6] = (short)(this.field_q[var6] * param0 / param1);
            this.field_K[var6] = (short)(this.field_K[var6] * param4 / param1);
        }
        if (param2 <= 69) {
            nf.a(-90, 1, 93);
        }
        this.a(-7008);
    }

    final static int chooseSpawnSpriteVariant(byte methodGuard) {
        if (methodGuard >= -55) {
            return 66;
        }
        return qi.b(ag.availableSpriteVariantCount, 1);
    }

    public static void b(byte param0) {
        field_j = null;
        reloadGameText = null;
        if (param0 != 115) {
            nf.a(124, -30, -53);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        for (var5 = 0; this.field_o > var5; var5++) {
            this.field_O[var5] = (short)(this.field_O[var5] + param0);
            this.field_q[var5] = (short)(this.field_q[var5] + param1);
            this.field_K[var5] = (short)(this.field_K[var5] + param3);
        }
        this.a(-7008);
        if (param2 != -9121) {
            this.field_g = (short[]) null;
        }
    }

    final void a(byte param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = Geoblox.field_C;
        if (this.field_D) {
          return;
        }
        this.field_D = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        L0: for (var8 = 0; this.field_o > var8; var8++) {
          var9 = this.field_O[var8];
          var10 = this.field_q[var8];
          if (~var10 > ~var3) {
            var3 = var10;
          }
          if (var6 < var10) {
            var6 = var10;
          }
          var11 = this.field_K[var8];
          if (var9 < var2) {
            var2 = var9;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var11 > var7) {
            var7 = var11;
          }
          if (var4 <= var11) {
            continue L0;
          }
          var4 = var11;
        }
        this.field_H = var6;
        this.field_s = var3;
        this.field_F = var4;
        this.field_I = var5;
        if (param0 != -99) {
          this.field_K = (short[]) null;
        }
        this.field_Q = var2;
        this.field_N = var7;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (hb.field_l != null) {
            if (hb.field_l.length >= param2) {
              break L0;
            }
          }
          hb.field_l = new int[param2 * 2];
        }
        L2: {
          if (null != hg.field_a) {
            if (param2 <= hg.field_a.length) {
              break L2;
            }
          }
          hg.field_a = new int[param2 * 2];
        }
        L4: {
          if (null != fb.field_m) {
            if (fb.field_m.length >= param2) {
              break L4;
            }
          }
          fb.field_m = new int[param2 * 2];
        }
        L6: {
          if (null != k.field_i) {
            if (param2 <= k.field_i.length) {
              break L6;
            }
          }
          k.field_i = new int[param2 * 2];
        }
        L8: {
          if (null != cj.field_b) {
            if (cj.field_b.length >= param2) {
              break L8;
            }
          }
          cj.field_b = new int[2 * param2];
        }
        L10: {
          if (null != gk.field_a) {
            if (gk.field_a.length >= param2) {
              break L10;
            }
          }
          gk.field_a = new int[param2 * 2];
        }
        L12: {
          if (null != qi.field_i) {
            if (qi.field_i.length >= param2 + param1) {
              break L12;
            }
          }
          qi.field_i = new int[(param2 + param1) * 2];
        }
        L14: {
          if (null != qh.field_C) {
            if (qh.field_C.length >= param2) {
              break L14;
            }
          }
          qh.field_C = new boolean[2 * param2];
        }
        md.field_c = 0;
        va.field_b = -2147483648;
        ok.field_b = 2147483647;
        bd.field_a = -2147483648;
        qg.field_a = param0;
    }

    final static Sprite[] buildRgbSpritesFromDecodedSheet(int methodGuard) {
        int spriteIndex = 0;
        int pixelCount = 0;
        byte[] paletteIndices = null;
        int[] rgbPixels = null;
        int pixelIndex = 0;
        Sprite[] sprites = new Sprite[sb.decodedSpriteCount];
        for (spriteIndex = 0; sb.decodedSpriteCount > spriteIndex; spriteIndex++) {
            pixelCount = hl.decodedSpriteHeights[spriteIndex] * DualLinkNode.decodedSpriteWidths[spriteIndex];
            paletteIndices = mj.decodedSpriteIndices[spriteIndex];
            rgbPixels = new int[pixelCount];
            for (pixelIndex = 0; pixelIndex < pixelCount; pixelIndex++) {
                rgbPixels[pixelIndex] = cm.decodedSpritePalette[cd.a((int) paletteIndices[pixelIndex], 255)];
            }
            sprites[spriteIndex] = new Sprite(pg.decodedSpriteCanvasWidth, dd.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], md.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], hl.decodedSpriteHeights[spriteIndex], rgbPixels);
        }
        if (methodGuard != 255) {
            screenTransitionTick = 40;
        }
        kj.clearDecodedSpriteWorkingArrays(true);
        return sprites;
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        if (!(p.field_k != -1)) {
            if (!el.b(30000, 1)) {
                return false;
            }
            p.field_k = eh.field_d.readUnsignedByte((byte) 34);
            eh.field_d.position = 0;
        }
        if (p.field_k == -2) {
            if (!(el.b(30000, 2))) {
                return false;
            }
            p.field_k = eh.field_d.readUnsignedShortBE(true);
            eh.field_d.position = 0;
        }
        return el.b(30000, p.field_k);
    }

    private final void a(int param0) {
        this.field_D = false;
        if (param0 != -7008) {
            nf.a(-110, 99, 92);
        }
    }

    nf() {
        this.field_D = false;
        this.field_v = (byte) 0;
    }

    static {
        reloadGameText = "Reload game";
        field_j = new IntrusiveDeque();
    }
}
