/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiComponent extends IntrusiveNode {
    int field_t;
    static String field_l;
    String field_q;
    WidgetPainter field_r;
    int field_h;
    int field_n;
    String field_g;
    int field_v;
    TextLayout field_s;
    int field_j;
    static int field_u;
    static String field_p;
    UiListener field_o;
    boolean field_w;
    int field_k;
    static String field_m;
    int field_i;

    void drawLayer(byte param0, int param1, int param2, int param3) {
        if (param0 > -52) {
          return;
        }
        if (0 != param2) {
          return;
        }
        if (this.field_r != null) {
          this.field_r.paint(this, 5592405, param1, param3, true);
          return;
        }
    }

    final boolean beginDebugEntry(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -90) {
            this.processKey('ﾬ', (byte) 20, -10);
          }
          if (param2.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param2.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("qm.HB(");
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
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handleMouseWheel(int param0, int param1, int param2, int param3, int param4, int param5, UiComponent param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 0) {
            UiComponent.releaseStatics((byte) -21);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qm.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    boolean containsPoint(byte param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param0 != -47) {
          this.field_j = -27;
          if (param4 < param3 + this.field_n) {
            return false;
          }
          if (param1 + this.field_j > param2) {
            return false;
          }
          if (param4 >= param3 + (this.field_n + this.field_v)) {
            return false;
          }
          if (param2 >= param1 + this.field_j + this.field_k) {
            return false;
          }
          return true;
        }
        if (param4 < param3 + this.field_n) {
          return false;
        }
        if (param1 + this.field_j > param2) {
          return false;
        }
        stackIn_18_0 = (param4 < param3 + (this.field_n + this.field_v)) && (param2 < param1 + this.field_j + this.field_k);
        return stackIn_18_0;
    }

    int getTopLayer(int param0) {
        if (param0 != 0) {
          return -80;
        }
        return 0;
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param0;
        this.field_v = param2;
        this.field_j = param1;
        this.field_n = param3;
        if (param4 >= -49) {
          field_p = (String) null;
        }
    }

    final void drawLayersAndTooltip(int param0, boolean param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = this.getTopLayer(0);
        var5_int = 0;
        while (var5_int <= var4) {
          this.drawLayer((byte) -99, param0, var5_int, param2);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = sk.a(-14150);
        if (!param1) {
          return;
        }
        if (var5 != null) {
          MusicCrossfadeStream.field_n.drawText(var5, (byte) 60, ProxySocketConnector.field_p, IntrusiveNodeHashTable.field_p);
        }
    }

    boolean focusNext(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          this.field_w = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 != -17) {
          return;
        }
        field_l = null;
    }

    boolean isFocused(int param0) {
        if (param0 != -2116) {
          this.getTopLayer(8);
          return false;
        }
        return false;
    }

    final void refreshLayout(byte param0) {
        if (param0 > 44) {
          this.setBounds(this.field_k, this.field_j, this.field_v, this.field_n, -114);
          return;
        }
        Hashtable var3 = (Hashtable) null;
        this.appendDebugTree((StringBuilder) null, -107, (Hashtable) null, (byte) 106);
        this.setBounds(this.field_k, this.field_j, this.field_v, this.field_n, -114);
    }

    final boolean processKey(char param0, byte param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (this.isFocused(-2116)) {
          if (this.handleKeyInput(this, (byte) -123, param0, param2)) {
            return true;
          }
          var4 = param2;
          if (var4 != 80) {
            var4 = 123 % ((87 - param1) / 35);
            return false;
          }
          return this.focusNext(0, this);
        }
        var4Lifetime1 = param2;
        if (var4Lifetime1 != 80) {
          var4Lifetime1 = 123 % ((87 - param1) / 35);
          return false;
        }
        return this.focusNext(0, this);
    }

    final boolean processPointerInput(int param0, int param1, boolean param2, byte param3) {
        int var5;
        int var7;
        DraggableWidget var8;
        DraggableWidget var9;
        DraggableWidget var10;
        DraggableWidget var11;
        DraggableWidget var12;
        DraggableWidget var13;
        DraggableWidget var14;
        DraggableWidget var15;
        DraggableWidget var16;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param3 >= -75) {
          return false;
        }
        this.updatePointer(this, param0, 170, param1);
        var5 = this.isFocused(-2116) ? 1 : 0;
        if (!param2) {
          if (var5 != 0 &&
            WrappedTextLayout.field_r != 0) {
            this.blur((byte) 29);
          }
          la.field_f = PacketBuffer.field_m;
          qg.a(38, this.getTooltip(false));
          return param2;
        }
        if (SingleChildContainer.field_y == 0) {
          if (0 == WrappedTextLayout.field_r) {
            if (0 == PacketBuffer.field_m &&
              la.field_f != 0) {
              this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
              var8 = MenuInputState.field_i;
              if (var8 != null) {
                if (var8.field_o instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var8.field_o)).onWidgetDropped(var8, (byte) 71, (DropTargetWidget) null);
                }
                MenuInputState.field_i = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                WrappedTextLayout.field_r != 0) {
                this.blur((byte) 29);
              }
            }
            la.field_f = PacketBuffer.field_m;
            qg.a(38, this.getTooltip(false));
            return param2;
          }
          if (!this.handlePointerPress(ja.field_s, WrappedTextLayout.field_r, this, param1, 10, pb.field_h, param0)) {
            if (var5 == 0) {
              if (0 == PacketBuffer.field_m &&
                la.field_f != 0) {
                this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
                var9 = MenuInputState.field_i;
                if (var9 != null) {
                  if (!(var9.field_o instanceof WidgetDropListener)) {
                    MenuInputState.field_i = null;
                  } else {
                    ((WidgetDropListener) (var9.field_o)).onWidgetDropped(var9, (byte) 71, (DropTargetWidget) null);
                    MenuInputState.field_i = null;
                  }
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  WrappedTextLayout.field_r != 0) {
                  this.blur((byte) 29);
                }
              }
              la.field_f = PacketBuffer.field_m;
              qg.a(38, this.getTooltip(false));
              return param2;
            }
            this.blur((byte) 29);
            if (var7 != 0) {
              param2 = false;
            }
          } else {
            param2 = false;
          }
          if (0 != PacketBuffer.field_m) {
            la.field_f = PacketBuffer.field_m;
            qg.a(38, this.getTooltip(false));
            return param2;
          }
          if (la.field_f == 0) {
            la.field_f = PacketBuffer.field_m;
            qg.a(38, this.getTooltip(false));
            return param2;
          }
          this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
          var10 = MenuInputState.field_i;
          if (var10 != null) {
            if (var10.field_o instanceof WidgetDropListener) {
              ((WidgetDropListener) (var10.field_o)).onWidgetDropped(var10, (byte) 71, (DropTargetWidget) null);
            }
            MenuInputState.field_i = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            WrappedTextLayout.field_r != 0) {
            this.blur((byte) 29);
          }
          la.field_f = PacketBuffer.field_m;
          qg.a(38, this.getTooltip(false));
          return param2;
        }
        if (var5 == 0) {
          if (0 == WrappedTextLayout.field_r) {
            if (0 == PacketBuffer.field_m &&
              la.field_f != 0) {
              this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
              var11 = MenuInputState.field_i;
              if (var11 != null) {
                if (var11.field_o instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var11.field_o)).onWidgetDropped(var11, (byte) 71, (DropTargetWidget) null);
                }
                MenuInputState.field_i = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                WrappedTextLayout.field_r != 0) {
                this.blur((byte) 29);
              }
            }
            la.field_f = PacketBuffer.field_m;
            qg.a(38, this.getTooltip(false));
            return param2;
          }
          if (!this.handlePointerPress(ja.field_s, WrappedTextLayout.field_r, this, param1, 10, pb.field_h, param0)) {
            if (0 == PacketBuffer.field_m &&
              la.field_f != 0) {
              this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
              var12 = MenuInputState.field_i;
              if (var12 != null) {
                if (!(var12.field_o instanceof WidgetDropListener)) {
                  MenuInputState.field_i = null;
                } else {
                  ((WidgetDropListener) (var12.field_o)).onWidgetDropped(var12, (byte) 71, (DropTargetWidget) null);
                  MenuInputState.field_i = null;
                }
              }
              if (var7 != 0 &&
                var5 != 0 &&
                WrappedTextLayout.field_r != 0) {
                this.blur((byte) 29);
              }
            }
            la.field_f = PacketBuffer.field_m;
            qg.a(38, this.getTooltip(false));
            return param2;
          }
          param2 = false;
          if (0 != PacketBuffer.field_m) {
            la.field_f = PacketBuffer.field_m;
            qg.a(38, this.getTooltip(false));
            return param2;
          }
          if (la.field_f == 0) {
            la.field_f = PacketBuffer.field_m;
            qg.a(38, this.getTooltip(false));
            return param2;
          }
          this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
          var13 = MenuInputState.field_i;
          if (var13 != null) {
            if (var13.field_o instanceof WidgetDropListener) {
              ((WidgetDropListener) (var13.field_o)).onWidgetDropped(var13, (byte) 71, (DropTargetWidget) null);
            }
            MenuInputState.field_i = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            WrappedTextLayout.field_r != 0) {
            this.blur((byte) 29);
          }
          la.field_f = PacketBuffer.field_m;
          qg.a(38, this.getTooltip(false));
          return param2;
        }
        this.handleMouseWheel(param1, param0, EmailLoginCredentials.field_g, MenuButtonPanel.field_I, SingleChildContainer.field_y, 0, this);
        if (0 == WrappedTextLayout.field_r) {
          if (0 == PacketBuffer.field_m &&
            la.field_f != 0) {
            this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
            var14 = MenuInputState.field_i;
            if (var14 != null) {
              if (var14.field_o instanceof WidgetDropListener) {
                ((WidgetDropListener) (var14.field_o)).onWidgetDropped(var14, (byte) 71, (DropTargetWidget) null);
              }
              MenuInputState.field_i = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              WrappedTextLayout.field_r != 0) {
              this.blur((byte) 29);
            }
          }
          la.field_f = PacketBuffer.field_m;
          qg.a(38, this.getTooltip(false));
          return param2;
        }
        if (!this.handlePointerPress(ja.field_s, WrappedTextLayout.field_r, this, param1, 10, pb.field_h, param0)) {
          this.blur((byte) 29);
          if (var7 != 0) {
            param2 = false;
          }
        } else {
          param2 = false;
        }
        if (0 != PacketBuffer.field_m) {
          la.field_f = PacketBuffer.field_m;
          qg.a(38, this.getTooltip(false));
          return param2;
        }
        if (la.field_f == 0) {
          la.field_f = PacketBuffer.field_m;
          qg.a(38, this.getTooltip(false));
          return param2;
        }
        this.handlePointerRelease(MenuButtonPanel.field_I, -20592, EmailLoginCredentials.field_g, param1, param0, this);
        var16 = MenuInputState.field_i;
        if (var16 != null) {
          if (var16.field_o instanceof WidgetDropListener) {
            ((WidgetDropListener) (var16.field_o)).onWidgetDropped(var16, (byte) 71, (DropTargetWidget) null);
          }
          MenuInputState.field_i = null;
        }
        if (var7 != 0 &&
          var5 != 0 &&
          WrappedTextLayout.field_r != 0) {
          this.blur((byte) 29);
        }
        la.field_f = PacketBuffer.field_m;
        qg.a(38, this.getTooltip(false));
        return param2;
    }

    boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -120) {
            return false;
          }
          this.field_o = (UiListener) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qm.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void handlePointerRelease(int param0, int param1, int param2, int param3, int param4, UiComponent param5) {
        try {
          if (param1 != -20592) {
            this.field_q = (String) null;
          }
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "qm.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void blur(byte param0) {
        if (param0 != 29) {
          this.drawLayer((byte) -10, 57, 127, -111);
        }
    }

    StringBuilder appendDebugTree(StringBuilder param0, int param1, Hashtable param2, byte param3) {
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
          if (this.beginDebugEntry(param0, (byte) -90, param2, param1)) {
            this.appendDebugSummary(param0, param1, param2, 1);
          }
          var5_int = -122 % ((param3 - 50) / 60);
          stackIn_3_0 = (StringBuilder) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qm.FA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        return this.appendDebugTree(new StringBuilder(), 0, new Hashtable(), (byte) -32).toString();
    }

    boolean handlePointerPress(int param0, int param1, UiComponent param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.containsPoint((byte) -47, param3, param0, param6, param5)) {
            this.field_t = param1;
          }
          var8_int = 106 % ((param4 + 42) / 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qm.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void appendDebugSummary(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_n).append(",").append(this.field_j).append(" ").append(this.field_v).append("x").append(this.field_k);
          if (null != this.field_g) {
            discarded$1 = param0.append(" text=\"").append(this.field_g).append('"');
          }
          if (this.field_w) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.isFocused(param3 - 2117)) {
            discarded$3 = param0.append(" focused");
          }
          if (null != this.field_r) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_r instanceof UiComponent)) {
              discarded$5 = param0.append(this.field_r);
              if (var6 != 0) {
                param0 = this.appendDebugTree(param0, param1 + 1, param2, (byte) 117);
              }
            } else {
              param0 = this.appendDebugTree(param0, param1 + 1, param2, (byte) 117);
            }
          }
          if (this.field_o != null) {
            discarded$6 = param0.append(" listener=");
            if (this.field_o instanceof UiComponent) {
              param0 = this.appendDebugTree(param0, 1 + param1, param2, (byte) -77);
              if (var6 != 0) {
                discarded$7 = param0.append(this.field_o);
              }
            } else {
              discarded$7 = param0.append(this.field_o);
            }
          }
          if (param3 != 1) {
            this.setBounds(-66, 16, 33, 3, 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("qm.DB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    String getTooltip(boolean param0) {
        if (param0) {
          this.processKey('ﾗ', (byte) 86, -60);
          if (this.field_w) {
            return this.field_q;
          }
          return null;
        }
        if (this.field_w) {
          return this.field_q;
        }
        return null;
    }

    void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPoint((byte) -47, param3, MenuButtonPanel.field_I, param1, EmailLoginCredentials.field_g) ? 1 : 0;
          if (param2 != 170) {
            field_p = (String) null;
          }
          stackIn_4_0 = var5_int;
          if (this.field_w) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if (stackIn_4_0 == stackIn_5_1) {
            stackIn_10_1 = (var5_int != 0);
            this.field_w = stackIn_10_1;
            if (null != this.field_o) {
              if (!(this.field_o instanceof HoverListener)) {
                return;
              }
              ((HoverListener) (this.field_o)).onHoverChanged(53, this, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qm.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void attachInputListeners(java.awt.Canvas param0, byte param1) {
        try {
          fj.detachKeyboardInput((java.awt.Component) ((Object) param0), 115);
          MenuInputState.detachMouseInput((java.awt.Component) ((Object) param0), 0);
          if (null != StrongCacheEntry.field_w) {
            StrongCacheEntry.field_w.detach((java.awt.Component) ((Object) param0), (byte) -22);
          }
          int var2_int = 17 / ((-7 - param1) / 49);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "qm.KB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    UiComponent(String param0, UiListener param1) {
        this(param0, MusicCrossfadeStream.field_n.field_r, param1);
    }

    protected UiComponent() {
        this.field_h = 0;
        this.field_i = 0;
    }

    UiComponent(String param0, WidgetPainter param1, UiListener param2) {
        WidgetTextLayout var4 = null;
        this.field_h = 0;
        this.field_i = 0;
        try {
          this.field_o = param2;
          this.field_g = param0;
          this.field_r = param1;
          if (this.field_r instanceof WidgetTextLayout) {
            var4 = (WidgetTextLayout) ((Object) this.field_r);
            this.field_v = var4.getPreferredWidth((byte) 124, this);
            this.field_k = var4.getPreferredHeight(this, 1);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "qm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiComponent(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5) {
        this.field_h = 0;
        this.field_i = 0;
        try {
          this.field_n = param0;
          this.field_k = param3;
          this.field_v = param2;
          this.field_r = param4;
          this.field_j = param1;
          this.field_o = param5;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Jumping:";
        field_p = "<%0> is not a member, and cannot play with the current options.";
        field_m = "Public";
    }
}
