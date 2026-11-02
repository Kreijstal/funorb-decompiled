/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends UiContainer implements TextHotspotListener, ButtonListener, NameSuggestionListener {
    static SocialListPanel field_W;
    private TextButton field_U;
    static boolean field_db;
    static String field_Z;
    private ValidatedTextWidget field_cb;
    static String field_X;
    private ValidatedTextWidget field_Q;
    static RgbSprite field_R;
    private TextButton field_V;
    static RgbSprite[] field_gb;
    private ValidatedTextWidget field_eb;
    NameSuggestionsPanel field_S;
    private ValidatedTextWidget field_hb;
    static int field_T;
    private ValidatedTextWidget field_Y;
    private TextHotspotWidget field_fb;
    static String field_bb;
    private ValidatedTextWidget field_jb;
    private Checkbox field_ib;
    static String field_P;
    static String field_ab;

    private final String j(int param0) {
        if (param0 > -22) {
          this.field_jb = (ValidatedTextWidget) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean k(int param0) {
        if (!this.h((byte) 35)) {
          return false;
        }
        int var2 = param0;
        try {
          var2 = Integer.parseInt(this.field_eb.field_y);
        } catch (NumberFormatException numberFormatException) {
        }
        return rl.a(this.field_cb.field_y, this, this.field_hb.field_y, var2, this.field_Y.field_y, this.field_ib.field_T, true);
    }

    final static boolean l(int param0) {
        if (param0 != 13539) {
          AccountRegistrationPanel.i(110);
          if (!ni.b(param0 ^ 13551)) {
            return rd.field_b <= 0 ? true : false;
          }
          return true;
        }
        if (ni.b(param0 ^ 13551)) {
          return true;
        }
        if (rd.field_b > 0) {
          return false;
        }
        return true;
    }

    public final void a(int param0, String param1) {
        ValidatedTextWidget var3 = null;
        String var4 = null;
        try {
          if (param0 != 20522) {
            field_R = (RgbSprite) null;
          }
          var3 = this.field_cb;
          var4 = param1;
          ((EditableTextWidget) ((Object) var3)).setText(var4, param0 ^ 9143, false);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "vi.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_cb = new ValidatedTextWidget("", (UiListener) null, 12);
        this.field_Y = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_jb = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_hb = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_Q = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_eb = new ValidatedTextWidget("", (UiListener) null, 3);
        int var1 = 1;
        this.field_ib = new Checkbox("", (UiListener) null, var1 != 0);
        this.field_U = new TextButton(lc.field_d, (UiListener) null);
        this.field_V = new TextButton(hg.field_f, (UiListener) null);
        this.field_cb.field_v = lc.field_i;
        this.field_Y.field_v = StripedProgressBar.field_H;
        this.field_jb.field_v = PacketBuffer.field_v;
        this.field_hb.field_v = IsaacRandom.field_a;
        this.field_Q.field_v = Explosion.field_W;
        this.field_eb.field_v = wb.field_b;
        this.field_ib.field_v = SingleChildContainer.field_K;
        this.field_cb.a(true, new NameAvailabilityValidator(this.field_cb));
        this.field_Y.a(true, new ih(this.field_Y));
        this.field_jb.a(true, new EmailAvailabilityValidator(this.field_jb, this.field_Y));
        this.field_hb.a(true, new PasswordValidator(this.field_hb, this.field_cb, this.field_Y));
        this.field_Q.a(true, new MatchingTextValidator(this.field_Q, this.field_hb));
        this.field_eb.a(true, new eb(this.field_eb));
        this.field_U.field_K = false;
        this.field_U.field_p = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_V.field_p = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.field_cb.field_p = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        GradientOutlineTextPainter dupTemp$0 = new GradientOutlineTextPainter(10000536);
        this.field_jb.field_p = (WidgetPainter) ((Object) dupTemp$0);
        this.field_Y.field_p = (WidgetPainter) ((Object) dupTemp$0);
        this.field_eb.field_p = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        this.field_ib.field_p = (WidgetPainter) ((Object) new SpriteCheckboxPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.field_Q.field_p = (WidgetPainter) ((Object) dupTemp$1);
        this.field_hb.field_p = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = SocketConnector.a(te.field_e, -95, new String[]{this.j(-99), this.linkEndMarkup(170)});
        int var3 = 20;
        var3 = var3 + this.a(this.field_Y, 170, WeightedLruCache.field_i, var3, 126);
        var3 = var3 + (5 + this.a(var3, true, GrowableIntList.field_m, this.field_jb, "", 20, 170));
        var3 = var3 + this.a(this.field_hb, 170, jh.field_c, var3, 126);
        var3 = var3 + (this.a(ParticleEffect.field_N, 170, GrowableIntList.field_b, 12973, this.field_Q, var3) + 5);
        var3 = var3 + (5 + this.a(LinkButtonPainter.field_b, 170, cf.field_s, 12973, this.field_cb, var3));
        var3 = var3 + this.a(var3, false, CombatWorld.field_L, this.field_eb, 170);
        LabeledField var4 = new LabeledField(46, var3, this.field_x - 90, 25, this.field_ib, true, -120 + this.field_x, 5, SectorCacheStore.field_m, 11579568, MidiPcmStream.field_cb);
        this.addChild(var4, -125);
        var3 = var3 + var4.field_E;
        TextWidgetPainter var5 = new TextWidgetPainter(tj.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, tj.field_e.field_G, -1, 2147483647, true);
        this.field_fb = new TextHotspotWidget(var2, var5);
        this.field_fb.field_v = "";
        this.field_fb.a(ph.field_b, 0, -55);
        this.field_fb.a(ph.field_b, 1, -109);
        this.field_fb.field_A = (UiListener) (this);
        this.field_fb.a(46, var3, -90 + this.field_x, -1);
        var3 = var3 + (15 + this.field_fb.field_E);
        this.addChild(this.field_fb, -100);
        int var6 = 4;
        int var7 = 200;
        this.field_U.a(-var7 + 496 >> 1, (byte) -87, var3, var7, 40);
        this.field_V.a(3 + var6, (byte) -86, var3 + 15, 60, 40);
        this.field_V.field_A = (UiListener) (this);
        this.field_U.field_A = (UiListener) (this);
        this.addChild(this.field_U, -98);
        this.addChild(this.field_V, -126);
        this.field_S = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_S.a(60 + this.field_cb.field_x + this.field_cb.field_o, (byte) -87, this.field_cb.field_z + 20, -this.field_cb.field_x - this.field_cb.field_o + (this.field_x - 60), 150);
        this.addChild(this.field_S, -125);
        this.a(0, (byte) -80, 0, 496, var6 + 55 + var3);
    }

    private final int a(int param0, boolean param1, String param2, UiComponent param3, int param4) {
        RuntimeException var6 = null;
        ValidationIndicator var7 = null;
        LabeledField var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledField(20, param0, param4 + 120, 25, param3, param1, 120, 3, tj.field_e, 16777215, param2);
          this.addChild(var8, -83);
          var7 = new ValidationIndicator(((ValidationProvider) ((Object) param3)).a(param1));
          this.addChild(var7, -124);
          var7.a(3 + (var8.field_x + var8.field_o), (byte) -85, (var8.field_E - 15 >> 1) + var8.field_z, 15, 15);
          stackIn_1_0 = var8.field_E;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("vi.GA(").append(param0).append(',').append(param1).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean h(byte param0) {
        if (!this.a(-2, (ValidationProvider) (this.field_cb))) {
          return false;
        }
        if (!this.a(-2, (ValidationProvider) (this.field_Y))) {
          return false;
        }
        if (!this.a(-2, (ValidationProvider) (this.field_jb))) {
          return false;
        }
        if (!this.a(-2, (ValidationProvider) (this.field_hb))) {
          return false;
        }
        if (!this.a(-2, (ValidationProvider) (this.field_Q))) {
          return false;
        }
        if (!this.a(-2, (ValidationProvider) (this.field_eb))) {
          return false;
        }
        if (param0 >= 20) {
          return true;
        }
        return false;
    }

    private final int a(int param0, boolean param1, String param2, UiComponent param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        LabeledField var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new LabeledField(20, param0, param6 + 120, 25, param3, false, 120, 3, tj.field_e, 16777215, param2);
          if (!param1) {
            stackIn_2_0 = -83;
            return stackIn_2_0;
          }
          this.addChild(var10, -90);
          var9 = new ValidationHelpWidget(((ValidationProvider) ((Object) param3)).a(false), param4, 126, var10.field_E + param0, param6 + 50, param5);
          var9.field_A = (UiListener) (this);
          this.addChild(var9, -118);
          stackIn_4_0 = var10.field_E + var9.field_E;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("vi.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(String param0, int param1, String param2, int param3, UiComponent param4, int param5) {
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
          if (param3 != 12973) {
            this.field_Q = (ValidatedTextWidget) null;
          }
          stackIn_3_0 = this.a(param5, true, param0, param4, param2, 35, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("vi.EA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_gb = null;
        field_X = null;
        field_P = null;
        field_R = null;
        field_bb = null;
        if (!param0) {
          field_ab = null;
          field_Z = null;
          field_W = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        AccountRegistrationPanel.a((byte) 115, true, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null);
        field_ab = null;
        field_Z = null;
        field_W = null;
    }

    final void updateHover(int param0, int param1, UiComponent param2, int param3) {
        boolean discarded$0 = false;
        try {
          super.updateHover(param0, 95, param2, param3);
          if (param1 <= 56) {
            ValidationProvider var6 = (ValidationProvider) null;
            discarded$0 = this.a(-51, (ValidationProvider) null);
          }
          this.field_U.field_K = this.h((byte) 46);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "vi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void i(int param0) {
        try {
          Class var5 = null;
          Class var2 = null;
          if (o.field_c) {
            return;
          }
          o.field_c = true;
          Class var4 = java.awt.Toolkit.class;
          Class var1 = var4;
          try {
            AccountNoticeDialog.field_rb = var4.getMethod("createCustomCursor", new Class[]{java.awt.Image.class, java.awt.Point.class, String.class});
            int var3 = -25 / ((31 - param0) / 45);
            var5 = Class.forName("java.awt.image.BufferedImage");
            var2 = var5;
            hl.field_u = var5.getConstructor(new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
            lc.field_h = var2.getField("TYPE_INT_ARGB").getInt((Object) null);
            Bzip2State.field_u = var5.getMethod("setRGB", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE, Integer.TYPE});
          } catch (IllegalAccessException illegalAccessException) {
            AccountNoticeDialog.field_rb = null;
            return;
          } catch (ClassNotFoundException classNotFoundException) {
            AccountNoticeDialog.field_rb = null;
            return;
          } catch (NoSuchMethodException noSuchMethodException) {
            AccountNoticeDialog.field_rb = null;
            return;
          } catch (NoSuchFieldException noSuchFieldException) {
            AccountNoticeDialog.field_rb = null;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void onAction(int param0, byte param1, int param2, TextButton param3, int param4) {
        boolean discarded$1 = false;
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -17 % ((param1 + 85) / 36);
          if (param3 == this.field_V) {
            IconLabelControl.d((byte) -103);
            return;
          }
          if (this.field_U != param3) {
            return;
          }
          discarded$1 = this.k(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("vi.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean onFocusedKey(int param0, int param1, char param2, UiComponent param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onFocusedKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_7_0 = this.b(param3, 69);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.b(-11963, param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("vi.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final boolean a(int param0, ValidationProvider param1) {
        ValidationSource var3 = null;
        RuntimeException var3_ref = null;
        vd var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(false);
          if (var3 == null) {
            return true;
          }
          if (param0 != -2) {
            field_Z = (String) null;
          }
          var4 = var3.a((byte) 21);
          if (ArchiveProvider.field_d == var4) {
            return false;
          }
          if (Bzip2State.field_J == var4) {
            return false;
          }
          if (var4 != ModalStack.field_S) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("vi.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final String linkEndMarkup(int param0) {
        if (param0 != 170) {
          AccountRegistrationPanel.a(true);
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onHotspotAction(int param0, int param1, TextHotspotWidget param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (param3 < 124) {
            return;
          }
          if (param1 == 0) {
            TabbedPanel.b("terms.ws", (byte) 85);
            return;
          }
          if (param1 == 1) {
            TabbedPanel.b("privacy.ws", (byte) -39);
            return;
          }
          if (param1 != 2) {
            return;
          }
          TabbedPanel.b("conduct.ws", (byte) -49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("vi.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, ResourceArchive param2, ResourceArchive param3, ResourceArchive param4) {
        gf.field_a = sf.a("", 16);
        if (param0 != -127) {
          return;
        }
        try {
          gf.field_a.a(param0 ^ -183, false);
          ci.a(param3, (byte) 99, param4, param2);
          ik.a(true);
          DiskCacheWorker.field_j = mm.field_e;
          jn.field_b = mm.field_e;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "vi.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0) {
        boolean discarded$0 = false;
        ((NameAvailabilityValidator) (this.field_cb.a(false))).d(param0 ^ 43);
        if (param0 != 86) {
          ValidationProvider var3 = (ValidationProvider) null;
          discarded$0 = this.a(92, (ValidationProvider) null);
        }
    }

    private final int a(UiComponent param0, int param1, String param2, int param3, int param4) {
        int discarded$1 = 0;
        LabeledField var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledField(20, param3, param1 + 120, 25, param0, false, 120, 3, tj.field_e, 16777215, param2);
          this.addChild(var6, -110);
          if (param4 != 126) {
            var7 = (String) null;
            discarded$1 = this.a(120, false, (String) null, (UiComponent) null, (String) null, -28, -26);
          }
          stackIn_3_0 = var6.field_E;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("vi.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_db = false;
        field_X = "This game option is not available in rated games.";
        field_Z = "Decline invitation to <%0>'s game";
        field_bb = "Public";
        field_P = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_ab = "<%0> has dropped out.";
    }
}
