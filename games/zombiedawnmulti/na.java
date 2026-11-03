/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends SingleChildWidget {
    static IndexedSprite field_I;
    static String field_F;
    int field_E;
    static Sprite[] field_G;
    static int[][] field_J;
    static int[] field_K;
    static IndexedSprite[][] field_H;

    na(UiWidget param0) {
        super(param0.field_y, param0.field_i, param0.field_n, param0.field_w, (WidgetPainter) null, (WidgetListener) null);
        try {
          param0.setWidgetBounds(0, 0, 28972, this.field_n, this.field_w);
          this.field_E = 256;
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_K = null;
        field_H = (IndexedSprite[][]) null;
        field_F = null;
        field_G = null;
        field_I = null;
        if (param0 >= -59) {
          return;
        }
        field_J = (int[][]) null;
    }

    final void renderWidget(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          return;
        }
        if (this.field_B == null) {
          return;
        }
        if (this.field_E == 0) {
          return;
        }
        if (this.field_E == 256) {
          this.field_B.renderWidget(-2, param1 + this.field_i, param2, param3 + this.field_y);
          return;
        }
        Sprite var6 = new Sprite(this.field_B.field_n, this.field_B.field_w);
        r.a(0, var6);
        if (param0 != -2) {
          field_G = (Sprite[]) null;
        }
        this.field_B.renderWidget(param0 + 0, 0, param2, 0);
        ql.a(true);
        var6.c(param3 + this.field_y, param1 + this.field_i, this.field_E);
    }

    public na() {
        super(0, 0, 0, 0, (WidgetPainter) null, (WidgetListener) null);
        this.field_E = 256;
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        if (PowerupCommand.field_p &&
          io.field_g &&
          WidgetContainer.field_E > 0) {
          var3 = (400 - WidgetContainer.field_E >> 1) + 10;
          var4 = 20 + WidgetContainer.field_E + param1;
          var5 = 40;
          if (param0 > var3 &&
            var5 < param2 &&
            param0 < var3 + var4 &&
            var5 + hj.field_g > param2) {
            iq.a(-14, (byte) 99);
            return true;
          }
          return false;
        }
        return false;
    }

    final static void a(byte param0, NavigationGrid param1) {
        int var4 = 0;
        int[][] var2 = null;
        int var3 = 0;
        int var5 = 0;
        int[][] var6 = null;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var6 = param1.level.field_k;
          var2 = var6;
          ImageProducerRasterBuffer.field_j = new int[var6.length][var6[0].length];
          var3 = 0;
          if (param0 <= 124) {
            field_J = (int[][]) null;
          }
          while (var3 < var2.length) {
            for (var4 = 0; var4 < var2[0].length; var4++) {
              stackIn_8_0 = ImageProducerRasterBuffer.field_j[var3];
              stackIn_8_1 = var4;
              if (0 != ScrollPane.b(1, var2[var3][var4])) {
                stackIn_9_2 = 0;
              } else {
                stackIn_9_2 = -1;
              }
              stackIn_8_0[stackIn_8_1] = stackIn_9_2;
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("na.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(int[] param0, byte param1, String param2, long param3, int param4) {
        QuickChatMenu var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -35) {
            na.b(-55, -5, 10);
          }
          if (!tn.a(param2, param3, (byte) -91, param4, param0)) {
            return false;
          }
          if (1 == param4) {
            param4 = 0;
          }
          qf.field_g = param2;
          va.field_a = param4;
          var7 = (CharSequence) ((Object) param2);
          ql.field_a = tg.a(var7, false);
          jj.field_M = param3;
          var6 = SceneObject.a(GameWorld.field_x, DelayedPacket.field_k, (byte) -65, param0, tg.field_d);
          wi.a((byte) 4, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_11_0 = var6_ref;
          stackIn_11_1 = new StringBuilder().append("na.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_F = "Confuse clueless humans with smoke and mirrors...";
        field_H = new IndexedSprite[1][];
    }
}
