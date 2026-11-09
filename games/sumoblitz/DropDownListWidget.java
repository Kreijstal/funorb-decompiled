/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropDownListWidget extends FocusProxyWidget {
    private DropDownWidget dropDown;
    Object[] options;
    static String regularText;
    static Sprite[] field_O;
    private LegacyBitmapFont font;
    static ResourceArchive field_H;
    int rowHeight;
    int hoveredIndex;
    int selectionIndex;

    public static void releaseStatics(int param0) {
        regularText = null;
        field_H = null;
        int var1 = 84 / ((-18 - param0) / 55);
        field_O = null;
    }

    final boolean containsPoint(int pointerX, int guard, int parentX, int pointerY, int parentY) {
        this.hoveredIndex = -1;
        if (!this.dropDown.listOpen) {
          return false;
        }
        if (!this.dropDown.listScrollPane.viewport.hovered) {
          return false;
        }
        if (null == this.options) {
          return super.containsPoint(pointerX, -1, parentX, pointerY, parentY);
        }
        pointerY = pointerY - (this.y + parentY);
        pointerX = pointerX - (this.x + parentX);
        if (guard < ~pointerX) {
          return false;
        }
        if (pointerY < 0) {
          return false;
        }
        if (pointerX > this.width) {
          return false;
        }
        if (pointerY > this.height) {
          return false;
        }
        this.hoveredIndex = pointerY / this.rowHeight;
        if (this.options.length > this.hoveredIndex) {
          return true;
        }
        this.hoveredIndex = -1;
        return true;
    }

    final int preferredHeight(byte guard) {
        int var2 = -28 / ((guard + 73) / 48);
        return this.options == null ? 200 : (1 + this.options.length * 2) * this.rowHeight >> 1;
    }

    final Object selectedOption(int guard) {
        if (guard >= -22) {
          this.renderLayer(((int[]) (this.options[0]))[0], ((int[]) (this.options[1]))[7], (byte) -89, -41);
          if (null == this.options) {
            return null;
          }
          if (this.selectionIndex != -1) {
            return this.options[this.selectionIndex];
          }
          return null;
        }
        if (null == this.options) {
          return null;
        }
        if (this.selectionIndex != -1) {
          return this.options[this.selectionIndex];
        }
        return null;
    }

    final void notifyAction(int action, int pointerX, boolean guard, int pointerY) {
        super.notifyAction(action, pointerX, guard, pointerY);
        pointerY = pointerY - this.y;
        pointerX = pointerX - this.x;
        if (this.options == null) {
          return;
        }
        int var5 = pointerY / this.rowHeight;
        if (var5 < 0) {
          return;
        }
        if (var5 < this.options.length) {
          this.selectionIndex = var5;
          this.dropDown.notifySelectionChanged(0);
          return;
        }
    }

    private final void setOptions(int guard, int selectedIndex, Object[] newOptions) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.options = newOptions;
          this.hoveredIndex = -1;
          this.selectionIndex = selectedIndex;
          if (newOptions != null && (this.selectionIndex < -1 ||
            this.options.length <= this.selectionIndex)) {
            throw new IllegalStateException();
          }
          if (guard == -22994) {
            return;
          }
          this.hoveredIndex = ((int[]) (this.options[1]))[1];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("hd.DB(").append(guard).append(',').append(selectedIndex).append(',');
          if (newOptions == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        Object var14;
        String var15;
        Object var16;
        String var17;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (layer != 0) {
          return;
        }
        if (guard < -35) {
          var5 = parentX + this.x;
          var6 = parentY + this.y;
          SoftwareRasterizer.fillRectangle(var5, var6, this.width, this.height, 0);
          var7 = this.selectionIndex;
          if (-1 != this.hoveredIndex) {
            var7 = this.hoveredIndex;
          }
          if (this.options == null) {
            return;
          }
          for (var8 = 0; this.options.length > var8; var8++) {
            var16 = this.options[var8];
            var17 = var16.toString();
            if (var7 == var8) {
              SoftwareRasterizer.fillRectangleAlpha(2 + var5, var6 + 4, -4 + this.width, this.rowHeight, 2188450, 128);
            }
            var6 = var6 + this.rowHeight;
            this.font.drawText(var17, 2 + var5, var6, 10000536, -1);
          }
          return;
        }
        this.notifyAction(56, -9, false, ((int[]) (this.options[0]))[2]);
        var5Lifetime1 = parentX + this.x;
        var6Lifetime1 = parentY + this.y;
        SoftwareRasterizer.fillRectangle(var5Lifetime1, var6Lifetime1, this.width, this.height, 0);
        var7Lifetime1 = this.selectionIndex;
        if (-1 != this.hoveredIndex) {
          var7Lifetime1 = this.hoveredIndex;
        }
        if (this.options == null) {
          return;
        }
        for (var8Lifetime1 = 0; this.options.length > var8Lifetime1; var8Lifetime1++) {
          var14 = this.options[var8Lifetime1];
          var15 = var14.toString();
          if (var7Lifetime1 == var8Lifetime1) {
            SoftwareRasterizer.fillRectangleAlpha(2 + var5Lifetime1, var6Lifetime1 + 4, -4 + this.width, this.rowHeight, 2188450, 128);
          }
          var6Lifetime1 = var6Lifetime1 + this.rowHeight;
          this.font.drawText(var15, 2 + var5Lifetime1, var6Lifetime1, 10000536, -1);
        }
    }

    DropDownListWidget(DropDownWidget param0, LegacyBitmapFont param1, Object[] param2, int param3) {
        super(param0);
        try {
          this.dropDown = param0;
          this.font = param1;
          this.rowHeight = this.font.descent + this.font.ascent;
          this.setOptions(-22994, param3, param2);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        regularText = "regular";
    }
}
