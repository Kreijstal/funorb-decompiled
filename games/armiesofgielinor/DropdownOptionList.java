/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownOptionList extends kq {
    static String field_X;
    int hoveredIndex;
    static String field_Y;
    Object[] options;
    static int[] field_R;
    int rowHeight;
    private DropdownSelector selector;
    private BitmapFont font;
    int selectedIndex;
    static String field_S;

    private final void setOptions(int selectedIndex, int obfuscationGuard, Object[] options) {
        try {
          this.selectedIndex = selectedIndex;
          if (obfuscationGuard != 5526) {
            this.setOptions(-25, -92, new Object[6]);
          }
          this.options = options;
          this.hoveredIndex = -1;
          if (options != null &&
            (this.selectedIndex < -1 || this.selectedIndex >= this.options.length)) {
            throw new IllegalStateException();
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pp.A(" + selectedIndex + ',' + obfuscationGuard + ',' + (options != null ? "{...}" : "null") + ')');
        }
    }

    DropdownOptionList(DropdownSelector selector, BitmapFont font, Object[] options, int selectedIndex) {
        super(selector);
        try {
          this.font = font;
          this.selector = selector;
          this.rowHeight = this.font.maxAscent + this.font.maxDescent;
          this.setOptions(selectedIndex, 5526, options);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pp.<init>(" + (selector != null ? "{...}" : "null") + ',' + (font != null ? "{...}" : "null") + ',' + (options != null ? "{...}" : "null") + ',' + selectedIndex + ')');
        }
    }

    public static void b(boolean param0) {
        field_S = null;
        field_X = null;
        field_Y = null;
        field_R = null;
        if (param0) {
          field_Y = (String) null;
        }
    }

    final int a(byte param0) {
        if (param0 == -126) {
          return null != this.options ? (1 + this.options.length * 2) * this.rowHeight >> 1 : 200;
        }
        field_R = (int[]) null;
        return null != this.options ? (1 + this.options.length * 2) * this.rowHeight >> 1 : 200;
    }

    final Object getSelectedOption(int obfuscationGuard) {
        if (obfuscationGuard != -6508) {
          return this.options[0];
        }
        if (null == this.options) {
          return null;
        }
        if (this.selectedIndex != -1) {
          return this.options[this.selectedIndex];
        }
        return null;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        Object var14;
        String var15;
        Object var16;
        String var17;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (renderLayer != 0) {
          return;
        }
        var5 = originX + this.x;
        if (obfuscationGuard <= -82) {
          var6 = this.y + originY;
          SoftwareRaster.f(var5, var6, this.width, this.height, 0);
          var7 = this.selectedIndex;
          if (-1 != this.hoveredIndex) {
            var7 = this.hoveredIndex;
          }
          if (null == this.options) {
            return;
          }
          for (var8 = 0; this.options.length > var8; var8++) {
            var16 = this.options[var8];
            var17 = var16.toString();
            if (var7 == var8) {
              SoftwareRaster.b(var5 + 2, 4 + var6, this.width - 4, this.rowHeight, 2188450, 128);
            }
            var6 = var6 + this.rowHeight;
            this.font.drawText(var17, var5 + 2, var6, 10000536, -1);
          }
          return;
        }
        this.containsPointer(((int[]) (this.options[13]))[3], -51, -121, ((int[]) (this.options[9]))[0], -117);
        var6Lifetime1 = this.y + originY;
        SoftwareRaster.f(var5, var6Lifetime1, this.width, this.height, 0);
        var7Lifetime1 = this.selectedIndex;
        if (-1 != this.hoveredIndex) {
          var7Lifetime1 = this.hoveredIndex;
        }
        if (null == this.options) {
          return;
        }
        for (var8Lifetime1 = 0; this.options.length > var8Lifetime1; var8Lifetime1++) {
          var14 = this.options[var8Lifetime1];
          var15 = var14.toString();
          if (var7Lifetime1 == var8Lifetime1) {
            SoftwareRaster.b(var5 + 2, 4 + var6Lifetime1, this.width - 4, this.rowHeight, 2188450, 128);
          }
          var6Lifetime1 = var6Lifetime1 + this.rowHeight;
          this.font.drawText(var15, var5 + 2, var6Lifetime1, 10000536, -1);
        }
    }

    final boolean containsPointer(int obfuscationGuard, int originX, int pointerY, int pointerX, int originY) {
        this.hoveredIndex = -1;
        if (!this.selector.expanded) {
          return false;
        }
        if (!this.selector.dropdownViewport.field_S.hovered) {
          return false;
        }
        if (this.options == null) {
          return super.containsPointer(1, originX, pointerY, pointerX, originY);
        }
        if (obfuscationGuard != 1) {
          this.containsPointer(((int[]) (this.options[22]))[2], ((int[]) (this.options[1]))[19], 73, ((int[]) (((Object[]) (this.options[0]))[3]))[0], ((int[]) (this.options[3]))[14]);
        }
        pointerY = pointerY - (originY + this.y);
        pointerX = pointerX - (originX + this.x);
        if (0 > pointerX) {
          return false;
        }
        if (pointerY < 0) {
          return false;
        }
        if (this.width < pointerX) {
          return false;
        }
        if (this.height < pointerY) {
          return false;
        }
        this.hoveredIndex = pointerY / this.rowHeight;
        if (this.hoveredIndex < this.options.length) {
          return true;
        }
        this.hoveredIndex = -1;
        return true;
    }

    final void activate(int button, int pointerX, int pointerY, boolean notifyListener) {
        super.activate(button, pointerX, pointerY, notifyListener);
        pointerX = pointerX - this.x;
        pointerY = pointerY - this.y;
        if (this.options == null) {
          return;
        }
        int var5 = pointerY / this.rowHeight;
        if (var5 < 0) {
          return;
        }
        if (this.options.length > var5) {
          this.selectedIndex = var5;
          this.selector.g((byte) 27);
          return;
        }
    }

    static {
        field_X = "<%0> has left the lobby.";
        field_S = "Prestige coats of arms.";
        field_Y = "Capture an enemy goal or defeat an enemy leader to eliminate their side from the battle.";
    }
}
