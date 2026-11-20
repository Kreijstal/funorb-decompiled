/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComboBoxList extends UiFocusProxy {
    int hoveredIndex;
    static Widget field_M;
    private UiComboBox comboBox;
    static String field_G;
    int selectedIndex;
    static int[] daysInMonth;
    static long field_C;
    Object[] items;
    static String field_K;
    int rowHeight;
    private BitmapFont font;

    public static void clearSharedReferences(int param0) {
        daysInMonth = null;
        field_M = null;
        field_G = null;
        int var1 = -23 % ((-30 - param0) / 60);
        field_K = null;
    }

    final boolean containsPoint(int param0, int param1, int param2, int param3, byte param4) {
        this.hoveredIndex = -1;
        if (!this.comboBox.dropdownOpen) {
          return false;
        }
        if (!this.comboBox.dropdownPane.viewport.hovered) {
          return false;
        }
        if (this.items == null) {
          return super.containsPoint(param0, param1, param2, param3, (byte) 22);
        }
        param0 = param0 - (this.y + param3);
        param2 = param2 - (param1 + this.x);
        if (param2 >= 0 &&
          0 <= param0 &&
          param2 <= this.width &&
          this.height >= param0) {
          if (param4 != 22) {
            ((byte[]) (((Object[]) (this.items[16]))[0]))[25] = (byte) 98;
          }
          this.hoveredIndex = param0 / this.rowHeight;
          if (this.items.length > this.hoveredIndex) {
            return true;
          }
          this.hoveredIndex = -1;
          return true;
        }
        return false;
    }

    final void fireAction(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        super.fireAction(param0, param1, param2, param3);
        param3 = param3 - this.y;
        param1 = param1 - this.x;
        if (null != this.items) {
          var5 = param3 / this.rowHeight;
          if (var5 >= 0 &&
            this.items.length > var5) {
            this.selectedIndex = var5;
            this.comboBox.notifySelectionChanged(21694);
          }
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = VoidHunters.field_G;
        if (param1 != 0) {
          return;
        }
        int var5 = this.x + param0;
        int var6 = this.y + param3;
        SoftwareRasterizer2D.fillRectangle(var5, var6, this.width, this.height, 0);
        if (param2 <= 47) {
          return;
        }
        int var7 = this.selectedIndex;
        if (-1 != this.hoveredIndex) {
          var7 = this.hoveredIndex;
        }
        if (this.items != null) {
          for (var8 = 0; var8 < this.items.length; var8++) {
            var9 = this.items[var8];
            var10 = var9.toString();
            if (var8 == var7) {
              SoftwareRasterizer2D.fillRectangleAlpha(2 + var5, var6 + 4, this.width - 4, this.rowHeight, 2188450, 128);
            }
            var6 = var6 + this.rowHeight;
            this.font.draw(var10, 2 + var5, var6, 10000536, -1);
          }
        }
    }

    final static int pollAccountUi(boolean param0, int param1, int param2, boolean param3) {
        if (param0) {
          UiComboBoxList.clearSharedReferences(-64);
        }
        return ColorRowCache.pollAccountUi(1);
    }

    final int getPreferredListHeight(int param0) {
        if (param0 != 4) {
          this.font = (BitmapFont) (((Object[]) (this.items[1]))[15]);
        }
        return null != this.items ? this.rowHeight * (1 + this.items.length * 2) >> 1 : 200;
    }

    UiComboBoxList(UiComboBox param0, BitmapFont param1, Object[] param2, int param3) {
        super(param0);
        try {
          this.font = param1;
          this.comboBox = param0;
          this.rowHeight = this.font.maxDescent + this.font.maxAscent;
          this.setItems(param3, 28, param2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "tia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final Object getSelectedItem(byte param0) {
        Object stackIn_7_0 = null;
        if (param0 != 96) {
          this.drawLayer(-103, 101, 5, -59);
        }
        if (null != this.items &&
          -1 != this.selectedIndex) {
          stackIn_7_0 = this.items[this.selectedIndex];
        } else {
          stackIn_7_0 = null;
        }
        return stackIn_7_0;
    }

    private final void setItems(int param0, int param1, Object[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.items = param2;
          this.selectedIndex = param0;
          this.hoveredIndex = -1;
          if (param1 != 28) {
            return;
          }
          if (param2 != null) {
            if (this.selectedIndex >= -1 &&
              this.selectedIndex < this.items.length) {
              return;
            }
            throw new IllegalStateException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tia.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_G = "To <%0>: ";
        field_K = "OK";
    }
}
