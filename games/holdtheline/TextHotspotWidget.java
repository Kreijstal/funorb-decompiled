/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextHotspotWidget extends TextButton {
    static int[] field_K;
    private TextHotspotRange field_H;
    static String field_M;
    static float field_G;
    private IntrusiveDeque field_I;
    private String[] field_J;
    static String field_L;

    final void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.j(0);
    }

    String getTooltip(int param0) {
        TextHotspotRange discarded$0 = null;
        if (param0 != 0) {
          discarded$0 = this.a((byte) -75, 19, 29);
        }
        if (null == this.field_H) {
          return null;
        }
        if (this.field_J == null) {
          return null;
        }
        if (this.field_H.field_k >= this.field_J.length) {
          return null;
        }
        return this.field_J[this.field_H.field_k];
    }

    final void a(int param0, String param1, boolean param2) {
        int var5 = 0;
        String[] var4 = null;
        int var6 = 0;
        ResourceArchive var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = HoldTheLine.field_D;
        try {
          if (null == this.field_J ||
            this.field_J.length <= param0) {
            var8 = new String[param0 + 1];
            var9 = var8;
            var4 = var9;
            if (null != this.field_J) {
              for (var5 = 0; var5 < this.field_J.length; var5++) {
                var8[var5] = this.field_J[var5];
              }
            }
            this.field_J = var9;
          }
          this.field_J[param0] = param1;
          if (!param2) {
            var7 = (ResourceArchive) null;
            TextHotspotWidget.a((ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null, 76, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("cj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param3 - this.x;
        int var6 = param1 - this.y;
        TextHotspotRange var7 = this.a((byte) 124, var5, var6);
        if (var7 != null &&
          this.listener != null) {
          ((HotspotClickListener) ((Object) this.listener)).onHotspotClick(this, var7.field_k, (byte) -106, param0);
        }
    }

    boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -25823) {
            return false;
          }
          this.field_J = (String[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cj.NB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3, boolean param4) {
        try {
          fj.field_o = qn.createEmailValidationRequest("", -7079);
          fj.field_o.complete(false, 107);
          i.a(true, param0, param1, param2);
          DialogLayer.h(-1);
          ak.field_b = ValidationIndicator.field_M;
          if (param3 < 98) {
            field_M = (String) null;
          }
          bb.field_a = ValidationIndicator.field_M;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "cj.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updateHover(param0, param1, param2, param3);
          this.field_H = null;
          if (this.hovered) {
            var5_int = NodeHashTableIterator.field_g + (-param0 - this.x);
            var6 = rf.field_X - param2 - this.y;
            this.field_H = this.a((byte) 124, var5_int, var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("cj.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final TextHotspotRange a(byte param0, int param1, int param2) {
        TextHotspotRange var4;
        TextHotspotRange var5;
        int var6;
        ResourceArchive var7;
        var6 = HoldTheLine.field_D;
        if (param0 <= 121) {
          var7 = (ResourceArchive) null;
          TextHotspotWidget.a((ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null, -102, false);
        }
        var4 = (TextHotspotRange) (this.field_I.first((byte) 104));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param1 >= var5.field_j &&
              param2 >= var5.field_s &&
              param1 < var5.field_n + var5.field_j &&
              var5.field_l + var5.field_s >= param2) {
              return var4;
            }
            var5 = var5.field_p;
          }
          var4 = (TextHotspotRange) (this.field_I.next((byte) 104));
        }
        return null;
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawLayer(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        TextWidgetRenderer var5 = (TextWidgetRenderer) ((Object) this.renderer);
        TextHotspotRange var6 = this.field_H;
        if (var6 == null) {
        } else {
          var7 = var5.getTextOriginX((UiWidget) (this), param2, 13112);
          var8 = var5.getTextOriginY(param0 ^ 1337393829, (UiWidget) (this), param1);
          do {
            GrowableObjectList.a(var6.field_l + 2, var6.field_n + 2, var7 + (var6.field_j - 2), -2 + var8 + var6.field_s, (byte) 19);
            var6 = var6.field_p;
          } while (var6 != null);
        }
    }

    final static TextWidgetStyle k(int param0) {
        int var1 = 31 % ((param0 - 66) / 35);
        if (RoadSegment.field_p == null) {
          RoadSegment.field_p = new TextWidgetStyle(SpriteButtonRenderer.field_w, 20, 0, 0, 0, 11579568, -1, 0, 0, SpriteButtonRenderer.field_w.field_G, -1, 2147483647, true);
        }
        return RoadSegment.field_p;
    }

    final void j(int param0) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        TextWidgetRenderer var3;
        TextLayout var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        TextLineLayout var12;
        int var13;
        int var14;
        TextHotspotRange var15;
        int var16;
        int var7Lifetime1;
        var16 = HoldTheLine.field_D;
        this.field_I = new IntrusiveDeque();
        var2 = param0;
        var3 = (TextWidgetRenderer) ((Object) this.renderer);
        var4 = var3.getTextLayout((byte) 20, (UiWidget) (this));
        while (true) {
          var5 = this.text.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.text.indexOf(">", var5);
          var6 = this.text.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.text.indexOf("</hotspot>", var5);
          var8 = var4.b(var5, param0 ^ -22539);
          var9 = var4.b(var2, -22539);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_b[var11];
            if (var11 != var8) {
              stackIn_7_0 = var12.field_c[0];
            } else {
              stackIn_7_0 = var4.a(16777215, var5);
            }
            var13 = stackIn_7_0;
            if (var11 != var9) {
              if (var12 == null) {
                stackIn_12_0 = 0;
              } else {
                stackIn_12_0 = var12.field_c[-1 + var12.field_c.length];
              }
            } else {
              stackIn_12_0 = var4.a(16777215, var2);
            }
            var14 = stackIn_12_0;
            var15 = new TextHotspotRange(var7Lifetime1, var13, var12.field_h, var14 - var13, Math.max(var3.getFontHeight(true), -var12.field_h + var12.field_k));
            if (var10 != null) {
              ((TextHotspotRange) (var10)).field_p = var15;
            }
            this.field_I.addLast((byte) -97, var15);
            var10 = var15;
          }
        }
    }

    public static void clearSharedReferences(int param0) {
        field_L = null;
        field_M = null;
        if (param0 != -1) {
          return;
        }
        field_K = null;
    }

    TextHotspotWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetListener) null);
        this.field_H = null;
        try {
          this.renderer = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.setBounds(param3, (byte) 122, param2, ((TextWidgetRenderer) ((Object) this.renderer)).getPreferredHeight((UiWidget) (this), -121), param0);
        int var5 = 51 % ((69 - param1) / 32);
    }

    static {
        field_M = "Practice";
        field_L = "Ready";
        field_K = new int[]{331, 404, 477, 550};
    }
}
