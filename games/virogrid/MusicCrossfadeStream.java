/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends AudioStream {
    static String field_t;
    private int[] field_w;
    private int[] field_q;
    static int field_l;
    static String field_G;
    private MidiPcmStream field_x;
    private int field_r;
    private MusicTrack field_B;
    static String field_z;
    private MusicTrack field_E;
    static String field_p;
    private int field_v;
    private MusicTrack field_u;
    private int field_k;
    private MidiPcmStream field_A;
    static String field_s;
    private int field_C;
    private boolean field_n;
    private boolean field_o;
    private MidiPcmStream field_m;
    static int field_y;
    static String field_F;

    final static SpriteWidget getGameMemberListContent(int param0) {
        if (param0 != 1048576) {
          return (SpriteWidget) null;
        }
        return AchievementNotice.getScrollPaneContent(112);
    }

    final static void openFriendContextMenu(int param0, int param1, boolean param2) {
        PlayerContextMenu var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        SocialListEntry var3 = IterableNodeHashTable.updateFriendListControls((byte) -100, param0, param2);
        PlayerContextMenu var4Lifetime1;
        if (param1 > -16) {
          field_G = (String) null;
        }
        if (var3 != null) {
          IntKeyLookup.field_e.addGameMemberActions(false, (byte) -99);
          var4 = IntKeyLookup.field_e;
          var5_ref_String = GameClock.field_a;
          var4.field_a.addItem(1, var5_ref_String, 5);
          var4Lifetime1 = IntKeyLookup.field_e;
          var5 = HuffmanCodec.field_b;
          var6 = PasswordFieldPainter.field_y;
          var4Lifetime1.field_a.openAt(0, 0, 0, var5, var6);
        }
        VerticalScrollbar.updateIgnoreList(param0, param2, (byte) 115);
    }

    private final void setStreamLevels(int param0, byte param1, int param2, MidiPcmStream param3) {
        try {
          param3.setChannelVolume(param0, true, -1);
          param3.setTempoScale(-128, param2);
          if (param1 > -85) {
            MusicCrossfadeStream.isLobbyReady((byte) -72);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "eg.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void setVolume(byte param0, int param1) {
        if (param0 <= 68) {
          field_F = (String) null;
        }
        this.field_C = param1;
    }

    final static Sprite createSolidSprite(int param0, byte param1, int param2) {
        int var5 = Virogrid.field_F ? 1 : 0;
        Sprite var6 = new Sprite(param0, param0);
        Sprite var3 = var6;
        int var4 = 0;
        if (param1 > 13) {
          while (var3.field_B.length > var4) {
            var6.field_B[var4] = param2;
            var4++;
          }
          return var3;
        }
        return (Sprite) null;
    }

    final void mixInto(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_32_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
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
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_C <= 0) {
            this.skipFrames(param2);
            return;
          }
          if (this.field_n) {
            if (this.field_r > 0 &&
              !this.field_A.isReady(115)) {
              this.field_B = null;
              this.field_n = false;
              this.field_r = -this.field_r;
            } else {
              if (this.field_r < 0 &&
                !this.field_x.isReady(111)) {
                this.field_r = -this.field_r;
                this.field_u = null;
                this.field_n = false;
              }
            }
          }
          var4_int = (this.field_k >> 12) * this.field_C / 256;
          var5 = -var4_int + this.field_C;
          if (this.field_r != 0) {
            this.field_k = this.field_k + this.field_r * param2;
            if (1048576 > this.field_k) {
              if (this.field_k <= 0) {
                this.field_k = 0;
                if (!this.field_n) {
                  this.field_r = 0;
                  if (!this.field_o) {
                    if (null != this.field_B) {
                      this.field_A.stop(false);
                    }
                    this.field_B = null;
                  }
                }
              }
            } else {
              this.field_k = 1048576;
              if (!this.field_n) {
                this.field_r = 0;
                if (!this.field_o) {
                  if (this.field_u != null) {
                    this.field_x.stop(false);
                  }
                  this.field_u = null;
                }
              }
            }
          }
          if (!AudioOutput.field_q) {
            stackIn_32_0 = param2;
          } else {
            stackIn_32_0 = param2 << 1;
          }
          var6 = stackIn_32_0;
          if (this.field_v < 256 && (this.field_B != null ||
            this.field_u != null)) {
            if (var4_int != 256) {
              if (256 != var5) {
                if (null != this.field_w &&
                  this.field_w.length >= var6) {
                  ArraySupport.clear(this.field_w, 0, var6);
                  ArraySupport.clear(this.field_q, 0, var6);
                } else {
                  this.field_q = new int[var6];
                  this.field_w = new int[var6];
                }
                this.field_A.mixInto(this.field_w, 0, param2);
                this.field_x.mixInto(this.field_q, 0, param2);
                if (!AudioOutput.field_q) {
                  stackIn_47_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_47_0 = localTemp$0;
                }
                var7 = stackIn_47_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (var5 * this.field_q[var8] + var4_int * this.field_w[var8] >> 8);
                }
              } else {
                this.field_x.mixInto(param0, param1, param2);
              }
            } else {
              this.field_A.mixInto(param0, param1, param2);
            }
          }
          if (this.field_E != null &&
            this.field_v != 0) {
            if (this.field_w != null &&
              this.field_w.length >= var6) {
              ArraySupport.clear(this.field_w, 0, var6);
            } else {
              this.field_q = new int[var6];
              this.field_w = new int[var6];
            }
            this.field_m.mixInto(this.field_w, 0, param2);
            if (!AudioOutput.field_q) {
              stackIn_60_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_60_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_60_0;
            var8Lifetime1 = this.field_v * this.field_C / 256;
            var9 = -var8Lifetime1 + this.field_C;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var7Lifetime1 + var10] = param0[var7Lifetime1 + var10] * var9 + var8Lifetime1 * this.field_w[var10] >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_66_0 = var4;
          stackIn_66_1 = new StringBuilder().append("eg.A(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean isLoginRequestFlagged(byte param0) {
        if (param0 != 47) {
          return true;
        }
        return RasterEffectHelpers.field_f;
    }

    final AudioStream nextSubStream() {
        return null;
    }

    final AudioStream firstSubStream() {
        return null;
    }

    final synchronized int activity() {
        return 2;
    }

    final static RasterBuffer createRasterBuffer(java.awt.Component param0, int param1, int param2, int param3) {
        try {
          int var4_int = 0;
          RuntimeException var4 = null;
          Class var5 = null;
          Throwable var5_ref = null;
          RasterBuffer var6 = null;
          ImageProducerRasterBuffer var6_ref = null;
          RasterBuffer stackIn_2_0 = null;
          ImageProducerRasterBuffer stackIn_4_0 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            var4_int = -32 % ((param3 + 6) / 37);
            try {
              var5 = Class.forName("BufferedImageRasterBuffer");
              var6 = (RasterBuffer) (var5.newInstance());
              var6.initialize(param2, param1, (byte) -56, param0);
              stackIn_2_0 = var6;
              return stackIn_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = decompiledCaughtException;
              var6_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var6_ref)).initialize(param2, param1, (byte) -66, param0);
              stackIn_4_0 = var6_ref;
              return (RasterBuffer) ((Object) stackIn_4_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var4;
            stackIn_7_1 = new StringBuilder().append("eg.F(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        field_G = null;
        if (param0 >= -43) {
          return;
        }
        field_z = null;
        field_s = null;
        field_F = null;
        field_p = null;
    }

    final synchronized void switchTrack(MusicTrack param0, int param1, int param2, boolean param3, int param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_33_0 = 0;
        MidiPcmStream stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        MidiPcmStream stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_n &&
            param3) {
            if (this.field_r <= 0) {
              if (this.field_u != null) {
                this.field_x.stop(false);
              }
              this.field_u = param0;
              if (param0 != null) {
                this.field_x.playTrack(false, 37, param0);
                this.setStreamLevels(param1, (byte) -108, param4, this.field_x);
              }
            } else {
              if (this.field_B != null) {
                this.field_A.stop(false);
              }
              this.field_B = param0;
              if (param0 != null) {
                this.field_A.playTrack(false, 37, param0);
                this.setStreamLevels(param1, (byte) -107, param4, this.field_A);
              }
            }
            return;
          }
          stackIn_19_1 = (param3);
          this.field_n = stackIn_19_1;
          if (param5 <= 119) {
            return;
          }
          if (this.field_B == param0) {
            this.field_r = param2;
            this.setStreamLevels(param1, (byte) -116, param4, this.field_A);
            return;
          }
          if (param0 == this.field_u) {
            this.field_r = -param2;
            this.setStreamLevels(param1, (byte) -93, param4, this.field_x);
            return;
          }
          if (null != this.field_B) {
            if (null == this.field_u) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_k >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (null != this.field_B) {
              this.field_A.stop(false);
            }
            this.field_B = param0;
            if (param0 != null) {
              stackIn_51_0 = this.field_A;
              stackIn_52_1 = !(param3);
              ((MidiPcmStream) (Object) stackIn_51_0).playTrack(stackIn_52_1, 37, param0);
              this.setStreamLevels(param1, (byte) -86, param4, this.field_A);
            }
            this.field_r = param2;
          } else {
            if (null != this.field_u) {
              this.field_x.stop(false);
            }
            this.field_u = param0;
            if (param0 != null) {
              stackIn_41_0 = this.field_x;
              stackIn_42_1 = !(param3);
              ((MidiPcmStream) (Object) stackIn_41_0).playTrack(stackIn_42_1, 37, param0);
              this.setStreamLevels(param1, (byte) -124, param4, this.field_x);
            }
            this.field_r = -param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_57_0 = var7;
          stackIn_57_1 = new StringBuilder().append("eg.Q(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean isLobbyReady(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 > -53) {
          field_l = -55;
        }
        stackIn_7_0 = (NodeHashTableIterator.field_l >= 10) && (!MenuScreen.field_d) && (!AudioSetupHelpers.isConnectedToLobby((byte) -119));
        return stackIn_7_0;
    }

    final synchronized void skipFrames(int param0) {
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (this.field_k > 0 &&
          this.field_B != null) {
          this.field_A.skipFrames(param0);
        }
        if (1048576 > this.field_k &&
          null != this.field_u) {
          this.field_x.skipFrames(param0);
        }
        if (0 < this.field_v &&
          null != this.field_E) {
          this.field_m.skipFrames(param0);
        }
        if (this.field_n) {
          if (0 < this.field_r &&
            !this.field_A.isReady(121)) {
            this.field_r = -this.field_r;
            this.field_B = null;
            this.field_n = false;
          } else {
            if (this.field_r < 0 &&
              !this.field_x.isReady(122)) {
              this.field_n = false;
              this.field_r = -this.field_r;
              this.field_u = null;
            }
          }
        }
        if (this.field_r != 0) {
          this.field_k = this.field_k + param0 * this.field_r;
          if (1048576 <= this.field_k) {
            this.field_k = 1048576;
            if (!this.field_n) {
              this.field_r = 0;
              if (!this.field_o) {
                if (this.field_u != null) {
                  this.field_x.stop(false);
                }
                this.field_u = null;
              }
            }
          } else {
            if (this.field_k <= 0) {
              this.field_k = 0;
              if (!this.field_n) {
                this.field_r = 0;
                if (!this.field_o) {
                  if (this.field_B != null) {
                    this.field_A.stop(false);
                  }
                  this.field_B = null;
                }
              }
            }
          }
        }
    }

    private MusicCrossfadeStream() throws Throwable {
        throw new Error();
    }

    static {
        field_t = "Day";
        field_p = "<%0> has entered another game.";
        field_z = "You can ask to join this game";
        field_G = "Staff impersonation";
        field_s = "Checking";
        field_y = 2;
        field_F = "There are no valid types of game that match your preferences.";
    }
}
