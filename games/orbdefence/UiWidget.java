/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    int field_v;
    String field_i;
    WidgetEventListener field_h;
    int field_s;
    static String[] field_o;
    boolean field_t;
    static String field_w;
    int field_m;
    int field_q;
    int field_f;
    String field_l;
    int field_r;
    static RgbSprite[] field_u;
    static int field_p;
    static String field_k;
    TextLayout field_g;
    WidgetRenderer field_j;
    int field_n;

    public static void clearDeclaredStaticReferences(int param0) {
        field_u = null;
        if (param0 < -66) {
          field_w = null;
          field_k = null;
          field_o = null;
          return;
        }
        field_k = (String) null;
        field_w = null;
        field_k = null;
        field_o = null;
    }

    void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != -77) {
            return;
          }
          var5_int = this.containsPointer((byte) 3, ua.field_a, DiskCacheWorker.field_d, param3, param2) ? 1 : 0;
          stackIn_5_0 = (var5_int != 0) ? 0 : 1;
          if (stackIn_5_0 == (this.field_t ? 1 : 0)) {
            stackIn_9_1 = (var5_int != 0);
            this.field_t = stackIn_9_1;
            if (null != this.field_h &&
              this.field_h instanceof WidgetHoverListener) {
              ((WidgetHoverListener) (this.field_h)).onWidgetHoverChanged((byte) 43, var5_int != 0, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("pj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void drawAllLayers(byte param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = OrbDefence.field_D ? 1 : 0;
        var4 = this.getMaximumRenderLayer(param0 - 20680);
        var5_int = 0;
        while (var4 >= var5_int) {
          this.drawWidget(param1, var5_int, param0 + 1048493, param2);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = ArchiveRequest.g(param0 ^ -16392);
        if (var5 != null) {
          mb.field_a.a(sl.field_ab, uk.field_c, 0, var5);
        }
        if (param0 == 82) {
          return;
        }
        field_o = (String[]) null;
    }

    String getTooltipText(int param0) {
        if (param0 == -8235) {
          return !this.field_t ? null : this.field_i;
        }
        this.field_s = -7;
        return !this.field_t ? null : this.field_i;
    }

    final void refreshLayout(int param0) {
        this.setBounds(this.field_s, this.field_n, this.field_r, (byte) -90, this.field_m);
        if (param0 != -26385) {
          this.field_m = -40;
        }
    }

    public final String toString() {
        return this.appendDebugTree((byte) -46, new Hashtable(), 0, new StringBuilder()).toString();
    }

    boolean handleWheel(boolean param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("pj.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void blur(int param0) {
        if (param0 != 0) {
          this.field_n = -29;
        }
    }

    boolean handleKey(char param0, int param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pj.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean pointerPressed(byte param0, UiWidget param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -115) {
            field_k = (String) null;
          }
          if (!this.containsPointer((byte) 3, param5, param4, param6, param3)) {
            return false;
          }
          this.field_v = param2;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("pj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void pointerReleased(int param0, int param1, byte param2, UiWidget param3, int param4, int param5) {
        try {
          this.field_v = 0;
          if (param2 >= -91) {
            this.blur(-66);
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "pj.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    UiWidget(String param0, WidgetEventListener param1) {
        this(param0, mb.field_a.field_f, param1);
    }

    boolean isFocused(int param0) {
        if (param0 != -81) {
          this.field_f = 35;
          return false;
        }
        return false;
    }

    final boolean processKeyInput(char param0, boolean param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (this.isFocused(-81)) {
          if (this.handleKey(param0, param2, this, 0)) {
            return true;
          }
          var4 = param2;
          if (var4 == 80) {
            return this.takeFocus(-81, this);
          }
          if (!param1) {
            this.field_s = 4;
            return false;
          }
          return false;
        }
        var4Lifetime1 = param2;
        if (var4Lifetime1 == 80) {
          return this.takeFocus(-81, this);
        }
        if (param1) {
          return false;
        }
        this.field_s = 4;
        return false;
    }

    final void appendDebugProperties(int param0, byte param1, Hashtable param2, StringBuilder param3) {
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_s).append(",").append(this.field_n).append(" ").append(this.field_m).append("x").append(this.field_r);
          if (this.field_l != null) {
            discarded$1 = param3.append(" text=\"").append(this.field_l).append('"');
          }
          if (this.field_t) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.isFocused(-81)) {
            discarded$3 = param3.append(" focused");
          }
          if (null != this.field_j) {
            discarded$4 = param3.append(" renderer=");
            if (this.field_j instanceof UiWidget) {
              param3 = this.appendDebugTree((byte) -85, param2, 1 + param0, param3);
              if (var6 != 0) {
                discarded$5 = param3.append(this.field_j);
              }
            } else {
              discarded$5 = param3.append(this.field_j);
            }
          }
          if (param1 > -88) {
            UiWidget.a(-49, (RgbSprite) null);
          }
          if (this.field_h != null) {
            discarded$6 = param3.append(" listener=");
            if (this.field_h instanceof UiWidget) {
              param3 = this.appendDebugTree((byte) -32, param2, param0 + 1, param3);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param3.append(this.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("pj.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    void drawWidget(int param0, int param1, int param2, int param3) {
        if (param2 != 1048575) {
          this.processPointerInput(86, false, true, -95);
          if (param1 != 0) {
            return;
          }
          if (this.field_j != null) {
            this.field_j.paintWidget(param0, param3, this, -4394, true);
            return;
          }
          return;
        }
        if (param1 != 0) {
          return;
        }
        if (this.field_j != null) {
          this.field_j.paintWidget(param0, param3, this, -4394, true);
          return;
        }
    }

    final static void a(int param0, RgbSprite param1) {
        try {
          if (param0 != 0) {
            field_o = (String[]) null;
          }
          lc.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "pj.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int getMaximumRenderLayer(int param0) {
        if (param0 != -20598) {
          this.field_h = (WidgetEventListener) null;
          return 0;
        }
        return 0;
    }

    final boolean containsPointer(byte param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param0 != 3) {
          this.field_v = 72;
          if (param1 < param4 + this.field_s) {
            return false;
          }
          if (param2 < param3 + this.field_n) {
            return false;
          }
          if (param1 >= this.field_m + (this.field_s + param4)) {
            return false;
          }
          if (param2 >= this.field_r + (param3 + this.field_n)) {
            return false;
          }
          return true;
        }
        if (param1 < param4 + this.field_s) {
          return false;
        }
        if (param2 < param3 + this.field_n) {
          return false;
        }
        stackIn_18_0 = (param1 < this.field_m + (this.field_s + param4)) && (param2 < this.field_r + (param3 + this.field_n));
        return stackIn_18_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -108 / ((43 - param0) / 51);
          var3 = param1.getParameter("username");
          if (var3 != null) {
            var4 = (CharSequence) ((Object) var3);
            if (ProxyAuthenticationRequiredException.a(127, var4) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pj.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void setBounds(int param0, int param1, int param2, byte param3, int param4) {
        this.field_r = param2;
        this.field_m = param4;
        this.field_n = param1;
        if (param3 != -90) {
          return;
        }
        this.field_s = param0;
    }

    final boolean processPointerInput(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        DraggableWidgetContainer var6;
        int var7;
        DraggableWidgetContainer var8;
        DraggableWidgetContainer var9;
        DraggableWidgetContainer var10;
        DraggableWidgetContainer var11;
        DraggableWidgetContainer var12;
        DraggableWidgetContainer var14;
        DraggableWidgetContainer var15;
        DraggableWidgetContainer var16;
        DraggableWidgetContainer var17;
        DraggableWidgetContainer var6Lifetime1;
        DraggableWidgetContainer var6Lifetime2;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param1) {
          return false;
        }
        this.updatePointer((byte) -77, this, param3, param0);
        var5 = this.isFocused(-81) ? 1 : 0;
        if (!param2) {
          if (var5 != 0 &&
            gi.field_e != 0) {
            this.blur(0);
          }
          ud.field_j = of.field_G;
          fg.a(101, this.getTooltipText(-8235));
          return param2;
        }
        if (of.field_K == 0) {
          if (gi.field_e == 0) {
            if (of.field_G != 0) {
              ud.field_j = of.field_G;
              fg.a(101, this.getTooltipText(-8235));
              return param2;
            }
            if (ud.field_j == 0) {
              ud.field_j = of.field_G;
              fg.a(101, this.getTooltipText(-8235));
              return param2;
            }
            this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
            var8 = DelegatingCanvas.field_c;
            if (var8 != null) {
              if (var8.field_h instanceof WidgetDropListener) {
                ((WidgetDropListener) (var8.field_h)).widgetDropped(-114, var8, (DropTargetWidgetContainer) null);
              }
              DelegatingCanvas.field_c = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              gi.field_e != 0) {
              this.blur(0);
            }
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          if (this.pointerPressed((byte) -120, this, gi.field_e, param3, bg.field_c, AccountCreationResultPanel.field_fb, param0)) {
            param2 = false;
          } else {
            if (var5 != 0) {
              this.blur(0);
              if (var7 != 0) {
                param2 = false;
                if (of.field_G != 0) {
                  ud.field_j = of.field_G;
                  fg.a(101, this.getTooltipText(-8235));
                  return param2;
                }
                if (ud.field_j == 0) {
                  ud.field_j = of.field_G;
                  fg.a(101, this.getTooltipText(-8235));
                  return param2;
                }
                this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
                var9 = DelegatingCanvas.field_c;
                if (var9 != null) {
                  if (var9.field_h instanceof WidgetDropListener) {
                    ((WidgetDropListener) (var9.field_h)).widgetDropped(-114, var9, (DropTargetWidgetContainer) null);
                  }
                  DelegatingCanvas.field_c = null;
                }
                if (gi.field_e != 0) {
                  this.blur(0);
                }
                ud.field_j = of.field_G;
                fg.a(101, this.getTooltipText(-8235));
                return param2;
              }
            }
          }
          if (of.field_G != 0) {
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          if (ud.field_j == 0) {
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
          var10 = DelegatingCanvas.field_c;
          if (var10 != null) {
            if (var10.field_h instanceof WidgetDropListener) {
              ((WidgetDropListener) (var10.field_h)).widgetDropped(-114, var10, (DropTargetWidgetContainer) null);
            }
            DelegatingCanvas.field_c = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            gi.field_e != 0) {
            this.blur(0);
          }
          ud.field_j = of.field_G;
          fg.a(101, this.getTooltipText(-8235));
          return param2;
        }
        if (var5 != 0) {
          this.handleWheel(param1, param3, param0, of.field_K, ua.field_a, DiskCacheWorker.field_d, this);
          if (gi.field_e == 0) {
            if (of.field_G == 0 &&
              ud.field_j != 0) {
              this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
              var15 = DelegatingCanvas.field_c;
              var6 = var15;
              if (var15 != null) {
                if (var15.field_h instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var15.field_h)).widgetDropped(-114, var15, (DropTargetWidgetContainer) null);
                }
                DelegatingCanvas.field_c = null;
              }
              if (var7 != 0 &&
                gi.field_e != 0) {
                this.blur(0);
              }
            }
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          if (this.pointerPressed((byte) -120, this, gi.field_e, param3, bg.field_c, AccountCreationResultPanel.field_fb, param0)) {
            param2 = false;
          } else {
            this.blur(0);
            if (var7 != 0) {
              param2 = false;
              if (of.field_G == 0 &&
                ud.field_j != 0) {
                this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
                var16 = DelegatingCanvas.field_c;
                var6Lifetime1 = var16;
                if (var16 != null) {
                  if (var16.field_h instanceof WidgetDropListener) {
                    ((WidgetDropListener) (var16.field_h)).widgetDropped(-114, var16, (DropTargetWidgetContainer) null);
                  }
                  DelegatingCanvas.field_c = null;
                }
                if (gi.field_e != 0) {
                  this.blur(0);
                }
              }
              ud.field_j = of.field_G;
              fg.a(101, this.getTooltipText(-8235));
              return param2;
            }
          }
          if (of.field_G != 0) {
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          if (ud.field_j == 0) {
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
          var17 = DelegatingCanvas.field_c;
          var6Lifetime2 = var17;
          if (var17 != null) {
            if (var17.field_h instanceof WidgetDropListener) {
              ((WidgetDropListener) (var17.field_h)).widgetDropped(-114, var17, (DropTargetWidgetContainer) null);
            }
            DelegatingCanvas.field_c = null;
          }
          if (var7 != 0 &&
            gi.field_e != 0) {
            this.blur(0);
          }
          ud.field_j = of.field_G;
          fg.a(101, this.getTooltipText(-8235));
          return param2;
        }
        if (gi.field_e == 0) {
          if (of.field_G != 0) {
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          if (ud.field_j == 0) {
            ud.field_j = of.field_G;
            fg.a(101, this.getTooltipText(-8235));
            return param2;
          }
          this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
          var11 = DelegatingCanvas.field_c;
          if (var11 != null) {
            if (var11.field_h instanceof WidgetDropListener) {
              ((WidgetDropListener) (var11.field_h)).widgetDropped(-114, var11, (DropTargetWidgetContainer) null);
            }
            DelegatingCanvas.field_c = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            gi.field_e != 0) {
            this.blur(0);
          }
          ud.field_j = of.field_G;
          fg.a(101, this.getTooltipText(-8235));
          return param2;
        }
        if (this.pointerPressed((byte) -120, this, gi.field_e, param3, bg.field_c, AccountCreationResultPanel.field_fb, param0)) {
          param2 = false;
        } else {
        }
        if (of.field_G != 0) {
          ud.field_j = of.field_G;
          fg.a(101, this.getTooltipText(-8235));
          return param2;
        }
        if (ud.field_j == 0) {
          ud.field_j = of.field_G;
          fg.a(101, this.getTooltipText(-8235));
          return param2;
        }
        this.pointerReleased(param0, ua.field_a, (byte) -98, this, param3, DiskCacheWorker.field_d);
        var14 = DelegatingCanvas.field_c;
        if (var14 != null) {
          if (var14.field_h instanceof WidgetDropListener) {
            ((WidgetDropListener) (var14.field_h)).widgetDropped(-114, var14, (DropTargetWidgetContainer) null);
          }
          DelegatingCanvas.field_c = null;
        }
        if (var7 != 0 &&
          var5 != 0 &&
          gi.field_e != 0) {
          this.blur(0);
        }
        ud.field_j = of.field_G;
        fg.a(101, this.getTooltipText(-8235));
        return param2;
    }

    boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -81) {
            return false;
          }
          this.takeFocus(-59, (UiWidget) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -23) {
            field_p = 37;
          }
          if (this.beginDebugTreeEntry(9882, param3, param2, param1)) {
            this.appendDebugProperties(param2, (byte) -116, param1, param3);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean beginDebugTreeEntry(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9882) {
            return false;
          }
          if (!param3.containsKey(this)) {
            param3.put(this, this);
            return true;
          }
          discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pj.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    protected UiWidget() {
        this.field_f = 0;
        this.field_q = 0;
    }

    UiWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
        TextWidgetRenderer var4 = null;
        this.field_f = 0;
        this.field_q = 0;
        try {
          this.field_h = param2;
          this.field_l = param0;
          this.field_j = param1;
          if (this.field_j instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.field_j);
            this.field_m = var4.getPreferredWidth(this, true);
            this.field_r = var4.getPreferredHeight(this, true);
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        this.field_f = 0;
        this.field_q = 0;
        try {
          this.field_r = param3;
          this.field_j = param4;
          this.field_h = param5;
          this.field_n = param1;
          this.field_s = param0;
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "pj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
