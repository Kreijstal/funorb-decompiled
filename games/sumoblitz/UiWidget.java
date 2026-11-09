/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    String tooltip;
    boolean hovered;
    int width;
    int textOffsetY;
    TextLayout textLayout;
    int y;
    int height;
    String text;
    int textOffsetX;
    WidgetListener listener;
    int x;
    int pressedButton;
    WidgetRenderer renderer;

    final void render(int parentY, int parentX, boolean guard) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var4 = this.maxRenderLayer(93);
        var5_int = 0;
        while (var5_int <= var4) {
          this.renderLayer(parentX, parentY, (byte) -110, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = CachedTextLayout.e(102);
        if (var5 != null) {
          HardwareTurbulentWaterNoise.field_x.a(GraphicsHeap.field_k, 13421772, VertexLayout.field_b, var5);
        }
        if (!guard) {
          return;
        }
        this.textOffsetX = 113;
    }

    void onPointerReleased(UiWidget root, boolean guard, int parentX, int pointerY, int pointerX, int parentY) {
        try {
          this.pressedButton = 0;
          if (guard) {
            this.height = 20;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pk.T(" + (root != null ? "{...}" : "null") + ',' + guard + ',' + parentX + ',' + pointerY + ',' + pointerX + ',' + parentY + ')');
        }
    }

    final static Class resolvePrimitiveOrNamedClass(byte guard, String descriptorOrClassName) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (descriptorOrClassName.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (descriptorOrClassName.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (descriptorOrClassName.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (descriptorOrClassName.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (descriptorOrClassName.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (descriptorOrClassName.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (descriptorOrClassName.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (guard != -24) {
            UiWidget.d((byte) -20);
          }
          if (!descriptorOrClassName.equals("C")) {
            return Class.forName(descriptorOrClassName);
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("pk.NB(").append(guard).append(',');
          if (descriptorOrClassName == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void refreshLayout(boolean guard) {
        this.setBounds(-57, this.x, this.y, this.height, this.width);
        if (guard) {
          this.tooltip = (String) null;
        }
    }

    StringBuilder appendDebugTree(int indent, Hashtable visited, StringBuilder output, int guard) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 0) {
            this.toString();
          }
          if (this.beginDebugDescription(indent, visited, -123, output)) {
            this.appendDebugDetails(indent, (byte) -128, output, visited);
          }
          stackIn_6_0 = (StringBuilder) (output);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pk.S(").append(indent).append(',');
          if (visited == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (output == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        this.width = newWidth;
        this.y = newY;
        int var6 = -104 % ((guard - 28) / 63);
        this.height = newHeight;
        this.x = newX;
    }

    void update(int parentX, int guard, UiWidget root, int parentY) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = 66 % ((-25 - guard) / 45);
          var6 = this.containsPoint(ko.field_p, -1, parentX, pi.field_e, parentY) ? 1 : 0;
          stackIn_3_0 = (this.hovered) ? 0 : 1;
          if (var6 != 0) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_11_1 = (var6 != 0);
            this.hovered = stackIn_11_1;
            if (this.listener != null &&
              this.listener instanceof WidgetHoverListener) {
              ((WidgetHoverListener) (this.listener)).onHoverChanged(103, var6 != 0, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("pk.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(parentY).append(')').toString());
        }
    }

    final boolean beginDebugDescription(int indent, Hashtable visited, int guard, StringBuilder output) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 110 / ((guard + 73) / 48);
          if (!visited.containsKey(this)) {
            visited.put(this, this);
            return true;
          }
          discarded$1 = output.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pk.PB(").append(indent).append(',');
          if (visited == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(',');
          if (output == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        if (vs.b((byte) 9)) {
          if (param0 >= -15) {
            UiWidget.d((byte) -33);
            return;
          }
          return;
        }
        Drone.field_g = GameApplet.c(-5204);
        if (null != Drone.field_g) {
          pd.a(Drone.field_g, 6, 5412);
          if (param0 >= -15) {
            UiWidget.d((byte) -33);
            return;
          }
          return;
        }
        if (param0 < -15) {
          return;
        }
        UiWidget.d((byte) -33);
    }

    final boolean dispatchPointerInput(int parentY, int parentX, boolean inputAvailable, int guard) {
        int var5;
        int var7;
        DraggableWidget var8;
        DraggableWidget var9;
        DraggableWidget var10;
        DraggableWidget var11;
        DraggableWidget var12;
        DraggableWidget var13;
        DraggableWidget var14;
        var7 = Sumoblitz.field_L ? 1 : 0;
        this.update(parentX, -71, this, parentY);
        var5 = this.hasFocus(guard ^ 0) ? 1 : 0;
        if (guard != -1) {
          this.textOffsetY = 102;
          if (!inputAvailable) {
            if (var5 != 0 &&
              0 != hk.field_c) {
              this.clearFocus((byte) 115);
            }
          } else {
            if (0 == OpenGlUnderwaterEffect.field_r) {
              if (hk.field_c != 0) {
                if (!this.onPointerPressed(this, guard ^ 80, jc.field_f, hk.field_c, parentX, nb.field_a, parentY)) {
                  if (var5 != 0) {
                    this.clearFocus((byte) -116);
                    if (var7 != 0) {
                      inputAvailable = false;
                    }
                  }
                } else {
                  inputAvailable = false;
                }
              }
              if (ar.field_G == 0 &&
                RidgedNoise3D.field_l != 0) {
                this.onPointerReleased(this, false, parentX, pi.field_e, ko.field_p, parentY);
                var8 = MessageDialog.field_gb;
                if (var8 != null) {
                  if (var8.listener instanceof WidgetDropListener) {
                    ((WidgetDropListener) (var8.listener)).onDrop(var8, (DropTargetWidget) null, 20302);
                  }
                  MessageDialog.field_gb = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  0 != hk.field_c) {
                  this.clearFocus((byte) 115);
                }
              }
            } else {
              if (var5 == 0) {
                if (hk.field_c != 0 &&
                  this.onPointerPressed(this, guard ^ 80, jc.field_f, hk.field_c, parentX, nb.field_a, parentY)) {
                  inputAvailable = false;
                }
                if (ar.field_G == 0 &&
                  RidgedNoise3D.field_l != 0) {
                  this.onPointerReleased(this, false, parentX, pi.field_e, ko.field_p, parentY);
                  var9 = MessageDialog.field_gb;
                  if (var9 != null) {
                    if (var9.listener instanceof WidgetDropListener) {
                      ((WidgetDropListener) (var9.listener)).onDrop(var9, (DropTargetWidget) null, 20302);
                    }
                    MessageDialog.field_gb = null;
                  }
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != hk.field_c) {
                    this.clearFocus((byte) 115);
                  }
                }
              } else {
                this.onMouseWheel(parentY, OpenGlUnderwaterEffect.field_r, -1, parentX, pi.field_e, this, ko.field_p);
                if (hk.field_c != 0) {
                  if (!this.onPointerPressed(this, guard ^ 80, jc.field_f, hk.field_c, parentX, nb.field_a, parentY)) {
                    this.clearFocus((byte) -116);
                    if (var7 != 0) {
                      inputAvailable = false;
                    }
                  } else {
                    inputAvailable = false;
                  }
                }
                if (ar.field_G == 0 &&
                  RidgedNoise3D.field_l != 0) {
                  this.onPointerReleased(this, false, parentX, pi.field_e, ko.field_p, parentY);
                  var10 = MessageDialog.field_gb;
                  if (var10 != null) {
                    if (var10.listener instanceof WidgetDropListener) {
                      ((WidgetDropListener) (var10.listener)).onDrop(var10, (DropTargetWidget) null, 20302);
                    }
                    MessageDialog.field_gb = null;
                  }
                  if (var7 != 0 &&
                    0 != hk.field_c) {
                    this.clearFocus((byte) 115);
                  }
                }
              }
            }
          }
        } else {
          regionExit1: {
            if (inputAvailable) {
              if (0 != OpenGlUnderwaterEffect.field_r &&
                var5 != 0) {
                this.onMouseWheel(parentY, OpenGlUnderwaterEffect.field_r, -1, parentX, pi.field_e, this, ko.field_p);
                if (hk.field_c != 0) {
                  if (!this.onPointerPressed(this, guard ^ 80, jc.field_f, hk.field_c, parentX, nb.field_a, parentY)) {
                    this.clearFocus((byte) -116);
                    if (var7 != 0) {
                      inputAvailable = false;
                    }
                  } else {
                    inputAvailable = false;
                  }
                }
                if (ar.field_G != 0) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                if (RidgedNoise3D.field_l == 0) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                this.onPointerReleased(this, false, parentX, pi.field_e, ko.field_p, parentY);
                var11 = MessageDialog.field_gb;
                if (var11 != null) {
                  if (!(var11.listener instanceof WidgetDropListener)) {
                    MessageDialog.field_gb = null;
                  } else {
                    ((WidgetDropListener) (var11.listener)).onDrop(var11, (DropTargetWidget) null, 20302);
                    MessageDialog.field_gb = null;
                  }
                }
                if (var7 == 0) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                if (0 == hk.field_c) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                this.clearFocus((byte) 115);
                RidgedNoise3D.field_l = ar.field_G;
                LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                return inputAvailable;
              }
              if (hk.field_c == 0) {
                if (ar.field_G != 0) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                if (RidgedNoise3D.field_l == 0) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                this.onPointerReleased(this, false, parentX, pi.field_e, ko.field_p, parentY);
                var12 = MessageDialog.field_gb;
                if (var12 == null) {
                  if (var7 == 0) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  if (var5 == 0) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  if (0 == hk.field_c) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  this.clearFocus((byte) 115);
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                if (!(var12.listener instanceof WidgetDropListener)) {
                  MessageDialog.field_gb = null;
                  if (var7 == 0) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  if (var5 == 0) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  if (0 == hk.field_c) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  this.clearFocus((byte) 115);
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                ((WidgetDropListener) (var12.listener)).onDrop(var12, (DropTargetWidget) null, 20302);
                MessageDialog.field_gb = null;
                if (var7 == 0) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                if (var5 == 0) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                if (0 == hk.field_c) {
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                this.clearFocus((byte) 115);
                RidgedNoise3D.field_l = ar.field_G;
                LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                return inputAvailable;
              }
              if (!this.onPointerPressed(this, guard ^ 80, jc.field_f, hk.field_c, parentX, nb.field_a, parentY)) {
                if (var5 == 0) {
                  if (ar.field_G != 0) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  if (RidgedNoise3D.field_l == 0) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  this.onPointerReleased(this, false, parentX, pi.field_e, ko.field_p, parentY);
                  var13 = MessageDialog.field_gb;
                  if (var13 == null) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  if (!(var13.listener instanceof WidgetDropListener)) {
                    MessageDialog.field_gb = null;
                    if (var7 != 0 &&
                      var5 != 0 &&
                      0 != hk.field_c) {
                      this.clearFocus((byte) 115);
                    }
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  ((WidgetDropListener) (var13.listener)).onDrop(var13, (DropTargetWidget) null, 20302);
                  MessageDialog.field_gb = null;
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                this.clearFocus((byte) -116);
                if (var7 != 0) {
                  inputAvailable = false;
                }
              } else {
                inputAvailable = false;
              }
              if (ar.field_G != 0) {
                break regionExit1;
              }
              if (RidgedNoise3D.field_l == 0) {
                break regionExit1;
              }
              this.onPointerReleased(this, false, parentX, pi.field_e, ko.field_p, parentY);
              var14 = MessageDialog.field_gb;
              if (var14 != null) {
                if (!(var14.listener instanceof WidgetDropListener)) {
                  MessageDialog.field_gb = null;
                  if (var7 != 0 &&
                    var5 != 0) {
                    if (0 == hk.field_c) {
                      RidgedNoise3D.field_l = ar.field_G;
                      LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                      return inputAvailable;
                    }
                    this.clearFocus((byte) 115);
                  }
                  RidgedNoise3D.field_l = ar.field_G;
                  LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                  return inputAvailable;
                }
                ((WidgetDropListener) (var14.listener)).onDrop(var14, (DropTargetWidget) null, 20302);
                MessageDialog.field_gb = null;
                if (var7 != 0 &&
                  var5 != 0) {
                  if (0 == hk.field_c) {
                    RidgedNoise3D.field_l = ar.field_G;
                    LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                    return inputAvailable;
                  }
                  this.clearFocus((byte) 115);
                }
                RidgedNoise3D.field_l = ar.field_G;
                LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                return inputAvailable;
              }
              if (var7 == 0) {
                break regionExit1;
              }
            }
            if (var5 != 0) {
              if (0 == hk.field_c) {
                RidgedNoise3D.field_l = ar.field_G;
                LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
                return inputAvailable;
              }
              this.clearFocus((byte) 115);
            }
          }
        }
        RidgedNoise3D.field_l = ar.field_G;
        LegacyOpenGlTexture3D.a(this.hoveredTooltip(-6696), -124);
        return inputAvailable;
    }

    boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -42) {
            return true;
          }
          if (!this.containsPoint(pointerX, -1, parentX, pointerY, parentY)) {
            return false;
          }
          this.pressedButton = button;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("pk.R(");
          if (root == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    boolean containsPoint(int pointerX, int guard, int parentX, int pointerY, int parentY) {
        boolean stackIn_18_0 = false;
        if (guard != -1) {
          this.renderLayer(-12, -50, (byte) 63, 31);
          if (this.x + parentX > pointerX) {
            return false;
          }
          if (this.y + parentY > pointerY) {
            return false;
          }
          if (pointerX >= this.width + this.x + parentX) {
            return false;
          }
          if (this.height + (parentY + this.y) <= pointerY) {
            return false;
          }
          return true;
        }
        if (this.x + parentX > pointerX) {
          return false;
        }
        if (this.y + parentY > pointerY) {
          return false;
        }
        stackIn_18_0 = (pointerX < this.width + this.x + parentX) && (this.height + (parentY + this.y) > pointerY);
        return stackIn_18_0;
    }

    boolean hasFocus(int guard) {
        if (guard != -1) {
          this.renderer = (WidgetRenderer) null;
          return false;
        }
        return false;
    }

    final void appendDebugDetails(int indent, byte guard, StringBuilder output, Hashtable visited) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          discarded$0 = output.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (guard != -128) {
            return;
          }
          if (this.text != null) {
            discarded$1 = output.append(" text=\"").append(this.text).append('"');
          }
          if (this.hovered) {
            discarded$2 = output.append(" mouseover");
          }
          if (this.hasFocus(-1)) {
            discarded$3 = output.append(" focused");
          }
          if (null != this.renderer) {
            discarded$4 = output.append(" renderer=");
            if (!(this.renderer instanceof UiWidget)) {
              discarded$5 = output.append(this.renderer);
              if (var6 != 0) {
                output = this.appendDebugTree(indent + 1, visited, output, 0);
              }
            } else {
              output = this.appendDebugTree(indent + 1, visited, output, 0);
            }
          }
          if (this.listener != null) {
            discarded$6 = output.append(" listener=");
            if (!(this.listener instanceof UiWidget)) {
              discarded$7 = output.append(this.listener);
              if (var6 == 0) {
                return;
              }
            }
            output = this.appendDebugTree(indent + 1, visited, output, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("pk.OB(").append(indent).append(',').append(guard).append(',');
          if (output == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (visited == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    boolean onMouseWheel(int parentY, int wheelDelta, int guard, int parentX, int pointerY, UiWidget root, int pointerX) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == -1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("pk.RA(").append(parentY).append(',').append(wheelDelta).append(',').append(guard).append(',').append(parentX).append(',').append(pointerY).append(',');
          if (root == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(pointerX).append(')').toString());
        }
    }

    public final String toString() {
        return this.appendDebugTree(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void renderLayer(int parentX, int parentY, byte guard, int layer) {
        UiWidget var6 = null;
        UiWidget var6Lifetime1;
        UiWidget var6Lifetime2;
        if (layer != 0) {
          if (guard < -35) {
            return;
          }
          var6 = (UiWidget) null;
          this.requestFocus((UiWidget) null, (byte) -58);
          return;
        }
        if (this.renderer == null) {
          if (guard < -35) {
            return;
          }
          var6Lifetime1 = (UiWidget) null;
          this.requestFocus((UiWidget) null, (byte) -58);
          return;
        }
        this.renderer.renderWidget(this, parentY, 5592405, true, parentX);
        if (guard < -35) {
          return;
        }
        var6Lifetime2 = (UiWidget) null;
        this.requestFocus((UiWidget) null, (byte) -58);
    }

    UiWidget(String param0, WidgetListener param1) {
        this(param0, HardwareTurbulentWaterNoise.field_x.field_e, param1);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 52) {
          return true;
        }
        return 0 != (param0 & 52) ? true : false;
    }

    boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 61) {
            return false;
          }
          this.toString();
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pk.Q(");
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    void clearFocus(byte guard) {
        int var2 = -25 / ((64 - guard) / 51);
    }

    int maxRenderLayer(int guard) {
        int var2 = -90 / ((-10 - guard) / 46);
        return 0;
    }

    final boolean dispatchKey(char character, int keyCode, boolean guard) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (!this.hasFocus(-1)) {
          if (!guard) {
            this.renderLayer(-3, -1, (byte) 78, -21);
            var4 = keyCode;
            if (var4 == 80) {
              return this.requestFocus(this, (byte) 61);
            }
            return false;
          }
          var4Lifetime3 = keyCode;
          if (var4Lifetime3 == 80) {
            return this.requestFocus(this, (byte) 61);
          }
          return false;
        }
        if (this.onKey(this, character, (byte) 108, keyCode)) {
          return true;
        }
        if (!guard) {
          this.renderLayer(-3, -1, (byte) 78, -21);
          var4Lifetime1 = keyCode;
          if (var4Lifetime1 == 80) {
            return this.requestFocus(this, (byte) 61);
          }
          return false;
        }
        var4Lifetime2 = keyCode;
        if (var4Lifetime2 == 80) {
          return this.requestFocus(this, (byte) 61);
        }
        return false;
    }

    boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > 9) {
            return false;
          }
          this.hovered = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("pk.KA(");
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    String hoveredTooltip(int guard) {
        if (guard == -6696) {
          return !this.hovered ? null : this.tooltip;
        }
        this.textOffsetY = -60;
        return !this.hovered ? null : this.tooltip;
    }

    protected UiWidget() {
        this.textOffsetY = 0;
        this.textOffsetX = 0;
    }

    UiWidget(String param0, WidgetRenderer param1, WidgetListener param2) {
        RuntimeException runtimeException = null;
        TextWidgetLayout var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.textOffsetY = 0;
        this.textOffsetX = 0;
        try {
          this.renderer = param1;
          this.text = param0;
          this.listener = param2;
          if (this.renderer instanceof TextWidgetLayout) {
            var4 = (TextWidgetLayout) ((Object) this.renderer);
            this.width = var4.measuredTextWidth(this, (byte) 83);
            this.height = var4.measuredTextHeight(this, (byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pk.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5) {
        this.textOffsetY = 0;
        this.textOffsetX = 0;
        try {
          this.x = param0;
          this.listener = param5;
          this.height = param3;
          this.renderer = param4;
          this.y = param1;
          this.width = param2;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
