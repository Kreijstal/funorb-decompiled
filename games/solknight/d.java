/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_a;
    static ArchiveSourceManager field_b;
    static long field_c;

    final static void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Sprite var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Archive var8 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var6Lifetime1;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          ah.a(pg.field_e, 7);
          je.a(-76, BufferedSocket.field_m, PacketBuffer.field_j);
          if (!pg.field_e &&
            PacketBuffer.field_j != -1) {
            MenuScreen.a(PacketBuffer.field_j, BufferedSocket.field_m, 57);
          }
          if (ProxyAuthenticationRequiredException.field_a > 0 &&
            ob.field_j > 1) {
            if (EmailFormatValidator.field_n == null) {
              EmailFormatValidator.field_n = new Sprite(256, 1 + (BufferedSocket.field_b.field_F + BufferedSocket.field_b.field_s));
            }
            EmailFormatValidator.field_n.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            BufferedSocket.field_b.drawCentred(LoginPanel.a(ma.field_m, new String[]{Integer.toString(ob.field_j)}, -63), 128, BufferedSocket.field_b.field_F, 16777215, 8421504);
            Bzip2State.field_e.setAsRasterTarget(true);
            EmailFormatValidator.field_n.a(ProxyAuthenticationRequiredException.field_a, 46, 107, 0, 125);
          }
          if (ProgressMessageDialog.field_ib > 0 &&
            lk.field_e > 0) {
            if (EmailFormatValidator.field_n == null) {
              EmailFormatValidator.field_n = new Sprite(256, 1 + BufferedSocket.field_b.field_s + BufferedSocket.field_b.field_F);
            }
            EmailFormatValidator.field_n.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            BufferedSocket.field_b.drawCentred(LoginPanel.a(ArchiveIndex.field_p, new String[]{Integer.toString(lk.field_e)}, -63), 128, BufferedSocket.field_b.field_F, 16777215, 8421504);
            Bzip2State.field_e.setAsRasterTarget(true);
            EmailFormatValidator.field_n.a(ProgressMessageDialog.field_ib, 46, 109, 0, 475);
          }
          if (fg.field_a > 0) {
            if (fg.field_a >= 500) {
              if (SectorCacheStore.field_h == 1) {
                BufferedSocket.field_b.drawCentred(ValidationStatusIcon.field_M, 320, 32, 16711680, 8421504);
              }
              if (2 == SectorCacheStore.field_h) {
                BufferedSocket.field_b.drawCentred(IterableNodeHashTable.field_a, 320, 32, 16776960, 8421504);
              }
            } else {
              if (1 == SectorCacheStore.field_h) {
                BufferedSocket.field_b.drawCentred(LoginPanel.a(ValidationStatusWidget.field_T, new String[]{Integer.toString(fg.field_a / 50)}, -63), 320, 32, 16711680, 8421504);
              }
              if (SectorCacheStore.field_h == 2) {
                BufferedSocket.field_b.drawCentred(LoginPanel.a(og.field_i, new String[]{Integer.toString(fg.field_a / 50)}, -63), 320, 32, 16776960, 8421504);
              }
            }
          }
          var2_int = 30 + SocketConnector.field_g.stringWidth(LoginPanel.a(DelegatingCanvas.field_a, new String[]{Integer.toString(100)}, -63));
          var3 = 30 + SocketConnector.field_g.stringWidth(LoginPanel.a(nb.field_b, new String[]{Integer.toString(1300)}, -63));
          if (var2_int < var3) {
            var2_int = var3;
          }
          var3Lifetime1 = 30 + SocketConnector.field_g.stringWidth(DebouncedFieldValidator.field_b);
          if (var3Lifetime1 > var2_int) {
            var2_int = var3Lifetime1;
          }
          uj.a(var2_int + 15, 47, 0, GameApplet.field_f, 433, 2);
          SocketConnector.field_g.drawString(LoginPanel.a(DelegatingCanvas.field_a, new String[]{Integer.toString(ud.field_k * 100 / GameKeyHandler.field_a[7])}, -63), 30, 467, 16777215, -1);
          if (-ud.field_k + (GameKeyHandler.field_a[kb.field_b] - lk.field_f) > 0) {
            SocketConnector.field_g.drawString(LoginPanel.a(nb.field_b, new String[]{Integer.toString(-ud.field_k + (GameKeyHandler.field_a[kb.field_b] - lk.field_f))}, -63), 30, 455, 16777215, -1);
          }
          if (-ud.field_k + GameKeyHandler.field_a[kb.field_b] - lk.field_f <= 0) {
            SocketConnector.field_g.drawString(DebouncedFieldValidator.field_b, 30, 455, 16777215, -1);
          }
          var2_intLifetime1 = 74 + SocketConnector.field_g.stringWidth(field_a);
          var4 = h.field_b;
          var5 = 641 - var2_intLifetime1;
          SocketConnector.field_g.drawString(field_a, var5, 461, 16777215, -1);
          var5 = var5 + (SocketConnector.field_g.stringWidth(field_a) + 1);
          for (var6 = 0; uf.field_p > var6; var6++) {
            var4.drawScaledAveraged(var5, -(var4.field_r * 12 / var4.field_q) + 470, 12, var4.field_r * 12 / var4.field_q);
            var5 += 22;
          }
          if (param1 != -48) {
            var8 = (Archive) null;
            d.a((Archive) null, true, (byte) -71, (Archive) null, (Archive) null);
          }
          uj.a(var2_intLifetime1 + 15, 47, -15 + (640 - var2_intLifetime1), TextLineMetrics.field_d, 433, 2);
          if (0 < uf.field_p) {
            if (lk.field_b < 50 &&
              lk.field_e == 0) {
              BufferedSocket.field_b.drawCentred(ac.field_a, 320, 33, 16777215, 1);
            }
            if (wc.field_c < 200) {
              var6Lifetime1 = 0;
              if (24 > wc.field_c) {
                var6Lifetime1 = var6Lifetime1 + 655360 * wc.field_c;
              } else {
                if (wc.field_c <= 175) {
                  var6Lifetime1 = 16711680;
                } else {
                  var6Lifetime1 = var6Lifetime1 + (-wc.field_c + 200) * 655360;
                }
              }
              if (wc.field_c < 50) {
                var6Lifetime1 = var6Lifetime1 + 1285 * wc.field_c;
              } else {
                if (wc.field_c < 150) {
                  var6Lifetime1 = var6Lifetime1 + 65535;
                } else {
                  var6Lifetime1 = var6Lifetime1 + 1285 * (-wc.field_c + 200);
                }
              }
              BufferedSocket.field_b.drawParagraph(LoginPanel.a(fj.field_j, new String[]{ProgressMessageDialog.field_gb[kb.field_b], Integer.toString(kb.field_b + 1)}, -63), 0, 0, 640, 480, var6Lifetime1, -1, 1, 1, 24);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var2), "d.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -96) {
          d.a(false, (byte) -112);
        }
    }

    final static void a(Archive param0, boolean param1, byte param2, Archive param3, Archive param4) {
        td.field_h = hh.a("", false);
        td.field_h.a(false, (byte) -75);
        ProgressMessageDialog.a(param0, false, param3, param4);
        if (param2 != -110) {
          return;
        }
        try {
          ff.b(-13408);
          ma.field_o = MatchingFieldValidator.field_p;
          PacketBuffer.field_i = MatchingFieldValidator.field_p;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "d.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Lives: ";
    }
}
