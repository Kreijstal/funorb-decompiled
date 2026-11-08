/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LabeledChildWidget extends SingleChildWidget {
    private BitmapFont labelFont;
    static MenuSelection field_W;
    private boolean labelAfterChild;
    private String labelText;
    private int padding;
    private int labelColor;
    private int labelWidth;
    static String statusResigned;
    static String muGamelistOptions;
    static long[][] field_N;
    static long[] field_Z;
    static String ratedGameTipsSetupPlural;
    static UiComponent field_R;
    static String field_S;

    final static void enqueueMessageLine(int param0, String param1, int param2, boolean param3, int param4) {
        ChatMessageLine var5 = null;
        try {
          if (param0 != 8) {
            LabeledChildWidget.releaseStatics((byte) 74);
          }
          var5 = new ChatMessageLine();
          var5.color = param2;
          var5.field_v = param3 ? true : false;
          var5.text = param1;
          var5.field_l = param4;
          MatchingTextValidator.field_r.addFirst((byte) 116, var5);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "n.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        int var5 = this.widgetX + param2;
        int var6 = this.widgetY + param3;
        super.renderWidget(param0, (byte) 13, param2, param3);
        if (param0 != 0) {
          return;
        }
        int var7 = 126 / ((param1 + 42) / 53);
        int var8 = this.labelAfterChild ? -(this.padding * 2) + (this.widgetWidth - this.labelWidth) : 0;
        this.labelFont.drawParagraph(this.labelText, this.padding + var8 + var5, this.padding + var6, -this.padding + this.labelWidth, this.widgetHeight - 2 * this.padding, this.labelColor, -1, this.labelAfterChild ? 0 : 2, 1, this.labelFont.maxAscent);
    }

    final static boolean pollKeyEvent(int ringMask) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = ReflectionReplySupport.field_a;
        synchronized (var1) {
          if (ByteArrayPool.field_c == WireframeQuad.field_s) {
            return false;
          }
          IterableDualLinkDeque.field_a = QuickChatCategoryCache.field_b[WireframeQuad.field_s];
          LoginMethod.field_b = MenuSelectionSupport.field_c[WireframeQuad.field_s];
          WireframeQuad.field_s = ringMask & WireframeQuad.field_s + 1;
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    final static double[] normalizeVectorInPlace(int obfuscationGuard, double[] vector) {
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double[] stackIn_2_0 = null;
        double[] stackIn_5_0 = null;
        double[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_double = vector[0];
          if (obfuscationGuard > -121) {
            stackIn_2_0 = (double[]) null;
            return stackIn_2_0;
          }
          var4 = vector[1];
          var6 = vector[2];
          var8 = var6 * var6 + (var4 * var4 + var2_double * var2_double);
          if (Math.abs(-1.0 + var8) < 1e-16) {
            stackIn_5_0 = (double[]) (vector);
            return stackIn_5_0;
          }
          var8 = Math.sqrt(var8);
          vector[1] = var4 / var8;
          vector[2] = var6 / var8;
          vector[0] = var2_double / var8;
          stackIn_7_0 = (double[]) (vector);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("n.B(").append(obfuscationGuard).append(',');
          if (vector == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final String getHoverText(int param0) {
        if (param0 >= -10) {
          field_Z = (long[]) null;
        }
        int var2 = this.child.pointerInside ? 1 : 0;
        this.child.pointerInside = this.pointerInside;
        String var3 = this.child.getHoverText(-54);
        this.child.pointerInside = var2 != 0 ? true : false;
        return var3;
    }

    final static String selectLoginRequiredMessage(boolean firstCondition, boolean secondCondition, boolean thirdCondition, byte obfuscationGuard) {
        if (obfuscationGuard != 39) {
          return (String) null;
        }
        int var4 = 0;
        if (firstCondition) {
          var4 += 4;
        }
        if (secondCondition) {
          var4 += 2;
        }
        if (thirdCondition) {
          var4++;
        }
        return LoginMethod.mustloginAlternate[var4];
    }

    LabeledChildWidget(int param0, int param1, int param2, int param3, UiWidget param4, boolean param5, int param6, int param7, BitmapFont param8, int param9, String param10) {
        super(param0, param1, param2, param3, (WidgetPainter) null, (WidgetListener) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.labelText = param10;
          this.padding = param7;
          this.child = param4;
          this.labelFont = param8;
          this.labelWidth = param6;
          stackIn_4_1 = (param5);
          this.labelAfterChild = stackIn_4_1;
          this.labelColor = param9;
          var12_int = this.labelWidth - this.padding;
          var13 = this.labelFont.measureWrappedHeight(param10, var12_int, this.labelFont.maxAscent) + 2 * this.padding;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.setWidgetBounds(param2, param0, var13, false, param1);
          }
          if (this.labelAfterChild) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.padding * 2 + this.labelWidth;
          }
          var14 = stackIn_10_0;
          this.child.setWidgetBounds(-this.labelWidth + param2 - 3 * this.padding, var14, -(this.padding * 2) + param3, false, (-param3 + var13 >> 1) + this.padding);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("n.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_Z = null;
        ratedGameTipsSetupPlural = null;
        statusResigned = null;
        muGamelistOptions = null;
        if (param0 > -48) {
          field_Z = (long[]) null;
        }
        field_W = null;
        field_N = (long[][]) null;
        field_R = null;
        field_S = null;
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_W = new MenuSelection(1);
        statusResigned = "Resigned.";
        muGamelistOptions = "Options";
        field_N = new long[8][256];
        ratedGameTipsSetupPlural = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_Z = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 == (1 & var0) ? (long)(var1 >>> 8) : (long)(255 & var1);
            var4 = var2 << 1;
            if (!(256L > var4)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(var6 < 256L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (256L <= var10) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_N[0][var0] = DropTargetWidget.bitwiseOr(var12, DropTargetWidget.bitwiseOr(DropTargetWidget.bitwiseOr(DropTargetWidget.bitwiseOr(var10 << 24, DropTargetWidget.bitwiseOr(var2 << 32, DropTargetWidget.bitwiseOr(var6 << 40, DropTargetWidget.bitwiseOr(var2 << 48, var2 << 56)))), var8 << 16), var4 << 8));
            for (var14 = 1; 8 > var14; var14++) {
                field_N[var14][var0] = DropTargetWidget.bitwiseOr(field_N[-1 + var14][var0] << 56, field_N[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        field_Z[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = (-1 + var0) * 8;
            field_Z[var0] = LobbyPlayer.bitwiseXor(LobbyPlayer.bitwiseXor(LobbyPlayer.bitwiseXor(TransformSupport.bitwiseAnd(16711680L, field_N[5][5 + var1]), LobbyPlayer.bitwiseXor(LobbyPlayer.bitwiseXor(LobbyPlayer.bitwiseXor(LobbyPlayer.bitwiseXor(TransformSupport.bitwiseAnd(field_N[0][var1], -72057594037927936L), TransformSupport.bitwiseAnd(field_N[1][1 + var1], 71776119061217280L)), TransformSupport.bitwiseAnd(280375465082880L, field_N[2][var1 + 2])), TransformSupport.bitwiseAnd(field_N[3][var1 + 3], 1095216660480L)), TransformSupport.bitwiseAnd(4278190080L, field_N[4][4 + var1]))), TransformSupport.bitwiseAnd(field_N[6][var1 + 6], 65280L)), TransformSupport.bitwiseAnd(255L, field_N[7][var1 + 7]));
        }
    }
}
