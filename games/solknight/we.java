/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we implements WidgetRenderer {
    private int field_j;
    private int field_i;
    private int field_g;
    private int field_a;
    private int field_d;
    static int field_h;
    private int field_f;
    static int field_c;
    private BitmapFont field_k;
    private int field_b;
    static int field_e;

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 != 2) {
          return 'N';
        }
        var2 = param1;
        if (var2 == 32) {
          return '_';
        }
        if (var2 == 160) {
          return '_';
        }
        if (var2 == 95) {
          return '_';
        }
        if (var2 == 45) {
          return '_';
        }
        if (var2 == 91) {
          return param1;
        }
        if (var2 != 93 &&
          35 != var2) {
          if (var2 != 224 &&
            225 != var2) {
            if (226 == var2) {
              return 'a';
            }
            if (var2 != 228 &&
              var2 != 227) {
              if (var2 == 192) {
                return 'a';
              }
              if (var2 != 193 &&
                var2 != 194) {
                if (var2 == 196) {
                  return 'a';
                }
                if (var2 != 195) {
                  if (232 != var2 &&
                    var2 != 233 &&
                    var2 != 234) {
                    if (var2 == 235) {
                      return 'e';
                    }
                    if (var2 != 200) {
                      if (201 == var2) {
                        return 'e';
                      }
                      if (var2 != 202 &&
                        var2 != 203) {
                        if (237 != var2 &&
                          var2 != 238 &&
                          239 != var2 &&
                          205 != var2 &&
                          var2 != 206 &&
                          var2 != 207) {
                          if (var2 != 242) {
                            if (var2 == 243) {
                              return 'o';
                            }
                            if (var2 != 244) {
                              if (246 == var2) {
                                return 'o';
                              }
                              if (var2 != 245 &&
                                var2 != 210 &&
                                var2 != 211) {
                                if (212 == var2) {
                                  return 'o';
                                }
                                if (214 == var2) {
                                  return 'o';
                                }
                                if (var2 != 213) {
                                  if (var2 != 249 &&
                                    var2 != 250 &&
                                    251 != var2) {
                                    if (var2 == 252) {
                                      return 'u';
                                    }
                                    if (217 != var2) {
                                      if (var2 == 218) {
                                        return 'u';
                                      }
                                      if (var2 == 219) {
                                        return 'u';
                                      }
                                      if (220 != var2) {
                                        if (var2 != 231 &&
                                          var2 != 199) {
                                          if (var2 == 255) {
                                            return 'y';
                                          }
                                          if (376 == var2) {
                                            return 'y';
                                          }
                                          if (var2 == 241) {
                                            return 'n';
                                          }
                                          if (var2 == 209) {
                                            return 'n';
                                          }
                                          if (var2 == 223) {
                                            return 'b';
                                          }
                                          return Character.toLowerCase(param1);
                                        }
                                        return 'c';
                                      }
                                    }
                                  }
                                  return 'u';
                                }
                              }
                            }
                          }
                          return 'o';
                        }
                        return 'i';
                      }
                    }
                  }
                  return 'e';
                }
              }
            }
          }
          return 'a';
        }
        return param1;
    }

    final static void a(boolean param0) {
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        boolean stackIn_56_2 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        boolean stackIn_65_2 = false;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        boolean stackIn_73_2 = false;
        RuntimeException decompiledCaughtException = null;
        Sprite var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Sprite var9 = null;
        int var10 = 0;
        Sprite var11 = null;
        Sprite var12 = null;
        String var14 = null;
        Sprite var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          if (ValidationStatusIcon.field_Q != null &&
            ValidationStatusIcon.field_Q.ensureIndexLoaded((byte) -121) &&
            ValidationStatusIcon.field_Q.tryLoadGroupByName(2, "benefits") &&
            eb.field_b != null &&
            eb.field_b.ensureIndexLoaded((byte) -121) &&
            eb.field_b.tryLoadGroupByName(2, "benefits")) {
            GrowableIntArray.field_f = Asteroid.a("headline", "benefits", ValidationStatusIcon.field_Q, (byte) -120);
            pf.field_b = Asteroid.a("blurbpane", "benefits", ValidationStatusIcon.field_Q, (byte) -126);
            IsaacRandom.field_d = Asteroid.a("button", "benefits", ValidationStatusIcon.field_Q, (byte) -117);
            TextFieldValidator.field_e = Asteroid.a("signup_text", "benefits", ValidationStatusIcon.field_Q, (byte) -119);
            jh.field_b = Asteroid.a("menu_text", "benefits", ValidationStatusIcon.field_Q, (byte) -114);
            GameApplet.field_j = Asteroid.a("button_frame", "benefits", ValidationStatusIcon.field_Q, (byte) -121);
            RichTextWidget.field_S = Asteroid.a("arrow", "benefits", ValidationStatusIcon.field_Q, (byte) -111);
            GzipDecompressor.field_a = (BitmapFont) ((Object) lc.a(ValidationStatusIcon.field_Q, 1, "large_font", "benefits", eb.field_b));
            ArchiveRequest.field_n = (BitmapFont) ((Object) lc.a(ValidationStatusIcon.field_Q, 1, "small_font", "benefits", eb.field_b));
            var28 = SoftwareRasterizer.field_f;
            var2 = SoftwareRasterizer.field_a;
            var3 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(DialogMessagePane.field_D);
            var11 = new Sprite(RichTextWidget.field_S.field_p + 4, 4 + RichTextWidget.field_S.field_t);
            var11.bindAsRenderTarget();
            RichTextWidget.field_S.drawGrayModulated(2, 2, ea.field_o);
            UiWidget.a(var11.field_p, 0, var11.field_t, 2, var11, 0, 1, (byte) 21);
            RichTextWidget.field_S = var11;
            fh.field_f = RichTextWidget.field_S.copyMirroredHorizontally();
            var12 = new Sprite(195, 221);
            var6 = var12.field_p / 2;
            var12.bindAsRenderTarget();
            GzipDecompressor.field_a.drawCentred(LoginPanel.a(og.field_e, new String[]{NodeHashTableIterator.field_c}, -63), var6, 40, 16777215, -1);
            ArchiveRequest.field_n.drawCentred(LoginPanel.a(b.field_a, new String[]{NodeHashTableIterator.field_c}, -63), var6, 60, 16777215, -1);
            GzipDecompressor.field_a.drawCentred(LoginPanel.a(l.field_d, new String[]{sf.field_b}, -63), var6, 110, 16777215, -1);
            ArchiveRequest.field_n.drawCentred(LoginPanel.a(BufferedCacheFile.field_l, new String[]{sf.field_b}, -63), var6, 130, 16777215, -1);
            GzipDecompressor.field_a.drawCentred(TextLineMetrics.field_b, var6, 180, 16777215, -1);
            ArchiveRequest.field_n.drawCentred(WidgetContainer.field_A, var6, 200, 16777215, -1);
            UiWidget.a(var12.field_p, 0, var12.field_t, 3, var12, 0, 1, (byte) 21);
            pf.field_b.bindAsRenderTarget();
            var12.draw(18 - pf.field_b.field_s, 241 - pf.field_b.field_n);
            for (var7 = 0; ba.field_s.length > var7; var7++) {
              qd.field_e[var7].bindAsRenderTarget();
              ArchiveRequest.field_n.drawParagraph(ba.field_s[var7], 3, 3, qd.field_e[var7].field_p - 6, -6 + qd.field_e[var7].field_t, ea.field_o, -1, 1, 1, ArchiveRequest.field_n.field_F + ArchiveRequest.field_n.field_s);
              UiWidget.a(qd.field_e[var7].field_p, 0, qd.field_e[var7].field_t, 3, qd.field_e[var7], 0, 1, (byte) 21);
            }
            ba.field_s = null;
            LabeledWidgetContainer.field_K = TextFieldValidator.field_e.copy();
            LabeledWidgetContainer.field_K.bindAsRenderTarget();
            IterableNodeHashTable.a(SoftwareRasterizer.field_d * 2 / 3, 0, 0, 64, SoftwareRasterizer.field_a, true);
            SoftwareRasterizer.setRasterBuffer(var28, var2, var3);
            SoftwareRasterizer.restoreClip(DialogMessagePane.field_D);
            sa.field_m = 231 + (-GameApplet.field_j.field_p + IsaacRandom.field_d.field_p) / 2;
            ValidationStatusIcon.field_Q = null;
            lk.field_c = (IsaacRandom.field_d.field_t - GameApplet.field_j.field_t) / 2 + 390;
            Archive.field_f = 390 + (-GameApplet.field_j.field_t + IsaacRandom.field_d.field_t) / 2;
            LabeledWidgetContainer.field_I = 434 + (IsaacRandom.field_d.field_p - GameApplet.field_j.field_p) / 2;
          }
          if (!param0) {
            field_e = 49;
          }
          if (va.field_g == null) {
            return;
          }
          if (ja.field_a != null &&
            GzipDecompressor.field_a != null) {
            var29 = SoftwareRasterizer.field_f;
            var2Lifetime1 = SoftwareRasterizer.field_a;
            var3Lifetime1 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(DialogMessagePane.field_D);
            var14 = LoginPanel.a(tk.field_q, new String[]{eb.field_d[uf.field_q]}, -63);
            var5 = GzipDecompressor.field_a.maxLineWidth(var14, jj.field_db);
            var6Lifetime1 = GzipDecompressor.field_a.textHeight(var14, jj.field_db, GzipDecompressor.field_a.field_F + GzipDecompressor.field_a.field_s);
            var7Lifetime1 = ji.field_a + (-var5 + jj.field_db) / 2;
            var8 = AgeValidator.field_o + (IterableNodeHashTable.field_h - var6Lifetime1) / 2;
            var5 += 6;
            var7Lifetime1 -= 3;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              ja.field_a.field_q = ja.field_a.field_q + 2 * var9_int;
              ContentTransitionDialog.field_T = ContentTransitionDialog.field_T - var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              ji.field_a = ji.field_a + var9_int;
              var5 = var5 + var9_int * 2;
              ja.field_a.field_s = ja.field_a.field_s + var9_int;
            }
            var6Lifetime1 += 6;
            var8 -= 3;
            if (ja.field_a.field_q < var5 + var7Lifetime1) {
              var9_intLifetime1 = -ja.field_a.field_q + (var5 + var7Lifetime1);
              ji.field_a = ji.field_a + var9_intLifetime1;
              var5 = var5 + 2 * var9_intLifetime1;
              ContentTransitionDialog.field_T = ContentTransitionDialog.field_T - var9_intLifetime1;
              ja.field_a.field_s = ja.field_a.field_s + var9_intLifetime1;
              ja.field_a.field_q = ja.field_a.field_q + var9_intLifetime1 * 2;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              ja.field_a.field_n = ja.field_a.field_n + var9_intLifetime2;
              AgeValidator.field_o = AgeValidator.field_o + var9_intLifetime2;
              ja.field_a.field_r = ja.field_a.field_r + var9_intLifetime2 * 2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
              var8 = var8 + var9_intLifetime2;
              LabeledWidgetContainer.field_N = LabeledWidgetContainer.field_N - var9_intLifetime2;
            }
            if (ja.field_a.field_r < var6Lifetime1 + var8) {
              var9_intLifetime3 = var6Lifetime1 + var8 - ja.field_a.field_r;
              LabeledWidgetContainer.field_N = LabeledWidgetContainer.field_N - var9_intLifetime3;
              AgeValidator.field_o = AgeValidator.field_o + var9_intLifetime3;
              ja.field_a.field_n = ja.field_a.field_n + var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              ja.field_a.field_r = ja.field_a.field_r + 2 * var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
            }
            ja.field_a.normalizeCanvas();
            var9 = new Sprite(ja.field_a.field_q, ja.field_a.field_r);
            var9.bindAsRenderTarget();
            GzipDecompressor.field_a.drawParagraph(var14, ji.field_a, AgeValidator.field_o, jj.field_db, IterableNodeHashTable.field_h, 16777215, -1, 1, 1, GzipDecompressor.field_a.field_F + GzipDecompressor.field_a.field_s);
            UiWidget.a(var9.field_q, 0, var9.field_r, 3, var9, 0, 1, (byte) 21);
            ja.field_a.bindAsRenderTarget();
            var9.draw(0, 0);
            rh.field_g = new Sprite(640, 480);
            rh.field_g.bindAsRenderTarget();
            ja.field_a.drawRotated((ja.field_a.field_q >> 1) + ContentTransitionDialog.field_T, LabeledWidgetContainer.field_N + (ja.field_a.field_r >> 1), aj.field_p, 4096);
            ja.field_a = null;
            rh.field_g.trimTransparentBorders();
            SoftwareRasterizer.setRasterBuffer(var29, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(DialogMessagePane.field_D);
          }
          if (null != ProxySocketConnector.field_n &&
            null != ArchiveRequest.field_n) {
            var30 = SoftwareRasterizer.field_f;
            var2Lifetime2 = SoftwareRasterizer.field_a;
            var3Lifetime2 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(DialogMessagePane.field_D);
            var16 = new Sprite(412, 43);
            var17 = LoginPanel.a(wb.field_d, new String[]{ProxySocketConnector.field_n}, -63);
            ProxySocketConnector.field_n = null;
            var16.bindAsRenderTarget();
            ArchiveRequest.field_n.drawParagraph(var17, 3, 3, var16.field_p - 6, -6 + var16.field_t, 16777215, -1, 0, 1, ArchiveRequest.field_n.field_F + ArchiveRequest.field_n.field_s);
            UiWidget.a(var16.field_p, 0, var16.field_t, 3, var16, 0, 1, (byte) 21);
            va.field_g.bindAsRenderTarget();
            var16.draw(199 - va.field_g.field_s, -va.field_g.field_n + 83);
            SoftwareRasterizer.setRasterBuffer(var30, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(DialogMessagePane.field_D);
          }
          if (EmailFormatValidator.field_j != null &&
            null != ArchiveRequest.field_n) {
            var31 = SoftwareRasterizer.field_f;
            var2Lifetime3 = SoftwareRasterizer.field_a;
            var3Lifetime3 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(DialogMessagePane.field_D);
            var4 = ArchiveRequest.field_n.maxLineWidth(EmailFormatValidator.field_p, 640) + 6;
            var5Lifetime1 = EmailFormatValidator.field_j.field_q + var4 + 20;
            var6Lifetime2 = -(var5Lifetime1 / 2) + 427;
            var7Lifetime2 = 20 + (EmailFormatValidator.field_j.field_q + var6Lifetime2);
            va.field_g.bindAsRenderTarget();
            ArchiveRequest.field_n.drawString(EmailFormatValidator.field_p, -va.field_g.field_s + var7Lifetime2, ArchiveRequest.field_n.field_s + (ArchiveRequest.field_n.field_F + (-va.field_g.field_n + 155)), 16777215, -1);
            UiWidget.a(var4, var7Lifetime2 - va.field_g.field_s - 4, 50, 3, va.field_g, 155 - va.field_g.field_n, 1, (byte) 21);
            var8Lifetime1 = -va.field_g.field_n + 155 - (-ArchiveRequest.field_n.field_F - 3 + EmailFormatValidator.field_j.field_r - ArchiveRequest.field_n.field_s) / 2;
            EmailFormatValidator.field_j.draw(var6Lifetime2 - va.field_g.field_s, var8Lifetime1);
            SoftwareRasterizer.setRasterBuffer(var31, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(DialogMessagePane.field_D);
            EmailFormatValidator.field_j = null;
          }
          SoftwareRasterizer.saveClip(DialogMessagePane.field_D);
          SoftwareRasterizer.fillRoundedRectangleAlpha(16, 16, 608, 112, 15, Asteroid.field_f, id.field_a);
          SoftwareRasterizer.fillRoundedRectangleAlpha(231, 144, 393, 232, 15, Asteroid.field_f, id.field_a);
          if (GrowableIntArray.field_f != null) {
            GrowableIntArray.field_f.draw(0, 0);
          }
          if (pf.field_b != null) {
            pf.field_b.draw(0, 0);
          }
          va.field_g.draw(0, 0);
          if (rh.field_g != null) {
            rh.field_g.draw(0, 0);
          }
          if (null != IsaacRandom.field_d &&
            null != GameApplet.field_j) {
            IsaacRandom.field_d.draw(231, 390);
            var1 = TextFieldValidator.field_e;
            if (GameKeyHandler.field_b.field_f == 0) {
              var1 = LabeledWidgetContainer.field_K;
            }
            var1.draw(0, 0);
            stackIn_50_0 = 40;
            stackIn_50_1 = ArchiveSource.field_a;
            if (0 != GameKeyHandler.field_b.field_f) {
              stackIn_51_2 = 3;
            } else {
              stackIn_51_2 = 4;
            }
            var2Lifetime4 = (stackIn_50_0 * kb.a(stackIn_50_1 << stackIn_51_2, false) >> 16) + 40;
            if (var2Lifetime4 > 0) {
              IsaacRandom.field_d.drawAdditive(230, 389, var2Lifetime4);
              IsaacRandom.field_d.drawAdditive(232, 389, var2Lifetime4);
              IsaacRandom.field_d.drawAdditive(232, 391, var2Lifetime4);
              IsaacRandom.field_d.drawAdditive(230, 391, var2Lifetime4);
              var1.drawAdditive(1, 1, var2Lifetime4);
              var1.drawAdditive(-1, 1, var2Lifetime4);
              var1.drawAdditive(1, -1, var2Lifetime4);
              var1.drawAdditive(-1, -1, var2Lifetime4);
            }
            stackIn_55_0 = -50;
            stackIn_55_1 = sa.field_m;
            stackIn_56_2 = (GameKeyHandler.field_b.field_f == 0);
            kb.a(stackIn_55_0, stackIn_55_1, stackIn_56_2, Archive.field_f);
          }
          if (null != IsaacRandom.field_d &&
            GameApplet.field_j != null) {
            IsaacRandom.field_d.draw(434, 390);
            jh.field_b.draw(0, 0);
            if (GameKeyHandler.field_b.field_f == 1) {
              IterableNodeHashTable.a(7 * IsaacRandom.field_d.field_t / 12, 436, 392, 64, IsaacRandom.field_d.field_p - 4, true);
            }
            stackIn_64_0 = -36;
            stackIn_64_1 = LabeledWidgetContainer.field_I;
            stackIn_65_2 = (GameKeyHandler.field_b.field_f == 1);
            kb.a(stackIn_64_0, stackIn_64_1, stackIn_65_2, lk.field_c);
          }
          if (RichTextWidget.field_S != null) {
            var1_int = -(RichTextWidget.field_S.field_r / 2) + 357;
            RichTextWidget.field_S.draw(269 - RichTextWidget.field_S.field_q, var1_int);
            fh.field_f.draw(586, var1_int);
            if (var1_int < BufferedSocket.field_m &&
              var1_int + RichTextWidget.field_S.field_t > BufferedSocket.field_m) {
              stackIn_72_0 = 40;
              stackIn_72_1 = ArchiveSource.field_a << 4;
              stackIn_73_2 = !(param0);
              var2Lifetime5 = stackIn_72_0 + (kb.a(stackIn_72_1, stackIn_73_2) * 40 >> 16);
              if (var2Lifetime5 <= 0) {
                ac.a((byte) -125);
                qd.field_e[field_h].draw(269, 340);
                return;
              }
              if (PacketBuffer.field_j > 269 - RichTextWidget.field_S.field_p &&
                PacketBuffer.field_j < 269) {
                RichTextWidget.field_S.drawAdditive(269 - RichTextWidget.field_S.field_q - 1, -1 + var1_int, var2Lifetime5);
                RichTextWidget.field_S.drawAdditive(1 + (-RichTextWidget.field_S.field_q + 269), -1 + var1_int, var2Lifetime5);
                RichTextWidget.field_S.drawAdditive(-1 + (-RichTextWidget.field_S.field_q + 269), 1 + var1_int, var2Lifetime5);
                RichTextWidget.field_S.drawAdditive(-RichTextWidget.field_S.field_q + 269 + 1, 1 + var1_int, var2Lifetime5);
              } else {
                if (586 < PacketBuffer.field_j &&
                  PacketBuffer.field_j < RichTextWidget.field_S.field_p + 586) {
                  fh.field_f.drawAdditive(585, -1 + var1_int, var2Lifetime5);
                  fh.field_f.drawAdditive(587, var1_int - 1, var2Lifetime5);
                  fh.field_f.drawAdditive(585, 1 + var1_int, var2Lifetime5);
                  fh.field_f.drawAdditive(587, var1_int + 1, var2Lifetime5);
                }
              }
            }
          }
          ac.a((byte) -125);
          qd.field_e[field_h].draw(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var1_ref), "we.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          var5 = fb.field_b;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          if (param0 <= 5) {
            field_c = -27;
          }
          while (var2 < var3) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var1_ref), "we.B(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != -1) {
          we.a(-78);
        }
        System.out.println("Error: " + hl.a(param0, "\n", "%0a", true));
    }

    public final void paintWidget(byte param0, int param1, boolean param2, int param3, UiWidget param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        be var14 = null;
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (param4 instanceof be) {
            stackIn_3_0 = (UiWidget) (param4);
          } else {
            stackIn_3_0 = null;
          }
          var14 = (be) (stackIn_3_0);
          SoftwareRasterizer.fillRectangle(param4.field_m + param3, param1 + param4.field_j, param4.field_t, param4.field_x, this.field_f);
          if (param0 <= 113) {
            we.a(-104, 'P');
          }
          if (var14 == null) {
          }
          var7 = var14.field_N + param3 + param4.field_m;
          var8 = var14.field_P + param1 + param4.field_j;
          SoftwareRasterizer.fillCircle(var7, var8, var14.field_O, this.field_a);
          if (var14.field_M != -1) {
            var9 = 2.0 * ((double)var14.field_M * 3.141592653589793) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_O);
            var12 = (int)(Math.cos(var9) * (double)var14.field_O);
            SoftwareRasterizer.fillCircle(var11 + var7, var8 + var12, 1, this.field_g);
          }
          SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
          var9Lifetime1 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_L;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_O);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_O);
          SoftwareRasterizer.drawLine(var7, var8, var11Lifetime1 + var7, var12Lifetime1 + var8, 1);
          if (this.field_k != null) {
            var13 = var14.field_O + var14.field_N + this.field_j;
            this.field_k.drawParagraph(param4.field_i, var13 + (param4.field_m + param3), this.field_d + (param4.field_j + param1), -var13 - (this.field_j - param4.field_t), -(this.field_j << 1) + param4.field_x, this.field_i, this.field_b, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("we.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    we(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_g = param6;
          this.field_k = param0;
          this.field_j = param1;
          this.field_b = param4;
          this.field_i = param3;
          this.field_a = param5;
          this.field_d = param2;
          this.field_f = param7;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
    }
}
