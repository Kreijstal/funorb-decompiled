/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class CheckboxPainter implements WidgetPainter {
    private int checkboxWidth;
    static String field_c;
    static long field_h;
    private int field_e;
    static SceneWidget[] field_n;
    private int field_o;
    private int field_g;
    private int field_b;
    static String field_k;
    private int field_d;
    static boolean field_r;
    private int field_i;
    static Sprite field_j;
    private int field_l;
    private BitmapFont field_m;
    private int field_a;
    private int checkboxHeight;
    private int field_f;

    final static void a(int param0, String param1, Throwable param2) {
        try {
          PlatformTaskDispatcher stackIn_15_0;
          int stackIn_15_1;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          java.net.URL stackIn_15_4;
          StringBuilder stackIn_15_5;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          String stackIn_16_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Pixelate.field_H ? 1 : 0;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = DateOfBirthValidator.a(param2, (byte) 120);
            }
            if (param1 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            FallingPieceView.a(var3, 0);
            var7 = qk.a(var3, ":", "%3a", -123);
            var8 = qk.a(var7, "@", "%40", -128);
            if (param0 != 1) {
              CheckboxPainter.a(-53);
            }
            var9 = qk.a(var8, "&", "%26", -126);
            var10 = qk.a(var9, "#", "%23", -127);
            if (null == TextButton.field_L) {
              return;
            }
            stackIn_15_0 = fp.field_c;
            stackIn_15_1 = -44;
            stackIn_15_2 = null;
            stackIn_15_3 = null;
            stackIn_15_4 = TextButton.field_L.getCodeBase();
            stackIn_15_5 = new StringBuilder().append("clienterror.ws?c=").append(AccountChoicePanel.field_M).append("&u=");
            if (null == ui.field_c) {
              stackIn_16_2 = null;
              stackIn_16_3 = null;
              stackIn_16_6 = "" + ff.field_d;
            } else {
              stackIn_16_2 = null;
              stackIn_16_3 = null;
              stackIn_16_6 = ui.field_c;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_15_0).a((byte) stackIn_15_1, new java.net.URL(stackIn_15_4, ((StringBuilder) (Object) stackIn_15_5).append(stackIn_16_6).append("&v1=").append(PlatformTaskDispatcher.field_o).append("&v2=").append(PlatformTaskDispatcher.field_l).append("&e=").append(var10).toString()));
            while (0 == var4.field_b) {
              SecondaryNodeHashTable.a(1L, (byte) 23);
            }
            if (var4.field_b != 1) {
              return;
            }
            var5 = (DataInputStream) (var4.field_e);
            var5.read();
            var5.close();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void drawWidget(UiComponent param0, byte param1, int param2, int param3, boolean param4) {
        UiComponent stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Checkbox var11 = null;
        try {
          if (!(param0 instanceof Checkbox)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiComponent) (param0);
          }
          var11 = (Checkbox) (stackIn_3_0);
          if (param1 != -124) {
            this.field_g = -59;
          }
          if (var11 != null) {
            param4 = param4 & var11.field_H;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          SoftwareRasterizer.d(param3 + param0.field_z, param0.field_p + param2, param0.field_E, param0.field_C, this.field_a);
          var8 = this.field_f + (param3 + param0.field_z);
          var9 = param2 + param0.field_p + this.field_l;
          SoftwareRasterizer.c(var8, var9, this.checkboxWidth, this.checkboxHeight, 5592405);
          SoftwareRasterizer.d(var8, var9, this.checkboxWidth, this.checkboxHeight, var7);
          if (var11.field_M) {
            SoftwareRasterizer.b(var8, var9, var8 + this.checkboxWidth, var9 + this.checkboxHeight, 1);
            SoftwareRasterizer.b(var8 + this.checkboxWidth, var9, var8, var9 + this.checkboxHeight, 1);
          }
          if (this.field_m == null) {
            return;
          }
          var10 = this.checkboxWidth - (-this.field_f - this.field_b);
          this.field_m.drawParagraph(param0.field_q, param0.field_z + param3 + var10, this.field_d + (param0.field_p + param2), param0.field_E - (var10 + this.field_b), param0.field_C - (this.field_b << 1), this.field_g, this.field_i, this.field_e, this.field_o, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("jo.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= -103) {
          field_c = null;
          field_n = null;
          field_j = null;
          field_k = null;
          return;
        }
        field_j = (Sprite) null;
        field_c = null;
        field_n = null;
        field_j = null;
        field_k = null;
    }

    final static void a(int param0) {
        fl.a((byte) -125);
        QuickChatMenu.a(4, -2671);
        if (param0 != -22218) {
          CheckboxPainter.a(-34);
        }
    }

    CheckboxPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_o = 1;
        try {
          this.field_a = param9;
          this.field_d = param2;
          this.field_g = param3;
          this.field_f = param5;
          this.field_l = param6;
          this.field_i = param4;
          this.checkboxWidth = param8;
          this.field_m = param0;
          this.checkboxHeight = param7;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_c = "Enter multiplayer lobby";
        field_r = false;
        field_h = 0L;
    }
}
