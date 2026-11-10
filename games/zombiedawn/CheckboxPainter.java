/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class CheckboxPainter implements WidgetPainter {
    private int field_l;
    private int field_i;
    private int field_q;
    private int field_h;
    static InputValidationResult field_m;
    private int field_j;
    static String[] field_p;
    private Font field_d;
    private int field_n;
    private int field_g;
    static int field_r;
    private int field_e;
    static GameWorld field_b;
    private int field_a;
    static String field_k;
    private int field_c;
    private int field_o;
    static String field_f;

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CheckboxWidget var11 = null;
        try {
          if (param3 instanceof CheckboxWidget) {
            stackIn_3_0 = (UiWidget) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (CheckboxWidget) (stackIn_3_0);
          if (param0 != 16777215) {
            return;
          }
          if (var11 != null) {
            param1 = param1 & var11.field_C;
          }
          var7 = 5592405;
          if (param1) {
            var7 = 16777215;
          }
          Rasterizer.fillRect(param3.field_k + param4, param2 + param3.field_j, param3.field_i, param3.field_n, this.field_e);
          var8 = this.field_h + param4 + param3.field_k;
          var9 = param2 - (-param3.field_j - this.field_c);
          Rasterizer.drawDropShadow(var8, var9, this.field_l, this.field_n, 5592405);
          Rasterizer.fillRect(var8, var9, this.field_l, this.field_n, var7);
          if (var11.field_x) {
            Rasterizer.drawLine(var8, var9, this.field_l + var8, this.field_n + var9, 1);
            Rasterizer.drawLine(this.field_l + var8, var9, var8, var9 + this.field_n, 1);
          }
          if (null != this.field_d) {
            var10 = this.field_l + this.field_h + this.field_q;
            this.field_d.drawParagraph(param3.field_o, param3.field_k + param4 + var10, param2 + param3.field_j + this.field_j, param3.field_i - (this.field_q + var10), param3.field_n - (this.field_q << 1), this.field_i, this.field_g, this.field_o, this.field_a, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("vl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void flushOutgoingPackets(byte param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param0 != -46) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (LoginMethod.field_c != null) {
            if (param1 >= 0) {
              decompiledFrameRemainder0 = (PendingFlagRequest.field_j == ValidatedTextWidget.field_T);
              if ((decompiledFrameRemainder0) && (LinkTextPainter.field_e.position == 0 &&
                MonotonicClock.monotonicTimeMillis(-22826) > (10000L + HotspotTextWidget.field_N))) {
                LinkTextPainter.field_e.writeCipheredByte(11, param1);
              }
            } else {
              if (LinkTextPainter.field_e.position == 0 &&
                MonotonicClock.monotonicTimeMillis(-22826) > (10000L + HotspotTextWidget.field_N)) {
                LinkTextPainter.field_e.writeCipheredByte(11, param1);
              }
            }
            if (decompiledFrameRemainder0) {
              if (0 < LinkTextPainter.field_e.position) {
                try {
                  LoginMethod.field_c.write(LinkTextPainter.field_e.position, true, 0, LinkTextPainter.field_e.payload);
                  HotspotTextWidget.field_N = MonotonicClock.monotonicTimeMillis(-22826);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  SessionSocketHelpers.closeSessionSocket(1);
                }
                LinkTextPainter.field_e.position = 0;
              }
              return;
            }
          }
          LinkTextPainter.field_e.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        field_p = null;
        field_b = null;
        field_k = null;
        if (param0 == -51) {
          field_f = null;
          return;
        }
        field_b = (GameWorld) null;
        field_f = null;
    }

    final static void updateCutscene(Camera param0, LevelHud param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          AreaSelectionScreen.field_m = AreaSelectionScreen.field_m + 1;
          if (param2 > -73) {
            return;
          }
          var3_int = ExceptionWrapper.field_e;
          if (var3_int == 0) {
            BlastAffectedObject.updateFirstCutscene((byte) 80, param0, param1);
            return;
          }
          if (var3_int != 1) {
            return;
          }
          ResizableDialog.updateSecondCutscene(param0, 152, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("vl.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    CheckboxPainter(Font param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_a = 1;
        this.field_o = 1;
        try {
          this.field_e = param9;
          this.field_h = param5;
          this.field_c = param6;
          this.field_g = param4;
          this.field_n = param7;
          this.field_d = param0;
          this.field_q = param1;
          this.field_l = param8;
          this.field_j = param2;
          this.field_i = param3;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_p = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = new InputValidationResult();
        field_k = "Achievements This Game";
        field_f = "Go Back";
    }
}
