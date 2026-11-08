/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FormationView extends MatchPhaseView {
    static String field_l;
    static int field_m;
    private UiLayoutNode field_p;
    static int field_r;
    static String field_s;
    private UiLayoutNode field_k;
    static boolean[][] field_n;
    static String field_o;
    static int field_q;
    static String field_j;

    final static void b(byte param0) {
        if (null != op.field_y) {
          op.field_y.close(1);
          op.field_y = null;
        }
        if (param0 != -116) {
          field_o = (String) null;
        }
    }

    final void drawContent(int param0) {
        String stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        String var2_ref_String;
        int var2;
        int var3_int;
        String var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        var7 = Kickabout.field_G;
        this.drawPanelBackground(param0 ^ 106);
        this.drawTitle(false, tl.field_b);
        if (!this.field_a.field_C.formationConfirmed[this.field_h]) {
          if (this.field_g != -2 &&
            this.field_g == this.field_a.b((byte) -89, this.field_h)) {
            var3_int = 0;
            for (var4 = 0; var4 < this.field_a.playerCount; var4++) {
              if (~this.field_a.field_g[var4].team == ~this.field_h) {
                var3_int++;
              }
            }
            if (var3_int > 1) {
              stackIn_16_0 = MySquadScreen.field_J;
            } else {
              stackIn_16_0 = NameSuggestionsPanel.field_I;
            }
            var2_ref_String = stackIn_16_0;
          } else {
            var2_ref_String = br.field_b;
          }
        } else {
          var2_ref_String = cb.field_a;
        }
        stackIn_20_0 = (!this.isButtonEnabled(0, 50)) ? 0 : 1;
        var3_intLifetime1 = stackIn_20_0;
        var4Lifetime1 = 8 + IsSixCommand.field_C.paragraphHeight(var2_ref_String, 185, 16);
        var5 = -33 + (-var4Lifetime1 + this.buttonY(342, 0));
        stackIn_22_0 = 10 + var4Lifetime1;
        stackIn_23_1 = (var3_intLifetime1 == 0) ? 0 : 60;
        var6 = stackIn_22_0 + stackIn_23_1;
        SoftwareRasterizer.drawRoundedRectangle(390, var5, 205, var6, 10, 983040);
        SoftwareRasterizer.fillRoundedRectangleBlended(390, var5, 205, var6, 10, 65793, 140);
        IsSixCommand.field_C.a(var2_ref_String, 400, var5 + 8, 185, var6, 16777215, -1, param0, 0, 16);
        this.positionButtons(param0 - 95);
        this.drawCountdown(param0 ^ -2352, this.field_a.phaseTime);
        var2 = this.field_a.field_C.formationChoice[this.field_h];
        SoftwareRasterizer.fillRoundedRectangleBlended(220, 332, 150, 26, 8, 65793, 128);
        var3 = AuctionsHelpScreen.field_F[var2].toLowerCase();
        un.field_d.d(var3, 293, 351, 16777215, -1);
        TextLayoutLine.field_f.c(220, 100);
        for (var4Lifetime2 = 0; 4 > var4Lifetime2; var4Lifetime2++) {
          var5Lifetime1 = -(RowRangeRequest.field_f.field_o >> 1) + 147 * ws.field_b[var2][var4Lifetime2] / 896 + 220;
          var6Lifetime1 = -(RowRangeRequest.field_f.field_v >> 1) + ws.field_d[var2][var4Lifetime2] * 220 / 1344 + 100;
          RowRangeRequest.field_f.c(var5Lifetime1, var6Lifetime1);
        }
        if (this.isButtonEnabled(0, param0 + 49)) {
          this.field_k.draw(102, false);
          this.field_p.draw(param0 + 126, false);
        }
        var4Lifetime3 = 110;
        var5Lifetime2 = 230;
        if (-2 != this.field_g &&
          this.field_a.field_g[this.field_g].team == 1) {
          var6Lifetime2 = var4Lifetime3;
          var4Lifetime3 = var5Lifetime2;
          var5Lifetime2 = var6Lifetime2;
        }
        this.a(0, var4Lifetime3, (byte) -107, 30);
        this.a(1, var5Lifetime2, (byte) -78, 30);
        if (this.field_a.field_f) {
          un.field_d.a("FB", 5, 17, 16777215, -1);
        }
    }

    FormationView(CommonGame param0, int param1, boolean param2) {
        super(param0, param1, param2, new int[]{41});
        int var4_int = 0;
        int var5 = 0;
        try {
          this.field_c[0] = new MenuButton(-4, 7126504, 41);
          this.field_k = eo.a(false);
          this.field_p = eo.a(true);
          var4_int = this.field_k.field_N.field_o;
          var5 = this.field_k.field_N.field_v;
          this.field_k.field_s = -3 - var4_int + (this.buttonX(127, 0) - (this.field_c[0].width >> 1));
          this.field_k.field_J = this.buttonY(342, 0) - (var5 >> 1);
          this.field_p.field_s = 3 + this.buttonX(117, 0) + (this.field_c[0].width >> 1);
          this.field_p.field_J = this.buttonY(342, 0) - (var5 >> 1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "lr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(PlayerModelPreview.field_q);
          if (param1 >= -3) {
            field_s = (String) null;
          }
          param0.removeFocusListener(PlayerModelPreview.field_q);
          GzipDecoder.field_d = -1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "lr.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_n = (boolean[][]) null;
        field_o = null;
        if (param0 != -15640) {
          java.awt.Component var2 = (java.awt.Component) null;
          FormationView.a((java.awt.Component) null, 101);
        }
        field_j = null;
        field_l = null;
    }

    final boolean isButtonEnabled(int param0, int param1) {
        int var3;
        int var4;
        boolean stackIn_16_0 = false;
        if (this.field_g == -2) {
          return false;
        }
        var3 = this.field_a.field_g[this.field_g].team;
        if (this.field_a.b((byte) -71, this.field_a.field_g[this.field_g].team) != this.field_g) {
          return false;
        }
        if (this.field_a.field_C.formationConfirmed[var3]) {
          return false;
        }
        var4 = this.field_a.field_C.formationChoice[this.field_a.field_g[this.field_g].team];
        if (param1 != 50) {
          field_s = (String) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (1 != param0 ||
          var4 != 0) {
          if (param0 != 2) {
            return true;
          }
          if (var4 != ws.field_b.length - 1) {
            stackIn_16_0 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_16_0 = false;
        }
        return stackIn_16_0;
    }

    final void update(int param0, boolean param1) {
        if (param0 >= -92) {
          this.buttonY(-63, 11);
        }
        super.update(-124, param1);
        if (-2 != this.field_g) {
          this.field_k.field_lb = this.isButtonEnabled(1, 50);
          this.field_p.field_lb = this.isButtonEnabled(2, 50);
          this.field_k.updateInput(0, param1);
          this.field_p.updateInput(0, param1);
          if (this.field_k.field_sb != 0) {
            kj.a((byte) -121);
            this.g(8, 0);
          }
          if (this.field_p.field_sb != 0) {
            kj.a((byte) 49);
            this.g(8, 1);
          }
        }
    }

    private final void g(int param0, int param1) {
        this.field_a.enqueueEvent(SquadGridWidget.createFormationEvent(param1, this.field_g, (byte) 0), param0 ^ -127);
        if (this.field_f) {
          or.field_d.b(73, (byte) 112);
          or.field_d.writeByte(param0 ^ 96, param1);
        }
        if (param0 != 8) {
          this.isButtonEnabled(29, 11);
        }
    }

    final int buttonY(int param0, int param1) {
        if (param0 != 342) {
          field_n = (boolean[][]) null;
        }
        return 224;
    }

    final int buttonX(int param0, int param1) {
        if (param0 <= 106) {
          this.field_p = (UiLayoutNode) null;
        }
        return 493;
    }

    final void onButtonClick(int param0, int param1) {
        if (param0 <= 98) {
          return;
        }
        if (param1 == 41) {
          this.g(8, 2);
        }
    }

    static {
        field_l = "won";
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_n = new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, true}, new boolean[]{false, true}, new boolean[]{false, true}};
        field_s = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_j = "beach";
    }
}
