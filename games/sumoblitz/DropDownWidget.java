/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropDownWidget extends WidgetContainer implements WidgetActionListener {
    private InteractiveWidget toggleButton;
    boolean listOpen;
    private int buttonHeight;
    private int maxListHeight;
    ScrollPane listScrollPane;
    private boolean focused;
    DropDownListWidget optionList;
    private InteractiveWidget labelButton;
    static SpriteData[] field_F;
    static int field_D;
    String searchPrefix;
    LegacyBitmapFont font;
    static int field_C;
    static bw field_N;

    private final void openList(int guard) {
        int var2 = this.optionList.preferredHeight((byte) -128);
        int var3 = var2;
        int var4 = 0;
        if (var3 > this.maxListHeight) {
          var3 = this.maxListHeight;
          var4 = 1;
        }
        this.layoutDropDown(this.x, this.width, 8725, this.y, var3 + this.buttonHeight);
        this.optionList.setBounds(114, 0, 0, var2, this.width);
        this.listScrollPane = new ScrollPane(0, 0, 0, 0, new tm(), this.optionList, (WidgetRenderer) null);
        if (var4 != 0) {
          this.listScrollPane.setVerticalScrollControl(1332, true, GameKeyHandler.a((byte) 35));
        }
        this.listScrollPane.setBounds(-126, 0, this.buttonHeight, this.height - this.buttonHeight, this.width);
        this.listOpen = true;
        int var5 = 32 % ((guard + 71) / 49);
        this.addChild(this.listScrollPane, 72);
        this.ensureSelectionVisible(-1);
    }

    final String hoveredTooltip(int guard) {
        if (!this.hovered) {
          return null;
        }
        if (guard != -6696) {
          this.searchPrefix = (String) null;
        }
        if (this.isListOpen(guard ^ -6708) &&
          this.listScrollPane.hovered &&
          this.optionList.hoveredIndex != -1) {
          return this.optionList.options[this.optionList.hoveredIndex].toString();
        }
        if (this.optionList.selectedOption(-47) != null) {
          return this.optionList.selectedOption(guard ^ 6783).toString();
        }
        return super.hoveredTooltip(-6696);
    }

    final void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        this.buttonHeight = newHeight;
        this.layoutDropDown(newX, newWidth, 8725, newY, newHeight);
        int var6 = 101 % ((28 - guard) / 63);
    }

    final boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 61) {
            return true;
          }
          root.clearFocus((byte) 115);
          this.focused = true;
          this.searchPrefix = "";
          if (null != this.listener) {
            if (!(this.listener instanceof WidgetFocusListener)) {
              return true;
            }
            ((WidgetFocusListener) (this.listener)).onFocusChanged(this.focused, (UiWidget) (this), -90);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ld.Q(");
          if (root == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -42) {
            this.listScrollPane = (ScrollPane) null;
          }
          stackIn_3_0 = super.onPointerPressed(root, -54, pointerY, button, parentX, pointerX, parentY);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ld.R(");
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final void clearFocus(byte guard) {
        int var2 = 4 / ((guard - 64) / 51);
        this.focused = false;
        super.clearFocus((byte) 116);
    }

    final boolean hasFocus(int guard) {
        boolean stackIn_7_0 = false;
        if (guard != -1) {
          this.notifySelectionChanged(24);
        }
        stackIn_7_0 = (this.focused) || (super.hasFocus(-1));
        return stackIn_7_0;
    }

    public static void releaseStatics(byte param0) {
        field_F = null;
        int var1 = -53 / ((-1 - param0) / 59);
        field_N = null;
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          int var5_int = -76 % ((-25 - guard) / 45);
          super.update(parentX, 85, root, parentY);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ld.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    private final void closeList(byte guard) {
        if (!this.isListOpen(20)) {
          return;
        }
        this.layoutDropDown(this.x, this.width, 8725, this.y, this.buttonHeight);
        this.listOpen = false;
        if (guard != 65) {
          return;
        }
        this.listScrollPane.unlink(false);
    }

    private final void layoutDropDown(int newX, int newWidth, int guard, int newY, int newHeight) {
        if (guard != 8725) {
          this.setBounds(-95, -108, -69, 98, 124);
        }
        super.setBounds(-108, newX, newY, newHeight, newWidth);
        this.labelButton.setBounds(98, 0, 0, this.buttonHeight, newWidth - 20);
        this.toggleButton.setBounds(99, newWidth - 20, 0, this.buttonHeight, 20);
        if (this.listOpen) {
          this.listScrollPane.setBounds(-91, 0, this.buttonHeight, -this.buttonHeight + newHeight, newWidth);
        }
    }

    final void notifySelectionChanged(int guard) {
        if (guard != 0) {
          this.closeList((byte) 67);
        }
        if (this.listener instanceof DropDownSelectionListener) {
          ((DropDownSelectionListener) ((Object) this.listener)).onSelectionChanged((byte) -13, this);
        }
    }

    private final void ensureSelectionVisible(int guard) {
        int var8 = 0;
        int var8Lifetime1;
        if (!this.isListOpen(guard + 21) ||
          this.optionList.selectionIndex == -1 ||
          this.optionList.options == null ||
          null == this.listScrollPane.verticalScrollControl) {
          return;
        }
        int var2 = this.listScrollPane.viewport.height;
        int var3 = this.optionList.rowHeight;
        int var4 = -var2 + this.optionList.height;
        if (guard != -1) {
          return;
        }
        if (var4 <= 0) {
          return;
        }
        int var5 = this.optionList.selectionIndex * var3;
        int var6 = this.listScrollPane.viewport.child.y + var5;
        int var7 = var2 >> 2;
        if (var7 > var6) {
          var8 = -(-var5 + var7 << 16) / var4;
          if (0 > var8) {
            var8 = 0;
          }
          this.listScrollPane.verticalScrollControl.verticalPositionQ16 = var8;
        }
        var7 = (var2 * 3 >> 2) - var3;
        if (var6 > var7) {
          var8Lifetime1 = -(var7 - var5 << 16) / var4;
          if (var8Lifetime1 > 65536) {
            var8Lifetime1 = 65536;
          }
          this.listScrollPane.verticalScrollControl.verticalPositionQ16 = var8Lifetime1;
        }
    }

    final static void a(String param0, byte param1) {
        try {
          ArchiveCatalog.a((byte) -94, param0);
          if (param1 != -47) {
            field_C = 74;
          }
          HardwareUnlitEffect.a(LegacyOpenGlTexture2D.loggingInText, false, (byte) -89);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ld.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isListOpen(int guard) {
        if (guard != 20) {
          field_C = -95;
        }
        return this.listOpen;
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!this.hasFocus(-1)) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.optionList.options) {
            var5_int = this.optionList.options.length;
            if (keyCode != 99 &&
              keyCode != 98) {
              if (105 != keyCode &&
                keyCode != 104) {
                if (84 == keyCode) {
                  if (this.listOpen) {
                    this.closeList((byte) 65);
                  } else {
                    this.openList(-120);
                  }
                  return true;
                }
                if (keyCode == 85) {
                  var6_int = this.searchPrefix.length();
                  if (0 >= var6_int) {
                    return true;
                  }
                  this.searchPrefix = this.searchPrefix.substring(0, var6_int - 1);
                  return true;
                }
                decompiledFrameRemainder0 = !(32 > character);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(character >= 128))) {
                  var6 = this.searchPrefix + character;
                  this.selectOptionPrefix(false, var6);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.isListOpen(20)) {
                  this.openList(-126);
                }
                var6_intLifetime1 = this.listScrollPane.viewport.height / this.optionList.rowHeight;
                if (keyCode == 105) {
                  this.optionList.selectionIndex = this.optionList.selectionIndex + var6_intLifetime1;
                } else {
                  this.optionList.selectionIndex = this.optionList.selectionIndex - var6_intLifetime1;
                }
                if (this.optionList.selectionIndex < 0) {
                  this.optionList.selectionIndex = 0;
                }
                if (var5_int <= this.optionList.selectionIndex) {
                  this.optionList.selectionIndex = var5_int - 1;
                }
                this.ensureSelectionVisible(-1);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.isListOpen(20)) {
                this.openList(-122);
              }
              if (keyCode != 99) {
                this.optionList.selectionIndex = this.optionList.selectionIndex - 1;
              } else {
                this.optionList.selectionIndex = this.optionList.selectionIndex + 1;
              }
              if (0 > this.optionList.selectionIndex) {
                this.optionList.selectionIndex = 0;
              }
              if (var5_int <= this.optionList.selectionIndex) {
                this.optionList.selectionIndex = var5_int - 1;
              }
              this.ensureSelectionVisible(-1);
              return true;
            }
          }
          if (guard < 9) {
            return false;
          }
          if (keyCode != 80) {
            stackIn_61_0 = super.onKey(root, character, (byte) 102, keyCode);
            return stackIn_61_0;
          }
          this.closeList((byte) 65);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("ld.KA(");
          if (root == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (guard != 710) {
            field_C = -21;
          }
          if (!this.isListOpen(20)) {
            this.openList(119);
          } else {
            this.closeList((byte) 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ld.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    DropDownWidget(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (WidgetRenderer) null);
        this.font = kw.field_b;
        this.searchPrefix = "";
        try {
          this.optionList = new DropDownListWidget(this, this.font, param0, param1);
          this.maxListHeight = param2;
          this.listOpen = false;
          this.optionList.listener = (WidgetListener) (this);
          this.labelButton = new InteractiveWidget("", new dv(this), (WidgetListener) (this));
          this.toggleButton = new InteractiveWidget();
          this.toggleButton.renderer = (WidgetRenderer) ((Object) new fm());
          this.toggleButton.listener = (WidgetListener) (this);
          this.addChild(this.labelButton, 125);
          this.addChild(this.toggleButton, 74);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int findOptionPrefix(String prefix, int guard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          prefix = prefix.toLowerCase();
          if (guard != -2860) {
            field_N = (bw) null;
          }
          for (var3_int = 0; var3_int < this.optionList.options.length; var3_int++) {
            var4 = this.optionList.options[var3_int].toString().toLowerCase();
            if (var4.startsWith(prefix)) {
              stackIn_8_0 = var3_int;
              return stackIn_8_0;
            }
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ld.AA(");
          if (prefix == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(')').toString());
        }
    }

    final int selectedIndex(int guard) {
        int var2 = -105 / ((guard + 37) / 54);
        return this.optionList.selectionIndex;
    }

    private final void selectOptionPrefix(boolean guard, String prefix) {
        if (this.optionList.options == null) {
          return;
        }
        int var3_int = this.findOptionPrefix(prefix.toLowerCase(), -2860);
        if (var3_int == -1) {
          return;
        }
        try {
          this.optionList.selectionIndex = var3_int;
          if (guard) {
            String var4 = (String) null;
            DropDownWidget.a((String) null, (byte) -13);
          }
          this.ensureSelectionVisible(-1);
          this.searchPrefix = prefix;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ld.LA(" + guard + ',' + (prefix != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
