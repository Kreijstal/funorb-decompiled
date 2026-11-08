/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiComponent extends IntrusiveNode {
    int field_B;
    WidgetPainter field_y;
    static IndexedSprite[] field_A;
    boolean field_D;
    static double field_s;
    int field_x;
    static int field_u;
    int field_k;
    int field_E;
    String field_l;
    int field_z;
    String field_q;
    static String field_t;
    int field_p;
    static String field_v;
    static int[] field_m;
    static String field_w;
    TextLayout field_r;
    static IndexedSprite[] field_o;
    int field_C;
    UiListener field_n;

    public final String toString() {
        return this.appendWidgetDiagnostics(new StringBuilder(), false, 0, new Hashtable()).toString();
    }

    boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 3) {
            return false;
          }
          field_A = (IndexedSprite[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ng.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handlePointerPress(byte param0, UiComponent param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -58) {
            return false;
          }
          if (!this.containsPoint(93, param5, param3, param6, param4)) {
            return false;
          }
          this.field_k = param2;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ng.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    int getTopLayer(int param0) {
        if (param0 <= 31) {
          this.field_l = (String) null;
          return 0;
        }
        return 0;
    }

    void drawLayer(int param0, int param1, int param2, byte param3) {
        int var5 = -54 / ((70 - param3) / 49);
        if (0 != param1) {
          return;
        }
        if (null != this.field_y) {
          this.field_y.drawWidget(this, (byte) -124, param0, param2, true);
          return;
        }
    }

    boolean focusNext(UiComponent param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 27) {
            return false;
          }
          this.field_k = -73;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ng.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void blur(int param0) {
        if (param0 != 2) {
          this.handlePointerEvents(-82, false, (byte) 61, -91);
        }
    }

    final static void a(boolean param0) {
        l.b(true);
        if (param0) {
          return;
        }
        AccountRequestDialog.n(93);
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPoint(param0 + 66, param2, param1, StatusBar.field_k, ProxyAuthenticationException.field_d) ? 1 : 0;
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (this.field_D) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_11_1 = (var5_int != 0);
            this.field_D = stackIn_11_1;
            if (null != this.field_n &&
              this.field_n instanceof n) {
              ((n) (this.field_n)).a(this, var5_int != 0, true);
            }
          }
          if (param0 != 40) {
            this.containsFocus(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ng.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        if (param0 == 0) {
          field_A = null;
          field_o = null;
          field_t = null;
          field_v = null;
          field_w = null;
          return;
        }
        UiComponent.a(true);
        field_A = null;
        field_o = null;
        field_t = null;
        field_v = null;
        field_w = null;
    }

    boolean containsFocus(boolean param0) {
        if (!param0) {
          field_u = -102;
          return false;
        }
        return false;
    }

    final void refreshLayout(byte param0) {
        this.setBounds(this.field_E, (byte) 99, this.field_p, this.field_z, this.field_C);
        if (param0 <= 48) {
          UiComponent var3 = (UiComponent) null;
          this.updatePointer(124, -118, -106, (UiComponent) null);
        }
    }

    String getTooltip(byte param0) {
        if (param0 < 16) {
          return (String) null;
        }
        return !this.field_D ? null : this.field_l;
    }

    final static void g(int param0) {
        RuntimeException runtimeException = null;
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = new Sprite(540, 140);
          Checkbox.a(-126, var1);
          MeshRasterState.a();
          SoftwareRasterizer.clear();
          GameModeCard.field_f = param0;
          ScoreMarkerBar.renderLogoMeshes((byte) 106);
          var2 = var1.copy();
          var3 = 0;
          while (15 > var3) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
            var3++;
            if (var4 != 0) {
              return;
            }
          }
          bd.field_a.makeRasterTarget();
          var1.drawHalfSize(0, 0);
          LinkButtonPainter.a((byte) 92);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ng.BB(" + param0 + ')');
        }
    }

    final void drawLayers(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var4 = this.getTopLayer(63);
        var5 = 0;
        while (true) {
          if (var5 <= var4) {
            this.drawLayer(param0, var5, param1, (byte) -63);
            var5++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var5 = -7 % ((44 - param2) / 51);
          break;
        }
        var6 = ContentTransitionDialog.getTimedNoticeText((byte) -115);
        if (var6 == null) {
          return;
        }
        Checkbox.field_X.drawTooltip(var6, oo.field_f, false, MarkerSlider.field_V);
        return;
    }

    final static void i(int param0) {
        pj[] var1 = null;
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        pj[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var5 = up.field_n;
          var1 = var5;
          var2 = param0;
          while (var5.length > var2) {
            var3 = var5[var2];
            var3.field_f = true;
            var2++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1_ref), "ng.FB(" + param0 + ')');
        }
    }

    final boolean processKey(char param0, int param1, boolean param2) {
        int var4;
        UiComponent var5;
        int var4Lifetime1;
        UiComponent var5Lifetime1;
        if (!this.containsFocus(true)) {
          var4 = param1;
          if (var4 == 80) {
            return this.focusNext(this, 27);
          }
          if (!param2) {
            return false;
          }
          var5 = (UiComponent) null;
          this.handlePointerPress((byte) -104, (UiComponent) null, 48, -22, 91, 48, -13);
          return false;
        }
        if (this.onFocusedKey(param1, 3, this, param0)) {
          return true;
        }
        var4Lifetime1 = param1;
        if (var4Lifetime1 == 80) {
          return this.focusNext(this, 27);
        }
        if (!param2) {
          return false;
        }
        var5Lifetime1 = (UiComponent) null;
        this.handlePointerPress((byte) -104, (UiComponent) null, 48, -22, 91, 48, -13);
        return false;
    }

    final boolean handlePointerEvents(int param0, boolean param1, byte param2, int param3) {
        int var5;
        DraggableWidget var6;
        int var7;
        DraggableWidget var8;
        DraggableWidget var9;
        DraggableWidget var10;
        DraggableWidget var11;
        DraggableWidget var12;
        DraggableWidget var13;
        DraggableWidget var14;
        DraggableWidget var15;
        DraggableWidget var6Lifetime1;
        DraggableWidget var6Lifetime2;
        DraggableWidget var6Lifetime3;
        DraggableWidget var6Lifetime2Lifetime1;
        regionExit1: {
          var7 = Pixelate.field_H ? 1 : 0;
          this.updatePointer(40, param0, param3, this);
          var5 = this.containsFocus(true) ? 1 : 0;
          if (param1) {
            if (lp.field_i != 0) {
              if (var5 == 0) {
                if (0 == IntrusiveDequeCursor.field_c) {
                  if (ef.field_b == 0 &&
                    TextHotspotWidget.field_R != 0) {
                    this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
                    var10 = qf.field_a;
                    if (var10 != null) {
                      if (var10.field_n instanceof WidgetDropListener) {
                        ((WidgetDropListener) (var10.field_n)).onDropped(-92, var10, (DropTargetWidget) null);
                      }
                      qf.field_a = null;
                    }
                    if (var7 != 0 &&
                      var5 != 0 &&
                      0 != IntrusiveDequeCursor.field_c) {
                      this.blur(2);
                    }
                  }
                } else {
                  if (this.handlePointerPress((byte) -58, this, IntrusiveDequeCursor.field_c, param0, BufferedRandomAccessFile.field_a, param3, ji.field_c)) {
                    param1 = false;
                    if (ef.field_b == 0 &&
                      TextHotspotWidget.field_R != 0) {
                      this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
                      var8 = qf.field_a;
                      var6 = var8;
                      if (var8 != null) {
                        if (var8.field_n instanceof WidgetDropListener) {
                          ((WidgetDropListener) (var8.field_n)).onDropped(-92, var8, (DropTargetWidget) null);
                        }
                        qf.field_a = null;
                      }
                      if (var7 != 0 &&
                        var5 != 0 &&
                        0 != IntrusiveDequeCursor.field_c) {
                        this.blur(2);
                      }
                    }
                  } else {
                    if (ef.field_b == 0 &&
                      TextHotspotWidget.field_R != 0) {
                      this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
                      var9 = qf.field_a;
                      var6Lifetime3 = var9;
                      if (var9 != null) {
                        if (var9.field_n instanceof WidgetDropListener) {
                          ((WidgetDropListener) (var9.field_n)).onDropped(-92, var9, (DropTargetWidget) null);
                        }
                        qf.field_a = null;
                      }
                      if (var7 != 0 &&
                        var5 != 0 &&
                        0 != IntrusiveDequeCursor.field_c) {
                        this.blur(2);
                      }
                    }
                  }
                }
                break regionExit1;
              }
              this.onMouseWheel(ProxyAuthenticationException.field_d, (byte) 80, param0, param3, StatusBar.field_k, lp.field_i, this);
            }
            if (0 == IntrusiveDequeCursor.field_c) {
              if (ef.field_b == 0 &&
                TextHotspotWidget.field_R != 0) {
                this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
                var11 = qf.field_a;
                var6Lifetime1 = var11;
                if (var11 != null) {
                  if (var11.field_n instanceof WidgetDropListener) {
                    ((WidgetDropListener) (var11.field_n)).onDropped(-92, var11, (DropTargetWidget) null);
                  }
                  qf.field_a = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  0 != IntrusiveDequeCursor.field_c) {
                  this.blur(2);
                }
              }
              TextHotspotWidget.field_R = ef.field_b;
              if (param2 == 99) {
                ij.a(-5516, this.getTooltip((byte) 37));
                return param1;
              }
              this.field_E = -110;
              ij.a(-5516, this.getTooltip((byte) 37));
              return param1;
            }
            if (!this.handlePointerPress((byte) -58, this, IntrusiveDequeCursor.field_c, param0, BufferedRandomAccessFile.field_a, param3, ji.field_c)) {
              if (var5 == 0) {
                if (ef.field_b == 0) {
                  if (TextHotspotWidget.field_R == 0) {
                    TextHotspotWidget.field_R = ef.field_b;
                    if (param2 == 99) {
                      ij.a(-5516, this.getTooltip((byte) 37));
                      return param1;
                    }
                    this.field_E = -110;
                    ij.a(-5516, this.getTooltip((byte) 37));
                    return param1;
                  }
                  this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
                  var12 = qf.field_a;
                  if (var12 != null) {
                    if (var12.field_n instanceof WidgetDropListener) {
                      ((WidgetDropListener) (var12.field_n)).onDropped(-92, var12, (DropTargetWidget) null);
                    }
                    qf.field_a = null;
                  }
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != IntrusiveDequeCursor.field_c) {
                    this.blur(2);
                    TextHotspotWidget.field_R = ef.field_b;
                    if (param2 == 99) {
                      ij.a(-5516, this.getTooltip((byte) 37));
                      return param1;
                    }
                    this.field_E = -110;
                    ij.a(-5516, this.getTooltip((byte) 37));
                    return param1;
                  }
                }
                TextHotspotWidget.field_R = ef.field_b;
                if (param2 == 99) {
                  ij.a(-5516, this.getTooltip((byte) 37));
                  return param1;
                }
                this.field_E = -110;
                ij.a(-5516, this.getTooltip((byte) 37));
                return param1;
              }
              this.blur(2);
              if (var7 != 0) {
                param1 = false;
                if (ef.field_b == 0) {
                  if (TextHotspotWidget.field_R == 0) {
                    break regionExit1;
                  }
                  this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
                  var14 = qf.field_a;
                  var6Lifetime2 = var14;
                  if (var14 != null) {
                    if (var14.field_n instanceof WidgetDropListener) {
                      ((WidgetDropListener) (var14.field_n)).onDropped(-92, var14, (DropTargetWidget) null);
                    }
                    qf.field_a = null;
                  }
                  if (var5 != 0 &&
                    0 != IntrusiveDequeCursor.field_c) {
                    this.blur(2);
                    TextHotspotWidget.field_R = ef.field_b;
                    if (param2 == 99) {
                      ij.a(-5516, this.getTooltip((byte) 37));
                      return param1;
                    }
                    this.field_E = -110;
                    ij.a(-5516, this.getTooltip((byte) 37));
                    return param1;
                  }
                }
                TextHotspotWidget.field_R = ef.field_b;
                if (param2 == 99) {
                  ij.a(-5516, this.getTooltip((byte) 37));
                  return param1;
                }
                this.field_E = -110;
                ij.a(-5516, this.getTooltip((byte) 37));
                return param1;
              }
              if (ef.field_b == 0) {
                if (TextHotspotWidget.field_R == 0) {
                  TextHotspotWidget.field_R = ef.field_b;
                  if (param2 == 99) {
                    ij.a(-5516, this.getTooltip((byte) 37));
                    return param1;
                  }
                  this.field_E = -110;
                  ij.a(-5516, this.getTooltip((byte) 37));
                  return param1;
                }
                this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
                var13 = qf.field_a;
                var6Lifetime2Lifetime1 = var13;
                if (var13 != null) {
                  if (var13.field_n instanceof WidgetDropListener) {
                    ((WidgetDropListener) (var13.field_n)).onDropped(-92, var13, (DropTargetWidget) null);
                  }
                  qf.field_a = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  0 != IntrusiveDequeCursor.field_c) {
                  this.blur(2);
                  TextHotspotWidget.field_R = ef.field_b;
                  if (param2 == 99) {
                    ij.a(-5516, this.getTooltip((byte) 37));
                    return param1;
                  }
                  this.field_E = -110;
                  ij.a(-5516, this.getTooltip((byte) 37));
                  return param1;
                }
              }
              TextHotspotWidget.field_R = ef.field_b;
              if (param2 == 99) {
                ij.a(-5516, this.getTooltip((byte) 37));
                return param1;
              }
              this.field_E = -110;
              ij.a(-5516, this.getTooltip((byte) 37));
              return param1;
            }
            param1 = false;
            if (ef.field_b != 0) {
              break regionExit1;
            }
            if (TextHotspotWidget.field_R == 0) {
              TextHotspotWidget.field_R = ef.field_b;
              if (param2 == 99) {
                ij.a(-5516, this.getTooltip((byte) 37));
                return param1;
              }
              this.field_E = -110;
              ij.a(-5516, this.getTooltip((byte) 37));
              return param1;
            }
            this.handlePointerRelease(StatusBar.field_k, param3, this, param2 - 99, param0, ProxyAuthenticationException.field_d);
            var15 = qf.field_a;
            if (var15 != null) {
              if (var15.field_n instanceof WidgetDropListener) {
                ((WidgetDropListener) (var15.field_n)).onDropped(-92, var15, (DropTargetWidget) null);
              }
              qf.field_a = null;
            }
            if (var7 == 0) {
              break regionExit1;
            }
          }
          if (var5 != 0 &&
            0 != IntrusiveDequeCursor.field_c) {
            this.blur(2);
            TextHotspotWidget.field_R = ef.field_b;
            if (param2 == 99) {
              ij.a(-5516, this.getTooltip((byte) 37));
              return param1;
            }
            this.field_E = -110;
            ij.a(-5516, this.getTooltip((byte) 37));
            return param1;
          }
        }
        TextHotspotWidget.field_R = ef.field_b;
        if (param2 != 99) {
          this.field_E = -110;
        }
        ij.a(-5516, this.getTooltip((byte) 37));
        return param1;
    }

    UiComponent(String param0, UiListener param1) {
        this(param0, Checkbox.field_X.field_a, param1);
    }

    final void appendDebugBody(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_z).append(",").append(this.field_p).append(" ").append(this.field_E).append("x").append(this.field_C);
          if (this.field_q != null) {
            discarded$1 = param3.append(" text=\"").append(this.field_q).append('"');
          }
          if (param1 != -2) {
            return;
          }
          if (this.field_D) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.containsFocus(true)) {
            discarded$3 = param3.append(" focused");
          }
          if (this.field_y != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.field_y instanceof UiComponent)) {
              discarded$5 = param3.append(this.field_y);
              if (var6 != 0) {
                param3 = this.appendWidgetDiagnostics(param3, false, param0 + 1, param2);
              }
            } else {
              param3 = this.appendWidgetDiagnostics(param3, false, param0 + 1, param2);
            }
          }
          if (null != this.field_n) {
            discarded$6 = param3.append(" listener=");
            if (!(this.field_n instanceof UiComponent)) {
              discarded$7 = param3.append(this.field_n);
              if (var6 == 0) {
                return;
              }
            }
            param3 = this.appendWidgetDiagnostics(param3, false, param0 + 1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ng.CB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    boolean onMouseWheel(int param0, byte param1, int param2, int param3, int param4, int param5, UiComponent param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 61) {
            return false;
          }
          this.toString();
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ng.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = PacketBuffer.decodeBase37Name(nh.encodeBase37Name(param0, -29667), -7067);
          if (var2 == null) {
            var2 = "";
          }
          if (param1 != -1) {
            UiComponent.i(-36);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ng.IB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    StringBuilder appendWidgetDiagnostics(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugDescription(-59, param2, param0, param3)) {
            this.appendDebugBody(param2, (byte) -2, param3, param0);
          }
          if (param1) {
            field_o = (IndexedSprite[]) null;
          }
          stackIn_6_0 = (StringBuilder) (param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ng.AA(");
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
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void handlePointerRelease(int param0, int param1, UiComponent param2, int param3, int param4, int param5) {
        try {
          this.field_k = param3;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ng.EA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        this.field_E = param0;
        this.field_z = param3;
        this.field_C = param4;
        if (param1 > 19) {
          this.field_p = param2;
          return;
        }
        UiComponent.g(-105);
        this.field_p = param2;
    }

    final boolean beginDebugDescription(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -34) {
            return true;
          }
          if (param3.containsKey(this)) {
            discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ng.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean containsPoint(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param0 < 55) {
          this.field_y = (WidgetPainter) null;
          if (param4 < param1 + this.field_z) {
            return false;
          }
          if (this.field_p + param2 > param3) {
            return false;
          }
          if (this.field_E + param1 + this.field_z <= param4) {
            return false;
          }
          if (param3 >= this.field_C + (this.field_p + param2)) {
            return false;
          }
          return true;
        }
        if (param4 < param1 + this.field_z) {
          return false;
        }
        if (this.field_p + param2 > param3) {
          return false;
        }
        stackIn_18_0 = (this.field_E + param1 + this.field_z > param4) && (param3 < this.field_C + (this.field_p + param2));
        return stackIn_18_0;
    }

    protected UiComponent() {
        this.field_B = 0;
        this.field_x = 0;
    }

    UiComponent(String param0, WidgetPainter param1, UiListener param2) {
        WidgetTextLayout var4 = null;
        this.field_B = 0;
        this.field_x = 0;
        try {
          this.field_y = param1;
          this.field_n = param2;
          this.field_q = param0;
          if (this.field_y instanceof WidgetTextLayout) {
            var4 = (WidgetTextLayout) ((Object) this.field_y);
            this.field_E = var4.getPreferredWidth(14871, this);
            this.field_C = var4.getPreferredWidth(this, 4592);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiComponent(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5) {
        this.field_B = 0;
        this.field_x = 0;
        try {
          this.field_y = param4;
          this.field_E = param2;
          this.field_z = param0;
          this.field_C = param3;
          this.field_p = param1;
          this.field_n = param5;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ng.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = 0.07;
        field_t = "you";
        field_v = "Please enter your date of birth to enable chat:";
        field_m = new int[]{2, 20, 21, 27, 6, 5, 13};
        field_w = "EXCLUSIVE";
    }
}
