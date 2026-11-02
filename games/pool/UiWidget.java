/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    int widgetY;
    int textOffsetX;
    static vh field_A;
    int widgetWidth;
    int widgetHeight;
    WidgetPainter renderer;
    boolean pointerInside;
    static int field_u;
    int textOffsetY;
    static int field_o;
    String widgetText;
    String hoverText;
    op field_x;
    static java.math.BigInteger field_q;
    int pressedPointerButton;
    int widgetX;
    static int field_B;
    WidgetListener listener;
    static String field_E;
    static String youAreOnXServer;

    UiWidget(String param0, WidgetListener param1) {
        this(param0, db.field_Sb.field_c, param1);
    }

    void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        int var5_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 958) {
            return;
          }
          var5_int = this.containsPointer(param2, param3, wn.field_i, param1 - 959, DebouncedValidationProvider.field_f) ? 1 : 0;
          if (var5_int != (this.pointerInside ? 1 : 0)) {
            stackIn_7_1 = (var5_int != 0);
            this.pointerInside = stackIn_7_1;
            if (null != this.listener) {
              if (!(this.listener instanceof PointerHoverListener)) {
                return;
              }
              ((PointerHoverListener) (this.listener)).onPointerInsideChanged(var5_int != 0, this, -101);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ei.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_A = null;
        if (param0 != 80) {
          return;
        }
        field_E = null;
        youAreOnXServer = null;
    }

    boolean handlePointerWheel(UiWidget param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -126) {
            var9 = (UiWidget) null;
            this.updatePointerState((UiWidget) null, 51, 64, -111);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ei.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean requestKeyboardFocus(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 44 / ((param1 + 43) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ei.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == field_E) {
            return false;
          }
          if (param0 != -71) {
            field_A = (vh) null;
          }
          stackIn_9_0 = !(param1.toLowerCase().indexOf(field_E.toLowerCase()) < 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ei.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    int getLastRenderPass(int param0) {
        if (param0 < 33) {
          this.getHoverText(-86);
          return 0;
        }
        return 0;
    }

    StringBuilder appendWidgetDiagnostics(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
          if (this.beginWidgetDiagnosticVisit(param1, param2, param0, -1)) {
            this.appendWidgetDiagnosticProperties(1, param2, param0, param1);
          }
          if (param3 > 13) {
            stackIn_6_0 = (StringBuilder) (param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ei.EA(");
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
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            return false;
          }
          field_o = 14;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ei.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean dispatchKeyInputOrRequestFocus(int param0, int param1, char param2) {
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        if (param0 != -81) {
          this.pointerInside = true;
          if (this.hasKeyboardFocus(param0 - 11) &&
            this.handleKeyInput(param2, param1, false, this)) {
            return true;
          }
          var4 = param1;
          if (var4 == 80) {
            return this.requestKeyboardFocus(this, (byte) -103);
          }
          return false;
        }
        if (!this.hasKeyboardFocus(param0 - 11)) {
          var4Lifetime1 = param1;
          if (var4Lifetime1 == 80) {
            return this.requestKeyboardFocus(this, (byte) -103);
          }
          return false;
        }
        if (this.handleKeyInput(param2, param1, false, this)) {
          return true;
        }
        var4Lifetime2 = param1;
        if (var4Lifetime2 == 80) {
          return this.requestKeyboardFocus(this, (byte) -103);
        }
        return false;
    }

    void setWidgetBounds(int param0, int param1, int param2, boolean param3, int param4) {
        this.widgetY = param4;
        if (!param3) {
          this.widgetWidth = param0;
          this.widgetX = param1;
          this.widgetHeight = param2;
          return;
        }
        this.hasKeyboardFocus(43);
        this.widgetWidth = param0;
        this.widgetX = param1;
        this.widgetHeight = param2;
    }

    final boolean containsPointer(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        UiWidget var7;
        if (param3 != -1) {
          var7 = (UiWidget) null;
          this.handlePointerPress((UiWidget) null, 25, false, 45, 66, -10, 22);
          if (param0 + this.widgetX > param2) {
            return false;
          }
          if (param4 < this.widgetY + param1) {
            return false;
          }
          if (this.widgetX + param0 + this.widgetWidth <= param2) {
            return false;
          }
          if (param4 >= this.widgetHeight + this.widgetY + param1) {
            return false;
          }
          return true;
        }
        if (param0 + this.widgetX > param2) {
          return false;
        }
        if (param4 < this.widgetY + param1) {
          return false;
        }
        stackIn_18_0 = (this.widgetX + param0 + this.widgetWidth > param2) && (param4 < this.widgetHeight + this.widgetY + param1);
        return stackIn_18_0;
    }

    final static Sprite[] a(byte param0, int param1) {
        Sprite[] var4 = new Sprite[9];
        Sprite[] var2 = var4;
        if (param0 > 4) {
          var4[4] = ad.a(param1, 64, 7);
          return var2;
        }
        String var3 = (String) null;
        UiWidget.a((byte) 3, (String) null);
        var4[4] = ad.a(param1, 64, 7);
        return var2;
    }

    final void appendWidgetDiagnosticProperties(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
        RuntimeException var5 = null;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.widgetX).append(",").append(this.widgetY).append(" ").append(this.widgetWidth).append("x").append(this.widgetHeight);
          if (null != this.widgetText) {
            discarded$1 = param2.append(" text=\"").append(this.widgetText).append('"');
          }
          if (this.pointerInside) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.hasKeyboardFocus(123)) {
            discarded$3 = param2.append(" focused");
          }
          if (param0 != 1) {
            this.widgetHeight = -51;
          }
          if (this.renderer != null) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.renderer instanceof UiWidget)) {
              discarded$5 = param2.append(this.renderer);
            } else {
              param2 = this.appendWidgetDiagnostics(param2, param3 + 1, param1, 25);
            }
          }
          if (this.listener != null) {
            discarded$6 = param2.append(" listener=");
            if (!(this.listener instanceof UiWidget)) {
              discarded$7 = param2.append(this.listener);
            } else {
              param2 = this.appendWidgetDiagnostics(param2, param3 + 1, param1, 75);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ei.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean hasKeyboardFocus(int param0) {
        int var2 = 101 % ((7 - param0) / 48);
        return false;
    }

    final boolean processPointerFrame(int param0, int param1, boolean param2, int param3) {
        int var5;
        DraggableWidget var7;
        DraggableWidget var8;
        DraggableWidget var9;
        DraggableWidget var10;
        DraggableWidget var11;
        DraggableWidget var12;
        DraggableWidget var13;
        DraggableWidget var14;
        DraggableWidget var15;
        DraggableWidget var16;
        DraggableWidget var17;
        int var5Lifetime1;
        this.updatePointerState(this, 958, param1, param3);
        if (param0 <= -118) {
          var5 = this.hasKeyboardFocus(85) ? 1 : 0;
          if (!param2) {
            if (var5 != 0 &&
              0 != MatchingTextValidator.field_s) {
              this.clearKeyboardFocus((byte) 99);
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
          if (wp.field_d != 0 &&
            var5 != 0) {
            this.handlePointerWheel(this, wn.field_i, wp.field_d, param3, (byte) -127, DebouncedValidationProvider.field_f, param1);
            if (MatchingTextValidator.field_s != 0) {
              if (this.handlePointerPress(this, param1, true, MatchingTextValidator.field_s, UsernameAvailabilityValidator.field_o, param3, DialogLayer.field_W)) {
                param2 = false;
              } else {
                this.clearKeyboardFocus((byte) 99);
              }
            }
            if (cd.field_b != 0) {
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.getHoverText(-94));
              return param2;
            }
            if (sa.field_t == 0) {
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.getHoverText(-94));
              return param2;
            }
            this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
            var7 = PasswordValidator.field_u;
            if (var7 != null) {
              if (var7.listener instanceof DropListener) {
                ((DropListener) (var7.listener)).onDrop(-87, (DropTargetWidget) null, var7);
              }
              PasswordValidator.field_u = null;
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
          if (MatchingTextValidator.field_s != 0) {
            if (!this.handlePointerPress(this, param1, true, MatchingTextValidator.field_s, UsernameAvailabilityValidator.field_o, param3, DialogLayer.field_W)) {
              if (var5 == 0) {
                if (cd.field_b != 0) {
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, this.getHoverText(-94));
                  return param2;
                }
                if (sa.field_t == 0) {
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, this.getHoverText(-94));
                  return param2;
                }
                this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
                var8 = PasswordValidator.field_u;
                if (var8 != null) {
                  if (var8.listener instanceof DropListener) {
                    ((DropListener) (var8.listener)).onDrop(-87, (DropTargetWidget) null, var8);
                  }
                  PasswordValidator.field_u = null;
                }
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.getHoverText(-94));
                return param2;
              }
              this.clearKeyboardFocus((byte) 99);
              if (cd.field_b != 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.getHoverText(-94));
                return param2;
              }
              if (sa.field_t == 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.getHoverText(-94));
                return param2;
              }
              this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
              var9 = PasswordValidator.field_u;
              if (var9 != null) {
                if (var9.listener instanceof DropListener) {
                  ((DropListener) (var9.listener)).onDrop(-87, (DropTargetWidget) null, var9);
                }
                PasswordValidator.field_u = null;
              }
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.getHoverText(-94));
              return param2;
            }
            param2 = false;
          }
          if (cd.field_b != 0) {
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
          if (sa.field_t == 0) {
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
          this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
          var10 = PasswordValidator.field_u;
          if (var10 != null) {
            if (var10.listener instanceof DropListener) {
              ((DropListener) (var10.listener)).onDrop(-87, (DropTargetWidget) null, var10);
            }
            PasswordValidator.field_u = null;
          }
          sa.field_t = cd.field_b;
          ue.a((byte) 70, this.getHoverText(-94));
          return param2;
        }
        UiWidget.c((byte) 17);
        var5Lifetime1 = this.hasKeyboardFocus(85) ? 1 : 0;
        if (!param2) {
          if (var5Lifetime1 != 0 &&
            0 != MatchingTextValidator.field_s) {
            this.clearKeyboardFocus((byte) 99);
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
        } else {
          if (wp.field_d == 0) {
            regionExit1: {
              if (MatchingTextValidator.field_s != 0) {
                if (!this.handlePointerPress(this, param1, true, MatchingTextValidator.field_s, UsernameAvailabilityValidator.field_o, param3, DialogLayer.field_W)) {
                  if (var5Lifetime1 == 0) {
                    if (((cd.field_b == 0)) &&
                      ((sa.field_t != 0))) {
                      this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
                      var11 = PasswordValidator.field_u;
                      if (var11 != null) {
                        if (var11.listener instanceof DropListener) {
                          ((DropListener) (var11.listener)).onDrop(-87, (DropTargetWidget) null, var11);
                        }
                        PasswordValidator.field_u = null;
                      }
                    }
                  } else {
                    this.clearKeyboardFocus((byte) 99);
                    if (((cd.field_b == 0)) &&
                      ((sa.field_t != 0))) {
                      this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
                      var12 = PasswordValidator.field_u;
                      if (var12 != null) {
                        if (var12.listener instanceof DropListener) {
                          ((DropListener) (var12.listener)).onDrop(-87, (DropTargetWidget) null, var12);
                        }
                        PasswordValidator.field_u = null;
                      }
                    }
                  }
                  break regionExit1;
                }
                param2 = false;
              }
              if (cd.field_b == 0 &&
                sa.field_t != 0) {
                this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
                var13 = PasswordValidator.field_u;
                if (var13 != null) {
                  if (var13.listener instanceof DropListener) {
                    ((DropListener) (var13.listener)).onDrop(-87, (DropTargetWidget) null, var13);
                  }
                  PasswordValidator.field_u = null;
                }
              }
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
          if (var5Lifetime1 != 0) {
            this.handlePointerWheel(this, wn.field_i, wp.field_d, param3, (byte) -127, DebouncedValidationProvider.field_f, param1);
            if (MatchingTextValidator.field_s != 0) {
              if (this.handlePointerPress(this, param1, true, MatchingTextValidator.field_s, UsernameAvailabilityValidator.field_o, param3, DialogLayer.field_W)) {
                param2 = false;
              } else {
                this.clearKeyboardFocus((byte) 99);
              }
            }
            if (cd.field_b == 0 &&
              sa.field_t != 0) {
              this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
              var14 = PasswordValidator.field_u;
              if (var14 != null) {
                if (var14.listener instanceof DropListener) {
                  ((DropListener) (var14.listener)).onDrop(-87, (DropTargetWidget) null, var14);
                }
                PasswordValidator.field_u = null;
              }
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.getHoverText(-94));
              return param2;
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
          if (MatchingTextValidator.field_s != 0) {
            if (!this.handlePointerPress(this, param1, true, MatchingTextValidator.field_s, UsernameAvailabilityValidator.field_o, param3, DialogLayer.field_W)) {
              if (cd.field_b != 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.getHoverText(-94));
                return param2;
              }
              if (sa.field_t == 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.getHoverText(-94));
                return param2;
              }
              this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
              var15 = PasswordValidator.field_u;
              if (var15 != null) {
                if (var15.listener instanceof DropListener) {
                  ((DropListener) (var15.listener)).onDrop(-87, (DropTargetWidget) null, var15);
                }
                PasswordValidator.field_u = null;
              }
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.getHoverText(-94));
              return param2;
            }
            param2 = false;
          }
          if (cd.field_b == 0 &&
            sa.field_t != 0) {
            this.handlePointerRelease(param1, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 105, this);
            var17 = PasswordValidator.field_u;
            if (var17 != null) {
              if (var17.listener instanceof DropListener) {
                ((DropListener) (var17.listener)).onDrop(-87, (DropTargetWidget) null, var17);
              }
              PasswordValidator.field_u = null;
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.getHoverText(-94));
            return param2;
          }
        }
        sa.field_t = cd.field_b;
        ue.a((byte) 70, this.getHoverText(-94));
        return param2;
    }

    boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.containsPointer(param1, param5, param6, -1, param4)) {
            this.pressedPointerButton = param3;
          }
          if (param2) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ei.AA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String getHoverText(int param0) {
        if (param0 <= -10) {
          return !this.pointerInside ? null : this.hoverText;
        }
        this.getLastRenderPass(-28);
        return !this.pointerInside ? null : this.hoverText;
    }

    public final String toString() {
        return this.appendWidgetDiagnostics(new StringBuilder(), 0, new Hashtable(), 99).toString();
    }

    void handlePointerRelease(int param0, int param1, int param2, int param3, byte param4, UiWidget param5) {
        try {
          if (param4 < 62) {
            this.dispatchKeyInputOrRequestFocus(-128, 68, 'ﾮ');
          }
          this.pressedPointerButton = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ei.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean beginWidgetDiagnosticVisit(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1) {
            this.dispatchKeyInputOrRequestFocus(84, -105, '￈');
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
          stackIn_9_1 = new StringBuilder().append("ei.MB(").append(param0).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void renderWidgetPassesAndTooltip(int param0, byte param1, int param2) {
        int var5_int = 0;
        int var4 = this.getLastRenderPass(66);
        for (var5_int = 0; var4 >= var5_int; var5_int++) {
          this.renderWidget(var5_int, (byte) -118, param0, param2);
        }
        if (param1 < 73) {
          return;
        }
        String var5 = jd.a(9383);
        if (var5 == null) {
          return;
        }
        db.field_Sb.a((byte) -52, MatchingTextValidator.field_n, id.field_b, var5);
    }

    void renderWidget(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param0 != 0) {
          var5 = -117 / ((-42 - param1) / 53);
          return;
        }
        if (null != this.renderer) {
          this.renderer.paintWidget(true, param2, (byte) 71, param3, this);
          var5Lifetime1 = -117 / ((-42 - param1) / 53);
          return;
        }
        var5Lifetime2 = -117 / ((-42 - param1) / 53);
    }

    final void refreshLayout(byte param0) {
        if (param0 <= -64) {
          this.setWidgetBounds(this.widgetWidth, this.widgetX, this.widgetHeight, false, this.widgetY);
          return;
        }
        field_o = -58;
        this.setWidgetBounds(this.widgetWidth, this.widgetX, this.widgetHeight, false, this.widgetY);
    }

    void clearKeyboardFocus(byte param0) {
        if (param0 != 99) {
          UiWidget var3 = (UiWidget) null;
          this.handlePointerPress((UiWidget) null, -125, false, 30, 62, -88, -86);
        }
    }

    protected UiWidget() {
        this.textOffsetX = 0;
        this.textOffsetY = 0;
    }

    UiWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        io var4 = null;
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
          this.listener = param2;
          this.renderer = param1;
          this.widgetText = param0;
          if (this.renderer instanceof io) {
            var4 = (io) ((Object) this.renderer);
            this.widgetWidth = var4.a(this, -1848150943);
            this.widgetHeight = var4.a(1, this);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5) {
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
          this.widgetHeight = param3;
          this.widgetY = param1;
          this.listener = param5;
          this.widgetX = param0;
          this.renderer = param4;
          this.widgetWidth = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ei.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 500;
        field_u = 0;
        field_q = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        youAreOnXServer = "You are on <%0>";
    }
}
