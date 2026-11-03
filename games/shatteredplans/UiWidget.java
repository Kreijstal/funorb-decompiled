/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiWidget extends IntrusiveNode {
    TextLayout field_j;
    WidgetListener field_u;
    String field_v;
    int field_x;
    int field_n;
    int field_m;
    int field_q;
    WidgetPainter field_p;
    int field_o;
    String field_s;
    static int[] field_w;
    int field_l;
    static long field_i;
    int field_h;
    boolean field_k;
    static String field_r;
    static Sprite field_t;

    final void reapplyBounds(byte param0) {
        int var2 = 10 / ((-44 - param0) / 63);
        this.setBounds(this.field_q, this.field_n, (byte) 108, this.field_m, this.field_x);
    }

    final void appendDescription(Hashtable param0, int param1, boolean param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_m).append(",").append(this.field_q).append(" ").append(this.field_x).append("x").append(this.field_n);
          if (null != this.field_s) {
            discarded$1 = param3.append(" text=\"").append(this.field_s).append('"');
          }
          if (this.field_k) {
            discarded$2 = param3.append(" mouseover");
          }
          if (param2) {
            return;
          }
          if (this.isFocused(1)) {
            discarded$3 = param3.append(" focused");
          }
          if (this.field_p != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.field_p instanceof UiWidget)) {
              discarded$5 = param3.append(this.field_p);
            } else {
              param3 = this.describeTree((byte) 125, param0, param1 + 1, param3);
            }
          }
          if (null != this.field_u) {
            discarded$6 = param3.append(" listener=");
            if (!(this.field_u instanceof UiWidget)) {
              discarded$7 = param3.append(this.field_u);
            } else {
              param3 = this.describeTree((byte) 125, param0, param1 + 1, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("vg.TB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2, byte param3) {
        int var5;
        fr var6;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        this.updateHover(param0, param2, this, (byte) 91);
        var5 = this.isFocused(1) ? 1 : 0;
        if (!param1) {
          if (var5 != 0 &&
            je.field_d != 0) {
            this.blur((byte) 21);
          }
        } else {
          if (so.field_o != 0 &&
            var5 != 0) {
            this.a(0, bb.field_b, pd.field_k, this, param2, param0, so.field_o);
          }
          if (je.field_d != 0) {
            if (!this.handlePress(je.field_d, PointsVictoryChecker.field_p, (byte) 96, SliderWidget.field_P, param0, param2, this)) {
              if (var5 != 0) {
                this.blur((byte) -126);
              }
            } else {
              param1 = false;
            }
          }
          if (AllianceExpiredEvent.field_n == 0 &&
            so.field_m != 0) {
            this.handleRelease(pd.field_k, param2, param0, bb.field_b, -600269855, this);
            var6 = oa.field_b;
            if (var6 != null) {
              if (var6.field_u instanceof lf) {
                ((lf) (var6.field_u)).a(-27619, (vj) null, var6);
              }
              oa.field_b = null;
            }
          }
        }
        so.field_m = AllianceExpiredEvent.field_n;
        vj.a(this.getTooltip(true), 0);
        if (param3 != 0) {
          this.reapplyBounds((byte) 58);
        }
        return param1;
    }

    boolean containsWidget(byte param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -127 % ((61 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("vg.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    void handleRelease(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        try {
          this.field_o = 0;
          if (param4 != -600269855) {
            this.appendDescription((Hashtable) null, 103, false, (StringBuilder) null);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vg.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static tq g(int param0) {
        int var1 = 4 / ((-7 - param0) / 37);
        return BattleEvent.c(1, 0);
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -89) {
            field_i = 72L;
          }
          stackIn_3_0 = CellVertex.a((byte) 116, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vg.QB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void blur(byte param0) {
        int var2 = -22 % ((-84 - param0) / 33);
    }

    final boolean a(int param0, char param1, boolean param2) {
        if (this.isFocused(1) &&
          this.handleKey(param0, param1, 13, this)) {
          return true;
        }
        if (!param2) {
          return true;
        }
        int var4 = param0;
        if (var4 != 80) {
          return false;
        }
        return this.containsWidget((byte) -33, this);
    }

    int maxLayer(int param0) {
        if (param0 != -600269855) {
          this.field_k = true;
          return 0;
        }
        return 0;
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        if (param0 == 0 &&
          null != this.field_p) {
          this.field_p.a(this, param3, true, param2, (byte) 12);
        }
        if (param1 != -11857) {
          this.field_m = -30;
        }
    }

    boolean handlePress(int param0, int param1, byte param2, int param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 95) {
            this.field_p = (WidgetPainter) null;
          }
          if (!this.containsPoint(param1, 88, param3, param5, param4)) {
            return false;
          }
          this.field_o = param0;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("vg.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.containsPoint(pd.field_k, 62, bb.field_b, param1, param0) ? 1 : 0;
          stackIn_3_0 = (this.field_k) ? 0 : 1;
          if (stackIn_3_0 == var5_int) {
            stackIn_7_1 = (var5_int != 0);
            this.field_k = stackIn_7_1;
            if (null != this.field_u &&
              this.field_u instanceof HoverListener) {
              ((HoverListener) (this.field_u)).a(this, (byte) 116, var5_int != 0);
            }
          }
          if (param3 != 91) {
            this.field_s = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("vg.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean containsPoint(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_8_0 = false;
        if (param1 < 36) {
          this.a(126, '￡', false);
        }
        stackIn_8_0 = (this.field_m + param4 <= param0) && (param2 >= param3 + this.field_q) && (param0 < this.field_x + (this.field_m + param4)) && (param3 + (this.field_q + this.field_n) > param2);
        return stackIn_8_0;
    }

    public final String toString() {
        return this.describeTree((byte) -103, new Hashtable(), 0, new StringBuilder()).toString();
    }

    public static void clearStatics(int param0) {
        field_r = null;
        field_t = null;
        field_w = null;
        if (param0 != 0) {
          UiWidget.clearStatics(-30);
        }
    }

    void setBounds(int param0, int param1, byte param2, int param3, int param4) {
        this.field_m = param3;
        this.field_q = param0;
        this.field_x = param4;
        this.field_n = param1;
        if (param2 <= 99) {
          this.maxLayer(127);
        }
    }

    boolean a(int param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("vg.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void draw(int param0, int param1, byte param2) {
        int var5_int = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4 = this.maxLayer(-600269855);
        if (param2 != -66) {
          return;
        }
        for (var5_int = 0; var5_int <= var4; var5_int++) {
          this.drawLayer(var5_int, -11857, param0, param1);
        }
        String var5 = IntrusiveDequeCursor.a(false);
        if (var5 != null) {
          MusicVoice.field_I.a(rs.field_Fb, RandomAccessCacheFile.field_g, 106, var5);
        }
    }

    String getTooltip(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        if (!this.field_k) {
          return null;
        }
        return this.field_v;
    }

    final boolean markVisited(boolean param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return true;
          }
          if (!param3.containsKey(this)) {
            param3.put(this, this);
            return true;
          }
          discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("vg.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    StringBuilder describeTree(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.markVisited(false, param2, param3, param1)) {
            this.appendDescription(param1, param2, false, param3);
          }
          var5_int = -116 / ((64 - param0) / 61);
          stackIn_3_0 = (StringBuilder) (param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vg.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    boolean isFocused(int param0) {
        if (param0 != 1) {
          return false;
        }
        return false;
    }

    boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 13) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    protected UiWidget() {
        this.field_h = 0;
        this.field_l = 0;
    }

    UiWidget(String param0, WidgetListener param1) {
        this(param0, MusicVoice.field_I.field_s, param1);
    }

    UiWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        WidgetMetrics var4 = null;
        this.field_h = 0;
        this.field_l = 0;
        try {
          this.field_p = param1;
          this.field_s = param0;
          this.field_u = param2;
          if (this.field_p instanceof WidgetMetrics) {
            var4 = (WidgetMetrics) ((Object) this.field_p);
            this.field_x = var4.getTextHeight((byte) -52, this);
            this.field_n = var4.getTextWidth(true, this);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5) {
        this.field_h = 0;
        this.field_l = 0;
        try {
          this.field_n = param3;
          this.field_q = param1;
          this.field_p = param4;
          this.field_u = param5;
          this.field_m = param0;
          this.field_x = param2;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_i = 20000000L;
        field_w = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if (1 != (var0 & 1)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_w[var1] = var0;
        }
        field_r = "You must be a member to play with the current options.";
    }
}
