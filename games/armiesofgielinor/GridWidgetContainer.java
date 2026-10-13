/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GridWidgetContainer extends ArrayWidgetContainer {
    private int[] cellFlags;
    private int horizontalInset;
    static String field_P;
    private int verticalInset;
    private int[] rowEnds;
    private int[] columnEnds;
    private int nextCellIndex;
    int field_Q;
    static volatile int heldPointerButton;
    static String[] field_M;
    static String field_O;

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        if (obfuscationGuard != 8192) {
          heldPointerButton = 99;
        }
        super.setBounds(x, width, y, obfuscationGuard + 0, height);
    }

    private final void resizeFlagRows(int newRows, int oldRows, int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return;
        }
        int var4 = null != this.columnEnds ? this.columnEnds.length : 0;
        int[] var5 = new int[newRows * var4];
        if (this.cellFlags != null &&
          0 < this.cellFlags.length &&
          0 < var5.length &&
          oldRows > 0) {
          vm.a(this.cellFlags, 0, var5, 0, var4 * Math.min(oldRows, newRows));
        }
        this.cellFlags = var5;
    }

    private final void layoutCell(int row, byte obfuscationGuard, Widget child, int column) {
        int gridWidth = 0;
        int leftWeight = 0;
        int topWeight = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String childDescription = null;
        RuntimeException caughtFailure = null;
        int columnWeightSum = 0;
        RuntimeException failure = null;
        int rowWeightSum = 0;
        int cellLeft = 0;
        int cellTop = 0;
        int cellRight = 0;
        int cellBottom = 0;
        int cellIndex = 0;
        int horizontalAlignment = 0;
        int verticalAlignment = 0;
        int childX = 0;
        int childY = 0;
        int childWidth = 0;
        int childHeight = 0;
        int horizontalInset = 0;
        int verticalInset = 0;
        int obfuscationControl = 0;
        int alignedX;
        int alignedY;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          columnWeightSum = this.columnEnds[-1 + this.columnEnds.length];
          rowWeightSum = this.rowEnds[this.rowEnds.length - 1];
          gridWidth = this.width;
          if (column > 0) {
            leftWeight = this.columnEnds[column - 1];
          } else {
            leftWeight = 0;
          }
          cellLeft = gridWidth * leftWeight / columnWeightSum;
          if (row <= 0) {
            topWeight = 0;
          } else {
            topWeight = this.rowEnds[-1 + row];
          }
          cellTop = topWeight * this.height / rowWeightSum;
          cellRight = this.columnEnds[column] * this.width / columnWeightSum;
          cellBottom = this.height * this.rowEnds[row] / rowWeightSum;
          cellIndex = row * this.columnEnds.length + column;
          horizontalAlignment = 48 & this.cellFlags[cellIndex];
          verticalAlignment = 192 & this.cellFlags[cellIndex];
          childX = child.x;
          if (obfuscationGuard != 65) {
            return;
          }
          childY = child.y;
          childWidth = child.width;
          childHeight = child.height;
          if (cellRight - cellLeft > childWidth &&
            (this.cellFlags[cellIndex] & 1) != 0) {
            childWidth = -cellLeft + cellRight;
            alignedX = cellLeft;
          } else if (childWidth > -cellLeft + cellRight &&
            0 != (this.cellFlags[cellIndex] & 4)) {
            alignedX = cellLeft;
            childWidth = -cellLeft + cellRight;
          } else {
            if (horizontalAlignment != 16) {
              if (32 != horizontalAlignment) {
                alignedX = cellLeft;
              } else {
                alignedX = cellRight - childWidth;
              }
            } else {
              alignedX = cellLeft - (-cellRight + childWidth) >> 1;
            }
          }
          if (childHeight < cellBottom - cellTop &&
            (this.cellFlags[cellIndex] & 2) != 0) {
            alignedY = cellTop;
            childHeight = cellBottom - cellTop;
          } else if (childHeight > -cellTop + cellBottom &&
            (8 & this.cellFlags[cellIndex]) != 0) {
            childHeight = cellBottom - cellTop;
            alignedY = cellTop;
          } else {
            if (64 == verticalAlignment) {
              alignedY = -childHeight + cellTop + cellBottom >> 1;
            } else {
              if (verticalAlignment == 128) {
                alignedY = cellBottom - childHeight;
              } else {
                alignedY = cellTop;
              }
            }
          }
          horizontalInset = this.horizontalInset;
          verticalInset = this.verticalInset;
          child.setBounds(alignedX + horizontalInset, childWidth - horizontalInset * 2, alignedY + verticalInset, 8192, -(2 * verticalInset) + childHeight);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ob.C(").append(row).append(',').append(obfuscationGuard).append(',');
          if (child == null) {
            childDescription = "null";
          } else {
            childDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(childDescription).append(',').append(column).append(')').toString());
        }
    }

    final void addCell(Widget child, int flags, int obfuscationGuard) {
        int column = this.nextCellIndex % this.columnEnds.length;
        int row = this.nextCellIndex / this.columnEnds.length;
        this.cellFlags[this.nextCellIndex] = flags;
        this.children[this.nextCellIndex] = child;
        if (child != null) {
          this.layoutCell(row, (byte) 65, child, column);
        }
        if (obfuscationGuard != 0) {
          return;
        }
        try {
          this.nextCellIndex = this.nextCellIndex + 1;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ob.A(" + (child != null ? "{...}" : "null") + ',' + flags + ',' + obfuscationGuard + ')');
        }
    }

    final boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > 103) {
            stackIn_4_0 = super.pointerPressed(pointerX, originX, originY, 123, rootWidget, pointerY, button);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ob.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    final static int parseRadixInt(int radix, boolean allowLeadingPlus, CharSequence text, int initialValue) {
        int var8 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (radix >= 2 &&
            radix <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = initialValue;
            var7 = text.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = text.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (43 != var9 ||
                !allowLeadingPlus))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= radix) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + radix * var6;
                if (var6 != var10 / radix) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_38_0 = var6;
            return stackIn_38_0;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("ob.H(").append(radix).append(',').append(allowLeadingPlus).append(',');
          if (text == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(initialValue).append(')').toString());
        }
    }

    private final void resizeChildRows(byte obfuscationGuard, int oldRows, int newRows) {
        if (obfuscationGuard < 23) {
          heldPointerButton = -52;
        }
        int var4 = this.columnEnds == null ? 0 : this.columnEnds.length;
        Widget[] var5 = new Widget[newRows * var4];
        if (this.children != null &&
          this.children.length > 0 &&
          var5.length > 0 &&
          oldRows > 0) {
          vm.a(this.children, 0, var5, 0, Math.min(oldRows, newRows) * var4);
        }
        this.children = var5;
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int[] var7 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard ^ 0)) {
            return true;
          }
          var5_int = keyCode;
          if (98 == var5_int) {
            stackIn_12_0 = this.focusBackwardBy((byte) 106, rootWidget, this.columnEnds.length);
            return stackIn_12_0;
          }
          if (99 == var5_int) {
            stackIn_14_0 = this.focusForwardBy(rootWidget, this.columnEnds.length, true);
            return stackIn_14_0;
          }
          if (96 == var5_int) {
            stackIn_16_0 = this.focusPreviousChild((byte) 88, rootWidget);
            return stackIn_16_0;
          }
          if (var5_int == 97) {
            stackIn_18_0 = this.focusNextChild(obfuscationGuard ^ -12286, rootWidget);
            return stackIn_18_0;
          }
          if (obfuscationGuard != -12215) {
            var7 = (int[]) null;
            this.setRowWeights(14, (int[]) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ob.F(");
          if (rootWidget == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 <= 50) {
          field_O = (String) null;
        }
        field_P = null;
        field_M = null;
        field_O = null;
    }

    final void layoutChildren(byte obfuscationGuard) {
        int previousCellIndex = 0;
        int cellIndex;
        int row;
        int column;
        int obfuscationControl;
        Widget child;
        Widget guardWidget;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        cellIndex = 0;
        row = 0;
        while (cellIndex < this.children.length) {
          if (this.rowEnds.length > row) {
            column = 0;
            while (this.children.length > cellIndex) {
              if (column < this.columnEnds.length) {
                previousCellIndex = cellIndex;
                cellIndex++;
                child = this.children[previousCellIndex];
                if (child != null) {
                  this.layoutCell(row, (byte) 65, child, column);
                }
                column++;
                continue;
              }
              break;
            }
            row++;
            continue;
          }
          break;
        }
        if (obfuscationGuard < 84) {
          guardWidget = (Widget) null;
          this.pointerPressed(-86, 103, -38, 9, (Widget) null, 3, 102);
        }
    }

    private final void resizeChildColumns(int oldColumns, int newColumns, int obfuscationGuard) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = null == this.rowEnds ? 0 : this.rowEnds.length;
        Widget[] var5 = new Widget[newColumns * var4];
        if (null != this.children && this.children.length > 0 && var5.length > 0 &&
          oldColumns > 0) {
          for (var6 = 0; var4 > var6; var6++) {
            vm.a(this.children, var6 * oldColumns, var5, var6 * newColumns, Math.min(oldColumns, newColumns));
          }
        }
        if (obfuscationGuard != -20410) {
          return;
        }
        this.children = var5;
    }

    GridWidgetContainer(int x, int y, int width, int height, WidgetPainter painter, int columns, int rows) {
        super(x, y, width, height, painter);
        int[] var10 = null;
        int[] var9 = null;
        this.field_Q = 92;
        this.nextCellIndex = 0;
        try {
          var10 = new int[columns];
          int[] var8 = var10;
          vm.a(var10, 0, columns, 1);
          var9 = new int[rows];
          vm.a(var9, 0, rows, 1);
          this.setColumnWeights((byte) 78, var10);
          this.setRowWeights(0, var9);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ob.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (painter != null ? "{...}" : "null") + ',' + columns + ',' + rows + ')');
        }
    }

    private final void resizeFlagColumns(boolean obfuscationGuard, int oldColumns, int newColumns) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = this.rowEnds != null ? this.rowEnds.length : 0;
        int[] var5 = new int[newColumns * var4];
        if (this.cellFlags != null && 0 < this.cellFlags.length && var5.length > 0 &&
          oldColumns > 0) {
          for (var6 = 0; var4 > var6; var6++) {
            vm.a(this.cellFlags, var6 * oldColumns, var5, newColumns * var6, Math.min(oldColumns, newColumns));
          }
        }
        if (!obfuscationGuard) {
          return;
        }
        this.cellFlags = var5;
    }

    private final void setRowWeights(int initialWeight, int[] weights) {
        int oldRowCount = 0;
        int newRowCount = 0;
        int[] retainedWeights = null;
        int row = 0;
        int weightSum = 0;
        int nextWeightSum = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          oldRowCount = null != this.rowEnds ? this.rowEnds.length : 0;
          newRowCount = weights.length;
          this.rowEnds = weights;
          retainedWeights = weights;
          row = 0;
          weightSum = initialWeight;
          while (retainedWeights.length > row) {
            nextWeightSum = weightSum + retainedWeights[row];
            weightSum = nextWeightSum;
            retainedWeights[row] = nextWeightSum;
            row++;
          }
          this.resizeChildRows((byte) 65, oldRowCount, newRowCount);
          this.resizeFlagRows(newRowCount, oldRowCount, 0);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ob.J(" + initialWeight + ',' + (weights != null ? "{...}" : "null") + ')');
        }
    }

    final void setCellInsets(int verticalInset, int obfuscationGuard, int horizontalInset) {
        if (obfuscationGuard != 57) {
          this.nextCellIndex = 28;
        }
        this.verticalInset = verticalInset;
        this.horizontalInset = horizontalInset;
    }

    private final void setColumnWeights(byte obfuscationGuard, int[] weights) {
        int oldColumnCount = 0;
        int newColumnCount = 0;
        int[] retainedWeights = null;
        int column = 0;
        int weightSum = 0;
        int nextWeightSum = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          int guardRemainder = 85 % ((-2 - obfuscationGuard) / 62);
          oldColumnCount = this.columnEnds != null ? this.columnEnds.length : 0;
          newColumnCount = weights.length;
          this.columnEnds = weights;
          retainedWeights = weights;
          column = 0;
          weightSum = 0;
          while (retainedWeights.length > column) {
            nextWeightSum = weightSum + retainedWeights[column];
            weightSum = nextWeightSum;
            retainedWeights[column] = nextWeightSum;
            column++;
          }
          this.resizeChildColumns(oldColumnCount, newColumnCount, -20410);
          this.resizeFlagColumns(true, oldColumnCount, newColumnCount);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ob.B(" + obfuscationGuard + ',' + (weights != null ? "{...}" : "null") + ')');
        }
    }

    final static String j(int param0) {
        if (param0 != -129) {
          heldPointerButton = -78;
        }
        return TextFieldValidator.field_f;
    }

    static {
        field_P = "Holding your chosen god's standard high, order your forces into battle. For here, upon these bloodstained battlefields, will the armies of Gielinor wage war.";
        heldPointerButton = 0;
        field_O = "Game";
    }
}
