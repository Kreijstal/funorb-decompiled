/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiComponent extends IntrusiveNode {
    UiListener listener;
    boolean hovered;
    TextLayout textLayout;
    int y;
    String text;
    int height;
    WidgetPainter painter;
    int field_n;
    int field_t;
    int x;
    static String field_m;
    int width;
    static String field_r;
    static pf field_o;
    static int[] field_h;
    static int[] field_w;
    String tooltip;
    int field_v;

    final boolean hitTest(int pointerX, int pointerY, int offsetX, byte guard, int offsetY) {
        if (guard < 57) {
          return false;
        }
        if (pointerX < this.x + offsetX) {
          return false;
        }
        if (offsetY + this.y > pointerY) {
          return false;
        }
        if (this.x + (offsetX + this.width) <= pointerX) {
          return false;
        }
        if (this.height + (offsetY + this.y) > pointerY) {
          return true;
        }
        return false;
    }

    final boolean handleKey(char character, int keyCode, byte guard) {
        if (!this.isFocused(0)) {
          int var4 = keyCode;
          if (var4 == 80) {
            return this.focusNext(-4659, this);
          }
          if (guard < -106) {
            return false;
          }
          this.hitTest(44, -93, 57, (byte) 126, 65);
          return false;
        }
        if (this.onFocusedKey(this, character, keyCode, 23)) {
          return true;
        }
        int var4Lifetime1 = keyCode;
        if (var4Lifetime1 == 80) {
          return this.focusNext(-4659, this);
        }
        if (guard < -106) {
          return false;
        }
        this.hitTest(44, -93, 57, (byte) 126, 65);
        return false;
    }

    final boolean handlePointerFrame(boolean inputAvailable, byte guard, int offsetY, int offsetX) {
        int var7 = EscapeVector.obfuscationControl;
        this.updateHover(-14472, offsetX, offsetY, this);
        if (guard == -33) {
          boolean var5 = (this.isFocused(0));
          if (!inputAvailable) {
            if (var5 &&
              0 != qi.field_N) {
              this.clearFocus(84);
            }
            bb.field_H = DialWidget.field_K;
            MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
            return inputAvailable;
          }
          if (mg.field_f != 0 &&
            var5) {
            this.onMouseWheel(offsetX, mg.field_f, (byte) -109, UiContainer.field_y, dh.field_d, this, offsetY);
          }
          if (qi.field_N == 0) {
            if (0 != DialWidget.field_K) {
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            if (bb.field_H == 0) {
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
            DraggableWidget var9 = gf.field_b;
            if (var9 != null) {
              if (var9.listener instanceof WidgetDropListener) {
                ((WidgetDropListener) (var9.listener)).onDropped((DropTargetWidget) null, var9, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5 &&
              0 != qi.field_N) {
              this.clearFocus(84);
            }
            bb.field_H = DialWidget.field_K;
            MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
            return inputAvailable;
          }
          regionExit1: {
            if (this.onPointerPressed(offsetX, sf.field_c, (byte) 3, ng.field_ob, offsetY, this, qi.field_N)) {
              inputAvailable = false;
              if (var7 == 0) {
                break regionExit1;
              }
            }
            if (!var5) {
              if (0 != DialWidget.field_K) {
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              if (bb.field_H == 0) {
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
              DraggableWidget var10 = gf.field_b;
              if (var10 != null) {
                if (!(var10.listener instanceof WidgetDropListener)) {
                  gf.field_b = null;
                } else {
                  ((WidgetDropListener) (var10.listener)).onDropped((DropTargetWidget) null, var10, (byte) -124);
                  gf.field_b = null;
                }
              }
              if (var7 != 0 &&
                var5 &&
                0 != qi.field_N) {
                this.clearFocus(84);
              }
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            this.clearFocus(122);
          }
          if (0 != DialWidget.field_K) {
            bb.field_H = DialWidget.field_K;
            MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
            return inputAvailable;
          }
          if (bb.field_H == 0) {
            bb.field_H = DialWidget.field_K;
            MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
            return inputAvailable;
          }
          this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
          DraggableWidget var11 = gf.field_b;
          if (var11 != null) {
            if (var11.listener instanceof WidgetDropListener) {
              ((WidgetDropListener) (var11.listener)).onDropped((DropTargetWidget) null, var11, (byte) -124);
            }
            gf.field_b = null;
          }
          if (var7 != 0 &&
            var5 &&
            0 != qi.field_N) {
            this.clearFocus(84);
          }
          bb.field_H = DialWidget.field_K;
          MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
          return inputAvailable;
        }
        UiComponent var8 = (UiComponent) null;
        this.focusNext(1, (UiComponent) null);
        boolean var5Lifetime1 = (this.isFocused(0));
        if (inputAvailable) {
          if (mg.field_f == 0) {
            if (qi.field_N == 0) {
              if (0 != DialWidget.field_K) {
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              if (bb.field_H == 0) {
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
              DraggableWidget var12 = gf.field_b;
              if (var12 != null) {
                if (var12.listener instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var12.listener)).onDropped((DropTargetWidget) null, var12, (byte) -124);
                }
                gf.field_b = null;
              }
              if (var7 != 0 &&
                var5Lifetime1 &&
                0 != qi.field_N) {
                this.clearFocus(84);
              }
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            regionExit2: {
              if (this.onPointerPressed(offsetX, sf.field_c, (byte) 3, ng.field_ob, offsetY, this, qi.field_N)) {
                inputAvailable = false;
                if (var7 == 0) {
                  break regionExit2;
                }
              }
              if (!var5Lifetime1) {
                if (0 != DialWidget.field_K) {
                  bb.field_H = DialWidget.field_K;
                  MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                  return inputAvailable;
                }
                if (bb.field_H == 0) {
                  bb.field_H = DialWidget.field_K;
                  MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                  return inputAvailable;
                }
                this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
                DraggableWidget var13 = gf.field_b;
                if (var13 != null) {
                  if (!(var13.listener instanceof WidgetDropListener)) {
                    gf.field_b = null;
                  } else {
                    ((WidgetDropListener) (var13.listener)).onDropped((DropTargetWidget) null, var13, (byte) -124);
                    gf.field_b = null;
                  }
                }
                if (var7 != 0 &&
                  var5Lifetime1 &&
                  0 != qi.field_N) {
                  this.clearFocus(84);
                }
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              this.clearFocus(122);
            }
            if (0 != DialWidget.field_K) {
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            if (bb.field_H == 0) {
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
            DraggableWidget var14 = gf.field_b;
            if (var14 != null) {
              if (var14.listener instanceof WidgetDropListener) {
                ((WidgetDropListener) (var14.listener)).onDropped((DropTargetWidget) null, var14, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5Lifetime1 &&
              0 != qi.field_N) {
              this.clearFocus(84);
            }
            bb.field_H = DialWidget.field_K;
            MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
            return inputAvailable;
          }
          if (var5Lifetime1) {
            this.onMouseWheel(offsetX, mg.field_f, (byte) -109, UiContainer.field_y, dh.field_d, this, offsetY);
          }
          if (qi.field_N == 0) {
            if (0 != DialWidget.field_K) {
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            if (bb.field_H == 0) {
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
            DraggableWidget var15 = gf.field_b;
            if (var15 != null) {
              if (var15.listener instanceof WidgetDropListener) {
                ((WidgetDropListener) (var15.listener)).onDropped((DropTargetWidget) null, var15, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5Lifetime1 &&
              0 != qi.field_N) {
              this.clearFocus(84);
            }
            bb.field_H = DialWidget.field_K;
            MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
            return inputAvailable;
          }
          regionExit3: {
            if (this.onPointerPressed(offsetX, sf.field_c, (byte) 3, ng.field_ob, offsetY, this, qi.field_N)) {
              inputAvailable = false;
              if (var7 == 0) {
                break regionExit3;
              }
            }
            if (!var5Lifetime1) {
              if (0 != DialWidget.field_K) {
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              if (bb.field_H == 0) {
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
              DraggableWidget var16 = gf.field_b;
              if (var16 == null) {
                if (var7 == 0) {
                  bb.field_H = DialWidget.field_K;
                  MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                  return inputAvailable;
                }
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              if (!(var16.listener instanceof WidgetDropListener)) {
                gf.field_b = null;
                if (var7 != 0 &&
                  var5Lifetime1 &&
                  0 != qi.field_N) {
                  this.clearFocus(84);
                }
                bb.field_H = DialWidget.field_K;
                MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
                return inputAvailable;
              }
              ((WidgetDropListener) (var16.listener)).onDropped((DropTargetWidget) null, var16, (byte) -124);
              gf.field_b = null;
              if (var7 != 0 &&
                var5Lifetime1 &&
                0 != qi.field_N) {
                this.clearFocus(84);
              }
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            this.clearFocus(122);
          }
          if (0 == DialWidget.field_K) {
            if (bb.field_H == 0) {
              bb.field_H = DialWidget.field_K;
              MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
              return inputAvailable;
            }
            this.onPointerReleased(UiContainer.field_y, offsetY, dh.field_d, offsetX, this, (byte) -113);
            DraggableWidget var17 = gf.field_b;
            if (var17 != null) {
              if (var17.listener instanceof WidgetDropListener) {
                ((WidgetDropListener) (var17.listener)).onDropped((DropTargetWidget) null, var17, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5Lifetime1 &&
              0 != qi.field_N) {
              this.clearFocus(84);
            }
            bb.field_H = DialWidget.field_K;
            MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
            return inputAvailable;
          }
        } else if (var5Lifetime1 &&
          0 != qi.field_N) {
          this.clearFocus(84);
          bb.field_H = DialWidget.field_K;
          MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
          return inputAvailable;
        }
        bb.field_H = DialWidget.field_K;
        MarkerSliderPainter.updateHoverText((byte) -112, this.getTooltip(1));
        return inputAvailable;
    }

    final void refreshLayout(int guard) {
        this.setBounds(this.width, this.y, this.x, true, this.height);
        if (guard != 0) {
          this.hovered = true;
        }
    }

    final void render(int screenX, int screenY, byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        int var4 = this.maximumRenderLayer(12050);
        int var5_int = -73 / ((8 - guard) / 59);
        int var6 = 0;
        while (var4 >= var6) {
          this.drawLayer(screenY, (byte) 88, var6, screenX);
          var6++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        String var5 = eo.a((byte) 46);
        if (var5 != null) {
          mb.field_g.drawTooltip((byte) -44, var5, DraggableWidget.field_O, ci.field_g);
        }
    }

    boolean onMouseWheel(int offsetX, int rotation, byte guard, int pointerY, int pointerX, UiComponent root, int offsetY) {
        String stackIn_7_2 = null;
        try {
          if (guard < -103) {
            return false;
          }
          field_r = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var8;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hm.JA(").append(offsetX).append(',').append(rotation).append(',').append(guard).append(',').append(pointerY).append(',').append(pointerX).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(offsetY).append(')').toString());
        }
    }

    public final String toString() {
        return this.appendDebugTree(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void onPointerReleased(int pointerY, int offsetY, int pointerX, int offsetX, UiComponent root, byte guard) {
        try {
          int var7_int = -66 / ((-39 - guard) / 45);
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hm.MA(" + pointerY + ',' + offsetY + ',' + pointerX + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    UiComponent(String param0, UiListener param1) {
        this(param0, mb.field_g.componentPainter, param1);
    }

    StringBuilder appendDebugTree(int guard, Hashtable visited, StringBuilder output, int depth) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (guard != 0) {
            this.field_t = 15;
          }
          if (this.beginDebugDescription(depth, visited, output, false)) {
            this.appendDebugBody(visited, output, depth, guard + 1);
          }
          StringBuilder stackIn_6_0 = (StringBuilder) (output);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hm.AA(").append(guard).append(',');
          if (visited == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (output == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(depth).append(')').toString());
        }
    }

    boolean focusNext(int guard, UiComponent root) {
        String stackIn_7_2 = null;
        try {
          if (guard == -4659) {
            return false;
          }
          this.isFocused(1);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hm.M(").append(guard).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_o = null;
        if (guard == 58) {
          field_r = null;
          field_m = null;
          field_h = null;
          field_w = null;
          return;
        }
        UiComponent.g(80);
        field_r = null;
        field_m = null;
        field_h = null;
        field_w = null;
    }

    void clearFocus(int guard) {
        if (guard <= 46) {
          this.toString();
        }
    }

    boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_8_2 = null;
        try {
          if (guard >= 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("hm.G(");
          if (root == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    int maximumRenderLayer(int guard) {
        if (guard != 12050) {
          this.listener = (UiListener) null;
          return 0;
        }
        return 0;
    }

    String getTooltip(int guard) {
        if (guard != 1) {
          return (String) null;
        }
        if (!this.hovered) {
          return null;
        }
        return this.tooltip;
    }

    void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (guard < 85) {
          field_r = (String) null;
          if (layer != 0) {
            return;
          }
          if (this.painter != null) {
            this.painter.drawWidget(screenX, screenY, -88, this, true);
            return;
          }
          return;
        }
        if (layer != 0) {
          return;
        }
        if (this.painter != null) {
          this.painter.drawWidget(screenX, screenY, -88, this, true);
          return;
        }
    }

    final void appendDebugBody(Hashtable visited, StringBuilder output, int depth, int guard) {
        StringBuilder discarded$5 = null;
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          StringBuilder discarded$0 = output.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (null != this.text) {
            StringBuilder discarded$1 = output.append(" text=\"").append(this.text).append('"');
          }
          if (this.hovered) {
            StringBuilder discarded$2 = output.append(" mouseover");
          }
          if (this.isFocused(guard ^ guard)) {
            StringBuilder discarded$3 = output.append(" focused");
          }
          if (null != this.painter) {
            StringBuilder discarded$4 = output.append(" renderer=");
            if (this.painter instanceof UiComponent) {
              output = this.appendDebugTree(0, visited, output, 1 + depth);
              if (var6 != 0) {
                discarded$5 = output.append(this.painter);
              }
            } else {
              discarded$5 = output.append(this.painter);
            }
          }
          if (null != this.listener) {
            StringBuilder discarded$6 = output.append(" listener=");
            if (!(this.listener instanceof UiComponent)) {
              StringBuilder discarded$7 = output.append(this.listener);
              if (var6 != 0) {
                output = this.appendDebugTree(guard - 1, visited, output, 1 + depth);
              }
            } else {
              output = this.appendDebugTree(guard - 1, visited, output, 1 + depth);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var5;
          StringBuilder stackIn_22_1 = new StringBuilder().append("hm.HB(");
          if (visited == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (output == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(depth).append(',').append(guard).append(')').toString());
        }
    }

    final boolean beginDebugDescription(int depth, Hashtable visited, StringBuilder output, boolean guard) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (guard) {
            this.toString();
          }
          if (!visited.containsKey(this)) {
            visited.put(this, this);
            return true;
          }
          StringBuilder discarded$1 = output.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hm.FB(").append(depth).append(',');
          if (visited == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (output == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    boolean isFocused(int guard) {
        if (guard != 0) {
          return true;
        }
        return false;
    }

    boolean onPointerPressed(int offsetY, int pointerX, byte guard, int pointerY, int offsetX, UiComponent root, int button) {
        String stackIn_10_2 = null;
        try {
          if (this.hitTest(pointerX, pointerY, offsetX, (byte) 105, offsetY)) {
            this.field_t = button;
          }
          if (guard != 3) {
            this.clearFocus(99);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var8;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hm.V(").append(offsetY).append(',').append(pointerX).append(',').append(guard).append(',').append(pointerY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(button).append(')').toString());
        }
    }

    void setBounds(int width, int y, int x, boolean guard, int height) {
        if (guard) {
          this.x = x;
          this.height = height;
          this.y = y;
          this.width = width;
          return;
        }
        UiComponent var7 = (UiComponent) null;
        this.onPointerPressed(-63, -124, (byte) 29, -14, 125, (UiComponent) null, -5);
        this.x = x;
        this.height = height;
        this.y = y;
        this.width = width;
    }

    void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        int stackIn_5_1 = 0;
        String stackIn_18_2 = null;
        try {
          if (guard != -14472) {
            return;
          }
          boolean var5_int = (this.hitTest(dh.field_d, UiContainer.field_y, offsetX, (byte) 70, offsetY));
          boolean stackIn_4_0 = this.hovered;
          stackIn_5_1 = ((var5_int)) ? (0) : (1);
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            boolean stackIn_10_1 = ((var5_int));
            this.hovered = stackIn_10_1;
            if (this.listener != null) {
              if (!(this.listener instanceof WidgetHoverListener)) {
                return;
              }
              ((WidgetHoverListener) (this.listener)).onHoverChanged(this, -27200, (var5_int));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("hm.Q(").append(guard).append(',').append(offsetY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 != 11187) {
          return false;
        }
        return IsaacRandom.field_d == null ? ObjectSpriteSet.field_b : true;
    }

    protected UiComponent() {
        this.field_n = 0;
        this.field_v = 0;
    }

    UiComponent(String param0, WidgetPainter param1, UiListener param2) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        this.field_n = 0;
        this.field_v = 0;
        try {
          this.painter = param1;
          this.listener = param2;
          this.text = param0;
          if (this.painter instanceof WidgetTextLayout) {
            WidgetTextLayout var4 = (WidgetTextLayout) ((Object) this.painter);
            this.width = var4.preferredWidth((byte) -46, this);
            this.height = var4.preferredHeight(-127, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hm.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    UiComponent(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5) {
        this.field_n = 0;
        this.field_v = 0;
        try {
          this.width = param2;
          this.x = param0;
          this.painter = param4;
          this.listener = param5;
          this.y = param1;
          this.height = param3;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Suggested names: ";
        field_r = "FROM ONLY";
        field_w = new int[8192];
        field_h = new int[8192];
    }
}
