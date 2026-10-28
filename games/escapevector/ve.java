/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve implements WidgetPainter {
    private int field_m;
    static int field_l;
    private BitmapFont field_e;
    static PcmSample field_d;
    private int field_c;
    static String field_f;
    static ResourceArchive field_h;
    private int field_j;
    private int field_a;
    private int field_b;
    static byte[][][] field_n;
    private int field_i;
    static int field_g;
    static int field_k;

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        UiComponent stackIn_4_0 = null;
        String stackIn_16_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (!(component instanceof q)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (UiComponent) (component);
          }
          q var12 = (q) (stackIn_4_0);
          if (var12 != null) {
          }
          SoftwareRasterizer.a(component.x + originX, originY + component.y, component.width, component.height, this.field_b);
          int var7 = component.width - 2 * var12.field_M;
          int var8 = originX - (-component.x - var12.field_M);
          int var9 = var12.field_J + (originY + component.y);
          SoftwareRasterizer.d(var8, var9, var8 + var7, var9, this.field_m);
          for (int var10 = -1 + var12.e((byte) 98); var10 >= 0; var10--) {
            SoftwareRasterizer.d(var8 + var7 * var12.b(var10, (byte) 97) / var12.k(-1), var9, this.field_j, this.field_c);
          }
          if (guard > -14) {
            this.field_j = -58;
          }
          if (this.field_e == null) {
            return;
          }
          this.field_e.c(var12.text, var8 + var7 / 2, var12.field_J + this.field_e.field_y + var9, this.field_i, this.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var6;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ve.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(enabled).append(')').toString());
        }
    }

    final static p a(int param0, ResourceArchive param1, ResourceArchive param2, int[] param3) {
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        try {
          if (null == QuickChatDynamicCommand.field_e) {
            kc.field_c = dn.a(0, TextLayoutLine.field_f, ej.field_g, param1, 1, param3, dn.field_C);
            int[] var6 = (int[]) null;
            HudMessage.field_k = dn.a(0, ok.field_b, CipherPacketBuffer.field_q, param2, 0, (int[]) null, q.field_L);
            tk.field_b = new qh(param1, bm.field_e, Js5Transport.field_i, 1, SelfDestructEffects.field_n, param3);
            QuickChatDynamicCommand.field_e = new p();
            Object stackIn_3_0 = null;
            return (p) (stackIn_3_0);
          }
          if (param0 != 1) {
            String var5 = (String) null;
            ve.a((byte) 82, (String) null);
          }
          if (!QuickChatDynamicCommand.field_e.a(23389)) {
            return null;
          }
          p stackIn_9_0 = QuickChatDynamicCommand.field_e;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ve.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        ff.a((String) null, param2, 64, param1);
        int var3 = 104 / ((31 - param0) / 61);
    }

    final static ResourceArchive a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != 0) {
          return (ResourceArchive) null;
        }
        return ji.a(param2, param0, false, param3, param4, (byte) 114);
    }

    final static void a(byte param0, String param1) {
        boolean stackIn_17_0 = false;
        String stackIn_44_2 = null;
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (-1 == bg.field_f &&
            ValidationIndicator.field_M == -1) {
            ValidationIndicator.field_M = UiContainer.field_y;
            bg.field_f = dh.field_d;
          }
          boolean decompiledFrameRemainder0 = true;
          ei.field_j = ei.field_j + 1;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(on.field_b));
          } else {
            decompiledFrameRemainder0 = (on.field_b == null);
          }
          if (decompiledFrameRemainder0) {
            if (un.field_u) {
              stackIn_17_0 = false;
            } else if (ei.field_j >= ef.field_d) {
              stackIn_17_0 = (ei.field_j < ef.field_d + qf.field_l);
            } else {
              stackIn_17_0 = false;
            }
            boolean var2_int = stackIn_17_0;
            if (param1 == null) {
              ei.field_j = 0;
            } else if (un.field_u) {
              ei.field_j = ef.field_d;
            } else if (!var2_int) {
              ei.field_j = 0;
            } else {
              ei.field_j = ef.field_d;
            }
            DraggableWidget.field_O = bg.field_f;
            ci.field_g = ValidationIndicator.field_M;
            if (param1 != null) {
              un.field_u = false;
            } else if (var2_int) {
              un.field_u = true;
            }
          }
          on.field_b = param1;
          if (!un.field_u &&
            ei.field_j < ef.field_d &&
            TextFieldValidator.field_h) {
            ei.field_j = 0;
            ci.field_g = ValidationIndicator.field_M;
            DraggableWidget.field_O = bg.field_f;
          }
          if (param0 > -97) {
            ve.a(-81, 8, false, 82, false);
          }
          if (un.field_u &&
            ei.field_j == fj.field_jb) {
            un.field_u = false;
            ei.field_j = 0;
          }
          bg.field_f = -1;
          ValidationIndicator.field_M = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_43_0 = var2;
          StringBuilder stackIn_43_1 = new StringBuilder().append("ve.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_n = (byte[][][]) null;
        field_f = null;
        field_h = null;
        field_d = null;
        if (guard != 0) {
          field_l = -119;
        }
    }

    ve(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_j = param5;
          this.field_e = param0;
          this.field_i = param1;
          this.field_c = param6;
          this.field_b = param4;
          this.field_a = param2;
          this.field_m = param3;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_l = 0;
        field_f = "Try again";
    }
}
