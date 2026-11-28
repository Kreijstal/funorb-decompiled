/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ej {
    private String field_P;
    private boolean field_R;
    static int[] field_N;
    static int field_Q;
    private String field_S;
    static DefaultTextWidgetRenderer field_O;
    private dg field_T;
    static int[] field_V;
    private boolean field_U;

    public static void clearStaticReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_N = null;
        field_V = null;
        field_O = null;
    }

    ve(sk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_P = param1;
          if (null != this.field_P) {
            var3_int = qc.field_b.textHeight(this.field_P, 260, qc.field_b.field_H);
            this.a(150 + var3_int, (byte) -81, 300);
          }
          this.field_T = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_R = false;
          this.field_T.field_z = true;
          this.field_U = false;
          this.a(this.field_T, (byte) 74);
        } catch (RuntimeException runtimeException) {
          throw dd.wrapClientException((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        this.field_U = true;
        this.field_T.field_z = false;
        if (param0 != 1) {
          RgbSprite var3 = (RgbSprite) null;
          ve.a(62, -4, (RgbSprite) null, -58, 98, -124, (byte) 124, -112);
        }
    }

    final static void a(int param0, int param1, RgbSprite param2, int param3, int param4, int param5, byte param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        RgbSprite var20 = null;
        RgbSprite var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          if (SoftwareRasterizer.field_i > param5) {
            param3 = param3 - (SoftwareRasterizer.field_i - param5);
            param5 = SoftwareRasterizer.field_i;
          }
          if (SoftwareRasterizer.field_d > param7) {
            param1 = param1 - (SoftwareRasterizer.field_d - param7);
            param7 = SoftwareRasterizer.field_d;
          }
          if (SoftwareRasterizer.field_e < param5 + param3) {
            param3 = SoftwareRasterizer.field_e - param5;
          }
          if (param7 + param1 > SoftwareRasterizer.field_a) {
            param1 = SoftwareRasterizer.field_a - param7;
          }
          if (param3 > 0 &&
            param1 > 0) {
            var22 = param2.copy();
            var31 = SoftwareRasterizer.field_b;
            var10 = SoftwareRasterizer.field_f;
            var11 = SoftwareRasterizer.field_l;
            var30 = new int[4];
            SoftwareRasterizer.saveClip(var30);
            param2.bindAsRenderTarget();
            SoftwareRasterizer.intersectClip(var30[0], var30[1], var30[2], var30[3]);
            var13 = param5 + param7 * param2.field_o;
            var14 = -param3 + param2.field_o;
            var26 = var22.field_v;
            var23 = var26;
            var15 = var23;
            if (param6 < 52) {
              var20 = (RgbSprite) null;
              ve.a(69, -127, (RgbSprite) null, 0, -117, 43, (byte) -101, -90);
            }
            for (var16 = param7; var16 < param1 + param7; var16++) {
              for (var17 = param5; param5 + param3 > var17; var17++) {
                var18 = var26[var13];
                if (var18 != 0 && (var17 > 0 &&
                  0 == var15[var13 - 1] ||
                  0 < var16 &&
                  0 == var15[var13 - param2.field_o] ||
                  param2.field_o - 1 > var17 &&
                  var15[1 + var13] == 0 ||
                  !(var16 >= -1 + param2.field_k) &&
                  var15[param2.field_o + var13] == 0)) {
                  SoftwareRasterizer.fillCircle(var17, var16, param0, param4);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var22.draw(-param2.field_p, -param2.field_u);
            SoftwareRasterizer.setRasterBuffer(var31, var10, var11);
            SoftwareRasterizer.restoreClip(var30);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_47_0 = var8;
          stackIn_47_1 = new StringBuilder().append("ve.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw dd.wrapClientException((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(boolean param0, String param1, float param2, int param3) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 != 2113632) {
            return;
          }
          if (param0 != this.field_R) {
            stackIn_7_1 = (param0);
            this.field_R = stackIn_7_1;
            if (!this.field_R) {
              this.field_T.a(16711422, 2113632, 4210752);
              if (this.field_U) {
                this.field_T.field_z = false;
              }
            } else {
              this.field_T.a(16711422, 8405024, 4210752);
              this.field_T.field_z = true;
            }
            this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
            this.field_S = param1;
          } else {
            this.field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
            this.field_S = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ve.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        qc.field_b.drawCentred(this.field_S, param0 + (this.field_m >> 1), param1 + 103, 16777215, -1);
        if (null != this.field_P) {
          SoftwareRasterizer.drawHorizontalLine(param0 + 20, param1 + 113, 260, 8421504);
          qc.field_b.drawParagraph(this.field_P, param0 + 20, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, qc.field_b.field_H);
        }
    }

    static {
        field_V = new int[12];
        field_N = new int[8192];
    }
}
