/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPanel extends DequeWidgetContainer implements TextFieldListener, WidgetActivationListener {
    static String field_D;
    private InteractiveWidget field_G;
    private EditableTextField field_J;
    static int field_L;
    private EditableTextField field_z;
    static java.awt.Frame field_F;
    private String field_B;
    private boolean field_E;
    private boolean field_A;
    private InteractiveWidget field_M;
    static am field_N;
    private boolean field_C;
    private InteractiveWidget field_H;
    static int field_I;

    public final void onTextChanged(EditableTextField param0, int param1) {
        try {
          if (param1 != -29513) {
            this.getAccountIdentifier(-105);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "vk.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setAccountAndClearPassword(String param0, byte param1) {
        EditableTextField var3 = null;
        String var4 = null;
        if (param1 <= 50) {
          return;
        }
        try {
          var3 = this.field_J;
          var4 = param0;
          var3.setText(false, -84, var4);
          this.field_z.clearText(-119);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "vk.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void submitLogin(boolean param0) {
        if (param0) {
          return;
        }
        if (MatchingFieldValidator.b(param0) ||
          !(0 >= this.field_J.field_o.length()) &&
          !(this.field_z.field_o.length() <= 0)) {
          mh.a((byte) 1, this.field_J.field_o, this.field_z.field_o);
        }
    }

    final void drawWidget(int param0, byte param1, int param2, int param3) {
        if (null != this.field_B) {
          ai.field_h.drawParagraph(this.field_B, 20 + (param2 + this.field_r), 15 + param0 + this.field_j, -40 + this.field_g, this.field_f, 16777215, -1, 1, 0, ai.field_h.field_o);
        }
        if (null != this.field_H) {
          SoftwareRasterizer.drawHorizontalLine(10 + param2, 134 + param0, this.field_g - 20, 4210752);
        }
        if (param1 <= -12) {
          super.drawWidget(param0, (byte) -71, param2, param3);
          return;
        }
    }

    public final void onWidgetActivated(byte param0, int param1, int param2, int param3, InteractiveWidget param4) {
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        var7 = CrazyCrystals.field_B;
        try {
          if (this.field_M != param4) {
            if (this.field_H == param4) {
              GzipDecompressor.a((byte) 63);
            } else {
              if (this.field_G == param4) {
                if (this.field_E) {
                  cb.e((byte) 125);
                } else {
                  if (!this.field_A) {
                    MidiPcmStream.f(-11142);
                  } else {
                    ba.c((byte) 93);
                  }
                }
              }
            }
          } else {
            this.submitLogin(false);
          }
          var6_int = 109 / ((83 - param0) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vk.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 != -40) {
          field_N = (am) null;
        }
        String var4 = (String) null;
        fa.a(param1, param2, (String) null, true);
    }

    final String getAccountIdentifier(int param0) {
        if (param0 != -1) {
          LoginPanel.releaseDeclaredStaticReferences(-27);
        }
        if (null == this.field_J.field_o) {
          return "";
        }
        return this.field_J.field_o;
    }

    final static void j(int param0) {
        m dupTemp$0 = null;
        m dupTemp$1 = null;
        int var1;
        re var2;
        Object var3;
        int var4;
        int var5;
        String var6;
        var5 = CrazyCrystals.field_B;
        DebouncedFieldValidator.field_a = null;
        var1 = q.field_a[2].field_i;
        var6 = (String) null;
        um.a(0, (String) null, (byte) 118);
        StandardContentDialog.field_db.b((byte) -107);
        field_N.b((byte) 64);
        fp.field_c.b((byte) 111);
        aa.field_a.b((byte) -126);
        oe.field_a = null;
        q.field_a = null;
        if (ModalDialog.field_D != null) {
          ModalDialog.field_D.disposeResultScene(-1);
          ModalDialog.field_D = null;
        }
        cn.field_d = null;
        ConfirmedEmailAvailabilityValidator.field_l = null;
        vh.field_a = false;
        tm.field_d = (PuzzleTile[][]) null;
        bq.field_i = null;
        LevelLostScene.field_m = false;
        gm.field_c = null;
        td.field_c = null;
        qh.field_o = null;
        var2 = new re();
        if (go.field_i) {
          uo.field_o = uo.field_o + 1;
        } else {
          fn.field_j = TextLineMetrics.field_c;
          wd.field_j = df.field_c;
          mb.field_g = field_I;
          ArchiveNetworkClient.field_l = AccountNameAvailabilityValidator.field_k;
        }
        MouseInputHandler.field_b = (ue) ((Object) var2);
        var3 = null;
        var4 = uo.field_o;
        fn.field_j = fn.field_j + var4;
        if (param0 <= 4) {
          LoginPanel.j(-59);
        }
        if (FrameTimer.field_b[CrystalTile.field_o] >= uo.field_o) {
          if (var1 > 0 &&
            CrystalTile.field_o == 1) {
            wd.a(-111, 65535, uo.field_o - 1, MusicPatch.field_h, var1, 70, 0);
            dupTemp$0 = new m(var2, 8, MusicPatchEnvelope.field_h, 0, 70, true);
            var3 = dupTemp$0;
            MouseInputHandler.field_b = (ue) ((Object) dupTemp$0);
          }
          if (0 < var1 &&
            4 == CrystalTile.field_o) {
            wd.a(-77, 65534, -1 + uo.field_o, MusicPatch.field_h, var1, 25, 1);
            dupTemp$1 = new m(var2, 9, fq.field_G, 1, 25, true);
            var3 = dupTemp$1;
            MouseInputHandler.field_b = (ue) ((Object) dupTemp$1);
          }
        }
        if (rc.a(-116) &&
          uo.field_o > 0 &&
          uo.field_o <= FrameTimer.field_b[CrystalTile.field_o]) {
          MouseInputHandler.field_b = (ue) ((Object) new nc((m) (var3), var2));
        } else {
          if (0 != InteractiveWidget.field_y) {
            MouseInputHandler.field_b = (ue) ((Object) new vn((m) (var3), var2, true));
          } else {
            if (mo.field_l == 0 &&
              uo.field_o > MusicPatch.field_h) {
              MouseInputHandler.field_b = (ue) ((Object) new rb(var2, true));
            }
          }
        }
        rc.field_a = null;
    }

    LoginPanel(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledWidgetContainer dupTemp$0 = null;
        LabeledWidgetContainer dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        InteractiveWidget stackIn_17_1 = null;
        InteractiveWidget stackIn_17_2 = null;
        InteractiveWidget stackIn_18_1 = null;
        InteractiveWidget stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        mb var9 = null;
        LabeledWidgetContainer var12 = null;
        LabeledWidgetContainer var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_C = stackIn_4_1;
          this.field_B = param1;
          stackIn_7_1 = (param2);
          this.field_E = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_A = stackIn_10_1;
          if (this.field_E && (this.field_C ||
            this.field_A)) {
            throw new IllegalStateException();
          }
          this.field_J = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetEventListener) (this), 100));
          this.field_z = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) (this), 20));
          if (this.field_E) {
            this.field_M = new InteractiveWidget(ba.field_l, (WidgetEventListener) null);
            this.field_G = new InteractiveWidget(dn.field_c, (WidgetEventListener) null);
            this.field_J.field_x = false;
          } else {
            this.field_M = new InteractiveWidget(e.field_b, (WidgetEventListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_A) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ip.field_b;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = cf.field_h;
            }
            this.field_G = new InteractiveWidget(stackIn_18_3, (WidgetEventListener) null);
            if (this.field_C) {
              this.field_H = new InteractiveWidget(LaserTraceCursor.field_d, (WidgetEventListener) (this));
            }
          }
          this.field_J.field_i = (WidgetRenderer) ((Object) new wc(10000536));
          this.field_z.field_i = (WidgetRenderer) ((Object) new aq(10000536));
          var6 = new ve();
          this.field_M.field_i = (WidgetRenderer) ((Object) var6);
          if (this.field_G != null) {
            this.field_G.field_i = (WidgetRenderer) ((Object) var6);
          }
          if (this.field_H != null) {
            this.field_H.field_i = (WidgetRenderer) ((Object) var6);
          }
          this.field_J.field_t = tm.field_c;
          if (this.field_H != null) {
            this.field_H.field_t = GameCanvas.field_c;
          }
          if (!this.field_E) {
            if (!this.field_A) {
              this.field_G.field_i = (WidgetRenderer) ((Object) new ok());
            } else {
              this.field_G.field_t = CipherPacketBuffer.field_o;
              this.field_G.field_i = (WidgetRenderer) ((Object) new ok());
            }
          } else {
            this.field_G.field_t = sl.field_n;
          }
          this.field_j = 15;
          var7 = ai.field_h;
          if (this.field_B != null) {
            this.field_j = this.field_j + (5 + var7.textHeight(this.field_B, -40 + this.field_g, var7.field_o));
          }
          var8 = ee.field_q;
          var9 = ua.a(-11662, le.b((byte) -20));
          if (var9 != gg.field_d) {
            if (var9 == wp.field_c) {
              var8 = to.field_e;
            }
          } else {
            var8 = ce.field_bb;
          }
          dupTemp$0 = new LabeledWidgetContainer(10, this.field_j, -20 + this.field_g, 25, this.field_J, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, 16);
          this.field_j = this.field_j + (((UiWidget) ((Object) var12)).field_f + 5);
          dupTemp$1 = new LabeledWidgetContainer(10, this.field_j, -20 + this.field_g, 25, this.field_z, false, 80, 3, var7, 16777215, fh.field_h);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, -127);
          this.field_M.field_l = (WidgetEventListener) (this);
          this.field_j = this.field_j + (5 + ((UiWidget) ((Object) var13)).field_f);
          if (this.field_H != null) {
            this.field_H.field_l = (WidgetEventListener) (this);
          }
          if (null != this.field_G) {
            this.field_G.field_l = (WidgetEventListener) (this);
          }
          if (this.field_H != null) {
            this.field_M.setBounds(30, 85, this.field_j, -95 + this.field_g, (byte) -52);
            this.field_j = this.field_j + 60;
          } else {
            this.field_M.setBounds(30, 8, this.field_j, -6 + (this.field_g - 10), (byte) -52);
            this.field_j = this.field_j + 35;
          }
          if (this.field_H != null) {
            this.field_H.setBounds(30, 8, this.field_j, -10 + (this.field_g - 6), (byte) -52);
            this.field_j = this.field_j + 35;
          }
          if (null != this.field_G) {
            if (!this.field_E &&
              !this.field_A) {
              this.field_G.setBounds(20, 8, this.field_j, 40, (byte) -52);
              this.field_j = this.field_j + 25;
            } else {
              this.field_G.setBounds(30, 8, this.field_j, this.field_g - 6 - 10, (byte) -52);
              this.field_j = this.field_j + 35;
            }
          }
          this.setBounds(3 + this.field_j, 0, 0, this.field_g, (byte) -52);
          this.addChild(this.field_M, 108);
          if (this.field_H != null) {
            this.addChild(this.field_H, 45);
          }
          if (null != this.field_G) {
            this.addChild(this.field_G, 34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("vk.<init>(");
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
          throw dn.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiWidget param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1 + 0, param2, param3)) {
            return true;
          }
          if (param1 != 19279) {
            this.field_G = (InteractiveWidget) null;
          }
          if (param0 == 98) {
            stackIn_8_0 = this.focusPreviousChild((byte) -117, param2);
            return stackIn_8_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(param2, param1 ^ -11898);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("vk.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void clearCredentials(byte param0) {
        this.field_J.clearText(-100);
        if (param0 <= 45) {
          EditableTextField var3 = (EditableTextField) null;
          this.onTextChanged((EditableTextField) null, 105);
        }
        this.field_z.clearText(-108);
    }

    public final void onTextSubmitted(int param0, EditableTextField param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 3 / ((param0 + 20) / 46);
          if (param1 == this.field_J) {
            this.field_z.takeFocus(true, (UiWidget) (this));
          }
          if (this.field_z == param1) {
            this.submitLogin(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vk.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_D = null;
        field_N = null;
        if (param0 >= -21) {
          LoginPanel.releaseDeclaredStaticReferences(-33);
        }
        field_F = null;
    }

    static {
        field_D = "OFF";
    }
}
