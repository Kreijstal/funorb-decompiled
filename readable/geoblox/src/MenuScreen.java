/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuScreen {
    static Sprite[][][] amorphousFramesByThemeAndVariant;
    int firstItemY;
    int itemCount;
    static float field_c;
    int itemSpacing;
    static PlatformTaskDispatcher field_i;
    static int avatarFeedbackFrameBase;
    int selectedItemIndex;
    private int hitRightX;
    boolean pointerInteractionActive;
    boolean keyboardSelectionActive;
    static long field_a;
    private int hitLeftX;

    final static IndexedSprite[] a(String param0, String param1, boolean param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite[] stackIn_2_0 = null;
        IndexedSprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_2_0 = (IndexedSprite[]) null;
            return stackIn_2_0;
          }
          var4_int = param3.findGroupId((byte) 126, param0);
          var5 = param3.findFileId(param1, -89, var4_int);
          stackIn_4_0 = NetworkArchiveRequest.a(true, param3, var5, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var4);
          stackIn_7_1 = new StringBuilder().append("ka.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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
          if (ki.currentKeyboardEventCode != 96) {
            if (ki.currentKeyboardEventCode == 97) {
              this.increaseMenuValue((byte) 90, itemIndex);
            } else {
              if (ki.currentKeyboardEventCode != 84) {
                if (ki.currentKeyboardEventCode != 83) {
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
                if (pointerButton == 1) {
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
        amorphousFramesByThemeAndVariant = (Sprite[][][]) null;
        field_i = null;
    }

    int hitTestMenuItem(int pointerX, int pointerY, byte param2) {
        int var4;
        if (this.hitLeftX <= pointerX) {
          if (pointerX < this.hitRightX) {
            if (this.firstItemY <= pointerY) {
              if (param2 < 20) {
                return 81;
              }
              var4 = (pointerY - this.firstItemY) / this.itemSpacing;
              if (this.itemCount > var4) {
                return var4;
              }
              return -1;
            }
          }
        }
        return -1;
    }

    abstract void activateMenuItem(int itemIndex, byte param1);

    final void updatePointer(boolean param0) {
        int hitItemIndex;
        int var3;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0;
        boolean stackIn_17_3;
        L0: {
          var3 = Geoblox.field_C;
          if (bi.pointerPressButtonSnapshot != 0) {
            hitItemIndex = this.hitTestMenuItem(mc.pointerPressXSnapshot, he.pointerPressYSnapshot, (byte) 28);
            this.selectedItemIndex = hitItemIndex;
            if (hitItemIndex != -1) {
              this.pointerInteractionActive = true;
              stackIn_16_1 = hitItemIndex;
              stackIn_16_2 = mc.pointerPressXSnapshot;
              if (param0) {
                stackIn_17_0 = this;
                stackIn_17_3 = false;
              } else {
                stackIn_17_0 = this;
                stackIn_17_3 = true;
              }
              this.handleMenuPointer(stackIn_16_1, stackIn_16_2, stackIn_17_3, -(hitItemIndex * this.itemSpacing) - this.firstItemY + he.pointerPressYSnapshot, false, bi.pointerPressButtonSnapshot);
            } else {
              this.pointerInteractionActive = false;
            }
          } else {
            if (gf.heldPointerButtonSnapshot != 0) {
              if (this.pointerInteractionActive) {
                hitItemIndex = this.selectedItemIndex;
                if (hitItemIndex == -1) {
                  break L0;
                }
                this.handleMenuPointer(hitItemIndex, PrefixCodeDecoder.pointerXSnapshot, false, -(this.itemSpacing * hitItemIndex) + (ue.pointerYSnapshot - this.firstItemY), true, gf.heldPointerButtonSnapshot);
                break L0;
              }
            }
            this.pointerInteractionActive = false;
            if (wb.pointerActivitySnapshot) {
              hitItemIndex = this.hitTestMenuItem(PrefixCodeDecoder.pointerXSnapshot, ue.pointerYSnapshot, (byte) 126);
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
        amorphousFramesByThemeAndVariant = new Sprite[7][7][4];
        avatarFeedbackFrameBase = 0;
        field_a = 0L;
    }
}
