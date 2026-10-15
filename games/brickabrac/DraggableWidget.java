/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    static UiComponent field_K;
    private int dragOffsetY;
    static String field_J;
    private int originY;
    private int dragOffsetX;
    private int originX;
    static UiComponent field_N;
    private boolean returnToOrigin;
    private boolean childPressTakesPriority;

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.handlePointerPress(focusRoot, pointerX, parentX, parentY, button, pointerY, obfuscationGuard) ? 1 : 0;
          if (var8_int != 0 &&
            this.childPressTakesPriority) {
            return true;
          }
          if (!this.containsPoint(pointerY, parentY, parentX, obfuscationGuard ^ 3, pointerX)) {
            stackIn_9_0 = var8_int;
            return stackIn_9_0 != 0;
          }
          this.pressedButton = button;
          if (1 != button) {
            return true;
          }
          this.dragOffsetY = -parentY + (-this.y + pointerY);
          ByteArrayPoolHelpers.draggedWidget = this;
          this.dragOffsetX = -parentX - this.x + pointerX;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("dn.MA(");
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void populateCaretPositions(int obfuscationGuard, String text, TextLineLayout line, int extraSpaceAdvanceQ8, TextFont font) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          if (obfuscationGuard != 25293) {
            field_N = (UiComponent) null;
          }
          for (var7 = 1; var7 < text.length(); var7++) {
            var8 = text.charAt(var7);
            if (60 == var8) {
              var6 = line.caretX[0] + (var5_int >> 8) + font.measureText(text.substring(0, var7));
            }
            if (-1 != var6) {
              line.caretX[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + extraSpaceAdvanceQ8;
              }
              line.caretX[var7] = (var5_int >> 8) - (-line.caretX[0] - font.measureText(text.substring(0, var7 + 1))) - font.getAdvance((char) var8);
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dn.E(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (line == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(extraSpaceAdvanceQ8).append(',');
          if (font == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        super.a((byte) -39);
        this.child.setBounds(this.height, 0, 0, (byte) -119, this.width);
        if (param0 > -7) {
          DraggableWidget.g(1);
        }
        this.originX = this.x;
        this.originY = this.y;
    }

    private DraggableWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener, Widget child, boolean returnToOrigin, boolean childPressTakesPriority) {
        super(x, y, width, height, renderer, listener);
        this.originY = 2147483647;
        this.originX = 2147483647;
        try {
          this.returnToOrigin = returnToOrigin ? true : false;
          this.child = child;
          this.childPressTakesPriority = childPressTakesPriority ? true : false;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dn.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + (child != null ? "{...}" : "null") + ',' + returnToOrigin + ',' + childPressTakesPriority + ')');
        }
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        int stackIn_11_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.child instanceof FocusableWidget) ||
            ((FocusableWidget) (this.child)).enabled) &&
            1 == this.pressedButton) {
            var5_int = MusicPatch.pointerX - this.dragOffsetX - parentX;
            var6 = ResourcePreparationEntry.pointerY + (-this.dragOffsetY - parentY);
            if (this.x == var5_int &&
              var6 == this.y) {
              super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
              return;
            }
            this.y = var6;
            this.x = var5_int;
            if (this.listener instanceof WidgetDragListener) {
              ((WidgetDragListener) (this.listener)).onDragged((byte) -68, parentY, parentX, this);
            }
          } else {
            if (this.returnToOrigin) {
              if (this.x != this.originX) {
                var5_int = this.originX - this.x;
                stackIn_11_1 = this.x;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_14_2 = -1;
                  } else {
                    stackIn_14_2 = 1;
                  }
                } else {
                  stackIn_14_2 = var5_int >> 1;
                }
                this.x = stackIn_11_1 + stackIn_14_2;
              }
              if (this.originY != this.y) {
                var5_int = this.originY - this.y;
                stackIn_19_1 = this.y;
                if (2 >= Math.abs(var5_int)) {
                  if (var5_int <= 0) {
                    stackIn_22_2 = -1;
                  } else {
                    stackIn_22_2 = 1;
                  }
                } else {
                  stackIn_22_2 = var5_int >> 1;
                }
                this.y = stackIn_19_1 + stackIn_22_2;
              }
            }
          }
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("dn.WA(");
          if (focusRoot == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_J = null;
        if (param0 != 1) {
          DraggableWidget.g(-43);
        }
        field_N = null;
        field_K = null;
    }

    final static TextWidgetRenderer g(int param0) {
        if (param0 != -23009) {
          field_J = (String) null;
        }
        if (CappedUrlRequest.field_e == null) {
          CappedUrlRequest.field_e = new TextWidgetRenderer(QuickChatMenu.field_Yb, 20, 0, 0, 0, 11579568, -1, 0, 0, QuickChatMenu.field_Yb.ascent, -1, 2147483647, true);
        }
        return CappedUrlRequest.field_e;
    }

    final void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        try {
          super.handlePointerRelease(pointerY, pointerX, parentY, focusRoot, obfuscationGuard, parentX);
          this.pressedButton = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dn.GA(" + pointerY + ',' + pointerX + ',' + parentY + ',' + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ')');
        }
    }

    final static void requestSpectateGame(int gameId, int obfuscationGuard, int opcode) {
        int guardArithmetic = -51 / ((-23 - obfuscationGuard) / 62);
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.writeByte(-100, 3);
        packet.writeByte(-15, 10);
        packet.writeShort((byte) 122, gameId);
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, 1595637992, param0, param1)) {
            this.a(param1, param0, 0, param3);
            this.a(param3, true, param1, param0);
            discarded$64 = param3.append(" revert=").append(this.returnToOrigin);
            if (this.originX != 2147483647 &&
              this.originY != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.originX).append(',').append(this.originY);
            }
          }
          if (param2 != 24) {
            var6 = (StringBuilder) null;
            this.a(-94, (Hashtable) null, 17, (StringBuilder) null);
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("dn.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_J = "<%0> is already on your ignore list.";
    }
}
