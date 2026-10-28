/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionsPanel extends UiContainer implements ButtonListener {
    static int field_N;
    private TextButton[] field_K;
    static pj field_I;
    static String field_J;
    private NameSuggestionListener field_L;
    private String[] field_M;
    static int[] field_O;
    static volatile boolean field_H;

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        super.drawLayer(screenY, (byte) 102, layer, screenX);
        if (guard < 85) {
          return;
        }
        if (layer != 0) {
          return;
        }
        BitmapFont var5 = Js5Transport.field_a;
        if (this.field_M != null) {
          var5.drawParagraph(UiComponent.field_m, screenX + this.x, screenY + this.y, this.width, 20, 16777215, -1, 0, 0, var5.maxAscent + var5.maxDescent);
        }
    }

    final void setSuggestions(String[] suggestions, byte guard) {
        String stackIn_19_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          this.field_A.clear((byte) 127);
          if (suggestions != null &&
            0 != suggestions.length) {
            int var3_int = suggestions.length;
            this.field_M = new String[var3_int];
            if (guard != -103) {
              return;
            }
            for (int var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_M[var4_int] = pc.a(guard + 103, (CharSequence) ((Object) suggestions[var4_int])).replace(' ', ' ');
            }
            ha var4 = new ha(Js5Transport.field_a, 0, 1);
            this.field_K = new TextButton[1 + var3_int];
            for (int var5 = 0; var5 < var3_int; var5++) {
              this.field_K[var5] = new TextButton(this.field_M[var5], (UiListener) (this));
              this.field_K[var5].painter = (WidgetPainter) ((Object) var4);
              this.field_K[var5].tooltip = ei.field_n;
              this.field_K[var5].setBounds(80, 16 * var5 + 20, 0, true, 15);
              this.b(this.field_K[var5], false);
            }
            this.field_K[var3_int] = new TextButton(uj.field_c, (UiListener) (this));
            this.field_K[var3_int].painter = (WidgetPainter) ((Object) var4);
            this.field_K[var3_int].setBounds(100, 16 * (1 + var3_int) + 20, 0, true, 15);
            this.b(this.field_K[var3_int], false);
            return;
          }
          this.field_M = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3;
          StringBuilder stackIn_18_1 = new StringBuilder().append("rh.A(");
          if (suggestions == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    NameSuggestionsPanel(NameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_L = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_16_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 91)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_6_0 = this.a((byte) 22, root);
            return stackIn_6_0;
          }
          if (guard < 0) {
            field_N = -69;
          }
          if (99 != keyCode) {
            return false;
          }
          boolean stackIn_12_0 = this.a(root, true);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("rh.G(");
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_O = null;
        field_I = null;
        field_J = null;
        if (guard != -24896) {
          field_J = (String) null;
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Color param2, int param3, String param4) {
        String stackIn_25_2 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            java.awt.Graphics var9 = of.field_d.getGraphics();
            if (null == ImageProducerRasterBuffer.field_l) {
              ImageProducerRasterBuffer.field_l = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param1) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, pd.field_b, BoundedUrlRequest.field_d);
            }
            if (param2 == null) {
              param2 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == UiContainer.field_z) {
                UiContainer.field_z = of.field_d.createImage(304, 34);
              }
              java.awt.Graphics var10 = UiContainer.field_z.getGraphics();
              var10.setColor(param2);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(3 * param3 + 2, 2, -(3 * param3) + 300, 30);
              var10.setFont(ImageProducerRasterBuffer.field_l);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param4, (304 - param4.length() * 6) / 2, 22);
              var9.drawImage(UiContainer.field_z, -152 + pd.field_b / 2, -18 + BoundedUrlRequest.field_d / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var6 = (Exception) (Object) decompiledCaughtException;
              int var7 = -152 + pd.field_b / 2;
              int var8 = BoundedUrlRequest.field_d / 2 - 18;
              var9.setColor(param2);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, 2 + var8, param3 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, var8 + 1, 301, 31);
              var9.fillRect(2 + (var7 + 3 * param3), 2 + var8, -(3 * param3) + 300, 30);
              var9.setFont(ImageProducerRasterBuffer.field_l);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param4, (-(6 * param4.length()) + 304) / 2 + var7, 22 + var8);
            }
            if (TextLayout.field_e != null) {
              var9.setFont(ImageProducerRasterBuffer.field_l);
              var9.setColor(java.awt.Color.white);
              var9.drawString(TextLayout.field_e, pd.field_b / 2 - 6 * TextLayout.field_e.length() / 2, BoundedUrlRequest.field_d / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            Exception var5 = (Exception) (Object) decompiledCaughtException;
            of.field_d.repaint();
          }
          if (param0 != 9) {
            field_O = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_24_0 = var5_ref;
          StringBuilder stackIn_24_1 = new StringBuilder().append("rh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          StringBuilder stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_16_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (guard != 1) {
            field_I = (pj) null;
          }
          for (int var6_int = 0; var6_int < this.field_M.length; var6_int++) {
            if (this.field_K[var6_int] == button) {
              this.field_L.onNameSelected((byte) -98, this.field_M[var6_int]);
            }
          }
          if (button == this.field_K[this.field_M.length]) {
            this.field_L.onMoreSuggestions((byte) -61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var6;
          StringBuilder stackIn_15_1 = new StringBuilder().append("rh.K(");
          if (button == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    static {
        field_J = "ON";
        field_O = new int[4];
        field_H = true;
    }
}
