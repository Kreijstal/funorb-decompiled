/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends WidgetContainer implements TextChangeListener, ButtonActionListener {
    private TextButton field_Q;
    private boolean field_S;
    static int field_G;
    static String field_L;
    private EditableTextField field_M;
    private TextButton field_F;
    private boolean field_O;
    private boolean field_I;
    static int field_J;
    static String field_K;
    static int field_P;
    private EditableTextField field_H;
    private TextButton field_N;
    static int field_T;
    private String field_R;

    public static void clearSharedReferences(int param0) {
        if (param0 <= 0) {
          return;
        }
        field_L = null;
        field_K = null;
    }

    public final void onTextChanged(EditableTextField param0, int param1) {
        try {
          int var3_int = -48 / ((-61 - param1) / 38);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vg.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        if (RoadStripRenderer.b(-106) ||
          !(0 >= this.field_M.text.length()) &&
          !(0 >= this.field_H.text.length())) {
          DelegatingCanvas.a(this.field_H.text, (byte) -60, this.field_M.text);
        }
        if (param0 != -23) {
          this.a(true);
        }
    }

    final static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        EntitySound var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        MovingEntity var8 = null;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        var14 = HoldTheLine.field_D;
        try {
          if (param0 != -1542826527) {
            field_K = (String) null;
          }
          var4 = (EntitySound) (FadingDialog.field_J.first((byte) 95));
          while (var4 != null) {
            if (null != var4.field_p &&
              !var4.field_p.isLinked(89)) {
              var4.unlink(0);
              var4 = (EntitySound) (FadingDialog.field_J.next((byte) -112));
              continue;
            }
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = var4.field_q;
            if (null != MusicPatch.field_i) {
              var6 = -MusicPatch.field_i.position.y + var8.position.y;
              var5 = var8.position.x - MusicPatch.field_i.position.x;
              var7 = var6 * var6 + var5 * var5;
            }
            if (var7 <= 0) {
              var3 = 256;
              var1_int = 2048;
              var2 = 8192;
            } else {
              var9 = (float)Math.sqrt((double)var7);
              var10 = -MusicPatch.field_i.velocityX + var8.velocityX;
              var11 = -MusicPatch.field_i.velocityY + var8.velocityY;
              var12 = (var11 * (float)var6 + (float)var5 * var10) / var9;
              var12 = 160.0f / (160.0f + var12);
              if (0.75f > var12) {
                var12 = 0.75f;
              }
              if (var12 > 1.25f) {
                var12 = 1.25f;
              }
              var3 = (int)(256.0f * var12);
              var1_int = 128000 / (int)var9;
              if (var1_int > 1536) {
                var1_int = 1536;
              }
              if (192 > var1_int) {
                var1_int = 192;
              }
              var13 = (float)var5 / var9;
              var2 = (int)(8192.0f * (1.0f + var13));
            }
            if (null == var4.field_p) {
              var4.field_p = CachedTextLayout.playSoundStream(var4.field_o, (byte) -68);
            }
            var4.field_p.setInternalVolume(MenuList.field_h * var4.field_n * var1_int >> 16, true);
            var4.field_p.setPan(var2, -64);
            var4.field_p.setPlaybackStep(var3, false);
            var4 = (EntitySound) (FadingDialog.field_J.next((byte) 125));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "vg.L(" + param0 + ')');
        }
    }

    final void a(int param0, String param1) {
        EditableTextField var3 = null;
        String var4 = null;
        try {
          if (param0 >= -86) {
            LoginForm.b(false);
          }
          var3 = this.field_M;
          var4 = param1;
          var3.a(false, var4, 1471);
          this.field_H.clearText(1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vg.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledField dupTemp$0 = null;
        LabeledField dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        TextButton stackIn_18_1 = null;
        TextButton stackIn_18_2 = null;
        TextButton stackIn_19_1 = null;
        TextButton stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpriteButtonRenderer var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethodPreference var9 = null;
        LabeledField var12 = null;
        LabeledField var13 = null;
        try {
          this.field_R = param1;
          stackIn_4_1 = (param3);
          this.field_O = stackIn_4_1;
          stackIn_7_1 = (param2);
          this.field_I = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_S = stackIn_10_1;
          if (this.field_I && (this.field_O ||
            this.field_S)) {
            throw new IllegalStateException();
          }
          this.field_M = (EditableTextField) ((Object) new ValidatedTextField(param0, (WidgetListener) (this), 100));
          this.field_H = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetListener) (this), 20));
          if (!this.field_I) {
            this.field_F = new TextButton(qh.field_c, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_S) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ue.field_a;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ArchiveIndex.field_i;
            }
            this.field_Q = new TextButton(stackIn_19_3, (WidgetListener) null);
            if (this.field_O) {
              this.field_N = new TextButton(fo.field_m, (WidgetListener) (this));
            }
          } else {
            this.field_F = new TextButton(CachedTextLayout.field_p, (WidgetListener) null);
            this.field_Q = new TextButton(UrlPacketDownloader.field_n, (WidgetListener) null);
            this.field_M.field_D = false;
          }
          this.field_M.renderer = (WidgetRenderer) ((Object) new TextFieldRenderer(10000536));
          this.field_H.renderer = (WidgetRenderer) ((Object) new PasswordFieldRenderer(10000536));
          var6 = new SpriteButtonRenderer();
          this.field_F.renderer = (WidgetRenderer) ((Object) var6);
          if (this.field_Q != null) {
            this.field_Q.renderer = (WidgetRenderer) ((Object) var6);
          }
          this.field_M.tooltip = Bzip2State.field_a;
          if (null != this.field_N) {
            this.field_N.renderer = (WidgetRenderer) ((Object) var6);
          }
          if (null != this.field_N) {
            this.field_N.tooltip = ml.field_b;
          }
          if (this.field_I) {
            this.field_Q.tooltip = ValidationState.field_b;
          } else {
            if (this.field_S) {
              this.field_Q.tooltip = TrackCurve.field_j;
              this.field_Q.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
            } else {
              this.field_Q.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
            }
          }
          this.y = 15;
          var7 = IntrusiveNode.field_g;
          if (this.field_R != null) {
            this.y = this.y + (var7.getParagraphHeight(this.field_R, this.width - 40, var7.ascent) + 5);
          }
          var8 = FullscreenErrorDialog.field_bb;
          var9 = CacheEntry.a(GameKeyHandler.a(110), (byte) 124);
          if (var9 == RaceVehicle.field_Wb) {
            var8 = rc.field_d;
          } else {
            if (var9 == ArcTrackBoundary.field_s) {
              var8 = co.field_c;
            }
          }
          dupTemp$0 = new LabeledField(10, this.y, -20 + this.width, 25, this.field_M, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(true, dupTemp$0);
          this.y = this.y + (((UiWidget) ((Object) var12)).height + 5);
          dupTemp$1 = new LabeledField(10, this.y, this.width - 20, 25, this.field_H, false, 80, 3, var7, 16777215, EmailValidationResult.field_f);
          var13 = dupTemp$1;
          this.a(true, dupTemp$1);
          this.field_F.listener = (WidgetListener) (this);
          this.y = this.y + (((UiWidget) ((Object) var13)).height + 5);
          if (this.field_N != null) {
            this.field_N.listener = (WidgetListener) (this);
          }
          if (null != this.field_Q) {
            this.field_Q.listener = (WidgetListener) (this);
          }
          if (this.field_N == null) {
            this.field_F.setBounds(8, (byte) 122, this.y, 30, this.width - 6 - 10);
            this.y = this.y + 35;
          } else {
            this.field_F.setBounds(85, (byte) 122, this.y, 30, this.width - 95);
            this.y = this.y + 60;
          }
          if (this.field_N != null) {
            this.field_N.setBounds(8, (byte) 122, this.y, 30, -6 + this.width - 10);
            this.y = this.y + 35;
          }
          if (this.field_Q != null) {
            if (!this.field_I &&
              !this.field_S) {
              this.field_Q.setBounds(8, (byte) 122, this.y, 20, 40);
              this.y = this.y + 25;
            } else {
              this.field_Q.setBounds(8, (byte) 122, this.y, 30, this.width - 16);
              this.y = this.y + 35;
            }
          }
          this.setBounds(0, (byte) 122, 0, this.y + 3, this.width);
          this.a(true, this.field_F);
          if (this.field_N != null) {
            this.a(true, this.field_N);
          }
          if (this.field_Q != null) {
            this.a(true, this.field_Q);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("vg.<init>(");
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static Sprite a(int param0, int param1, CourseDefinition param2, int param3) {
        int var13 = 0;
        Sprite stackIn_10_0 = null;
        Sprite stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite var6 = null;
        Sprite var7 = null;
        int var7_int = 0;
        int var8 = 0;
        wm var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        Sprite var16 = null;
        Sprite var17 = null;
        Sprite var18 = null;
        Sprite var19 = null;
        wm var9Lifetime1;
        int var8Lifetime1;
        var15 = HoldTheLine.field_D;
        try {
          var4_int = param0;
          var5 = param0 * 3 / 4;
          var19 = new Sprite(var4_int, var5);
          var6 = var19;
          if (param2.field_l != -1) {
            var16 = new Sprite(var4_int, var5);
            var6 = var16;
            vb.a(-55, var16);
            var7_int = var5 * 3 / 4;
            var8 = var7_int * 3 / 4;
            if (!param2.field_r) {
              LoadProgressDialog.field_hb.drawScaled((var4_int - var8) / 2, 3 * var5 / 16, var8, var7_int);
              var9_int = var5 / 16;
              var10 = var4_int / 2;
              var11 = -(var9_int / 4) + var4_int / 2 - var10 / 2;
              var12 = 3 * var5 / 16 - var9_int / 2;
              for (var13 = 0; var13 < var9_int; var13++) {
                var14 = var10 * param2.field_l >> 8;
                SoftwareRasterizer.drawHorizontalLine(var13 / 2 + var11, -var13 + var12, var14, 12517567);
                SoftwareRasterizer.drawHorizontalLine(var14 + var13 / 2 + var11, var12 - var13, -var14 + var10, 7274607);
              }
            } else {
              if (var5 <= 128) {
                SolidRoadStripRenderer.field_q.drawDownscaledBlended(-var5 + var4_int >> 1, 0, var5, var5);
              } else {
                SolidRoadStripRenderer.field_q.draw(-128 + var4_int >> 1, var5 - 128 >> 1);
              }
            }
            MarkerSliderRenderer.restoreRasterTarget(-1);
            stackIn_10_0 = var16;
            return stackIn_10_0;
          }
          var7 = new Sprite(640, 480);
          vb.a(param3 ^ 12341, var7);
          LabeledField.a(param1, param2, false);
          l.a(param3 ^ -17640, param2);
          if (param3 != -12392) {
            LoginForm.h(0);
          }
          for (var8Lifetime1 = -1; var8Lifetime1 <= 3; var8Lifetime1++) {
            var9 = (wm) (param2.field_m.first((byte) 97));
            while (var9 != null) {
              if (~var8Lifetime1 == ~var9.field_q) {
                var17 = var9.a((byte) -124);
                var17.draw(-(var17.width >> 1) + var9.position.x, var9.position.y - (var17.height >> 1));
              }
              var9 = (wm) (param2.field_m.next((byte) -122));
            }
            var9Lifetime1 = (wm) (param2.field_k.first((byte) 123));
            while (var9Lifetime1 != null) {
              if (var9Lifetime1.field_q == var8Lifetime1) {
                var18 = var9Lifetime1.a((byte) -121);
                var18.draw(var9Lifetime1.position.x - (var18.width >> 1), var9Lifetime1.position.y - (var18.height >> 1));
              }
              var9Lifetime1 = (wm) (param2.field_k.next((byte) 96));
            }
          }
          var19.bindRaster();
          var7.drawDownscaledThreshold(0, 0, var4_int, var5);
          MarkerSliderRenderer.restoreRasterTarget(-1);
          stackIn_27_0 = var6;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("vg.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final void j(int param0) {
        this.field_M.clearText(1);
        if (param0 != 10) {
          this.field_M = (EditableTextField) null;
        }
        this.field_H.clearText(1);
    }

    final static boolean b(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          field_L = (String) null;
        }
        stackIn_6_0 = (null != hh.field_c) && (hh.field_c.canUseAdaptiveSize(true));
        return stackIn_6_0;
    }

    final boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.c(param0, param2 + 77);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(param0, 116);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("vg.T(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String a(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (null == this.field_M.text) {
          return "";
        }
        return this.field_M.text;
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HoldTheLine.field_D;
        try {
          if (param2 != -4) {
            this.a((byte) -70);
          }
          if (param1 != this.field_F) {
            if (param1 != this.field_N) {
              if (param1 == this.field_Q) {
                if (this.field_I) {
                  StrongCacheEntry.h(-110);
                } else {
                  if (this.field_S) {
                    NodeHashTable.a((byte) 44);
                  } else {
                    hk.a(-30500);
                  }
                }
              }
            } else {
              DialogLayer.h((byte) 124);
            }
          } else {
            this.a((byte) -23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("vg.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onSubmit(byte param0, EditableTextField param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 19) {
            field_K = (String) null;
          }
          if (this.field_M == param1) {
            this.field_H.requestFocus((UiWidget) (this), -25823);
          }
          if (this.field_H == param1) {
            this.a((byte) -23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (null != this.field_R) {
          IntrusiveNode.field_g.drawParagraph(this.field_R, 20 + param2 + this.x, 15 + (param1 + this.y), this.width - 40, this.height, 16777215, -1, 1, 0, IntrusiveNode.field_g.ascent);
        }
        if (null != this.field_N) {
          SoftwareRasterizer.drawHorizontalLine(10 + param2, 134 + param1, -20 + this.width, 4210752);
        }
        super.drawLayer(param0, param1, param2, param3);
    }

    static {
        field_L = "Placing first in a race earns you <col=1>5</col> championship points; placing second, <col=1>3</col> points; third, <col=1>1</col> point.<br><br>You must finish in <col=1>first or second</col> place to qualify for the next race, otherwise you must retry the course. You can only retry <col=1>3</col> times during a championship. After completing all four races, you have finished the championship and can attempt the next one!<br><br>After playing all <col=1>four courses</col> in each championship, your total time will be added to the highscores table.";
        field_K = "Machine gun";
    }
}
