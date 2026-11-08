/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GridWidgetContainer extends ArrayWidgetContainer {
    private int[] columnBoundaries;
    private int[] cellLayoutFlags;
    int field_K;
    static MusicTrack field_B;
    private int nextCellIndex;
    private int[] rowBoundaries;
    static int livesRemaining;
    static String errorConnectingToServerText;
    private int cellPaddingY;
    private int cellPaddingX;

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onKey(root, character, (byte) 19, keyCode)) {
            return true;
          }
          var5_int = keyCode;
          if (var5_int == 98) {
            stackIn_10_0 = this.focusPreviousByStride((byte) -128, root, this.columnBoundaries.length);
            return stackIn_10_0;
          }
          if (99 == var5_int) {
            stackIn_12_0 = this.focusNextByStride(root, (byte) -99, this.columnBoundaries.length);
            return stackIn_12_0;
          }
          if (var5_int == 96) {
            stackIn_14_0 = this.focusPrevious(root, (byte) 113);
            return stackIn_14_0;
          }
          if (97 == var5_int) {
            stackIn_16_0 = this.focusNext((byte) -17, root);
            return stackIn_16_0;
          }
          if (guard >= 9) {
            return false;
          }
          this.columnBoundaries = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("nd.KA(");
          if (root == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    private final void setColumnWeights(byte guard, int[] weights) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var3_int = null == this.columnBoundaries ? 0 : this.columnBoundaries.length;
        if (guard != 50) {
          return;
        }
        try {
          var4 = weights.length;
          this.columnBoundaries = weights;
          var5 = weights;
          var6 = 0;
          var7 = 0;
          while (var6 < var5.length) {
            dupTemp$0 = var7 + var5[var6];
            var7 = dupTemp$0;
            var5[var6] = dupTemp$0;
            var6++;
          }
          this.resizeChildColumns(-1, var4, var3_int);
          this.resizeLayoutColumns(var4, 0, var3_int);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nd.V(" + guard + ',' + (weights != null ? "{...}" : "null") + ')');
        }
    }

    GridWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_K = 92;
        this.nextCellIndex = 0;
        try {
          var10 = new int[param5];
          int[] var8 = var10;
          la.a(var10, 0, param5, 1);
          var9 = new int[param6];
          la.a(var9, 0, param6, 1);
          this.setColumnWeights((byte) 50, var10);
          this.setRowWeights(-7170, var9);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        super.setBounds(121, newX, newY, newHeight, newWidth);
        int var6 = -72 % ((guard - 28) / 63);
    }

    final static byte[] decompressContainer(int guard, byte[] containerBytes) {
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(containerBytes);
          var3 = var9.readUnsignedByte(-31302);
          var4 = var9.readInt(true);
          if (0 <= var4 && (bn.field_R == 0 ||
            !(bn.field_R < var4))) {
            if (~var3 == guard) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.readBytes(var12, var4, 0, (byte) -119);
              stackIn_7_0 = var5_ref_byte__;
              return stackIn_7_0;
            }
            var5 = var9.readInt(true);
            if (var5 >= 0 && (bn.field_R == 0 ||
              !(bn.field_R < var5))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (var3 == 1) {
                Bzip2Decompressor.decompress(var13, var5, containerBytes, var4, 9);
              } else {
                var7 = sb.gzipDecompressor;
                synchronized (var7) {
                  sb.gzipDecompressor.decompress(var13, (byte) -104, var9);
                }
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("nd.M(").append(guard).append(',');
          if (containerBytes == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void resizeLayoutRows(byte guard, int newRows, int oldRows) {
        int var4 = this.columnBoundaries == null ? 0 : this.columnBoundaries.length;
        int[] var5 = new int[var4 * newRows];
        int var6 = -78 % ((guard - 0) / 59);
        if (this.cellLayoutFlags != null && this.cellLayoutFlags.length > 0 && var5.length > 0 &&
          oldRows > 0) {
          la.a(this.cellLayoutFlags, 0, var5, 0, Math.min(oldRows, newRows) * var4);
        }
        this.cellLayoutFlags = var5;
    }

    final void setCellPadding(int guard, int paddingY, int paddingX) {
        this.cellPaddingX = paddingX;
        if (guard != -1) {
          return;
        }
        this.cellPaddingY = paddingY;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
          pl var4 = null;
          pl var5 = null;
          if (tm.field_a == null) {
            tm.field_a = CacheReferenceNode.field_t.a((byte) 71, ScrollPane.field_C, vp.field_a);
          }
          if (param0 > -33) {
            GridWidgetContainer.a((byte) 116, false);
          }
          if (tm.field_a.status == 0) {
            return false;
          }
          long dupTemp$0 = wq.a(-38);
          ArchiveCatalog.field_a = dupTemp$0;
          CacheReferenceNode.field_x = dupTemp$0;
          if (tm.field_a.status != 1) {
            kw.field_c = lr.field_b;
          } else {
            try {
              DisplayModeConfirmationDialog.field_O = new BufferedSocket((java.net.Socket) (tm.field_a.result), CacheReferenceNode.field_t);
              var4 = ig.field_a;
              var5 = var4;
              InwardSparkParticle.field_v.position = 0;
              var5.position = 0;
              li.field_r = param1 ? -2 : -1;
              vb.field_I = param1 ? -2 : -1;
              ContentTransitionDialog.field_Q = param1 ? -2 : -1;
              kw.field_c = gg.field_t;
              sb.a(s.field_o, 81, CacheReferenceNode.field_r, CacheIoRequest.field_v, InwardSparkParticle.field_v);
              MessageDialog.a(0, -1);
            } catch (IOException iOException) {
              kw.field_c = lr.field_b;
            }
          }
          tm.field_a = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_B = null;
        if (param0 != -16099) {
          return;
        }
        errorConnectingToServerText = null;
    }

    private final void resizeLayoutColumns(int newColumns, int guard, int oldColumns) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var4 = null == this.rowBoundaries ? 0 : this.rowBoundaries.length;
        int[] var5 = new int[newColumns * var4];
        if (null != this.cellLayoutFlags && 0 < this.cellLayoutFlags.length && var5.length > 0 &&
          0 < oldColumns) {
          for (var6 = 0; var6 < var4; var6++) {
            la.a(this.cellLayoutFlags, var6 * oldColumns, var5, newColumns * var6, Math.min(oldColumns, newColumns));
          }
        }
        this.cellLayoutFlags = var5;
        if (guard != 0) {
          this.resizeLayoutRows((byte) -53, 3, -113);
        }
    }

    final void layoutChildren(boolean guard) {
        int incrementValue$0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        UiWidget var5;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < this.children.length) {
          if (var3 < this.rowBoundaries.length) {
            var4 = 0;
            while (var2 < this.children.length) {
              if (var4 < this.columnBoundaries.length) {
                incrementValue$0 = var2;
                var2++;
                var5 = this.children[incrementValue$0];
                if (var5 != null) {
                  this.layoutCell(var5, var4, 0, var3);
                }
                var4++;
                continue;
              }
              break;
            }
            var3++;
            continue;
          }
          break;
        }
        if (guard) {
          this.field_K = -124;
        }
    }

    private final void resizeChildColumns(int guard, int newColumns, int oldColumns) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var4 = this.rowBoundaries != null ? this.rowBoundaries.length : 0;
        UiWidget[] var5 = new UiWidget[newColumns * var4];
        if (null != this.children &&
          this.children.length > 0 &&
          var5.length > 0 &&
          0 < oldColumns) {
          for (var6 = 0; var6 < var4; var6++) {
            la.a(this.children, oldColumns * var6, var5, newColumns * var6, Math.min(oldColumns, newColumns));
          }
        }
        this.children = var5;
        if (guard != -1) {
          UiWidget var8 = (UiWidget) null;
          this.appendCell(-101, 118, (UiWidget) null);
        }
    }

    final void appendCell(int layoutFlags, int guard, UiWidget widget) {
        int var4_int = 0;
        int var5 = 0;
        try {
          var4_int = this.nextCellIndex % this.columnBoundaries.length;
          var5 = this.nextCellIndex / this.columnBoundaries.length;
          this.cellLayoutFlags[this.nextCellIndex] = layoutFlags;
          this.children[this.nextCellIndex] = widget;
          if (guard != 0) {
            this.columnBoundaries = (int[]) null;
          }
          if (widget != null) {
            this.layoutCell(widget, var4_int, 0, var5);
          }
          this.nextCellIndex = this.nextCellIndex + 1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nd.O(" + layoutFlags + ',' + guard + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    private final void setRowWeights(int guard, int[] weights) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = this.rowBoundaries != null ? this.rowBoundaries.length : 0;
          var4 = weights.length;
          this.rowBoundaries = weights;
          var5 = weights;
          var6 = 0;
          var7 = 0;
          while (var6 < var5.length) {
            dupTemp$0 = var7 + var5[var6];
            var7 = dupTemp$0;
            var5[var6] = dupTemp$0;
            var6++;
          }
          this.resizeChildRows(var4, var3_int, guard ^ guard);
          this.resizeLayoutRows((byte) 87, var4, var3_int);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nd.N(" + guard + ',' + (weights != null ? "{...}" : "null") + ')');
        }
    }

    final boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -42) {
            var9 = (UiWidget) null;
            this.onPointerPressed((UiWidget) null, 107, -24, -6, 81, 67, -125);
          }
          stackIn_3_0 = super.onPointerPressed(root, -77, pointerY, button, parentX, pointerX, parentY);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nd.R(");
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    private final void resizeChildRows(int newRows, int oldRows, int guard) {
        int var4 = this.columnBoundaries == null ? 0 : this.columnBoundaries.length;
        UiWidget[] var5 = new UiWidget[newRows * var4];
        if (this.children != null &&
          this.children.length > 0 &&
          0 < var5.length &&
          oldRows > 0) {
          la.a(this.children, 0, var5, 0, var4 * Math.min(oldRows, newRows));
        }
        if (guard != 0) {
          this.resizeLayoutColumns(-38, 89, 107);
        }
        this.children = var5;
    }

    private final void layoutCell(UiWidget widget, int column, int guard, int row) {
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
        var20 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = this.columnBoundaries[this.columnBoundaries.length - 1];
          var6 = this.rowBoundaries[this.rowBoundaries.length - 1];
          if (guard >= column) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = this.columnBoundaries[column - 1];
          }
          var7 = stackIn_4_0 * this.width / var5_int;
          stackIn_6_0 = this.height;
          if (0 >= row) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = this.rowBoundaries[row - 1];
          }
          var8 = stackIn_6_0 * stackIn_7_1 / var6;
          var9 = this.columnBoundaries[column] * this.width / var5_int;
          var10 = this.rowBoundaries[row] * this.height / var6;
          var11 = row * this.columnBoundaries.length + column;
          var12 = this.cellLayoutFlags[var11] & 48;
          var13 = 192 & this.cellLayoutFlags[var11];
          var14 = widget.x;
          var15 = widget.y;
          var16 = widget.width;
          var17 = widget.height;
          if (var9 - var7 > var16 &&
            (this.cellLayoutFlags[var11] & 1) != 0) {
            var14Lifetime1 = var7;
            var16 = -var7 + var9;
          } else if (-var7 + var9 < var16 &&
            0 != (this.cellLayoutFlags[var11] & 4)) {
            var14Lifetime1 = var7;
            var16 = -var7 + var9;
          } else {
            if (16 != var12) {
              if (var12 == 32) {
                var14Lifetime1 = -var16 + var9;
              } else {
                var14Lifetime1 = var7;
              }
            } else {
              var14Lifetime1 = -var16 + var9 + var7 >> 1;
            }
          }
          if (var10 - var8 > var17 &&
            0 != (this.cellLayoutFlags[var11] & 2)) {
            var17 = var10 - var8;
            var15Lifetime1 = var8;
          } else if (-var8 + var10 < var17 &&
            (8 & this.cellLayoutFlags[var11]) != 0) {
            var15Lifetime1 = var8;
            var17 = var10 - var8;
          } else {
            if (var13 == 64) {
              var15Lifetime1 = -var17 + (var10 + var8) >> 1;
            } else {
              if (var13 != 128) {
                var15Lifetime1 = var8;
              } else {
                var15Lifetime1 = -var17 + var10;
              }
            }
          }
          var18 = this.cellPaddingX;
          var19 = this.cellPaddingY;
          widget.setBounds(-89, var14Lifetime1 + var18, var19 + var15Lifetime1, var17 - 2 * var19, -(2 * var18) + var16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("nd.EA(");
          if (widget == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(column).append(',').append(guard).append(',').append(row).append(')').toString());
        }
    }

    static {
        errorConnectingToServerText = "Error connecting to server. Please try using a different server.";
    }
}
