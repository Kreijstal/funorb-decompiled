/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi implements dh {
    private int field_f;
    private int field_k;
    private int field_i;
    private int field_l;
    private int field_m;
    private int field_d;
    private BitmapFont field_b;
    private int field_e;
    private int field_j;
    private int field_n;
    private int field_a;
    static int pointerPressButtonSnapshot;
    private int field_h;
    static String[] mustLogin3Texts;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          if (!kk.a(param0, param1, (byte) 118)) {
            return false;
          }
          if (param2 >= -32) {
            return true;
          }
          var3_int = 0;
          L0: while (true) {
            if (param1.length() <= var3_int) {
              return true;
            }
            if (TextInputValidator.a(param1.charAt(var3_int), (byte) 118)) {
              var3_int++;
              continue L0;
            }
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var3);
          stackIn_17_1 = new StringBuilder().append("bi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        el stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vi var11 = null;
        try {
          if (param4 instanceof vi) {
            stackIn_3_0 = (el) (param4);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (vi) ((Object) stackIn_3_0);
          if (var11 != null) {
            param3 = param3 & var11.field_D;
          }
          if (param1 > -5) {
            this.field_a = -3;
          }
          var7 = 5592405;
          SoftwareRasterizer.fillRectangle(param4.field_v + param0, param2 + param4.field_m, param4.field_r, param4.field_h, this.field_d);
          if (param3) {
            var7 = 16777215;
          }
          var8 = this.field_k + (param0 + param4.field_v);
          var9 = this.field_j + (param4.field_m + param2);
          SoftwareRasterizer.drawRectangleDropShadow(var8, var9, this.field_n, this.field_h, 5592405);
          SoftwareRasterizer.fillRectangle(var8, var9, this.field_n, this.field_h, var7);
          if (var11.field_y) {
            SoftwareRasterizer.drawLine(var8, var9, this.field_n + var8, var9 + this.field_h, 1);
            SoftwareRasterizer.drawLine(var8 + this.field_n, var9, var8, this.field_h + var9, 1);
          }
          if (null != this.field_b) {
            var10 = this.field_m + this.field_n + this.field_k;
            this.field_b.drawParagraph(param4.field_s, var10 + param4.field_v + param0, param4.field_m + param2 + this.field_i, param4.field_r + (-this.field_m - var10), -(this.field_m << 1) + param4.field_h, this.field_e, this.field_f, this.field_a, this.field_l, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var6);
          stackIn_17_1 = new StringBuilder().append("bi.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        mustLogin3Texts = null;
    }

    bi(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_a = 1;
        this.field_l = 1;
        try {
            this.field_f = param4;
            this.field_m = param1;
            this.field_b = param0;
            this.field_n = param8;
            this.field_h = param7;
            this.field_e = param3;
            this.field_i = param2;
            this.field_k = param5;
            this.field_d = param9;
            this.field_j = param6;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        pointerPressButtonSnapshot = 0;
        mustLogin3Texts = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
