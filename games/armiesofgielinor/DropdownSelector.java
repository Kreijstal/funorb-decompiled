/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownSelector extends DequeWidgetContainer implements WidgetActivationListener {
    static String field_P;
    private int collapsedHeight;
    String typedPrefix;
    private boolean field_F;
    static RgbSprite field_M;
    BitmapFont font;
    private InteractiveWidget textButton;
    boolean expanded;
    DropdownOptionList optionList;
    private InteractiveWidget arrowButton;
    private int maximumDropdownHeight;
    ScrollWidgetContainer dropdownViewport;

    public static void a(int param0) {
        field_M = null;
        if (param0 != -11835) {
          return;
        }
        field_P = null;
    }

    private final void a(boolean param0, String param1) {
        if (null == this.optionList.options) {
          return;
        }
        int var3_int = this.findOptionPrefix(0, param1.toLowerCase());
        if (var3_int == -1) {
          return;
        }
        try {
          this.optionList.selectedIndex = var3_int;
          if (!param0) {
            this.field_F = true;
          }
          this.ensureSelectionVisible(107805154);
          this.typedPrefix = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gh.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isFocused(boolean obfuscationGuard) {
        boolean stackIn_7_0 = false;
        if (obfuscationGuard) {
          this.collapsedHeight = -22;
        }
        stackIn_7_0 = (this.field_F) || (super.isFocused(false));
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.setBounds(param3, param4, param1, 8192, param0);
        int var6 = 2 % ((-8 - param2) / 44);
        this.textButton.setBounds(0, param4 - 20, 0, 8192, this.collapsedHeight);
        this.arrowButton.setBounds(param4 - 20, 20, 0, 8192, this.collapsedHeight);
        if (this.expanded) {
          this.dropdownViewport.setBounds(0, param4, this.collapsedHeight, 8192, param0 - this.collapsedHeight);
        }
    }

    final boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          rootWidget.blur(1);
          if (obfuscationGuard != 11) {
            return true;
          }
          this.typedPrefix = "";
          this.field_F = true;
          if (null != this.listener &&
            this.listener instanceof WidgetFocusListener) {
            ((WidgetFocusListener) (this.listener)).focusChanged((Widget) (this), this.field_F, (byte) -41);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gh.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void g(byte param0) {
        if (this.listener instanceof DropdownSelectionListener) {
          ((DropdownSelectionListener) ((Object) this.listener)).selectionChanged(-109, this);
        }
        if (param0 <= 4) {
          DropdownSelector.a(-40);
        }
    }

    final boolean isExpanded(int obfuscationGuard) {
        if (obfuscationGuard != 11180) {
          Widget var3 = (Widget) null;
          this.updatePointer(-2, 83, 58, (Widget) null);
        }
        return this.expanded;
    }

    DropdownSelector(Object[] options, int selectedIndex, int maximumDropdownHeight) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        this.typedPrefix = "";
        this.font = ArmiesOfGielinor.field_J;
        try {
          this.optionList = new DropdownOptionList(this, this.font, options, selectedIndex);
          this.expanded = false;
          this.optionList.listener = (WidgetListener) (this);
          this.maximumDropdownHeight = maximumDropdownHeight;
          this.textButton = new InteractiveWidget("", new fk(this), (WidgetListener) (this));
          this.arrowButton = new InteractiveWidget();
          this.arrowButton.painter = (WidgetPainter) ((Object) new DropdownArrowPainter());
          this.arrowButton.listener = (WidgetListener) (this);
          this.addChild((byte) 10, (Widget) (this.textButton));
          this.addChild((byte) 10, (Widget) (this.arrowButton));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gh.<init>(" + (options != null ? "{...}" : "null") + ',' + selectedIndex + ',' + maximumDropdownHeight + ')');
        }
    }

    private final void closeDropdown(int obfuscationGuard) {
        int discarded$0 = 0;
        if (!this.isExpanded(11180)) {
          return;
        }
        this.a(this.collapsedHeight, this.y, (byte) -97, this.x, this.width);
        if (obfuscationGuard >= -66) {
          String var3 = (String) null;
          discarded$0 = this.findOptionPrefix(-114, (String) null);
        }
        this.expanded = false;
        this.dropdownViewport.unlink(124);
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (obfuscationGuard != 11) {
            this.font = (BitmapFont) null;
          }
          if (this.isExpanded(11180)) {
            this.closeDropdown(-128);
          } else {
            this.openDropdown(obfuscationGuard - 11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("gh.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gh.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    final boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 103) {
            this.blur(-3);
          }
          stackIn_3_0 = super.pointerPressed(pointerX, originX, originY, 107, rootWidget, pointerY, button);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("gh.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    final static void f(byte param0) {
        boolean stackIn_37_0 = false;
        boolean stackIn_40_0 = false;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var1Lifetime1;
        int var3Lifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!OwnerChangeEvent.field_B) {
            if (null == ValidationState.field_b) {
              ValidationState.field_b = DeployRequest.b(-1, 4);
            }
            if (ValidationState.field_b.field_m) {
              var12 = BoundedFile.field_e;
              var10 = var12;
              var5 = var10;
              var1 = var5;
              var16 = ValidationState.field_b.field_l;
              for (var3 = 0; var3 < 8; var3++) {
                var5[var3] = AccountRegistrationDialog.bitwiseOr(var12[var3], var16[var3]);
              }
              var13 = ReportAbuseDialog.field_Nb;
              var11 = var13;
              var7 = var11;
              var1Lifetime1 = var7;
              var17 = ValidationState.field_b.field_l;
              var9 = 0;
              var3Lifetime1 = var9;
              while (var9 < 8) {
                var7[var9] = rn.bitwiseAnd(var13[var9], ~var17[var9]);
                var9++;
              }
              ValidationState.field_b = null;
              OwnerChangeEvent.field_B = true;
              Unit.m(77);
              if (DebouncedValidator.a(0, BoundedFile.field_e, 1)) {
                RevivalEvent.d((byte) 125);
              }
            }
            if (OwnerChangeEvent.field_B) {
              UpkeepEvent.h(-78);
              ws.b(true);
              if (ClientContextMenu.field_a == 9 &&
                !MusicPatch.a(ReportAbuseDialog.field_Nb, (byte) 116)) {
                ClientContextMenu.field_a = 0;
              }
            }
          }
          if (!ClientUiNode.field_w &&
            !de.field_a) {
            EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 69);
            de.field_a = true;
          }
          if (!ve.field_b &&
            !af.field_c) {
            EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 75);
            af.field_c = true;
          }
          var1_int = -118 / ((16 - param0) / 35);
          if (!UnitAnimationPreview.field_h) {
            if (null == RadialSummonItem.field_f) {
              RadialSummonItem.field_f = MusicPatchEnvelope.a(14663, 6);
            }
            if (RadialSummonItem.field_f.field_n) {
              if (null != RadialSummonItem.field_f.field_s) {
                AccountRegistrationDialog.a(RadialSummonItem.field_f.field_s, 1);
              }
              if (DisplayModeOptionPainter.field_v) {
                StripedProgressWidget.a(1);
              } else {
                ek.field_d = AnimationFrameSet.field_E >> 2 & 3;
                stackIn_37_0 = ((AnimationFrameSet.field_E & 1) != 0);
                cu.field_a = stackIn_37_0;
                stackIn_40_0 = ((2 & AnimationFrameSet.field_E) != 0);
                uc.field_a = stackIn_40_0;
                if (3 <= ek.field_d) {
                  ek.field_d = 0;
                }
              }
              UnitAnimationPreview.field_h = true;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "gh.E(" + param0 + ')');
        }
    }

    final int getSelectedIndex(byte obfuscationGuard) {
        if (obfuscationGuard != 71) {
          return -94;
        }
        return this.optionList.selectedIndex;
    }

    private final void ensureSelectionVisible(int obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var7Lifetime1;
        int var8Lifetime1;
        if (this.isExpanded(11180) &&
          this.optionList.selectedIndex != -1 &&
          null != this.optionList.options &&
          null != this.dropdownViewport.verticalControl) {
          var2 = this.dropdownViewport.viewport.height;
          var3 = this.optionList.rowHeight;
          var4 = this.optionList.height - var2;
          if (var4 <= 0) {
            return;
          }
          var5 = var3 * this.optionList.selectedIndex;
          var6 = var5 + this.dropdownViewport.viewport.child.y;
          var7 = var2 >> 2;
          if (obfuscationGuard != 107805154) {
            return;
          }
          if (var6 < var7) {
            var8 = -(-var5 + var7 << 16) / var4;
            if (var8 < 0) {
              var8 = 0;
            }
            this.dropdownViewport.verticalControl.verticalPosition = var8;
          }
          var7Lifetime1 = -var3 + (3 * var2 >> 2);
          if (var7Lifetime1 < var6) {
            var8Lifetime1 = -(var7Lifetime1 - var5 << 16) / var4;
            if (var8Lifetime1 > 65536) {
              var8Lifetime1 = 65536;
            }
            this.dropdownViewport.verticalControl.verticalPosition = var8Lifetime1;
          }
          return;
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        boolean stackIn_60_0 = false;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Widget var8 = null;
        int var6_intLifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.isFocused(false)) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.optionList.options != null) {
            var5_int = this.optionList.options.length;
            if (keyCode != 99 &&
              keyCode != 98) {
              if (keyCode != 105 &&
                keyCode != 104) {
                if (keyCode == 84) {
                  if (!this.expanded) {
                    this.openDropdown(0);
                  } else {
                    this.closeDropdown(-116);
                  }
                  return true;
                }
                if (keyCode == 85) {
                  var6_int = this.typedPrefix.length();
                  if (var6_int <= 0) {
                    return true;
                  }
                  this.typedPrefix = this.typedPrefix.substring(0, var6_int - 1);
                  return true;
                }
                decompiledFrameRemainder0 = !(32 > character);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(character >= 128))) {
                  var6 = this.typedPrefix + character;
                  this.a(true, var6);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.isExpanded(obfuscationGuard + 23395)) {
                  this.openDropdown(0);
                }
                var6_intLifetime1 = this.dropdownViewport.viewport.height / this.optionList.rowHeight;
                if (105 != keyCode) {
                  this.optionList.selectedIndex = this.optionList.selectedIndex - var6_intLifetime1;
                } else {
                  this.optionList.selectedIndex = this.optionList.selectedIndex + var6_intLifetime1;
                }
                if (0 > this.optionList.selectedIndex) {
                  this.optionList.selectedIndex = 0;
                }
                if (var5_int <= this.optionList.selectedIndex) {
                  this.optionList.selectedIndex = -1 + var5_int;
                }
                this.ensureSelectionVisible(obfuscationGuard ^ -107796053);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.isExpanded(11180)) {
                this.openDropdown(0);
              }
              if (keyCode != 99) {
                this.optionList.selectedIndex = this.optionList.selectedIndex - 1;
              } else {
                this.optionList.selectedIndex = this.optionList.selectedIndex + 1;
              }
              if (this.optionList.selectedIndex < 0) {
                this.optionList.selectedIndex = 0;
              }
              if (this.optionList.selectedIndex >= var5_int) {
                this.optionList.selectedIndex = var5_int - 1;
              }
              this.ensureSelectionVisible(107805154);
              return true;
            }
          }
          if (obfuscationGuard != -12215) {
            var8 = (Widget) null;
            this.handleKey((Widget) null, -8, 'd', 65);
          }
          if (keyCode != 80) {
            stackIn_60_0 = super.handleKey(rootWidget, keyCode, character, -12215);
            return stackIn_60_0;
          }
          this.closeDropdown(obfuscationGuard + 12094);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_63_0 = var5;
          stackIn_63_1 = new StringBuilder().append("gh.F(");
          if (rootWidget == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final int findOptionPrefix(int startIndex, String prefix) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          prefix = prefix.toLowerCase();
          for (var3_int = startIndex; this.optionList.options.length > var3_int; var3_int++) {
            var4 = this.optionList.options[var3_int].toString().toLowerCase();
            if (var4.startsWith(prefix)) {
              stackIn_6_0 = var3_int;
              return stackIn_6_0;
            }
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gh.K(").append(startIndex).append(',');
          if (prefix == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final String getTooltipText(int obfuscationGuard) {
        if (!this.hovered) {
          return null;
        }
        if (obfuscationGuard != 21384) {
          return (String) null;
        }
        if (this.isExpanded(11180) &&
          this.dropdownViewport.hovered &&
          -1 != this.optionList.hoveredIndex) {
          return this.optionList.options[this.optionList.hoveredIndex].toString();
        }
        if (this.optionList.getSelectedOption(-6508) != null) {
          return this.optionList.getSelectedOption(-6508).toString();
        }
        return super.getTooltipText(obfuscationGuard + 0);
    }

    final static void a(int param0, int param1, int param2, int param3, BitmapFont param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, nr param12, int param13, nr param14, int param15, int param16, int param17, nr param18, BitmapFont param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          NanoGameClock.field_s = param4;
          AiPlanner.field_G = param19;
          kq.a(param3, param17, (byte) 87, param10, param2);
          CampaignMenu.a((byte) 123, param18, param5, param16);
          if (param11 != -99) {
            return;
          }
          op.a(param7, param1, param12, param14, -3, param6);
          ContextualRuntimeException.a((byte) -85, param15, param9);
          MusicPatchNode.a(param8, param0, param13, 3815);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("gh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void openDropdown(int obfuscationGuard) {
        int var2 = this.optionList.a((byte) -126);
        int var3 = var2;
        int var4 = 0;
        if (this.maximumDropdownHeight < var3) {
          var3 = this.maximumDropdownHeight;
          var4 = 1;
        }
        this.a(var3 + this.collapsedHeight, this.y, (byte) 50, this.x, this.width);
        this.optionList.setBounds(0, this.width, obfuscationGuard, obfuscationGuard ^ 8192, var2);
        this.dropdownViewport = new ScrollWidgetContainer(0, 0, 0, 0, new fc(), this.optionList, (WidgetPainter) null);
        if (var4 != 0) {
          this.dropdownViewport.setVerticalControl((byte) 118, true, StandardContentDialog.createVerticalScrollControl(obfuscationGuard ^ 0));
        }
        this.dropdownViewport.setBounds(0, this.width, this.collapsedHeight, obfuscationGuard + 8192, this.height - this.collapsedHeight);
        this.expanded = true;
        this.addChild((byte) 10, (Widget) (this.dropdownViewport));
        this.ensureSelectionVisible(107805154);
    }

    final void blur(int obfuscationGuard) {
        this.field_F = false;
        super.blur(obfuscationGuard + 0);
        if (obfuscationGuard != 1) {
          this.maximumDropdownHeight = -4;
        }
    }

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        int discarded$0 = 0;
        this.collapsedHeight = height;
        if (obfuscationGuard != 8192) {
          String var7 = (String) null;
          discarded$0 = this.findOptionPrefix(20, (String) null);
        }
        this.a(height, y, (byte) 107, x, width);
    }

    static {
    }
}
