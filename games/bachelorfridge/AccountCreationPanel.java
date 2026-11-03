/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationPanel extends WidgetContainer implements pc, WidgetActionListener, uja {
    private vn field_D;
    private vn field_K;
    private InteractiveWidget field_M;
    dd field_J;
    private vn field_C;
    private vn field_I;
    static volatile int field_N;
    private vn field_G;
    private InteractiveWidget field_L;
    private LinkTextWidget field_E;
    private dia field_H;
    private vn field_F;

    private final String d(byte param0) {
        String discarded$0 = null;
        if (param0 != 125) {
          discarded$0 = this.d((byte) 95);
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final int a(String param0, int param1, int param2, byte param3, UiWidget param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        wu var8 = null;
        ge var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new ge(20, param1, param2 + 120, 25, param4, false, 120, 3, jca.field_a, 16777215, param0);
          var7 = -49 % ((55 - param3) / 43);
          this.c(var9, 107);
          var8 = new wu(((mca) ((Object) param4)).a(16728128));
          this.c(var8, 117);
          var8.a(var9.x + (var9.width + 3), 15, (byte) 59, 15, (var9.height - 15 >> 1) + var9.y);
          stackIn_1_0 = var9.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("ue.N(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int a(UiWidget param0, String param1, int param2, int param3, int param4, byte param5, String param6) {
        RuntimeException var8 = null;
        nf var9 = null;
        ge var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -14) {
            this.field_F = (vn) null;
          }
          var10 = new ge(20, param2, param4 + 120, 25, param0, false, 120, 3, jca.field_a, 16777215, param6);
          this.c(var10, 120);
          var9 = new nf(((mca) ((Object) param0)).a(16728128), param1, 126, var10.height + param2, param4 + 50, param3);
          var9.listener = (WidgetListener) (this);
          this.c(var9, -124);
          stackIn_3_0 = var9.height + var10.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ue.Q(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(int param0) {
        boolean discarded$0 = false;
        ((tt) (this.field_C.a(16728128))).d(-121);
        if (param0 != 14322) {
          mca var3 = (mca) null;
          discarded$0 = this.a(50, (mca) null);
        }
    }

    public final void a(int param0, LinkTextWidget param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param3 < 12) {
            return;
          }
          if (param0 == 0) {
            ffa.a("terms.ws", 12);
            return;
          }
          if (param0 == 1) {
            ffa.a("privacy.ws", 12);
            return;
          }
          if (param0 != 2) {
            return;
          }
          ffa.a("conduct.ws", 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ue.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public AccountCreationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_C = new vn("", (WidgetListener) null, 12);
        this.field_I = new vn("", (WidgetListener) null, 100);
        this.field_K = new vn("", (WidgetListener) null, 100);
        this.field_G = new vn("", (WidgetListener) null, 20);
        this.field_F = new vn("", (WidgetListener) null, 20);
        this.field_D = new vn("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_H = new dia("", (WidgetListener) null, var1 != 0);
        this.field_L = new InteractiveWidget(dp.field_p, (WidgetListener) null);
        this.field_M = new InteractiveWidget(SuperSpeedAllAnimation.field_x, (WidgetListener) null);
        this.field_C.tooltip = FloodAnimation.field_z;
        this.field_I.tooltip = MoveEventAnimation.field_w;
        this.field_K.tooltip = bv.field_d;
        this.field_G.tooltip = UiWidget.field_r;
        this.field_F.tooltip = eu.field_a;
        this.field_D.tooltip = wq.field_m;
        this.field_H.tooltip = ala.field_c;
        this.field_C.a(7, new tt(this.field_C));
        this.field_I.a(7, new el(this.field_I));
        this.field_K.a(7, new hna(this.field_K, this.field_I));
        this.field_G.a(7, new wg(this.field_G, this.field_C, this.field_I));
        this.field_F.a(7, new hb(this.field_F, this.field_G));
        this.field_D.a(7, new hka(this.field_D));
        this.field_L.field_z = false;
        this.field_L.renderer = (WidgetRenderer) ((Object) new ff());
        this.field_M.renderer = (WidgetRenderer) ((Object) new pka());
        this.field_C.renderer = (WidgetRenderer) ((Object) new oka(10000536));
        oka dupTemp$0 = new oka(10000536);
        this.field_K.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_I.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_D.renderer = (WidgetRenderer) ((Object) new oka(10000536));
        this.field_H.renderer = (WidgetRenderer) ((Object) new pt());
        cm dupTemp$1 = new cm(10000536);
        this.field_F.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_G.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = lga.a(true, new String[]{this.l(-81), this.d((byte) 125)}, ZombiesAnimation.field_x);
        int var3 = 20;
        var3 = var3 + this.a(var3, 170, ua.field_a, this.field_I, 120);
        var3 = var3 + (5 + this.a(this.field_K, "", var3, 20, 170, (byte) -14, rm.field_b));
        var3 = var3 + this.a(var3, 170, MassPoisonSpecial.field_r, this.field_G, 120);
        var3 = var3 + (this.a(-20199, var3, this.field_F, ug.field_m, hm.field_a, 170) + 5);
        var3 = var3 + (this.a(-20199, var3, this.field_C, saa.field_u, DreamsAnimation.field_v, 170) + 5);
        var3 = var3 + this.a(vr.field_h, var3, 170, (byte) -32, this.field_D);
        ge var4 = new ge(46, var3, -90 + this.width, 25, this.field_H, true, this.width - 120, 5, oc.field_l, 11579568, ona.field_vb);
        this.c(var4, 38);
        var3 = var3 + var4.height;
        DefaultWidgetRenderer var5 = new DefaultWidgetRenderer(jca.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, jca.field_a.field_u, -1, 2147483647, true);
        this.field_E = new LinkTextWidget(var2, var5);
        this.field_E.tooltip = "";
        this.field_E.a(1, 0, rt.field_b);
        this.field_E.a(1, 1, rt.field_b);
        this.field_E.listener = (WidgetListener) (this);
        this.field_E.a(var3, -90 + this.width, 46, (byte) -50);
        var3 = var3 + (15 + this.field_E.height);
        this.c(this.field_E, 102);
        int var6 = 4;
        int var7 = 200;
        this.field_L.a(496 - var7 >> 1, 40, (byte) 59, var7, var3);
        this.field_M.a(3 + var6, 40, (byte) 59, 60, 15 + var3);
        this.field_M.listener = (WidgetListener) (this);
        this.field_L.listener = (WidgetListener) (this);
        this.c(this.field_L, -126);
        this.c(this.field_M, -120);
        this.field_J = new dd((uja) (this));
        this.field_J.a(60 + (this.field_C.x + this.field_C.width), 150, (byte) 59, -60 + (-this.field_C.width - this.field_C.x) + this.width, 20 + this.field_C.y);
        this.c(this.field_J, 39);
        this.a(0, var6 + var3 + 55, (byte) 59, 496, 0);
    }

    private final String l(int param0) {
        int var2 = 6 % ((-21 - param0) / 53);
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, UiWidget param2, String param3, String param4, int param5) {
        int discarded$1 = 0;
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -20199) {
            var8 = (String) null;
            discarded$1 = this.a(15, -119, (UiWidget) null, (String) null, (String) null, -67);
          }
          stackIn_3_0 = this.a(param2, param3, param1, 35, param5, (byte) -14, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ue.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(String param0, byte param1) {
        vn var3 = null;
        String var4 = null;
        try {
          var3 = this.field_C;
          var4 = param0;
          ((TextInputWidget) ((Object) var3)).a((byte) 121, var4, false);
          int var3_int = 112 / ((param1 + 41) / 37);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ue.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, InteractiveWidget param1, int param2, byte param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        UiWidget var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 50) {
            var7 = (UiWidget) null;
            this.handleKey(65, 76, 'ￜ', (UiWidget) null);
          }
          if (this.field_M == param1) {
            jja.d((byte) 70);
            return;
          }
          if (param1 != this.field_L) {
            return;
          }
          discarded$1 = this.j(-11199);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ue.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void updateMouseOver(int param0, int param1, UiWidget param2, int param3) {
        if (param3 != 20) {
          return;
        }
        try {
          super.updateMouseOver(param0, param1, param2, param3 ^ 0);
          this.field_L.field_z = this.k(0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ue.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
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
          stackIn_13_1 = new StringBuilder().append("ue.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, String param2, UiWidget param3, int param4) {
        ge var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ge(20, param0, 120 + param1, 25, param3, false, param4, 3, jca.field_a, 16777215, param2);
          this.c(var6, 63);
          stackIn_1_0 = var6.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("ue.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean j(int param0) {
        int discarded$0 = 0;
        if (!this.k(0)) {
          return false;
        }
        if (param0 != -11199) {
          String var4 = (String) null;
          discarded$0 = this.a((UiWidget) null, (String) null, 10, -70, 12, (byte) 90, (String) null);
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_D.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return SpiltMilkSpecial.a(var2, this.field_H.field_B, this, 114, this.field_G.text, this.field_I.text, this.field_C.text);
    }

    private final boolean a(int param0, mca param1) {
        qu var3 = null;
        RuntimeException var3_ref = null;
        jg var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(16728128);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b(-19704);
          if (var4 == FoodShopPanel.field_f) {
            return false;
          }
          if (param0 != 25323) {
            return false;
          }
          if (var4 == cq.field_g) {
            return false;
          }
          if (md.field_o != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ue.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final boolean k(int param0) {
        if (!this.a(25323, (mca) (this.field_C))) {
          return false;
        }
        if (!this.a(25323, (mca) (this.field_I))) {
          return false;
        }
        if (!this.a(param0 + 25323, (mca) (this.field_K))) {
          return false;
        }
        if (!this.a(25323, (mca) (this.field_G))) {
          return false;
        }
        if (!this.a(25323, (mca) (this.field_F))) {
          return false;
        }
        if (!this.a(param0 + 25323, (mca) (this.field_D))) {
          return false;
        }
        if (param0 == 0) {
          return true;
        }
        this.field_M = (InteractiveWidget) null;
        return true;
    }

    static {
        field_N = -1;
    }
}
