/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends UiContainer implements TextInputListener, ButtonListener {
    private boolean field_K;
    private TextButton field_N;
    private boolean field_M;
    static String field_O;
    private boolean field_P;
    private EditableTextWidget field_L;
    private EditableTextWidget field_J;
    private TextButton field_G;
    private String field_H;
    private TextButton field_I;

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_18_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (this.field_G == button) {
            this.a((byte) 103);
          } else if (this.field_N == button) {
            fe.a((byte) -83);
          } else if (this.field_I == button) {
            if (this.field_K) {
              fh.b(-54);
            } else if (this.field_P) {
              qe.a(true);
            } else {
              ta.m(2);
            }
          }
          if (guard != 1) {
            this.field_H = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var6;
          StringBuilder stackIn_17_1 = new StringBuilder().append("h.K(");
          if (button == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (null != this.field_H) {
          Js5Transport.field_a.a(this.field_H, 20 + (this.x + screenX), this.y + (screenY + 15), -40 + this.width, this.height, 16777215, -1, 1, 0, Js5Transport.field_a.field_r);
        }
        if (null != this.field_N) {
          SoftwareRasterizer.drawHorizontalLine(10 + screenX, 134 + screenY, this.width - 20, 4210752);
        }
        if (guard < 85) {
          this.field_H = (String) null;
        }
        super.drawLayer(screenY, (byte) 87, layer, screenX);
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_18_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 60)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_7_0 = this.a((byte) 22, root);
            return stackIn_7_0;
          }
          if (keyCode == 99) {
            boolean stackIn_10_0 = this.a(root, true);
            return stackIn_10_0;
          }
          if (guard <= 0) {
            EditableTextWidget var6 = (EditableTextWidget) null;
            this.onTextChanged((EditableTextWidget) null, -39);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("h.G(");
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    public final void onSubmit(boolean guard, EditableTextWidget field) {
        String stackIn_11_2 = null;
        try {
          if (field == this.field_L) {
            this.field_J.focusNext(-4659, (UiComponent) (this));
          }
          if (this.field_J == field) {
            this.a((byte) 100);
          }
          if (!guard) {
            this.field_H = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("h.CA(").append(guard).append(',');
          if (field == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, byte param1) {
        String stackIn_13_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var8 = new CipherPacketBuffer(param0.a(-4, "", "logo.fo3d"));
          CipherPacketBuffer var10 = var8;
          int var3 = var10.readUnsignedByte(0);
          var10.beginBitReading(-17928);
          DialogueScreen.field_y = IntrusiveNode.a(var10, 22178);
          fh.field_e = new ia[var3];
          SectorCacheStore.field_c = new int[var3][];
          if (param1 < 41) {
            h.a(82, (byte) -78);
          }
          for (int var4 = 0; var3 > var4; var4++) {
            fh.field_e[var4] = wk.a(-127, var8);
          }
          var10.endBitReading(-3879);
          int var9 = 0;
          int var4Lifetime1 = var9;
          while (var3 > var9) {
            ia var5 = fh.field_e[var9];
            var5.a(6, 1, 6, 6, -72);
            var5.a((byte) 49);
            int[] var6 = new int[]{var5.field_b + var5.field_a >> 1, var5.field_R + var5.field_i >> 1, var5.field_O + var5.field_g >> 1};
            SectorCacheStore.field_c[var9] = var6;
            var5.a(-var6[2], 0, -var6[0], -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("h.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final String j(int param0) {
        if (param0 != 35) {
          TextButton var3 = (TextButton) null;
          this.onAction((TextButton) null, 35, 44, 83, 31);
        }
        if (null != this.field_L.text) {
          return this.field_L.text;
        }
        return "";
    }

    final static int a(int param0, byte param1) {
        int var2 = ua.field_c.a(29386, param0);
        if (param1 != 121) {
          field_O = (String) null;
        }
        int var3 = je.a(false, param0);
        if (var2 >= var3) {
          var2 = 0;
        } else if (var2 == 0) {
          var2 = CheckboxPainter.field_l.field_s;
        }
        return var2;
    }

    public final void onTextChanged(EditableTextWidget field, int guard) {
        try {
          if (guard != 0) {
            this.field_J = (EditableTextWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "h.W(" + (field != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void h(byte param0) {
        if (param0 >= -127) {
          this.field_N = (TextButton) null;
        }
        this.field_L.h((byte) -29);
        this.field_J.h((byte) -29);
    }

    private final void a(byte param0) {
        if (param0 <= 88) {
          EditableTextWidget var3 = (EditableTextWidget) null;
          this.onSubmit(true, (EditableTextWidget) null);
        }
        if (gm.b(8192) ||
          !(this.field_L.text.length() <= 0) &&
          !(this.field_J.text.length() <= 0)) {
          RasterSnapshot.a(0, this.field_J.text, this.field_L.text);
        }
    }

    h(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        String stackIn_19_3 = null;
        String stackIn_60_2 = null;
        String stackIn_63_2 = null;
        try {
          boolean stackIn_4_1 = (param4);
          this.field_P = stackIn_4_1;
          boolean stackIn_7_1 = (param3);
          this.field_M = stackIn_7_1;
          this.field_H = param1;
          boolean stackIn_10_1 = (param2);
          this.field_K = stackIn_10_1;
          if (this.field_K && (this.field_M ||
            this.field_P)) {
            throw new IllegalStateException();
          }
          this.field_L = (EditableTextWidget) ((Object) new ValidatedTextWidget(param0, (UiListener) (this), 100));
          this.field_J = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) (this), 20));
          if (!this.field_K) {
            this.field_G = new TextButton(ta.field_g, (UiListener) null);
            TextButton stackIn_18_1 = null;
            TextButton stackIn_18_2 = null;
            if (this.field_P) {
              stackIn_19_3 = cj.field_c;
            } else {
              TextButton stackIn_19_1 = null;
              TextButton stackIn_19_2 = null;
              stackIn_19_3 = Minimap.field_O;
            }
            this.field_I = new TextButton(stackIn_19_3, (UiListener) null);
            if (this.field_M) {
              this.field_N = new TextButton(pc.field_g, (UiListener) (this));
            }
          } else {
            this.field_G = new TextButton(sh.field_s, (UiListener) null);
            this.field_I = new TextButton(EmailAvailabilityRequest.field_d, (UiListener) null);
            this.field_L.enabled = false;
          }
          this.field_L.painter = (WidgetPainter) ((Object) new re(10000536));
          this.field_J.painter = (WidgetPainter) ((Object) new un(10000536));
          ck var6 = new ck();
          this.field_G.painter = (WidgetPainter) ((Object) var6);
          if (this.field_I != null) {
            this.field_I.painter = (WidgetPainter) ((Object) var6);
          }
          if (null != this.field_N) {
            this.field_N.painter = (WidgetPainter) ((Object) var6);
          }
          this.field_L.tooltip = cd.field_u;
          if (this.field_N != null) {
            this.field_N.tooltip = mm.field_c;
          }
          if (this.field_K) {
            this.field_I.tooltip = ValidatedTextWidget.field_Z;
          } else if (!this.field_P) {
            this.field_I.painter = (WidgetPainter) ((Object) new ha());
          } else {
            this.field_I.tooltip = lf.field_G;
            this.field_I.painter = (WidgetPainter) ((Object) new ha());
          }
          this.y = 15;
          BitmapFont var7 = Js5Transport.field_a;
          if (null != this.field_H) {
            this.y = this.y + (var7.b(this.field_H, -40 + this.width, var7.field_r) + 5);
          }
          String var8 = lh.field_b;
          ee var9 = sh.a((byte) -1, PointCloudEffect.d((byte) -107));
          if (var9 == NameAvailabilityValidator.field_q) {
            var8 = kg.field_b;
          } else if (var9 == oh.field_n) {
            var8 = wi.field_c;
          }
          ki dupTemp$0 = new ki(10, this.y, -20 + this.width, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
          ki var12 = dupTemp$0;
          this.b(dupTemp$0, false);
          this.y = this.y + (((UiComponent) ((Object) var12)).height + 5);
          ki dupTemp$1 = new ki(10, this.y, this.width - 20, 25, this.field_J, false, 80, 3, var7, 16777215, qc.field_vb);
          ki var13 = dupTemp$1;
          this.b(dupTemp$1, false);
          this.y = this.y + (((UiComponent) ((Object) var13)).height + 5);
          this.field_G.listener = (UiListener) (this);
          if (this.field_N != null) {
            this.field_N.listener = (UiListener) (this);
          }
          if (null != this.field_I) {
            this.field_I.listener = (UiListener) (this);
          }
          if (this.field_N == null) {
            this.field_G.setBounds(-10 + (-6 + this.width), this.y, 8, true, 30);
            this.y = this.y + 35;
          } else {
            this.field_G.setBounds(-95 + this.width, this.y, 85, true, 30);
            this.y = this.y + 60;
          }
          if (this.field_N != null) {
            this.field_N.setBounds(this.width - 6 - 10, this.y, 8, true, 30);
            this.y = this.y + 35;
          }
          if (null != this.field_I) {
            if (!this.field_K &&
              !this.field_P) {
              this.field_I.setBounds(40, this.y, 8, true, 20);
              this.y = this.y + 25;
            } else {
              this.field_I.setBounds(-6 + (this.width - 10), this.y, 8, true, 30);
              this.y = this.y + 35;
            }
          }
          this.setBounds(this.width, 0, 0, true, 3 + this.y);
          this.b(this.field_G, false);
          if (this.field_N != null) {
            this.b(this.field_N, false);
          }
          if (null != this.field_I) {
            this.b(this.field_I, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_59_0 = var6_ref;
          StringBuilder stackIn_59_1 = new StringBuilder().append("h.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          StringBuilder stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard <= 94) {
          field_O = (String) null;
        }
        field_O = null;
    }

    final void a(String param0, byte param1) {
        if (param1 <= 105) {
          return;
        }
        try {
          EditableTextWidget var3 = this.field_L;
          String var4 = param0;
          var3.setText(var4, false, -33);
          this.field_J.h((byte) -29);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "h.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_O = "Rewatch last briefing";
    }
}
