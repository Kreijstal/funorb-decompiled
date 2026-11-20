/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiWeightedGridContainer extends UiArrayContainer {
    private int[] cellLayoutFlags;
    private int[] cumulativeColumnWeights;
    private int nextCellIndex;
    private int horizontalPadding;
    private int[] cumulativeRowWeights;
    int field_w;
    private int verticalPadding;

    private final void resizeChildRows(int param0, byte param1, int param2) {
        int stackIn_3_0 = 0;
        int var4;
        UiComponent[] var5;
        UiComponent[] var5Lifetime1;
        if (null != this.cumulativeColumnWeights) {
          stackIn_3_0 = this.cumulativeColumnWeights.length;
        } else {
          stackIn_3_0 = 0;
        }
        var4 = stackIn_3_0;
        if (param1 == -83) {
          var5 = new UiComponent[var4 * param0];
          if (null != this.children &&
            0 < this.children.length &&
            var5.length > 0 &&
            param2 > 0) {
            ArrayOperations.copy(this.children, 0, var5, 0, Math.min(param2, param0) * var4);
          }
          this.children = var5;
          return;
        }
        this.horizontalPadding = 55;
        var5Lifetime1 = new UiComponent[var4 * param0];
        if (null != this.children &&
          0 < this.children.length &&
          var5Lifetime1.length > 0 &&
          param2 > 0) {
          ArrayOperations.copy(this.children, 0, var5Lifetime1, 0, Math.min(param2, param0) * var4);
        }
        this.children = var5Lifetime1;
    }

    private final void resizeFlagColumns(int param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_3_0 = 0;
        int var4;
        int[] var5;
        int var7;
        var7 = VoidHunters.field_G;
        if (this.cumulativeRowWeights != null) {
          stackIn_3_0 = this.cumulativeRowWeights.length;
        } else {
          stackIn_3_0 = 0;
        }
        var4 = stackIn_3_0;
        var5 = new int[var4 * param0];
        if (null == this.cellLayoutFlags) {
          this.cellLayoutFlags = var5;
          if (param1 < -49) {
            return;
          }
          this.field_w = -51;
          return;
        }
        if (this.cellLayoutFlags.length <= 0) {
          this.cellLayoutFlags = var5;
          if (param1 < -49) {
            return;
          }
          this.field_w = -51;
          return;
        }
        if (var5.length <= 0) {
          this.cellLayoutFlags = var5;
          if (param1 < -49) {
            return;
          }
          this.field_w = -51;
          return;
        }
        if (param2 <= 0) {
          this.cellLayoutFlags = var5;
          if (param1 < -49) {
            return;
          }
          this.field_w = -51;
          return;
        }
        for (var6 = 0; var4 > var6; var6++) {
          ArrayOperations.copy(this.cellLayoutFlags, param2 * var6, var5, param0 * var6, Math.min(param2, param0));
        }
        this.cellLayoutFlags = var5;
        if (param1 < -49) {
          return;
        }
        this.field_w = -51;
        return;
    }

    UiWeightedGridContainer(int param0, int param1, int param2, int param3, UiRenderer param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_w = 92;
        this.nextCellIndex = 0;
        try {
          var10 = new int[param5];
          int[] var8 = var10;
          ArrayOperations.fill(var10, 0, param5, 1);
          var9 = new int[param6];
          ArrayOperations.fill(var9, 0, param6, 1);
          this.setColumnWeights(0, var10);
          this.setRowWeights((byte) -115, var9);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "usb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void layoutChildren(int param0) {
        int incrementValue$0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        UiComponent var5;
        var6 = VoidHunters.field_G;
        var2 = 0;
        if (param0 != 16777215) {
          return;
        }
        var3 = 0;
        while (this.children.length > var2) {
          if (var3 >= this.cumulativeRowWeights.length) {
            return;
          }
          var4 = 0;
          while (var2 < this.children.length) {
            if (var4 < this.cumulativeColumnWeights.length) {
              incrementValue$0 = var2;
              var2++;
              var5 = this.children[incrementValue$0];
              if (var5 != null) {
                this.layoutCell(var3, (byte) 72, var4, var5);
              }
              var4++;
              continue;
            }
            break;
          }
          var3++;
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
    }

    final void appendCell(UiComponent param0, byte param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
          var4_int = this.nextCellIndex % this.cumulativeColumnWeights.length;
          if (param1 > -10) {
            this.field_w = 54;
          }
          var5 = this.nextCellIndex / this.cumulativeColumnWeights.length;
          this.cellLayoutFlags[this.nextCellIndex] = param2;
          this.children[this.nextCellIndex] = param0;
          if (param0 != null) {
            this.layoutCell(var5, (byte) 104, var4_int, param0);
          }
          this.nextCellIndex = this.nextCellIndex + 1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "usb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void setRowWeights(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int dupTemp$0 = 0;
        int var9 = VoidHunters.field_G;
        try {
          int var3_int = 9 % ((-48 - param0) / 36);
          var4 = this.cumulativeRowWeights == null ? 0 : this.cumulativeRowWeights.length;
          var5 = param1.length;
          this.cumulativeRowWeights = param1;
          var6 = param1;
          var7 = 0;
          var8 = 0;
          while (var6.length > var7) {
            dupTemp$0 = var8 + var6[var7];
            var8 = dupTemp$0;
            var6[var7] = dupTemp$0;
            var7++;
          }
          this.resizeChildRows(var5, (byte) -83, var4);
          this.resizeFlagRows(var5, (byte) -100, var4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "usb.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setCellPadding(int param0, int param1, int param2) {
        if (param0 == -6) {
          this.verticalPadding = param1;
          this.horizontalPadding = param2;
          return;
        }
        UiComponent var5 = (UiComponent) null;
        this.handleMousePress(-108, 52, 75, -20, (UiComponent) null, -91, (byte) 106);
        this.verticalPadding = param1;
        this.horizontalPadding = param2;
    }

    private final void resizeFlagRows(int param0, byte param1, int param2) {
        int var4 = this.cumulativeColumnWeights == null ? 0 : this.cumulativeColumnWeights.length;
        int[] var5 = new int[var4 * param0];
        int var6 = -71 % ((-51 - param1) / 35);
        if (null == this.cellLayoutFlags) {
          this.cellLayoutFlags = var5;
          return;
        }
        if (this.cellLayoutFlags.length <= 0) {
          this.cellLayoutFlags = var5;
          return;
        }
        if (var5.length <= 0) {
          this.cellLayoutFlags = var5;
          return;
        }
        if (param2 > 0) {
          ArrayOperations.copy(this.cellLayoutFlags, 0, var5, 0, Math.min(param2, param0) * var4);
          this.cellLayoutFlags = var5;
          return;
        }
        this.cellLayoutFlags = var5;
    }

    final boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 > -17) {
            this.verticalPadding = 25;
          }
          stackIn_3_0 = super.handleMousePress(param0, param1, param2, param3, param4, param5, (byte) -120);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("usb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void setColumnWeights(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = VoidHunters.field_G;
        try {
          var3_int = null != this.cumulativeColumnWeights ? this.cumulativeColumnWeights.length : 0;
          var4 = param1.length;
          this.cumulativeColumnWeights = param1;
          var5 = param1;
          var6 = 0;
          var7 = param0;
          while (var5.length > var6) {
            dupTemp$0 = var7 + var5[var6];
            var7 = dupTemp$0;
            var5[var6] = dupTemp$0;
            var6++;
          }
          this.resizeChildColumns(var3_int, (byte) -86, var4);
          this.resizeFlagColumns(var4, param0 - 70, var3_int);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "usb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void layoutCell(int param0, byte param1, int param2, UiComponent param3) {
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var15Lifetime1;
        var20 = VoidHunters.field_G;
        try {
          var5_int = this.cumulativeColumnWeights[-1 + this.cumulativeColumnWeights.length];
          var6 = this.cumulativeRowWeights[this.cumulativeRowWeights.length - 1];
          if (0 >= param2) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = this.cumulativeColumnWeights[param2 - 1];
          }
          var7 = stackIn_4_0 * this.width / var5_int;
          stackIn_6_0 = this.height;
          if (0 >= param0) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = this.cumulativeRowWeights[param0 - 1];
          }
          var8 = stackIn_6_0 * stackIn_7_1 / var6;
          var9 = this.cumulativeColumnWeights[param2] * this.width / var5_int;
          var10 = this.height * this.cumulativeRowWeights[param0] / var6;
          var11 = param0 * this.cumulativeColumnWeights.length + param2;
          var12 = this.cellLayoutFlags[var11] & 48;
          var13 = 192 & this.cellLayoutFlags[var11];
          var14 = param3.x;
          if (param1 <= 45) {
            this.setCellPadding(14, 96, 93);
          }
          var15 = param3.y;
          var16 = param3.width;
          var17 = param3.height;
          if (var16 < -var7 + var9 &&
            (1 & this.cellLayoutFlags[var11]) != 0) {
            var16 = -var7 + var9;
            var14Lifetime1 = var7;
          } else if (var9 - var7 < var16 &&
            (4 & this.cellLayoutFlags[var11]) != 0) {
            var16 = -var7 + var9;
            var14Lifetime1 = var7;
          } else {
            if (16 == var12) {
              var14Lifetime1 = -var16 + var9 + var7 >> 1;
            } else {
              if (var12 == 32) {
                var14Lifetime1 = -var16 + var9;
              } else {
                var14Lifetime1 = var7;
              }
            }
          }
          if (var17 < var10 - var8 &&
            (this.cellLayoutFlags[var11] & 2) != 0) {
            var17 = var10 - var8;
            var15Lifetime1 = var8;
          } else if (var10 - var8 < var17 &&
            (8 & this.cellLayoutFlags[var11]) != 0) {
            var17 = var10 - var8;
            var15Lifetime1 = var8;
          } else {
            if (var13 != 64) {
              if (var13 == 128) {
                var15Lifetime1 = var10 - var17;
              } else {
                var15Lifetime1 = var8;
              }
            } else {
              var15Lifetime1 = -var17 + var10 + var8 >> 1;
            }
          }
          var18 = this.horizontalPadding;
          var19 = this.verticalPadding;
          param3.setBounds(var18 + var14Lifetime1, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15Lifetime1 + var19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("usb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        int var5_int = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        try {
          if (super.handleKey(param0 + 0, param1, param2, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int == 98) {
            stackIn_11_0 = this.focusPreviousChild(param2, 103, this.cumulativeColumnWeights.length);
            return stackIn_11_0;
          }
          if (var5_int == 99) {
            stackIn_13_0 = this.focusNextChild(this.cumulativeColumnWeights.length, param2, 0);
            return stackIn_13_0;
          }
          if (96 == var5_int) {
            stackIn_15_0 = this.focusPreviousChild(param2, (byte) -123);
            return stackIn_15_0;
          }
          if (97 == var5_int) {
            stackIn_17_0 = this.focusNextChild(param2, (byte) 39);
            return stackIn_17_0;
          }
          if (param0 != -15834) {
            var6 = (String) null;
            UiWeightedGridContainer.drawTextBox(-25, (BitmapFont) null, (String) null, 107, 85, 63, 106);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("usb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void drawTextBox(int param0, BitmapFont param1, String param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          var7_int = param1.getStringWidth(param2);
          var8 = param1.maxDescent + param1.capHeight;
          var9 = param3;
          if (SoftwareRasterizer2D.width < var7_int + (var9 + 6)) {
            var9 = -var7_int + (SoftwareRasterizer2D.width - 6);
          }
          var10 = 32 + (-param1.capHeight + param0);
          if (SoftwareRasterizer2D.height < var8 + var10 + 6) {
            var10 = -var8 + (SoftwareRasterizer2D.height - 6);
          }
          SoftwareRasterizer2D.drawRectangle(var9, var10, 6 + var7_int, 6 + var8, param5);
          SoftwareRasterizer2D.fillRectangle(param4 + var9, var10 + 1, 4 + var7_int, var8 + 4, param6);
          param1.draw(param2, 3 + var9, param1.capHeight + (var10 + 3), param5, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("usb.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void resizeChildColumns(int param0, byte param1, int param2) {
        int var4;
        UiComponent[] var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        int var6Lifetime1;
        var7 = VoidHunters.field_G;
        if (null != this.cumulativeRowWeights) {
          stackIn_3_0 = this.cumulativeRowWeights.length;
        } else {
          stackIn_3_0 = 0;
        }
        var4 = stackIn_3_0;
        var5 = new UiComponent[param2 * var4];
        if (null != this.children &&
          this.children.length > 0 &&
          var5.length > 0 &&
          param0 > 0) {
          for (var6 = 0; var4 > var6; var6++) {
            ArrayOperations.copy(this.children, param0 * var6, var5, param2 * var6, Math.min(param0, param2));
          }
        }
        this.children = var5;
        var6Lifetime1 = -67 % ((param1 - 32) / 58);
    }

    static {
    }
}
