/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    long field_p;
    byte[] field_l;
    static IntrusiveDeque field_o;
    int field_i;
    static byte[][] field_k;
    static ScoreSubmissionHelpers field_h;
    static int field_j;
    static java.awt.Frame field_m;
    static String field_g;
    static boolean field_n;

    final static int floorMod(int param0, int param1, int param2) {
        int var3 = param1 >> 31 & param0 - 1;
        if (param2 != 1) {
          return 82;
        }
        return var3 + ((param1 >>> 31) + param1) % param0;
    }

    final static void setProjectionCentre(int param0, int param1, int param2) {
        QuickChatPhraseRegistry.field_i = param2;
        PendingHighscoreRequest.field_q = param0;
        if (param1 != 23) {
          field_k = (byte[][]) null;
        }
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        field_g = null;
        field_k = (byte[][]) null;
        field_h = null;
        field_m = null;
        if (param0 >= -59) {
          DelayedPacket.handleSocialListPacket(-31);
        }
    }

    DelayedPacket(long param0, int param1, byte[] param2) {
        try {
          this.field_i = param1;
          this.field_l = param2;
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "bj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void handleSocialListPacket(int param0) {
        LobbyPlayerEntry stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        int stackIn_102_0 = 0;
        LobbyPlayerEntry stackIn_109_0 = null;
        boolean stackIn_110_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        LobbyPlayerEntry var3_ref_lk = null;
        int var4 = 0;
        LobbyGame var4_ref_he = null;
        int var5 = 0;
        String var6 = null;
        LobbyGame var6_ref = null;
        LobbyPlayerEntry var7 = null;
        LobbyPlayerEntry var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyGame var13 = null;
        LobbyPlayerEntry var15 = null;
        Object var16 = null;
        Object var17 = null;
        LobbyGame var17_ref = null;
        LobbyPlayerEntry var18 = null;
        String var19 = null;
        String var20 = null;
        LobbyPlayerEntry var21 = null;
        LobbyPlayerEntry var22 = null;
        Object var23 = null;
        LobbyGame var23_ref = null;
        LobbyGame var24 = null;
        Object var25 = null;
        LobbyPlayerEntry var26 = null;
        String var27 = null;
        String var28 = null;
        LobbyPlayerEntry var29 = null;
        LobbyGame var30 = null;
        LobbyGame var31 = null;
        LobbyPlayerEntry var3_ref_lkLifetime1;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var23 = null;
        var17 = null;
        var16 = null;
        var25 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = ProgressMessageDialog.field_qb;
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
          if (param0 >= -3) {
            return;
          }
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            var2 != 4) {
            if (5 == var2) {
              var3_long = ((PacketBuffer) ((Object) var1)).readLong((byte) -60);
              var27 = ((PacketBuffer) ((Object) var1)).readString(-127);
              var6 = ((PacketBuffer) ((Object) var1)).readString(-124);
              var28 = ((PacketBuffer) ((Object) var1)).readString(-119);
              var29 = Bzip2State.findLobbyPlayer(var3_long, false);
              var8 = var29;
              stackIn_102_0 = (var6.equals("")) ? 0 : 1;
              var9 = stackIn_102_0;
              if (var29 != null) {
                if (var9 != 0) {
                  var29.updateNames(var28, var27, 0);
                }
              } else {
                var8 = new LobbyPlayerEntry(var27, var28, var3_long);
                LinkTextPainter.field_i.put(var3_long, var8, 30804);
              }
              var8.field_Ib = ClockAndTextHelpers.monotonicMillis(-9986) - (long)((PacketBuffer) ((Object) var1)).readInt((byte) 123);
              var8.field_Vb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 33);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt(0);
              var8.field_Rb = var10 >> 1;
              stackIn_109_0 = var8;
              stackIn_110_1 = (0 != (1 & var10));
              stackIn_109_0.field_Jb = stackIn_110_1;
              var8.field_Ub = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
              var8.field_Fb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
              WidgetLayerStack.insertLobbyPlayerSorted(var8, (byte) 95);
              return;
            }
            if (6 == var2) {
              var3_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -60);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
              var26 = Bzip2State.findLobbyPlayer(var3_longLifetime1, false);
              if (var26 == null) {
                return;
              }
              if (var26.field_Sb) {
                DrawQueueGlobals.field_a = DrawQueueGlobals.field_a - 1;
                var26.field_Sb = false;
              }
              if (var5 != 0) {
                var26.field_Wb = var5;
                var26.field_Gb = LobbySessionHelpers.field_c;
              } else {
                var26.unlink(false);
              }
              var26.unlinkSecondary(44);
              return;
            }
            if (var2 == 7) {
              var15 = (LobbyPlayerEntry) (PasswordConfirmationValidator.field_o.first((byte) -77));
              while (var15 != null) {
                var15.unlink(false);
                var15.unlinkSecondary(53);
                var15 = (LobbyPlayerEntry) (PasswordConfirmationValidator.field_o.next(16213));
              }
              DrawQueueGlobals.field_a = 0;
              return;
            }
            if (8 == var2) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 100);
              var4_ref_he = (LobbyGame) (IntrusiveDequeCursor.field_c.get((long)var3, (byte) -103));
              if (var4_ref_he == null) {
                var4_ref_he = new LobbyGame(TextMetricsGlobals.field_h);
                IntrusiveDequeCursor.field_c.put((long)var3, var4_ref_he, 30804);
              }
              TextFieldPainter.readGameEntry(true, var4_ref_he, true, var1);
              LobbySortHelpers.insertSortedLobbyGame(false, var4_ref_he);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 38);
              var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
              var31 = (LobbyGame) (IntrusiveDequeCursor.field_c.get((long)var3Lifetime4, (byte) 100));
              if (var31 == null) {
                return;
              }
              if (0 == var4) {
                var31.unlink(false);
              } else {
                var31.field_Eb = var4;
                var31.field_Mb = LobbySessionHelpers.field_c;
              }
              var31.unlinkSecondary(25);
              return;
            }
            if (10 == var2) {
              var30 = (LobbyGame) (ProxyAuthenticationRequiredException.field_f.first((byte) -110));
              while (var30 != null) {
                var30.unlink(false);
                var30.unlinkSecondary(11);
                var30 = (LobbyGame) (ProxyAuthenticationRequiredException.field_f.next(16213));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 66);
                var4Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
                var23_ref = (LobbyGame) (IntrusiveDequeCursor.field_c.get((long)var3Lifetime5, (byte) -5));
                if (var23_ref == null) {
                  return;
                }
                var13 = var23_ref;
                var6_ref = var13;
                var23_ref.field_sc = false;
                var13.field_dc = false;
                if (0 != var4Lifetime1) {
                  var23_ref.field_Eb = var4Lifetime1;
                  var23_ref.field_Mb = LobbySessionHelpers.field_c;
                }
                LobbySortHelpers.insertSortedLobbyGame(false, var23_ref);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -60);
                    var19 = ((PacketBuffer) ((Object) var1)).readString(-118);
                    var20 = ((PacketBuffer) ((Object) var1)).readString(-118);
                    var7 = GameSession.findLobbyPlayer(var3_longLifetime2, (byte) -127);
                    if (var7 == null) {
                      var7 = new LobbyPlayerEntry(var19, var20, var3_longLifetime2);
                      IndexedSpriteState.field_h.put(var3_longLifetime2, var7, 30804);
                      AudioSetupHelpers.field_d.field_ic = AudioSetupHelpers.field_d.field_ic + 1;
                    }
                    var7.field_Vb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 75);
                    var8_int = ((PacketBuffer) ((Object) var1)).readVarInt(0);
                    stackIn_52_0 = var7;
                    stackIn_53_1 = (0 != (1 & var8_int));
                    stackIn_52_0.field_Jb = stackIn_53_1;
                    var7.field_Rb = var8_int >> 1;
                    var7.field_Ub = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
                    var7.field_Fb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
                    VerticalScrollbar.field_Mb.addFirst(var7, (byte) -101);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -60);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
                    var18 = GameSession.findLobbyPlayer(var3_longLifetime2, (byte) -127);
                    if (var18 == null) {
                      return;
                    }
                    if (var5Lifetime1 != 0) {
                      var18.field_Gb = LobbySessionHelpers.field_c;
                      var18.field_Wb = var5Lifetime1;
                    } else {
                      var18.unlink(false);
                    }
                    var18.unlinkSecondary(32);
                    AudioSetupHelpers.field_d.field_ic = AudioSetupHelpers.field_d.field_ic - 1;
                    return;
                  }
                  if (var2 == 20) {
                    TextFieldPainter.readGameEntry(false, AudioSetupHelpers.field_d, true, var1);
                    return;
                  }
                  if (21 == var2) {
                    var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -90);
                    if (0 != var3Lifetime5) {
                      TabbedPanel.field_Eb = ClockAndTextHelpers.monotonicMillis(-9986) + (long)var3Lifetime5;
                      return;
                    }
                    TabbedPanel.field_Eb = 0L;
                    return;
                  }
                  if (var2 == 22) {
                    DiskCacheWorker.field_i = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 69);
                    BufferedFile.field_c = ((PacketBuffer) ((Object) var1)).readVarInt(0);
                    return;
                  }
                  if (var2 == 23) {
                    LogoAndLoginHelpers.field_d = ((PacketBuffer) ((Object) var1)).readLong((byte) -60);
                    return;
                  }
                  IconLabelWidget.reportClientError("L1: " + ClientException.describePacketHistory(true), (Throwable) null, 1);
                  MenuInputState.closeGameConnection(false);
                  return;
                }
                var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong((byte) -60);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
                var21 = Bzip2State.findLobbyPlayer(var3_longLifetime2, false);
                if (var21 != null) {
                  if (var2 == 15) {
                    var21.field_Xb = false;
                  } else {
                    if (var21.field_Sb) {
                      DrawQueueGlobals.field_a = DrawQueueGlobals.field_a - 1;
                      var21.field_Sb = false;
                    }
                  }
                  if (0 != var5Lifetime1Lifetime1) {
                    var21.field_Gb = LobbySessionHelpers.field_c;
                    var21.field_Wb = var5Lifetime1Lifetime1;
                  }
                  WidgetLayerStack.insertLobbyPlayerSorted(var21, (byte) 99);
                }
                return;
              }
              var3_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong((byte) -60);
              var22 = Bzip2State.findLobbyPlayer(var3_longLifetime2Lifetime1, false);
              if (var22 != null) {
                if (var2 == 14) {
                  var22.field_Xb = true;
                } else {
                  if (!var22.field_Sb) {
                    var22.field_Sb = true;
                    DrawQueueGlobals.field_a = DrawQueueGlobals.field_a + 1;
                  }
                }
                WidgetLayerStack.insertLobbyPlayerSorted(var22, (byte) 112);
              }
              return;
            }
            var3Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 71);
            var17_ref = (LobbyGame) (IntrusiveDequeCursor.field_c.get((long)var3Lifetime6, (byte) -46));
            var24 = var17_ref;
            if (var24 == null) {
              return;
            }
            if (11 != var2) {
              var24.field_sc = true;
            } else {
              var24.field_dc = true;
            }
            LobbySortHelpers.insertSortedLobbyGame(false, var24);
            return;
          }
          var3_ref_lk = (LobbyPlayerEntry) (VerticalScrollbar.field_Mb.first((byte) -62));
          while (var3_ref_lk != null) {
            var3_ref_lk.unlink(false);
            var3_ref_lk.unlinkSecondary(54);
            var3_ref_lk = (LobbyPlayerEntry) (VerticalScrollbar.field_Mb.next(16213));
          }
          var3_ref_lkLifetime1 = (LobbyPlayerEntry) (LinkTextPainter.field_i.first(true));
          while (var3_ref_lkLifetime1 != null) {
            if (var3_ref_lkLifetime1.field_Xb ||
              var3_ref_lkLifetime1.field_Sb) {
              var3_ref_lkLifetime1.field_Xb = false;
              if (var3_ref_lkLifetime1.field_Sb) {
                DrawQueueGlobals.field_a = DrawQueueGlobals.field_a - 1;
                var3_ref_lkLifetime1.field_Sb = false;
              }
              WidgetLayerStack.insertLobbyPlayerSorted(var3_ref_lkLifetime1, (byte) 114);
            }
            var3_ref_lkLifetime1 = (LobbyPlayerEntry) (LinkTextPainter.field_i.next(-1));
          }
          if (var2 == 1 &&
            AudioSetupHelpers.field_d != null) {
            CommonUiHelpers.field_b = AudioSetupHelpers.field_d.field_Qb;
          }
          if (var2 != 4) {
            AudioSetupHelpers.field_d = null;
          } else {
            var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -66);
            AudioSetupHelpers.field_d = new LobbyGame(TextMetricsGlobals.field_h);
            AudioSetupHelpers.field_d.setSecondaryKey(0, (long)var3Lifetime1);
            TextFieldPainter.readGameEntry(false, AudioSetupHelpers.field_d, true, var1);
            TabbedPanel.field_Eb = 0L;
          }
          if (var2 != 2 &&
            var2 != 3) {
            QueuedRequest.field_h = null;
          } else {
            if (null == QueuedRequest.field_h) {
              QueuedRequest.field_h = new LobbyGame(TextMetricsGlobals.field_h);
            }
          }
          if (3 != var2) {
            GameKeyHandler.field_c = false;
            return;
          }
          GameKeyHandler.field_c = true;
          for (var3Lifetime2 = 0; var3Lifetime2 < FadeLayer.field_E.length; var3Lifetime2++) {
            FadeLayer.field_E[var3Lifetime2] = ((PacketBuffer) ((Object) var1)).readByte((byte) -88);
          }
          QuickChatHelpHelpers.field_e = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
          ArchiveLoadSequence.field_c = ((PacketBuffer) ((Object) var1)).readUnsignedByte(11132);
          for (var3Lifetime3 = 0; var3Lifetime3 < MouseTrailPoint.field_p.length; var3Lifetime3++) {
            MouseTrailPoint.field_p[var3Lifetime3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1_ref), "bj.C(" + param0 + ')');
        }
    }

    static {
        field_o = new IntrusiveDeque();
        field_k = new byte[50][];
        field_h = new ScoreSubmissionHelpers();
        field_g = "Create a free Account";
    }
}
