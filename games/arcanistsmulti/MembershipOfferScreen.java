/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MembershipOfferScreen {
    static SceneWidget field_f;
    static String field_m;
    static Sprite field_o;
    private int field_p;
    private String field_j;
    private int field_n;
    private Sprite field_k;
    static SceneWidget field_q;
    static int field_r;
    private int field_l;
    static String field_b;
    private int field_c;
    private int field_u;
    private boolean field_h;
    static SceneWidget field_t;
    private String[] field_a;
    private Sprite field_e;
    private int field_s;
    private Sprite field_g;
    private IndexedSprite[] field_i;
    private so field_d;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          int[] var2 = (int[]) null;
          MembershipOfferScreen.a(91, (int[]) null, -18, -89, -119, 34, 118);
        }
        field_m = null;
        field_o = null;
        field_t = null;
        field_b = null;
        field_f = null;
        field_q = null;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          NumericDateInputWidget.field_L[param3] = param1;
          lm.field_e[param3] = param6;
          eo.field_b[param3] = param5;
          if (param2 != 0) {
            BitmapFont var8 = (BitmapFont) null;
            MembershipOfferScreen.splitIntoTwoLines((String[]) null, (String) null, -76, (BitmapFont) null, 57);
          }
          DualLinkDeque.field_f[param3] = param4;
          ValidationHelpWidget.field_U[param3] = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "hf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final int updateOffer(byte param0) {
        if (param0 >= -61) {
          this.field_i = (IndexedSprite[]) null;
        }
        this.field_d.a((byte) -76);
        if (this.field_d.b(true)) {
          if (this.field_d.field_h == 0) {
            this.openMembershipPage(127);
            return 3;
          }
          if (this.field_d.field_h == 1) {
            return 1;
          }
        }
        if (IntrusiveDeque.field_d == 13) {
          return 1;
        }
        return 0;
    }

    final static boolean isTypeableCharacter(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = IntrusiveDequeCursor.field_a;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (~var4 != ~param0) {
                var3++;
                continue;
              }
              return true;
            }
          }
          var2_int = -85 / ((21 - param1) / 39);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2_ref), "hf.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        wh.field_g = false;
        AlternateUsernameCredentials.field_p = UiContainer.field_z.readUnsignedByte((byte) 88) == 0 ? true : false;
        if (param0 < 15) {
          MembershipOfferScreen.releaseStatics(true);
        }
    }

    private final void drawGradientParagraph(int param0, int param1, int param2, BitmapFont param3, String param4, int param5, int[] param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          ec.pushClipState(65280);
          for (var9_int = param7; var9_int < param0; var9_int++) {
            SoftwareRasterizer.setClip(param2, var9_int, param1, 1 + var9_int);
            var10 = var9_int * param6.length / param0;
            var11 = param6[-var10 + param6.length - 1];
            param3.drawParagraph(param4, param2, param7, param1, param0, var11, -1, 1, 1, 0);
          }
          oo.popClipState(-15405);
          if (param5 != 23146) {
            this.field_u = 61;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("hf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(')').toString());
        }
    }

    final void drawBackground(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        SoftwareRasterizer.fillVerticalGradient(9, 9, 622, 47, 4540749, 65793);
        SoftwareRasterizer.fillRectangle(9, 257, 622, 33, 2585);
        SoftwareRasterizer.fillVerticalGradient(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        while (var2 < 4) {
          SoftwareRasterizer.fillVerticalGradient(var3, 331, 117, 90, 460551, 3881787);
          var2++;
          var3 += 121;
        }
        var2Lifetime1 = 0;
        var3Lifetime1 = 299;
        while (var2Lifetime1 < 2) {
          SoftwareRasterizer.fillVerticalGradient(508, var3Lifetime1, 127, 42, 1130115, 3365268);
          SoftwareRasterizer.fillRectangle(508, 42 + var3Lifetime1, 127, 42, 12410);
          var3Lifetime1 += 91;
          var2Lifetime1++;
        }
        this.drawPage((byte) -101);
        if (null != EmailLoginCredentials.field_o &&
          EmailLoginCredentials.field_o.ensureIndex(-10923) &&
          EmailLoginCredentials.field_o.isGroupAvailableByName("members_expansion_screen", -24417) &&
          EmailLoginCredentials.field_o.isGroupAvailableByName("arialish12", -24417) &&
          EmailLoginCredentials.field_o.isGroupAvailableByName("pump32", -24417) &&
          bb.field_a != null &&
          bb.field_a.ensureIndex(-10923) &&
          bb.field_a.isGroupAvailableByName("arialish12", -24417) &&
          bb.field_a.isGroupAvailableByName("pump32", -24417)) {
          SectorCacheStore.field_j = af.loadIndexedSpriteByName("frame", "members_expansion_screen", 19412, EmailLoginCredentials.field_o);
          SocialListEntry.field_Ib = fj.loadSprite("members_expansion_screen", -22612, EmailLoginCredentials.field_o, "arrow");
          NameSuggestionsPanel.field_F = LoadingTracker.loadBinaryFont(bb.field_a, -24755, "arialish12", "", EmailLoginCredentials.field_o);
          fd.field_b = WhirlpoolHasher.loadCoverageFont("", bb.field_a, "pump32", -119, EmailLoginCredentials.field_o);
          fd.field_f = SocialListEntry.a("benefit_orbs", (byte) 113, EmailLoginCredentials.field_o, "members_expansion_screen");
          qf.field_b = SocialListEntry.a("button_text", (byte) 116, EmailLoginCredentials.field_o, "members_expansion_screen");
          KeyboardInputHandler.field_c = IconTextSceneWidget.loadSpritesByName((byte) 31, EmailLoginCredentials.field_o, "button_highlights", "members_expansion_screen");
          EmailLoginCredentials.field_o = null;
          bb.field_a = null;
        }
        this.buildHeaderSprite(16180917);
        if (null == SectorCacheStore.field_j) {
          return;
        }
        this.field_e.drawTransparent(376, 339);
        this.field_k.drawTransparent(9, 9);
        SectorCacheStore.field_j.draw(0, 0);
        if (SocialListEntry.field_Ib != null) {
          SocialListEntry.field_Ib.drawTransparent(9, 257);
          SocialListEntry.field_Ib.drawHorizontalFlip(558, 257);
          if (MenuButtonPanel.field_I > 257 &&
            290 > MenuButtonPanel.field_I) {
            var2Lifetime2 = 40 + (40 * FrameClock.sinTable(this.field_p << 4, -52) >> 16);
            if (var2Lifetime2 > 0) {
              if (EmailLoginCredentials.field_g > 9 &&
                EmailLoginCredentials.field_g < 82) {
                SocialListEntry.field_Ib.drawAdditive(8, 256, var2Lifetime2);
                SocialListEntry.field_Ib.drawAdditive(10, 256, var2Lifetime2);
                SocialListEntry.field_Ib.drawAdditive(8, 258, var2Lifetime2);
                SocialListEntry.field_Ib.drawAdditive(10, 258, var2Lifetime2);
              } else {
                if (EmailLoginCredentials.field_g > 558 &&
                  631 > EmailLoginCredentials.field_g) {
                  SocialListEntry.field_Ib.flipHorizontally();
                  SocialListEntry.field_Ib.drawAdditive(557, 256, var2Lifetime2);
                  SocialListEntry.field_Ib.drawAdditive(559, 256, var2Lifetime2);
                  SocialListEntry.field_Ib.drawAdditive(557, 258, var2Lifetime2);
                  SocialListEntry.field_Ib.drawAdditive(559, 258, var2Lifetime2);
                  SocialListEntry.field_Ib.flipHorizontally();
                }
              }
            }
          }
        }
        var2Lifetime3 = 89 % ((-46 - param0) / 43);
        this.field_g.drawTransparent(16, 302);
        NameSuggestionsPanel.field_F.drawParagraph(this.field_a[this.field_l], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
        fd.field_f.drawTransparent(30, 330);
        NameSuggestionsPanel.field_F.drawParagraph(nf.field_qb[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
        NameSuggestionsPanel.field_F.drawParagraph(nf.field_qb[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
        NameSuggestionsPanel.field_F.drawParagraph(nf.field_qb[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
        qf.field_b.drawTransparent(508 + (127 - qf.field_b.field_n) / 2, 315);
        if (0 != this.field_d.field_h) {
          if (this.field_d.field_h == 1) {
            KeyboardInputHandler.field_c[1].drawTransparent(508, 387);
          }
        } else {
          KeyboardInputHandler.field_c[0].drawTransparent(508, 299);
        }
    }

    final static String a(String param0, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        wa var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param0);
          if (!IntrusiveDeque.isValidDisplayNameText(var8, 0)) {
            stackIn_2_0 = fn.field_h;
            return stackIn_2_0;
          }
          if (SpriteState.field_t != 2) {
            stackIn_5_0 = rk.field_L;
            return stackIn_5_0;
          }
          var7 = mf.a(-1, param1);
          if (var7 == null) {
            stackIn_9_0 = CachedArchiveProvider.formatTemplate(param3 ^ 10068676, new String[]{param1}, BufferedSocket.field_f);
            return stackIn_9_0;
          }
          var7.unlink(true);
          var7.unlinkSecondary((byte) 88);
          pc.field_b = pc.field_b - 1;
          var5 = he.field_e;
          var5.writeOpcode((byte) -50, param2);
          var5.position = var5.position + 1;
          var6 = var5.position;
          var5.writeByte(3, (byte) -99);
          if (param3 != 10068666) {
            field_t = (SceneWidget) null;
          }
          var5.writeString(param0, 23333);
          var5.writeByteLengthAtMark(-var6 + var5.position, (byte) 43);
          stackIn_13_0 = null;
          return (String) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("hf.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void openMembershipPage(int param0) {
        if (param0 != 127) {
          return;
        }
        try {
          ko.openSubscribePage(IconButtonPainter.getApplet(124), (byte) -108);
        } catch (Exception exception) {
          exception.printStackTrace();
        }
    }

    private final void initialize(IndexedSprite[] param0, int param1, String param2, java.applet.Applet param3, boolean param4, String[] param5) {
        String var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          var7 = param3.getParameter("currency");
          if (var7 != null &&
            fi.isDecimalInteger((CharSequence) ((Object) var7), 10)) {
            this.field_u = GameAppletShell.a((CharSequence) ((Object) var7), 126);
          } else {
            this.field_u = 2;
          }
          this.field_j = param2;
          this.field_d = new so(2);
          this.field_i = param0;
          this.field_a = param5;
          if (param1 >= -99) {
            this.field_h = false;
          }
          if (null != this.field_i &&
            3 <= this.field_i.length) {
            ViewportController.field_t = param4;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("hf.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void buildHeaderSprite(int param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var15 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var9 = null;
        Sprite var5 = null;
        String var6 = null;
        String var7 = null;
        if (this.field_k == null) {
          if (fd.field_b == null) {
            return;
          }
          this.field_k = new Sprite(622, 47);
          fk.setSpriteRasterTarget(this.field_k, -23095);
          SoftwareRasterizer.fillVerticalGradient(0, 0, 622, 47, 4540749, 65793);
          var2 = 16448250;
          var3 = 10068666;
          var15 = BoundedRandomAccessFile.buildPaletteRamp(var3, var2, param0 ^ 16128330);
          this.drawGradientParagraph(47, 622, 0, fd.field_b, this.field_j, 23146, var15, 0);
          oo.popClipState(-15405);
          this.field_g = new Sprite(475, 24);
          this.drawScaledCaption(this.field_g, 0.75f, 0, 127, 24, var15, -4, fd.field_b, MenuButtonPainter.field_r, 475);
          var13 = BoundedRandomAccessFile.buildPaletteRamp(526344, 526344, 65535);
          var11 = var13;
          var9 = var11;
          var5 = new Sprite(121, 122);
          fk.setSpriteRasterTarget(var5, param0 ^ -16170116);
          SoftwareRasterizer.fillVerticalGradient(0, 0, var5.field_q, var5.field_y / 2, param0, 16306250);
          SoftwareRasterizer.fillVerticalGradient(0, var5.field_y / 2, var5.field_q, var5.field_y, 16306250, 15568919);
          var6 = WidgetStyleLayer.field_l;
          var7 = ph.field_b;
          this.drawScaledCaption(var5, 0.5f, 0, 127, var5.field_y, var13, -16, fd.field_b, var6, var5.field_q);
          this.drawScaledCaption(var5, 0.5f, 0, 127, var5.field_y, var13, 20, fd.field_b, var7, var5.field_q);
          this.drawScaledCaption(var5, 0.699999988079071f, 0, 127, var5.field_y / 3, var9, 12 + (var5.field_y / 2 - fd.field_b.field_C), fd.field_b, Js5ArchiveManager.field_f[this.field_u], var5.field_q);
          oo.popClipState(-15405);
          this.field_e = new Sprite(121, 122);
          fk.setSpriteRasterTarget(this.field_e, param0 - 16204012);
          var5.drawCenteredRotatedScaledBilinear(this.field_e.field_q / 2, this.field_e.field_y / 2, -2048, 4096);
          oo.popClipState(param0 - 16196322);
          return;
        }
    }

    private final void drawScaledCaption(Sprite param0, float param1, int param2, int param3, int param4, int[] param5, int param6, BitmapFont param7, String param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        Sprite var13 = null;
        try {
          var11_int = (int)((float)param9 / param1);
          var12 = (int)((float)param4 / param1);
          if (param3 != 127) {
            return;
          }
          var13 = new Sprite(var11_int, var12);
          fk.setSpriteRasterTarget(var13, -23095);
          param0.drawScaled((int)((float)(-param2) / param1), (int)((float)(-param6) / param1), (int)((float)param0.field_q / param1), (int)((float)param0.field_y / param1));
          this.drawGradientParagraph(var12, var11_int, 0, param7, param8, param3 ^ 23061, param5, 0);
          oo.popClipState(param3 - 15532);
          fk.setSpriteRasterTarget(param0, -23095);
          var13.drawScaledAveraged(param2, param6, param9, param4);
          oo.popClipState(param3 ^ -15444);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("hf.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param8 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param9).append(')').toString());
        }
    }

    private final void drawPage(byte param0) {
        IndexedSprite var2;
        int var3;
        int var4;
        int var5;
        IndexedSprite var6;
        IndexedSprite var7;
        IndexedSprite var2Lifetime1;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_i) {
          if (NameSuggestionsPanel.field_F != null) {
            NameSuggestionsPanel.field_F.drawParagraph(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
          return;
        }
        if (param0 != -101) {
          this.advanceAnimation(true, false);
        }
        var6 = this.field_i[this.field_l];
        var2 = var6;
        if (var2 != null) {
          var6.draw(9, 58);
        } else {
          if (null != NameSuggestionsPanel.field_F) {
            NameSuggestionsPanel.field_F.drawParagraph(hn.field_l, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
        }
        if (vf.field_o > this.field_s) {
          var7 = this.field_i[this.field_n];
          var2Lifetime1 = var7;
          if (var2Lifetime1 != null) {
            var3 = (60 + var7.field_g) * this.field_s / vf.field_o;
            var4 = var3 - 30;
            if (!this.field_h) {
              td.a(-256 * var4 / 30, (byte) -115, (-var4 + var7.field_g) * 256 / 30, var7, 9, 58);
            } else {
              td.a(256 * (-var4 + var7.field_g) / 30, (byte) 70, var4 * -256 / 30, var7, 9, 58);
            }
          }
        }
        return;
    }

    final int advanceAnimation(boolean param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_c = this.field_c + 65536;
        if (!param1) {
          return -60;
        }
        while (65536 <= MidiPcmStream.a(vf.field_q, (byte) 96, this.field_c)) {
          this.field_p = this.field_p + 1;
          this.field_c = this.field_c - vf.field_q;
        }
        var3 = -1;
        if (this.field_i != null) {
          var3 = this.field_i.length;
        }
        if (-1 != var3) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_s < vf.field_m) {
            this.field_s = this.field_s + 1;
            if (this.field_s > vf.field_o) {
              if (this.field_i != null &&
                this.field_i[this.field_l] != null) {
                if ((!(this.field_s < vf.field_m)) &&
                  ((this.field_i[(this.field_l + 1) % var3] == null))) {
                  this.field_s = this.field_s - 1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_s = this.field_s - 1;
              }
            } else {
              if (this.field_s >= vf.field_m &&
                this.field_i[(this.field_l + 1) % var3] == null) {
                this.field_s = this.field_s - 1;
              }
            }
          }
          if (vf.field_m <= this.field_s) {
            this.field_n = this.field_l;
            if (!this.field_h) {
              this.field_l = this.field_l - 1;
              if (this.field_l < 0) {
                this.field_l = this.field_l + var3;
              }
            } else {
              this.field_l = this.field_l + 1;
              if (var3 <= this.field_l) {
                this.field_l = this.field_l - var3;
              }
            }
            this.field_s = this.field_s - vf.field_m;
          }
          if (this.field_s > vf.field_o) {
            this.field_h = true;
          }
        }
        if (SocialListEntry.field_Ib != null) {
          var4 = 0;
          if (re.field_r != 0 &&
            ja.field_s > 257 &&
            290 > ja.field_s) {
            if (pb.field_h > 9 &&
              82 > pb.field_h) {
              var4 = 1;
              this.field_h = false;
              this.field_s = vf.field_m;
            }
            if (558 < pb.field_h &&
              pb.field_h < 631) {
              this.field_h = true;
              this.field_s = vf.field_m;
              var4 = 1;
            }
          }
          if (var4 == 0 &&
            vf.field_o < this.field_s &&
            ja.field_s > 257 &&
            ja.field_s < 290) {
            if (EmailLoginCredentials.field_g > 9 &&
              82 > EmailLoginCredentials.field_g) {
              this.field_s = vf.field_o;
            }
            if (558 < EmailLoginCredentials.field_g &&
              EmailLoginCredentials.field_g < 631) {
              this.field_s = vf.field_o;
            }
          }
        }
        if (param0) {
          this.field_d.a(this.hitTestButtons(EmailLoginCredentials.field_g, 112, MenuButtonPanel.field_I), this.hitTestButtons(pb.field_h, 76, ja.field_s), -97);
          var4Lifetime1 = 0;
          if (this.field_d.b(true)) {
            if (this.field_d.field_h == 0) {
              var4Lifetime1 = 1;
            }
            if (this.field_d.field_h == 1) {
              return 2;
            }
          }
          if (ViewportController.field_t) {
            while (BevelTextPainter.pollKeyEvent(false)) {
              var5 = this.updateOffer((byte) -73);
              if (0 == var5) {
                continue;
              }
              return var5;
            }
          }
          if (var4Lifetime1 != 0) {
            this.openMembershipPage(127);
            return 3;
          }
        }
        return 0;
    }

    private final int hitTestButtons(int param0, int param1, int param2) {
        if (SectorCacheStore.field_j == null) {
          return -1;
        }
        if (param1 <= 72) {
          this.field_j = (String) null;
        }
        if (param0 >= 508 &&
          635 > param0 &&
          param2 >= 299 &&
          386 > param2) {
          return 0;
        }
        if (param0 >= 508 &&
          param0 < 635 &&
          param2 >= 390 &&
          param2 < 475) {
          return 1;
        }
        return -1;
    }

    final static int splitIntoTwoLines(String[] args, String param1, int param2, BitmapFont param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = param3.textWidth(param1);
          if (param4 != 21230) {
            field_q = (SceneWidget) null;
          }
          if (param2 >= var5_int &&
            param1.indexOf("<br>") == -1) {
            args[0] = param1;
            stackIn_6_0 = 1;
            return stackIn_6_0;
          }
          var6 = (param2 + var5_int - 1) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param3.textWidth(var11);
              if (param2 <= var12) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              args[incrementValue$2] = param1.substring(var7, var9 - 3).trim();
              var7 = var9 + 1;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_25_0 = var6Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("hf.J(");
          if (args == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    MembershipOfferScreen(java.applet.Applet param0, String param1, IndexedSprite[] param2, String[] param3) {
        this.field_p = 0;
        this.field_c = 0;
        this.field_h = true;
        try {
          this.initialize(param2, -126, param1, param0, true, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_b = "Offering rematch";
    }
}
