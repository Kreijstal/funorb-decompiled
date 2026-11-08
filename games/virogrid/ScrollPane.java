/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPane extends SpriteWidget {
    SpriteWidget field_Jb;
    static String field_Ib;
    SpriteWidget field_Eb;
    static volatile int field_Fb;
    static int field_Gb;
    VerticalScrollbar field_Hb;
    static String textViewcontrolsMode;

    private final void applyScrollInput(boolean param0, int param1, int param2, int param3, int param4) {
        if (this.field_Hb.pollLineUp((byte) -87)) {
          this.field_Jb.field_Cb = this.field_Jb.field_Cb + param4;
        }
        if (this.field_Hb.pollLineDown(-1)) {
          this.field_Jb.field_Cb = this.field_Jb.field_Cb - param4;
        }
        if (this.field_Hb.pollPageUp(-84)) {
          this.field_Jb.field_Cb = this.field_Jb.field_Cb + param3;
        }
        if (this.field_Hb.pollPageDown((byte) -29)) {
          this.field_Jb.field_Cb = this.field_Jb.field_Cb - param3;
        }
        if (this.field_S) {
          this.field_Jb.field_Cb = this.field_Jb.field_Cb - param1;
        }
        if (param0) {
          if (-(this.field_Jb.field_F + this.field_Jb.field_Cb) < 0) {
            this.field_Jb.field_Cb = -this.field_Jb.field_F;
          }
          if (-(this.field_Jb.field_Cb + this.field_Jb.field_F) > -this.field_Eb.field_ub + (this.field_Jb.field_ub + this.field_Jb.field_kb)) {
            this.field_Jb.field_Cb = -(this.field_Jb.field_ub + this.field_Jb.field_kb - this.field_Eb.field_ub) - this.field_Jb.field_F;
          }
        } else {
          if (-this.field_Eb.field_ub + (this.field_Jb.field_kb + this.field_Jb.field_ub) < -(this.field_Jb.field_F + this.field_Jb.field_Cb)) {
            this.field_Jb.field_Cb = -this.field_Jb.field_F - (this.field_Jb.field_ub - (-this.field_Jb.field_kb + this.field_Eb.field_ub));
          }
          if (0 > -(this.field_Jb.field_F + this.field_Jb.field_Cb)) {
            this.field_Jb.field_Cb = -this.field_Jb.field_F;
          }
        }
        if (param2 > -97) {
          return;
        }
        if (this.field_Hb.isThumbHeld((byte) 90)) {
          this.field_Jb.field_F = -this.field_Hb.getDraggedScrollOffset((byte) 61, this.field_Eb.field_ub, param0, this.field_Jb.field_ub);
          this.field_Jb.field_Cb = 0;
        }
        this.field_Hb.layoutScrollbar(this.field_Jb.field_ub, -this.field_Jb.field_F, this.field_Eb.field_ub, -1);
    }

    private final boolean layoutAndScroll(int param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6) {
        int var8;
        int var9;
        int stackIn_8_0 = 0;
        if (!param2) {
          if (this.field_S) {
            stackIn_8_0 = (!param4) ? 1 : 0;
          } else {
            stackIn_8_0 = 0;
          }
        } else {
          stackIn_8_0 = 1;
        }
        var8 = stackIn_8_0;
        this.field_Jb.layoutChildren(var8 != 0, param6, 0, this.field_Eb.field_ub);
        var9 = 72 % ((param1 + 3) / 59);
        this.applyScrollInput(false, param0, -102, param5, param3);
        return var8 != 0;
    }

    final void setScrollPaneBounds(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 > -97) {
          field_Ib = (String) null;
        }
        this.field_ub = param4;
        this.field_K = param2;
        this.field_tb = param5;
        this.field_F = param0;
        this.layoutScrollPane((byte) 64, param3, param6);
    }

    private final void layoutScrollPane(byte param0, int param1, int param2) {
        this.field_Eb.field_ub = this.field_ub;
        if (param0 != 64) {
          ScrollPane.createIndexedSprites((byte) -121);
        }
        this.field_Jb.field_tb = 0;
        this.field_Eb.field_K = this.field_K - (param2 + param1);
        this.field_Jb.field_K = -param1 + (-param2 + this.field_K);
        this.field_Hb.setBoundsAndLayout(0, this.field_ub, this.field_Jb.field_ub, -this.field_Jb.field_F, 0, this.field_K - param2, param2, this.field_Eb.field_ub);
    }

    final void updateScroll(int param0, int param1, boolean param2, int param3) {
        this.applyScrollInput(param2, param3, -118, this.field_Eb.field_ub, param1);
        if (param0 != -1) {
          this.layoutScrollPane((byte) -116, 107, -74);
        }
    }

    ScrollPane(long param0, SpriteWidget param1, SpriteWidget param2, VerticalScrollbar param3) {
        super(param0, (SpriteWidget) null);
        try {
          this.field_Eb = new SpriteWidget(0L, param2);
          this.field_Hb = new VerticalScrollbar(0L, param3);
          this.addChild(0, this.field_Eb);
          this.addChild(0, this.field_Hb);
          this.field_Jb = param1;
          this.field_Eb.addChild(0, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "um.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite[] createIndexedSprites(byte param0) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        int var2 = 58 / ((param0 + 85) / 39);
        IndexedSprite[] var1 = new IndexedSprite[MarkerSliderPainter.field_h];
        for (var3 = 0; var3 < MarkerSliderPainter.field_h; var3++) {
          var1[var3] = new IndexedSprite(QuickChatMenu.field_Kb, LobbyJoinTextGlobals.field_d, BufferedSocket.field_w[var3], ContentTransitionDialog.field_bb[var3], Bzip2State.field_k[var3], MarkerSlider.field_F[var3], CheckboxPainter.field_j[var3], GameEntryHelpers.field_c);
        }
        PlayingSound.releaseDecodeArrays((byte) -28);
        return var1;
    }

    final boolean updateContentLayout(int param0, boolean param1, boolean param2, int param3, int param4, boolean param5) {
        if (param2) {
          this.updateContentLayout(-108, false, true, 15, -127, false);
        }
        return this.layoutAndScroll(param4, 110, param5, param0, param1, this.field_Eb.field_ub, param3);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          ScrollPane.createIndexedSprites((byte) 120);
        }
        field_Ib = null;
        textViewcontrolsMode = null;
    }

    static {
        field_Fb = 0;
        textViewcontrolsMode = "Switch between a 3D and 2D view";
        field_Ib = "Return to Main Menu";
    }
}
