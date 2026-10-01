/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuScreen {
    static Sprite[][][] field_m;
    int firstItemY;
    int itemCount;
    static float field_c;
    int itemSpacing;
    static d field_i;
    static int field_h;
    int selectedItemIndex;
    private int hitRightX;
    boolean pointerInteractionActive;
    boolean keyboardSelectionActive;
    static long field_a;
    private int hitLeftX;

    final static IndexedSprite[] a(String param0, String param1, boolean param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite[] stackIn_2_0 = null;
        IndexedSprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var4_int = param3.a((byte) 126, param0);
            var5 = param3.a(param1, -89, var4_int);
            stackIn_4_0 = sd.a(true, param3, var5, var4_int);
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = (IndexedSprite[]) null;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var4);

          stackIn_7_1 = new StringBuilder().append("ka.W(");

          if (param0 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }


          stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void increaseMenuValue(byte param0, int itemIndex);

    void handleMenuKey(int itemIndex, int param1) {
        int var4;
        var4 = Geoblox.field_C;
        if (param1 >= -26) {
          this.hitLeftX = 8;
        }
        L1: {
          if (-97 != (ki.field_d ^ -1)) {
            if (-98 == (ki.field_d ^ -1)) {
              this.increaseMenuValue((byte) 90, itemIndex);
            } else {
              if (ki.field_d != 84) {
                if ((ki.field_d ^ -1) != -84) {
                  break L1;
                }
              }
              this.activateMenuItem(itemIndex, (byte) -2);
            }
          } else {
            this.decreaseMenuValue(itemIndex, (byte) -7);
          }
        }
    }

    void handleMenuPointer(int itemIndex, int pointerX, boolean initialClick, int rowOffsetY, boolean heldRepeat, int pointerButton) {
        int var8 = Geoblox.field_C;
        if (!heldRepeat) {
            if (1 != pointerButton) {
                this.decreaseMenuValue(itemIndex, (byte) -121);
            } else {
                this.activateMenuItem(itemIndex, (byte) -2);
            }
            s.field_H = lj.field_a;
        } else {
            s.field_H = s.field_H - 1;
            if (s.field_H <= 0) {
                if (-2 == (pointerButton ^ -1)) {
                    this.activateMenuItem(itemIndex, (byte) -2);
                } else {
                    this.decreaseMenuValue(itemIndex, (byte) 6);
                }
                s.field_H = fj.field_o;
            }
        }
        if (initialClick) {
            this.keyboardSelectionActive = false;
        }
    }

    abstract void renderMenuItem(boolean selected, byte param1, int itemIndex, int rowY);

    public static void a(byte param0) {
        int var1 = -15 / ((param0 - 75) / 32);
        field_m = (Sprite[][][]) null;
        field_i = null;
    }

    int hitTestMenuItem(int pointerX, int pointerY, byte param2) {
        int var4;
        if (this.hitLeftX <= pointerX) {
          if (pointerX < this.hitRightX) {
            if (this.firstItemY <= pointerY) {
              if (param2 >= 20) {
                var4 = (pointerY + -this.firstItemY) / this.itemSpacing;
                if (this.itemCount > var4) {
                  return var4;
                } else {
                  return -1;
                }
              } else {
                return 81;
              }
            }
          }
        }
        return -1;
    }

    abstract void activateMenuItem(int itemIndex, byte param1);

    final void updatePointer(boolean param0) {
        int hitItemIndex;
        int var3;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        L0: {
          var3 = Geoblox.field_C;
          if (bi.field_g != 0) {
            hitItemIndex = this.hitTestMenuItem(mc.field_a, he.field_d, (byte) 28);
            this.selectedItemIndex = hitItemIndex;
            if (hitItemIndex != -1) {
              this.pointerInteractionActive = true;
              stackIn_16_0 = this;

              stackIn_16_1 = hitItemIndex;

              stackIn_16_2 = mc.field_a;

              if (param0) {
                stackIn_17_0 = this;
                stackIn_17_1 = stackIn_16_1;
                stackIn_17_2 = stackIn_16_2;
                stackIn_17_3 = 0;
              } else {
                stackIn_17_0 = this;
                stackIn_17_1 = stackIn_16_1;
                stackIn_17_2 = stackIn_16_2;
                stackIn_17_3 = 1;
              }
              this.handleMenuPointer(stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0, -(hitItemIndex * this.itemSpacing) + -this.firstItemY + he.field_d, false, bi.field_g);
            } else {
              this.pointerInteractionActive = false;
            }
          } else {
            if (gf.field_a != 0) {
              if (this.pointerInteractionActive) {
                hitItemIndex = this.selectedItemIndex;
                if (hitItemIndex != -1) {
                  this.handleMenuPointer(hitItemIndex, qa.field_a, false, -(this.itemSpacing * hitItemIndex) + (ue.field_e - this.firstItemY), true, gf.field_a);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            this.pointerInteractionActive = false;
            if (wb.field_a) {
              hitItemIndex = this.hitTestMenuItem(qa.field_a, ue.field_e, (byte) 126);
              if (hitItemIndex != -1) {
                this.selectedItemIndex = hitItemIndex;
                this.keyboardSelectionActive = false;
              } else {
                if (!this.keyboardSelectionActive) {
                  this.selectedItemIndex = hitItemIndex;
                  this.keyboardSelectionActive = false;
                }
              }
            }
          }
        }
        if (!param0) {
          this.hitLeftX = 56;
        }
    }

    MenuScreen(int param0, int param1, int param2, int param3, int param4) {
        this.keyboardSelectionActive = true;
        this.selectedItemIndex = 0;
        this.hitLeftX = param1;
        this.itemSpacing = param4;
        this.hitRightX = param2;
        this.itemCount = param0;
        this.firstItemY = param3;
    }

    abstract void decreaseMenuValue(int itemIndex, byte param1);

    void renderScreen(int param0) {
        int var4 = Geoblox.field_C;
        int itemIndex = 0;
        if (param0 != -28750) {
            this.updatePointer(false);
        }
        int rowY = this.firstItemY;
        while (itemIndex < this.itemCount) {
            this.renderMenuItem(this.selectedItemIndex == itemIndex ? true : false, (byte) -112, itemIndex, rowY);
            rowY = rowY + this.itemSpacing;
            itemIndex++;
        }
    }

    static {
        field_m = new Sprite[7][7][4];
        field_h = 0;
        field_a = 0L;
    }
}
