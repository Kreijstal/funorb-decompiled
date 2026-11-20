/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends UiContainer implements UiHotspotListener, UiActionListener, NameSuggestionTarget {
    private UiFocusableComponent field_v;
    private HotspotTextWidget field_w;
    private tga field_F;
    private tga field_A;
    private tga field_x;
    private tga field_y;
    static String field_G;
    rcb field_C;
    private tga field_D;
    private UiToggleButton field_E;
    private UiFocusableComponent field_B;
    private tga field_z;

    private final int addFieldWithHelp(int param0, String param1, int param2, String param3, int param4, UiComponent param5) {
        boolean discarded$1 = false;
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
          if (param0 > -40) {
            discarded$1 = this.submitAccountCreation(45);
          }
          stackIn_3_0 = this.addFieldWithHelp(param5, param4, param2, param3, false, 35, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("rq.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int addFieldRow(UiComponent param0, int param1, String param2, int param3, byte param4) {
        sca var6 = null;
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
          var6 = new sca(20, param1, param3 + 120, 25, param0, false, 120, 3, SetShipToShipRamDamage.field_o, 16777215, param2);
          this.addChild(-18756, var6);
          if (param4 > -27) {
            var7 = (String) null;
            this.setSuggestedName((byte) 37, (String) null);
          }
          stackIn_3_0 = var6.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("rq.R(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            return;
          }
          if (param3 == this.field_v) {
            GetGrapplingHookRopeBreakLength.e((byte) -77);
            return;
          }
          if (this.field_B != param3) {
            return;
          }
          discarded$1 = this.submitAccountCreation(param0 - 7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("rq.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean isFieldValid(int param0, lca param1) {
        eeb var3 = null;
        RuntimeException var3_ref = null;
        qrb var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(-782444220);
          if (var3 == null) {
            return true;
          }
          if (param0 != 22239) {
            return false;
          }
          var4 = var3.a((byte) 35);
          if (SetArmageddonLength.field_o == var4) {
            return false;
          }
          if (SetShieldsDirectionalArcParticleSpeedDownshift.field_p == var4) {
            return false;
          }
          if (SetTorpedoFireForce.field_p != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("rq.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_B.enabled = this.validateFields(-122);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rq.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean submitAccountCreation(int param0) {
        if (!this.validateFields(-119)) {
          return false;
        }
        int var2 = -1;
        if (param0 != 4) {
          return false;
        }
        try {
          var2 = Integer.parseInt(this.field_D.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return ku.startAccountCreation(this.field_x.text, var2, this, this.field_E.active, param0 - 3, this.field_F.text, this.field_z.text);
    }

    private final int addFieldWithStatusIcon(int param0, UiComponent param1, byte param2, String param3, int param4) {
        RuntimeException var6 = null;
        pla var7 = null;
        sca var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new sca(20, param4, param0 + 120, 25, param1, false, 120, 3, SetShipToShipRamDamage.field_o, 16777215, param3);
          this.addChild(param2 - 18860, var8);
          var7 = new pla(((lca) ((Object) param1)).a(-782444220));
          this.addChild(-18756, var7);
          if (param2 != 104) {
            field_G = (String) null;
          }
          var7.setBounds(var8.width + (var8.x + 3), 15, 15, param2 - 103, (var8.height - 15 >> 1) + var8.y);
          stackIn_3_0 = var8.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("rq.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (UiRenderer) null);
        this.field_F = new tga("", (UiListener) null, 12);
        this.field_z = new tga("", (UiListener) null, 100);
        this.field_y = new tga("", (UiListener) null, 100);
        this.field_x = new tga("", (UiListener) null, 20);
        this.field_A = new tga("", (UiListener) null, 20);
        this.field_D = new tga("", (UiListener) null, 3);
        int var1 = 1;
        this.field_E = new UiToggleButton("", (UiListener) null, var1 != 0);
        this.field_B = new UiFocusableComponent(SettingsChange.field_d, (UiListener) null);
        this.field_v = new UiFocusableComponent(SetTorpedoReload.field_p, (UiListener) null);
        this.field_F.tooltip = gna.field_m;
        this.field_z.tooltip = GetPointDefenceLaserProjectileInterceptDamage.field_s;
        this.field_y.tooltip = dj.field_a;
        this.field_x.tooltip = UiScrollPane.field_x;
        this.field_A.tooltip = SetAngularForceDownshift.field_p;
        this.field_D.tooltip = HashNoiseTextureOperation.field_j;
        this.field_E.tooltip = QuickChatCategoryLoader.field_f;
        this.field_F.a(6614, new tib(this.field_F));
        this.field_z.a(6614, new rm(this.field_z));
        this.field_y.a(6614, new bla(this.field_y, this.field_z));
        this.field_x.a(6614, new ocb(this.field_x, this.field_F, this.field_z));
        this.field_A.a(6614, new vqa(this.field_A, this.field_x));
        this.field_D.a(6614, new wgb(this.field_D));
        this.field_B.enabled = false;
        this.field_B.renderer = (UiRenderer) ((Object) new vva());
        this.field_v.renderer = (UiRenderer) ((Object) new meb());
        this.field_F.renderer = (UiRenderer) ((Object) new io(10000536));
        io dupTemp$0 = new io(10000536);
        this.field_y.renderer = (UiRenderer) ((Object) dupTemp$0);
        this.field_z.renderer = (UiRenderer) ((Object) dupTemp$0);
        this.field_D.renderer = (UiRenderer) ((Object) new io(10000536));
        this.field_E.renderer = (UiRenderer) ((Object) new dw());
        kpb dupTemp$1 = new kpb(10000536);
        this.field_A.renderer = (UiRenderer) ((Object) dupTemp$1);
        this.field_x.renderer = (UiRenderer) ((Object) dupTemp$1);
        String var2 = SetReverbGain.a(GetLaserProjectiles.field_o, new String[]{this.getLinkMarkupStart((byte) 50), this.getLinkMarkupEnd((byte) -121)}, 109);
        int var3 = 20;
        var3 = var3 + this.addFieldRow(this.field_z, var3, MissionState.field_h, 170, (byte) -42);
        var3 = var3 + (5 + this.addFieldWithHelp(this.field_y, var3, 170, qs.field_b, false, 20, ""));
        var3 = var3 + this.addFieldRow(this.field_x, var3, RequestNewestBlackboxRecording.field_q, 170, (byte) -36);
        var3 = var3 + (this.addFieldWithHelp(-41, OpenGlVertexNormal.field_e, 170, lg.field_d, var3, this.field_A) + 5);
        var3 = var3 + (5 + this.addFieldWithHelp(-103, Projectile.field_r, 170, ffb.field_c, var3, this.field_F));
        var3 = var3 + this.addFieldWithStatusIcon(170, this.field_D, (byte) 104, CarouselSystemEventFactory.field_a, var3);
        sca var4 = new sca(46, var3, -90 + this.width, 25, this.field_E, true, this.width - 120, 5, SetTorpedoProjectileLife.field_o, 11579568, UiComponent.field_m);
        this.addChild(-18756, var4);
        var3 = var3 + var4.height;
        UiTextStyle var5 = new UiTextStyle(SetShipToShipRamDamage.field_o, 0, 0, 0, 0, 16777215, -1, 0, 0, SetShipToShipRamDamage.field_o.maxAscent, -1, 2147483647, true);
        this.field_w = new HotspotTextWidget(var2, var5);
        this.field_w.tooltip = "";
        this.field_w.setHotspotTooltip(0, -1, SetBombletSprayProjectileDamage.field_q);
        this.field_w.setHotspotTooltip(1, -1, SetBombletSprayProjectileDamage.field_q);
        this.field_w.listener = (UiListener) (this);
        this.field_w.fitTextBounds(this.width - 90, var3, 46, (byte) -23);
        var3 = var3 + (15 + this.field_w.height);
        this.addChild(-18756, this.field_w);
        int var6 = 4;
        int var7 = 200;
        this.field_B.setBounds(496 - var7 >> 1, var7, 40, 1, var3);
        this.field_v.setBounds(3 + var6, 60, 40, 1, 15 + var3);
        this.field_v.listener = (UiListener) (this);
        this.field_B.listener = (UiListener) (this);
        this.addChild(-18756, this.field_B);
        this.addChild(-18756, this.field_v);
        this.field_C = new rcb((NameSuggestionTarget) (this));
        this.field_C.setBounds(60 + (this.field_F.width + this.field_F.x), -60 + (-this.field_F.width + this.width) - this.field_F.x, 150, 1, 20 + this.field_F.y);
        this.addChild(-18756, this.field_C);
        this.setBounds(0, 496, var3 + 55 + var6, 1, 0);
    }

    private final boolean validateFields(int param0) {
        if (param0 >= -57) {
          this.field_w = (HotspotTextWidget) null;
          if (!this.isFieldValid(22239, (lca) (this.field_F))) {
            return false;
          }
          if (!this.isFieldValid(22239, (lca) (this.field_z))) {
            return false;
          }
          if (!this.isFieldValid(22239, (lca) (this.field_y))) {
            return false;
          }
          if (!this.isFieldValid(22239, (lca) (this.field_x))) {
            return false;
          }
          if (!this.isFieldValid(22239, (lca) (this.field_A))) {
            return false;
          }
          if (this.isFieldValid(22239, (lca) (this.field_D))) {
            return true;
          }
          return false;
        }
        if (!this.isFieldValid(22239, (lca) (this.field_F))) {
          return false;
        }
        if (!this.isFieldValid(22239, (lca) (this.field_z))) {
          return false;
        }
        if (!this.isFieldValid(22239, (lca) (this.field_y))) {
          return false;
        }
        if (!this.isFieldValid(22239, (lca) (this.field_x))) {
          return false;
        }
        if (!this.isFieldValid(22239, (lca) (this.field_A))) {
          return false;
        }
        if (this.isFieldValid(22239, (lca) (this.field_D))) {
          return true;
        }
        return false;
    }

    private final String getLinkMarkupEnd(byte param0) {
        if (param0 >= -97) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final int addFieldWithHelp(UiComponent param0, int param1, int param2, String param3, boolean param4, int param5, String param6) {
        RuntimeException var8 = null;
        gm var9 = null;
        sca var10 = null;
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
          var10 = new sca(20, param1, 120 + param2, 25, param0, param4, 120, 3, SetShipToShipRamDamage.field_o, 16777215, param3);
          this.addChild(-18756, var10);
          var9 = new gm(((lca) ((Object) param0)).a(-782444220), param6, 126, param1 + var10.height, param2 + 50, param5);
          var9.listener = (UiListener) (this);
          this.addChild(-18756, var9);
          stackIn_1_0 = var9.height + var10.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("rq.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param2, 0);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(true, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("rq.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onHotspotClicked(int param0, int param1, int param2, HotspotTextWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 == ~param2) {
            SetReloadBarWidth.a(12, "terms.ws");
            return;
          }
          if (param2 == 1) {
            SetReloadBarWidth.a(12, "privacy.ws");
            return;
          }
          if (param2 != 2) {
            return;
          }
          SetReloadBarWidth.a(12, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("rq.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final String getLinkMarkupStart(byte param0) {
        if (param0 != 50) {
          this.field_v = (UiFocusableComponent) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void invalidateNameAvailability(int param0) {
        if (param0 != 1546) {
          return;
        }
        ((tib) (this.field_F.a(param0 ^ -782442674))).d((byte) 38);
    }

    public static void clearSharedReferences(int param0) {
        int var1 = 67 / ((-47 - param0) / 56);
        field_G = null;
    }

    public final void setSuggestedName(byte param0, String param1) {
        String var4 = null;
        tga var3 = this.field_F;
        if (param0 != 41) {
          return;
        }
        try {
          var4 = param1;
          ((UiTextField) ((Object) var3)).setText(false, 0, var4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Scamming";
    }
}
