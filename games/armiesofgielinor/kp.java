/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp implements WidgetPainter {
    private int field_f;
    private BitmapFont field_a;
    static String field_k;
    private int field_g;
    static String field_c;
    static String field_j;
    private int field_b;
    private int field_d;
    static String field_e;
    private int field_i;
    private int field_h;

    final static int a(int param0, int param1) {
        int var2 = -125 / ((param1 + 11) / 51);
        int var3 = 0;
        if (0 == param0) {
          var3 = ol.field_B;
        }
        if (param0 == 1) {
          var3 = va.field_D;
        }
        if (param0 == 2) {
          var3 = cd.field_c;
        }
        return var3;
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        int var10 = 0;
        Widget stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        pi var12 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (widget instanceof pi) {
            stackIn_4_0 = (Widget) (widget);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (pi) (stackIn_4_0);
          SoftwareRaster.f(widget.x + originX, originY + widget.y, widget.width, widget.height, this.field_d);
          if (var12 != null) {
          }
          var7 = widget.width - 2 * var12.field_R;
          var8 = widget.x + originX + var12.field_R;
          if (obfuscationGuard > -79) {
            return;
          }
          var9 = originY - (-widget.y - var12.field_S);
          SoftwareRaster.h(var8, var9, var7 + var8, var9, this.field_b);
          for (var10 = var12.d((byte) -39) - 1; var10 >= 0; var10--) {
            SoftwareRaster.a(var7 * var12.a(var10, (byte) -47) / var12.a(-1) + var8, var9, this.field_h, this.field_f);
          }
          if (null == this.field_a) {
            return;
          }
          this.field_a.c(var12.field_v, var8 + var7 / 2, this.field_a.field_v + var9 + var12.field_S, this.field_g, this.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("kp.C(");
          if (widget == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_e = null;
        if (param0 == 2) {
          field_j = null;
          field_c = null;
          return;
        }
        field_c = (String) null;
        field_j = null;
        field_c = null;
    }

    final static boolean a(boolean param0, int param1, ResourceArchive param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            kp.a(81);
          }
          var5 = param2.getFile((byte) 72, param3, param1);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          b.a(var5, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("kp.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    kp(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_b = param3;
          this.field_a = param0;
          this.field_f = param6;
          this.field_g = param1;
          this.field_d = param4;
          this.field_i = param2;
          this.field_h = param5;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_c = "You cannot use equipment on portals.";
        field_j = "Prayer";
        field_e = "There are no valid types of game that match your preferences.";
    }
}
