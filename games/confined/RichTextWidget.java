/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveWidget {
    private PrimaryNodeDeque field_R;
    static AccountRequestState field_S;
    static String field_U;
    static PrimaryNodeDeque field_T;
    private TextHotspotBounds field_P;
    private String[] field_V;
    static String field_Q;
    static boolean field_W;

    String getTooltipText(byte param0) {
        TextHotspotBounds discarded$0 = null;
        if (null == this.field_P) {
          return null;
        }
        if (null == this.field_V) {
          return null;
        }
        if (param0 >= -82) {
          discarded$0 = this.findHotspotAt(44, -115, -76);
        }
        if (this.field_P.field_u >= this.field_V.length) {
          return null;
        }
        return this.field_V[this.field_P.field_u];
    }

    RichTextWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetEventListener) null);
        this.field_P = null;
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_Q = null;
        field_T = null;
        field_S = null;
        if (param0 != -127) {
          return;
        }
        field_U = null;
    }

    private final TextHotspotBounds findHotspotAt(int param0, int param1, int param2) {
        TextHotspotBounds var4;
        TextHotspotBounds var5;
        int var6;
        var6 = Confined.field_J ? 1 : 0;
        if (param0 != 5971) {
          field_T = (PrimaryNodeDeque) null;
        }
        var4 = (TextHotspotBounds) (this.field_R.beginForward(115));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_r &&
              param1 >= var5.field_m &&
              var5.field_w + var5.field_r > param2 &&
              var5.field_n + var5.field_m >= param1) {
              return var4;
            }
            var5 = var5.field_s;
          }
          var4 = (TextHotspotBounds) (this.field_R.nextForward(2123));
        }
        return null;
    }

    final void setTextBounds(int param0, int param1, int param2, int param3) {
        if (param3 != 8888) {
          field_Q = (String) null;
        }
        this.setBounds(-121, param2, param0, ((TextWidgetRenderer) ((Object) this.field_n)).getPreferredHeight(-1870081887, (UiWidget) (this)), param1);
    }

    final void activateFromInput(int param0, int param1, int param2, int param3) {
        super.activateFromInput(param0, param1, param2, param3);
        int var5 = param2 - this.field_q;
        int var6 = -this.field_m + param1;
        TextHotspotBounds var7 = this.findHotspotAt(param0 ^ 30071, var6, var5);
        if (var7 != null &&
          null != this.field_t) {
          ((TextHotspotListener) ((Object) this.field_t)).onTextHotspotActivated(this, var7.field_u, param3, false);
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -109) {
          String var7 = (String) null;
          this.setHotspotTooltip(-97, (byte) 41, (String) null);
        }
        super.setBounds(-123, param1, param2, param3, param4);
        this.rebuildHotspotBounds(false);
    }

    boolean takeFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 418) {
            var4 = (String) null;
            this.setHotspotTooltip(-48, (byte) -18, (String) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("na.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void drawWidget(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawWidget(param0, param1, (byte) 104, param3);
        if (param1 != 0) {
          return;
        }
        if (param2 <= 36) {
          this.setTextBounds(77, -122, 71, 117);
        }
        TextWidgetRenderer var9 = (TextWidgetRenderer) ((Object) this.field_n);
        TextHotspotBounds var6 = this.field_P;
        if (var6 == null) {
        } else {
          var7 = var9.getTextOriginX((UiWidget) (this), param3, 0);
          var8 = var9.getTextOriginY(param0, 2, (UiWidget) (this));
          do {
            tj.a(2 + var6.field_n, 1, -2 + var6.field_r + var7, var8 + (var6.field_m - 2), var6.field_w + 2);
            var6 = var6.field_s;
          } while (var6 != null);
        }
    }

    void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          if (param1 != 11579568) {
            RichTextWidget.clearDeclaredStaticReferences((byte) 60);
          }
          super.updatePointer(param0, param1 ^ 0, param2, param3);
          this.field_P = null;
          if (this.field_w) {
            var5_int = ld.field_l + (-param2 - this.field_q);
            var6 = -this.field_m - param3 + jh.field_R;
            this.field_P = this.findHotspotAt(5971, var6, var5_int);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "na.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void rebuildHotspotBounds(boolean param0) {
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
        TextLineMetrics var12;
        int var13;
        int var14;
        TextHotspotBounds var15;
        int var16;
        UiWidget var17;
        int var7Lifetime1;
        var16 = Confined.field_J ? 1 : 0;
        this.field_R = new PrimaryNodeDeque();
        var2 = 0;
        var3 = (TextWidgetRenderer) ((Object) this.field_n);
        var4 = var3.getTextLayout((UiWidget) (this), (byte) -119);
        while (true) {
          var5 = this.field_B.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            if (param0) {
              var17 = (UiWidget) null;
              this.updatePointer((UiWidget) null, 126, -29, -40);
            }
            return;
          }
          var7 = this.field_B.indexOf(">", var5);
          var6 = this.field_B.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_B.indexOf("</hotspot>", var5);
          var8 = var4.getLineIndexForTextOffset(-126, var5);
          var9 = var4.getLineIndexForTextOffset(-101, var2);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_c[var11];
            if (~var8 != ~var11) {
              stackIn_7_0 = var12.field_e[0];
            } else {
              stackIn_7_0 = var4.getXForTextOffset(var5, -124);
            }
            var13 = stackIn_7_0;
            if (var11 != var9) {
              if (var12 == null) {
                stackIn_12_0 = 0;
              } else {
                stackIn_12_0 = var12.field_e[var12.field_e.length - 1];
              }
            } else {
              stackIn_12_0 = var4.getXForTextOffset(var2, -108);
            }
            var14 = stackIn_12_0;
            var15 = new TextHotspotBounds(var7Lifetime1, var13, var12.field_d, -var13 + var14, Math.max(var3.getFontLineHeight(-1431655766), var12.field_a - var12.field_d));
            if (var10 != null) {
              ((TextHotspotBounds) (var10)).field_s = var15;
            }
            this.field_R.addLast((IntrusiveNode) (var15), (byte) 88);
            var10 = var15;
          }
        }
    }

    final static void f(int param0) {
        int var3 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        ji stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ji var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Confined.field_J ? 1 : 0;
        try {
          var1_int = uh.field_c;
          var2 = 0;
          if (2 == ea.field_a) {
            var3_long = ri.correctedCurrentTimeMillis(-3) - DequeWidgetContainer.field_M;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = param0; dl.field_c.length > var3; var3++) {
            var4 = LabeledWidgetContainer.field_T[var3];
            if (var4 < 0) {
              var5 = TextLineMetrics.field_b;
            } else {
              if (ij.field_q.field_i == var4) {
                var5 = cg.field_a;
              } else {
                var5 = GzipDecompressor.field_c;
              }
            }
            var6 = dl.field_c[var3];
            if (2 == ea.field_a &&
              var2 == 1) {
              if (UiWidget.field_s.length > jc.field_d.length) {
                stackIn_17_0 = UiWidget.field_s.length;
              } else {
                stackIn_17_0 = jc.field_d.length;
              }
              var7 = stackIn_17_0;
              if (tk.field_e.length <= tf.field_d.length) {
                stackIn_20_0 = tf.field_d.length;
              } else {
                stackIn_20_0 = tk.field_e.length;
              }
              var8 = stackIn_20_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (-var7 + (-6 + var3) + jc.field_d.length < 0) {
                  stackIn_26_0 = "";
                } else {
                  stackIn_26_0 = jc.field_d[var3 - 6 + (jc.field_d.length - var7)];
                }
                var6 = stackIn_26_0;
              }
              if (var7 + 7 <= var3 &&
                var3 < 7 + var7 + var8) {
                if (-var7 + (var3 - 7) >= tf.field_d.length) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = tf.field_d[-var7 + var3 - 7];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = -3;
            stackIn_38_1 = var6;
            stackIn_39_2 = !(var4 < 0);
            var7Lifetime1 = PowerUpPickup.a(stackIn_38_0, stackIn_38_1, stackIn_39_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + StandardContentDialog.field_vb;
            if (var4 >= 0) {
              var1_int = var1_int + kb.field_b;
              if (var4 != ij.field_q.field_i) {
                stackIn_43_0 = db.field_v;
              } else {
                stackIn_43_0 = nj.field_T;
              }
              var9 = stackIn_43_0;
              if (var9 != null) {
                var9.a(var1_int, -jd.field_g + var8Lifetime1, (byte) 103, (n.field_d << 1) + af.field_Z, (jd.field_g << 1) + var7Lifetime1);
              }
              var1_int = var1_int + n.field_d;
            }
            if (var4 < 0) {
              rn.field_e.drawString(var6, var8Lifetime1, ProgressMessageDialog.field_Ab + var1_int, var5, -1);
              var1_int = var1_int + wm.field_bb;
            } else {
              dn.field_f.drawString(var6, var8Lifetime1, var1_int + nm.field_z, var5, -1);
              var1_int = var1_int + (n.field_d + kb.field_b + af.field_Z);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw TextLineMetrics.a((Throwable) ((Object) var1), "na.E(" + param0 + ')');
        }
    }

    final void setHotspotTooltip(int param0, byte param1, String param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          if (null == this.field_V ||
            this.field_V.length <= param0) {
            var7 = new String[param0 + 1];
            var8 = var7;
            var4 = var8;
            if (null != this.field_V) {
              for (var5 = 0; var5 < this.field_V.length; var5++) {
                var7[var5] = this.field_V[var5];
              }
            }
            this.field_V = var8;
          }
          if (param1 != 9) {
            field_W = false;
          }
          this.field_V[param0] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("na.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_Q = "Cloak";
        field_U = "Next";
        field_T = new PrimaryNodeDeque();
    }
}
