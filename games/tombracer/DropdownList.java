/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownList extends WidgetContainer implements ButtonListener {
    ScrollContainer field_F;
    private FocusableWidget field_I;
    private boolean field_B;
    private FocusableWidget field_E;
    static bna field_D;
    boolean field_G;
    String field_w;
    static java.awt.Frame field_x;
    je field_z;
    private int field_C;
    private int field_A;
    BitmapFont field_H;
    static String field_y;

    private final void selectItemByPrefix(String param0, byte param1) {
        if (param1 != 106) {
          UiWidget var4 = (UiWidget) null;
          this.updatePointerState(36, -37, (UiWidget) null, 57);
        }
        if (this.field_z.field_I == null) {
          return;
        }
        int var3_int = this.findItemStartingWith((byte) 126, param0.toLowerCase());
        if (var3_int == -1) {
          return;
        }
        try {
          this.field_z.field_G = var3_int;
          this.scrollToSelection(101);
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rla.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param4 >= gca.field_d &&
          hc.field_h >= param4) {
          param1 = CharacterPreview.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, param1);
          param0 = CharacterPreview.clamp(DiskCacheWorker.field_c, param2 ^ 16224, pka.field_b, param0);
          BrazierComponent.a(param0, param3, param4, param1, false);
        }
        if (param2 != -2) {
          DropdownList.a(-75, 34, (byte) 59, 71, -47);
        }
    }

    DropdownList(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        this.field_H = KeySwitchComponent.field_J;
        this.field_w = "";
        try {
          this.field_z = new je(this, this.field_H, param0, param1);
          this.field_z.field_h = (WidgetListener) (this);
          this.field_G = false;
          this.field_A = param2;
          this.field_I = new FocusableWidget("", new fua(this), (WidgetListener) (this));
          this.field_E = new FocusableWidget();
          this.field_E.field_r = (WidgetPainter) ((Object) new ema());
          this.field_E.field_h = (WidgetListener) (this);
          this.addChild(this.field_I, -1);
          this.addChild(this.field_E, -1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void layoutList(int param0, int param1, int param2, boolean param3, int param4) {
        super.setBounds((byte) -31, param4, param0, param2, param1);
        this.field_I.setBounds((byte) -31, param4 - 20, this.field_C, 0, 0);
        if (param3) {
          this.closeList((byte) -97);
        }
        this.field_E.setBounds((byte) -31, 20, this.field_C, -20 + param4, 0);
        if (this.field_G) {
          this.field_F.setBounds((byte) -31, param4, -this.field_C + param0, 0, this.field_C);
        }
    }

    final boolean hasKeyboardFocus(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -34) {
          this.field_w = (String) null;
        }
        stackIn_7_0 = (this.field_B) || (super.hasKeyboardFocus((byte) -34));
        return stackIn_7_0;
    }

    private final void closeList(byte param0) {
        if (!this.isOpen((byte) -82)) {
          return;
        }
        this.layoutList(this.field_C, this.field_n, this.field_i, false, this.field_m);
        this.field_G = false;
        this.field_F.unlink(76);
        if (param0 < 82) {
          field_y = (String) null;
        }
    }

    final void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rla.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 70) {
            stackIn_4_0 = super.handlePointerPress(107, param1, param2, param3, param4, param5, param6);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("rla.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, FocusableWidget param2, int param3, byte param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!this.isOpen((byte) -73)) {
            this.openList(-21088);
          } else {
            this.closeList((byte) 119);
          }
          if (param4 < 44) {
            this.field_G = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("rla.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void scrollToSelection(int param0) {
        int var8 = 0;
        int var8Lifetime1;
        if (!this.isOpen((byte) 106) ||
          -1 == this.field_z.field_G ||
          this.field_z.field_I == null ||
          this.field_F.field_x == null) {
          return;
        }
        int var2 = this.field_F.field_A.field_p;
        int var3 = this.field_z.field_K;
        int var4 = this.field_z.field_p - var2;
        if (var4 <= 0) {
          return;
        }
        int var5 = var3 * this.field_z.field_G;
        int var6 = this.field_F.field_A.child.field_n + var5;
        if (param0 <= 35) {
          return;
        }
        int var7 = var2 >> 2;
        if (var7 > var6) {
          var8 = -(-var5 + var7 << 16) / var4;
          if (var8 < 0) {
            var8 = 0;
          }
          this.field_F.field_x.field_O = var8;
        }
        var7 = (3 * var2 >> 2) - var3;
        if (var7 < var6) {
          var8Lifetime1 = -(var7 - var5 << 16) / var4;
          if (var8Lifetime1 > 65536) {
            var8Lifetime1 = 65536;
          }
          this.field_F.field_x.field_O = var8Lifetime1;
        }
    }

    private final void openList(int param0) {
        int var2 = this.field_z.measureListHeight(23112);
        int var3 = var2;
        int var4 = 0;
        if (param0 != -21088) {
          this.field_C = -126;
        }
        if (var3 > this.field_A) {
          var4 = 1;
          var3 = this.field_A;
        }
        this.layoutList(this.field_C + var3, this.field_n, this.field_i, false, this.field_m);
        this.field_z.setBounds((byte) -31, this.field_m, var2, 0, 0);
        this.field_F = new ScrollContainer(0, 0, 0, 0, new pu(), this.field_z, (WidgetPainter) null);
        if (var4 != 0) {
          this.field_F.setVerticalScrollControl(1, ImageProducerRasterBuffer.createVerticalScrollControl(-5412), true);
        }
        this.field_F.setBounds((byte) -31, this.field_m, this.field_p - this.field_C, 0, this.field_C);
        this.field_G = true;
        this.addChild(this.field_F, -1);
        this.scrollToSelection(43);
    }

    final boolean isOpen(byte param0) {
        int var2 = 56 % ((param0 - 11) / 53);
        return this.field_G;
    }

    public static void releaseStatics(boolean param0) {
        field_x = null;
        field_D = null;
        if (!param0) {
          field_y = (String) null;
        }
        field_y = null;
    }

    final void notifySelectionChanged(int param0) {
        if (this.field_h instanceof eaa) {
          ((eaa) ((Object) this.field_h)).a(-3, this);
        }
        if (param0 != 99) {
          this.hasKeyboardFocus((byte) -17);
        }
    }

    final void setBounds(byte param0, int param1, int param2, int param3, int param4) {
        this.field_C = param2;
        if (param0 != -31) {
          return;
        }
        this.layoutList(param2, param4, param3, false, param1);
    }

    final int getSelectedIndex(byte param0) {
        if (param0 <= 9) {
          return -96;
        }
        return this.field_z.field_G;
    }

    final void clearKeyboardFocus(byte param0) {
        int var2 = 1 / ((-38 - param0) / 60);
        this.field_B = false;
        super.clearKeyboardFocus((byte) 41);
    }

    final String getHoverText(byte param0) {
        int var2 = 70 / ((-58 - param0) / 60);
        if (!this.field_f) {
          return null;
        }
        if (this.isOpen((byte) -46) &&
          this.field_F.field_f &&
          -1 != this.field_z.field_H) {
          return this.field_z.field_I[this.field_z.field_H].toString();
        }
        if (this.field_z.getSelectedItem(117) != null) {
          return this.field_z.getSelectedItem(121).toString();
        }
        return super.getHoverText((byte) 79);
    }

    final boolean requestKeyboardFocus(UiWidget param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.clearKeyboardFocus((byte) -120);
          if (param1) {
            this.field_w = (String) null;
          }
          this.field_B = true;
          this.field_w = "";
          if (this.field_h != null) {
            if (!(this.field_h instanceof vfa)) {
              return true;
            }
            ((vfa) (this.field_h)).a((UiWidget) (this), (byte) -75, this.field_B);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rla.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var6_intLifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.hasKeyboardFocus((byte) -34)) {
            return false;
          }
          if (!param3) {
            this.setBounds((byte) 94, -22, -43, -18, -59);
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_z.field_I) {
            var5_int = this.field_z.field_I.length;
            if (param2 != 99 &&
              param2 != 98) {
              if (105 != param2 &&
                param2 != 104) {
                if (param2 == 84) {
                  if (this.field_G) {
                    this.closeList((byte) 122);
                  } else {
                    this.openList(-21088);
                  }
                  return true;
                }
                if (param2 == 85) {
                  var6_int = this.field_w.length();
                  if (var6_int <= 0) {
                    return true;
                  }
                  this.field_w = this.field_w.substring(0, -1 + var6_int);
                  return true;
                }
                decompiledFrameRemainder0 = !(param0 < 32);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(param0 >= 128))) {
                  var6 = this.field_w + param0;
                  this.selectItemByPrefix(var6, (byte) 106);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.isOpen((byte) 88)) {
                  this.openList(-21088);
                }
                var6_intLifetime1 = this.field_F.field_A.field_p / this.field_z.field_K;
                if (105 == param2) {
                  this.field_z.field_G = this.field_z.field_G + var6_intLifetime1;
                } else {
                  this.field_z.field_G = this.field_z.field_G - var6_intLifetime1;
                }
                if (this.field_z.field_G < 0) {
                  this.field_z.field_G = 0;
                }
                if (this.field_z.field_G >= var5_int) {
                  this.field_z.field_G = var5_int - 1;
                }
                this.scrollToSelection(46);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.isOpen((byte) 101)) {
                this.openList(-21088);
              }
              if (param2 == 99) {
                this.field_z.field_G = this.field_z.field_G + 1;
              } else {
                this.field_z.field_G = this.field_z.field_G - 1;
              }
              if (0 > this.field_z.field_G) {
                this.field_z.field_G = 0;
              }
              if (this.field_z.field_G >= var5_int) {
                this.field_z.field_G = var5_int - 1;
              }
              this.scrollToSelection(84);
              return true;
            }
          }
          if (param2 != 80) {
            stackIn_61_0 = super.handleKeyInput(param0, param1, param2, true);
            return stackIn_61_0;
          }
          this.closeList((byte) 125);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("rla.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int findItemStartingWith(byte param0, String param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          param1 = param1.toLowerCase();
          if (param0 < 116) {
            var6 = (String) null;
            discarded$1 = this.findItemStartingWith((byte) 25, (String) null);
          }
          var3_int = 0;
          while (true) {
            if (var3_int >= this.field_z.field_I.length) {
              stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            var4 = this.field_z.field_I[var3_int].toString().toLowerCase();
            if (!var4.startsWith(param1)) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("rla.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_y = "Year";
    }
}
