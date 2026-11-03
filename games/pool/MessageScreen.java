/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageScreen extends MenuScreen {
    static IntrusiveDeque field_H;
    static ie field_K;
    static TickClock field_J;
    static String field_I;

    final static Object a(boolean param0, int param1, byte[] param2) {
        hi var3 = null;
        RuntimeException var3_ref = null;
        hi stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -26) {
            field_K = (ie) null;
          }
          if (param2 == null) {
            return null;
          }
          if (param2.length > 136) {
            var3 = new hi();
            ((ByteStorage) ((Object) var3)).setBytes(param2, (byte) 2);
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (!param0) {
            stackIn_13_0 = (byte[]) (param2);
            return stackIn_13_0;
          }
          stackIn_11_0 = jj.a(param2, (byte) 91);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("pj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(boolean param0, LoginPayload param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          Pool.field_L[0] = ValidationIconWidget.field_P.nextInt();
          Pool.field_L[1] = ValidationIconWidget.field_P.nextInt();
          Pool.field_L[2] = (int)(Pool.field_Q >> 32);
          Pool.field_L[3] = (int)Pool.field_Q;
          bc.field_b.position = 0;
          bc.field_b.writeInt(true, Pool.field_L[0]);
          bc.field_b.writeInt(true, Pool.field_L[1]);
          bc.field_b.writeInt(true, Pool.field_L[2]);
          bc.field_b.writeInt(true, Pool.field_L[3]);
          OptionsScreen.a(bc.field_b, 0);
          bc.field_b.writeShort((byte) -81, param4);
          param1.writePayload((byte) 121, bc.field_b);
          JaggrabDownloader.field_j.position = 0;
          if (param0) {
            JaggrabDownloader.field_j.writeByte(18, false);
          } else {
            JaggrabDownloader.field_j.writeByte(16, false);
          }
          JaggrabDownloader.field_j.position = JaggrabDownloader.field_j.position + 2;
          var5_int = JaggrabDownloader.field_j.position;
          JaggrabDownloader.field_j.writeInt(true, LobbyPlayer.field_ec);
          JaggrabDownloader.field_j.writeLong(PlayerContextMenu.field_j, (byte) -80);
          var6 = 0;
          if (CushionSegment.field_g) {
            var6 = var6 | 1;
          }
          if (NanoTickClock.field_s) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (CheckboxWidget.field_N != null) {
            var6 = var6 | 16;
          }
          JaggrabDownloader.field_j.writeByte(var6, false);
          var7 = DateInputWidget.a(NanoTickClock.getApplet(90), (byte) 120);
          if (var7 == null) {
            var7 = "";
          }
          JaggrabDownloader.field_j.a(-9946, var7);
          if (null != CheckboxWidget.field_N) {
            JaggrabDownloader.field_j.a(false, CheckboxWidget.field_N);
          }
          ArchiveIndex.a((byte) 93, ArchiveLoadSequence.field_l, bc.field_b, UiWidget.field_q, JaggrabDownloader.field_j);
          JaggrabDownloader.field_j.writeShortLengthPrefix(JaggrabDownloader.field_j.position - var5_int, (byte) -92);
          de.a(-1, 0);
          if (param3 != -98300704) {
            MessageScreen.releaseStatics(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("pj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    MessageScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((Sprite) null, param0, param1, param2, param3, param4, param5);
    }

    final void drawScreen(int param0) {
        super.drawScreen(46);
        if (param0 <= 36) {
          return;
        }
        this.renderParagraphSprite(FreePlayRules.field_e, new int[]{FreePlayRules.field_e.baselineHeight}, 100, -16097, ThreeSliceButtonPainter.field_B, 320, 4);
        this.drawParagraphSprite(100, false);
    }

    public static void releaseStatics(boolean param0) {
        field_I = null;
        field_H = null;
        if (param0) {
          return;
        }
        field_K = null;
        field_J = null;
    }

    final static void drawScreenshotSlideshow(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Sprite var6 = null;
        Sprite var7 = null;
        Sprite var8 = null;
        int var3Lifetime1;
        var4 = Pool.field_O;
        try {
          SoftwareRasterizer.drawRectangle(243, 197, 369, 143, 16777215);
          SoftwareRasterizer.fillRectangle(244, 198, 367, 141, 0);
          if (AccountCreationForm.field_V == null) {
            if (null != SceneNode.field_h) {
              SceneNode.field_h.drawParagraph(UiComponentNode.loading, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = AccountCreationForm.field_V[KillerRules.field_f];
          if (param0 != -1) {
            field_K = (ie) null;
          }
          if (var6 != null) {
            var6.draw(245, 199);
          } else {
            if (SceneNode.field_h != null) {
              SceneNode.field_h.drawParagraph(UiComponentNode.loading, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          if (SocketArchiveNetworkClient.field_u < hj.field_l) {
            var7 = AccountCreationForm.field_V[SoundCache.field_b];
            if (var7 != null) {
              var2_int = (var7.field_w + 60) * SocketArchiveNetworkClient.field_u / hj.field_l;
              var3 = var2_int - 30;
              if (!InstructionsScreen.field_K) {
                ml.a(var3 * -256 / 30, (byte) 63, 245, 199, var7, (var7.field_w - var3) * 256 / 30);
              } else {
                ml.a((-var3 + var7.field_w) * 256 / 30, (byte) 117, 245, 199, var7, var3 * -256 / 30);
              }
            }
          }
          if (SceneNode.field_h != null) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < AccountCreationForm.field_V.length) {
              var8 = AccountCreationForm.field_V[var5];
              if (var8 != null && (365 != var8.field_w ||
                var8.field_y != 139)) {
                if (var2 != null) {
                  var2 = (String) (var2) + ", " + var5;
                } else {
                  var2 = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2 != null) {
              SceneNode.field_h.drawParagraph("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "pj.E(" + param0 + ')');
        }
    }

    static {
        field_H = new IntrusiveDeque();
        field_K = new ie();
        field_I = null;
    }
}
