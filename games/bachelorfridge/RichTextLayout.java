/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RichTextLayout extends TextLayout {
    static String field_n;
    private int field_i;
    private BitmapFont field_m;
    static int field_r;
    private int field_l;
    private boolean field_f;
    static Sprite[] field_g;
    static int field_q;
    static int field_h;
    private int field_o;
    private String field_j;
    private int field_k;
    private int field_p;

    final void layoutSingleLineRightAligned(BitmapFont param0, String param1, int param2, int param3, int param4) {
        TextLineMetrics var8 = null;
        TextLineMetrics var9 = null;
        if (param1 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_m == param0 && this.field_f && this.field_l == 2 && null != this.field_j &&
          this.field_j.equals(param1)) {
          return;
        }
        try {
          this.field_f = true;
          this.field_j = param1;
          this.field_l = param4;
          this.field_m = param0;
          var8 = this.initializeSingleLineMetrics(param2, param4 - 30329, param0, param1);
          var9 = var8;
          var9.field_a[0] = param3 - param0.stringWidth(param1);
          var9.field_a[param1.length()] = param3;
          jia.a(param0, var9, 0, (byte) -79, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void layoutSingleLineCentered(int param0, int param1, BitmapFont param2, String param3, int param4) {
        TextLineMetrics var8 = null;
        int var7 = 0;
        if (param3 == null) {
          this.field_a = null;
          return;
        }
        if (param2 == this.field_m && this.field_f && this.field_l == 1 && null != this.field_j &&
          this.field_j.equals(param3)) {
          return;
        }
        try {
          this.field_l = param1;
          this.field_f = true;
          this.field_m = param2;
          var8 = this.initializeSingleLineMetrics(param0, -30327, param2, param3);
          var7 = param2.stringWidth(param3);
          var8.field_a[0] = param4 - (var7 >> 1);
          var8.field_a[param3.length()] = (var7 >> 1) + param4;
          jia.a(param2, var8, 0, (byte) -75, param3);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tq.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void layoutWrappedText(BitmapFont param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        TextLineMetrics stackIn_36_0;
        TextLineMetrics stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        TextLineMetrics stackIn_37_0 = null;
        TextLineMetrics stackIn_37_1 = null;
        int stackIn_37_4 = 0;
        BitmapFont stackIn_40_0 = null;
        TextLineMetrics stackIn_40_1 = null;
        int stackIn_41_2 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        TextLineMetrics var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = BachelorFridge.field_y;
        try {
          if (param1 == 0) {
            param1 = param0.field_F;
          }
          if (param4 == null) {
            this.field_a = null;
            return;
          }
          if (param3 <= 40) {
            return;
          }
          if (param0 == this.field_m &&
            !this.field_f &&
            this.field_l == param5 &&
            this.field_i == param2 &&
            param1 == this.field_k &&
            param6 == this.field_o &&
            this.field_p == param7 &&
            null != this.field_j &&
            this.field_j.equals(param4)) {
            return;
          }
          this.field_j = param4;
          this.field_i = param2;
          this.field_f = false;
          this.field_m = param0;
          this.field_o = param6;
          this.field_l = param5;
          this.field_p = param7;
          this.field_k = param1;
          var16 = new String[param0.lineCount(param4, param7) + 1];
          var17 = var16;
          var10 = Math.max(1, param0.wrapText(param4, new int[]{param7}, var17));
          if (this.field_i == 3 &&
            1 == var10) {
            this.field_i = 1;
          }
          this.field_a = new TextLineMetrics[var10];
          if (0 != this.field_i) {
            if (1 == this.field_i) {
              var11 = (-(this.field_k * var10) + this.field_o >> 1) + param0.field_u;
            } else {
              if (this.field_i != 2) {
                var12 = (-(this.field_k * var10) + this.field_o) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param0.field_u;
                this.field_k = this.field_k + var12;
              } else {
                var11 = -(this.field_k * var10) - param0.field_B + this.field_o;
              }
            }
          } else {
            var11 = param0.field_u;
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_36_0 = null;
            stackIn_36_1 = null;
            stackIn_36_2 = var11 - param0.field_u;
            stackIn_36_3 = param0.field_B + var11;
            if (var13 == null) {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = 0;
            } else {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = var13.length();
            }
            var14 = new TextLineMetrics(stackIn_36_2, stackIn_36_3, stackIn_37_4);
            var14.field_a[0] = 0;
            if (var13 != null) {
              var14.field_a[var13.length()] = param0.stringWidth(var13);
              stackIn_40_0 = (BitmapFont) (param0);
              stackIn_40_1 = var14;
              if (param5 != 3) {
                stackIn_41_2 = 0;
              } else {
                stackIn_41_2 = this.computeJustificationStep(-1, var13, param0.stringWidth(var13), param7);
              }
              jia.a(stackIn_40_0, stackIn_40_1, stackIn_41_2, (byte) -96, var13);
            }
            var11 = var11 + param1;
            this.field_a[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_46_0 = var9;
          stackIn_46_1 = new StringBuilder().append("tq.F(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final TextLineMetrics initializeSingleLineMetrics(int param0, int param1, BitmapFont param2, String param3) {
        TextLineMetrics var5 = null;
        RuntimeException var5_ref = null;
        TextLineMetrics var6 = null;
        TextLineMetrics stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new TextLineMetrics(param0 - param2.field_u, param2.field_B + param0, param3.length());
          var5 = var6;
          this.field_a = new TextLineMetrics[]{var6};
          if (param1 != -30327) {
            this.field_k = -62;
          }
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("tq.C(").append(param0).append(',').append(param1).append(',');
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
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void layoutSingleLineLeftAligned(int param0, String param1, BitmapFont param2, int param3, int param4) {
        TextLineMetrics var7 = null;
        TextLineMetrics var8 = null;
        if (param1 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_m == param2 && this.field_f && this.field_l == 0 && null != this.field_j &&
          this.field_j.equals(param1)) {
          return;
        }
        try {
          this.field_f = true;
          this.field_m = param2;
          this.field_j = param1;
          this.field_l = 0;
          var7 = this.initializeSingleLineMetrics(param3, param0 ^ -30327, param2, param1);
          var8 = var7;
          var7.field_a[0] = param4;
          var8.field_a[param1.length()] = param4 + param2.stringWidth(param1);
          jia.a(param2, var8, param0, (byte) -109, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -15298) {
          return;
        }
        field_g = null;
        field_n = null;
    }

    public RichTextLayout() {
    }

    static {
        field_n = "Log in";
    }
}
