/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends FocusableWidget {
    private long field_P;
    private int field_Q;
    private boolean field_M;
    private int field_L;
    static int field_S;
    private int field_T;
    static UiComponent field_K;
    private boolean field_N;
    private int field_R;
    private long field_O;

    final void c(boolean param0) {
        this.field_L = 0;
        this.text = "";
        this.field_T = 0;
        this.n(122);
        if (param0) {
          field_S = 97;
        }
    }

    public static void i(int param0) {
        if (param0 < 63) {
          return;
        }
        field_K = null;
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_L != this.field_T) {
          var2 = this.field_L >= this.field_T ? this.field_T : this.field_L;
          var3 = this.field_L < this.field_T ? this.field_T : this.field_L;
          this.field_L = var2;
          this.field_T = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.n(46);
        }
        if (param0 >= -34) {
          String var4 = (String) null;
          this.a(false, (String) null);
        }
    }

    vb(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.field_P = 0L;
        this.field_M = false;
        this.field_R = -1;
        try {
          this.renderer = bj.field_T.field_b;
          this.field_Q = param2;
          this.a(param0, -12592, true);
          this.field_N = true;
          this.field_O = MonotonicTime.nowMillis(false);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int h(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = this.text.length();
        if (var2 == this.field_T) {
          return this.field_T;
        }
        if (param0 < 93) {
          return -128;
        }
        for (var3 = this.field_T + 1; var3 < var2; var3++) {
          if (this.text.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void f(byte param0) {
        ep var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        WidgetLayoutProvider var9;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (!this.field_N) {
          this.field_r = 0;
          this.field_B = 0;
          return;
        }
        if (!(this.renderer instanceof WidgetLayoutProvider)) {
          return;
        }
        if (param0 != 81) {
          this.field_L = 16;
        }
        var9 = (WidgetLayoutProvider) ((Object) this.renderer);
        var3 = var9.c((Widget) (this), -3);
        var4 = var3.b(31458);
        var5 = var9.a(61823, (Widget) (this));
        var6 = var9.a((byte) 99) >> 1;
        if (var4 < var5 - var6) {
          this.field_B = 0;
          this.field_r = 0;
          return;
        }
        var7 = this.field_r + var3.a(this.field_T, (byte) -108);
        if (-var6 + var5 < var7) {
          this.field_r = -var7 - (-var5 + var6 - this.field_r);
        } else {
          if (var7 < var6) {
            this.field_r = var6 - (var7 - this.field_r);
          }
        }
        if (this.field_r > 0) {
          this.field_r = 0;
        } else {
          if (this.field_r < -var5 + var6) {
            this.field_r = var6 - var5;
          }
        }
        return;
    }

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Q != -1) {
            var3_int = this.field_Q - this.text.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_T == this.text.length()) {
            this.text = this.text + param1;
          } else {
            this.text = this.text.substring(0, this.field_T) + param1 + this.text.substring(this.field_T, this.text.length());
          }
          this.field_T = this.field_T + param1.length();
          this.field_L = this.field_T;
          if (param0) {
            this.l(95);
            this.n(80);
          } else {
            this.n(80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vb.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        int var6 = 0;
        WidgetLayoutProvider var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.f((byte) 81);
          if (this.pressedButton == 1) {
            if (this.renderer instanceof WidgetLayoutProvider) {
              var7 = (WidgetLayoutProvider) ((Object) this.renderer);
              var6 = var7.a((Widget) (this), MusicPatch.pointerX, true, parentY, po.pointerY, parentX);
              if (var6 != -1) {
                if (this.field_M &&
                  this.field_R > var6 &&
                  var6 > this.field_L) {
                  var6 = this.field_R;
                }
                this.field_T = var6;
              }
            }
            this.field_O = MonotonicTime.nowMillis(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("vb.WA(");
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    private final void m(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 != 32) {
            field_S = 68;
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.h(param0 ^ -8);
            this.a(false, var2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        String var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          this.text = param0;
          var4_int = param0.length();
          if (this.field_Q != -1 &&
            this.field_Q < var4_int) {
            this.text = this.text.substring(0, this.field_Q);
          }
          dupTemp$1 = this.text.length();
          this.field_L = dupTemp$1;
          this.field_T = dupTemp$1;
          if (!param2) {
            this.n(19);
          }
          if (param1 != -12592) {
            var5 = (String) null;
            this.a((String) null, 58, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vb.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void l(int param0) {
        String var2 = this.a((byte) -108);
        if (!(var2.length() <= param0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.a((byte) -124))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, int param1) {
        this.field_T = param0;
        if (!IntArrayRequest.heldKeys[param1]) {
          this.field_L = this.field_T;
        }
    }

    private final void j(int param0) {
        if (param0 != -66) {
          this.field_M = false;
        }
        if (this.listener instanceof hf) {
          ((hf) (this.listener)).a(this, -40);
        }
    }

    void n(int param0) {
        if (this.listener instanceof hf) {
          ((hf) (this.listener)).a(this, (byte) -100);
        }
        if (param0 <= 7) {
          vb.i(41);
        }
    }

    private final int d(boolean param0) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (this.field_T == 0) {
          return this.field_T;
        }
        for (var2 = -1 + this.field_T; var2 > 0; var2--) {
          if (this.text.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        if (param0) {
          this.field_L = -72;
        }
        return var2;
    }

    private final String a(byte param0) {
        int var2 = this.field_L >= this.field_T ? this.field_T : this.field_L;
        if (param0 > -97) {
          return (String) null;
        }
        int var3 = this.field_L < this.field_T ? this.field_T : this.field_L;
        return this.text.substring(var2, var3);
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        WidgetLayoutProvider var5 = null;
        long var6 = 0L;
        if (obfuscationGuard != -11) {
          return;
        }
        if (null != this.renderer &&
          layer == 0) {
          this.renderer.paintWidget(this.enabled, -20618, parentX, (Widget) (this), parentY);
          if (this.renderer instanceof WidgetLayoutProvider) {
            var5 = (WidgetLayoutProvider) ((Object) this.renderer);
            if (this.field_T != this.field_L) {
              var5.a(-15964, parentY, parentX, this.field_L, this.field_T, (Widget) (this));
            }
            var6 = MonotonicTime.nowMillis(false);
            if ((var6 - this.field_O) % 1000L < 500L) {
              var5.a((Widget) (this), parentX, this.field_T, parentY, (byte) 123);
            }
          }
        }
    }

    final static void k(int param0) {
        if (!LevelPackSelectScreen.field_s) {
          throw new IllegalStateException();
        }
        SpaceBackground.field_t = true;
        RankingsScreen.a((byte) -71, true);
        AchievementIcon.field_j = param0;
    }

    final boolean a(int param0, byte param1, Widget param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_O = MonotonicTime.nowMillis(false);
          if (param1 != 110) {
            field_S = 20;
          }
          if (param3 != 60 &&
            62 != param3) {
            if (param3 >= 32 &&
              param3 <= 126) {
              if (this.field_T != this.field_L) {
                this.h(-84);
              }
              if (-1 == this.field_Q ||
                !(this.text.length() >= this.field_Q)) {
                if (this.field_T >= this.text.length()) {
                  this.text = this.text + param3;
                  dupTemp$0 = this.text.length();
                  this.field_T = dupTemp$0;
                  this.field_L = dupTemp$0;
                } else {
                  this.text = this.text.substring(0, this.field_T) + param3 + this.text.substring(this.field_T, this.text.length());
                  this.field_T = this.field_T + 1;
                  this.field_L = this.field_T;
                }
                this.n(66);
              }
              return true;
            }
            if (param0 != 85) {
              if (param0 == 101) {
                if (this.field_T != this.field_L) {
                  this.h(-114);
                  return true;
                }
                if (this.field_T < this.text.length()) {
                  this.field_L = this.field_T + 1;
                  this.h(param1 - 182);
                  return true;
                }
              } else {
                if (param0 == 13) {
                  this.c(false);
                  return true;
                }
                if (96 == param0) {
                  if (this.field_T <= 0) {
                    return false;
                  }
                  if (!IntArrayRequest.heldKeys[82]) {
                    stackIn_38_1 = this.field_T - 1;
                  } else {
                    stackIn_38_1 = this.d(false);
                  }
                  this.a(stackIn_38_1, param1 - 29);
                  return true;
                }
                if (param0 == 97) {
                  if (this.field_T < this.text.length()) {
                    if (!IntArrayRequest.heldKeys[82]) {
                      stackIn_69_1 = this.field_T + 1;
                    } else {
                      stackIn_69_1 = this.h((byte) 106);
                    }
                    this.a(stackIn_69_1, 81);
                    return true;
                  }
                } else {
                  if (param0 == 102) {
                    this.a(0, 81);
                    return true;
                  }
                  if (param0 == 103) {
                    this.a(this.text.length(), 81);
                    return true;
                  }
                  if (param0 == 84) {
                    this.j(-66);
                    return true;
                  }
                  if (IntArrayRequest.heldKeys[82] &&
                    param0 == 65) {
                    this.g((byte) -49);
                    return true;
                  }
                  if (IntArrayRequest.heldKeys[82] &&
                    66 == param0) {
                    this.l(0);
                    return true;
                  }
                  if (IntArrayRequest.heldKeys[82] &&
                    67 == param0) {
                    this.m(32);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_L != this.field_T) {
                this.h(param1 ^ -55);
                return true;
              }
              if (this.field_T > 0) {
                this.field_L = -1 + this.field_T;
                this.h(param1 ^ -41);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_82_0 = var5;
          stackIn_82_1 = new StringBuilder().append("vb.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void g(byte param0) {
        this.l(param0 ^ -49);
        this.h(-118);
        if (param0 != -49) {
          this.field_O = -103L;
        }
    }

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.handlePointerPress(focusRoot, pointerX, parentX, parentY, button, pointerY, obfuscationGuard + obfuscationGuard)) {
            return false;
          }
          if (!(this.renderer instanceof WidgetLayoutProvider)) {
            return false;
          }
          var8_int = ((WidgetLayoutProvider) ((Object) this.renderer)).a((Widget) (this), MusicPatch.pointerX, true, parentY, po.pointerY, parentX);
          if (var8_int == -1) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = var8_int;
          }
          this.a(stackIn_7_1, 81);
          var8_long = MonotonicTime.nowMillis(false);
          stackIn_10_1 = !(-this.field_P + var8_long >= 250L);
          this.field_M = stackIn_10_1;
          if (this.field_M) {
            this.field_L = this.d(false);
            this.field_T = this.h((byte) 103);
            if (this.field_T > 0 &&
              this.text.charAt(-1 + this.field_T) == 32) {
              this.field_T = this.field_T - 1;
            }
            this.field_R = this.field_T;
          }
          this.field_P = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("vb.MA(");
          if (focusRoot == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
