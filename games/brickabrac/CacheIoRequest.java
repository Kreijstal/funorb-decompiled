/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CacheIoRequest extends ResourceRequest {
    FileCacheStore store;
    static java.awt.Canvas field_D;
    int operation;
    byte[] data;

    final static int approximateSqrt256(int value, int obfuscationGuard) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (value == 0) {
          return 0;
        }
        if (0 > value) {
          throw new IllegalArgumentException("");
        }
        if (obfuscationGuard != 2) {
          field_D = (java.awt.Canvas) null;
        }
        if (value >= 32768) {
          if (value < 131072) {
            return MusicCrossfadeStream.field_n[-32768 + value];
          }
          if (33554432 > value) {
            if (value < 2097152) {
              var2 = (value < 524288) ? 1 : 2;
            } else {
              var2 = (value >= 8388608) ? 4 : 3;
            }
          } else {
            if (value >= 536870912) {
              var2 = 7;
            } else {
              var2 = (134217728 <= value) ? 6 : 5;
            }
          }
          value = value >> (var2 << 1);
          return MusicCrossfadeStream.field_n[-32768 + value] << var2;
        }
        if (value >= 128) {
          if (value >= 2048) {
            if (8192 <= value) {
              var2Lifetime1 = 1;
            } else {
              var2Lifetime1 = 2;
            }
          } else {
            var2Lifetime1 = (value < 512) ? 4 : 3;
          }
        } else {
          if (value >= 8) {
            var2Lifetime1 = (32 <= value) ? 5 : 6;
          } else {
            if (2 > value) {
              return 256;
            }
            var2Lifetime1 = 7;
          }
        }
        value = value << (var2Lifetime1 << 1);
        return MusicCrossfadeStream.field_n[value - 32768] >> var2Lifetime1;
    }

    public static void h(int param0) {
        if (param0 > -17) {
          field_D = (java.awt.Canvas) null;
        }
        field_D = null;
    }

    final byte[] getData(byte obfuscationGuard) {
        int var2 = -57 % ((4 - obfuscationGuard) / 52);
        if (this.pending) {
          throw new RuntimeException();
        }
        return this.data;
    }

    final int getProgress(int obfuscationGuard) {
        if (obfuscationGuard != -21546) {
          this.getProgress(-42);
        }
        if (this.pending) {
          return 0;
        }
        return 100;
    }

    final static void a(boolean param0, boolean param1) {
        int var6 = 0;
        UiComponent dupTemp$0 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        UiComponent stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5 = 0;
        Object stackIn_37_0 = null;
        AlignedIconLabel stackIn_37_1 = null;
        int stackIn_52_0 = 0;
        UiComponent stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        UiComponent var7 = null;
        int var7_int = 0;
        int var8 = 0;
        UiComponent var8_ref_mh = null;
        AlignedIconLabel var9 = null;
        int var9_int = 0;
        int var10 = 0;
        AlignedIconLabel var10_ref_rk = null;
        int var12 = 0;
        int var13 = 0;
        UiComponent var14 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          kp.field_a = Rasterizer2D.width;
          IsaacGenerator.field_i = Rasterizer2D.height;
          if (!param1) {
            stackIn_4_0 = TableDataRequest.field_m;
          } else {
            stackIn_4_0 = IntArrayRequest.field_j;
          }
          co.a(stackIn_4_0, false);
          BrickGameLayerController.field_c.a(NinjaBackground.field_w.width, 0, 88, 0, -40 + NinjaBackground.field_w.height - 2);
          TextWidgetRenderer.field_b.setBounds(np.uiRowHeight, 0, 0, IterableIntrusiveHashTable.field_b.width, (byte) 64);
          stackIn_6_0 = BoundedFile.field_g;
          stackIn_6_1 = 18;
          stackIn_6_2 = np.uiRowHeight + 2;
          stackIn_6_3 = 0;
          stackIn_6_4 = IterableIntrusiveHashTable.field_b.width;
          if (!vd.field_e) {
            stackIn_7_5 = 0;
          } else {
            stackIn_7_5 = 4 + (DialogMessagePanel.field_J + 40);
          }
          ((UiComponent) (Object) stackIn_6_0).setBounds(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 - stackIn_7_5, (byte) 64);
          if (!param0) {
            field_D = (java.awt.Canvas) null;
          }
          QuickChatPhraseDefinition.field_E.setBounds(18, np.uiRowHeight + 2, -40 + (-2 + IterableIntrusiveHashTable.field_b.width) - DialogMessagePanel.field_J, 42 + DialogMessagePanel.field_J, (byte) 64);
          TimedSplashScreen.field_u.setScrollPaneBounds(2, (byte) -109, IterableIntrusiveHashTable.field_b.width, 0, np.uiRowHeight + 2 + 20, DialogMessagePanel.field_J, -2 + IterableIntrusiveHashTable.field_b.height - (np.uiRowHeight + 20));
          GameUiController.field_e.setBounds(40, -40 + NinjaBackground.field_w.height, 0, NinjaBackground.field_w.width, (byte) 64);
          ba.field_v.setBounds(30, 0, 0, MultiplayerMatch.field_d.width, (byte) 64);
          QuickChatPhraseRegistry.field_e.setBounds(-2 + (-40 + MultiplayerMatch.field_d.height) - 30, 30, 0, MultiplayerMatch.field_d.width, (byte) 64);
          var2_int = RankingsRequest.gameSettingCount + 3;
          if (ScreenshotViewer.field_n.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + (2 + (-15 + (QuickChatPhraseRegistry.field_e.height - (5 - (var2_int + 1) / 2)))) / (1 + var2_int);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (QuickChatPhraseRegistry.field_e.height - (5 + (2 + var3) * var2_int));
          if (var4 > 40) {
            var4 = 40;
          }
          jd.field_a.setBounds(var4, 5, 5, -5 + (-5 + QuickChatPhraseRegistry.field_e.width), (byte) 64);
          var5 = 5 + var4 + 2;
          for (var6 = 0; 4 + RankingsRequest.gameSettingCount > var6; var6++) {
            if ((var6 != 1 ||
              !(ScreenshotViewer.field_n.length < 2)) && (var6 != 3 ||
              !(IntArrayRequest.field_t <= 1))) {
              if (!param1 &&
                3 == var6) {
                dupTemp$0 = ChatMessage.field_l[var6];
                var14 = dupTemp$0;
                var7 = dupTemp$0;
                ChatMessage.field_l[var6].height = 0;
                var14.width = 0;
                for (var8 = 0; MatchCompleteScreen.field_A[var6].length > var8; var8++) {
                  if (null != MatchCompleteScreen.field_A[var6][var8]) {
                    var9 = MatchCompleteScreen.field_A[var6][var8];
                    MatchCompleteScreen.field_A[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else if (param1 &&
                0 == var6) {
                var7 = ChatMessage.field_l[var6];
                ChatMessage.field_l[var6].height = 0;
                var7.width = 0;
                for (var8 = 0; var8 < MatchCompleteScreen.field_A[var6].length; var8++) {
                  stackIn_37_0 = null;
                  stackIn_37_1 = MatchCompleteScreen.field_A[var6][var8];
                  if (stackIn_37_0 != stackIn_37_1) {
                    var9 = MatchCompleteScreen.field_A[var6][var8];
                    MatchCompleteScreen.field_A[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (LoginMethodPreference.field_f != null) {
                      stackIn_52_0 = (LoginMethodPreference.field_f[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_52_0 = 0;
                    }
                  } else {
                    stackIn_52_0 = 0;
                  }
                } else {
                  stackIn_52_0 = 0;
                }
                var7_int = stackIn_52_0;
                if (var7_int != 0) {
                  var8_ref_mh = ChatMessage.field_l[var6];
                  ChatMessage.field_l[var6].height = 0;
                  var8_ref_mh.width = 0;
                  for (var9_int = 0; MatchCompleteScreen.field_A[var6].length > var9_int; var9_int++) {
                    if (MatchCompleteScreen.field_A[var6][var9_int] != null) {
                      var10_ref_rk = MatchCompleteScreen.field_A[var6][var9_int];
                      MatchCompleteScreen.field_A[var6][var9_int].height = 0;
                      var10_ref_rk.width = 0;
                    }
                  }
                } else {
                  ChatMessage.field_l[var6].setBounds(var3, var5, 5, 103, (byte) 64);
                  var8 = 110;
                  if (!param1) {
                    if (null != MatchCompleteScreen.field_A[var6][0]) {
                      var9 = MatchCompleteScreen.field_A[var6][0];
                      MatchCompleteScreen.field_A[var6][0].height = 0;
                      var9.width = 0;
                    }
                  } else {
                    MatchCompleteScreen.field_A[var6][0].setIconLabelBounds(-10411, var5, 2, kn.field_z, var8, var3, 38);
                    var8 += 40;
                  }
                  var9_int = 2 + (MultiplayerMatch.field_d.width - (5 + var8));
                  var10 = MatchCompleteScreen.field_A[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    MatchCompleteScreen.field_A[var6][1 + var11].setIconLabelBounds(-10411, var5, 2, kn.field_z, var12 + var8, var3, var9_int * (var11 + 1) / var10 - 2 - var12);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          ProxySocketConnector.field_j.setBounds(-10 + (-120 + Rasterizer2D.height) - 4 - 10, 10, -360 + Rasterizer2D.width >> 1, 360, (byte) 64);
          TableNameEntry.field_h.setBounds(24, 0, 0, ProxySocketConnector.field_j.width, (byte) 64);
          MembershipBenefitsScreen.field_t.setBounds(-24 + ProxySocketConnector.field_j.height, 24, 0, ProxySocketConnector.field_j.width, (byte) 64);
          stackIn_78_0 = MembershipBenefitsScreen.field_t;
          stackIn_79_1 = !(param0);
          stackIn_78_0.frameSprites = DateFieldsWidget.a(stackIn_79_1, 8421504, 3, 11579568, MembershipBenefitsScreen.field_t.height, 1);
          Ball.field_A.setBounds(MembershipBenefitsScreen.field_t.height - 10 - 26, 5, 5, -10 + MembershipBenefitsScreen.field_t.width, (byte) 64);
          nd.field_a.setBounds(24, -29 + MembershipBenefitsScreen.field_t.height, (MembershipBenefitsScreen.field_t.width - 80) / 2, 80, (byte) 64);
          s.b(125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "kj.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void addBoardBorders(int columns, NodeDeque destination, int obfuscationGuard) {
        int var4 = 0;
        int var3_int = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = -1;
          if (obfuscationGuard != 16) {
            field_D = (java.awt.Canvas) null;
          }
          while (var3_int < columns + 1) {
            for (var4 = -1; 31 > var4; var4++) {
              if (var4 == -1 ||
                var3_int == -1 ||
                columns == var3_int) {
                var5 = var3_int * 34 << 8;
                var6 = 16 * var4 << 8;
                destination.addLast(new Brick(var5, var6, 0, 0, 1, 1, 0, 0), (byte) 3);
              }
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("kj.A(").append(columns).append(',');
          if (destination == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    CacheIoRequest() {
    }

    static {
    }
}
