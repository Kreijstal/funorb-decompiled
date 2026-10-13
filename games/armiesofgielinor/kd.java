/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, mf {
    static String field_U;
    kv field_T;
    static ClientUiComponent field_M;
    static int[][] field_Z;
    static PlatformTask field_J;
    private ma field_I;
    private ma field_K;
    private HotspotTextWidget field_W;
    private InteractiveWidget field_bb;
    private ma field_H;
    private ma field_O;
    static String field_Y;
    private vu field_ab;
    static int field_X;
    private ma field_V;
    static String field_Q;
    static ClientUiComponent field_F;
    static PlatformTask field_R;
    static String field_L;
    static String field_S;
    static String field_E;
    private InteractiveWidget field_G;
    private ma field_N;

    public final void a(int param0, String param1) {
        ma var3 = null;
        String var4 = null;
        try {
          if (param0 != -1) {
            byte[] var5 = (byte[]) null;
            kd.a(11, (CipherPacketBuffer) null, (byte[]) null, (byte) -8);
          }
          var3 = this.field_O;
          var4 = param1;
          ((EditableTextWidget) ((Object) var3)).setText(false, var4, -27934);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(int param0, CipherPacketBuffer param1, byte[] param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 > -101) {
            var9 = (byte[]) null;
            kd.a(-26, (CipherPacketBuffer) null, (byte[]) null, (byte) -65);
          }
          var4_int = param1.readBits(-122, param0);
          if (var4_int == 0) {
            return null;
          }
          if (param2 == null ||
            var4_int != param2.length) {
            param2 = new byte[var4_int];
          }
          var5 = param1.readBits(-117, 3);
          var6 = (byte)param1.readBits(77, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)(var6 + param1.readBits(44, var5));
            }
          }
          stackIn_18_0 = (byte[]) (param2);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("kd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void computeCaretPositions(int justificationStep, String text, TextLineLayout line, BitmapFont font, byte obfuscationGuard) {
        int characterIndex = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        StringBuilder errorContextWithText = null;
        String lineDescription = null;
        StringBuilder errorContextWithLine = null;
        String fontDescription = null;
        RuntimeException caughtFailure = null;
        int spacingAccumulator = 0;
        RuntimeException failure = null;
        int tagX = 0;
        int character = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard <= 78) {
            return;
          }
          spacingAccumulator = 0;
          tagX = -1;
          for (characterIndex = 1; characterIndex < text.length(); characterIndex++) {
            character = text.charAt(characterIndex);
            if (character == 60) {
              tagX = line.caretXs[0] + (spacingAccumulator >> 8) + font.textWidth(text.substring(0, characterIndex));
            }
            if (tagX != -1) {
              line.caretXs[characterIndex] = tagX;
            } else {
              if (character == 32) {
                spacingAccumulator = spacingAccumulator + justificationStep;
              }
              line.caretXs[characterIndex] = (spacingAccumulator >> 8) + line.caretXs[0] - (-font.textWidth(text.substring(0, 1 + characterIndex)) + font.characterWidth((char) character));
            }
            if (character == 62) {
              tagX = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("kd.D(").append(justificationStep).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          errorContextWithText = ((StringBuilder) (Object) errorContext).append(textDescription).append(',');
          if (line == null) {
            lineDescription = "null";
          } else {
            lineDescription = "{...}";
          }
          errorContextWithLine = ((StringBuilder) (Object) errorContextWithText).append(lineDescription).append(',');
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContextWithLine).append(fontDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public kd() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_O = new ma("", (WidgetListener) null, 12);
        this.field_I = new ma("", (WidgetListener) null, 100);
        this.field_H = new ma("", (WidgetListener) null, 100);
        this.field_V = new ma("", (WidgetListener) null, 20);
        this.field_K = new ma("", (WidgetListener) null, 20);
        this.field_N = new ma("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_ab = new vu("", (WidgetListener) null, var1 != 0);
        this.field_bb = new InteractiveWidget(ed.field_c, (WidgetListener) null);
        this.field_G = new InteractiveWidget(pt.field_Y, (WidgetListener) null);
        this.field_O.tooltipText = DualLinkedNode.field_m;
        this.field_I.tooltipText = NodeIterator.field_d;
        this.field_H.tooltipText = AccountNamePrompt.field_Jb;
        this.field_V.tooltipText = CachedArchiveProvider.field_k;
        this.field_K.tooltipText = WeightedScoreStrategy.field_i;
        this.field_N.tooltipText = StrongCacheEntry.field_A;
        this.field_ab.tooltipText = rd.field_g;
        this.field_O.a((byte) 16, new uj(this.field_O));
        this.field_I.a((byte) 16, new vl(this.field_I));
        this.field_H.a((byte) 16, new kt(this.field_H, this.field_I));
        this.field_V.a((byte) 16, new ib(this.field_V, this.field_O, this.field_I));
        this.field_K.a((byte) 16, new di(this.field_K, this.field_V));
        this.field_N.a((byte) 16, new jh(this.field_N));
        this.field_bb.enabled = false;
        this.field_bb.painter = (WidgetPainter) ((Object) new nu());
        this.field_G.painter = (WidgetPainter) ((Object) new td());
        this.field_O.painter = (WidgetPainter) ((Object) new lu(10000536));
        lu dupTemp$0 = new lu(10000536);
        this.field_H.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.field_I.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.field_N.painter = (WidgetPainter) ((Object) new lu(10000536));
        this.field_ab.painter = (WidgetPainter) ((Object) new oi());
        ol dupTemp$1 = new ol(10000536);
        this.field_K.painter = (WidgetPainter) ((Object) dupTemp$1);
        this.field_V.painter = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = fo.a(4800, StateChangeEvent.field_D, new String[]{this.m(150), this.l(29406)});
        int var3 = 20;
        var3 = var3 + this.a(tn.field_X, var3, 170, (byte) 18, this.field_I);
        var3 = var3 + (this.a(false, 170, this.field_H, TrianglePulse.field_j, 20, "", var3) + 5);
        var3 = var3 + this.a(jj.field_h, var3, 170, (byte) 18, this.field_V);
        var3 = var3 + (this.a(TurnEffectEvent.field_B, this.field_K, 170, tf.field_m, 210, var3) + 5);
        var3 = var3 + (5 + this.a(ScrollContainer.field_Ob, this.field_O, 170, MusicPatchEnvelope.field_k, 210, var3));
        var3 = var3 + this.a(var3, this.field_N, 170, field_S, 27270);
        ta var4 = new ta(46, var3, this.width - 90, 25, this.field_ab, true, this.width - 120, 5, gl.field_e, 11579568, IterableDualNodeDeque.field_c);
        this.addChild((byte) 10, (Widget) (var4));
        var3 = var3 + var4.height;
        BitmapTextWidgetPainter var5 = new BitmapTextWidgetPainter(ArmiesOfGielinor.field_J, 0, 0, 0, 0, 16777215, -1, 0, 0, ArmiesOfGielinor.field_J.maxAscent, -1, 2147483647, true);
        this.field_W = new HotspotTextWidget(var2, var5);
        this.field_W.tooltipText = "";
        this.field_W.setHotspotTooltip(DiskCacheRequest.field_I, false, 0);
        this.field_W.setHotspotTooltip(DiskCacheRequest.field_I, false, 1);
        this.field_W.listener = (WidgetListener) (this);
        this.field_W.setTextBounds(this.width - 90, 9567, 46, var3);
        var3 = var3 + (this.field_W.height + 15);
        this.addChild((byte) 10, (Widget) (this.field_W));
        int var6 = 4;
        int var7 = 200;
        this.field_bb.setBounds(496 - var7 >> 1, var7, var3, 8192, 40);
        this.field_G.setBounds(var6 + 3, 60, 15 + var3, 8192, 40);
        this.field_G.listener = (WidgetListener) (this);
        this.field_bb.listener = (WidgetListener) (this);
        this.addChild((byte) 10, (Widget) (this.field_bb));
        this.addChild((byte) 10, (Widget) (this.field_G));
        this.field_T = new kv((mf) (this));
        this.field_T.setBounds(this.field_O.x - (-this.field_O.width - 60), this.width + (-this.field_O.x - this.field_O.width - 60), this.field_O.y + 20, 8192, 150);
        this.addChild((byte) 10, (Widget) (this.field_T));
        this.setBounds(0, 496, 0, 8192, var3 + (55 + var6));
    }

    private final String m(int param0) {
        if (param0 != 150) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean a(boolean param0, eg param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        gu var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          var3 = param1.a(-918933630);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(false);
          if (var4 == rn.field_e) {
            return false;
          }
          if (var4 == ad.field_K) {
            return false;
          }
          if (lq.field_c != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("kd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_L = null;
        field_S = null;
        field_F = null;
        field_E = null;
        field_M = null;
        field_Z = (int[][]) null;
        field_Q = null;
        if (param0 != 19) {
          kd.f((byte) -98);
        }
        field_Y = null;
        field_R = null;
        field_U = null;
        field_J = null;
    }

    public final void hotspotActivated(int hotspotId, int button, byte obfuscationGuard, HotspotTextWidget widget) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard < 102) {
            field_F = (ClientUiComponent) null;
          }
          if (0 == hotspotId) {
            BitmapTextLayout.a("terms.ws", (byte) -106);
          } else {
            if (hotspotId == 1) {
              BitmapTextLayout.a("privacy.ws", (byte) -81);
            } else {
              if (hotspotId == 2) {
                BitmapTextLayout.a("conduct.ws", (byte) -98);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kd.H(").append(hotspotId).append(',').append(button).append(',').append(obfuscationGuard).append(',');
          if (widget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int a(int param0, Widget param1, int param2, String param3, int param4) {
        RuntimeException var6 = null;
        kw var7 = null;
        ta var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new ta(20, param0, param2 + 120, 25, param1, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param3);
          if (param4 != 27270) {
            stackIn_2_0 = -80;
            return stackIn_2_0;
          }
          this.addChild((byte) 10, (Widget) (var8));
          var7 = new kw(((eg) ((Object) param1)).a(-918933630));
          this.addChild((byte) 10, (Widget) (var7));
          var7.setBounds(3 + var8.width + var8.x, 15, var8.y + (-15 + var8.height >> 1), 8192, 15);
          stackIn_4_0 = var8.height;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("kd.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (obfuscationGuard != 11) {
            this.field_I = (ma) null;
          }
          if (this.field_G == widget) {
            PrintCoatConsoleCommand.g(111);
          } else {
            if (widget == this.field_bb) {
              discarded$1 = this.a(-1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("kd.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          this.field_bb.enabled = this.k(obfuscationGuard ^ 32673);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kd.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    private final String l(int param0) {
        if (param0 != 29406) {
          kd.a(109, -112, true);
        }
        return "</col></u>";
    }

    private final boolean k(int param0) {
        String var3;
        if (this.a(true, (eg) (this.field_O)) &&
          this.a(true, (eg) (this.field_I)) &&
          this.a(true, (eg) (this.field_H)) &&
          this.a(true, (eg) (this.field_V)) &&
          this.a(true, (eg) (this.field_K)) &&
          this.a(true, (eg) (this.field_N))) {
          if (param0 <= 96) {
            var3 = (String) null;
            this.a(6, (String) null);
          }
          return true;
        }
        return false;
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_7_0 = this.focusPreviousChild(false, rootWidget);
            return stackIn_7_0;
          }
          if (99 != keyCode) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild((byte) -123, rootWidget);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("kd.F(");
          if (rootWidget == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 != -116) {
          return;
        }
        ((uj) (this.field_O.a(-918933630))).g(50);
    }

    private final int a(boolean param0, int param1, Widget param2, String param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        ta var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new ta(20, param6, 120 + param1, 25, param2, param0, 120, 3, ArmiesOfGielinor.field_J, 16777215, param3);
          this.addChild((byte) 10, (Widget) (var10));
          var9 = new pk(((eg) ((Object) param2)).a(-918933630), param5, 126, var10.height + param6, param1 + 50, param4);
          var9.listener = (WidgetListener) (this);
          this.addChild((byte) 10, (Widget) (var9));
          stackIn_1_0 = var10.height + var9.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("kd.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(String param0, Widget param1, int param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 210) {
            field_Y = (String) null;
          }
          stackIn_3_0 = this.a(false, param2, param1, param3, 35, param0, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("kd.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(String param0, int param1, int param2, byte param3, Widget param4) {
        ta var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ta(20, param1, param2 + 120, 25, param4, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param0);
          this.addChild((byte) 10, (Widget) (var6));
          if (param3 != 18) {
            this.field_G = (InteractiveWidget) null;
          }
          stackIn_3_0 = var6.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("kd.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        CharSequence var6 = null;
        String var4 = null;
        Object var5 = null;
        Object var5Lifetime1;
        Object var5Lifetime2;
        if (null != EffectPresentation.field_e) {
          var3 = EffectPresentation.field_e.pollInput(true, param2);
          if (0 == var3) {
          } else {
            if (var3 == 2 &&
              EffectPresentation.field_e.text != null &&
              !EffectPresentation.field_e.text.equals("")) {
              if (EffectPresentation.field_e.text.charAt(0) == 91) {
                var4 = EffectPresentation.field_e.text;
              } else {
                var6 = (CharSequence) ((Object) EffectPresentation.field_e.text);
                var4 = AccountNameNormalizer.normalize(var6, false);
                var5 = var4;
                var5Lifetime2 = var4;
              }
              var5Lifetime1 = null;
              if (0 == ut.field_fb) {
                var5Lifetime1 = op.requestAddFriend(20, var4, param1);
              }
              if (ut.field_fb == 1) {
                var5Lifetime1 = DamageEvent.requestRemoveFriend(var4, (byte) -27, param1);
              }
              if (ut.field_fb == 2) {
                var5Lifetime1 = se.requestAddIgnoredAccount(var4, param1, param0 - 83);
              }
              if (ut.field_fb == 3) {
                var5Lifetime1 = MusicPatchEnvelope.requestRemoveIgnoredAccount(param1, var4, false, var4);
              }
              if (var5Lifetime1 != null) {
                ta.appendSystemChatMessage((String) null, 2, param0 ^ -18117, var4, (String) (var5Lifetime1), 0);
              }
            }
            EffectPresentation.field_e = null;
            ut.field_fb = -1;
          }
        }
        if (param0 != 2) {
          field_F = (ClientUiComponent) null;
        }
    }

    private final boolean a(int param0) {
        if (!this.k(97)) {
          return false;
        }
        int var2 = param0;
        try {
          var2 = Integer.parseInt(this.field_N.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return BattleUnitRenderer.a(this.field_ab.active, this, this.field_V.text, this.field_I.text, var2, (byte) -110, this.field_O.text);
    }

    static {
        field_X = -1;
        field_Y = "Continue Mission";
        field_U = "Names cannot start or end with space or underscore";
        field_Q = "King Black Dragon summoner";
        field_S = "Age:";
        field_Z = new int[][]{new int[]{95, 98, -1, 96, 195, 97, 100, -1, -1, -1}, new int[]{5, 6, -1, 3, 195, 4, 7, -1, -1, -1}, new int[]{152, 77, -1, 75, 195, 76, 78, -1, -1, -1}, new int[]{95, 92, -1, 153, 231, 91, 93, 154, -1, -1}, new int[]{35, 36, -1, 32, 33, 34, 37, 33, -1, -1}, new int[]{95, 203, 228, 201, 200, 202, 204, -1, -1, -1}, new int[]{28, 29, -1, 26, 25, 27, 30, 230, -1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, 157, -1}, new int[]{95, 98, 99, 96, 195, 97, 100, -1, -1, -1}, new int[]{167, 168, -1, 165, -1, 166, 169, -1, -1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, 17, 134}, new int[]{95, 92, -1, 90, 229, 91, 93, 90, -1, -1}, new int[]{94, 98, 99, 96, 195, 97, 100, -1, -1, -1}, new int[]{88, 207, -1, 205, 89, 206, 208, -1, -1, -1}, new int[]{88, 98, -1, 96, 2, 97, 100, 2, 1, -1}, new int[]{152, 120, -1, 118, 121, 119, 122, -1, -1, -1}, new int[]{95, 92, -1, 90, 231, 91, 93, 2, 1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, 159, 158}, new int[]{103, 104, -1, 101, -1, 102, 105, 186, 185, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{177, 178, -1, 175, 0, 176, 179, -1, -1, -1}, new int[]{95, 145, -1, 142, 229, 144, 146, -1, 143, -1}, new int[]{95, 227, -1, 225, 229, 226, 227, 225, -1, -1}, new int[]{94, 98, 99, 96, 195, 97, 100, -1, -1, -1}, new int[]{59, 14, -1, 12, 15, 13, 16, -1, -1, -1}, new int[]{95, 227, -1, 225, -1, 226, 227, 2, -1, -1}, new int[]{152, 86, -1, 84, 194, 85, 87, -1, -1, -1}, new int[]{180, 183, -1, 181, -1, 182, 184, -1, -1, -1}, new int[]{209, 212, -1, 210, -1, 211, 213, 186, 185, -1}, new int[]{152, 163, -1, 160, 162, 161, 164, -1, 162, -1}, new int[]{59, 198, -1, 196, 195, 197, 199, -1, -1, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, -1, -1}, new int[]{95, 42, -1, 39, 195, 41, 43, -1, -1, -1}, new int[]{95, 42, -1, 39, 195, 41, 43, -1, -1, -1}, new int[]{59, 149, -1, 147, 135, 148, 150, -1, -1, -1}, new int[]{94, 98, -1, 96, 229, 97, 100, -1, -1, -1}, new int[]{59, 67, -1, 65, 195, 66, 68, -1, -1, -1}, new int[]{63, 64, -1, 61, 62, 232, 69, -1, -1, -1}, new int[]{110, 111, -1, 107, -1, 108, 109, -1, -1, -1}, new int[]{50, 51, -1, 48, 47, 49, 52, -1, -1, -1}, new int[]{55, 56, -1, 53, 57, 54, 58, -1, -1, -1}, new int[]{152, 10, -1, 8, 194, 9, 11, -1, -1, -1}, new int[]{95, 92, -1, 90, 233, 91, 45, -1, -1, -1}, new int[]{95, 92, 234, 90, 44, 91, 93, -1, -1, -1}, new int[]{152, 81, -1, 79, 82, 80, 83, -1, -1, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{95, 98, 235, 96, 46, 97, 100, -1, -1, -1}, new int[]{95, 98, -1, 96, 236, 97, 100, 24, 1, -1}, new int[]{95, 98, 237, 96, 195, 97, 100, -1, -1, -1}, new int[]{95, 92, -1, 90, 195, 91, 93, -1, -1, -1}, new int[]{173, 172, -1, 170, 195, 171, 174, -1, -1, -1}, new int[]{95, 73, -1, 71, 70, 72, 74, -1, -1, -1}, new int[]{95, 73, -1, 71, 193, 72, 74, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{95, 42, 240, 39, 239, 41, 43, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 241, 148, 150, -1, -1, -1}, new int[]{152, 149, -1, 147, 151, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, 242, 147, 195, 148, 150, -1, -1, -1}, new int[]{116, 115, -1, 112, 113, 114, 117, -1, -1, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{138, 139, -1, 139, 243, 137, 141, -1, -1, -1}, new int[]{131, 126, -1, 124, 123, 125, 132, -1, -1, -1}, new int[]{95, 98, -1, 96, 244, 97, 100, 31, -1, -1}, new int[]{95, 98, -1, 96, 245, 97, 100, -1, -1, -1}, new int[]{95, 98, 246, 96, 193, 97, 100, -1, -1, -1}, new int[]{28, 22, -1, 20, 19, 21, 23, -1, -1, -1}, new int[]{95, 129, -1, 127, 193, 128, 130, 127, -1, -1}, new int[]{152, 191, -1, 188, 187, 190, 192, -1, 189, -1}, new int[]{217, 216, 247, 214, 218, 215, 219, -1, 247, -1}, new int[]{35, 36, -1, 32, 33, 34, 37, 33, -1, -1}, new int[]{249, -1, 250, 40, -1, 251, 248, 40, 248, -1}, new int[]{252, -1, 252, -1, -1, 253, 252, -1, 252, -1}, new int[]{95, 92, -1, 90, 195, 91, 45, -1, -1, -1}, new int[]{}, new int[]{}, new int[]{}, new int[]{35, 36, 269, 266, 33, 268, 37, 267, -1, -1}, new int[]{95, 98, 99, 254, 195, 97, 100, 255, -1, -1}, new int[]{94, 98, 99, 256, 195, 97, 100, -1, -1, -1}, new int[]{95, 98, 99, 257, 195, 97, 100, -1, -1, -1}, new int[]{95, 98, 99, 258, 195, 97, 100, 259, -1, -1}, new int[]{95, 98, 99, 260, 195, 97, 100, -1, -1, -1}, new int[]{95, 98, 99, 261, 195, 97, 100, -1, -1, -1}, new int[]{95, 145, 264, 262, 229, 263, 265, -1, 143, -1}};
        field_E = "Team chat off";
        field_L = "Friends";
    }
}
