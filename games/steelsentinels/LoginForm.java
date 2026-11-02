/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends UiContainer implements TextInputListener, ButtonListener {
    static int field_S;
    static String field_P;
    private boolean field_ab;
    static int field_Z;
    private EditableTextWidget field_Q;
    private boolean field_eb;
    static int field_U;
    static SceneWidget field_gb;
    static String field_Y;
    private EditableTextWidget field_V;
    private TextButton field_X;
    private String field_fb;
    private TextButton field_R;
    static NodeDeque field_db;
    static int field_T;
    static jj[] field_W;
    private boolean field_cb;
    private TextButton field_bb;

    final void a(String param0, int param1) {
        EditableTextWidget var4 = null;
        String var5 = null;
        try {
          int var3_int = 65 / ((param1 - 81) / 42);
          var4 = this.field_V;
          var5 = param0;
          var4.setText(var5, 29597, false);
          this.field_Q.i(-8521);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "pm.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void onSubmit(boolean param0, EditableTextWidget param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == this.field_V) {
            this.field_Q.focusNext(1, (UiComponent) (this));
          }
          if (param1 == this.field_Q) {
            this.i(0);
          }
          if (!param0) {
            field_W = (jj[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean n(int param0) {
        if (param0 < 11) {
          field_S = 121;
        }
        if (ViewportController.field_f == -1) {
          if (!ve.a((byte) -116, 1)) {
            return false;
          }
          ViewportController.field_f = rf.field_d.readUnsignedByte((byte) -118);
          rf.field_d.position = 0;
        }
        if (-2 == ViewportController.field_f) {
          if (!ve.a((byte) -103, 2)) {
            return false;
          }
          ViewportController.field_f = rf.field_d.readUnsignedShort((byte) -60);
          rf.field_d.position = 0;
        }
        return ve.a((byte) -112, ViewportController.field_f);
    }

    final boolean onFocusedKey(int param0, int param1, char param2, UiComponent param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onFocusedKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.b(param3, 74);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(-11963, param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pm.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void onAction(int param0, byte param1, int param2, TextButton param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          var6_int = -6 / ((-85 - param1) / 36);
          if (this.field_bb == param3) {
            this.i(0);
          } else {
            if (param3 == this.field_X) {
              AccountTermsPanel.h((byte) 45);
            } else {
              if (param3 == this.field_R) {
                if (!this.field_eb) {
                  if (!this.field_cb) {
                    se.a(110);
                  } else {
                    IconLabelControl.d((byte) 112);
                  }
                } else {
                  tj.a(121);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("pm.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_Y = null;
        field_P = null;
        field_db = null;
        field_gb = null;
        field_W = null;
        if (param0 != 320) {
          LoginForm.m(-108);
        }
    }

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        LabeledField dupTemp$0 = null;
        LabeledField dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        TextButton stackIn_17_1 = null;
        TextButton stackIn_17_2 = null;
        TextButton stackIn_18_1 = null;
        TextButton stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ThreeSliceButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethod var9 = null;
        LabeledField var12 = null;
        LabeledField var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_cb = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_ab = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_eb = stackIn_10_1;
          this.field_fb = param1;
          if (this.field_eb && (this.field_ab ||
            this.field_cb)) {
            throw new IllegalStateException();
          }
          this.field_V = (EditableTextWidget) ((Object) new ValidatedTextWidget(param0, (UiListener) (this), 100));
          this.field_Q = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) (this), 20));
          if (this.field_eb) {
            this.field_bb = new TextButton(sl.field_c, (UiListener) null);
            this.field_R = new TextButton(qe.field_b, (UiListener) null);
            this.field_V.field_K = false;
          } else {
            this.field_bb = new TextButton(VerticalScrollbar.field_cc, (UiListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_cb) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = StrongCacheEntry.field_J;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = lj.field_c;
            }
            this.field_R = new TextButton(stackIn_18_3, (UiListener) null);
            if (this.field_ab) {
              this.field_X = new TextButton(MatchingTextValidator.field_n, (UiListener) (this));
            }
          }
          this.field_V.field_p = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
          this.field_Q.field_p = (WidgetPainter) ((Object) new PasswordFieldPainter(10000536));
          var6 = new ThreeSliceButtonPainter();
          this.field_bb.field_p = (WidgetPainter) ((Object) var6);
          if (null != this.field_R) {
            this.field_R.field_p = (WidgetPainter) ((Object) var6);
          }
          if (this.field_X != null) {
            this.field_X.field_p = (WidgetPainter) ((Object) var6);
          }
          this.field_V.field_v = pa.field_i;
          if (this.field_X != null) {
            this.field_X.field_v = ProxySocketConnector.field_m;
          }
          if (!this.field_eb) {
            if (!this.field_cb) {
              this.field_R.field_p = (WidgetPainter) ((Object) new LinkButtonPainter());
            } else {
              this.field_R.field_v = rg.field_g;
              this.field_R.field_p = (WidgetPainter) ((Object) new LinkButtonPainter());
            }
          } else {
            this.field_R.field_v = ModalPanel.field_P;
          }
          this.field_z = 15;
          var7 = tj.field_e;
          if (null != this.field_fb) {
            this.field_z = this.field_z + (5 + var7.paragraphHeight(this.field_fb, -40 + this.field_x, var7.field_G));
          }
          var8 = qe.field_c;
          var9 = SocketConnector.a((byte) -60, Projectile.d((byte) -21));
          if (var9 != PartInstruction.field_o) {
            if (var9 == TabbedPanel.field_Vb) {
              var8 = SentinelDesigner.field_l;
            }
          } else {
            var8 = ln.field_b;
          }
          dupTemp$0 = new LabeledField(10, this.field_z, this.field_x - 20, 25, this.field_V, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, -100);
          this.field_z = this.field_z + (5 + ((UiComponent) ((Object) var12)).field_E);
          dupTemp$1 = new LabeledField(10, this.field_z, this.field_x - 20, 25, this.field_Q, false, 80, 3, var7, 16777215, jh.field_c);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, -120);
          this.field_bb.field_A = (UiListener) (this);
          this.field_z = this.field_z + (((UiComponent) ((Object) var13)).field_E + 5);
          if (null != this.field_X) {
            this.field_X.field_A = (UiListener) (this);
          }
          if (this.field_R != null) {
            this.field_R.field_A = (UiListener) (this);
          }
          if (null != this.field_X) {
            this.field_bb.a(85, (byte) -94, this.field_z, -95 + this.field_x, 30);
            this.field_z = this.field_z + 60;
          } else {
            this.field_bb.a(8, (byte) -95, this.field_z, this.field_x - 6 - 10, 30);
            this.field_z = this.field_z + 35;
          }
          if (this.field_X != null) {
            this.field_X.a(8, (byte) -85, this.field_z, -6 + (this.field_x - 10), 30);
            this.field_z = this.field_z + 35;
          }
          if (this.field_R != null) {
            if (!this.field_eb &&
              !this.field_cb) {
              this.field_R.a(8, (byte) -127, this.field_z, 40, 20);
              this.field_z = this.field_z + 25;
            } else {
              this.field_R.a(8, (byte) -106, this.field_z, this.field_x - 16, 30);
              this.field_z = this.field_z + 35;
            }
          }
          this.a(0, (byte) -117, 0, this.field_x, this.field_z + 3);
          this.addChild(this.field_bb, -123);
          if (this.field_X != null) {
            this.addChild(this.field_X, -123);
          }
          if (this.field_R != null) {
            this.addChild(this.field_R, -124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("pm.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = -5 / ((param0 + 47) / 43);
        if (GzipDecoder.field_e) {
          WidgetStyleLayer.a(2);
        }
    }

    final void j(int param0) {
        this.field_V.i(-8521);
        this.field_Q.i(-8521);
        int var2 = -123 % ((11 - param0) / 41);
    }

    private final void i(int param0) {
        TextButton var3;
        if (param0 != 0) {
          var3 = (TextButton) null;
          this.onAction(-117, (byte) 35, 73, (TextButton) null, -5);
        }
        if (FullscreenFocusCanvas.a((byte) 42) ||
          !(this.field_V.field_y.length() <= 0) &&
          !(this.field_Q.field_y.length() <= 0)) {
          hh.a(this.field_V.field_y, this.field_Q.field_y, 50);
        }
    }

    final void drawLayer(int param0, byte param1, int param2, int param3) {
        if (null != this.field_fb) {
          tj.field_e.a(this.field_fb, 20 + this.field_o + param2, this.field_z + param0 + 15, -40 + this.field_x, this.field_E, 16777215, -1, 1, 0, tj.field_e.field_G);
        }
        if (this.field_X != null) {
          SoftwareRaster.g(10 + param2, 134 + param0, this.field_x - 20, 4210752);
        }
        super.drawLayer(param0, (byte) -124, param2, param3);
        if (param1 > -99) {
          this.field_V = (EditableTextWidget) null;
        }
    }

    final String h(byte param0) {
        if (null == this.field_V.field_y) {
          return "";
        }
        if (param0 > -48) {
          field_Y = (String) null;
        }
        return this.field_V.field_y;
    }

    public final void onTextChanged(EditableTextWidget param0, byte param1) {
        try {
          if (param1 != 89) {
            this.field_Q = (EditableTextWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "pm.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void k(int param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ud var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        CipherPacketBuffer var13 = null;
        int var14 = 0;
        CipherPacketBuffer var15 = null;
        int var4Lifetime1;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = SteelSentinels.obfuscationControl;
        try {
          var13 = rf.field_d;
          var15 = var13;
          var2 = var15.readUnsignedByte((byte) -67);
          var4 = 121 / ((40 - param0) / 53);
          var3 = (ud) (uf.field_f.first(13058));
          while (var3 != null) {
            if (var3.field_t != var2) {
              var3 = (ud) (uf.field_f.next((byte) -33));
              continue;
            }
            break;
          }
          if (var3 == null) {
            LoginForm.m(81);
            return;
          }
          var4Lifetime1 = var15.readUnsignedByte((byte) -63);
          if (var4Lifetime1 != 0) {
            ReflectionCheck.field_M[0] = GrowableIntList.field_l;
            var5 = var3.field_u;
            for (var6_int = 1; var6_int < var4Lifetime1; var6_int++) {
              ReflectionCheck.field_M[var6_int] = var13.h(1);
            }
            IterableDualNodeDeque.a(-121, var4Lifetime1, var5);
            for (var6_intLifetime1 = 0; var4Lifetime1 > var6_intLifetime1; var6_intLifetime1++) {
              ArticulatedPart.a((byte) -80, var15);
              if (var6_intLifetime1 == 0) {
                var3.field_B = uf.field_h;
                var3.field_s = MarkerSlider.field_W;
                var3.field_p = VerticalScrollbar.field_Tb;
                var3.field_o = field_S;
                qf.a(field_S, var6_intLifetime1, MarkerSlider.field_W, (byte) 68, uf.field_h, VerticalScrollbar.field_Tb);
              } else {
                qf.a(field_S, var6_intLifetime1, MarkerSlider.field_W, (byte) 84, uf.field_h, VerticalScrollbar.field_Tb);
              }
            }
            ValidatedTextWidget.a(var5, (byte) 98);
            dupTemp$0 = new String[2][var5];
            var3.field_z = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][var5 * 4];
            var3.field_x = dupTemp$1;
            var7 = dupTemp$1;
            var8 = DelayedServerPacket.field_z;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = un.field_j[var9];
              var6[0][var10] = ReflectionCheck.field_M[var11];
              var7[0][4 * var10] = ok.field_d[var11];
              var7[0][1 + 4 * var10] = jm.field_r[var11];
              var7[0][var10 * 4 + 2] = ne.field_G[var11];
              var7[0][3 + var10 * 4] = Sentinel.field_T[var11];
              if (Projectile.a(107, ReflectionCheck.field_M[var11]) &&
                0 == jm.field_r[var11] + (ne.field_G[var11] + Sentinel.field_T[var11])) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = un.field_j[var9Lifetime1 + var5];
              var6[1][var14] = ReflectionCheck.field_M[var11Lifetime1];
              var7[1][4 * var14] = ok.field_d[var11Lifetime1];
              var7[1][1 + 4 * var14] = jm.field_r[var11Lifetime1];
              var7[1][2 + 4 * var14] = ne.field_G[var11Lifetime1];
              var7[1][var14 * 4 + 3] = Sentinel.field_T[var11Lifetime1];
              if (Projectile.a(47, ReflectionCheck.field_M[var11Lifetime1]) &&
                0 == Sentinel.field_T[var11Lifetime1] + ne.field_G[var11Lifetime1] + jm.field_r[var11Lifetime1]) {
                var6[1][var14] = null;
                var14--;
              }
              var14++;
              var9Lifetime1++;
            }
          }
          var3.field_r = true;
          var3.unlink(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "pm.FA(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pe var4_ref_pe = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        pe var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = SteelSentinels.obfuscationControl;
        try {
          EmailAvailabilityValidator.field_s = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = FullscreenFocusCanvas.field_h.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_pe = FullscreenFocusCanvas.field_h[var3];
            var4_ref_pe.b(32767);
            pe.a(var3, -106);
            var5 = var4_ref_pe.field_J + var4_ref_pe.field_c >> 1;
            var6 = var4_ref_pe.field_p + var4_ref_pe.field_W >> 1;
            var7 = var4_ref_pe.field_n + var4_ref_pe.field_s >> 1;
            var8 = EmailAvailabilityValidator.field_s[9] >> 2;
            var9 = EmailAvailabilityValidator.field_s[10] >> 2;
            var10_int = EmailAvailabilityValidator.field_s[11] >> 2;
            var11 = LinkButtonPainter.field_e[5] * var10_int + var8 * LinkButtonPainter.field_e[3] + LinkButtonPainter.field_e[4] * var9 >> 14;
            var12 = var8 * LinkButtonPainter.field_e[6] + LinkButtonPainter.field_e[7] * var9 + var10_int * LinkButtonPainter.field_e[8] >> 14;
            var13 = LinkButtonPainter.field_e[11] * var10_int + LinkButtonPainter.field_e[9] * var8 + LinkButtonPainter.field_e[10] * var9 >> 14;
            var2[var3] = var12 * var6 + var11 * var5 + var7 * var13 >> 16;
          }
          var3Lifetime1 = EmailAvailabilityValidator.field_s[9] >> 8;
          var4 = EmailAvailabilityValidator.field_s[10] >> 8;
          var5Lifetime1 = EmailAvailabilityValidator.field_s[11] >> 8;
          var6Lifetime1 = vn.field_h << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = jh.sine16(var6Lifetime1, 4096) >> 8;
          var9Lifetime1 = ScrollContainer.cosine16(var6Lifetime1, (byte) -84) >> 8;
          if (-1 != oh.field_f &&
            DelegatingCanvas.field_c != -1) {
            var8Lifetime1 = -DelegatingCanvas.field_c + 240;
            var9Lifetime1 = -128;
            var7Lifetime1 = oh.field_f - 320;
          }
          if (!param0) {
            field_gb = (SceneWidget) null;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 + (var13Lifetime1 * var13Lifetime1 + var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < FullscreenFocusCanvas.field_h.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < FullscreenFocusCanvas.field_h.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = FullscreenFocusCanvas.field_h[var16];
            pe.a(var16, -124);
            for (var18 = 0; 3 > var18; var18++) {
              LinkButtonPainter.field_e[var18] = LinkButtonPainter.field_e[var18] + cl.field_f[var15][var18];
            }
            NodeDeque.a(true, (byte) -128, false, LinkButtonPainter.field_e, var17, false, EmailAvailabilityValidator.field_s);
            ch.a(var9Lifetime1, var8Lifetime1, var14, -125, var12Lifetime1, var17, var7Lifetime1, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "pm.M(" + param0 + ')');
        }
    }

    final static void m(int param0) {
        int var1 = -116 / ((33 - param0) / 34);
        if (null != rb.field_h) {
          rb.field_h.close(12110);
          rb.field_h = null;
        }
    }

    static {
        field_P = "Expert Training";
        field_Y = "Change display name";
    }
}
