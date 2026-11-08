/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FreePlayRules extends GameRules {
    static int[] field_h;
    static int field_l;
    static PlayingSound[] field_j;
    static Sprite field_k;
    static PaletteBitmapFont field_e;
    static String muChatPmFriendsOnly;
    static int field_g;
    static AlignedIconLabel[][] field_f;

    final static void c(byte param0) {
        int var1 = 0;
        LobbyGame.field_Vb.height = 240;
        if (param0 < -68) {
          LobbyGame.field_Vb.horizontalAlignment = 3;
          LobbyGame.field_Vb.contentOffsetY = LobbyGame.field_Vb.frameSprites[1].field_A;
          LobbyGame.field_Vb.localY = 120;
          LobbyGame.field_Vb.localX = 160;
          LobbyGame.field_Vb.verticalAlignment = 0;
          LobbyGame.field_Vb.width = 320;
          LobbyGame.field_Vb.contentOffsetX = LobbyGame.field_Vb.frameSprites[3].field_z;
          var1 = LobbyGame.field_Vb.font.measureWrappedHeight(LobbyGame.field_Vb.text, -LobbyGame.field_Vb.frameSprites[3].field_z + (LobbyGame.field_Vb.width - LobbyGame.field_Vb.frameSprites[5].field_z), 2 + LobbyGame.field_Vb.font.baselineHeight);
          NanoTickClock.field_t.width = NanoTickClock.field_t.font.b(NanoTickClock.field_t.text) + NanoTickClock.field_t.frameSprites[3].field_z + NanoTickClock.field_t.frameSprites[5].field_z;
          NanoTickClock.field_t.localX = LobbyGame.field_Vb.frameSprites[3].field_z;
          NanoTickClock.field_t.height = 20;
          NanoTickClock.field_t.localY = var1 + LobbyGame.field_Vb.frameSprites[1].field_A + 3;
          MonotonicClock.field_b.width = MonotonicClock.field_b.font.b(MonotonicClock.field_b.text) - (-MonotonicClock.field_b.frameSprites[3].field_z - MonotonicClock.field_b.frameSprites[5].field_z);
          MonotonicClock.field_b.height = NanoTickClock.field_t.height;
          MonotonicClock.field_b.localY = 3 + var1 + LobbyGame.field_Vb.frameSprites[1].field_A;
          MonotonicClock.field_b.localX = -LobbyGame.field_Vb.frameSprites[5].field_z + (LobbyGame.field_Vb.width - MonotonicClock.field_b.width);
          LobbyGame.field_Vb.height = 3 + var1 + (LobbyGame.field_Vb.frameSprites[1].field_A + (NanoTickClock.field_t.height + LobbyGame.field_Vb.frameSprites[7].field_A));
          return;
        }
    }

    final boolean isPotLegal(int param0, byte param1, ShotRecord param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 9) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("mc.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    FreePlayRules(PoolGameModel param0) {
        super(param0);
    }

    final boolean isBallInGroup(int param0, byte param1, int param2) {
        if (param1 < 122) {
          this.isBallInGroup(-87, (byte) -91, -37);
          return true;
        }
        return true;
    }

    final boolean showsTargetBall(int param0) {
        if (param0 < 113) {
          this.updateGroupLabels(55);
          return false;
        }
        return false;
    }

    final int defaultBallInHandMode(int param0) {
        int var2 = 101 % ((param0 + 79) / 38);
        return 1;
    }

    final int groupMessageIndex(ShotRecord param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 118 / ((-32 - param1) / 40);
          stackIn_1_0 = -1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("mc.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] rackOrder(int param0, byte param1) {
        if (param1 != -32) {
          ShotRecord var4 = (ShotRecord) null;
          this.isPotLegal(-52, (byte) -33, (ShotRecord) null);
          return TextureCache.field_k;
        }
        return TextureCache.field_k;
    }

    final boolean isFirstContactLegal(ShotRecord param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -33) {
            return true;
          }
          field_l = -63;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mc.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int evaluateShot(byte param0) {
        int var2 = -96 / ((param0 + 37) / 60);
        int var3 = BrowserUrlSupport.field_f;
        if (this.field_d.isCueBallPotted((byte) 85)) {
          var3 = var3 | MeshBase.field_c;
        }
        return var3;
    }

    public static void releaseStatics(byte param0) {
        field_j = null;
        field_k = null;
        field_f = (AlignedIconLabel[][]) null;
        muChatPmFriendsOnly = null;
        if (param0 > -94) {
          return;
        }
        field_h = null;
        field_e = null;
    }

    final int initialBallInHandMode(boolean param0) {
        if (param0) {
          return 62;
        }
        return 1;
    }

    final byte ballGroup(int param0, int param1) {
        if ((param0 & 7) == 0) {
          return (byte) -1;
        }
        if (param1 == 30554) {
          return (byte)((9 & param0) >> 3);
        }
        return (byte) -84;
    }

    final int timeoutResolution(int param0) {
        this.field_d.currentShot(96).field_t = true;
        if (param0 != -1) {
          return 77;
        }
        return BrowserUrlSupport.field_f;
    }

    final int initialGroup(int param0) {
        if (param0 != -1) {
          return 98;
        }
        return -1;
    }

    final void updateGroupLabels(int param0) {
        if (param0 > -25) {
          this.isTargetVisible(41, 107);
        }
    }

    final Sprite targetBallSprite(ShotRecord param0, int param1) {
        RuntimeException var3 = null;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            stackIn_4_0 = ClassicBallSkin.field_n;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Sprite) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mc.JA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int ballCount(int param0) {
        if (param0 != 26840) {
          this.evaluateShot((byte) 16);
          return 16;
        }
        return 16;
    }

    final boolean isTargetVisible(int param0, int param1) {
        if (param1 >= -28) {
          this.showsTargetBall(-106);
          return false;
        }
        return false;
    }

    static {
        field_j = new PlayingSound[5];
        muChatPmFriendsOnly = "Only show private chat from my friends and opponents";
    }
}
