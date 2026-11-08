/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static String field_j;
    static String[] field_h;
    static RgbSprite field_e;
    static int field_i;
    static int field_c;
    static int field_d;
    static SceneWidget field_a;
    int field_g;
    static String field_f;
    static RgbSprite[] field_k;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != -1) {
          field_e = (RgbSprite) null;
        }
        return ByteStorage.field_c.b(64);
    }

    final static String a(boolean param0) {
        if (DiskCacheWorker.field_j == AccountTermsPanel.field_ab) {
          return StripedProgressBar.field_ab;
        }
        if (AccountTermsPanel.field_ab == jn.field_b) {
          return ThreeSliceButtonPainter.field_z;
        }
        if (!gf.field_a.isComplete((byte) -72)) {
          return ThreeSliceButtonPainter.field_z;
        }
        if (!param0) {
          field_e = (RgbSprite) null;
        }
        return LobbyPlayer.field_Xb;
    }

    final static int a(int param0, int param1, String param2, boolean param3, boolean param4, String param5) {
        try {
          int stackIn_7_0 = 0;
          int stackIn_33_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_55_0 = false;
          int stackIn_86_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_98_0 = 0;
          int stackIn_105_0 = 0;
          int stackIn_108_0 = 0;
          RuntimeException stackIn_111_0 = null;
          StringBuilder stackIn_111_1 = null;
          String stackIn_112_2 = null;
          StringBuilder stackIn_114_1 = null;
          String stackIn_115_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = SteelSentinels.obfuscationControl;
          try {
            if (param0 > -98) {
              field_d = -13;
            }
            if (null == rb.field_h &&
              !SectorCacheStore.a(127, param4)) {
              stackIn_7_0 = -1;
              return stackIn_7_0;
            }
            if (SocialRequestHelpers.field_d == rn.field_v) {
              if (param4) {
                var10 = (String) null;
                MidiPcmStream.field_T = qi.a(false, PasswordFieldPainter.field_w, param5, 0, (String) null);
              } else {
                MidiPcmStream.field_T = SpriteFrame.createLoginCredentials(param2, param5, -20407, false);
              }
              ClockAndCookieHelpers.field_g.position = 0;
              ClockAndCookieHelpers.field_g.writeByte((byte) 115, 14);
              ClockAndCookieHelpers.field_g.writeByte((byte) 109, MidiPcmStream.field_T.type((byte) 121).field_e);
              gj.a(0, -1);
              rn.field_v = SocketJs5Transport.field_D;
            }
            if (rn.field_v == SocketJs5Transport.field_D &&
              AssetDecoders.fillIncomingBuffer((byte) -127, 1)) {
              var6_int = LoginConnectionStage.field_d.readUnsignedByte((byte) -55);
              LoginConnectionStage.field_d.position = 0;
              if (var6_int == 0) {
                rn.field_v = ClientException.field_d;
              } else {
                ViewportController.field_f = -1;
                rn.field_v = QuickChatCategory.field_G;
                ArrayWidgetContainer.field_N = var6_int;
              }
            }
            if (rn.field_v == ClientException.field_d &&
              AssetDecoders.fillIncomingBuffer((byte) -108, 8)) {
              TextButton.field_G = LoginConnectionStage.field_d.readLong((byte) -115);
              LoginConnectionStage.field_d.position = 0;
              ValidatedTextWidget.a(param4, 2, param3, MidiPcmStream.field_T, param1);
              rn.field_v = uf.field_g;
            }
            boolean decompiledFrameRemainder0 = true;
            if (rn.field_v == uf.field_g &&
              AssetDecoders.fillIncomingBuffer((byte) -86, 1)) {
              var6_intLifetime1 = LoginConnectionStage.field_d.readUnsignedByte((byte) -68);
              LoginConnectionStage.field_d.position = 0;
              EmailCredentials.field_k = null;
              ArrayWidgetContainer.field_N = var6_intLifetime1;
              if (0 != var6_intLifetime1 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  ViewportController.field_f = -1;
                  rn.field_v = QuickChatCategory.field_G;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  LoginForm.m(-123);
                  AlphaContainer.field_T = false;
                  stackIn_33_0 = var6_intLifetime1;
                  return stackIn_33_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ViewportController.field_f = -1;
                rn.field_v = Projectile.field_N;
              }
            }
            if (Projectile.field_N == rn.field_v &&
              LoginForm.n(121)) {
              PasswordFieldPainter.field_w = LoginConnectionStage.field_d.readLong((byte) -101);
              gj.field_b = param5;
              NodeDeque.field_d = LoginConnectionStage.field_d.readUnsignedByte((byte) -65);
              di.field_h = LoginConnectionStage.field_d.readUnsignedByte((byte) -54);
              rd.field_b = LoginConnectionStage.field_d.readUnsignedShort((byte) -60);
              var6 = LoginConnectionStage.field_d.readNullableString(-122);
              var7 = LoginConnectionStage.field_d.readUnsignedByte((byte) -128);
              if (0 != (1 & var7)) {
                ed.b((byte) -105);
              }
              stackIn_44_0 = ((16 & var7) != 0);
              CipherPacketBuffer.field_B = stackIn_44_0;
              if (!param4) {
                stackIn_49_0 = ((8 & var7) != 0);
                fj.field_e = stackIn_49_0;
                stackIn_52_0 = (0 != (2 & var7));
                uc.field_g = stackIn_52_0;
                stackIn_55_0 = (0 != (4 & var7));
                ChecksumAndFrameHelpers.field_g = stackIn_55_0;
                if (fj.field_e) {
                  uc.field_g = true;
                }
              }
              if (cd.field_a) {
                LoginConnectionStage.field_d.readUnsignedByte((byte) -118);
                LoginConnectionStage.field_d.readUnsignedByte((byte) -83);
                LoginConnectionStage.field_d.readInt(0);
                GradientOutlineTextPainter.field_q = LoginConnectionStage.field_d.readUnsignedShort((byte) -60);
                AccountTermsPanel.field_Y = new byte[GradientOutlineTextPainter.field_q];
                for (var8 = 0; var8 < GradientOutlineTextPainter.field_q; var8++) {
                  AccountTermsPanel.field_Y[var8] = LoginConnectionStage.field_d.readByte((byte) -2);
                }
              }
              GrowableIntList.field_l = LoginConnectionStage.field_d.readString(1);
              var11 = (CharSequence) ((Object) GrowableIntList.field_l);
              MembershipPromotionScreen.field_r = AlphaContainer.a(1, var11);
              ReflectionCheck.field_o = LoginConnectionStage.field_d.readUnsignedByte((byte) -106);
              rn.field_v = AccountNoticeDialog.field_sb;
              if (MidiPcmStream.field_T.type((byte) 69) == ArticulatedPart.field_F) {
                PartInstruction.field_o.rememberLoginMethod(-48, Projectile.d((byte) -21));
              } else {
                if (MidiPcmStream.field_T.type((byte) 108) == QuickChatHelpDialog.field_Sb) {
                  TabbedPanel.field_Vb.rememberLoginMethod(-70, Projectile.d((byte) -21));
                }
              }
              AlphaContainer.field_T = false;
              if (var6 != null) {
                LoginStateQueries.writeSettingsCookie(var6, Projectile.d((byte) -21), 124);
              }
              if (0 >= rd.field_b &&
                !ChecksumAndFrameHelpers.field_g) {
                try {
                  JavaScriptBridge.callWindowFunction(Projectile.d((byte) -21), (byte) -96, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWindowFunctionWithArguments("zap", (byte) -41, Projectile.d((byte) -21), new Object[]{LoginActionHelpers.decodeBase37DisplayName(PasswordFieldPainter.field_w, (byte) 65)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (0 < rd.field_b) {
                LoadingProgressDialog.field_ib = true;
              }
              ClockAndCookieHelpers.field_g.initializeOpcodeCipher(-1833430685, dj.field_k);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                dj.field_k[var8Lifetime1] = dj.field_k[var8Lifetime1] + 50;
              }
              LoginConnectionStage.field_d.initializeOpcodeCipher(-1833430685, dj.field_k);
              stackIn_86_0 = ArrayWidgetContainer.field_N;
              return stackIn_86_0;
            }
            if (QuickChatCategory.field_G == rn.field_v &&
              LoginForm.n(110)) {
              LoginForm.m(100);
              if (ArrayWidgetContainer.field_N == 7 &&
                !AlphaContainer.field_T) {
                AlphaContainer.field_T = true;
                stackIn_98_0 = -1;
                return stackIn_98_0;
              }
              if (ArrayWidgetContainer.field_N == 7) {
                ArrayWidgetContainer.field_N = 3;
              }
              di.field_e = LoginConnectionStage.field_d.readString(1);
              AlphaContainer.field_T = false;
              stackIn_96_0 = ArrayWidgetContainer.field_N;
              return stackIn_96_0;
            }
            if (null == rb.field_h) {
              if (AlphaContainer.field_T) {
                if (30000L >= LoadingProgressDialog.l(150)) {
                  di.field_e = ValidatedTextWidget.field_mb;
                } else {
                  di.field_e = CipherPacketBuffer.field_E;
                }
                AlphaContainer.field_T = false;
                stackIn_105_0 = 3;
                return stackIn_105_0;
              }
              var6_intLifetime2 = UiTheme.field_l;
              UiTheme.field_l = ArchiveRequest.field_F;
              AlphaContainer.field_T = true;
              ArchiveRequest.field_F = var6_intLifetime2;
            }
            stackIn_108_0 = -1;
            return stackIn_108_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_111_0 = var6_ref;
            stackIn_111_1 = new StringBuilder().append("jj.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_112_2 = "null";
            } else {
              stackIn_112_2 = "{...}";
            }
            stackIn_114_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_115_2 = "null";
            } else {
              stackIn_115_2 = "{...}";
            }
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_111_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_e = null;
        field_j = null;
        field_b = null;
        field_a = null;
        field_f = null;
        if (param0 > -116) {
          field_k = (RgbSprite[]) null;
        }
        field_k = null;
    }

    static {
        field_h = new String[]{"HEALTH", "<%0> kPm", "SHIELDS", "<%0> GJ", "ENERGY CAPACITY", "<%0> TJ", "ENERGY GENERATION", "<%0> GJ/s", "JUMP", "<%0>%", "THRUST", "<%0>%"};
        field_c = -1;
        field_j = "<%0> has entered another game.";
        field_e = new RgbSprite(28, 28);
        field_f = "Waiting for <%0> to start the game...";
        field_b = "You have been removed from <%0>'s game.";
    }
}
