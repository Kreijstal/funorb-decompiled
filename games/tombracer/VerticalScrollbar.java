/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class VerticalScrollbar extends UiComponent {
    private int repeatDelay;
    static String field_zb;
    private UiComponent downButton;
    private UiComponent thumb;
    static String field_vb;
    private UiComponent trackAbove;
    private UiComponent field_ub;
    private UiComponent trackBelow;
    private UiComponent upButton;
    static boolean[] field_tb;

    final void layoutThumb(int param0, int param1, byte param2, int param3) {
        UiComponent stackIn_15_0 = null;
        UiComponent stackIn_15_1 = null;
        UiComponent stackIn_15_2 = null;
        boolean stackIn_16_3 = false;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        UiComponent var14;
        UiComponent var15;
        UiComponent var16;
        UiComponent var17;
        UiComponent var18;
        UiComponent var19;
        if (this.field_t < this.field_G * 2) {
          var6 = this.field_t / 2;
          var5 = this.field_t / 2;
        } else {
          var5 = this.field_G;
          var6 = -this.field_G + this.field_t;
        }
        var7 = var6 - var5;
        var8 = var7;
        if (param1 > 0) {
          var8 = var8 * param0 / param1;
          if (var8 < this.field_G) {
            var8 = this.field_G;
          }
          if (var8 > var7) {
            var8 = var7;
          }
        }
        var9 = -param0 + param1;
        var10 = var7 - var8;
        if (param2 > -60) {
          field_tb = (boolean[]) null;
        }
        var11 = 0;
        if (0 < var9) {
          var11 = (param3 * var10 + var9 / 2) / var9;
        }
        var12 = var11 + var8 / 2;
        var14 = this.upButton;
        var14.field_t = var5;
        var14.field_T = 0;
        var14.field_G = this.field_G;
        var14.field_qb = 0;
        var15 = this.downButton;
        var15.field_G = this.field_G;
        var15.field_T = var6;
        var15.field_t = this.field_t - var6;
        var15.field_qb = 0;
        var16 = this.field_ub;
        var16.field_G = this.field_G;
        var16.field_t = var7;
        var16.field_T = var5;
        var16.field_qb = 0;
        var17 = this.trackAbove;
        var17.field_t = var12;
        var17.field_qb = 0;
        var17.field_G = this.field_G;
        var17.field_T = 0;
        var18 = this.trackBelow;
        var18.field_t = var7 - var12;
        var18.field_T = var12;
        var18.field_G = this.field_G;
        var18.field_qb = 0;
        var19 = this.thumb;
        var19.field_G = this.field_G;
        var19.field_qb = 0;
        stackIn_15_0 = this.upButton;
        stackIn_15_1 = this.downButton;
        stackIn_15_2 = this.field_ub;
        stackIn_16_3 = (param1 <= param0) ? false : true;
        stackIn_15_2.field_X = stackIn_16_3;
        stackIn_15_1.field_X = stackIn_16_3;
        stackIn_15_0.field_X = stackIn_16_3;
        var19.field_T = var11;
        var19.field_t = var8;
    }

    final static boolean isRetryAllowed(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        var1 = bva.currentTimeMillis((byte) -107);
        if (param0 != -1) {
          field_tb = (boolean[]) null;
        }
        var3 = -vaa.field_b + var1;
        if (var3 > 30000L) {
          vaa.field_b = var1;
          gp.field_h = 0;
          return true;
        }
        var5 = 3000;
        if (gp.field_h >= 7) {
          var5 = 12000;
        } else {
          if (gp.field_h < 5) {
            if (gp.field_h >= 3) {
              var5 = 6000;
            }
          } else {
            var5 = 9000;
          }
        }
        if ((long)var5 >= var3) {
          return false;
        }
        gp.field_h = gp.field_h + 1;
        vaa.field_b = var1;
        return true;
    }

    final boolean isThumbHeld(int param0) {
        if (param0 != -1) {
          VerticalScrollbar.isRetryAllowed(3);
        }
        return this.thumb.field_E != 0 ? true : false;
    }

    final int getDraggedScrollOffset(boolean param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var5 = 0;
        var7 = 87 / ((param1 + 53) / 38);
        var6 = this.field_ub.field_t - this.thumb.field_t;
        if (0 < var6) {
          var8 = this.thumb.field_T;
          var9 = param3 - param2;
          var5 = (var8 * var9 + var6 / 2) / var6;
        }
        if (!param0) {
          if (-param2 + param3 < var5) {
            var5 = -param2 + param3;
          }
          if (0 > var5) {
            var5 = 0;
          }
        } else {
          if (var5 < 0) {
            var5 = 0;
          }
          if (var5 > param3 - param2) {
            var5 = param3 - param2;
          }
        }
        return var5;
    }

    VerticalScrollbar(long param0, VerticalScrollbar param1) {
        this(param0, param1.upButton, param1.downButton, param1.trackAbove, param1.thumb);
    }

    final boolean pollPageUp(int param0) {
        if (0 != this.trackAbove.field_y) {
          this.repeatDelay = 20;
          return true;
        }
        if (~this.trackAbove.field_E != param0) {
          if (0 < this.repeatDelay) {
            this.repeatDelay = this.repeatDelay - 1;
          }
          if (this.repeatDelay == 0 &&
            GridWidgetContainer.field_B < this.thumb.field_K + this.thumb.field_A) {
            this.repeatDelay = 3;
            return true;
          }
        }
        return false;
    }

    final boolean pollLineUp(byte param0) {
        if (this.upButton.field_y != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.upButton.field_E != 0) {
          if (0 < this.repeatDelay) {
            this.repeatDelay = this.repeatDelay - 1;
          }
          if (this.repeatDelay == 0) {
            this.repeatDelay = 3;
            return true;
          }
        }
        if (param0 >= -75) {
          VerticalScrollbar.isRetryAllowed(98);
          return false;
        }
        return false;
    }

    final boolean pollLineDown(byte param0) {
        if (param0 != 40) {
          return true;
        }
        if (0 != this.downButton.field_y) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.downButton.field_E == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (this.repeatDelay == 0) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_vb = (String) null;
        }
        field_vb = null;
        field_zb = null;
        field_tb = null;
    }

    final static int toGlTextureEnvMode(byte param0, ica param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 68) {
            stackIn_2_0 = 109;
            return stackIn_2_0;
          }
          if (PlatformComponent.field_F == param1) {
            stackIn_5_0 = 7681;
            return stackIn_5_0;
          }
          if (iw.field_c == param1) {
            stackIn_8_0 = 8448;
            return stackIn_8_0;
          }
          if (r.field_m == param1) {
            stackIn_11_0 = 34165;
            return stackIn_11_0;
          }
          if (NormalMapOperator.field_m == param1) {
            stackIn_18_0 = 260;
            return stackIn_18_0;
          }
          if (param1 != FunOrbConsole.field_w) {
            throw new IllegalArgumentException();
          }
          stackIn_16_0 = 34023;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("oj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean pollPageDown(int param0) {
        int var2 = 6 / ((1 - param0) / 41);
        if (this.trackBelow.field_y != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.trackBelow.field_E != 0) {
          if (this.repeatDelay > 0) {
            this.repeatDelay = this.repeatDelay - 1;
          }
          if (this.repeatDelay == 0) {
            if (GridWidgetContainer.field_B < this.thumb.field_A + this.thumb.field_K - (-this.thumb.field_t - this.thumb.field_O)) {
              return false;
            }
            this.repeatDelay = 3;
            return true;
          }
        }
        return false;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        this.field_t = param5;
        this.field_T = param7;
        if (param3) {
          this.isThumbHeld(78);
        }
        this.field_qb = param4;
        this.field_G = param2;
        this.layoutThumb(param6, param0, (byte) -87, param1);
    }

    VerticalScrollbar(long param0, UiComponent param1, UiComponent param2, UiComponent param3, UiComponent param4) {
        super(param0, (UiComponent) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        UiComponent var9 = null;
        UiComponent var10 = null;
        try {
          this.upButton = new UiComponent(0L, param1);
          this.downButton = new UiComponent(0L, param2);
          this.b(-123, this.upButton);
          this.b(-124, this.downButton);
          this.field_ub = new UiComponent(0L, (UiComponent) null);
          this.b(-128, this.field_ub);
          this.trackAbove = new UiComponent(0L, param3);
          this.trackBelow = new UiComponent(0L, param3);
          var9 = this.trackAbove;
          var10 = var9;
          this.trackBelow.field_eb = true;
          var10.field_eb = true;
          this.field_ub.b(-124, this.trackAbove);
          this.field_ub.b(-122, this.trackBelow);
          this.thumb = new UiComponent(0L, param4);
          this.thumb.field_F = true;
          this.field_ub.b(-123, this.thumb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("oj.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        String var0 = "Unknown";
        try {
          var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_vb = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_zb = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "~/";
        try {
          var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$0 = new File(var0);
        field_tb = new boolean[112];
    }
}
