/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveWidget {
    static int[] field_I;
    private TextHotspotBounds field_P;
    private IntrusiveDeque field_Q;
    static String field_N;
    static he[] field_S;
    private String[] field_R;
    static int[] field_T;
    static RgbSprite field_L;
    static int[] field_J;
    static RgbSprite field_M;
    static String field_O;

    String getTooltipText(int param0) {
        if (this.field_P == null) {
          return null;
        }
        if (null == this.field_R) {
          return null;
        }
        if (param0 >= -39) {
          return (String) null;
        }
        if (this.field_P.field_s >= this.field_R.length) {
          return null;
        }
        return this.field_R[this.field_P.field_s];
    }

    final void setTextBounds(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          field_T = (int[]) null;
        }
        this.setBounds(param3, ((TextWidgetRenderer) ((Object) this.field_l)).getPreferredHeight(170, (UiWidget) (this)), param2, 16535, param1);
    }

    final void rebuildHotspotBounds(int param0) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        TextWidgetRenderer var3;
        TextLayout var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        TextLineMetrics var12;
        int var13;
        int var14;
        TextHotspotBounds var15;
        int var16;
        int var7Lifetime1;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_Q = new IntrusiveDeque();
        var2 = 0;
        var3 = (TextWidgetRenderer) ((Object) this.field_l);
        var4 = var3.getTextLayout((UiWidget) (this), true);
        while (true) {
          var5 = this.field_p.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            var5 = -128 / ((param0 + 57) / 43);
            return;
          }
          var7 = this.field_p.indexOf(">", var5);
          var6 = this.field_p.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_p.indexOf("</hotspot>", var5);
          var8 = var4.getLineIndexForTextOffset(var5, -12280);
          var9 = var4.getLineIndexForTextOffset(var2, -12280);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_a[var11];
            if (~var8 != ~var11) {
              stackIn_8_0 = var12.field_a[0];
            } else {
              stackIn_8_0 = var4.getXForTextOffset(74, var5);
            }
            var13 = stackIn_8_0;
            if (var9 != var11) {
              if (var12 == null) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = var12.field_a[var12.field_a.length - 1];
              }
            } else {
              stackIn_13_0 = var4.getXForTextOffset(-88, var2);
            }
            var14 = stackIn_13_0;
            var15 = new TextHotspotBounds(var7Lifetime1, var13, var12.field_e, var14 - var13, Math.max(var3.getFontLineHeight((byte) -116), -var12.field_e + var12.field_b));
            if (var10 != null) {
              ((TextHotspotBounds) (var10)).field_k = var15;
            }
            var10 = var15;
            this.field_Q.addLast(var15, 255);
          }
        }
    }

    void updatePointer(UiWidget param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.updatePointer(param0, param1, param2, (byte) -128);
          this.field_P = null;
          if (param3 >= -127) {
            this.field_Q = (IntrusiveDeque) null;
          }
          if (this.field_n) {
            var5_int = ck.field_c - param1 - this.field_o;
            var6 = -this.field_m + (ob.field_g - param2);
            this.field_P = this.findHotspotAt(var6, var5_int, (byte) 122);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "qa.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_J = null;
        field_I = null;
        if (param0 != 122) {
          RichTextWidget.clearStaticReferences((byte) 76);
        }
        field_O = null;
        field_L = null;
        field_N = null;
        field_M = null;
        field_T = null;
        field_S = null;
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 16535) {
          field_J = (int[]) null;
        }
        super.setBounds(param0, param1, param2, param3 + 0, param4);
        this.rebuildHotspotBounds(param3 - 16466);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          while (true) {
            param3--;
            if (param3 < 0) {
              if (param4 != -2141888031) {
                field_L = (RgbSprite) null;
              }
              return;
            }
            var9 = param1;
            var5 = var9;
            var6 = param0;
            var7 = param2;
            var9[var6] = (rk.bitwiseAnd(var9[var6], 16711422) >> 1) + var7;
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("qa.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    void drawWidget(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawWidget(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        TextWidgetRenderer var5 = (TextWidgetRenderer) ((Object) this.field_l);
        TextHotspotBounds var6 = this.field_P;
        if (var6 != null) {
          var7 = var5.getTextOriginX((UiWidget) (this), param2 ^ -1540021398, param0);
          var8 = var5.getTextOriginY((UiWidget) (this), param3, (byte) -124);
          do {
            ce.a(var6.field_j + 2, -2 + var6.field_o + var7, param2 ^ 16598, 2 + var6.field_n, var8 + var6.field_i - 2);
            var6 = var6.field_k;
          } while (var6 != null);
        }
    }

    RichTextWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetEventListener) null);
        this.field_P = null;
        try {
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean takeFocus(boolean param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.rebuildHotspotBounds(29);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qa.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final TextHotspotBounds findHotspotAt(int param0, int param1, byte param2) {
        TextHotspotBounds var5_ref_fk = null;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        TextHotspotBounds var4 = (TextHotspotBounds) (this.field_Q.beginForward(-11151));
        while (var4 != null) {
          var5_ref_fk = var4;
          while (var5_ref_fk != null) {
            if (param1 >= var5_ref_fk.field_o &&
              var5_ref_fk.field_i <= param0 &&
              var5_ref_fk.field_o + var5_ref_fk.field_n > param1 &&
              var5_ref_fk.field_i + var5_ref_fk.field_j >= param0) {
              return var4;
            }
            var5_ref_fk = var5_ref_fk.field_k;
          }
          var4 = (TextHotspotBounds) (this.field_Q.nextForward(0));
        }
        int var5 = 85 % ((59 - param2) / 51);
        return null;
    }

    final void activateFromInput(int param0, int param1, int param2, int param3) {
        super.activateFromInput(param0, param1, param2, param3);
        int var5 = -this.field_o + param3;
        int var6 = -this.field_m + param2;
        TextHotspotBounds var7 = this.findHotspotAt(var6, var5, (byte) -70);
        if (var7 != null &&
          null != this.field_u) {
          ((TextHotspotListener) ((Object) this.field_u)).onTextHotspotActivated(var7.field_s, -99, this, param0);
        }
    }

    final void setHotspotTooltip(String param0, int param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var4_int = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_R == null ||
            param1 >= this.field_R.length) {
            var7 = new String[1 + param1];
            var4 = var7;
            if (this.field_R != null) {
              for (var5 = 0; var5 < this.field_R.length; var5++) {
                var7[var5] = this.field_R[var5];
              }
            }
            this.field_R = var4;
          }
          this.field_R[param1] = param0;
          var4_int = 53 / ((61 - param2) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("qa.OA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_I = new int[]{1, 1, 1, 1, 1, -3, 0, 1, 0, 0, 0, -4, 1, 1, 1, 1, 1, -5, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, 1, 1, 0, 2, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_N = "Members";
        field_T = new int[]{5, 10, 5, 1, 3, 10, 10, 10, 10, 20, 30, 10, 10, 10, 10, 5, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 5, 10, 25, 10, 5, 5, 10, 10, 10, 10, 10, 10, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 30, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        field_O = "Unpacking graphics";
    }
}
