/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComboBox extends UiContainer implements UiActionListener {
    private UiFocusableComponent arrowButton;
    private int maximumDropdownHeight;
    boolean dropdownOpen;
    UiScrollPane dropdownPane;
    private UiFocusableComponent displayButton;
    UiComboBoxList list;
    static String field_D;
    static String field_I;
    BitmapFont font;
    private int collapsedHeight;
    String typedPrefix;
    private boolean focused;

    final boolean isDropdownOpen(int param0) {
        if (param0 != 0) {
          return true;
        }
        return this.dropdownOpen;
    }

    private final void selectByPrefix(byte param0, String param1) {
        if (null == this.list.items) {
          return;
        }
        int var3_int = this.findPrefixMatch(param1.toLowerCase(), param0 - 108);
        if (var3_int == -1) {
          return;
        }
        try {
          if (param0 != 40) {
            this.clearFocus((byte) 41);
          }
          this.list.selectedIndex = var3_int;
          this.scrollSelectionIntoView(125);
          this.typedPrefix = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nva.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param3, param0, param4, 1, param1);
        this.displayButton.setBounds(0, param2 + param0, this.collapsedHeight, param2 + 21, 0);
        this.arrowButton.setBounds(-20 + param0, 20, this.collapsedHeight, 1, 0);
        if (this.dropdownOpen) {
          this.dropdownPane.setBounds(0, param0, -this.collapsedHeight + param4, 1, this.collapsedHeight);
        }
    }

    private final void scrollSelectionIntoView(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var8Lifetime1;
        int var9Lifetime1;
        if (this.isDropdownOpen(0) &&
          this.list.selectedIndex != -1 &&
          null != this.list.items &&
          null != this.dropdownPane.verticalScrollbar) {
          var2 = this.dropdownPane.viewport.height;
          var3 = this.list.rowHeight;
          var4 = -var2 + this.list.height;
          if (var4 <= 0) {
            return;
          }
          var5 = -93 / ((72 - param0) / 35);
          var6 = var3 * this.list.selectedIndex;
          var7 = var6 + this.dropdownPane.viewport.child.y;
          var8 = var2 >> 2;
          if (var7 < var8) {
            var9 = -(var8 - var6 << 16) / var4;
            if (var9 < 0) {
              var9 = 0;
            }
            this.dropdownPane.verticalScrollbar.verticalPosition = var9;
          }
          var8Lifetime1 = -var3 + (3 * var2 >> 2);
          if (var8Lifetime1 < var7) {
            var9Lifetime1 = -(-var6 + var8Lifetime1 << 16) / var4;
            if (var9Lifetime1 > 65536) {
              var9Lifetime1 = 65536;
            }
            this.dropdownPane.verticalScrollbar.verticalPosition = var9Lifetime1;
          }
          return;
        }
    }

    private final void openDropdown(int param0) {
        int var2 = this.list.getPreferredListHeight(4);
        int var3 = var2;
        int var4 = 0;
        if (this.maximumDropdownHeight < var3) {
          var3 = this.maximumDropdownHeight;
          var4 = 1;
        }
        this.setBoundsAndLayout(this.width, this.y, -20, this.x, this.collapsedHeight + var3);
        this.list.setBounds(0, this.width, var2, 1, 0);
        this.dropdownPane = new UiScrollPane(0, 0, 0, 0, new NullUiRenderer(), this.list, (UiRenderer) null);
        if (var4 != 0) {
          this.dropdownPane.setVerticalScrollbar(true, GetMassDriverEnergyUsed.createVerticalScrollbar(0), (byte) -99);
        }
        this.dropdownPane.setBounds(0, this.width, this.height - this.collapsedHeight, 1, this.collapsedHeight);
        this.dropdownOpen = true;
        this.addChild(param0 ^ -6447, this.dropdownPane);
        this.scrollSelectionIntoView(param0 ^ 20500);
        if (param0 != 20589) {
          UiComponent var5 = (UiComponent) null;
          this.handleKey(76, 36, (UiComponent) null, '3');
        }
    }

    final void notifySelectionChanged(int param0) {
        if (param0 != 21694) {
          this.dropdownOpen = false;
        }
        if (this.listener instanceof UiComboBoxSelectionListener) {
          ((UiComboBoxSelectionListener) ((Object) this.listener)).onSelectionChanged(-3, this);
        }
    }

    UiComboBox(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (UiRenderer) null);
        this.typedPrefix = "";
        this.font = SetShipToShipRamDamage.field_o;
        try {
          this.list = new UiComboBoxList(this, this.font, param0, param1);
          this.maximumDropdownHeight = param2;
          this.list.listener = (UiListener) (this);
          this.dropdownOpen = false;
          this.displayButton = new UiFocusableComponent("", new UiComboBoxRenderer(this), (UiListener) (this));
          this.arrowButton = new UiFocusableComponent();
          this.arrowButton.renderer = (UiRenderer) ((Object) new UiComboBoxArrowRenderer());
          this.arrowButton.listener = (UiListener) (this);
          this.addChild(-18756, this.displayButton);
          this.addChild(-18756, this.arrowButton);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nva.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 != 11) {
            return;
          }
          if (!this.isDropdownOpen(0)) {
            this.openDropdown(20589);
          } else {
            this.closeDropdown(5647);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nva.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 > -77) {
          return;
        }
        field_D = null;
        field_I = null;
    }

    final boolean hasFocus(byte param0) {
        UiComponent var3;
        boolean stackIn_7_0 = false;
        if (param0 != -120) {
          var3 = (UiComponent) null;
          this.handleKey(27, 77, (UiComponent) null, 'ￔ');
        }
        stackIn_7_0 = (this.focused) || (super.hasFocus((byte) -120));
        return stackIn_7_0;
    }

    private final void closeDropdown(int param0) {
        if (!this.isDropdownOpen(param0 ^ param0)) {
          return;
        }
        this.setBoundsAndLayout(this.width, this.y, -20, this.x, this.collapsedHeight);
        this.dropdownOpen = false;
        this.dropdownPane.unlink(param0 - 9493);
    }

    final void clearFocus(byte param0) {
        this.focused = false;
        super.clearFocus(param0);
    }

    final boolean requestFocus(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.clearFocus((byte) -34);
          if (param0 != 0) {
            this.handleKey(-101, -112, (UiComponent) null, '￭');
          }
          this.focused = true;
          this.typedPrefix = "";
          if (null != this.listener &&
            this.listener instanceof UiFocusListener) {
            ((UiFocusListener) (this.listener)).onFocusChanged(this.focused, (UiComponent) (this), true);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nva.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nva.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltip(byte param0) {
        int discarded$0 = 0;
        if (!this.hovered) {
          return null;
        }
        if (this.isDropdownOpen(0) &&
          this.dropdownPane.hovered &&
          this.list.hoveredIndex != -1) {
          return this.list.items[this.list.hoveredIndex].toString();
        }
        if (null != this.list.getSelectedItem((byte) 96)) {
          return this.list.getSelectedItem((byte) 96).toString();
        }
        if (param0 != 125) {
          String var3 = (String) null;
          discarded$0 = this.findPrefixMatch((String) null, -80);
        }
        return super.getTooltip((byte) 125);
    }

    final boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            this.font = (BitmapFont) null;
          }
          stackIn_3_0 = super.handleMousePress(param0, param1, param2, param3, param4, param5, (byte) -93);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nva.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
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
        var7 = VoidHunters.field_G;
        try {
          if (!this.hasFocus((byte) -120)) {
            return false;
          }
          if (param0 != -15834) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.list.items) {
            var5_int = this.list.items.length;
            if (param1 != 99 &&
              param1 != 98) {
              if (param1 != 105 &&
                param1 != 104) {
                if (84 == param1) {
                  if (this.dropdownOpen) {
                    this.closeDropdown(5647);
                  } else {
                    this.openDropdown(20589);
                  }
                  return true;
                }
                if (85 == param1) {
                  var6_int = this.typedPrefix.length();
                  if (var6_int <= 0) {
                    return true;
                  }
                  this.typedPrefix = this.typedPrefix.substring(0, -1 + var6_int);
                  return true;
                }
                decompiledFrameRemainder0 = !(param3 < 32);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(param3 >= 128))) {
                  var6 = this.typedPrefix + param3;
                  this.selectByPrefix((byte) 40, var6);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.isDropdownOpen(0)) {
                  this.openDropdown(20589);
                }
                var6_intLifetime1 = this.dropdownPane.viewport.height / this.list.rowHeight;
                if (param1 == 105) {
                  this.list.selectedIndex = this.list.selectedIndex + var6_intLifetime1;
                } else {
                  this.list.selectedIndex = this.list.selectedIndex - var6_intLifetime1;
                }
                if (0 > this.list.selectedIndex) {
                  this.list.selectedIndex = 0;
                }
                if (this.list.selectedIndex >= var5_int) {
                  this.list.selectedIndex = -1 + var5_int;
                }
                this.scrollSelectionIntoView(120);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.isDropdownOpen(0)) {
                this.openDropdown(20589);
              }
              if (param1 == 99) {
                this.list.selectedIndex = this.list.selectedIndex + 1;
              } else {
                this.list.selectedIndex = this.list.selectedIndex - 1;
              }
              if (this.list.selectedIndex < 0) {
                this.list.selectedIndex = 0;
              }
              if (var5_int <= this.list.selectedIndex) {
                this.list.selectedIndex = -1 + var5_int;
              }
              this.scrollSelectionIntoView(115);
              return true;
            }
          }
          if (80 != param1) {
            stackIn_61_0 = super.handleKey(-15834, param1, param2, param3);
            return stackIn_61_0;
          }
          this.closeDropdown(5647);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("nva.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int findPrefixMatch(String param0, int param1) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var5 = null;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          var3_int = -55 / ((45 - param1) / 53);
          param0 = param0.toLowerCase();
          for (var4 = 0; this.list.items.length > var4; var4++) {
            var5 = this.list.items[var4].toString().toLowerCase();
            if (var5.startsWith(param0)) {
              stackIn_6_0 = var4;
              return stackIn_6_0;
            }
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nva.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.collapsedHeight = param2;
        if (param3 != 1) {
          this.collapsedHeight = 17;
        }
        this.setBoundsAndLayout(param1, param4, -20, param0, param2);
    }

    final int getSelectedIndex(int param0) {
        if (param0 != 0) {
          this.maximumDropdownHeight = 67;
        }
        return this.list.selectedIndex;
    }

    final static String repeatCharacter(char param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (!param1) {
          UiComboBox.clearSharedReferences(-90);
        }
        for (var4 = 0; var4 < param2; var4++) {
          var6[var4] = param0;
        }
        return new String(var6);
    }

    final static void setMenuTextColors(int param0, boolean param1, int param2, int param3) {
        GetPhasedEnergyBeamPulsetime.menuHeadingColor = param2;
        FloatPacketBuffer.menuSelectedItemColor = param0;
        if (!param1) {
          UiComboBox.repeatCharacter('W', true, -7);
        }
        SetUsePolygonFill.menuItemColor = param3;
    }

    static {
        field_D = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_I = "Activate to confuse nearby missiles";
    }
}
