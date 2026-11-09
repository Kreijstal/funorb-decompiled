/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends WidgetContainer implements ca, WidgetActionListener {
    static SpriteData field_C;
    static int field_H;
    private uk field_G;
    private InteractiveWidget field_D;
    static ToolkitSprite field_B;
    private ar field_F;

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.onKey(root, character, (byte) 60, keyCode)) {
            return true;
          }
          if (98 == keyCode) {
            stackIn_7_0 = this.focusPrevious((byte) -94, root);
            return stackIn_7_0;
          }
          if (keyCode == 99) {
            stackIn_10_0 = this.focusNext(root, false);
            return stackIn_10_0;
          }
          if (guard < 9) {
            th.e(false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("th.KA(");
          if (root == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    th(uk param0) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        RuntimeException runtimeException = null;
        int var3 = 0;
        TextWidgetRenderer var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_G = param0;
          this.field_D = new InteractiveWidget(wd.continueText, (WidgetListener) null);
          this.field_D.renderer = (WidgetRenderer) ((Object) new ue());
          var7 = ic.a(qv.asYouAreUnderText, new String[]{this.a((byte) 43), this.g(116)}, (byte) -128);
          var3 = 20;
          var4 = new TextWidgetRenderer(kw.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
          this.field_F = new ar(var7, var4);
          this.field_F.tooltip = "";
          this.field_F.a(-57, sb.openInPopupWindowText, 0);
          this.field_F.a(-66, sb.openInPopupWindowText, 1);
          this.field_F.listener = (WidgetListener) (this);
          this.field_F.width = -40 + this.width;
          this.field_F.a(var3, false, 26, -40 + this.width);
          var3 = var3 + (15 + this.field_F.height);
          this.addChild(this.field_F, 99);
          var5 = 4;
          var6 = 200;
          this.field_D.setBounds(-79, 300 - var6 >> 1, var3, 40, var6);
          this.field_D.listener = (WidgetListener) (this);
          this.addChild(this.field_D, 76);
          this.setBounds(-112, 0, 0, 55 + var3 + var5, 300);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("th.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 1 << param2;
          if ((var3_int & kh.field_e) != 0) {
            return;
          }
          kh.field_e = kh.field_e | var3_int;
          OpenGlTransparentWaterEffect.field_e = OpenGlTransparentWaterEffect.field_e | var3_int;
          pl.field_v.addLast((IntrusiveNode) (new ge(param2)), (byte) 39);
          if (BufferedCacheFile.a((byte) -84, 10) >= 5) {
            fb.field_a = fb.field_a + TextureFormat.elapsedTicks;
          } else {
            GraphicsToolkit.field_f = GraphicsToolkit.field_f + TextureFormat.elapsedTicks;
          }
          if (BufferedCacheFile.a((byte) -84, 10) < 5) {
            ts.field_a = ts.field_a - IntrusiveNodeHashTable.field_c;
          } else {
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b - IntrusiveNodeHashTable.field_c;
          }
          NodeHashTableIterator.a(param2, (byte) -82);
          if (param0 != 24753) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (3 == param2) {
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b - DropDownWidget.field_C;
            GraphicsToolkit.field_f = GraphicsToolkit.field_f + oh.levelIndex;
            ts.field_a = ts.field_a - nq.field_i;
          } else {
            if (param2 != 4 &&
              param2 != 5 &&
              6 != param2 &&
              param2 != 7) {
              if (param2 == 10) {
                GraphicsToolkit.field_f = GraphicsToolkit.field_f + oh.levelIndex;
              } else {
                if ((param2 == 0 ||
                  param2 == 1 ||
                  2 == param2)) {
                  fb.field_a = fb.field_a + oh.levelIndex;
                }
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              ts.field_a = ts.field_a + nq.field_i;
            }
          }
          if (!f.field_w) {
            OpenGlUnderwaterEffect.field_q.addLast((IntrusiveNode) (new hg(param2, param1, GraphicsToolkit.field_f, fb.field_a, ts.field_a, SoftwareTransform3D.field_b)), (byte) 39);
          }
          boolean decompiledFrameRemainder0 = true;
          if (3 != param2) {
            if (param2 != 4 &&
              param2 != 5 &&
              6 != param2 &&
              param2 != 7) {
              if (10 == param2) {
                GraphicsToolkit.field_f = GraphicsToolkit.field_f - oh.levelIndex;
              } else {
                if ((param2 == 0 ||
                  param2 == 1 ||
                  param2 == 2)) {
                  fb.field_a = fb.field_a - oh.levelIndex;
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              ts.field_a = ts.field_a - nq.field_i;
            }
          } else {
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b + DropDownWidget.field_C;
            GraphicsToolkit.field_f = GraphicsToolkit.field_f - oh.levelIndex;
            ts.field_a = ts.field_a + nq.field_i;
          }
          if (5 > BufferedCacheFile.a((byte) -84, 10)) {
            GraphicsToolkit.field_f = GraphicsToolkit.field_f - TextureFormat.elapsedTicks;
          } else {
            fb.field_a = fb.field_a - TextureFormat.elapsedTicks;
          }
          if (BufferedCacheFile.a((byte) -84, 10) >= 5) {
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b + IntrusiveNodeHashTable.field_c;
            return;
          }
          ts.field_a = ts.field_a + IntrusiveNodeHashTable.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "th.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, ar param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 == 0) {
            hn.a((byte) 113, "terms.ws");
          } else {
            if (1 == param0) {
              hn.a((byte) 80, "privacy.ws");
            } else {
              if (param0 == 2) {
                hn.a((byte) 98, "conduct.ws");
              }
            }
          }
          if (param3 == -20036) {
            return;
          }
          this.field_G = (uk) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("th.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String g(int param0) {
        RuntimeException var2 = null;
        ar var3 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 2) {
            var3 = (ar) null;
            this.a(-104, (ar) null, -45, 28);
          }
          stackIn_3_0 = "</col></u>";
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "th.H(" + param0 + ')');
        }
    }

    final static void e(boolean param0) {
        try {
          GraphicsToolkit.field_d = fd.clickText + " <b>" + km.acceptText + "</b> " + ws.toKeepFullscreenOrText + " <b>" + up.cancelText + "</b> " + oh.toReturnToTheText + "<br>" + "<br>" + c.ifYouDoNothingText;
          if (!param0) {
            th.e(false);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "th.I(" + param0 + ')');
        }
    }

    private final String a(byte param0) {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 75 / ((-65 - param0) / 44);
          stackIn_1_0 = "<u=2164A2><col=2164A2>";
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "th.F(" + param0 + ')');
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (source == this.field_D) {
            kh.a(false);
            this.field_G.n(-7);
          }
          if (guard == 710) {
            return;
          }
          th.f(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("th.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    public static void f(boolean param0) {
        try {
          if (param0) {
            th.b(82, -23, -57);
          }
          field_C = null;
          field_B = null;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "th.G(" + param0 + ')');
        }
    }

    static {
        field_H = 0;
    }
}
