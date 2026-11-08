/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends PcmStream {
    private int[] field_x;
    private int field_z;
    private MusicTrack field_C;
    private MidiPcmStream field_A;
    private int field_r;
    private boolean field_w;
    private MusicTrack field_y;
    static String field_v;
    private int field_D;
    private boolean field_B;
    private int field_E;
    private int[] field_F;
    private MidiPcmStream field_u;
    private MusicTrack field_s;
    private MidiPcmStream field_t;

    private final void configureSynthesizer(int param0, MidiPcmStream param1, int param2, int param3) {
        try {
          param1.setChannelVolume(param0, -1, 99);
          param1.setTempoScale(param3, param2 - 26097);
          if (param2 != 26025) {
            this.field_C = (MusicTrack) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "r.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void initializeChatInterface(Archive param0, Archive param1, boolean param2, boolean param3) {
        try {
          IntrusiveDequeCursor.initializeChatWidgets(0, NotificationToast.field_n, ArchiveIndex.field_o, LoginProgressHelpers.field_g, QuickChatPhraseCache.field_b, LoginDialog.field_rb, ServerConnectionHelpers.field_b, TextLayoutLine.field_i, param3, NetworkArchiveRequest.field_N, NotificationToast.field_o, FullscreenErrorDialog.field_cb);
          WeightedLruCache.field_n = PlayingSound.loadSpritesByName((byte) -99, param0, "lobby", "chatfilter");
          LobbyListHelpers.field_a[0] = IsaacCipher.field_h;
          LobbyListHelpers.field_a[2] = SocialTabsPanel.field_f;
          LobbyListHelpers.field_a[1] = MiscTextGlobals.field_a;
          QuickChatCommandType.initializeQuickChat(param1, LoadingResourceHelpers.field_e, 122);
          if (!param2) {
            field_v = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "r.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void skipFrames(int param0) {
        int var3;
        var3 = TetraLink.field_J;
        if (this.field_z > 0 &&
          null != this.field_y) {
          this.field_A.skipFrames(param0);
        }
        if (1048576 > this.field_z &&
          null != this.field_s) {
          this.field_u.skipFrames(param0);
        }
        if (this.field_D > 0 &&
          null != this.field_C) {
          this.field_t.skipFrames(param0);
        }
        if (this.field_w) {
          if (this.field_r > 0 &&
            !this.field_A.isReady((byte) 107)) {
            this.field_r = -this.field_r;
            this.field_y = null;
            this.field_w = false;
          } else {
            if (this.field_r < 0 &&
              !this.field_u.isReady((byte) 81)) {
              this.field_s = null;
              this.field_w = false;
              this.field_r = -this.field_r;
            }
          }
        }
        if (this.field_r != 0) {
          this.field_z = this.field_z + this.field_r * param0;
          if (1048576 <= this.field_z) {
            this.field_z = 1048576;
            if (!this.field_w) {
              this.field_r = 0;
              if (!this.field_B) {
                if (this.field_s != null) {
                  this.field_u.stop(80);
                }
                this.field_s = null;
              }
            }
          } else {
            if (0 >= this.field_z) {
              this.field_z = 0;
              if (!this.field_w) {
                this.field_r = 0;
                if (!this.field_B) {
                  if (this.field_y != null) {
                    this.field_A.stop(109);
                  }
                  this.field_y = null;
                }
              }
            }
          }
        }
    }

    final static void exitFullscreenAndDisposeFrame(PlatformTaskDispatcher param0, java.awt.Frame param1, int param2) {
        AsyncRequest var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TetraLink.field_J;
        try {
          while (true) {
            var3 = param0.requestExitFullscreen(param1, 0);
            while (0 == var3.field_d) {
              AnimationSequence.sleepMillis(false, 10L);
            }
            if (var3.field_d != 1) {
              AnimationSequence.sleepMillis(false, 100L);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          if (param2 != 0) {
            field_v = (String) null;
          }
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("r.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void switchTrack(MusicTrack param0, int param1, boolean param2, int param3, int param4, byte param5) {
        boolean stackIn_22_1 = false;
        int stackIn_36_0 = 0;
        MidiPcmStream stackIn_44_0 = null;
        boolean stackIn_45_1 = false;
        MidiPcmStream stackIn_54_0 = null;
        boolean stackIn_55_1 = false;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int[] var9 = null;
        var8 = TetraLink.field_J;
        try {
          if (this.field_w &&
            param2) {
            if (this.field_r <= 0) {
              if (this.field_s != null) {
                this.field_u.stop(76);
              }
              this.field_s = param0;
              if (param0 != null) {
                this.field_u.playTrack(false, param0, (byte) 113);
                this.configureSynthesizer(param3, this.field_u, 26025, param4);
              }
            } else {
              if (null != this.field_y) {
                this.field_A.stop(38);
              }
              this.field_y = param0;
              if (param0 != null) {
                this.field_A.playTrack(false, param0, (byte) 117);
                this.configureSynthesizer(param3, this.field_A, 26025, param4);
              }
            }
            return;
          }
          if (param5 > -120) {
            var9 = (int[]) null;
            this.mixInto((int[]) null, -67, 0);
          }
          stackIn_22_1 = (param2);
          this.field_w = stackIn_22_1;
          if (param0 == this.field_y) {
            this.field_r = param1;
            this.configureSynthesizer(param3, this.field_A, 26025, param4);
            return;
          }
          if (param0 == this.field_s) {
            this.field_r = -param1;
            this.configureSynthesizer(param3, this.field_u, 26025, param4);
            return;
          }
          if (this.field_y != null) {
            if (this.field_s != null) {
              stackIn_36_0 = (this.field_z >= 524288) ? 0 : 1;
              var7_int = stackIn_36_0;
            } else {
              var7_int = 0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (null != this.field_y) {
              this.field_A.stop(111);
            }
            this.field_y = param0;
            if (param0 != null) {
              stackIn_54_0 = this.field_A;
              stackIn_55_1 = !(param2);
              ((MidiPcmStream) (Object) stackIn_54_0).playTrack(stackIn_55_1, param0, (byte) 52);
              this.configureSynthesizer(param3, this.field_A, 26025, param4);
            }
            this.field_r = param1;
          } else {
            if (this.field_s != null) {
              this.field_u.stop(68);
            }
            this.field_s = param0;
            if (param0 != null) {
              stackIn_44_0 = this.field_u;
              stackIn_45_1 = !(param2);
              ((MidiPcmStream) (Object) stackIn_44_0).playTrack(stackIn_45_1, param0, (byte) 76);
              this.configureSynthesizer(param3, this.field_u, 26025, param4);
            }
            this.field_r = -param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_60_0 = var7;
          stackIn_60_1 = new StringBuilder().append("r.E(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean isLoginReplyPending(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_6_0 = (TriangleSpanHelpers.field_e != null) && (WhirlpoolHasher.field_a == SparkParticle.field_p);
        return stackIn_6_0;
    }

    final void mixInto(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = TetraLink.field_J;
        try {
          if (this.field_E <= 0) {
            this.skipFrames(param2);
            return;
          }
          if (this.field_w) {
            if (this.field_r > 0 &&
              !this.field_A.isReady((byte) -54)) {
              this.field_y = null;
              this.field_r = -this.field_r;
              this.field_w = false;
            } else {
              if (this.field_r < 0 &&
                !this.field_u.isReady((byte) 78)) {
                this.field_r = -this.field_r;
                this.field_w = false;
                this.field_s = null;
              }
            }
          }
          var4_int = (this.field_z >> 12) * this.field_E / 256;
          var5 = -var4_int + this.field_E;
          if (this.field_r != 0) {
            this.field_z = this.field_z + param2 * this.field_r;
            if (this.field_z >= 1048576) {
              this.field_z = 1048576;
              if (!this.field_w) {
                this.field_r = 0;
                if (!this.field_B) {
                  if (this.field_s != null) {
                    this.field_u.stop(105);
                  }
                  this.field_s = null;
                }
              }
            } else {
              if (0 >= this.field_z) {
                this.field_z = 0;
                if (!this.field_w) {
                  this.field_r = 0;
                  if (!this.field_B) {
                    if (this.field_y != null) {
                      this.field_A.stop(111);
                    }
                    this.field_y = null;
                  }
                }
              }
            }
          }
          if (!AudioOutput.field_s) {
            stackIn_33_0 = param2;
          } else {
            stackIn_33_0 = param2 << 1;
          }
          var6 = stackIn_33_0;
          if (256 > this.field_D && (null != this.field_y ||
            null != this.field_s)) {
            if (var4_int == 256) {
              this.field_A.mixInto(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (null != this.field_x &&
                  this.field_x.length >= var6) {
                  ArraySupport.clear(this.field_x, 0, var6);
                  ArraySupport.clear(this.field_F, 0, var6);
                } else {
                  this.field_F = new int[var6];
                  this.field_x = new int[var6];
                }
                this.field_A.mixInto(this.field_x, 0, param2);
                this.field_u.mixInto(this.field_F, 0, param2);
                if (AudioOutput.field_s) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                } else {
                  stackIn_48_0 = param1;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (var5 * this.field_F[var8] + this.field_x[var8] * var4_int >> 8);
                }
              } else {
                this.field_u.mixInto(param0, param1, param2);
              }
            }
          }
          if (this.field_C != null) {
            if (this.field_D == 0) {
              return;
            }
            if (this.field_x != null &&
              this.field_x.length >= var6) {
              ArraySupport.clear(this.field_x, 0, var6);
            } else {
              this.field_x = new int[var6];
              this.field_F = new int[var6];
            }
            this.field_t.mixInto(this.field_x, 0, param2);
            if (!AudioOutput.field_s) {
              stackIn_63_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.field_E * this.field_D / 256;
            var9 = -var8Lifetime1 + this.field_E;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = this.field_x[var10] * var8Lifetime1 + param0[var7Lifetime1 + var10] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("r.BA(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 57 / ((-10 - param0) / 44);
        field_v = null;
    }

    final synchronized void setVolume(int param0, int param1) {
        this.field_E = param0;
        if (param1 != 1) {
          this.field_w = false;
        }
    }

    final synchronized int activity() {
        return 2;
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final static ChatMessage findChatLineAt(int param0, int param1, int param2, int param3) {
        boolean stackIn_45_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ChatMessage var8_ref_fj;
        int var9;
        ChatMessage var9_ref_fj;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = TetraLink.field_J;
        TriangleMesh.field_M.field_Pb.field_fb.clear(1);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = StatusRequestHelpers.field_d - 1; var7 >= 0; var7--) {
          var8_ref_fj = NameSuggestionsPanel.field_L[var7];
          var9 = 0;
          if (!MenuLabelGlobals.field_a &&
            var5 < HuffmanCodec.field_a) {
            var10_int = HuffmanCodec.getChatFilterSetting((byte) 79, var8_ref_fj.field_i);
            if (var8_ref_fj.getFilterPriority((byte) -63) >= var10_int && (var8_ref_fj.field_l ||
              !ArchiveGroupHelpers.areAllGroupsReady((byte) 2, var8_ref_fj.field_n))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (null == var8_ref_fj.field_f ||
              GameOptionControls.field_c) {
              if (var8_ref_fj.field_f == null) {
                DateOfBirthPanel.field_R = DateOfBirthPanel.field_R + 1;
              }
              var10 = QuickChatPhraseCache.formatChatPrefix(18440, var8_ref_fj);
              var11 = var10 + BitmapFont.escapeMarkup(var8_ref_fj.field_h);
              var12 = AccountCreationDialog.getChatMessageColor((byte) 100, var8_ref_fj);
              var8_ref_fj.field_f = new UiComponent(0L, ArchiveRequest.field_A, var11);
              var6 = var6 + param2;
              var8_ref_fj.field_f.field_ib = var12 - (((var12 & 16711422) >> 1) - ((16711423 & ArchiveRequest.field_A.field_ib) >> 1));
              var8_ref_fj.field_f.field_N = var12;
              var8_ref_fj.field_f.field_L = -((var12 & 16711422) >> 1) + (var12 + (8355711 & ArchiveRequest.field_A.field_L >> 1));
              var8_ref_fj.field_f.field_Ib = CachedTextLayout.field_k;
            }
            var5++;
          } else {
            var8_ref_fj.field_f = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = param3; StatusRequestHelpers.field_d > var8; var8++) {
          var9_ref_fj = NameSuggestionsPanel.field_L[var8];
          if (var9_ref_fj.field_f != null) {
            TriangleMesh.field_M.field_Pb.addChild((byte) -118, var9_ref_fj.field_f);
            var9_ref_fj.field_f.setBounds((byte) -126, var9_ref_fj.field_f.measureUnconstrainedWidth(param3 - 121), var7Lifetime1, param2, param0);
            var7Lifetime1 = var7Lifetime1 + param2;
            if (var9_ref_fj.field_f.field_F != 0) {
              var4 = var9_ref_fj;
            }
          }
        }
        var8Lifetime1 = TriangleMesh.field_M.field_Pb.field_mb + TriangleMesh.field_M.field_Pb.field_R - var7Lifetime1 + var6;
        TriangleMesh.field_M.field_Pb.field_yb = TriangleMesh.field_M.field_Pb.field_yb + var8Lifetime1;
        TriangleMesh.field_M.field_Pb.field_R = TriangleMesh.field_M.field_Pb.field_R - var8Lifetime1;
        if (GameOptionControls.field_c) {
          TriangleMesh.field_M.field_Pb.field_R = var7Lifetime1;
        }
        if (GameOptionControls.field_c) {
          AccountCreationDialog.field_Cb = true;
          GameOptionControls.field_c = false;
          TriangleMesh.field_M.field_Pb.field_Db = 0;
          TriangleMesh.field_M.field_Pb.field_yb = -TriangleMesh.field_M.field_Pb.field_R + TriangleMesh.field_M.field_Ob.field_R;
        }
        TriangleMesh.field_M.field_Pb.field_mb = -TriangleMesh.field_M.field_Pb.field_R + var7Lifetime1;
        if (MenuScreen.field_e &&
          UiContainer.field_I != null) {
          AccountCreationDialog.field_Cb = true;
        }
        var9Lifetime1 = TriangleMesh.field_M.field_Ob.field_R - (TriangleMesh.field_M.field_Pb.field_R + TriangleMesh.field_M.field_Pb.field_mb);
        if (AccountCreationDialog.field_Cb) {
          TriangleMesh.field_M.field_Pb.field_Db = -TriangleMesh.field_M.field_Pb.field_yb + var9Lifetime1;
        }
        TriangleMesh.field_M.layoutWithContentHeight(-1, true, param1 * param2 * 2, param2);
        stackIn_45_0 = (var9Lifetime1 == TriangleMesh.field_M.field_Pb.field_yb + TriangleMesh.field_M.field_Pb.field_Db);
        AccountCreationDialog.field_Cb = stackIn_45_0;
        return (ChatMessage) (var4);
    }

    final PcmStream nextSubStream() {
        return null;
    }

    private MusicCrossfadeStream() throws Throwable {
        throw new Error();
    }

    static {
        field_v = "Public";
    }
}
