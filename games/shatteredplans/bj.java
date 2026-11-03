/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends WidgetContainer implements ButtonListener {
    private dl field_F;
    static wa[] field_J;
    static String field_E;
    static AnimatedPanel field_D;
    static String field_M;
    static int field_L;
    private FocusableWidget[] field_I;
    static FullscreenFocusCanvas field_K;
    static Sprite field_H;
    private String[] field_G;

    public static void clearStatics(int param0) {
        if (param0 != 9075) {
          bj.clearStatics(-83);
        }
        field_E = null;
        field_D = null;
        field_M = null;
        field_K = null;
        field_J = null;
        field_H = null;
    }

    final static void k(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          nm.field_a = -1 + SoftwareRasterizer.field_k;
          if (param0 != 26987) {
            field_H = (Sprite) null;
          }
          WhirlpoolHasher.field_i = 0;
          if (field_J != null &&
            SoftwareRasterizer.field_k <= field_J.length) {
            for (var1_int = 0; var1_int < SoftwareRasterizer.field_k; var1_int++) {
              field_J[var1_int] = null;
            }
            return;
          }
          field_J = new wa[SoftwareRasterizer.field_k];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "bj.A(" + param0 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        nq var5 = gn.field_u;
        if (this.field_G != null) {
          var5.a(DebouncedValidator.field_c, param3 + this.field_m, this.field_q + param2, this.field_x, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_J);
        }
    }

    public final void a(FocusableWidget param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_G.length; var6_int++) {
            if (this.field_I[var6_int] == param0) {
              this.field_F.a(15270, this.field_G[var6_int]);
            }
          }
          if (param1 != 6) {
            this.drawLayer(105, -29, -115, 86);
          }
          if (this.field_I[this.field_G.length] == param0) {
            this.field_F.a(2147483647);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("bj.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    bj(dl param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkPainter var4 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_A.clear(0);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_G = new String[var3_int];
            for (var4_int = param1; var3_int > var4_int; var4_int++) {
              this.field_G[var4_int] = ih.a((CharSequence) ((Object) param0[var4_int]), 68).replace(' ', ' ');
            }
            var4 = new LinkPainter(gn.field_u, 0, 1);
            this.field_I = new FocusableWidget[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_I[var5] = new FocusableWidget(this.field_G[var5], (WidgetListener) (this));
              this.field_I[var5].field_p = (WidgetPainter) ((Object) var4);
              this.field_I[var5].field_v = SecondaryNodeDequeIterator.field_f;
              this.field_I[var5].setBounds(20 + var5 * 16, 15, (byte) 112, 0, 80);
              this.b((byte) -107, this.field_I[var5]);
            }
            this.field_I[var3_int] = new FocusableWidget(SolMapGenerator.field_p, (WidgetListener) (this));
            this.field_I[var3_int].field_p = (WidgetPainter) ((Object) var4);
            this.field_I[var3_int].setBounds(16 + (var3_int * 16 + 20), 15, (byte) 102, 0, 100);
            this.b((byte) -65, this.field_I[var3_int]);
            return;
          }
          this.field_G = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bj.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2 + 0, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.isBeforeFocusedChild(param3, true);
            return stackIn_6_0;
          }
          if (param2 != 13) {
            return true;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_13_0 = this.isAfterFocusedChild(param3, 116);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("bj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_M = "<%0> has left.";
    }
}
