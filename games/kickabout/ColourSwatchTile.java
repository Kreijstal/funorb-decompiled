/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ColourSwatchTile extends UiLayoutNode {
    private int field_Cb;
    private int field_Ab;
    private ClubState field_zb;
    int field_yb;
    static String field_Bb;

    final static boolean a(int param0, AuctionListing param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        AuctionListing var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          if (param0 != 140) {
            ColourSwatchTile.b(108);
          }
          var4 = (AuctionListing) (BuyPlayerDialog.field_K.g(param0 ^ 23877));
          while (var4 != null) {
            if (var4.isSameListing(param1, 5250)) {
              return false;
            }
            var4 = (AuctionListing) (BuyPlayerDialog.field_K.c(param0 ^ 173));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean c(boolean param0) {
        int var2 = this.field_Ab == 0 ? this.field_zb.field_k : this.field_zb.field_R;
        if (!param0) {
          return var2 == this.field_yb ? true : false;
        }
        return false;
    }

    final void a(int param0) {
        int var5 = 0;
        int var7 = 0;
        int var6 = 0;
        int var8 = Kickabout.field_G;
        int var2 = this.c(false) ? 1 : 0;
        int var3 = this.field_F;
        int var4 = this.field_T;
        if (var2 == 0) {
          var5 = var3;
          var7 = 21;
          var6 = var4;
        } else {
          var6 = -4 + var4;
          var5 = -4 + var3;
          var7 = 29;
        }
        SoftwareRasterizer.e(var5 + 1, var6, -2 + var7, var7, 0);
        SoftwareRasterizer.e(var5, 1 + var6, var7, var7 - 2, 0);
        SoftwareRasterizer.fillRect(2 + var5, var6 + 2, -4 + var7, -4 + var7, this.field_Cb);
        if (var2 != 0) {
          if (!this.field_gb) {
            ArrayWidgetContainer.field_z[0].drawScaledAlpha(var5 + 2, var6 + 2, -4 + var7, var7 - 4, 140);
            ArrayWidgetContainer.field_z[1].drawScaledAlpha(var5 + 2, var6 + 2, -4 + var7, -4 + var7, 128);
            ArrayWidgetContainer.field_z[3].drawScaledAdditive(2 + var5, var6 + 2, -4 + var7, -4 + var7, 256);
          }
          su.field_a.c((-su.field_a.field_o + var7 >> 1) + var5, (var7 - su.field_a.field_v >> 1) + var6);
          SoftwareRasterizer.drawHorizontalLineAlpha(var5 + 2, -3 + var7 + var6, -4 + var7, 0, 90);
          SoftwareRasterizer.drawVerticalLineAlpha(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
          SoftwareRasterizer.drawVerticalLineAlpha(2 + var5, 2 + var6, var7 - 5, 0, 90);
          return;
        }
        if (this.field_gb) {
          SoftwareRasterizer.drawHorizontalLineAlpha(var5 + 2, -3 + var7 + var6, -4 + var7, 0, 90);
          SoftwareRasterizer.drawVerticalLineAlpha(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
          SoftwareRasterizer.drawVerticalLineAlpha(2 + var5, 2 + var6, var7 - 5, 0, 90);
          return;
        }
        ArrayWidgetContainer.field_z[0].b(var5 + 2, var6 + 2, 140);
        ArrayWidgetContainer.field_z[1].b(var5 + 2, var6 + 2, 128);
        ArrayWidgetContainer.field_z[3].drawAdditive(2 + var5, 2 + var6, 128);
        SoftwareRasterizer.drawHorizontalLineAlpha(var5 + 2, -3 + var7 + var6, -4 + var7, 0, 90);
        SoftwareRasterizer.drawVerticalLineAlpha(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
        SoftwareRasterizer.drawVerticalLineAlpha(2 + var5, 2 + var6, var7 - 5, 0, 90);
    }

    public static void h(int param0) {
        field_Bb = null;
        if (param0 != -31922) {
          field_Bb = (String) null;
        }
    }

    ColourSwatchTile(ClubState param0, int param1, int param2) {
        try {
          this.field_yb = param2;
          this.field_Ab = param1;
          this.field_zb = param0;
          this.field_Cb = TriangleRasterizer.field_l[LongPlusOneCommand.field_B[this.field_yb]];
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        FadingSoundPlayer var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          PasswordLoginCredentials.b((byte) -28);
          var3 = (FadingSoundPlayer) (StrongCacheEntry.field_z.g(24009));
          while (var3 != null) {
            var3.update((byte) -127);
            var3 = (FadingSoundPlayer) (StrongCacheEntry.field_z.c(33));
          }
          if (param0 == 17702) {
            return;
          }
          ColourSwatchTile.b(94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "gi.B(" + param0 + ')');
        }
    }

    static {
        field_Bb = "Your email address is used to identify this account";
    }
}
