/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KiteBackground extends BackgroundScene {
    private fo[] field_m;
    static PlatformTask field_o;
    private jm[] field_n;

    final static boolean b(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          return false;
        }
        stackIn_6_0 = (null != NodeHashTableIterator.field_e) && (GameModeSelectScreen.field_s.b(-21));
        return stackIn_6_0;
    }

    final void tick(int param0) {
        jm[] var2;
        int var3;
        int var5;
        jm[] var6;
        jm var9;
        fo[] var2_array;
        fo[] var7;
        int var8;
        fo var10;
        int var3Lifetime1;
        var5 = Pixelate.field_H ? 1 : 0;
        super.tick(param0);
        var6 = this.field_n;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var9 = var6[var3];
          var9.field_m = var9.field_m + var9.field_e;
          if (-200.0 > var9.field_m ||
            640.0 < var9.field_m) {
            var9.a((byte) -114);
            this.sortKitesByDepth(-1);
          }
        }
        var7 = this.field_m;
        var2_array = var7;
        var8 = 0;
        var3Lifetime1 = var8;
        while (var7.length > var8) {
          var10 = var7[var8];
          var10.a(-173);
          var8++;
        }
    }

    private final boolean areKitesSortedByDepth(byte param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; this.field_n.length - 1 > var2; var2++) {
          if (!(this.field_n[var2].field_l <= this.field_n[1 + var2].field_l)) {
            return false;
          }
        }
        var2Lifetime1 = -99 / ((-7 - param0) / 43);
        return true;
    }

    final static Sprite[] loadSpriteSheet(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!PieceTiming.a(param0, false, param3, param1)) {
            return null;
          }
          if (param2 == 1000) {
            stackIn_7_0 = wa.buildSprites(param2 - 1119);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("se.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void resendPendingRequests(byte param0, int param1) {
        int var3 = 0;
        rh var4 = null;
        RankingTableRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var4 = (rh) (MenuScreen.field_b.first(1504642273));
          while (var4 != null) {
            AlphaContainer.a((byte) -76, var4, param1);
            var4 = (rh) (MenuScreen.field_b.next(1504642273));
          }
          var5 = (RankingTableRequest) (DialWidgetPainter.field_c.first(1504642273));
          while (var5 != null) {
            LobbyPlayer.sendRankingTableRequest(param1, var5, 65536);
            var5 = (RankingTableRequest) (DialWidgetPainter.field_c.next(1504642273));
          }
          if (param0 <= 3) {
            KiteBackground.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var2), "se.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void render(boolean param0) {
        jm var4 = null;
        fo var4_ref = null;
        int var3 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        int var3Lifetime1;
        SoftwareRasterizer.fillVerticalGradient(0, 0, 640, 480, 8874, 3368703);
        if (param0) {
          return;
        }
        jm[] var2 = this.field_n;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          SocketConnector.field_c[var4.field_n].drawScaledWithOpacity((int)var4.field_m, var4.field_c, var4.field_a, var4.field_f, var4.field_t);
        }
        fo[] var2_array = this.field_m;
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2_array.length) {
          var4_ref = var2_array[var6];
          var4_ref.b(1);
          var6++;
        }
    }

    private final void swapKites(byte param0, int param1, int param2) {
        int var4 = 36 / ((param0 - 20) / 49);
        jm var5 = this.field_n[param1];
        this.field_n[param1] = this.field_n[param2];
        this.field_n[param2] = var5;
    }

    final static boolean loadMembersBenefitsAssets(int param0) {
        if (null != PasswordFieldPainter.field_y) {
          return true;
        }
        if (param0 != 3782) {
          KiteBackground.b(true);
        }
        if (!MenuInputState.field_d.ensureGroupAvailableByName("benefits", -1)) {
          return false;
        }
        PasswordFieldPainter.field_y = bi.loadSprite("benefits", "members_benefits_borders", MenuInputState.field_d, (byte) -89);
        MusicPatchPcmStream.field_p = bi.loadSprite("benefits", "members_benefits_price", MenuInputState.field_d, (byte) -70);
        SpriteState.field_t = bi.loadSprite("benefits", "members_benefits_logo", MenuInputState.field_d, (byte) -118);
        li.field_h = SocketConnector.loadRgbSpritesByName("members_benefits_screenshots", "benefits", (byte) 47, MenuInputState.field_d);
        bl.a(11833, PasswordFieldPainter.field_y, SoundCache.field_e);
        ni.a(MusicPatchPcmStream.field_p, 2, 40, 40, 80, false, -2400, 15, PieceTiming.field_e, 80, 0);
        PictureStrip.a(-25960, li.field_h);
        sk.a(param0 ^ -3744, SpriteState.field_t);
        return true;
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        if (param0 != 21476) {
          field_o = (PlatformTask) null;
        }
    }

    private final void sortKitesByDepth(int param0) {
        int var2 = 0;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        while (!this.areKitesSortedByDepth((byte) 89)) {
          for (var2 = 0; -1 + this.field_n.length > var2; var2++) {
            if (this.field_n[var2 + 1].field_l < this.field_n[var2].field_l) {
              this.swapKites((byte) 108, 1 + var2, var2);
            }
          }
        }
        if (param0 != -1) {
          field_o = (PlatformTask) null;
        }
    }

    KiteBackground(String param0, Sprite[] param1) {
        super(param0, param1);
        int var3_int = 0;
        try {
          this.field_n = new jm[10];
          for (var3_int = 0; var3_int < 10; var3_int++) {
            this.field_n[var3_int] = new jm();
          }
          this.sortKitesByDepth(-1);
          this.field_m = new fo[4];
          this.field_m[0] = new fo(1400, 150, 400, 500, 1000);
          this.field_m[1] = new fo(1800, 430, 320, 800, 1000);
          this.field_m[2] = new fo(2200, 500, 140, 900, 1000);
          this.field_m[3] = new fo(2600, 230, 220, 700, 1000);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "se.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
