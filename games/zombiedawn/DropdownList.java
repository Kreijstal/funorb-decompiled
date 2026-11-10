/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownList extends UiContainer implements ButtonActionListener {
    static Sprite[] field_R;
    ScrollContainer field_F;
    private TextButton field_N;
    private TextButton field_Q;
    static int field_G;
    boolean field_H;
    DropdownItemList field_T;
    String field_U;
    static int field_I;
    Font field_L;
    static int field_P;
    private boolean field_S;
    private int field_M;
    private int field_V;
    static GameApplet field_J;

    final boolean handlePointerPress(int param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            this.blur((byte) -2);
          }
          stackIn_3_0 = super.handlePointerPress(param0, 1, param2, param3, param4, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nh.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_R = null;
        int var1 = -87 / ((64 - param0) / 49);
    }

    final boolean isFocused(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -17741) {
          field_J = (GameApplet) null;
        }
        stackIn_7_0 = (this.field_S) || (super.isFocused(-17741));
        return stackIn_7_0;
    }

    private final void setDropdownBounds(int param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 0;
        super.setBounds(119, param1, param0, param2, param3);
        this.field_N.setBounds(44, 0, 0, -20 + param2, this.field_M);
        this.field_Q.setBounds(-79, 0, param2 - 20, 20, this.field_M);
        if (this.field_H) {
          this.field_F.setBounds(-107, this.field_M, 0, param2, -this.field_M + param3);
        }
        if (param4 < 11) {
          String var7 = (String) null;
          discarded$0 = this.findItemStartingWith(28, (String) null);
        }
    }

    private final int findItemStartingWith(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          param1 = param1.toLowerCase();
          var3_int = 0;
          if (param0 != -129) {
            this.field_T = (DropdownItemList) null;
          }
          while (true) {
            if (var3_int >= this.field_T.field_L.length) {
              stackIn_9_0 = -1;
              return stackIn_9_0;
            }
            var4 = this.field_T.field_L[var3_int].toString().toLowerCase();
            if (!var4.startsWith(param1)) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nh.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean supportsFullscreen(byte param0, PlatformTaskDispatcher param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 77) {
            field_G = 1;
          }
          stackIn_3_0 = param1.supportsFullscreen(10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nh.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.field_M = param4;
        int var6 = -42 % ((-23 - param0) / 48);
        this.setDropdownBounds(param2, param1, param3, param4, 81);
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        boolean stackIn_56_0 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var7_intLifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var5_int = 44 % ((-83 - param0) / 32);
          if (!this.isFocused(-17741)) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_T.field_L) {
            var6 = this.field_T.field_L.length;
            if (99 != param1 &&
              param1 != 98) {
              if (param1 != 105 &&
                param1 != 104) {
                if (param1 == 84) {
                  if (this.field_H) {
                    this.closeList((byte) -44);
                  } else {
                    this.openList((byte) -117);
                  }
                  return true;
                }
                if (85 == param1) {
                  var7_int = this.field_U.length();
                  if (0 >= var7_int) {
                    return true;
                  }
                  this.field_U = this.field_U.substring(0, var7_int - 1);
                  return true;
                }
                decompiledFrameRemainder0 = !(param3 < 32);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(param3 >= 128))) {
                  var7 = this.field_U + param3;
                  this.selectItemByPrefix(var7, (byte) -89);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.isListOpen((byte) -109)) {
                  this.openList((byte) -115);
                }
                var7_intLifetime1 = this.field_F.field_D.field_n / this.field_T.field_I;
                if (param1 == 105) {
                  this.field_T.field_K = this.field_T.field_K + var7_intLifetime1;
                } else {
                  this.field_T.field_K = this.field_T.field_K - var7_intLifetime1;
                }
                if (0 > this.field_T.field_K) {
                  this.field_T.field_K = 0;
                }
                if (this.field_T.field_K >= var6) {
                  this.field_T.field_K = var6 - 1;
                }
                this.scrollToSelection(24);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.isListOpen((byte) -43)) {
                this.openList((byte) -123);
              }
              if (param1 != 99) {
                this.field_T.field_K = this.field_T.field_K - 1;
              } else {
                this.field_T.field_K = this.field_T.field_K + 1;
              }
              if (this.field_T.field_K < 0) {
                this.field_T.field_K = 0;
              }
              if (var6 <= this.field_T.field_K) {
                this.field_T.field_K = var6 - 1;
              }
              this.scrollToSelection(24);
              return true;
            }
          }
          if (param1 != 80) {
            stackIn_56_0 = super.requestKeyboardFocus(-119, param1, param2, param3);
            return stackIn_56_0;
          }
          this.closeList((byte) -44);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_59_0 = var5;
          stackIn_59_1 = new StringBuilder().append("nh.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param3).append(')').toString());
        }
    }

    final void blur(byte param0) {
        this.field_S = false;
        super.blur(param0);
    }

    final boolean isListOpen(byte param0) {
        if (param0 >= -10) {
          return true;
        }
        return this.field_H;
    }

    final int getSelectedIndex(int param0) {
        if (param0 != 0) {
          this.isFocused(-95);
        }
        return this.field_T.field_K;
    }

    final void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        try {
          super.updatePointer(param0, (byte) -7, param2, param3);
          int var5_int = 60 / ((param1 - 46) / 42);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "nh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void closeList(byte param0) {
        if (param0 != -44) {
          return;
        }
        if (!this.isListOpen((byte) -84)) {
          return;
        }
        this.setDropdownBounds(this.field_k, this.field_j, this.field_i, this.field_M, 27);
        this.field_H = false;
        this.field_F.unlink(-27598);
    }

    DropdownList(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        this.field_U = "";
        this.field_L = MenuFontGlobals.field_e;
        try {
          this.field_T = new DropdownItemList(this, this.field_L, param0, param1);
          this.field_V = param2;
          this.field_T.field_v = (WidgetListener) (this);
          this.field_H = false;
          this.field_N = new TextButton("", new DropdownSelectorPainter(this), (WidgetListener) (this));
          this.field_Q = new TextButton();
          this.field_Q.field_h = (WidgetPainter) ((Object) new DropdownArrowPainter());
          this.field_Q.field_v = (WidgetListener) (this);
          this.addChild(this.field_N, 10);
          this.addChild(this.field_Q, 10);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void openList(byte param0) {
        int var2 = this.field_T.getContentHeight(1227847265);
        int var3 = var2;
        int var4 = 0;
        if (this.field_V < var3) {
          var3 = this.field_V;
          var4 = 1;
        }
        this.setDropdownBounds(this.field_k, this.field_j, this.field_i, var3 + this.field_M, 82);
        this.field_T.setBounds(-117, 0, 0, this.field_i, var2);
        this.field_F = new ScrollContainer(0, 0, 0, 0, new EmptyWidgetPainter(), this.field_T, (WidgetPainter) null);
        if (var4 != 0) {
          this.field_F.setVerticalScrollbar(true, (byte) 100, CivilianHuman.createDefaultScrollbar(6130));
        }
        this.field_F.setBounds(-78, this.field_M, 0, this.field_i, this.field_n - this.field_M);
        this.field_H = true;
        if (param0 > -114) {
          return;
        }
        this.addChild(this.field_F, 10);
        this.scrollToSelection(24);
    }

    final void notifySelectionChanged(boolean param0) {
        if (!param0) {
          this.isListOpen((byte) 82);
        }
        if (this.field_v instanceof DropdownSelectionListener) {
          ((DropdownSelectionListener) ((Object) this.field_v)).onSelectionChanged(-16510, this);
        }
    }

    final boolean focusNext(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 67) {
            this.field_L = (Font) null;
          }
          param1.blur((byte) 57);
          this.field_S = true;
          this.field_U = "";
          if (null != this.field_v &&
            this.field_v instanceof FocusChangeListener) {
            ((FocusChangeListener) (this.field_v)).onFocusChanged(this.field_S, (UiWidget) (this), (byte) 15);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String normalizeNameOrEmpty(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = ChatMessage.decodeBase37Name(AccountRequestState.encodeBase37(-66, param0), -27513);
          var3 = 55 / ((-49 - param1) / 61);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("nh.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void scrollToSelection(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var7Lifetime1;
        int var8Lifetime1;
        if (!this.isListOpen((byte) -127)) {
          return;
        }
        if (this.field_T.field_K != -1 &&
          null != this.field_T.field_L &&
          this.field_F.field_L != null) {
          var2 = this.field_F.field_D.field_n;
          var3 = this.field_T.field_I;
          var4 = -var2 + this.field_T.field_n;
          if (var4 <= 0) {
            return;
          }
          var5 = var3 * this.field_T.field_K;
          var6 = var5 + this.field_F.field_D.field_z.field_j;
          var7 = var2 >> 2;
          if (var6 < var7) {
            var8 = -(-var5 + var7 << 16) / var4;
            if (var8 < 0) {
              var8 = 0;
            }
            this.field_F.field_L.field_E = var8;
          }
          if (param0 != 24) {
            var9 = (String) null;
            this.selectItemByPrefix((String) null, (byte) 100);
          }
          var7Lifetime1 = (3 * var2 >> 2) - var3;
          if (var6 > var7Lifetime1) {
            var8Lifetime1 = -(var7Lifetime1 - var5 << 16) / var4;
            if (var8Lifetime1 > 65536) {
              var8Lifetime1 = 65536;
            }
            this.field_F.field_L.field_E = var8Lifetime1;
          }
          return;
        }
    }

    private final void selectItemByPrefix(String param0, byte param1) {
        if (this.field_T.field_L == null) {
          return;
        }
        int var4 = 31 / ((param1 - 47) / 48);
        int var3_int = this.findItemStartingWith(-129, param0.toLowerCase());
        if (var3_int == -1) {
          return;
        }
        try {
          this.field_T.field_K = var3_int;
          this.scrollToSelection(24);
          this.field_U = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "nh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String getTooltip(int param0) {
        int var2;
        if (!this.field_l) {
          return null;
        }
        if (this.isListOpen((byte) -57) &&
          this.field_F.field_l &&
          this.field_T.field_O != -1) {
          return this.field_T.field_L[this.field_T.field_O].toString();
        }
        if (null != this.field_T.getSelectedItem(0)) {
          return this.field_T.getSelectedItem(0).toString();
        }
        var2 = 49 % ((10 - param0) / 58);
        return super.getTooltip(-89);
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!this.isListOpen((byte) -48)) {
            this.openList((byte) -122);
          } else {
            this.closeList((byte) -44);
          }
          if (param1 != -6) {
            this.field_U = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nh.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_J = null;
        field_P = 480;
        field_I = 2 + field_P / 24;
        field_G = field_P / 2;
    }
}
