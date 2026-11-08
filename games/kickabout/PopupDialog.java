/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PopupDialog extends IntrusiveNode {
    private int field_k;
    static String field_h;
    private int field_p;
    static String field_f;
    private MenuSelection field_j;
    private int field_q;
    private int field_r;
    private int field_e;
    UiLayoutNode[] field_i;
    private Sprite field_l;
    int field_n;
    static java.security.SecureRandom field_g;
    private String[] field_o;
    private int field_m;

    abstract void drawBody(byte param0, int param1, int param2);

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int fieldTemp$0 = 0;
        int stackIn_22_0 = 0;
        UiLayoutNode stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        if (param0 != -16536) {
          return;
        }
        this.onUpdate(3, param1);
        this.field_j.updatePointerSelection(param0 ^ 4642, this.a(true, TutorialCaptionSupport.field_j, ArrayWidgetContainer.field_x), this.a(true, TabStrip.field_Eb, TrinketIcon.field_yb));
        if (this.field_n == 0 &&
          0 == this.field_m) {
          ShopPlayerSlot.playDefaultFadingSound(this.getOpenSoundId(false), -104);
        }
        if (this.field_n != 0) {
          if (this.field_n == 1) {
            for (var3 = 0; this.field_i.length > var3; var3++) {
              stackIn_22_0 = (var3 != this.field_j.selectedIndex) ? 0 : 1;
              var4 = stackIn_22_0;
              this.field_i[var3].updateInput(0, param1);
              stackIn_25_0 = this.field_i[var3];
              stackIn_26_1 = (this.field_i[var3].field_lb) && (var4 != 0);
              stackIn_25_0.field_gb = stackIn_26_1;
              if (1 == this.field_i[var3].field_sb) {
                this.handleResult(118, var3);
                this.beginClose(param0 ^ -3410);
              }
              if (null != this.field_o &&
                null != this.field_o[var3] &&
                this.field_i[var3].field_gb) {
                IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, this.field_o[var3]);
              }
            }
            this.field_q = 4096;
          } else {
            if (2 == this.field_n) {
              this.field_j.selectedIndex = -1;
              if (this.field_m > 0) {
                this.field_m = this.field_m - 2;
              }
              this.field_q = (this.field_m << 12) / CanvasResizePolicy.field_q.length;
            }
          }
        } else {
          fieldTemp$0 = this.field_m + 1;
          this.field_m = this.field_m + 1;
          if (fieldTemp$0 >= CanvasResizePolicy.field_q.length - 1) {
            this.field_n = 1;
          }
          this.field_q = CanvasResizePolicy.field_q[this.field_m];
        }
    }

    abstract void handleResult(int param0, int param1);

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_g = (java.security.SecureRandom) null;
        }
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        UiLayoutNode var4;
        int var4_int;
        int var5;
        int var6;
        int var7;
        UiLayoutNode var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var7Lifetime1;
        var11 = Kickabout.field_G;
        var2 = this.field_m << 4;
        if (var2 > 100) {
          var2 = 100;
        }
        if (param0) {
          this.field_r = 11;
        }
        SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, var2);
        if (this.field_q == 4096) {
          this.a(32, this.field_p, this.field_k);
          var12 = 0;
          var3 = var12;
          while (this.field_i.length > var12) {
            var4 = this.field_i[var12];
            var4.draw(100, false);
            var12++;
          }
        } else {
          var3 = this.field_e * this.field_q >> 12;
          var4_int = this.field_r * this.field_q >> 12;
          var5 = -var3 + 640 >> 1;
          PacketBuffer.pushSpriteRaster(73, this.field_l);
          var6 = -var4_int + 480 >> 1;
          this.a(32, 0, 0);
          for (var7 = 0; var7 < this.field_i.length; var7++) {
            var8 = this.field_i[var7];
            var9 = var8.field_s;
            var8.field_s = var8.field_s - this.field_p;
            var10 = var8.field_J;
            var8.field_J = var8.field_J - this.field_k;
            var8.updateInput(0, false);
            var8.draw(74, false);
            var8.field_J = var10;
            var8.field_s = var9;
          }
          TeamManagementScreen.e(119);
          var7Lifetime1 = (this.field_m << 10) / CanvasResizePolicy.field_q.length;
          if (var7Lifetime1 > 256) {
            var7Lifetime1 = 256;
          }
          this.field_l.drawScaledAlpha(var5, var6, var3, var4_int, var7Lifetime1);
        }
    }

    abstract void onUpdate(int param0, boolean param1);

    abstract int dialogHeight(byte param0);

    final void setOptionLabels(String[] param0, byte param1) {
        try {
          this.field_o = param0;
          if (param1 != 90) {
            this.field_p = -12;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jb.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean handleKey(int param0, byte param1, char param2) {
        int var5;
        var5 = Kickabout.field_G;
        if (1 != this.field_n) {
          return true;
        }
        if (param0 == 13) {
          this.beginClose(19910);
        } else {
          this.field_j.handleArrowKeys(0, true);
          if (this.field_j.selectedIndex != -1) {
            while (!this.field_i[this.field_j.selectedIndex].field_lb) {
              this.field_j.selectedIndex = (this.field_j.selectedIndex + 1) % this.field_j.itemCount;
            }
          }
          if (this.field_j.selectedIndex >= 0 &&
            this.field_j.isActivated(-1)) {
            this.handleResult(114, this.field_j.selectedIndex);
            this.beginClose(19910);
          }
        }
        if (param1 != -21) {
          this.b(45, true);
        }
        return true;
    }

    abstract int getOpenSoundId(boolean param0);

    private final int a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Kickabout.field_G;
        var4 = 0;
        if (!param0) {
          return -67;
        }
        while (this.field_i.length > var4) {
          var5 = this.field_i[var4].field_q;
          var6 = this.field_i[var4].field_mb;
          var7 = this.field_i[var4].field_F;
          var8 = this.field_i[var4].field_T;
          if (param2 >= var7 &&
            var7 + var5 > param2 &&
            param1 >= var8 &&
            param1 < var8 + var6) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    abstract int dialogWidth(int param0);

    final boolean isClosed(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -31268) {
          this.field_q = 38;
        }
        stackIn_6_0 = (this.field_n == 2) && (this.field_m <= 0);
        return stackIn_6_0;
    }

    final void beginClose(int param0) {
        this.field_n = 2;
        if (param0 != 19910) {
          this.field_m = 118;
        }
    }

    final void open(int param0, String[] param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        try {
          this.field_n = 0;
          if (param2 != 1054928844) {
            this.onUpdate(46, true);
          }
          this.field_q = 0;
          this.field_e = this.dialogWidth(-1379118556);
          this.field_r = this.dialogHeight((byte) 115);
          this.field_k = 480 - this.field_r >> 1;
          this.field_p = -this.field_e + 640 >> 1;
          this.field_l = new Sprite(this.field_e, this.field_r);
          this.field_i = new UiLayoutNode[param1.length];
          var4_int = this.field_i.length;
          var5 = -(95 * var4_int) - 5 * (var4_int - 1) + 640 >> 1;
          for (var6 = 0; this.field_i.length > var6; var6++) {
            param1[var6] = param1[var6].toLowerCase();
            this.field_i[var6] = SoftwareDrawingSupport.createRenderedButton(param1[var6], 7126504, ByteArrayPool.field_d, 90, false);
            var7 = this.field_k + this.field_r + (-this.field_i[var6].field_mb - 10);
            this.field_i[var6].field_s = 100 * var6 + var5;
            this.field_i[var6].field_J = var7;
          }
          this.field_j = new MenuSelection(this.field_i.length);
          this.field_j.selectedIndex = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jb.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        AuctionListing.pushRasterClip(param1 + this.field_e, param0 - 22946, param1, param2 + this.field_r, param2);
        for (var4 = 0; this.field_e > var4; var4++) {
          TutorialScenerySupport.field_a.drawOpaque(var4 + param1, param2 + this.field_r - 480);
        }
        AuctionLogEntry.field_j.drawScaledAdditive(param1 - 10, 15 + param2, AuctionLogEntry.field_j.field_o * 2 / 3, 2 * AuctionLogEntry.field_j.field_v / 3, param0);
        this.drawBody((byte) -29, param1, param2);
        SoftwareRasterizer.drawThickRectangle(param1, param2, this.field_e, this.field_r, 2, 65793);
        TeamManagementScreen.e(124);
    }

    PopupDialog() {
        this.field_q = 0;
        this.field_m = 0;
    }

    static {
        field_f = "(<%0> players want to join)";
        field_h = "Kickabout is also availible as an application on <col=ffff00>Facebook</col>.";
    }
}
