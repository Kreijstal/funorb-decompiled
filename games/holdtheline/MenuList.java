/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuList {
    static GzipDecompressor field_n;
    int itemCount;
    boolean mouseHeld;
    int top;
    boolean keyboardSelection;
    int selectedItem;
    static UiTheme field_b;
    static String field_i;
    int right;
    static int field_h;
    int left;
    private int rowHeight;
    static int[] field_l;
    static IntrusiveDeque field_e;

    abstract void decreaseItemValue(int param0, int param1);

    int hitTestItem(boolean param0, int param1, int param2) {
        if (this.left > param2) {
          return -1;
        }
        if (this.right <= param2) {
          return -1;
        }
        if (this.top > param1) {
          return -1;
        }
        if (param0) {
          return 66;
        }
        int var4 = (param1 - this.top) / this.rowHeight;
        if (var4 >= this.itemCount) {
          return -1;
        }
        return var4;
    }

    final void handleMouse(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = HoldTheLine.field_D;
        if (param0 != 12515) {
          this.hitTestItem(true, 122, -88);
        }
        if (ValidationIndicator.field_J != 0) {
          var2 = this.hitTestItem(false, ValidatedTextField.field_U, TrackBoundary.field_x);
          this.selectedItem = var2;
          if (var2 == -1) {
            this.mouseHeld = false;
          } else {
            this.mouseHeld = true;
            this.handleItemPress(-(this.rowHeight * var2) + (ValidatedTextField.field_U - this.top), var2, ValidationIndicator.field_J, param0 ^ -12428, TrackBoundary.field_x, false);
          }
          return;
        }
        if (RoadStripRenderer.field_f != 0 &&
          this.mouseHeld) {
          var2Lifetime1 = this.selectedItem;
          if (var2Lifetime1 == -1) {
            return;
          }
          this.handleItemPress(-(this.rowHeight * var2Lifetime1) + FullscreenErrorDialog.field_X - this.top, var2Lifetime1, RoadStripRenderer.field_f, param0 - 12639, NodeHashTableIterator.field_g, true);
          return;
        }
        this.mouseHeld = false;
        if (!PointLight.field_k) {
          return;
        }
        var2Lifetime2 = this.hitTestItem(false, FullscreenErrorDialog.field_X, NodeHashTableIterator.field_g);
        if (var2Lifetime2 == -1 &&
          this.keyboardSelection) {
          return;
        }
        this.keyboardSelection = false;
        this.selectedItem = var2Lifetime2;
    }

    abstract void increaseItemValue(int param0, int param1);

    public static void clearSharedReferences(int param0) {
        if (param0 == -1) {
          field_l = null;
          field_n = null;
          field_e = null;
          field_b = null;
          field_i = null;
          return;
        }
        MenuList.clearSharedReferences(-52);
        field_l = null;
        field_n = null;
        field_e = null;
        field_b = null;
        field_i = null;
    }

    void handleItemKey(int param0, int param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 != -24489) {
          this.left = -80;
          if (DelayedServerPacket.field_n == 96) {
            this.decreaseItemValue(1, param0);
            return;
          }
          if (DelayedServerPacket.field_n == 97) {
            this.increaseItemValue(108, param0);
            return;
          }
          if (DelayedServerPacket.field_n == 84) {
            this.activateItem(param0, -3565);
            return;
          }
          if (DelayedServerPacket.field_n != 83) {
            return;
          }
          this.activateItem(param0, -3565);
          return;
        }
        if (DelayedServerPacket.field_n == 96) {
          this.decreaseItemValue(1, param0);
          return;
        }
        if (DelayedServerPacket.field_n == 97) {
          this.increaseItemValue(108, param0);
          return;
        }
        if (DelayedServerPacket.field_n == 84) {
          this.activateItem(param0, -3565);
          return;
        }
        if (DelayedServerPacket.field_n != 83) {
          return;
        }
        this.activateItem(param0, -3565);
    }

    void handleItemPress(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var8;
        int var7;
        int var7Lifetime1;
        var8 = HoldTheLine.field_D;
        if (!param5) {
          if (1 == param2) {
            this.activateItem(param1, -3565);
          } else {
            this.decreaseItemValue(1, param1);
          }
          ServerConnectionState.field_b = TutorialAction.field_i;
        } else {
          ServerConnectionState.field_b = ServerConnectionState.field_b - 1;
          if (0 >= ServerConnectionState.field_b) {
            if (1 != param2) {
              this.decreaseItemValue(1, param1);
              ServerConnectionState.field_b = ReflectionCheck.field_o;
              var7 = 14 % ((param3 + 51) / 46);
              return;
            }
            this.activateItem(param1, -3565);
            ServerConnectionState.field_b = ReflectionCheck.field_o;
          }
        }
        var7Lifetime1 = 14 % ((param3 + 51) / 46);
    }

    void handleKey(boolean param0) {
        int var3 = HoldTheLine.field_D;
        if (!param0) {
          return;
        }
        if (this.mouseHeld) {
          return;
        }
        if (DelayedServerPacket.field_n == 98) {
          if (this.selectedItem <= 0) {
            this.selectedItem = this.itemCount;
          }
          this.selectedItem = this.selectedItem - 1;
          this.keyboardSelection = true;
          return;
        }
        if (99 != DelayedServerPacket.field_n) {
          if (this.selectedItem < 0) {
            return;
          }
          this.handleItemKey(this.selectedItem, -24489);
          return;
        }
        this.selectedItem = this.selectedItem + 1;
        if (this.selectedItem >= this.itemCount) {
          this.selectedItem = 0;
        } else {
          this.keyboardSelection = true;
          return;
        }
        this.keyboardSelection = true;
    }

    abstract void activateItem(int param0, int param1);

    final void clearPointerState(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.keyboardSelection) {
          var2 = -85 / ((param0 - 13) / 45);
          this.mouseHeld = false;
          return;
        }
        this.selectedItem = -1;
        var2Lifetime1 = -85 / ((param0 - 13) / 45);
        this.mouseHeld = false;
    }

    void draw(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0;
        boolean stackIn_6_3;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0;
        boolean stackIn_15_3;
        var4 = HoldTheLine.field_D;
        if (param0 == -55) {
          var2 = 0;
          var3 = this.top;
          while (var2 < this.itemCount) {
            stackIn_5_1 = var3;
            stackIn_5_2 = var2;
            if (var2 != this.selectedItem) {
              stackIn_6_0 = this;
              stackIn_6_3 = false;
            } else {
              stackIn_6_0 = this;
              stackIn_6_3 = true;
            }
            this.drawItem(stackIn_5_1, stackIn_5_2, stackIn_6_3, (byte) -124);
            var2++;
            var3 = var3 + this.rowHeight;
          }
        } else {
          this.itemCount = 124;
          var2 = 0;
          var3 = this.top;
          while (var2 < this.itemCount) {
            stackIn_14_1 = var3;
            stackIn_14_2 = var2;
            if (var2 != this.selectedItem) {
              stackIn_15_0 = this;
              stackIn_15_3 = false;
            } else {
              stackIn_15_0 = this;
              stackIn_15_3 = true;
            }
            this.drawItem(stackIn_14_1, stackIn_14_2, stackIn_15_3, (byte) -124);
            var2++;
            var3 = var3 + this.rowHeight;
          }
        }
    }

    abstract void drawItem(int param0, int param1, boolean param2, byte param3);

    protected MenuList() {
        this.keyboardSelection = true;
        this.selectedItem = 0;
    }

    MenuList(int param0, int param1, int param2, int param3, int param4) {
        this.keyboardSelection = true;
        this.selectedItem = 0;
        this.top = param3;
        this.rowHeight = param4;
        this.itemCount = param0;
        this.left = param1;
        this.right = param2;
    }

    static {
        field_i = "This password contains your email address, and would be easy to guess";
        field_n = new GzipDecompressor();
        field_e = new IntrusiveDeque();
    }
}
