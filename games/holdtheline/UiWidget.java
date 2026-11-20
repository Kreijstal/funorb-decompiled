/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    static ResourceArchive field_w;
    static SpriteAsset field_j;
    int field_y;
    boolean hovered;
    String tooltip;
    static SpriteAsset field_r;
    WidgetListener listener;
    int y;
    TextLayout textLayout;
    int height;
    WidgetRenderer renderer;
    static String field_s;
    int x;
    int pressedButton;
    int width;
    int field_m;
    String text;
    static volatile long field_n;

    final boolean containsPoint(int param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param1 != -105) {
          this.toString();
          if (this.x + param0 > param2) {
            return false;
          }
          if (param3 + this.y > param4) {
            return false;
          }
          if (param2 >= this.width + this.x + param0) {
            return false;
          }
          if (param4 >= this.height + this.y + param3) {
            return false;
          }
          return true;
        }
        if (this.x + param0 > param2) {
          return false;
        }
        if (param3 + this.y > param4) {
          return false;
        }
        stackIn_18_0 = (param2 < this.width + this.x + param0) && (param4 < this.height + this.y + param3);
        return stackIn_18_0;
    }

    void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 122) {
          this.y = param2;
          this.height = param3;
          this.width = param4;
          this.x = param0;
          return;
        }
        this.getMaxLayer((byte) -120);
        this.y = param2;
        this.height = param3;
        this.width = param4;
        this.x = param0;
    }

    final boolean dispatchKey(int param0, char param1, byte param2) {
        int var5 = 0;
        int var4 = 111 % ((57 - param2) / 45);
        int var5Lifetime1;
        if (!this.isFocused((byte) -20)) {
          var5 = param0;
          if (var5 == 80) {
            return this.requestFocus(this, -25823);
          }
          return false;
        }
        if (this.handleKeyPress(this, param0, (byte) -78, param1)) {
          return true;
        }
        var5Lifetime1 = param0;
        if (var5Lifetime1 == 80) {
          return this.requestFocus(this, -25823);
        }
        return false;
    }

    boolean handleScrollInput(int param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 == -24898) {
            return false;
          }
          field_w = (ResourceArchive) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("n.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean isFocused(byte param0) {
        if (param0 != -20) {
          return false;
        }
        return false;
    }

    int getMaxLayer(byte param0) {
        if (param0 >= -66) {
          this.field_y = 63;
          return 0;
        }
        return 0;
    }

    void handleMouseRelease(int param0, UiWidget param1, int param2, int param3, byte param4, int param5) {
        try {
          this.pressedButton = 0;
          if (param4 != -9) {
            this.text = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "n.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 25) {
          return;
        }
        field_w = null;
        field_j = null;
        field_r = null;
        field_s = null;
    }

    String getTooltip(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (!this.hovered) {
          return null;
        }
        return this.tooltip;
    }

    UiWidget(String param0, WidgetListener param1) {
        this(param0, MenuList.field_b.field_r, param1);
    }

    void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPoint(param0, (byte) -105, NodeHashTableIterator.field_g, param2, FullscreenErrorDialog.field_X) ? 1 : 0;
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (stackIn_3_0 == (this.hovered ? 1 : 0)) {
            stackIn_8_1 = (var5_int != 0);
            this.hovered = stackIn_8_1;
            if (this.listener != null &&
              this.listener instanceof HoverListener) {
              ((HoverListener) (this.listener)).onHoverChanged(this, (byte) 118, var5_int != 0);
            }
          }
          if (param3 != -3) {
            this.tooltip = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("n.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugVisit(20720, param2, param3, param0)) {
            this.appendDebugProperties(param2, param0, true, param3);
          }
          var5_int = 127 / ((param1 - 0) / 49);
          stackIn_3_0 = (StringBuilder) (param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("n.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    void clearFocus(int param0) {
        if (param0 <= 15) {
          this.x = 102;
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        if (param0 != -9532) {
          field_r = (SpriteAsset) null;
          if (param3 == 0) {
            if (null != this.renderer) {
              this.renderer.drawWidget(true, param2, -67, this, param1);
            }
            return;
          }
          return;
        }
        if (param3 != 0) {
          return;
        }
        if (null != this.renderer) {
          this.renderer.drawWidget(true, param2, -67, this, param1);
          return;
        }
    }

    boolean handleMousePress(int param0, int param1, int param2, UiWidget param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -108) {
            this.width = -39;
          }
          if (!this.containsPoint(param0, (byte) -105, param5, param2, param1)) {
            return false;
          }
          this.pressedButton = param6;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("n.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void draw(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        String var5Lifetime1;
        var6 = HoldTheLine.field_D;
        var4 = this.getMaxLayer((byte) -110);
        var5_int = 0;
        while (true) {
          if (var4 < var5_int) {
            if (param0 != -81) {
              return;
            }
            var5 = DiskCacheWorker.a(100);
            if (var5 == null) {
              return;
            }
            MenuList.field_b.drawTooltip(7829367, var5, ArchiveLoadProgress.field_e, AgeValidator.field_l);
            return;
          }
          this.drawLayer(-9532, param1, param2, var5_int);
          var5_int++;
          if (var6 != 0) {
            var5Lifetime1 = DiskCacheWorker.a(100);
            if (var5Lifetime1 == null) {
              return;
            }
            MenuList.field_b.drawTooltip(7829367, var5Lifetime1, ArchiveLoadProgress.field_e, AgeValidator.field_l);
            return;
          }
        }
    }

    final boolean beginDebugVisit(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20720) {
            this.x = 91;
          }
          if (param1.containsKey(this)) {
            discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param1.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("n.FC(").append(param0).append(',');
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean processInput(int param0, int param1, boolean param2, boolean param3) {
        int var5;
        int var7;
        DraggableWidget var8;
        DraggableWidget var9;
        DraggableWidget var10;
        DraggableWidget var11;
        DraggableWidget var12;
        DraggableWidget var13;
        var7 = HoldTheLine.field_D;
        this.updateHover(param0, this, param1, (byte) -3);
        var5 = this.isFocused((byte) -20) ? 1 : 0;
        if (param2) {
          if (LoginForm.field_T != 0 &&
            var5 != 0) {
            this.handleScrollInput(param0, this, LoginForm.field_T, param1, FullscreenErrorDialog.field_X, NodeHashTableIterator.field_g, -24898);
          }
          if (ValidationIndicator.field_J == 0) {
            if (0 == RoadStripRenderer.field_f &&
              0 != DialogLayer.field_L) {
              this.handleMouseRelease(NodeHashTableIterator.field_g, this, param1, param0, (byte) -9, FullscreenErrorDialog.field_X);
              var8 = LayeredButtonRenderer.field_q;
              if (var8 != null) {
                if (var8.listener instanceof DropListener) {
                  ((DropListener) (var8.listener)).onDrop(var8, (byte) -3, (DropTargetWidget) null);
                }
                LayeredButtonRenderer.field_q = null;
              }
            }
          } else {
            if (!this.handleMousePress(param0, ValidatedTextField.field_U, param1, this, (byte) -108, TrackBoundary.field_x, ValidationIndicator.field_J)) {
              if (var5 == 0) {
                if (0 == RoadStripRenderer.field_f &&
                  0 != DialogLayer.field_L) {
                  this.handleMouseRelease(NodeHashTableIterator.field_g, this, param1, param0, (byte) -9, FullscreenErrorDialog.field_X);
                  var9 = LayeredButtonRenderer.field_q;
                  if (var9 != null) {
                    if (!(var9.listener instanceof DropListener)) {
                      LayeredButtonRenderer.field_q = null;
                    } else {
                      ((DropListener) (var9.listener)).onDrop(var9, (byte) -3, (DropTargetWidget) null);
                      LayeredButtonRenderer.field_q = null;
                    }
                  }
                }
                if (param3) {
                  this.dispatchKey(19, 'ￚ', (byte) -73);
                }
                DialogLayer.field_L = RoadStripRenderer.field_f;
                ba.a(this.getTooltip(0), 0);
                return param2;
              }
              this.clearFocus(47);
              if (var7 != 0) {
                param2 = false;
              }
            } else {
              param2 = false;
            }
            if (0 == RoadStripRenderer.field_f &&
              0 != DialogLayer.field_L) {
              this.handleMouseRelease(NodeHashTableIterator.field_g, this, param1, param0, (byte) -9, FullscreenErrorDialog.field_X);
              var10 = LayeredButtonRenderer.field_q;
              if (var10 != null) {
                if (var10.listener instanceof DropListener) {
                  ((DropListener) (var10.listener)).onDrop(var10, (byte) -3, (DropTargetWidget) null);
                }
                LayeredButtonRenderer.field_q = null;
              }
              if (param3) {
                this.dispatchKey(19, 'ￚ', (byte) -73);
              }
              DialogLayer.field_L = RoadStripRenderer.field_f;
              ba.a(this.getTooltip(0), 0);
              return param2;
            }
          }
        } else {
          if (var5 != 0 &&
            ValidationIndicator.field_J != 0) {
            this.clearFocus(117);
            if (var7 != 0) {
              if (LoginForm.field_T != 0) {
                this.handleScrollInput(param0, this, LoginForm.field_T, param1, FullscreenErrorDialog.field_X, NodeHashTableIterator.field_g, -24898);
              }
              if (ValidationIndicator.field_J == 0) {
                if (0 == RoadStripRenderer.field_f &&
                  0 != DialogLayer.field_L) {
                  this.handleMouseRelease(NodeHashTableIterator.field_g, this, param1, param0, (byte) -9, FullscreenErrorDialog.field_X);
                  var11 = LayeredButtonRenderer.field_q;
                  if (var11 != null) {
                    if (var11.listener instanceof DropListener) {
                      ((DropListener) (var11.listener)).onDrop(var11, (byte) -3, (DropTargetWidget) null);
                    }
                    LayeredButtonRenderer.field_q = null;
                  }
                }
              } else {
                if (!this.handleMousePress(param0, ValidatedTextField.field_U, param1, this, (byte) -108, TrackBoundary.field_x, ValidationIndicator.field_J)) {
                  this.clearFocus(47);
                }
                param2 = false;
                if (0 == RoadStripRenderer.field_f &&
                  0 != DialogLayer.field_L) {
                  this.handleMouseRelease(NodeHashTableIterator.field_g, this, param1, param0, (byte) -9, FullscreenErrorDialog.field_X);
                  var13 = LayeredButtonRenderer.field_q;
                  if (var13 != null) {
                    if (var13.listener instanceof DropListener) {
                      ((DropListener) (var13.listener)).onDrop(var13, (byte) -3, (DropTargetWidget) null);
                    }
                    LayeredButtonRenderer.field_q = null;
                  }
                  if (param3) {
                    this.dispatchKey(19, 'ￚ', (byte) -73);
                  }
                  DialogLayer.field_L = RoadStripRenderer.field_f;
                  ba.a(this.getTooltip(0), 0);
                  return param2;
                }
              }
            }
          }
        }
        if (param3) {
          this.dispatchKey(19, 'ￚ', (byte) -73);
        }
        DialogLayer.field_L = RoadStripRenderer.field_f;
        ba.a(this.getTooltip(0), 0);
        return param2;
    }

    final void appendDebugProperties(Hashtable param0, int param1, boolean param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        UiWidget var7 = null;
        var6 = HoldTheLine.field_D;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (null != this.text) {
            discarded$1 = param3.append(" text=\"").append(this.text).append('"');
          }
          if (this.hovered) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.isFocused((byte) -20)) {
            discarded$3 = param3.append(" focused");
          }
          if (null != this.renderer) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.renderer instanceof UiWidget)) {
              discarded$5 = param3.append(this.renderer);
              if (var6 != 0) {
                param3 = this.appendDebugTree(param1 + 1, (byte) -61, param0, param3);
              }
            } else {
              param3 = this.appendDebugTree(param1 + 1, (byte) -61, param0, param3);
            }
          }
          if (this.listener != null) {
            discarded$6 = param3.append(" listener=");
            if (this.listener instanceof UiWidget) {
              param3 = this.appendDebugTree(1 + param1, (byte) 106, param0, param3);
              if (var6 != 0) {
                discarded$7 = param3.append(this.listener);
              }
            } else {
              discarded$7 = param3.append(this.listener);
            }
          }
          if (!param2) {
            var7 = (UiWidget) null;
            this.handleKeyPress((UiWidget) null, 89, (byte) -105, '8');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("n.DC(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void refreshLayout(int param0) {
        if (param0 < 72) {
          return;
        }
        this.setBounds(this.x, (byte) 122, this.y, this.height, this.width);
    }

    public final String toString() {
        return this.appendDebugTree(0, (byte) -67, new Hashtable(), new StringBuilder()).toString();
    }

    boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -25823) {
            return false;
          }
          this.listener = (WidgetListener) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("n.NB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -78) {
            return false;
          }
          this.field_m = 116;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("n.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected UiWidget() {
        this.field_y = 0;
        this.field_m = 0;
    }

    UiWidget(String param0, WidgetRenderer param1, WidgetListener param2) {
        RuntimeException runtimeException = null;
        TextWidgetRenderer var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_y = 0;
        this.field_m = 0;
        try {
          this.renderer = param1;
          this.listener = param2;
          this.text = param0;
          if (this.renderer instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.renderer);
            this.width = var4.getPreferredWidth((byte) -36, this);
            this.height = var4.getPreferredHeight(this, -95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("n.<init>(");
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5) {
        this.field_y = 0;
        this.field_m = 0;
        try {
          this.x = param0;
          this.renderer = param4;
          this.height = param3;
          this.y = param1;
          this.listener = param5;
          this.width = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "n.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = null;
        field_n = 0L;
    }
}
