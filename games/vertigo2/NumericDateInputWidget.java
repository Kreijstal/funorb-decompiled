/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NumericDateInputWidget extends DateInputWidget {
    private boolean field_Q;
    private EditableTextField field_R;
    private EditableTextField field_T;
    static String field_S;
    private EditableTextField field_N;
    static tj field_O;
    static String field_U;
    static int field_P;
    static HuffmanCodec field_M;

    final void setBounds(boolean param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        int var6 = -130 + param4 >> 1;
        if (this.field_Q) {
          this.field_T.setBounds(false, var6, 0, param3, 25);
          this.field_N.setBounds(false, 45 + var6, 0, param3, 25);
          this.field_R.setBounds(param0, var6 + 90, 0, param3, 40);
          return;
        }
        this.field_N.setBounds(param0, var6, 0, param3, 25);
        this.field_T.setBounds(param0, var6 + 45, 0, param3, 25);
        this.field_R.setBounds(param0, var6 + 90, 0, param3, 40);
    }

    final int getDay(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -32410) {
          return -117;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_N.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean isDateEmpty(boolean param0) {
        if (null == this.field_N.text) {
          return true;
        }
        if (0 == this.field_N.text.length()) {
          return true;
        }
        if (null == this.field_T.text) {
          return true;
        }
        if (this.field_T.text.length() == 0) {
          return true;
        }
        if (param0) {
          this.isDateEmpty(false);
          if (null == this.field_R.text) {
            return true;
          }
          if (this.field_R.text.length() != 0) {
            return false;
          }
          return true;
        }
        if (null == this.field_R.text) {
          return true;
        }
        if (this.field_R.text.length() != 0) {
          return false;
        }
        return true;
    }

    final void setDateValidator(int param0, BirthDateValidator param1) {
        try {
          super.setDateValidator(param0 + 0, param1);
          if (param0 != -11808) {
            this.isDateEmpty(true);
          }
          this.field_N.field_v = (WidgetEventListener) ((Object) param1);
          this.field_T.field_v = (WidgetEventListener) ((Object) param1);
          this.field_R.field_v = (WidgetEventListener) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ko.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(byte param0) {
        if (param0 > -88) {
          field_M = (HuffmanCodec) null;
          return pp.a(LoginPanel.e((byte) -124), 0);
        }
        return pp.a(LoginPanel.e((byte) -124), 0);
    }

    final static boolean b(byte param0, int param1) {
        if (param0 <= -27) {
          return param1 == (-param1 & param1) ? true : false;
        }
        field_P = 61;
        return param1 == (-param1 & param1) ? true : false;
    }

    final int getYear(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0) {
          NumericDateInputWidget.b((byte) 90, -57);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_R.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    public static void clearDeclaredStaticReferences(boolean param0) {
        field_U = null;
        field_O = null;
        field_M = null;
        if (param0) {
          field_O = (tj) null;
          field_S = null;
          return;
        }
        field_S = null;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiPanel var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        tn var9 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (ce.field_b != TextLayout.field_g.field_d) {
            tc.field_b = tc.field_b + (TextLayout.field_g.field_d - ce.field_b);
            ce.field_b = TextLayout.field_g.field_d;
          }
          if (ld.field_b > TextFieldValidator.field_i) {
            TextFieldValidator.field_i = TextFieldValidator.field_i + 1;
          }
          if (TextFieldValidator.field_i <= 0) {
            return;
          }
          kg.c((byte) 77);
          td.field_c.a(0, param0);
          if (TextLineMetrics.field_a != null) {
            if (MusicPatchNode.field_r) {
              TextLineMetrics.field_a.processPointerInput(td.field_c.field_C, param0, (byte) 82, td.field_c.field_ob);
            } else {
              TextLineMetrics.field_a = null;
            }
          }
          for (var4_int = 0; var4_int < 5; var4_int++) {
            var5 = hl.field_q[var4_int];
            if (var5 != null) {
              if (var5.field_tb != 0) {
                gh.a(var5, (byte) 42, var4_int);
              }
              var6 = ab.a(0, var4_int);
              w.field_C[var4_int].field_Db = kb.field_d[var6];
              LabeledWidgetContainer.field_M[var4_int].field_S = ba.field_f[var6];
            }
          }
          if (ea.field_c.field_tb != 0) {
            up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, param2, PlayerAvatarRenderer.field_D, TextureOperator.field_s, eh.field_a, AccountRequestState.field_b, fr.field_a, ja.field_e, (String) null, 0L);
          }
          var9 = qr.a(NetworkArchiveRequest.field_G, 55, param1, Archive.field_f);
          if (var9 != null) {
            nd.a(var9, 32192);
          }
          if (!param3) {
            NumericDateInputWidget.clearDeclaredStaticReferences(true);
          }
          var8 = ui.b(-485);
          if (var8 == null) {
            return;
          }
          field_S = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var4), "ko.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    NumericDateInputWidget(WidgetListener param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(false, param2, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ko.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private NumericDateInputWidget(WidgetListener param0, boolean param1) {
        super(0, 0, 0, 0, (WidgetListener) null);
        try {
          this.field_N = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) null, 2));
          this.field_T = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) null, 2));
          this.field_R = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) null, 4));
          this.field_Q = param1 ? true : false;
          this.field_R.listener = param0;
          this.field_T.listener = param0;
          this.field_N.listener = param0;
          if (!this.field_Q) {
            this.addChild((byte) -91, this.field_N);
            this.addChild((byte) -27, this.field_T);
          } else {
            this.addChild((byte) 79, this.field_T);
            this.addChild((byte) 82, this.field_N);
          }
          this.addChild((byte) 77, this.field_R);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ko.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawWidget(boolean param0, int param1, int param2, int param3) {
        super.drawWidget(param0, param1, param2, param3);
        if (param1 == 0) {
          param2 = param2 + this.x;
          param3 = param3 + this.y;
          this.drawDateFieldLabel(param3, -626, param2, this.field_N, MusicPatchEnvelope.field_m);
          this.drawDateFieldLabel(param3, -626, param2, this.field_T, ff.field_v);
          this.drawDateFieldLabel(param3, -626, param2, this.field_R, ArrayWidgetContainer.field_C);
          return;
        }
    }

    final int getMonthIndex(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 0) {
          field_P = 123;
        }
        try {
          stackIn_3_0 = -1 + Integer.parseInt(this.field_T.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private final void drawDateFieldLabel(int param0, int param1, int param2, UiWidget param3, String param4) {
        try {
          if (param1 != -626) {
            this.setBounds(true, -28, 21, -75, 109);
          }
          bl.field_N.drawCentred(param4, (param3.width >> 1) + param2 + param3.x, -5 + (param3.y + param0), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "ko.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltipText(boolean param0) {
        String var2 = this.field_T.getTooltipText(param0);
        if (var2 != null) {
          return var2;
        }
        if (this.field_p) {
          return this.field_q != null ? this.field_q : this.text;
        }
        return null;
    }

    static {
        field_U = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_O = new tj();
    }
}
