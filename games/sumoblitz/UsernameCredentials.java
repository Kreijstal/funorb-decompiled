/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UsernameCredentials extends LoginCredentials {
    private String password;
    private long usernameKey;
    static int field_e;
    static int field_h;

    final void writeCredentials(PacketBuffer packet, byte guard) {
        try {
          packet.writeLong(false, this.usernameKey);
          packet.writeBase38Name(this.password, 27);
          if (guard > -107) {
            PacketBuffer var4 = (PacketBuffer) null;
            this.writeCredentials((PacketBuffer) null, (byte) -83);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jb.C(" + (packet != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static String readHuffmanText(PacketBuffer packet, int maxLength, int guard) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = packet.readUnsignedSmart(false);
            if (var3_int > maxLength) {
              var3_int = maxLength;
            }
            var4 = new byte[var3_int];
            packet.position = packet.position + LegacyOpenGlUnderwaterEffect.field_g.a(0, packet.position, var4, 116, var3_int, packet.payload);
            var5 = SoftLruCache.decodeCp1252(var4, 0, var3_int, 26564);
            if (guard == -14832) {
              stackIn_7_0 = var5;
              return stackIn_7_0;
            }
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("jb.A(");
          if (packet == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(maxLength).append(',').append(guard).append(')').toString());
        }
    }

    final static void writeAppletSettings(byte guard, String settings, java.applet.Applet applet) {
        try {
          String var7 = null;
          String var6 = null;
          String var5 = null;
          String var8 = null;
          String var6Lifetime1;
          String var6Lifetime2;
          String var6Lifetime3;
          String var6Lifetime4;
          String var6Lifetime5;
          String var6Lifetime6;
          try {
            IntIndexHashTable.field_d = settings;
            try {
              int var4 = 82 / ((guard + 62) / 49);
              var7 = applet.getParameter("cookieprefix");
              var6 = var7;
              var6Lifetime1 = var7;
              var5 = applet.getParameter("cookiehost");
              var6Lifetime2 = var5;
              var6Lifetime3 = var5;
              var8 = var7 + "settings=" + settings + "; version=1; path=/; domain=" + var5;
              var6Lifetime4 = var8;
              var6Lifetime5 = var8;
              if (settings.length() == 0) {
                var6Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var6Lifetime6 = var8 + "; Expires=" + ExpandingRingEffect.formatCookieDate(94608000000L + wq.monotonicTimeMillis(-6), true) + "; Max-Age=" + 94608000L;
              }
              tw.a("document.cookie=\"" + var6Lifetime6 + "\"", -15428, applet);
            } catch (Throwable throwable) {
            }
            RotarySelectorRenderer.updateAppletNavigationLinks(false, applet);
          } catch (RuntimeException runtimeException) {
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jb.D(" + guard + ',' + (settings != null ? "{...}" : "null") + ',' + (applet != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int pollLogin(String username, boolean jagexHosted, byte guard, boolean reconnect, int affiliateId, String password) {
        try {
          int stackIn_3_0 = 0;
          int stackIn_8_0 = 0;
          int stackIn_33_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_73_0 = 0;
          int stackIn_83_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_96_0 = 0;
          RuntimeException stackIn_99_0 = null;
          StringBuilder stackIn_99_1 = null;
          String stackIn_100_2 = null;
          StringBuilder stackIn_102_1 = null;
          String stackIn_103_2 = null;
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
          var9 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (guard < 15) {
              stackIn_3_0 = -61;
              return stackIn_3_0;
            }
            if (DisplayModeConfirmationDialog.field_O == null &&
              !GridWidgetContainer.a((byte) -34, reconnect)) {
              stackIn_8_0 = -1;
              return stackIn_8_0;
            }
            if (kw.field_c == gg.field_t) {
              if (reconnect) {
                var10 = (String) null;
                LegacyOpenGlBuffer.field_d = LoginCredentialFactory.createCredentials(lb.field_a, false, (String) null, password, false);
              } else {
                LegacyOpenGlBuffer.field_d = MouseInputHandler.credentialsForLogin(false, username, password, (byte) -94);
              }
              InwardSparkParticle.field_v.position = 0;
              InwardSparkParticle.field_v.writeByte((byte) 42, 14);
              InwardSparkParticle.field_v.writeByte((byte) 96, LegacyOpenGlBuffer.field_d.credentialType((byte) 126).wireId);
              MessageDialog.a(0, -1);
              kw.field_c = LegacyOpenGlRidgedWaterEffect.field_g;
            }
            if (kw.field_c == LegacyOpenGlRidgedWaterEffect.field_g &&
              OpenGlIndexBuffer.b(-1, 1)) {
              var6_int = ig.field_a.readUnsignedByte(-31302);
              if (var6_int != 0) {
                TextureFormat.field_a = var6_int;
                gu.field_d = -1;
                kw.field_c = WidgetContainer.field_z;
              } else {
                kw.field_c = OpenGlVertexBuffer.field_q;
              }
              ig.field_a.position = 0;
            }
            if (kw.field_c == OpenGlVertexBuffer.field_q &&
              OpenGlIndexBuffer.b(-1, 8)) {
              HardwareUnlitEffect.field_g = ig.field_a.readLong((byte) 127);
              ig.field_a.position = 0;
              LoginPacketWriter.sendLoginPacket(reconnect, jagexHosted, -12793, affiliateId, LegacyOpenGlBuffer.field_d);
              kw.field_c = jj.field_f;
            }
            boolean decompiledFrameRemainder0 = true;
            if (kw.field_c == jj.field_f &&
              OpenGlIndexBuffer.b(-1, 1)) {
              var6_intLifetime1 = ig.field_a.readUnsignedByte(-31302);
              TextureFormat.field_a = var6_intLifetime1;
              ig.field_a.position = 0;
              SoftwareRenderContext.field_b = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  kw.field_c = WidgetContainer.field_z;
                  gu.field_d = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  kk.a((byte) -128);
                  LimitedRandomAccessFile.field_g = false;
                  stackIn_33_0 = var6_intLifetime1;
                  return stackIn_33_0;
                }
              }
              if (decompiledFrameRemainder0) {
                kw.field_c = MusicVoice.field_l;
                gu.field_d = -1;
              }
            }
            if (kw.field_c == MusicVoice.field_l &&
              lt.a((byte) 119)) {
              lb.field_a = ig.field_a.readLong((byte) 114);
              Bzip2State.field_j = ig.field_a.readUnsignedByte(-31302);
              ig.field_a.readUnsignedByte(-31302);
              HardwareRidgedWaterNoise.field_x = ig.field_a.readUnsignedShort(255);
              var6 = ig.field_a.readNullableString((byte) 92);
              var7 = ig.field_a.readUnsignedByte(-31302);
              if ((var7 & 1) != 0) {
                MarkerTrackWidget.persistRandomDataAndAdvance(24);
              }
              if (!reconnect) {
                stackIn_43_0 = ((4 & var7) != 0);
                wo.field_c = stackIn_43_0;
                stackIn_46_0 = ((var7 & 8) != 0);
                IntrusiveDequeCursor.field_b = stackIn_46_0;
                if (IntrusiveDequeCursor.field_b) {
                }
              }
              if (gn.field_d) {
                ig.field_a.readUnsignedByte(-31302);
                ig.field_a.readUnsignedByte(-31302);
                ig.field_a.readInt(true);
                pl.field_y = ig.field_a.readUnsignedShort(255);
                WidgetStateStyle.field_b = new byte[pl.field_y];
                for (var8 = 0; var8 < pl.field_y; var8++) {
                  WidgetStateStyle.field_b[var8] = ig.field_a.readByte(true);
                }
              }
              qv.field_o = ig.field_a.readCp1252String(-1);
              var11 = (CharSequence) ((Object) qv.field_o);
              PasswordValidator.field_f = AccountCreationProgressDialog.normalizeAccountName(-1, var11);
              jk.field_c = ig.field_a.readUnsignedByte(-31302);
              kw.field_c = LegacyOpenGlUnderwaterEffect.field_j;
              if (LegacyOpenGlBuffer.field_d.credentialType((byte) 113) != IndexedSprite.EMAIL_CREDENTIALS) {
                if (LegacyOpenGlBuffer.field_d.credentialType((byte) 89) == ProxyAuthenticationRequiredException.USERNAME_CREDENTIALS) {
                  LevelSelectScreen.field_j.a(true, LegacyOpenGlUnlitEffect.c(2));
                }
              } else {
                OpenGlTexture3D.field_m.a(true, LegacyOpenGlUnlitEffect.c(2));
              }
              LimitedRandomAccessFile.field_g = false;
              if (var6 != null) {
                UsernameCredentials.writeAppletSettings((byte) -118, var6, LegacyOpenGlUnlitEffect.c(2));
              }
              if (HardwareRidgedWaterNoise.field_x <= 0 &&
                !wo.field_c) {
                try {
                  tw.a(LegacyOpenGlUnlitEffect.c(2), 93, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  tw.a(-111, LegacyOpenGlUnlitEffect.c(2), "zap", new Object[]{MusicPatch.a(-29275, lb.field_a)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (HardwareRidgedWaterNoise.field_x > 0) {
                qn.field_a = true;
              }
              InwardSparkParticle.field_v.a((byte) 64, RendererSession.isaacSeed);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                RendererSession.isaacSeed[var8Lifetime1] = RendererSession.isaacSeed[var8Lifetime1] + 50;
              }
              ig.field_a.a((byte) 123, RendererSession.isaacSeed);
              stackIn_73_0 = TextureFormat.field_a;
              return stackIn_73_0;
            }
            if (kw.field_c == WidgetContainer.field_z &&
              lt.a((byte) 119)) {
              kk.a((byte) -115);
              if (TextureFormat.field_a == 7 &&
                !LimitedRandomAccessFile.field_g) {
                LimitedRandomAccessFile.field_g = true;
                stackIn_85_0 = -1;
                return stackIn_85_0;
              }
              if (7 == TextureFormat.field_a) {
                TextureFormat.field_a = 3;
              }
              MouseWheelInput.field_c = ig.field_a.readCp1252String(-1);
              LimitedRandomAccessFile.field_g = false;
              stackIn_83_0 = TextureFormat.field_a;
              return stackIn_83_0;
            }
            if (DisplayModeConfirmationDialog.field_O == null) {
              if (LimitedRandomAccessFile.field_g) {
                if (uc.b(26560) <= 30000L) {
                  MouseWheelInput.field_c = GridWidgetContainer.errorConnectingToServerText;
                } else {
                  MouseWheelInput.field_c = HotspotTextWidget.connectionTimedOutPleaseText;
                }
                LimitedRandomAccessFile.field_g = false;
                stackIn_94_0 = 3;
                return stackIn_94_0;
              }
              var6_intLifetime2 = vp.field_a;
              vp.field_a = LoginCredentialType.field_b;
              LimitedRandomAccessFile.field_g = true;
              LoginCredentialType.field_b = var6_intLifetime2;
            }
            stackIn_96_0 = -1;
            return stackIn_96_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_99_0 = var6_ref;
            stackIn_99_1 = new StringBuilder().append("jb.F(");
            if (username == null) {
              stackIn_100_2 = "null";
            } else {
              stackIn_100_2 = "{...}";
            }
            stackIn_102_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(jagexHosted).append(',').append(guard).append(',').append(reconnect).append(',').append(affiliateId).append(',');
            if (password == null) {
              stackIn_103_2 = "null";
            } else {
              stackIn_103_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    LoginCredentialType credentialType(byte guard) {
        if (guard < 80) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          UsernameCredentials.writeAppletSettings((byte) -100, (String) null, (java.applet.Applet) null);
        }
        return ProxyAuthenticationRequiredException.USERNAME_CREDENTIALS;
    }

    final static Sprite loadNamedSprite(String groupName, String fileName, int guard, ResourceArchive archive) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Sprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = archive.groupId(0, groupName);
          var5 = archive.fileId(var4_int, fileName, (byte) 127);
          var6 = -88 % ((-10 - guard) / 46);
          stackIn_1_0 = TextInputValidator.a(var5, -11481, archive, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("jb.E(");
          if (groupName == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (fileName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(',');
          if (archive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    UsernameCredentials(long nameKey, String secret) {
        try {
          this.usernameKey = nameKey;
          this.password = secret;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jb.<init>(" + nameKey + ',' + (secret != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
