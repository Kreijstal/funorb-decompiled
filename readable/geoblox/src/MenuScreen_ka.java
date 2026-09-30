/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuScreen_ka {
    static Sprite_dm[][][] field_m;
    int firstItemY_field_k;
    int itemCount_field_e;
    static float field_c;
    int itemSpacing_field_d;
    static d field_i;
    static int field_h;
    int selectedItemIndex_field_b;
    private int hitRightX_field_f;
    boolean pointerInteractionActive_field_g;
    boolean keyboardSelectionActive_field_l;
    static long field_a;
    private int hitLeftX_field_j;

    final static IndexedSprite_na[] a(String param0, String param1, boolean param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite_na[] stackIn_2_0 = null;
        IndexedSprite_na[] stackIn_4_0 = null;
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
          L0: {
            if (param2) {
              var4_int = param3.a((byte) 126, param0);
              var5 = param3.a(param1, -89, var4_int);
              stackIn_4_0 = sd.a(true, param3, var5, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (IndexedSprite_na[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ka.W(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void increaseMenuValue_a(byte param0, int itemIndex_param1);

    void handleMenuKey_a(int itemIndex_param0, int param1) {
        int var4;
        L0: {
          var4 = Geoblox.field_C;
          if (param1 < -26) {
            break L0;
          } else {
            this.hitLeftX_field_j = 8;
            break L0;
          }
        }
        L1: {
          if (-97 != (ki.field_d ^ -1)) {
            if (-98 == (ki.field_d ^ -1)) {
              this.increaseMenuValue_a((byte) 90, itemIndex_param0);
              break L1;
            } else {
              L2: {
                if (ki.field_d == 84) {
                  break L2;
                } else {
                  if ((ki.field_d ^ -1) != -84) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.activateMenuItem_b(itemIndex_param0, (byte) -2);
              break L1;
            }
          } else {
            this.decreaseMenuValue_a(itemIndex_param0, (byte) -7);
            break L1;
          }
        }
    }

    void handleMenuPointer_a(int itemIndex_param0, int pointerX_param1, boolean initialClick_param2, int rowOffsetY_param3, boolean heldRepeat_param4, int pointerButton_param5) {
        int var8 = Geoblox.field_C;
        if (!heldRepeat_param4) {
            if (1 != pointerButton_param5) {
                this.decreaseMenuValue_a(itemIndex_param0, (byte) -121);
            } else {
                this.activateMenuItem_b(itemIndex_param0, (byte) -2);
            }
            s.field_H = lj.field_a;
        } else {
            s.field_H = s.field_H - 1;
            if (s.field_H <= 0) {
                if (-2 == (pointerButton_param5 ^ -1)) {
                    this.activateMenuItem_b(itemIndex_param0, (byte) -2);
                } else {
                    this.decreaseMenuValue_a(itemIndex_param0, (byte) 6);
                }
                s.field_H = fj.field_o;
            }
        }
        if (initialClick_param2) {
            this.keyboardSelectionActive_field_l = false;
        }
    }

    abstract void renderMenuItem_a(boolean selected_param0, byte param1, int itemIndex_param2, int rowY_param3);

    public static void a(byte param0) {
        int var1 = -15 / ((param0 - 75) / 32);
        field_m = (Sprite_dm[][][]) null;
        field_i = null;
    }

    int hitTestMenuItem_a(int pointerX_param0, int pointerY_param1, byte param2) {
        int var4;
        L0: {
          if (this.hitLeftX_field_j > pointerX_param0) {
            break L0;
          } else {
            if (pointerX_param0 >= this.hitRightX_field_f) {
              break L0;
            } else {
              if (this.firstItemY_field_k > pointerY_param1) {
                break L0;
              } else {
                if (param2 >= 20) {
                  var4 = (pointerY_param1 + -this.firstItemY_field_k) / this.itemSpacing_field_d;
                  if (this.itemCount_field_e > var4) {
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
        }
        return -1;
    }

    abstract void activateMenuItem_b(int itemIndex_param0, byte param1);

    final void updatePointer_a(boolean param0) {
        int hitItemIndex_var2;
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
            hitItemIndex_var2 = this.hitTestMenuItem_a(mc.field_a, he.field_d, (byte) 28);
            this.selectedItemIndex_field_b = hitItemIndex_var2;
            if (hitItemIndex_var2 != -1) {
              L1: {
                this.pointerInteractionActive_field_g = true;
                stackIn_16_0 = this;

                stackIn_16_1 = hitItemIndex_var2;

                stackIn_16_2 = mc.field_a;

                if (param0) {
                  stackIn_17_0 = this;
                  stackIn_17_1 = stackIn_16_1;
                  stackIn_17_2 = stackIn_16_2;
                  stackIn_17_3 = 0;
                  break L1;
                } else {
                  stackIn_17_0 = this;
                  stackIn_17_1 = stackIn_16_1;
                  stackIn_17_2 = stackIn_16_2;
                  stackIn_17_3 = 1;
                  break L1;
                }
              }
              this.handleMenuPointer_a(stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0, -(hitItemIndex_var2 * this.itemSpacing_field_d) + -this.firstItemY_field_k + he.field_d, false, bi.field_g);
              break L0;
            } else {
              this.pointerInteractionActive_field_g = false;
              break L0;
            }
          } else {
            L2: {
              if (gf.field_a == 0) {
                break L2;
              } else {
                if (!this.pointerInteractionActive_field_g) {
                  break L2;
                } else {
                  hitItemIndex_var2 = this.selectedItemIndex_field_b;
                  if (hitItemIndex_var2 != -1) {
                    this.handleMenuPointer_a(hitItemIndex_var2, qa.field_a, false, -(this.itemSpacing_field_d * hitItemIndex_var2) + (ue.field_e - this.firstItemY_field_k), true, gf.field_a);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
            this.pointerInteractionActive_field_g = false;
            if (!wb.field_a) {
              break L0;
            } else {
              hitItemIndex_var2 = this.hitTestMenuItem_a(qa.field_a, ue.field_e, (byte) 126);
              if (hitItemIndex_var2 != -1) {
                this.selectedItemIndex_field_b = hitItemIndex_var2;
                this.keyboardSelectionActive_field_l = false;
                break L0;
              } else {
                if (this.keyboardSelectionActive_field_l) {
                  break L0;
                } else {
                  this.selectedItemIndex_field_b = hitItemIndex_var2;
                  this.keyboardSelectionActive_field_l = false;
                  break L0;
                }
              }
            }
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            this.hitLeftX_field_j = 56;
            break L3;
          }
        }
    }

    MenuScreen_ka(int param0, int param1, int param2, int param3, int param4) {
        this.keyboardSelectionActive_field_l = true;
        this.selectedItemIndex_field_b = 0;
        this.hitLeftX_field_j = param1;
        this.itemSpacing_field_d = param4;
        this.hitRightX_field_f = param2;
        this.itemCount_field_e = param0;
        this.firstItemY_field_k = param3;
    }

    abstract void decreaseMenuValue_a(int itemIndex_param0, byte param1);

    void renderScreen_a(int param0) {
        int var4 = Geoblox.field_C;
        int itemIndex_var2 = 0;
        if (param0 != -28750) {
            this.updatePointer_a(false);
        }
        int rowY_var3 = this.firstItemY_field_k;
        while (itemIndex_var2 < this.itemCount_field_e) {
            this.renderMenuItem_a(this.selectedItemIndex_field_b == itemIndex_var2 ? true : false, (byte) -112, itemIndex_var2, rowY_var3);
            rowY_var3 = rowY_var3 + this.itemSpacing_field_d;
            itemIndex_var2++;
        }
    }

    static {
        field_m = new Sprite_dm[7][7][4];
        field_h = 0;
        field_a = 0L;
    }
}
