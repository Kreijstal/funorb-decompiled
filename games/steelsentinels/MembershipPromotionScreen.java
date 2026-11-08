/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MembershipPromotionScreen {
    private boolean field_v;
    private RgbSprite field_t;
    private RgbSprite field_a;
    private String field_l;
    private RgbSprite field_u;
    private int field_h;
    private String[] field_d;
    private int field_j;
    static RgbSprite[] field_p;
    private IndexedSprite[] field_s;
    private int field_q;
    private int field_e;
    private int field_i;
    private MenuInputState field_n;
    static int field_m;
    private int field_g;
    static String field_r;
    private static long[] field_f;
    static String field_o;
    static boolean field_k;
    static IndexedSprite[] field_c;
    static String field_b;

    private final int a(int param0, int param1, byte param2) {
        if (null == QuickChatHelpDialog.field_Wb) {
          return -1;
        }
        if (param0 >= 508 &&
          param0 < 635 &&
          param1 >= 299 &&
          param1 < 386) {
          return 0;
        }
        if (param0 >= 508 &&
          param0 < 635 &&
          param1 >= 390 &&
          param1 < 475) {
          return 1;
        }
        if (param2 <= 111) {
          this.b((byte) 9);
        }
        return -1;
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        BitmapFont var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        var4 = SteelSentinels.obfuscationControl;
        SoftwareRaster.fillVerticalGradient(9, 9, 622, 47, 4540749, 65793);
        SoftwareRaster.fillRectangle(9, 257, 622, 33, 2585);
        SoftwareRaster.fillVerticalGradient(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        while (var2 < 4) {
          SoftwareRaster.fillVerticalGradient(var3, 331, 117, 90, 460551, 3881787);
          var2++;
          var3 += 121;
        }
        var2Lifetime1 = 0;
        var3Lifetime1 = 299;
        while (var2Lifetime1 < 2) {
          SoftwareRaster.fillVerticalGradient(508, var3Lifetime1, 127, 42, 1130115, 3365268);
          SoftwareRaster.fillRectangle(508, 42 + var3Lifetime1, 127, 42, 12410);
          var3Lifetime1 += 91;
          var2Lifetime1++;
        }
        this.d((byte) -117);
        if (null != pa.field_a &&
          pa.field_a.ensureIndex(param0) &&
          pa.field_a.a("members_expansion_screen", (byte) 90) &&
          pa.field_a.a("arialish12", (byte) 90) &&
          pa.field_a.a("pump32", (byte) 90) &&
          null != BufferedRandomAccessFile.field_d &&
          BufferedRandomAccessFile.field_d.ensureIndex(true) &&
          BufferedRandomAccessFile.field_d.a("arialish12", (byte) 90) &&
          BufferedRandomAccessFile.field_d.a("pump32", (byte) 90)) {
          QuickChatHelpDialog.field_Wb = NanoTickClock.a(pa.field_a, (byte) 85, "members_expansion_screen", "frame");
          di.field_f = rl.a(pa.field_a, "members_expansion_screen", "arrow", false);
          GameApplet.field_g = vd.a(BufferedRandomAccessFile.field_d, "arialish12", pa.field_a, -1, "");
          FunOrbClient.field_w = be.a(pa.field_a, BufferedRandomAccessFile.field_d, (byte) -69, "", "pump32");
          qe.field_g = dn.a("members_expansion_screen", -42, "benefit_orbs", pa.field_a);
          SectorCacheStore.field_d = dn.a("members_expansion_screen", -83, "button_text", pa.field_a);
          ce.field_v = ec.a((byte) -80, "button_highlights", pa.field_a, "members_expansion_screen");
          pa.field_a = null;
          BufferedRandomAccessFile.field_d = null;
        }
        this.b((byte) 106);
        if (null == QuickChatHelpDialog.field_Wb) {
          return;
        }
        this.field_a.drawTransparent(376, 339);
        this.field_u.drawTransparent(9, 9);
        QuickChatHelpDialog.field_Wb.draw(0, 0);
        if (di.field_f != null) {
          di.field_f.drawTransparent(9, 257);
          di.field_f.drawHorizontalFlip(558, 257);
          if (DelegatingCanvas.field_c > 257 &&
            DelegatingCanvas.field_c < 290) {
            var2Lifetime2 = (dd.a(20612, this.field_h << 4) * 40 >> 16) + 40;
            if (var2Lifetime2 > 0) {
              if (oh.field_f > 9 &&
                oh.field_f < 82) {
                di.field_f.drawAdditive(8, 256, var2Lifetime2);
                di.field_f.drawAdditive(10, 256, var2Lifetime2);
                di.field_f.drawAdditive(8, 258, var2Lifetime2);
                di.field_f.drawAdditive(10, 258, var2Lifetime2);
              } else {
                if (oh.field_f > 558 &&
                  oh.field_f < 631) {
                  di.field_f.flipHorizontal();
                  di.field_f.drawAdditive(557, 256, var2Lifetime2);
                  di.field_f.drawAdditive(559, 256, var2Lifetime2);
                  di.field_f.drawAdditive(557, 258, var2Lifetime2);
                  di.field_f.drawAdditive(559, 258, var2Lifetime2);
                  di.field_f.flipHorizontal();
                }
              }
            }
          }
        }
        this.field_t.drawTransparent(16, 302);
        GameApplet.field_g.drawParagraph(this.field_d[this.field_q], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
        qe.field_g.drawTransparent(30, 330);
        GameApplet.field_g.drawParagraph(ArchiveRequest.field_A[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
        GameApplet.field_g.drawParagraph(ArchiveRequest.field_A[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
        GameApplet.field_g.drawParagraph(ArchiveRequest.field_A[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
        SectorCacheStore.field_d.drawTransparent(508 + (-SectorCacheStore.field_d.field_z + 127) / 2, 315);
        if (!param0) {
          var5 = (BitmapFont) null;
          this.a(-67, (int[]) null, -60, 99, (String) null, 51, (BitmapFont) null, (byte) 82);
        }
        if (this.field_n.field_e == 0) {
          ce.field_v[0].drawTransparent(508, 299);
        } else {
          if (this.field_n.field_e == 1) {
            ce.field_v[1].drawTransparent(508, 387);
          }
        }
    }

    final int a(int param0, boolean param1) {
        int discarded$0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        var6 = SteelSentinels.obfuscationControl;
        this.field_i = this.field_i + 65536;
        while (StatefulTextPainter.a(this.field_i, cf.field_x, (byte) -27) >= 65536) {
          this.field_i = this.field_i - cf.field_x;
          this.field_h = this.field_h + 1;
        }
        if (param0 != 4540749) {
          discarded$0 = this.a(-88, 19, (byte) -107);
        }
        var3 = -1;
        if (null != this.field_s) {
          var3 = this.field_s.length;
        }
        if (-1 != var3) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_e < cf.field_o) {
            this.field_e = this.field_e + 1;
            if (cf.field_D < this.field_e && (null == this.field_s ||
              null == this.field_s[this.field_q])) {
              this.field_e = this.field_e - 1;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_e >= cf.field_o &&
                this.field_s[(1 + this.field_q) % var3] == null) {
                this.field_e = this.field_e - 1;
              }
            }
          }
          if (cf.field_o <= this.field_e) {
            this.field_j = this.field_q;
            if (!this.field_v) {
              this.field_q = this.field_q - 1;
              if (0 > this.field_q) {
                this.field_q = this.field_q + var3;
              }
            } else {
              this.field_q = this.field_q + 1;
              if (this.field_q >= var3) {
                this.field_q = this.field_q - var3;
              }
            }
            this.field_e = this.field_e - cf.field_o;
          }
          if (this.field_e > cf.field_D) {
            this.field_v = true;
          }
        }
        if (di.field_f != null) {
          var4 = 0;
          if (VerticalScrollbar.field_gc != 0 &&
            257 < BufferedRandomAccessFile.field_j &&
            290 > BufferedRandomAccessFile.field_j) {
            if (TextButton.field_S > 9 &&
              TextButton.field_S < 82) {
              this.field_v = false;
              var4 = 1;
              this.field_e = cf.field_o;
            }
            if (TextButton.field_S > 558 &&
              TextButton.field_S < 631) {
              var4 = 1;
              this.field_e = cf.field_o;
              this.field_v = true;
            }
          }
          if (var4 == 0 &&
            cf.field_D < this.field_e &&
            BufferedRandomAccessFile.field_j > 257 &&
            290 > BufferedRandomAccessFile.field_j) {
            if (oh.field_f > 9 &&
              oh.field_f < 82) {
              this.field_e = cf.field_D;
            }
            if (oh.field_f > 558 &&
              oh.field_f < 631) {
              this.field_e = cf.field_D;
            }
          }
        }
        if (!param1) {
          return 0;
        }
        this.field_n.updatePointer(124, this.a(oh.field_f, DelegatingCanvas.field_c, (byte) 123), this.a(TextButton.field_S, BufferedRandomAccessFile.field_j, (byte) 124));
        var4Lifetime1 = 0;
        if (this.field_n.isForwardAction(0)) {
          if (this.field_n.field_e == 0) {
            var4Lifetime1 = 1;
          }
          if (1 == this.field_n.field_e) {
            return 2;
          }
        }
        if (SocialListPanel.field_cc) {
          while (UiContainer.f(22759)) {
            var5 = this.c((byte) 103);
            if (var5 != 0) {
              return var5;
            }
          }
        }
        if (var4Lifetime1 == 0) {
          return 0;
        }
        this.a(95);
        return 3;
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        field_r = null;
        int var1 = -21 % ((param0 + 6) / 61);
        field_b = null;
        field_p = null;
        field_f = null;
        field_c = null;
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var16 = null;
        int[] var17 = null;
        RgbSprite var5 = null;
        String var6 = null;
        String var7 = null;
        if (null == this.field_u) {
          if (null == FunOrbClient.field_w) {
            return;
          }
          this.field_u = new RgbSprite(622, 47);
          IterableNodeHashTable.a(this.field_u, (byte) -124);
          SoftwareRaster.fillVerticalGradient(0, 0, 622, 47, 4540749, 65793);
          if (param0 < 86) {
            this.a(-93, false);
          }
          var2 = 16448250;
          var3 = 10068666;
          var16 = ContentTransitionDialog.b(var2, var3, (byte) -104);
          this.a(0, var16, 622, 0, this.field_l, 47, FunOrbClient.field_w, (byte) -27);
          MatchingTextValidator.$cfr$intArgs$f$20d51497949f(118);
          this.field_t = new RgbSprite(475, 24);
          this.a(24, 0.75f, this.field_t, 0, 475, VerticalScrollbar.field_Yb, -4, FunOrbClient.field_w, var16, 259);
          var17 = ContentTransitionDialog.b(526344, 526344, (byte) -104);
          var5 = new RgbSprite(121, 122);
          IterableNodeHashTable.a(var5, (byte) -117);
          SoftwareRaster.fillVerticalGradient(0, 0, var5.field_A, var5.field_F / 2, 16180917, 16306250);
          SoftwareRaster.fillVerticalGradient(0, var5.field_F / 2, var5.field_A, var5.field_F, 16306250, 15568919);
          var6 = cl.field_d;
          var7 = eb.field_t;
          this.a(var5.field_F, 0.5f, var5, 0, var5.field_A, var6, -16, FunOrbClient.field_w, var17, 259);
          this.a(var5.field_F, 0.5f, var5, 0, var5.field_A, var7, 20, FunOrbClient.field_w, var17, 259);
          this.a(var5.field_F / 3, 0.699999988079071f, var5, 0, var5.field_A, ResourceArchive.field_m[this.field_g], 12 + (var5.field_F / 2 - FunOrbClient.field_w.field_G), FunOrbClient.field_w, var17, 259);
          MatchingTextValidator.$cfr$intArgs$f$20d51497949f(118);
          this.field_a = new RgbSprite(121, 122);
          IterableNodeHashTable.a(this.field_a, (byte) -75);
          var5.drawRotatedAboutCenter(this.field_a.field_A / 2, this.field_a.field_F / 2, -2048, 4096);
          MatchingTextValidator.$cfr$intArgs$f$20d51497949f(112);
          return;
        }
    }

    private final void d(byte param0) {
        IndexedSprite var2;
        int var3;
        int var4;
        int var5;
        IndexedSprite var6;
        IndexedSprite var7;
        IndexedSprite var2Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        if (null == this.field_s) {
          if (null != GameApplet.field_g) {
            GameApplet.field_g.drawParagraph(eb.field_q, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
          return;
        }
        var6 = this.field_s[this.field_q];
        var2 = var6;
        if (param0 >= -116) {
          this.field_s = (IndexedSprite[]) null;
        }
        if (var2 == null) {
          if (null != GameApplet.field_g) {
            GameApplet.field_g.drawParagraph(eb.field_q, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
        } else {
          var6.draw(9, 58);
        }
        if (cf.field_D > this.field_e) {
          var7 = this.field_s[this.field_j];
          var2Lifetime1 = var7;
          if (var2Lifetime1 != null) {
            var3 = this.field_e * (var7.field_g + 60) / cf.field_D;
            var4 = -30 + var3;
            if (this.field_v) {
              gj.a(9, var2Lifetime1, (byte) -120, (-var4 + var7.field_g) * 256 / 30, 58, -256 * var4 / 30);
            } else {
              gj.a(9, var2Lifetime1, (byte) -104, -256 * var4 / 30, 58, (-var4 + var7.field_g) * 256 / 30);
            }
          }
        }
        return;
    }

    private final void a(java.applet.Applet param0, boolean param1, boolean param2, String[] param3, IndexedSprite[] param4, String param5) {
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
        BitmapFont var8 = null;
        try {
          var7 = param0.getParameter("currency");
          if (var7 != null &&
            RegistrationRequestDialog.a((CharSequence) ((Object) var7), -98)) {
            this.field_g = dj.a((CharSequence) ((Object) var7), -116);
          } else {
            this.field_g = 2;
          }
          this.field_l = param5;
          this.field_n = new MenuInputState(2);
          this.field_s = param4;
          this.field_d = param3;
          if (null != this.field_s &&
            this.field_s.length >= 3) {
            if (param1) {
              var8 = (BitmapFont) null;
              this.a(-88, (int[]) null, 11, -49, (String) null, -42, (BitmapFont) null, (byte) 27);
            }
            SocialListPanel.field_cc = param2;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("ng.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, String param4, int param5, BitmapFont param6, byte param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = SteelSentinels.obfuscationControl;
        try {
          ArchiveIndex.a(false);
          var9_int = param3;
          if (param7 != -27) {
            this.field_a = (RgbSprite) null;
          }
          while (param5 > var9_int) {
            SoftwareRaster.setClip(param0, var9_int, param2, var9_int + 1);
            var10 = param1.length * var9_int / param5;
            var11 = param1[-1 - var10 + param1.length];
            param6.drawParagraph(param4, param0, param3, param2, param5, var11, -1, 1, 1, 0);
            var9_int++;
          }
          MatchingTextValidator.$cfr$intArgs$f$20d51497949f(118);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    private final void a(int param0, float param1, RgbSprite param2, int param3, int param4, String param5, int param6, BitmapFont param7, int[] param8, int param9) {
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
        RgbSprite var13 = null;
        try {
          var11_int = (int)((float)param4 / param1);
          var12 = (int)((float)param0 / param1);
          var13 = new RgbSprite(var11_int, var12);
          IterableNodeHashTable.a(var13, (byte) -113);
          param2.drawScaled((int)((float)(-param3) / param1), (int)((float)(-param6) / param1), (int)((float)param2.field_A / param1), (int)((float)param2.field_F / param1));
          if (param9 != 259) {
            return;
          }
          this.a(0, param8, var11_int, 0, param5, var12, param7, (byte) -27);
          MatchingTextValidator.$cfr$intArgs$f$20d51497949f(111);
          IterableNodeHashTable.a(param2, (byte) -126);
          var13.drawScaledAveraged(param3, param6, param4, param0);
          MatchingTextValidator.$cfr$intArgs$f$20d51497949f(117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("ng.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param9).append(')').toString());
        }
    }

    private final int c(byte param0) {
        this.field_n.a(true);
        if (param0 != 103) {
          this.field_i = -83;
        }
        if (this.field_n.isForwardAction(param0 - 103)) {
          if (this.field_n.field_e == 0) {
            this.a(126);
            return 3;
          }
          if (this.field_n.field_e == 1) {
            return 1;
          }
        }
        if (NameAvailabilityValidator.field_q != 13) {
          return 0;
        }
        return 1;
    }

    private final void a(int param0) {
        try {
          NumericDateInputWidget.a(Projectile.d((byte) -21), 9268);
        } catch (Exception exception) {
          exception.printStackTrace();
        }
        if (param0 <= 85) {
          this.a(125);
        }
    }

    MembershipPromotionScreen(java.applet.Applet param0, String param1, IndexedSprite[] param2, String[] param3) {
        this.field_v = true;
        this.field_h = 0;
        this.field_i = 0;
        try {
          this.a(param0, false, true, param3, param2, param1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_f = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_f[var2] = var0;
        }
        field_o = "Unfortunately we are unable to create an account for you at this time.";
        field_b = "Next";
    }
}
