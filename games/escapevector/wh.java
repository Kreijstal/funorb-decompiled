/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends TextLayout {
    private BitmapFont field_i;
    private boolean field_n;
    static int[] field_j;
    private String field_g;
    private int field_m;
    private int field_l;
    static tk field_p;
    private int field_k;
    private int field_o;
    private int field_h;

    final void a(BitmapFont param0, String param1, int param2, int param3, byte param4) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        try {
          if (param4 != 69) {
            BitmapFont var7 = (BitmapFont) null;
            vl discarded$0 = this.a((String) null, 107, 116, (BitmapFont) null);
          }
          if (param1 == null) {
            this.field_a = null;
            return;
          }
          if (param0 == this.field_i &&
            this.field_n &&
            this.field_l == 2 &&
            null != this.field_g &&
            this.field_g.equals(param1)) {
            return;
          }
          this.field_l = 2;
          this.field_n = true;
          this.field_g = param1;
          this.field_i = param0;
          vl var9 = this.a(param1, param3, 116, param0);
          vl var10 = var9;
          var10.field_b[0] = -param0.b(param1) + param2;
          var10.field_b[param1.length()] = param2;
          vi.a(0, param1, var10, param0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var6;
          StringBuilder stackIn_17_1 = new StringBuilder().append("wh.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final vl a(String param0, int param1, int param2, BitmapFont param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          vl var6 = new vl(-param3.field_r + param1, param1 + param3.field_x, param0.length());
          vl var5 = var6;
          if (param2 <= 112) {
            field_j = (int[]) null;
          }
          this.field_a = new vl[]{var6};
          vl stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("wh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, String param1, BitmapFont param2, int param3, int param4, int param5, int param6, byte param7) {
        int stackIn_36_4 = 0;
        int stackIn_40_0 = 0;
        String stackIn_46_2 = null;
        String stackIn_49_2 = null;
        int var11 = 0;
        int var16 = EscapeVector.obfuscationControl;
        try {
          if (param6 == 0) {
            param6 = param2.field_y;
          }
          if (param1 == null) {
            this.field_a = null;
            return;
          }
          if (this.field_i == param2 &&
            !this.field_n &&
            param4 == this.field_l &&
            param5 == this.field_h &&
            this.field_k == param6 &&
            this.field_m == param0 &&
            param3 == this.field_o &&
            null != this.field_g &&
            this.field_g.equals(param1)) {
            return;
          }
          this.field_g = param1;
          this.field_h = param5;
          this.field_k = param6;
          this.field_m = param0;
          this.field_i = param2;
          this.field_l = param4;
          this.field_o = param3;
          this.field_n = false;
          String[] var17 = new String[param2.a(param1, param3) + 1];
          String[] var18 = var17;
          int var10 = Math.max(1, param2.a(param1, new int[]{param3}, var18));
          int var12 = 55 / ((param7 - 65) / 32);
          if (this.field_h == 3 &&
            var10 == 1) {
            this.field_h = 1;
          }
          this.field_a = new vl[var10];
          if (this.field_h == 0) {
            var11 = param2.field_r;
          } else if (this.field_h == 1) {
            var11 = (-(this.field_k * var10) + this.field_m >> 1) + param2.field_r;
          } else if (2 != this.field_h) {
            int var13 = (-(var10 * this.field_k) + this.field_m) / (var10 + 1);
            if (0 > var13) {
              var13 = 0;
            }
            this.field_k = this.field_k + var13;
            var11 = param2.field_r + var13;
          } else {
            var11 = -param2.field_x + (this.field_m - var10 * this.field_k);
          }
          for (int var13Lifetime1 = 0; var10 > var13Lifetime1; var13Lifetime1++) {
            String var14 = var17[var13Lifetime1];
            vl stackIn_35_0 = null;
            vl stackIn_35_1 = null;
            int stackIn_35_2 = var11 - param2.field_r;
            int stackIn_35_3 = var11 + param2.field_x;
            if (var14 != null) {
              stackIn_36_4 = var14.length();
            } else {
              vl stackIn_36_0 = null;
              vl stackIn_36_1 = null;
              stackIn_36_4 = 0;
            }
            vl var15 = new vl(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var15.field_b[0] = 0;
            if (var14 != null) {
              var15.field_b[var14.length()] = param2.b(var14);
              if (3 != param4) {
                stackIn_40_0 = 0;
              } else {
                stackIn_40_0 = this.a(-21446, param2.b(var14), var14, param3);
              }
              vi.a(stackIn_40_0, var14, var15, param2, false);
            }
            this.field_a[var13Lifetime1] = var15;
            var11 = var11 + param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_45_0 = var9;
          StringBuilder stackIn_45_1 = new StringBuilder().append("wh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          StringBuilder stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, int param3, BitmapFont param4) {
        if (param0 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_i == param4 && this.field_n && this.field_l == 0 && null != this.field_g &&
          this.field_g.equals(param0)) {
          return;
        }
        try {
          this.field_g = param0;
          this.field_l = 0;
          this.field_i = param4;
          this.field_n = true;
          vl var7 = this.a(param0, param3, param1 + 117, param4);
          vl var8 = var7;
          var7.field_b[0] = param2;
          var8.field_b[param0.length()] = param2 + param4.b(param0);
          vi.a(param1, param0, var8, param4, false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        if (!param0) {
          wh.a(true);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final void a(String param0, int param1, BitmapFont param2, int param3, boolean param4) {
        if (param0 == null) {
          this.field_a = null;
          return;
        }
        if (param2 == this.field_i &&
          this.field_n &&
          this.field_l == 1 &&
          this.field_g != null &&
          this.field_g.equals(param0)) {
          return;
        }
        try {
          this.field_i = param2;
          this.field_n = param4 ? true : false;
          this.field_l = 1;
          vl var8 = this.a(param0, param3, 117, param2);
          int var7 = param2.b(param0);
          var8.field_b[0] = -(var7 >> 1) + param1;
          var8.field_b[param0.length()] = (var7 >> 1) + param1;
          vi.a(0, param0, var8, param2, false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wh.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public wh() {
    }

    static {
        field_p = new tk();
    }
}
