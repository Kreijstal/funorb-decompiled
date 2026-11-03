/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends WidgetContainer implements TextFieldListener, ButtonListener {
    private boolean field_L;
    private FocusableWidget field_K;
    private String field_J;
    static String field_G;
    static int field_F;
    static String field_N;
    private FocusableWidget field_P;
    static gr field_I;
    private TextFieldWidget field_H;
    private FocusableWidget field_Q;
    private TextFieldWidget field_R;
    private boolean field_D;
    private boolean field_E;
    static String field_M;
    static int field_O;

    final void a(int param0, String param1) {
        TextFieldWidget var3 = null;
        String var4 = null;
        if (param0 != 16311) {
          return;
        }
        try {
          var3 = this.field_H;
          var4 = param1;
          var3.setText(108, var4, false);
          this.field_R.clear(true);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ri.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void k(int param0) {
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if ((ce.field_x.field_P.field_y & 1 << ce.field_x.field_h) != 0) {
          oq.field_i[11] = te.field_a;
        } else {
          if (ce.field_x.field_P.field_y == 0) {
            oq.field_i[11] = kd.field_c;
          } else {
            oq.field_i[11] = bb.field_a;
          }
        }
        if (param0 != 8) {
          field_N = (String) null;
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.isBeforeFocusedChild(param3, true);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.isAfterFocusedChild(param3, 102);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static th a(String param0, String param1, Archive param2, Archive param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        th stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.getGroupIdByName(126, param1);
          var6 = param2.getFileIdByName(var5_int, (byte) 106, param0);
          var7 = 72 % ((38 - param4) / 49);
          stackIn_1_0 = EmailValidator.a(var6, var5_int, param2, param3, -121);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ri.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
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
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(TextFieldWidget param0, int param1) {
        try {
          if (param1 != 95) {
            this.field_K = (FocusableWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ri.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        if (DialPainter.a(1) ||
          !(this.field_H.field_s.length() <= 0) &&
          !(0 >= this.field_R.field_s.length())) {
          BoundsRect.a((byte) 81, this.field_R.field_s, this.field_H.field_s);
        }
        if (param0 > -126) {
          this.a(-6);
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_J != null) {
          gn.field_u.a(this.field_J, 20 + (param3 + this.field_m), 15 + this.field_q + param2, -40 + this.field_x, this.field_n, 16777215, -1, 1, 0, gn.field_u.field_J);
        }
        if (this.field_Q != null) {
          SoftwareRasterizer.drawHorizontalLine(param3 + 10, 134 + param2, this.field_x - 20, 4210752);
        }
        super.drawLayer(param0, param1, param2, param3);
    }

    public final void a(int param0, TextFieldWidget param1) {
        Archive var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == this.field_H) {
            this.field_R.containsWidget((byte) -21, (UiWidget) (this));
          }
          if (this.field_R == param1) {
            this.a(param0 - 4468);
          }
          if (param0 != 4340) {
            var4 = (Archive) null;
            ri.a((String) null, (String) null, (Archive) null, (Archive) null, (byte) -106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ri.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ri(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        pg dupTemp$0 = null;
        pg dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        FocusableWidget stackIn_18_1 = null;
        FocusableWidget stackIn_18_2 = null;
        FocusableWidget stackIn_19_1 = null;
        FocusableWidget stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        qp var6 = null;
        RuntimeException var6_ref = null;
        nq var7 = null;
        String var8 = null;
        bg var9 = null;
        pg var12 = null;
        pg var13 = null;
        try {
          this.field_J = param1;
          stackIn_4_1 = (param3);
          this.field_E = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_D = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_L = stackIn_10_1;
          if (this.field_L && (this.field_E ||
            this.field_D)) {
            throw new IllegalStateException();
          }
          this.field_H = (TextFieldWidget) ((Object) new fa(param0, (WidgetListener) (this), 100));
          this.field_R = (TextFieldWidget) ((Object) new fa("", (WidgetListener) (this), 20));
          if (!this.field_L) {
            this.field_K = new FocusableWidget(wl.field_e, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_D) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ss.field_e;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = MapView.field_Pb;
            }
            this.field_P = new FocusableWidget(stackIn_19_3, (WidgetListener) null);
            if (this.field_E) {
              this.field_Q = new FocusableWidget(oj.field_Ab, (WidgetListener) (this));
            }
          } else {
            this.field_K = new FocusableWidget(ts.field_E, (WidgetListener) null);
            this.field_P = new FocusableWidget(ProductionContent.field_g, (WidgetListener) null);
            this.field_H.field_y = false;
          }
          this.field_H.field_p = (WidgetPainter) ((Object) new rr(10000536));
          this.field_R.field_p = (WidgetPainter) ((Object) new ce(10000536));
          var6 = new qp();
          this.field_K.field_p = (WidgetPainter) ((Object) var6);
          if (this.field_P != null) {
            this.field_P.field_p = (WidgetPainter) ((Object) var6);
          }
          if (this.field_Q != null) {
            this.field_Q.field_p = (WidgetPainter) ((Object) var6);
          }
          this.field_H.field_v = sf.field_a;
          if (null != this.field_Q) {
            this.field_Q.field_v = CandidateLink.field_m;
          }
          if (this.field_L) {
            this.field_P.field_v = MouseInputHandler.field_a;
          } else {
            if (this.field_D) {
              this.field_P.field_v = bs.field_c;
              this.field_P.field_p = (WidgetPainter) ((Object) new LinkPainter());
            } else {
              this.field_P.field_p = (WidgetPainter) ((Object) new LinkPainter());
            }
          }
          this.field_q = 15;
          var7 = gn.field_u;
          if (null != this.field_J) {
            this.field_q = this.field_q + (var7.textHeight(this.field_J, this.field_x - 40, var7.field_J) + 5);
          }
          var8 = ListContent.field_e;
          var9 = ArchiveRequest.a(GameScreen.getHostApplet((byte) 124), true);
          if (var9 == og.field_b) {
            var8 = QuaternaryLinkNode.field_v;
          } else {
            if (ObjectList.field_f == var9) {
              var8 = ba.field_b;
            }
          }
          dupTemp$0 = new pg(10, this.field_q, -20 + this.field_x, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b((byte) -65, dupTemp$0);
          this.field_q = this.field_q + (((UiWidget) ((Object) var12)).field_n + 5);
          dupTemp$1 = new pg(10, this.field_q, this.field_x - 20, 25, this.field_R, false, 80, 3, var7, 16777215, GarrisonTask.field_t);
          var13 = dupTemp$1;
          this.b((byte) -66, dupTemp$1);
          this.field_q = this.field_q + (((UiWidget) ((Object) var13)).field_n + 5);
          this.field_K.field_u = (WidgetListener) (this);
          if (null != this.field_Q) {
            this.field_Q.field_u = (WidgetListener) (this);
          }
          if (null != this.field_P) {
            this.field_P.field_u = (WidgetListener) (this);
          }
          if (null == this.field_Q) {
            this.field_K.setBounds(this.field_q, 30, (byte) 106, 8, -6 + (this.field_x - 10));
            this.field_q = this.field_q + 35;
          } else {
            this.field_K.setBounds(this.field_q, 30, (byte) 110, 85, this.field_x - 95);
            this.field_q = this.field_q + 60;
          }
          if (null != this.field_Q) {
            this.field_Q.setBounds(this.field_q, 30, (byte) 115, 8, this.field_x - 16);
            this.field_q = this.field_q + 35;
          }
          if (this.field_P != null) {
            if (!this.field_L &&
              !this.field_D) {
              this.field_P.setBounds(this.field_q, 20, (byte) 108, 8, 40);
              this.field_q = this.field_q + 25;
            } else {
              this.field_P.setBounds(this.field_q, 30, (byte) 124, 8, -10 + this.field_x - 6);
              this.field_q = this.field_q + 35;
            }
          }
          this.setBounds(0, this.field_q + 3, (byte) 100, 0, this.field_x);
          this.b((byte) -98, this.field_K);
          if (null != this.field_Q) {
            this.b((byte) -44, this.field_Q);
          }
          if (this.field_P != null) {
            this.b((byte) -87, this.field_P);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ri.<init>(");
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
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(FocusableWidget param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_K != param0) {
            if (this.field_Q == param0) {
              Wormhole.a((byte) 115);
            } else {
              if (this.field_P == param0) {
                if (this.field_L) {
                  WidgetTheme.a(0);
                } else {
                  if (this.field_D) {
                    WeightedLruCache.b((byte) -125);
                  } else {
                    SocketArchiveNetworkClient.h(30252);
                  }
                }
              }
            }
          } else {
            this.a(-127);
          }
          if (param1 != 6) {
            this.l(-45);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ri.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearStatics(byte param0) {
        field_M = null;
        field_I = null;
        field_N = null;
        if (param0 > -55) {
          ri.clearStatics((byte) 58);
        }
        field_G = null;
    }

    final String d(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (null == this.field_H.field_s) {
          return "";
        }
        return this.field_H.field_s;
    }

    final void l(int param0) {
        if (param0 != 8) {
          return;
        }
        this.field_H.clear(true);
        this.field_R.clear(true);
    }

    static {
        field_G = "Auto-respond to <%0>";
        field_N = "<%highlight>FLEET MOVEMENT</col> - To issue a fleet order, <%key>click</col> on a <%glossary>system</col> you control that has available fleets, then <%key>click</col> on a destination system. Fleets can make <%highlight>one</col> <%glossary>wormhole</col> jump per turn through hostile territory, but can move an unlimited distance through your own systems. Fleets that are about to move are displayed as a <%highlight>curved arrow</col> between the source and destination system.";
        field_F = 50;
        field_I = null;
        field_M = "Invalid date";
    }
}
