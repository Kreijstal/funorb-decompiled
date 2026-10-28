/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc implements WidgetPainter {
    private int field_f;
    private int field_i;
    private BitmapFont field_e;
    private int field_a;
    private int field_j;
    private int field_c;
    private int field_b;
    private int field_d;
    static int[] field_h;
    static Boolean field_g;

    final static void a(qd param0, int param1, int param2) {
        try {
          RasterSnapshot.field_l.addLast(-12328, param0);
          DebouncedValidator.a(param0, param1, true);
          if (param2 != 1) {
            sc.b((byte) 98);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        UiComponent stackIn_5_0 = null;
        String stackIn_15_2 = null;
        try {
          if (guard > -14) {
            java.awt.Component var14 = (java.awt.Component) null;
            sc.a((byte) 67, (java.awt.Component) null);
          }
          if (!(component instanceof eb)) {
            stackIn_5_0 = null;
          } else {
            stackIn_5_0 = (UiComponent) (component);
          }
          eb var15 = (eb) (stackIn_5_0);
          SoftwareRasterizer.a(component.x + originX, component.y + originY, component.width, component.height, this.field_a);
          if (var15 != null) {
          }
          int var7 = var15.field_D + (originX + component.x);
          int var8 = component.y + (originY + var15.field_I);
          SoftwareRasterizer.d(var7, var8, var15.field_N, this.field_c);
          if (var15.field_G != -1) {
            double var9 = 2.0 * (3.141592653589793 * (double)var15.field_G) / (double)var15.field_M;
            int var11 = (int)(-Math.sin(var9) * (double)var15.field_N);
            int var12 = (int)(Math.cos(var9) * (double)var15.field_N);
            SoftwareRasterizer.d(var7 + var11, var12 + var8, 1, this.field_b);
          }
          SoftwareRasterizer.d(var7, var8, 2, 1);
          double var9Lifetime1 = 3.141592653589793 * (double)var15.field_F * 2.0 / (double)var15.field_M;
          int var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var15.field_N);
          int var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var15.field_N);
          SoftwareRasterizer.d(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (null == this.field_e) {
            return;
          }
          int var13 = this.field_i + (var15.field_D + var15.field_N);
          this.field_e.a(component.text, var13 + component.x + originX, originY + (component.y + this.field_f), component.width - (var13 + this.field_i), component.height - (this.field_i << 1), this.field_j, this.field_d, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var6;
          StringBuilder stackIn_14_1 = new StringBuilder().append("sc.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(enabled).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (ff.field_e == 10) {
          fe.a(-84);
          ff.field_e = 11;
        } else if (!NetworkGameClient.i(56)) {
          fe.a(-84);
          ff.field_e = 11;
        }
        pb.field_d = true;
        if (param0 < -81) {
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        sc.a((byte) -55, (java.awt.Component) null);
    }

    public static void releaseStatics(byte guard) {
        if (guard >= -15) {
          return;
        }
        field_g = null;
        field_h = null;
    }

    sc(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_j = param3;
          this.field_b = param6;
          this.field_e = param0;
          this.field_d = param4;
          this.field_f = param2;
          this.field_c = param5;
          this.field_a = param7;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener(ck.field_v);
        param1.removeFocusListener(ck.field_v);
        if (param0 != -58) {
          return;
        }
        try {
          Js5Transport.field_b = -1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new int[]{0, 16384, 32768, 49152};
    }
}
