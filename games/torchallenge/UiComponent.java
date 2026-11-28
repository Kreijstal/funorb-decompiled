/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiComponent extends IntrusiveNode {
    static String field_y;
    String field_v;
    int field_z;
    static int field_o;
    boolean field_w;
    WidgetRenderer field_q;
    static int field_s;
    int field_u;
    int field_i;
    String field_r;
    int field_j;
    int field_p;
    int field_m;
    TextLayout field_t;
    int field_l;
    WidgetEventListener field_k;
    static hb field_x;
    static int[] field_n;

    final boolean processPointerInput(int param0, boolean param1, int param2, boolean param3) {
        int var5;
        int var7;
        DraggableWidgetContainer var8;
        DraggableWidgetContainer var9;
        DraggableWidgetContainer var10;
        DraggableWidgetContainer var11;
        DraggableWidgetContainer var12;
        DraggableWidgetContainer var13;
        DraggableWidgetContainer var14;
        var7 = TorChallenge.field_F ? 1 : 0;
        this.updatePointer(this, param0, (byte) -127, param2);
        var5 = this.isFocused(94) ? 1 : 0;
        if (!param3) {
          if (var5 != 0 &&
            ArchiveNetworkClient.field_n != 0) {
            this.blur(6064);
          }
        } else {
          if (bl.field_X != 0) {
            if (var5 == 0) {
              if (ArchiveNetworkClient.field_n == 0) {
                if (0 != wh.field_e) {
                  ok.field_f = wh.field_e;
                  je.a((byte) -109, this.getTooltipText(param1));
                  return param3;
                }
                if (ok.field_f == 0) {
                  ok.field_f = wh.field_e;
                  je.a((byte) -109, this.getTooltipText(param1));
                  return param3;
                }
                this.pointerReleased(param2, (byte) -77, this, param0, ConfirmedEmailAvailabilityValidator.field_u, ph.field_d);
                var8 = SocketConnector.field_b;
                if (var8 != null) {
                  if (var8.field_k instanceof WidgetDropListener) {
                    ((WidgetDropListener) (var8.field_k)).widgetDropped(var8, (DropTargetWidgetContainer) null, param1);
                  }
                  SocketConnector.field_b = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  ArchiveNetworkClient.field_n != 0) {
                  this.blur(6064);
                }
                ok.field_f = wh.field_e;
                je.a((byte) -109, this.getTooltipText(param1));
                return param3;
              }
              if (this.pointerPressed(AgeValidator.field_m, ik.field_a, -81, param2, param0, ArchiveNetworkClient.field_n, this)) {
                param3 = false;
                if (var7 == 0) {
                  if (0 != wh.field_e) {
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, this.getTooltipText(param1));
                    return param3;
                  }
                  if (ok.field_f == 0) {
                    ok.field_f = wh.field_e;
                    je.a((byte) -109, this.getTooltipText(param1));
                    return param3;
                  }
                  this.pointerReleased(param2, (byte) -77, this, param0, ConfirmedEmailAvailabilityValidator.field_u, ph.field_d);
                  var9 = SocketConnector.field_b;
                  if (var9 != null) {
                    if (var9.field_k instanceof WidgetDropListener) {
                      ((WidgetDropListener) (var9.field_k)).widgetDropped(var9, (DropTargetWidgetContainer) null, param1);
                    }
                    SocketConnector.field_b = null;
                  }
                  if (var7 != 0 &&
                    var5 != 0 &&
                    ArchiveNetworkClient.field_n != 0) {
                    this.blur(6064);
                  }
                  ok.field_f = wh.field_e;
                  je.a((byte) -109, this.getTooltipText(param1));
                  return param3;
                }
              }
              if (0 != wh.field_e) {
                ok.field_f = wh.field_e;
                je.a((byte) -109, this.getTooltipText(param1));
                return param3;
              }
              if (ok.field_f == 0) {
                ok.field_f = wh.field_e;
                je.a((byte) -109, this.getTooltipText(param1));
                return param3;
              }
              this.pointerReleased(param2, (byte) -77, this, param0, ConfirmedEmailAvailabilityValidator.field_u, ph.field_d);
              var10 = SocketConnector.field_b;
              if (var10 != null) {
                if (var10.field_k instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var10.field_k)).widgetDropped(var10, (DropTargetWidgetContainer) null, param1);
                }
                SocketConnector.field_b = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                ArchiveNetworkClient.field_n != 0) {
                this.blur(6064);
              }
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
            this.handleWheel(0, bl.field_X, param0, ConfirmedEmailAvailabilityValidator.field_u, this, ph.field_d, param2);
          }
          if (ArchiveNetworkClient.field_n == 0) {
            if (0 != wh.field_e) {
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
            if (ok.field_f == 0) {
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
            this.pointerReleased(param2, (byte) -77, this, param0, ConfirmedEmailAvailabilityValidator.field_u, ph.field_d);
            var11 = SocketConnector.field_b;
            if (var11 != null) {
              if (var11.field_k instanceof WidgetDropListener) {
                ((WidgetDropListener) (var11.field_k)).widgetDropped(var11, (DropTargetWidgetContainer) null, param1);
              }
              SocketConnector.field_b = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              ArchiveNetworkClient.field_n != 0) {
              this.blur(6064);
            }
            ok.field_f = wh.field_e;
            je.a((byte) -109, this.getTooltipText(param1));
            return param3;
          }
          if (this.pointerPressed(AgeValidator.field_m, ik.field_a, -81, param2, param0, ArchiveNetworkClient.field_n, this)) {
            param3 = false;
            if (var7 == 0) {
              if (0 != wh.field_e) {
                ok.field_f = wh.field_e;
                je.a((byte) -109, this.getTooltipText(param1));
                return param3;
              }
              if (ok.field_f == 0) {
                ok.field_f = wh.field_e;
                je.a((byte) -109, this.getTooltipText(param1));
                return param3;
              }
              this.pointerReleased(param2, (byte) -77, this, param0, ConfirmedEmailAvailabilityValidator.field_u, ph.field_d);
              var12 = SocketConnector.field_b;
              if (var12 != null) {
                if (var12.field_k instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var12.field_k)).widgetDropped(var12, (DropTargetWidgetContainer) null, param1);
                }
                SocketConnector.field_b = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                ArchiveNetworkClient.field_n != 0) {
                this.blur(6064);
              }
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
          }
          if (var5 != 0) {
            this.blur(6064);
            if (0 != wh.field_e) {
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
            if (ok.field_f == 0) {
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
            this.pointerReleased(param2, (byte) -77, this, param0, ConfirmedEmailAvailabilityValidator.field_u, ph.field_d);
            var14 = SocketConnector.field_b;
            if (var14 != null) {
              if (var14.field_k instanceof WidgetDropListener) {
                ((WidgetDropListener) (var14.field_k)).widgetDropped(var14, (DropTargetWidgetContainer) null, param1);
              }
              SocketConnector.field_b = null;
            }
            if (var7 != 0 &&
              ArchiveNetworkClient.field_n != 0) {
              this.blur(6064);
            }
            ok.field_f = wh.field_e;
            je.a((byte) -109, this.getTooltipText(param1));
            return param3;
          }
          if (0 == wh.field_e &&
            ok.field_f != 0) {
            this.pointerReleased(param2, (byte) -77, this, param0, ConfirmedEmailAvailabilityValidator.field_u, ph.field_d);
            var13 = SocketConnector.field_b;
            if (var13 != null) {
              if (var13.field_k instanceof WidgetDropListener) {
                ((WidgetDropListener) (var13.field_k)).widgetDropped(var13, (DropTargetWidgetContainer) null, param1);
              }
              SocketConnector.field_b = null;
              if (var7 != 0 &&
                var5 != 0 &&
                ArchiveNetworkClient.field_n != 0) {
                this.blur(6064);
              }
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              ArchiveNetworkClient.field_n != 0) {
              this.blur(6064);
              ok.field_f = wh.field_e;
              je.a((byte) -109, this.getTooltipText(param1));
              return param3;
            }
          }
        }
        ok.field_f = wh.field_e;
        je.a((byte) -109, this.getTooltipText(param1));
        return param3;
    }

    public static void clearStaticReferences(int param0) {
        field_n = null;
        field_y = null;
        if (param0 <= 76) {
          return;
        }
        field_x = null;
    }

    boolean pointerPressed(int param0, int param1, int param2, int param3, int param4, int param5, UiComponent param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -81) {
            this.pointerPressed(-23, -24, 118, 19, -83, -121, (UiComponent) null);
          }
          if (!this.containsPointer(param0, param1, param3, -29991, param4)) {
            return false;
          }
          this.field_z = param5;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ee.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    boolean handleWheel(int param0, int param1, int param2, int param3, UiComponent param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.drawWidget(-72, -73, false, 71);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ee.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean containsPointer(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param3 != -29991) {
          this.field_z = -33;
          if (param1 < param4 + this.field_m) {
            return false;
          }
          if (param0 < this.field_i + param2) {
            return false;
          }
          if (this.field_p + (this.field_m + param4) <= param1) {
            return false;
          }
          if (param2 + this.field_i + this.field_l <= param0) {
            return false;
          }
          return true;
        }
        if (param1 < param4 + this.field_m) {
          return false;
        }
        if (param0 < this.field_i + param2) {
          return false;
        }
        stackIn_18_0 = (this.field_p + (this.field_m + param4) > param1) && (param2 + this.field_i + this.field_l > param0);
        return stackIn_18_0;
    }

    void updatePointer(UiComponent param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPointer(ph.field_d, ConfirmedEmailAvailabilityValidator.field_u, param3, -29991, param1) ? 1 : 0;
          if (var5_int != (this.field_w ? 1 : 0)) {
            stackIn_4_1 = (var5_int != 0);
            this.field_w = stackIn_4_1;
            if (this.field_k != null &&
              this.field_k instanceof WidgetHoverListener) {
              ((WidgetHoverListener) (this.field_k)).onWidgetHoverChanged(var5_int != 0, this, 29557);
            }
          }
          if (param2 > -97) {
            this.field_r = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ee.U(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean beginDebugTreeEntry(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -124) {
            this.field_r = (String) null;
          }
          if (!param0.containsKey(this)) {
            param0.put(this, this);
            return true;
          }
          discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ee.OB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    boolean handleKey(int param0, char param1, byte param2, UiComponent param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > 9) {
            return false;
          }
          this.handleWheel(74, 31, 55, -90, (UiComponent) null, -101, -90);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ee.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void appendDebugProperties(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_m).append(",").append(this.field_i).append(" ").append(this.field_p).append("x").append(this.field_l);
          var5_int = 31 / ((param1 + 42) / 51);
          if (null != this.field_v) {
            discarded$1 = param0.append(" text=\"").append(this.field_v).append('"');
          }
          if (this.field_w) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.isFocused(89)) {
            discarded$3 = param0.append(" focused");
          }
          if (this.field_q != null) {
            discarded$4 = param0.append(" renderer=");
            if (this.field_q instanceof UiComponent) {
              param0 = this.appendDebugTree(param2, 1 + param3, param0, true);
              if (var6 != 0) {
                discarded$5 = param0.append(this.field_q);
              }
            } else {
              discarded$5 = param0.append(this.field_q);
            }
          }
          if (this.field_k != null) {
            discarded$6 = param0.append(" listener=");
            if (!(this.field_k instanceof UiComponent)) {
              discarded$7 = param0.append(this.field_k);
              if (var6 != 0) {
                param0 = this.appendDebugTree(param2, param3 + 1, param0, true);
              }
            } else {
              param0 = this.appendDebugTree(param2, param3 + 1, param0, true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ee.CB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder appendDebugTree(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(param0, param1, -125, param2)) {
            this.appendDebugProperties(param2, -110, param0, param1);
          }
          if (param3) {
            stackIn_6_0 = (StringBuilder) (param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ee.W(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(bk param0, int param1, byte param2) {
        try {
          na.field_d.addLast(param0, -104);
          if (param2 != -43) {
            field_n = (int[]) null;
          }
          ae.a(param1, param0, -15024);
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "ee.FB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void drawAllLayers(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = this.getMaximumRenderLayer(-15000);
        var5_int = param0;
        while (var4 >= var5_int) {
          this.drawWidget(param2, param1, false, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = wi.b(param0 + 1);
        if (var5 == null) {
          return;
        }
        kl.field_e.a(ul.field_n, var5, bi.field_h, -45);
    }

    boolean takeFocus(UiComponent param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          field_y = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ee.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void pointerReleased(int param0, byte param1, UiComponent param2, int param3, int param4, int param5) {
        try {
          int var7_int = -81 % ((-29 - param1) / 39);
          this.field_z = 0;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "ee.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    int getMaximumRenderLayer(int param0) {
        if (param0 != -15000) {
          this.field_t = (TextLayout) null;
          return 0;
        }
        return 0;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 == 1) {
          ResizableModalDialog.showLoginDialogWithIntGuard(param2, -24, param0, (String) null);
          return;
        }
        UiComponent.a((bk) null, -16, (byte) 127);
        ResizableModalDialog.showLoginDialogWithIntGuard(param2, -24, param0, (String) null);
    }

    final static void a(int param0, int param1, h param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, BitmapFont param12, int param13, BitmapFont param14, int param15, int param16, h param17, int param18, h param19, int param20) {
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
        RuntimeException var21 = null;
        try {
          if (param6 != 0) {
            return;
          }
          hl.a(param14, param12, 67, param11);
          qc.a((byte) -118, param5, param18, param15, param16);
          ok.a(param9, param7, (byte) -126);
          tc.a(param19, param17, (byte) 27, param20, param0, param8);
          AccountServiceResult.a(param4, param2, (byte) 69, param10);
          DirectByteStorage.a(param3, param13, true, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("ee.NB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param20).append(')').toString());
        }
    }

    boolean isFocused(int param0) {
        if (param0 <= 76) {
          return true;
        }
        return false;
    }

    void drawWidget(int param0, int param1, boolean param2, int param3) {
        if (0 == param3) {
          if (this.field_q == null) {
            if (param2) {
              this.toString();
              return;
            }
            return;
          }
          this.field_q.paintWidget(this, param0, param1, (byte) 97, true);
        }
        if (!param2) {
          return;
        }
        this.toString();
    }

    void blur(int param0) {
        if (param0 != 6064) {
          UiComponent.a((bk) null, 51, (byte) -94);
        }
    }

    void setBounds(byte param0, int param1, int param2, int param3, int param4) {
        this.field_m = param1;
        if (param0 > 100) {
          this.field_i = param4;
          this.field_p = param3;
          this.field_l = param2;
          return;
        }
        this.takeFocus((UiComponent) null, -90);
        this.field_i = param4;
        this.field_p = param3;
        this.field_l = param2;
    }

    UiComponent(String param0, WidgetEventListener param1) {
        this(param0, kl.field_e.field_q, param1);
    }

    final void refreshLayout(byte param0) {
        if (param0 <= 52) {
          return;
        }
        this.setBounds((byte) 114, this.field_m, this.field_l, this.field_p, this.field_i);
    }

    final boolean processKeyInput(char param0, int param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (this.isFocused(121)) {
          if (this.handleKey(param1, param0, (byte) 126, this)) {
            return true;
          }
          var4 = param1;
          if (var4 == 80) {
            return this.takeFocus(this, 0);
          }
          var4Lifetime3 = -89 / ((8 - param2) / 60);
          return false;
        }
        var4Lifetime1 = param1;
        if (var4Lifetime1 == 80) {
          return this.takeFocus(this, 0);
        }
        var4Lifetime2 = -89 / ((8 - param2) / 60);
        return false;
    }

    String getTooltipText(boolean param0) {
        if (param0) {
          this.processKeyInput('4', -20, -6);
          if (this.field_w) {
            return this.field_r;
          }
          return null;
        }
        if (this.field_w) {
          return this.field_r;
        }
        return null;
    }

    public final String toString() {
        return this.appendDebugTree(new Hashtable(), 0, new StringBuilder(), true).toString();
    }

    protected UiComponent() {
        this.field_u = 0;
        this.field_j = 0;
    }

    UiComponent(String param0, WidgetRenderer param1, WidgetEventListener param2) {
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
        this.field_u = 0;
        this.field_j = 0;
        try {
          this.field_k = param2;
          this.field_q = param1;
          this.field_v = param0;
          if (this.field_q instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.field_q);
            this.field_p = var4.getPreferredWidth(this, (byte) -93);
            this.field_l = var4.getPreferredHeight(this, (byte) -4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ee.<init>(");
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
          throw oj.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    UiComponent(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        this.field_u = 0;
        this.field_j = 0;
        try {
          this.field_m = param0;
          this.field_l = param3;
          this.field_p = param2;
          this.field_i = param1;
          this.field_q = param4;
          this.field_k = param5;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "ee.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = "More suggestions";
        field_x = new hb("usename");
        field_n = new int[]{5, 5, 5};
    }
}
