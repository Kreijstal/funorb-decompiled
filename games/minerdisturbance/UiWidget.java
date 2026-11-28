/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    static BufferedRandomAccessFile field_z;
    static String field_C;
    WidgetEventListener field_y;
    TextLayout field_B;
    int field_o;
    int field_w;
    int field_p;
    static String field_r;
    int field_u;
    String field_s;
    String field_n;
    boolean field_x;
    int field_v;
    int field_t;
    int field_q;
    WidgetRenderer field_A;

    int getMaximumRenderLayer(byte param0) {
        if (param0 > -88) {
          return 118;
        }
        return 0;
    }

    void drawWidget(byte param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          if (param0 == 4) {
            return;
          }
          this.drawWidget((byte) -96, -77, 94, -43);
          return;
        }
        if (null == this.field_A) {
          if (param0 == 4) {
            return;
          }
          this.drawWidget((byte) -96, -77, 94, -43);
          return;
        }
        this.field_A.paintWidget(12088, param1, this, param2, true);
        if (param0 == 4) {
          return;
        }
        this.drawWidget((byte) -96, -77, 94, -43);
    }

    boolean handleKey(char param0, UiWidget param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -79) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("fe.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void refreshLayout(int param0) {
        if (param0 == -5257) {
          this.setBounds(this.field_q, -74, this.field_u, this.field_v, this.field_t);
          return;
        }
        this.field_t = 71;
        this.setBounds(this.field_q, -74, this.field_u, this.field_v, this.field_t);
    }

    UiWidget(String param0, WidgetEventListener param1) {
        this(param0, AccountRequestState.field_c.field_b, param1);
    }

    public final String toString() {
        return this.appendDebugTree((byte) -70, new Hashtable(), 0, new StringBuilder()).toString();
    }

    boolean handleWheel(int param0, int param1, int param2, int param3, byte param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= -53) {
            return false;
          }
          this.getMaximumRenderLayer((byte) -86);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("fe.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    void updatePointer(int param0, int param1, byte param2, UiWidget param3) {
        int var5_int = 0;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPointer(NodeHashTableIterator.field_e, param1, param0, nk.field_w, -102) ? 1 : 0;
          if (param2 < 49) {
            this.field_A = (WidgetRenderer) null;
          }
          stackIn_4_0 = this.field_x;
          if (var5_int != 0) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            stackIn_9_1 = (var5_int != 0);
            this.field_x = stackIn_9_1;
            if (this.field_y != null &&
              this.field_y instanceof WidgetHoverListener) {
              ((WidgetHoverListener) (this.field_y)).onWidgetHoverChanged(-14656, this, var5_int != 0);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("fe.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static pf f(int param0) {
        String var1 = null;
        if (param0 == 0) {
          var1 = fc.b((byte) 121);
          if (var1 != null &&
            var1.indexOf('@') >= 0) {
            var1 = "";
          }
          return new pf(fc.b((byte) 126), PcmOutputWorker.a((byte) -110));
        }
        return (pf) null;
    }

    final static void e(int param0) {
        if (param0 == 26313) {
          kb.field_b = new AccountRegistrationPanel();
          de.field_a.a((byte) -65, (UiWidget) (kb.field_b));
          return;
        }
        UiWidget.a((byte) 55, 'ﾗ', (CharSequence) null);
        kb.field_b = new AccountRegistrationPanel();
        de.field_a.a((byte) -65, (UiWidget) (kb.field_b));
    }

    final boolean processKeyInput(byte param0, int param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (this.isFocused(-91)) {
          if (this.handleKey(param2, this, (byte) -79, param1)) {
            return true;
          }
          if (param0 == -65) {
            var4 = param1;
            if (var4 != 80) {
              return false;
            }
            return this.takeFocus(this, 125);
          }
          UiWidget.l(-56);
          var4Lifetime3 = param1;
          if (var4Lifetime3 != 80) {
            return false;
          }
          return this.takeFocus(this, 125);
        }
        if (param0 != -65) {
          UiWidget.l(-56);
          var4Lifetime1 = param1;
          if (var4Lifetime1 != 80) {
            return false;
          }
          return this.takeFocus(this, 125);
        }
        var4Lifetime2 = param1;
        if (var4Lifetime2 != 80) {
          return false;
        }
        return this.takeFocus(this, 125);
    }

    StringBuilder appendDebugTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(param3, true, param2, param1)) {
            this.appendDebugProperties(param1, param3, 34, param2);
          }
          if (param0 != -70) {
            this.field_B = (TextLayout) null;
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fe.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean containsPointer(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -73) {
          return true;
        }
        if (param3 < param1 + this.field_u) {
          return false;
        }
        if (param2 + this.field_t > param0) {
          return false;
        }
        if (param1 + (this.field_u + this.field_v) <= param3) {
          return false;
        }
        if (this.field_q + (param2 + this.field_t) > param0) {
          return true;
        }
        return false;
    }

    public static void l(int param0) {
        field_C = null;
        field_z = null;
        field_r = null;
        if (param0 > -48) {
          UiWidget.a((byte) -5, '\031', (CharSequence) null);
        }
    }

    void pointerReleased(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        try {
          this.field_w = param5;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "fe.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final boolean processPointerInput(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var7;
        DraggableWidgetContainer var8;
        DraggableWidgetContainer var9;
        DraggableWidgetContainer var10;
        DraggableWidgetContainer var11;
        var7 = MinerDisturbance.field_ab;
        this.updatePointer(param1, param2, (byte) 53, this);
        var5 = this.isFocused(param3 ^ 91) ? 1 : 0;
        if (!param0) {
          if (var5 != 0 &&
            0 != jk.field_ab) {
            this.blur(4966);
            if (var7 != 0) {
              if (0 != ki.field_n) {
                this.handleWheel(param1, ki.field_n, NodeHashTableIterator.field_e, nk.field_w, (byte) -123, this, param2);
              }
              if (jk.field_ab != 0) {
                if (this.pointerPressed(wi.field_w, param1, param3 + 0, GameAppletShell.field_e, jk.field_ab, this, param2)) {
                  param0 = false;
                }
                this.blur(4966);
              }
              if (CipherPacketBuffer.field_B == 0 &&
                nb.field_f != 0) {
                this.pointerReleased(param2, NodeHashTableIterator.field_e, nk.field_w, param1, this, 0);
                var8 = PcmOutputWorker.field_d;
                if (var8 != null) {
                  if (var8.field_y instanceof WidgetDropListener) {
                    ((WidgetDropListener) (var8.field_y)).widgetDropped(27055, (DropTargetWidgetContainer) null, var8);
                  }
                  PcmOutputWorker.field_d = null;
                }
              }
            }
          }
        } else {
          if (0 != ki.field_n) {
            if (var5 == 0) {
              if (jk.field_ab != 0 &&
                this.pointerPressed(wi.field_w, param1, param3 + 0, GameAppletShell.field_e, jk.field_ab, this, param2)) {
                param0 = false;
                if (var7 == 0) {
                }
              }
              if (CipherPacketBuffer.field_B != 0) {
                nb.field_f = CipherPacketBuffer.field_B;
                if (param3 != 0) {
                  return true;
                }
                tg.a(-95, this.getTooltipText(-27867));
                return param0;
              }
              if (nb.field_f == 0) {
                nb.field_f = CipherPacketBuffer.field_B;
                if (param3 != 0) {
                  return true;
                }
                tg.a(-95, this.getTooltipText(-27867));
                return param0;
              }
              this.pointerReleased(param2, NodeHashTableIterator.field_e, nk.field_w, param1, this, 0);
              var9 = PcmOutputWorker.field_d;
              if (var9 != null) {
                if (var9.field_y instanceof WidgetDropListener) {
                  ((WidgetDropListener) (var9.field_y)).widgetDropped(27055, (DropTargetWidgetContainer) null, var9);
                }
                PcmOutputWorker.field_d = null;
              }
              nb.field_f = CipherPacketBuffer.field_B;
              if (param3 != 0) {
                return true;
              }
              tg.a(-95, this.getTooltipText(-27867));
              return param0;
            }
            this.handleWheel(param1, ki.field_n, NodeHashTableIterator.field_e, nk.field_w, (byte) -123, this, param2);
          }
          regionExit1: {
            if (jk.field_ab != 0) {
              if (this.pointerPressed(wi.field_w, param1, param3 + 0, GameAppletShell.field_e, jk.field_ab, this, param2)) {
                param0 = false;
                if (var7 == 0) {
                  break regionExit1;
                }
              }
              if (var5 != 0) {
                this.blur(4966);
                if (CipherPacketBuffer.field_B == 0 &&
                  nb.field_f != 0) {
                  this.pointerReleased(param2, NodeHashTableIterator.field_e, nk.field_w, param1, this, 0);
                  var10 = PcmOutputWorker.field_d;
                  if (var10 == null) {
                    nb.field_f = CipherPacketBuffer.field_B;
                    if (param3 != 0) {
                      return true;
                    }
                    tg.a(-95, this.getTooltipText(-27867));
                    return param0;
                  }
                  if (!(var10.field_y instanceof WidgetDropListener)) {
                    PcmOutputWorker.field_d = null;
                    nb.field_f = CipherPacketBuffer.field_B;
                    if (param3 != 0) {
                      return true;
                    }
                    tg.a(-95, this.getTooltipText(-27867));
                    return param0;
                  }
                  ((WidgetDropListener) (var10.field_y)).widgetDropped(27055, (DropTargetWidgetContainer) null, var10);
                  PcmOutputWorker.field_d = null;
                  nb.field_f = CipherPacketBuffer.field_B;
                  if (param3 != 0) {
                    return true;
                  }
                  tg.a(-95, this.getTooltipText(-27867));
                  return param0;
                }
                nb.field_f = CipherPacketBuffer.field_B;
                if (param3 != 0) {
                  return true;
                }
                tg.a(-95, this.getTooltipText(-27867));
                return param0;
              }
            }
          }
          if (CipherPacketBuffer.field_B == 0 &&
            nb.field_f != 0) {
            this.pointerReleased(param2, NodeHashTableIterator.field_e, nk.field_w, param1, this, 0);
            var11 = PcmOutputWorker.field_d;
            if (var11 != null) {
              if (var11.field_y instanceof WidgetDropListener) {
                ((WidgetDropListener) (var11.field_y)).widgetDropped(27055, (DropTargetWidgetContainer) null, var11);
              }
              PcmOutputWorker.field_d = null;
            }
            nb.field_f = CipherPacketBuffer.field_B;
            if (param3 != 0) {
              return true;
            }
            tg.a(-95, this.getTooltipText(-27867));
            return param0;
          }
        }
        nb.field_f = CipherPacketBuffer.field_B;
        if (param3 != 0) {
          return true;
        }
        tg.a(-95, this.getTooltipText(-27867));
        return param0;
    }

    boolean takeFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 119) {
            return false;
          }
          field_C = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fe.UA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void drawAllLayers(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6_int;
        String var6;
        int var7;
        var7 = MinerDisturbance.field_ab;
        var4 = this.getMaximumRenderLayer((byte) -92);
        var5 = -64 % ((-61 - param2) / 51);
        var6_int = 0;
        while (var4 >= var6_int) {
          this.drawWidget((byte) 4, param0, param1, var6_int);
          var6_int++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        var6 = a.a(true);
        if (var6 != null) {
          AccountRequestState.field_c.a(ng.field_l, lj.field_q, var6, (byte) 49);
        }
    }

    final boolean beginDebugTreeEntry(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            UiWidget.f(63);
          }
          if (param3.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fe.KA(");
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
          throw lj.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        if (param1 < -33) {
          this.field_v = param3;
          this.field_q = param0;
          this.field_u = param2;
          this.field_t = param4;
          return;
        }
        this.handleWheel(99, -116, 119, 127, (byte) -73, (UiWidget) null, 7);
        this.field_v = param3;
        this.field_q = param0;
        this.field_u = param2;
        this.field_t = param4;
    }

    boolean isFocused(int param0) {
        int var2 = -93 / ((-33 - param0) / 45);
        return false;
    }

    final static boolean j(int param0) {
        int var1 = 95 % ((param0 - 10) / 57);
        return 250 < mn.field_x ? true : false;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        char stackOut_5_0;
        var6 = MinerDisturbance.field_ab;
        try {
          var3_int = 0;
          if (param0 <= 26) {
            field_r = (String) null;
          }
          var4 = param2.length();
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 <= var5))) {
            stackOut_5_0 = param1;
            stackIn_10_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var6 == 0) {
              if (stackIn_6_0 == param2.charAt(var5)) {
                var3_int++;
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = var3_int;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fe.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    String getTooltipText(int param0) {
        if (param0 != -27867) {
          return (String) null;
        }
        if (!this.field_x) {
          return null;
        }
        return this.field_n;
    }

    final void appendDebugProperties(Hashtable param0, StringBuilder param1, int param2, int param3) {
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
        var6 = MinerDisturbance.field_ab;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_u).append(",").append(this.field_t).append(" ").append(this.field_v).append("x").append(this.field_q);
          if (null != this.field_s) {
            discarded$1 = param1.append(" text=\"").append(this.field_s).append('"');
          }
          if (this.field_x) {
            discarded$2 = param1.append(" mouseover");
          }
          if (param2 != 34) {
            UiWidget.j(27);
          }
          if (this.isFocused(48)) {
            discarded$3 = param1.append(" focused");
          }
          if (null != this.field_A) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_A instanceof UiWidget) {
              param1 = this.appendDebugTree((byte) -70, param0, 1 + param3, param1);
              if (var6 != 0) {
                discarded$5 = param1.append(this.field_A);
              }
            } else {
              discarded$5 = param1.append(this.field_A);
            }
          }
          if (null != this.field_y) {
            discarded$6 = param1.append(" listener=");
            if (this.field_y instanceof UiWidget) {
              param1 = this.appendDebugTree((byte) -70, param0, param3 + 1, param1);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param1.append(this.field_y);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("fe.MA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void blur(int param0) {
        if (param0 != 4966) {
          this.field_s = (String) null;
        }
    }

    protected UiWidget() {
        this.field_p = 0;
        this.field_o = 0;
    }

    boolean pointerPressed(int param0, int param1, int param2, int param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.appendDebugProperties((Hashtable) null, (StringBuilder) null, 107, -94);
          }
          if (!this.containsPointer(param3, param6, param1, param0, -120)) {
            return false;
          }
          this.field_w = param4;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("fe.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param6).append(')').toString());
        }
    }

    UiWidget(String param0, WidgetRenderer param1, WidgetEventListener param2) {
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
        this.field_p = 0;
        this.field_o = 0;
        try {
          this.field_A = param1;
          this.field_y = param2;
          this.field_s = param0;
          if (this.field_A instanceof TextWidgetRenderer) {
            var4 = (TextWidgetRenderer) ((Object) this.field_A);
            this.field_v = var4.getPreferredWidth(14463, this);
            this.field_q = var4.getPreferredHeight(30, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("fe.<init>(");
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
          throw lj.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5) {
        this.field_p = 0;
        this.field_o = 0;
        try {
          this.field_u = param0;
          this.field_v = param2;
          this.field_y = param5;
          this.field_t = param1;
          this.field_q = param3;
          this.field_A = param4;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "fe.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Connection lost. <%0>";
        field_C = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
