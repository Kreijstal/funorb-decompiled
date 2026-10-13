/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class Widget extends IntrusiveNode {
    static int field_A;
    static int[] field_o;
    int y;
    WidgetListener listener;
    static QuickChatCommandDefinition field_y;
    boolean hovered;
    int width;
    int contentOffsetY;
    WidgetPainter painter;
    int height;
    int pressedButton;
    int x;
    TextLayout textLayout;
    String tooltipText;
    String text;
    int contentOffsetX;
    static int field_n;
    static int[] field_m;

    boolean containsPointer(int obfuscationGuard, int originX, int pointerY, int pointerX, int originY) {
        boolean stackIn_18_0 = false;
        if (obfuscationGuard != 1) {
          this.updatePointer(27, 29, 59, (Widget) null);
          if (originX + this.x > pointerX) {
            return false;
          }
          if (pointerY < originY + this.y) {
            return false;
          }
          if (this.width + (originX + this.x) <= pointerX) {
            return false;
          }
          if (this.y + originY + this.height <= pointerY) {
            return false;
          }
          return true;
        }
        if (originX + this.x > pointerX) {
          return false;
        }
        if (pointerY < originY + this.y) {
          return false;
        }
        stackIn_18_0 = (this.width + (originX + this.x) > pointerX) && (this.y + originY + this.height > pointerY);
        return stackIn_18_0;
    }

    void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        try {
          this.pressedButton = 0;
          int var7_int = 122 / ((obfuscationGuard + 58) / 53);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kb.JA(" + originY + ',' + (rootWidget != null ? "{...}" : "null") + ',' + pointerX + ',' + obfuscationGuard + ',' + pointerY + ',' + originX + ')');
        }
    }

    boolean isFocused(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.a((Hashtable) null, 105, (byte) 68, (StringBuilder) null);
          return false;
        }
        return false;
    }

    final void a(int param0, Hashtable param1, boolean param2, StringBuilder param3) {
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
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (this.text != null) {
            discarded$1 = param3.append(" text=\"").append(this.text).append('"');
          }
          if (this.hovered) {
            discarded$2 = param3.append(" mouseover");
          }
          if (!param2) {
            return;
          }
          if (this.isFocused(false)) {
            discarded$3 = param3.append(" focused");
          }
          if (this.painter != null) {
            discarded$4 = param3.append(" renderer=");
            if (this.painter instanceof Widget) {
              param3 = this.a(1 + param0, param3, 26477, param1);
              if (var6 != 0) {
                discarded$5 = param3.append(this.painter);
              }
            } else {
              discarded$5 = param3.append(this.painter);
            }
          }
          if (null != this.listener) {
            discarded$6 = param3.append(" listener=");
            if (this.listener instanceof Widget) {
              param3 = this.a(1 + param0, param3, 26477, param1);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param3.append(this.listener);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("kb.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    int g(int param0) {
        if (param0 != -31989) {
          return 112;
        }
        return 0;
    }

    boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 103) {
            field_A = -35;
          }
          if (!this.containsPointer(1, originX, pointerY, pointerX, originY)) {
            return false;
          }
          this.pressedButton = button;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("kb.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, Widget param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 >= 93) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("kb.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_m = null;
        int var1 = 53 / ((-78 - param0) / 43);
        field_y = null;
    }

    final void e(int param0) {
        if (param0 != 0) {
          return;
        }
        this.setBounds(this.x, this.width, this.y, 8192, this.height);
    }

    Widget(String param0, WidgetListener param1) {
        this(param0, t.field_c.field_t, param1);
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.isFocused(false)) {
          var4 = param0;
          if (var4 == 80) {
            return this.takeFocus(param2 ^ 91, this);
          }
          if (param2 == 80) {
            return false;
          }
          field_y = (QuickChatCommandDefinition) null;
          return false;
        }
        if (this.handleKey(this, param0, param1, param2 - 12295)) {
          return true;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 == 80) {
          return this.takeFocus(param2 ^ 91, this);
        }
        if (param2 == 80) {
          return false;
        }
        field_y = (QuickChatCommandDefinition) null;
        return false;
    }

    String getTooltipText(int obfuscationGuard) {
        if (obfuscationGuard == 21384) {
          return !this.hovered ? null : this.tooltipText;
        }
        this.width = 36;
        return !this.hovered ? null : this.tooltipText;
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param0, (byte) 74, param1)) {
            this.a(param0, param3, true, param1);
          }
          if (param2 != 26477) {
            this.x = -116;
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kb.OA(").append(param0).append(',');
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        wc var6;
        int var7;
        wc var8;
        wc var10;
        wc var15;
        wc var18;
        wc var21;
        wc var23;
        wc var27;
        wc var28;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.updatePointer(32722, param2, param3, this);
        if (param1 == -6226) {
          regionExit1: {
            var5 = this.isFocused(false) ? 1 : 0;
            if (param0) {
              if (el.field_d != 0) {
                if (var5 == 0) {
                  if (DeployEvent.pointerPressButton != 0) {
                    if (!this.pointerPressed(BattleTutorial.pointerPressX, param2, param3, 113, this, TeleportAction.pointerPressY, DeployEvent.pointerPressButton)) {
                      if (ro.pointerButton != 0) {
                        LobbyRoom.field_Ob = ro.pointerButton;
                        OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                        return param0;
                      }
                      if (LobbyRoom.field_Ob == 0) {
                        LobbyRoom.field_Ob = ro.pointerButton;
                        OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                        return param0;
                      }
                      this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
                      var21 = bn.field_f;
                      if (var21 != null) {
                        if (var21.listener instanceof ch) {
                          ((ch) (var21.listener)).a(var21, -14486, (ku) null);
                        }
                        bn.field_f = null;
                      }
                      if (var7 != 0 &&
                        var5 != 0 &&
                        DeployEvent.pointerPressButton != 0) {
                        this.blur(1);
                      }
                      LobbyRoom.field_Ob = ro.pointerButton;
                      OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                      return param0;
                    }
                    param0 = false;
                  }
                  if (ro.pointerButton != 0) {
                    LobbyRoom.field_Ob = ro.pointerButton;
                    OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                    return param0;
                  }
                  if (LobbyRoom.field_Ob == 0) {
                    LobbyRoom.field_Ob = ro.pointerButton;
                    OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                    return param0;
                  }
                  this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
                  var23 = bn.field_f;
                  if (var23 != null) {
                    if (var23.listener instanceof ch) {
                      ((ch) (var23.listener)).a(var23, -14486, (ku) null);
                    }
                    bn.field_f = null;
                  }
                  if (var7 == 0) {
                    LobbyRoom.field_Ob = ro.pointerButton;
                    OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                    return param0;
                  }
                  if (var5 == 0) {
                    LobbyRoom.field_Ob = ro.pointerButton;
                    OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                    return param0;
                  }
                  if (DeployEvent.pointerPressButton == 0) {
                    LobbyRoom.field_Ob = ro.pointerButton;
                    OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                    return param0;
                  }
                  this.blur(1);
                  LobbyRoom.field_Ob = ro.pointerButton;
                  OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                  return param0;
                }
                this.a(AiPlanningStrategy.pointerX, param2, param3, ko.pointerY, el.field_d, param1 + 6327, this);
              }
              if (DeployEvent.pointerPressButton != 0) {
                if (!this.pointerPressed(BattleTutorial.pointerPressX, param2, param3, 113, this, TeleportAction.pointerPressY, DeployEvent.pointerPressButton)) {
                  if (var5 == 0) {
                    if (ro.pointerButton == 0) {
                      if (LobbyRoom.field_Ob == 0) {
                        LobbyRoom.field_Ob = ro.pointerButton;
                        OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                        return param0;
                      }
                      this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
                      var27 = bn.field_f;
                      var6 = var27;
                      if (var27 != null) {
                        if (var27.listener instanceof ch) {
                          ((ch) (var27.listener)).a(var27, -14486, (ku) null);
                        }
                        bn.field_f = null;
                      }
                      if (var7 != 0 &&
                        var5 != 0 &&
                        DeployEvent.pointerPressButton != 0) {
                        this.blur(1);
                        LobbyRoom.field_Ob = ro.pointerButton;
                        OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                        return param0;
                      }
                    }
                    LobbyRoom.field_Ob = ro.pointerButton;
                    OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                    return param0;
                  }
                  this.blur(1);
                  if (var7 != 0) {
                    param0 = false;
                  }
                } else {
                  param0 = false;
                }
              }
              if (ro.pointerButton != 0) {
                break regionExit1;
              }
              if (LobbyRoom.field_Ob == 0) {
                LobbyRoom.field_Ob = ro.pointerButton;
                OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                return param0;
              }
              this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
              var28 = bn.field_f;
              if (var28 != null) {
                if (var28.listener instanceof ch) {
                  ((ch) (var28.listener)).a(var28, -14486, (ku) null);
                }
                bn.field_f = null;
              }
              if (var7 == 0) {
                break regionExit1;
              }
            }
            if (var5 != 0 &&
              DeployEvent.pointerPressButton != 0) {
              this.blur(1);
              LobbyRoom.field_Ob = ro.pointerButton;
              OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
              return param0;
            }
          }
        } else {
          field_n = 69;
          var5 = this.isFocused(false) ? 1 : 0;
          if (param0) {
            if (el.field_d == 0) {
              if (DeployEvent.pointerPressButton != 0) {
                if (!this.pointerPressed(BattleTutorial.pointerPressX, param2, param3, 113, this, TeleportAction.pointerPressY, DeployEvent.pointerPressButton)) {
                  if (var5 != 0) {
                    this.blur(1);
                    if (var7 != 0) {
                      param0 = false;
                    }
                  }
                } else {
                  param0 = false;
                }
              }
              if (ro.pointerButton != 0) {
                LobbyRoom.field_Ob = ro.pointerButton;
                OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                return param0;
              }
              if (LobbyRoom.field_Ob == 0) {
                LobbyRoom.field_Ob = ro.pointerButton;
                OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                return param0;
              }
              this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
              var8 = bn.field_f;
              var6 = var8;
              if (var8 != null) {
                if (var8.listener instanceof ch) {
                  ((ch) (var8.listener)).a(var8, -14486, (ku) null);
                }
                bn.field_f = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                DeployEvent.pointerPressButton != 0) {
                this.blur(1);
              }
              LobbyRoom.field_Ob = ro.pointerButton;
              OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
              return param0;
            }
            if (var5 != 0) {
              this.a(AiPlanningStrategy.pointerX, param2, param3, ko.pointerY, el.field_d, param1 + 6327, this);
            }
            if (DeployEvent.pointerPressButton == 0) {
              if (ro.pointerButton != 0) {
                LobbyRoom.field_Ob = ro.pointerButton;
                OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                return param0;
              }
              if (LobbyRoom.field_Ob == 0) {
                LobbyRoom.field_Ob = ro.pointerButton;
                OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                return param0;
              }
              this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
              var10 = bn.field_f;
              var6 = var10;
              if (var10 != null) {
                if (var10.listener instanceof ch) {
                  ((ch) (var10.listener)).a(var10, -14486, (ku) null);
                }
                bn.field_f = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                DeployEvent.pointerPressButton != 0) {
                this.blur(1);
              }
              LobbyRoom.field_Ob = ro.pointerButton;
              OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
              return param0;
            }
            if (!this.pointerPressed(BattleTutorial.pointerPressX, param2, param3, 113, this, TeleportAction.pointerPressY, DeployEvent.pointerPressButton)) {
              if (var5 == 0) {
                if (ro.pointerButton != 0) {
                  LobbyRoom.field_Ob = ro.pointerButton;
                  OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                  return param0;
                }
                if (LobbyRoom.field_Ob == 0) {
                  LobbyRoom.field_Ob = ro.pointerButton;
                  OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                  return param0;
                }
                this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
                var15 = bn.field_f;
                if (var15 != null) {
                  if (var15.listener instanceof ch) {
                    ((ch) (var15.listener)).a(var15, -14486, (ku) null);
                  }
                  bn.field_f = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  DeployEvent.pointerPressButton != 0) {
                  this.blur(1);
                }
                LobbyRoom.field_Ob = ro.pointerButton;
                OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
                return param0;
              }
              this.blur(1);
              if (var7 != 0) {
                param0 = false;
              }
            } else {
              param0 = false;
            }
            if (ro.pointerButton != 0) {
              LobbyRoom.field_Ob = ro.pointerButton;
              OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
              return param0;
            }
            if (LobbyRoom.field_Ob == 0) {
              LobbyRoom.field_Ob = ro.pointerButton;
              OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
              return param0;
            }
            this.pointerReleased(param3, this, AiPlanningStrategy.pointerX, (byte) -127, ko.pointerY, param2);
            var18 = bn.field_f;
            if (var18 != null) {
              if (var18.listener instanceof ch) {
                ((ch) (var18.listener)).a(var18, -14486, (ku) null);
              }
              bn.field_f = null;
            }
            if (var7 == 0) {
              LobbyRoom.field_Ob = ro.pointerButton;
              OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
              return param0;
            }
          }
          if (var5 != 0 &&
            DeployEvent.pointerPressButton != 0) {
            this.blur(1);
          }
        }
        LobbyRoom.field_Ob = ro.pointerButton;
        OwnerChangeEvent.a(param1 ^ 6225, this.getTooltipText(21384));
        return param0;
    }

    void blur(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          this.getTooltipText(93);
        }
    }

    final boolean a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 29) {
            return true;
          }
          if (param0.containsKey(this)) {
            discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param0.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("kb.FB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, new StringBuilder(), 26477, new Hashtable()).toString();
    }

    void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        this.x = x;
        if (obfuscationGuard != 8192) {
          return;
        }
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        if (0 == renderLayer) {
          if (this.painter == null) {
            if (obfuscationGuard > -82) {
              this.hovered = false;
              return;
            }
            return;
          }
          this.painter.paintWidget(this, originX, -89, true, originY);
        }
        if (obfuscationGuard <= -82) {
          return;
        }
        this.hovered = false;
    }

    boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == -12215) {
            return false;
          }
          this.contentOffsetY = -5;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kb.F(");
          if (rootWidget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 11) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kb.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (obfuscationGuard != 32722) {
            return;
          }
          var5_int = this.containsPointer(obfuscationGuard - 32721, originX, ko.pointerY, AiPlanningStrategy.pointerX, originY) ? 1 : 0;
          stackIn_4_0 = var5_int;
          if (this.hovered) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if (stackIn_4_0 == stackIn_5_1) {
            stackIn_9_1 = (var5_int != 0);
            this.hovered = stackIn_9_1;
            if (null != this.listener &&
              this.listener instanceof WidgetHoverListener) {
              ((WidgetHoverListener) (this.listener)).hoverChanged(var5_int != 0, false, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("kb.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        String var7;
        String var9;
        String var12;
        String var9Lifetime1;
        String var12Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 <= -117) {
          var4 = this.g(-31989);
          var5_int = 0;
          while (var5_int <= var4) {
            this.drawWidget(param0, param2, (byte) -115, var5_int);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = QuickChatCategoryRepository.b(2);
          var7 = var5;
          var9 = var7;
          var5 = var9;
          var9Lifetime1 = var5;
          var5 = var9Lifetime1;
        } else {
          field_A = 34;
          var4 = this.g(-31989);
          var5_int = 0;
          while (var5_int <= var4) {
            this.drawWidget(param0, param2, (byte) -115, var5_int);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = QuickChatCategoryRepository.b(2);
          var12 = var5;
          var5 = var12;
          var12Lifetime1 = var5;
          var5 = var12Lifetime1;
        }
        if (var5 == null) {
          return;
        }
        t.field_c.a(cc.field_b, -127, var5, lq.field_e);
    }

    protected Widget() {
        this.contentOffsetY = 0;
        this.contentOffsetX = 0;
    }

    Widget(String param0, WidgetPainter param1, WidgetListener param2) {
        RuntimeException runtimeException = null;
        TextWidgetPainter var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.contentOffsetY = 0;
        this.contentOffsetX = 0;
        try {
          this.painter = param1;
          this.text = param0;
          this.listener = param2;
          if (this.painter instanceof TextWidgetPainter) {
            var4 = (TextWidgetPainter) ((Object) this.painter);
            this.width = var4.getPreferredWidth(this, (byte) -120);
            this.height = var4.getPreferredHeight(this, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kb.<init>(");
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    Widget(int x, int y, int width, int height, WidgetPainter painter, WidgetListener listener) {
        this.contentOffsetY = 0;
        this.contentOffsetX = 0;
        try {
          this.x = x;
          this.y = y;
          this.width = width;
          this.height = height;
          this.listener = listener;
          this.painter = painter;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kb.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (painter != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = new QuickChatCommandDefinition(11, 0, 1, 2);
        field_n = 0;
        field_m = new int[8192];
    }
}
