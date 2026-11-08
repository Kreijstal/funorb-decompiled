/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxPainter implements WidgetListener {
    static float field_r;
    private BitmapFont field_p;
    static byte[][] field_j;
    private int field_l;
    private int field_n;
    static byte[] field_d;
    static int field_g;
    private int field_f;
    private int field_b;
    private int field_a;
    static String field_k;
    private int field_q;
    private int field_h;
    private int field_o;
    static String field_i;
    private int field_c;
    private int field_e;
    private int field_m;

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 <= 57) {
            CheckboxPainter.setupNewGameScene(114);
          }
          field_i = null;
          field_j = (byte[][]) null;
          field_d = null;
          field_k = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "lj.C(" + param0 + ')');
        }
    }

    final static void setupNewGameScene(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        double stackIn_7_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != DropTargetWidget.field_I) {
            DrawOfferMenuHelpers.updateDrawOfferMenuLabel(false);
            NameEntryPopup.updateRematchMenuLabel(1);
            stackIn_7_0 = (DropTargetWidget.field_I.localPlayer == 1) ? 0.0 : 3.141592653589793;
            ArchiveIndex.field_o = (float)stackIn_7_0;
            if (Virogrid.field_F) {
              ArchiveIndex.field_o = 3.1415927410125732f;
            }
          } else {
            ArchiveIndex.field_o = 3.1415927410125732f;
          }
          if (param0 < 96) {
            return;
          }
          BufferedSocket.resetCameraTargets(true, (byte) -106);
          SoundPlaybackHelpers.field_d[0] = (double)field_r * Math.sin((double)CommonUiHelpers.field_c);
          SoundPlaybackHelpers.field_d[2] = (double)field_r * Math.cos((double)CommonUiHelpers.field_c);
          MarkerSlider.updateCameraMatrix((byte) -44);
          PendingRequest.createGameOptions(false, (byte) 87);
          SoundPlaybackHelpers.playSoundEffect(30, QuickChatCategory.field_t);
          var1_int = ProgressMessageDialog.randomInt(4712, 3);
          if (FadeLayer.field_B == var1_int) {
            var1_int = (1 + FadeLayer.field_B) % 3;
          }
          FadeLayer.field_B = var1_int;
          MusicPlaybackHelpers.playMusicTrack(0, MenuScreen.musicTracks[var1_int + 1]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "lj.D(" + param0 + ')');
        }
    }

    public final void drawWidget(int param0, UiWidget param1, boolean param2, int param3, int param4) {
        UiWidget stackIn_4_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        CheckboxButton var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (param1 instanceof CheckboxButton) {
            stackIn_4_0 = (UiWidget) (param1);
          } else {
            stackIn_4_0 = null;
          }
          var6 = (CheckboxButton) (stackIn_4_0);
          if (var6 != null) {
            param2 = param2 & var6.field_C;
          }
          if (param4 != -23294) {
            this.drawWidget(107, (UiWidget) null, true, -95, -123);
          }
          var7 = 5592405;
          Rasterizer.fillRectangle(param0 + param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, this.field_l);
          if (param2) {
            var7 = 16777215;
          }
          var8 = param0 - (-param1.field_l - this.field_f);
          var9 = this.field_a + (param3 + param1.field_u);
          Rasterizer.drawDropShadow(var8, var9, this.field_n, this.field_o, 5592405);
          Rasterizer.fillRectangle(var8, var9, this.field_n, this.field_o, var7);
          if (var6.field_z) {
            Rasterizer.drawLine(var8, var9, this.field_n + var8, this.field_o + var9, 1);
            Rasterizer.drawLine(var8 + this.field_n, var9, var8, this.field_o + var9, 1);
          }
          if (null != this.field_p) {
            var10 = this.field_n + (this.field_f + this.field_e);
            this.field_p.drawParagraph(param1.field_n, var10 + (param1.field_l + param0), param1.field_u + param3 + this.field_q, param1.field_g - var10 - this.field_e, -(this.field_e << 1) + param1.field_m, this.field_c, this.field_b, this.field_h, this.field_m, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_24_0 = var6_ref;
          stackIn_24_1 = new StringBuilder().append("lj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void renderMeshFaces(int param0, boolean param1, boolean param2, int param3, TriangleMesh param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_36_0Lifetime1;
        int stackIn_36_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = SocketJs5Transport.bitLength(3 * (param0 - param3), (byte) -75);
          var6 = param3 * 3;
          PasswordFieldPainter.clearFaceGroupCounts(12);
          if (!param1) {
            return;
          }
          var7 = -10 + var5_int;
          if (param4.field_a > 0 &&
            null != param4.field_z) {
            TooltipAndOptionsHelpers.clearFaceDepthBuckets(0);
          }
          AccountRequestReply.field_f = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_k > var8)))) {
            var9 = param4.field_J[var8];
            var10 = param4.field_e[var8];
            var11 = param4.field_j[var8];
            stackOut_11_0 = param2;
            stackIn_46_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = IconLabelWidget.field_Hb[var9];
                var13 = GameKeyHandler.field_h[var9];
                var14 = IconLabelWidget.field_Hb[var10] - var12;
                var15 = IconLabelWidget.field_Hb[var11] - var12;
                var16 = GameKeyHandler.field_h[var10] - var13;
                var17 = -var13 + GameKeyHandler.field_h[var11];
              }
              if (!stackIn_12_0 ||
                !(var14 * var17 - var15 * var16 >= 0)) {
                var12Lifetime1 = InputDetachHelpers.field_a[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = InputDetachHelpers.field_a[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = InputDetachHelpers.field_a[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + var12Lifetime1 + var13Lifetime1 + var14;
                      stackIn_25_0 = QueuedResultSubmission.field_g.length;
                      stackIn_25_1 = -1;
                      if (0 <= var7) {
                        stackIn_26_2 = var15 >> var7;
                      } else {
                        stackIn_26_2 = var15 << -var7;
                      }
                      var16 = stackIn_25_0 + (stackIn_25_1 - stackIn_26_2);
                      var17 = QueuedResultSubmission.field_g[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_36_0 = ~var16;
                          stackIn_36_1 = -1;
                          if (stackIn_36_0 > stackIn_36_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = QueuedResultSubmission.field_g[var16];
                          continue;
                        }
                        stackIn_36_0Lifetime1 = var16 << 4;
                        stackIn_36_1Lifetime1 = var17;
                        var18 = stackIn_36_0Lifetime1 + stackIn_36_1Lifetime1;
                        ReflectionCheck.field_m[var18] = var8;
                        QueuedResultSubmission.field_g[var16] = 1 + var17;
                        if (param4.field_a > 0 &&
                          param4.field_z != null) {
                          dupTemp$0 = param4.field_z[var8];
                          ProxySocketConnector.field_o[dupTemp$0] = ProxySocketConnector.field_o[dupTemp$0] + 1;
                        }
                        AccountRequestReply.field_f = AccountRequestReply.field_f + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_46_0 = ~param4.field_a;
          }
          if (stackIn_46_0 < -1 &&
            param4.field_z != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ProxySocketConnector.field_o.length)) {
              var10Lifetime1 = ProxySocketConnector.field_o[var9Lifetime1];
              ProxySocketConnector.field_o[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_62_0 = var5;
          stackIn_62_1 = new StringBuilder().append("lj.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(')').toString());
        }
    }

    final static void readPackedPlayerStats(boolean param0, PacketBuffer param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          EmailValidator.field_s = param1.readUnsignedShort((byte) 83) << 5;
          var2_int = param1.readUnsignedByte(11132);
          EmailValidator.field_s = EmailValidator.field_s + (var2_int >> 3);
          ValidationMessageWidget.field_X = (var2_int & 7) << 18;
          ValidationMessageWidget.field_X = ValidationMessageWidget.field_X + (param1.readUnsignedShort((byte) -43) << 2);
          var2_intLifetime1 = param1.readUnsignedByte(11132);
          if (!param0) {
            field_r = 0.6400812864303589f;
          }
          ValidationMessageWidget.field_X = ValidationMessageWidget.field_X + (var2_intLifetime1 >> 6);
          DigestHelpers.field_b = (63 & var2_intLifetime1) << 15;
          DigestHelpers.field_b = DigestHelpers.field_b + (param1.readUnsignedByte(11132) << 7);
          var2_intLifetime2 = param1.readUnsignedByte(11132);
          AudioPumpThread.field_j = (var2_intLifetime2 & 1) << 16;
          DigestHelpers.field_b = DigestHelpers.field_b + (var2_intLifetime2 >> 1);
          AudioPumpThread.field_j = AudioPumpThread.field_j + param1.readUnsignedShort((byte) 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("lj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    CheckboxPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 1;
        this.field_m = 1;
        try {
          this.field_l = param9;
          this.field_e = param1;
          this.field_p = param0;
          this.field_a = param6;
          this.field_n = param8;
          this.field_q = param2;
          this.field_f = param5;
          this.field_c = param3;
          this.field_o = param7;
          this.field_b = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static int getKeyIdleTicks(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -28791807) {
            CheckboxPainter.setupNewGameScene(43);
          }
          stackIn_4_0 = ScrollPane.field_Fb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "lj.A(" + param0 + ')');
        }
    }

    static {
        field_k = "The game options are not all set.";
        field_i = "<%0> has dropped out.";
    }
}
