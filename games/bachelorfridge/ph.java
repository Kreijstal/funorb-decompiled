/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends WidgetContainer implements fca, WidgetActionListener {
    private InteractiveWidget field_K;
    private InteractiveWidget field_M;
    private boolean field_I;
    private TextInputWidget field_Q;
    private String field_L;
    static int field_E;
    private boolean field_J;
    private TextInputWidget field_H;
    private InteractiveWidget field_O;
    static int field_G;
    static int field_D;
    private boolean field_F;
    static String field_N;
    static long field_P;
    static Sprite field_C;

    public final void a(TextInputWidget param0, byte param1) {
        try {
          int var3_int = 85 % ((0 - param1) / 49);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ph.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        if (BagpipeSpecial.b(68) ||
          !(this.field_Q.text.length() <= 0) &&
          !(this.field_H.text.length() <= 0)) {
          g.a(this.field_H.text, this.field_Q.text, (byte) 81);
        }
        if (param0 > -2) {
          this.k(78);
        }
    }

    final void b(boolean param0) {
        this.field_Q.j((byte) -108);
        this.field_H.j((byte) -69);
        if (param0) {
          field_E = -85;
        }
    }

    public final void a(TextInputWidget param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_Q) {
            this.field_H.acquireFocus((UiWidget) (this), -83);
          }
          if (this.field_H == param0) {
            this.k(-118);
          }
          if (param1 != 0) {
            field_P = -122L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ph.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void draw(byte param0, int param1, int param2, int param3) {
        int var5 = -90 % ((param0 + 20) / 54);
        if (this.field_L != null) {
          jca.field_a.drawParagraph(this.field_L, this.x + param3 + 20, 15 + (param1 + this.y), this.width - 40, this.height, 16777215, -1, 1, 0, jca.field_a.field_u);
        }
        if (null != this.field_O) {
          SoftwareRasterizer.drawHorizontalLine(param3 + 10, param1 + 134, this.width - 20, 4210752);
        }
        super.draw((byte) -102, param1, param2, param3);
    }

    final String a(int param0) {
        if (null == this.field_Q.text) {
          return "";
        }
        if (param0 != 1) {
          TextInputWidget var3 = (TextInputWidget) null;
          this.a((TextInputWidget) null, (byte) 127);
        }
        return this.field_Q.text;
    }

    public static void releaseStatics(int param0) {
        field_C = null;
        if (param0 != 31826) {
          field_C = (Sprite) null;
        }
        field_N = null;
    }

    public final void a(int param0, InteractiveWidget param1, int param2, byte param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (this.field_M != param1) {
            if (param1 == this.field_O) {
              qfa.f(-27);
            } else {
              if (param1 == this.field_K) {
                if (!this.field_J) {
                  if (!this.field_F) {
                    f.a((byte) 101);
                  } else {
                    jja.d((byte) 70);
                  }
                } else {
                  FridgeScreen.b((byte) -67);
                }
              }
            }
          } else {
            this.k(-94);
          }
          if (param3 < 50) {
            ph.releaseStatics(13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ph.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(-126, param3);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(param3, 1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ph.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ph(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        ge dupTemp$0 = null;
        ge dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        InteractiveWidget stackIn_17_1 = null;
        InteractiveWidget stackIn_17_2 = null;
        InteractiveWidget stackIn_18_1 = null;
        InteractiveWidget stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ff var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        hk var9 = null;
        ge var12 = null;
        ge var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_I = stackIn_4_1;
          this.field_L = param1;
          stackIn_7_1 = (param2);
          this.field_J = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_F = stackIn_10_1;
          if (this.field_J && (this.field_I ||
            this.field_F)) {
            throw new IllegalStateException();
          }
          this.field_Q = (TextInputWidget) ((Object) new vn(param0, (WidgetListener) (this), 100));
          this.field_H = (TextInputWidget) ((Object) new vn("", (WidgetListener) (this), 20));
          if (this.field_J) {
            this.field_M = new InteractiveWidget(bga.field_k, (WidgetListener) null);
            this.field_K = new InteractiveWidget(uda.field_ab, (WidgetListener) null);
            this.field_Q.field_z = false;
          } else {
            this.field_M = new InteractiveWidget(tq.field_n, (WidgetListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_F) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = tja.field_b;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ina.field_s;
            }
            this.field_K = new InteractiveWidget(stackIn_18_3, (WidgetListener) null);
            if (this.field_I) {
              this.field_O = new InteractiveWidget(MouseWheelInput.field_b, (WidgetListener) (this));
            }
          }
          this.field_Q.renderer = (WidgetRenderer) ((Object) new oka(10000536));
          this.field_H.renderer = (WidgetRenderer) ((Object) new cm(10000536));
          var6 = new ff();
          this.field_M.renderer = (WidgetRenderer) ((Object) var6);
          if (this.field_K != null) {
            this.field_K.renderer = (WidgetRenderer) ((Object) var6);
          }
          this.field_Q.tooltip = ba.field_r;
          if (null != this.field_O) {
            this.field_O.renderer = (WidgetRenderer) ((Object) var6);
          }
          if (null != this.field_O) {
            this.field_O.tooltip = qha.field_h;
          }
          if (!this.field_J) {
            if (this.field_F) {
              this.field_K.tooltip = lna.field_h;
              this.field_K.renderer = (WidgetRenderer) ((Object) new pka());
            } else {
              this.field_K.renderer = (WidgetRenderer) ((Object) new pka());
            }
          } else {
            this.field_K.tooltip = IterableNodeHashTable.field_e;
          }
          this.y = 15;
          var7 = jca.field_a;
          if (null != this.field_L) {
            this.y = this.y + (5 + var7.measureWrappedHeight(this.field_L, -40 + this.width, var7.field_u));
          }
          var8 = rw.field_b;
          var9 = SleepAnimation.a((byte) 127, nia.d(-31768));
          if (DiskCacheRequest.field_u == var9) {
            var8 = kr.field_zb;
          } else {
            if (FlirtAnimation.field_x == var9) {
              var8 = ji.field_g;
            }
          }
          dupTemp$0 = new ge(10, this.y, -20 + this.width, 25, this.field_Q, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.c(dupTemp$0, 15);
          this.y = this.y + (((UiWidget) ((Object) var12)).height + 5);
          dupTemp$1 = new ge(10, this.y, this.width - 20, 25, this.field_H, false, 80, 3, var7, 16777215, MassPoisonSpecial.field_r);
          var13 = dupTemp$1;
          this.c(dupTemp$1, -120);
          this.y = this.y + (5 + ((UiWidget) ((Object) var13)).height);
          this.field_M.listener = (WidgetListener) (this);
          if (null != this.field_O) {
            this.field_O.listener = (WidgetListener) (this);
          }
          if (null != this.field_K) {
            this.field_K.listener = (WidgetListener) (this);
          }
          if (null != this.field_O) {
            this.field_M.a(85, 30, (byte) 59, this.width - 95, this.y);
            this.y = this.y + 60;
          } else {
            this.field_M.a(8, 30, (byte) 59, -6 + this.width - 10, this.y);
            this.y = this.y + 35;
          }
          if (this.field_O != null) {
            this.field_O.a(8, 30, (byte) 59, -10 + this.width - 6, this.y);
            this.y = this.y + 35;
          }
          if (this.field_K != null) {
            if (!this.field_J &&
              !this.field_F) {
              this.field_K.a(8, 20, (byte) 59, 40, this.y);
              this.y = this.y + 25;
            } else {
              this.field_K.a(8, 30, (byte) 59, -16 + this.width, this.y);
              this.y = this.y + 35;
            }
          }
          this.a(0, 3 + this.y, (byte) 59, this.width, 0);
          this.c(this.field_M, -126);
          if (null != this.field_O) {
            this.c(this.field_O, -123);
          }
          if (this.field_K != null) {
            this.c(this.field_K, -120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ph.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        TextInputWidget var3 = null;
        String var4 = null;
        if (param0 >= -89) {
          return;
        }
        try {
          var3 = this.field_Q;
          var4 = param1;
          var3.a((byte) 123, var4, false);
          this.field_H.j((byte) 101);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ph.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "This game option is only available to members.";
        pja.a(false, 50);
    }
}
