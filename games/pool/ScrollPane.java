/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPane extends UiComponent {
    UiComponent content;
    UiComponent viewport;
    VerticalScrollbar scrollbar;
    static hj field_Tb;
    static String playerX2AreGroupName;
    static ProgressDialog field_Nb;
    static int field_Pb;
    static String ratedGame;
    static int field_Ob;
    static byte[] field_Lb;

    private final boolean layoutAndScroll(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var8;
        int stackIn_8_0 = 0;
        if (!param3) {
          if (this.activeInside) {
            stackIn_8_0 = (!param1) ? 1 : 0;
          } else {
            stackIn_8_0 = 0;
          }
        } else {
          stackIn_8_0 = 1;
        }
        var8 = stackIn_8_0;
        this.content.layoutVerticalContent(param6, this.viewport.height, var8 != 0, param4 - 1);
        if (param4 != 0) {
          return false;
        }
        this.applyScrollInput(param0, true, param2, false, param5);
        return var8 != 0;
    }

    final boolean updateContentLayout(boolean param0, boolean param1, int param2, byte param3, int param4, int param5) {
        int var7 = 70 % ((param3 - 6) / 49);
        return this.layoutAndScroll(param5, param0, this.viewport.height, param1, 0, param4, param2);
    }

    public static void releaseStatics(int param0) {
        field_Nb = null;
        field_Tb = null;
        playerX2AreGroupName = null;
        ratedGame = null;
        if (param0 != 0) {
          ScrollPane.a(65, (byte) -5, -15);
        }
        field_Lb = null;
    }

    final void setScrollPaneBounds(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        this.localX = param5;
        this.localY = param6;
        this.width = param4;
        if (param2 != -112) {
          field_Ob = 6;
        }
        this.height = param1;
        this.layoutScrollPane(param0, param3, false);
    }

    private final void layoutScrollPane(int param0, int param1, boolean param2) {
        this.viewport.height = this.height;
        this.content.localX = 0;
        this.viewport.width = -param1 + this.width - param0;
        this.content.width = this.width - (param0 + param1);
        this.scrollbar.setScrollbarBounds(this.content.height, 0, this.height, param0, -this.content.localY, 8414, -param0 + this.width, this.viewport.height);
        if (param2) {
          this.scrollbar = (VerticalScrollbar) null;
        }
    }

    ScrollPane(long param0, UiComponent param1, UiComponent param2, VerticalScrollbar param3) {
        super(param0, (UiComponent) null);
        try {
          this.viewport = new UiComponent(0L, param2);
          this.scrollbar = new VerticalScrollbar(0L, param3);
          this.addChild(-122, this.viewport);
          this.addChild(76, this.scrollbar);
          this.content = param1;
          this.viewport.addChild(-118, param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "of.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 != 0) {
          field_Ob = 7;
        }
        tp.field_h[0] = -140 + param2 * 280 / param0;
    }

    final static void a(byte param0, ResourceArchive param1) {
        int var2_int = 0;
        int var3 = Pool.field_O;
        try {
          if (param0 <= 16) {
            field_Tb = (hj) null;
          }
          for (var2_int = 0; nn.field_b.length > var2_int; var2_int++) {
            nn.field_b[var2_int].loadBackdrop(5, param1);
          }
          pn.field_l = new Sprite(param1.getFileByName(false, "menu-framed-background.jpg", ""), (java.awt.Component) ((Object) TimeTrialSelectScreen.field_K));
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "of.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateScroll(int param0, int param1, int param2, boolean param3) {
        this.applyScrollInput(param1, true, this.viewport.height, param3, param2);
        if (param0 != -1207) {
          this.updateContentLayout(true, true, -121, (byte) -41, -22, -3);
        }
    }

    private final void applyScrollInput(int param0, boolean param1, int param2, boolean param3, int param4) {
        if (this.scrollbar.pollLineUp(-4779)) {
          this.content.remainingY = this.content.remainingY + param4;
        }
        if (this.scrollbar.pollLineDown((byte) -62)) {
          this.content.remainingY = this.content.remainingY - param4;
        }
        if (this.scrollbar.pollPageUp((byte) -63)) {
          this.content.remainingY = this.content.remainingY + param2;
        }
        if (this.scrollbar.pollPageDown((byte) 127)) {
          this.content.remainingY = this.content.remainingY - param2;
        }
        if (!param1) {
          this.viewport = (UiComponent) null;
        }
        if (this.activeInside) {
          this.content.remainingY = this.content.remainingY - param0;
        }
        if (!param3) {
          if (-(this.content.remainingY + this.content.localY) > -this.viewport.height + (this.content.remainingHeight + this.content.height)) {
            this.content.remainingY = -this.content.localY - (-this.viewport.height + this.content.height + this.content.remainingHeight);
          }
          if (-(this.content.remainingY + this.content.localY) < 0) {
            this.content.remainingY = -this.content.localY;
          }
        } else {
          if (-(this.content.localY + this.content.remainingY) < 0) {
            this.content.remainingY = -this.content.localY;
          }
          if (-(this.content.localY + this.content.remainingY) > this.content.height + this.content.remainingHeight - this.viewport.height) {
            this.content.remainingY = -(this.content.remainingHeight + (this.content.height - this.viewport.height)) - this.content.localY;
          }
        }
        if (this.scrollbar.isThumbCaptured(-92)) {
          this.content.localY = -this.scrollbar.getDraggedScrollOffset(param3, this.content.height, this.viewport.height, 48);
          this.content.remainingY = 0;
        }
        this.scrollbar.layoutScrollbar(this.content.height, this.viewport.height, false, -this.content.localY);
    }

    final static void a(int param0, boolean param1, int param2) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        IntrusiveDequeCursor var6 = null;
        ChatMessageLine var7 = null;
        Sprite var9 = null;
        int var5Lifetime1;
        try {
          if (MatchingTextValidator.field_r.c(0)) {
            return;
          }
          var9 = ((ChatMessageLine) (MatchingTextValidator.field_r.c((byte) 104))).renderedSprite;
          if (var9 == null) {
            return;
          }
          SoftwareRasterizer.saveClip(kg.field_t);
          var4 = var9.field_A;
          param2 = param2 - (var4 >> 1);
          SoftwareRasterizer.setClip(param0, param2, param0 + 230, var4 + param2);
          var5 = 0;
          var6 = new IntrusiveDequeCursor(MatchingTextValidator.field_r);
          if (param1) {
            return;
          }
          var7 = (ChatMessageLine) (var6.last((byte) -92));
          while (var7 != null) {
            if (null != var7.renderedSprite) {
              var5Lifetime1 = (int)((double)var7.field_p + 0.5);
              for (var8 = 0; var8 < var7.field_l; var8++) {
                if (var5Lifetime1 < 230) {
                  var7.renderedSprite.draw(var5Lifetime1 + param0, param2);
                  var5Lifetime1 = var5Lifetime1 + (4 + var7.renderedSprite.field_z);
                  continue;
                }
                break;
              }
              var7 = (ChatMessageLine) (var6.previous(-85));
              continue;
            }
            break;
          }
          SoftwareRasterizer.restoreClip(kg.field_t);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "of.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        playerX2AreGroupName = "<%0> and <%1> are <%2>.";
        field_Tb = new hj(9, 0, 4, 1);
        field_Lb = new byte[]{(byte)2, (byte) 0, (byte) 0, (byte) 0};
        ratedGame = "Rated game";
    }
}
