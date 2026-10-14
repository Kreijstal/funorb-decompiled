/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int field_g;
    static String field_c;
    private boolean field_f;
    static IndexedSprite[] field_i;
    static ta field_l;
    private int field_h;
    private int[] field_k;
    static MusicTrack field_j;
    static QuickChatParameterType field_m;
    private int field_b;
    static int cyclesDue;
    static String field_d;
    static RgbSprite field_e;
    static String field_n;

    public static void a(boolean param0) {
        field_j = null;
        field_d = null;
        field_m = null;
        field_n = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_c = null;
        if (!param0) {
          PacketBuffer var2 = (PacketBuffer) null;
          c.a(6, -63, 125, -38, (PacketBuffer) null);
          return;
        }
    }

    final static void writeChatMessage(int messageId, String recipientName, byte obfuscationGuard, int channel, int opcode, String text) {
        BitPacketBuffer packet = null;
        int bodyStart = 0;
        try {
          packet = TextFieldValidator.outgoingPackets;
          BitPacketBuffer packetAlias = packet;
          int guardDivision = -44 / ((-59 - obfuscationGuard) / 38);
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          bodyStart = packet.position;
          packet.writeByte(86, channel);
          if (channel == 2) {
            packet.writeCp1252String(recipientName, -1);
          }
          if (text != null) {
            InstructionsScreen.writeCompressedString(26152, text, packet);
          } else {
            packet.writeShort((byte) 123, messageId);
          }
          packet.backfillByteLength((byte) 116, packet.position - bodyStart);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "c.I(" + messageId + ',' + (recipientName != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + channel + ',' + opcode + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_h < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 != this.field_h) {
          ArrayOperations.copy(this.field_k, 1 + param1, this.field_k, param1, -param1 + this.field_h);
          this.field_h = this.field_h - 1;
          if (param0 != 46) {
            field_c = (String) null;
            return;
          }
          return;
        }
        this.field_h = this.field_h - 1;
        if (param0 != 46) {
          field_c = (String) null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, boolean param4, byte param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var11;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (param3) {
          if (param3) {
            ValidationStatus.field_f = LobbyPlayer.field_Pb;
            MusicPatch.a(-128, param3);
            if (TextLineLayout.field_b > 0) {
              DateFieldsWidget.a(param8, param3, -94, param2);
            }
            AppletGameShell.field_e.horizontalAlignment = 1;
            AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
            if (0 < IntArrayRequest.field_j) {
              n.a(param2, param8, param3, (byte) -76);
            }
            if (TableDataRequest.field_m > 0) {
              nh.a(true, param3, param8, param2, param7);
            }
            if (hc.field_c &&
              o.currentLobbyGame.maxPlayers <= o.currentLobbyGame.playerCount) {
              IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
              Ball.field_A.enabled = false;
              jh.a(true, IsaacGenerator.field_b.content);
            } else {
              IsaacGenerator.field_b.viewport.text = null;
              Ball.field_A.enabled = true;
              MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
            }
          } else {
            ValidationStatus.field_f = (kp.field_a - 640) / 2;
            MusicPatch.a(-128, param3);
            if (TextLineLayout.field_b > 0) {
              DateFieldsWidget.a(param8, param3, -94, param2);
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (hc.field_c &&
                o.currentLobbyGame.maxPlayers <= o.currentLobbyGame.playerCount) {
                IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                Ball.field_A.enabled = false;
                jh.a(true, IsaacGenerator.field_b.content);
              } else {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (!hc.field_c) {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              } else {
                if (o.currentLobbyGame.maxPlayers > o.currentLobbyGame.playerCount) {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                  Ball.field_A.enabled = false;
                  jh.a(true, IsaacGenerator.field_b.content);
                }
              }
            }
          }
        } else {
          if (Rasterizer2D.width == kp.field_a) {
            if (Rasterizer2D.height != IsaacGenerator.field_i &&
              Rasterizer2D.height == BallPulseEffect.framebuffer.height &&
              Rasterizer2D.width == BallPulseEffect.framebuffer.width) {
              if (o.currentLobbyGame != null) {
                CacheIoRequest.a(true, false);
              } else {
                if (null != nl.pendingLobbyGame) {
                  CacheIoRequest.a(true, true);
                } else {
                  NanoGameClock.b(31);
                }
              }
            }
            if (param3) {
              ValidationStatus.field_f = LobbyPlayer.field_Pb;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (hc.field_c &&
                o.currentLobbyGame.maxPlayers <= o.currentLobbyGame.playerCount) {
                IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                Ball.field_A.enabled = false;
                jh.a(true, IsaacGenerator.field_b.content);
              } else {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              ValidationStatus.field_f = (kp.field_a - 640) / 2;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (!hc.field_c) {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              } else {
                if (o.currentLobbyGame.maxPlayers > o.currentLobbyGame.playerCount) {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                  Ball.field_A.enabled = false;
                  jh.a(true, IsaacGenerator.field_b.content);
                }
              }
            }
          } else {
            if (Rasterizer2D.height == BallPulseEffect.framebuffer.height &&
              Rasterizer2D.width == BallPulseEffect.framebuffer.width) {
              if (o.currentLobbyGame != null) {
                CacheIoRequest.a(true, false);
              } else {
                if (null != nl.pendingLobbyGame) {
                  CacheIoRequest.a(true, true);
                } else {
                  NanoGameClock.b(31);
                }
              }
            }
            if (param3) {
              ValidationStatus.field_f = LobbyPlayer.field_Pb;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.horizontalAlignment = 1;
              AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (hc.field_c &&
                o.currentLobbyGame.maxPlayers <= o.currentLobbyGame.playerCount) {
                IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                Ball.field_A.enabled = false;
                jh.a(true, IsaacGenerator.field_b.content);
              } else {
                IsaacGenerator.field_b.viewport.text = null;
                Ball.field_A.enabled = true;
                MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              ValidationStatus.field_f = (kp.field_a - 640) / 2;
              MusicPatch.a(-128, param3);
              if (TextLineLayout.field_b > 0) {
                DateFieldsWidget.a(param8, param3, -94, param2);
                AppletGameShell.field_e.horizontalAlignment = 1;
                AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
                if (0 < IntArrayRequest.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                }
                if (TableDataRequest.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                }
                if (hc.field_c &&
                  o.currentLobbyGame.maxPlayers <= o.currentLobbyGame.playerCount) {
                  IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                  Ball.field_A.enabled = false;
                  jh.a(true, IsaacGenerator.field_b.content);
                } else {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                }
              } else {
                AppletGameShell.field_e.horizontalAlignment = 1;
                AppletGameShell.field_e.textInset = Paddle.field_C.textInset;
                if (0 < IntArrayRequest.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                }
                if (TableDataRequest.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                }
                if (!hc.field_c) {
                  IsaacGenerator.field_b.viewport.text = null;
                  Ball.field_A.enabled = true;
                  MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  if (o.currentLobbyGame.maxPlayers > o.currentLobbyGame.playerCount) {
                    IsaacGenerator.field_b.viewport.text = null;
                    Ball.field_A.enabled = true;
                    MusicVoice.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                  } else {
                    IsaacGenerator.field_b.viewport.text = GameCanvas.field_d;
                    Ball.field_A.enabled = false;
                    jh.a(true, IsaacGenerator.field_b.content);
                  }
                }
              }
            }
          }
        }
        TextWidgetRenderer.a(param6, param9, param4, param0, param2, param1, (byte) -114);
        MusicVoice.a(param4, TimedSplashScreen.field_u, param2, param0, 121);
        if (param5 <= 6) {
          field_g = -90;
        }
        BirthDateValidator.field_h = BirthDateValidator.field_h + 1;
    }

    final static void a(int param0, int param1, int param2, int param3, PacketBuffer param4) {
        try {
          param4.writeByte(33, param1);
          param4.writeShort((byte) 115, 17);
          param4.writeShort((byte) 120, param0);
          param4.writeShort((byte) 107, param2);
          param4.writeByte(5, param3);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "c.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = this.field_k.length;
        if (param0 != 1) {
          return -35;
        }
        while (param1 >= var3) {
          if (!this.field_f) {
            var3 = var3 + this.field_b;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_b;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.b(1, param0)];
        int[] var3 = var4;
        ArrayOperations.copy(this.field_k, 0, var4, 0, this.field_k.length);
        this.field_k = var4;
        if (param1 != -7877) {
          this.field_k = (int[]) null;
          return;
        }
    }

    private c() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_h < param2) {
          this.field_h = param2;
        }
        if (param1 != 0) {
          field_g = 55;
          if (param2 >= this.field_k.length) {
            this.a(param2, -7877);
            this.field_k[param2] = param0;
            return;
          }
          this.field_k[param2] = param0;
          return;
        }
        if (param2 < this.field_k.length) {
          this.field_k[param2] = param0;
          return;
        }
        this.a(param2, -7877);
        this.field_k[param2] = param0;
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
          this.a(param1, 0, 1 + this.field_h);
          return;
        }
        this.a(-78, -117);
        this.a(param1, 0, 1 + this.field_h);
    }

    final int b(boolean param0) {
        if (!param0) {
          return -51;
        }
        return 1 + this.field_h;
    }

    final int a(int param0, byte param1) {
        if (this.field_h < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 64) {
          return this.field_k[param0];
        }
        field_c = (String) null;
        return this.field_k[param0];
    }

    static {
        field_g = 250;
        field_d = "Create";
        field_c = "Accept";
        field_n = "Real-life threats";
        field_m = new QuickChatParameterType(7, 0, 1, 1);
    }
}
