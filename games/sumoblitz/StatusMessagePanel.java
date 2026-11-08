/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatusMessagePanel extends WidgetContainer implements WidgetActionListener {
    private InteractiveWidget[] field_H;
    private int field_F;
    private LegacyBitmapFont field_C;
    private int[] field_D;
    private String field_B;
    static boolean field_A;
    private MessageDialog field_G;

    final static void a(byte param0, boolean param1, boolean param2, int param3, int param4, MusicTrack param5) {
        Object var6 = null;
        RuntimeException var6_ref = null;
        Throwable var7 = null;
        MusicTrack var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var6 = wd.field_f;
          synchronized (var6) {
            if (param5 == GridWidgetContainer.field_B) {
              return;
            }
            GridWidgetContainer.field_B = param5;
            if (GridWidgetContainer.field_B != null) {
              qc.field_e.queueTrackAtGrid(param2, param3, 7094, param4, GridWidgetContainer.field_B, param1);
            }
            if (param0 < 98) {
              var8 = (MusicTrack) null;
              StatusMessagePanel.a((byte) -110, true, true, 90, -86, (MusicTrack) null);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var6_ref;
          stackIn_17_1 = new StringBuilder().append("lc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    StatusMessagePanel(MessageDialog param0, LegacyBitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.field_F = 0;
        try {
          this.field_B = param2;
          this.field_G = param0;
          this.field_C = param1;
          var4_int = this.field_B != null ? this.field_C.a(this.field_B, 260, this.field_C.field_s) : 0;
          this.setBounds(-127, 0, 0, 22 + var4_int, 288);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_6_0 = (null != hu.a(param1, (byte) 109));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("lc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        super.renderLayer(parentX, parentY, (byte) -118, layer);
        if (guard < -35) {
          this.field_C.a(this.field_B, 14 + this.x + parentX, this.y + (parentY + 10), -28 + this.width, this.height, 16777215, -1, 0, 0, this.field_C.field_s);
          return;
        }
        String var6 = (String) null;
        StatusMessagePanel.a(false, (String) null);
        this.field_C.a(this.field_B, 14 + this.x + parentX, this.y + (parentY + 10), -28 + this.width, this.height, 16777215, -1, 0, 0, this.field_C.field_s);
    }

    private final void a(byte param0, int param1) {
        InteractiveWidget[] var3;
        int[] var4;
        int var5;
        int var6;
        InteractiveWidget var7;
        InteractiveWidget[] var8;
        int var5Lifetime1;
        int[] var4Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param1 <= this.field_F) {
          return;
        }
        var8 = new InteractiveWidget[param1];
        var3 = var8;
        if (param0 == -124) {
          var4 = new int[param1];
          for (var5 = 0; this.field_F > var5; var5++) {
            var8[var5] = this.field_H[var5];
            var4[var5] = this.field_D[var5];
          }
          this.field_H = var3;
          this.field_F = param1;
          this.field_D = var4;
          return;
        }
        var7 = (InteractiveWidget) null;
        this.onAction(-17, -108, (InteractiveWidget) null, 120, -53);
        var4Lifetime1 = new int[param1];
        for (var5Lifetime1 = 0; this.field_F > var5Lifetime1; var5Lifetime1++) {
          var8[var5Lifetime1] = this.field_H[var5Lifetime1];
          var4Lifetime1[var5Lifetime1] = this.field_D[var5Lifetime1];
        }
        this.field_H = var3;
        this.field_F = param1;
        this.field_D = var4Lifetime1;
        return;
    }

    final void a(String param0, int param1, boolean param2) {
        int var4_int = 0;
        try {
          if (!param2) {
            this.field_B = (String) null;
          }
          var4_int = this.field_F;
          this.a((byte) -124, var4_int + 1);
          this.field_H[var4_int] = this.a(param0, (byte) -123, (WidgetListener) (this));
          this.field_D[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lc.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final InteractiveWidget a(String param0, byte param1, WidgetListener param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -123) {
            this.a((byte) 29, -68);
          }
          var4 = new InteractiveWidget(param0, param2);
          var4.renderer = (WidgetRenderer) ((Object) new ue());
          var5 = -2 + this.height;
          this.setBounds(param1 ^ 62, 0, 0, 34 + this.height, this.width);
          var4.setBounds(-57, 7, var5, 30, this.width - 14);
          this.addChild(var4, param1 + 241);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("lc.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 710) {
            var9 = (String) null;
            this.a((String) null, -37, false);
          }
          var6_int = 0;
          while (true) {
            if (this.field_F <= var6_int) {
              return;
            }
            if (this.field_H[var6_int] != source) {
              var6_int++;
              continue;
            }
            break;
          }
          var7 = this.field_D[var6_int];
          if (-1 == var7) {
            this.field_G.n(-7);
            return;
          }
          rd.a(this.field_D[var6_int], -59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("lc.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    static {
        field_A = false;
    }
}
