/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends ek implements ButtonListener {
    static Sprite[] field_L;
    static int field_C;
    private wd field_J;
    static String field_N;
    private FocusableWidget field_M;
    static String[] field_I;
    static boolean field_P;
    static int field_Q;

    final void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        try {
          super.updateHover(param0, param1, param2, param3);
          this.field_M.field_y = this.field_J.a((byte) 127).c(100) == CachedArchiveSource.field_g ? true : false;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "eh.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static hb a(int param0, TertiaryNodeList param1) {
        RuntimeException var2 = null;
        pd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25) {
            field_N = (String) null;
          }
          stackIn_3_0 = new pd(param1);
          return (hb) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("eh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        field_N = null;
        field_I = null;
        field_L = null;
        int var1 = -111 / ((param0 + 43) / 42);
    }

    final void h(int param0) {
        int var2 = 250;
        this.field_J.setBounds(this.field_n + 20 - 25 >> 1, 25, (byte) 118, -var2 + this.field_x >> 1, 140);
        this.field_M.setBounds((this.field_n - 10 >> 1) + 2, 30, (byte) 103, 140 + ((this.field_x - var2 >> 1) + 10), 100);
        int var3 = -95 / ((param0 + 31) / 62);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3);
        EmailValidator.field_x.drawString(kr.field_c, this.field_m + (param3 + 4), this.field_q + (param2 + (EmailValidator.field_x.field_J + 4)), 16777215, -1);
    }

    public final void a(FocusableWidget param0, int param1, int param2, int param3, int param4) {
        if (this.field_J.a((byte) 111).c(-123) != CachedArchiveSource.field_g) {
          return;
        }
        try {
          vf.a(this.field_J.l(88), this.field_J.f((byte) 96), 4, this.field_J.d(false));
          if (param1 != 6) {
            field_Q = -62;
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "eh.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    eh(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetPainter) null);
        this.field_J = new wd(new rr(10000536), va.field_j, 0, 0, 140, 25);
        this.field_J.a(new ja(), -70);
        this.field_M = new FocusableWidget(gq.field_b, (WidgetListener) (this));
        this.field_B = new UiWidget[]{(UiWidget) ((Object) this.field_J), (UiWidget) ((Object) this.field_M)};
        this.field_M.field_p = (WidgetPainter) ((Object) new qp());
        this.reapplyBounds((byte) -118);
    }

    static {
        field_N = "<%0> has lost connection.";
        field_I = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th"};
        field_P = true;
    }
}
