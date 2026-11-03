/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class TimeTrialRules extends GameRules {
    static int field_f;
    static String playerNameYouHaveAnExtraShot;

    final boolean showsTargetBall(int param0) {
        if (param0 <= 113) {
          return true;
        }
        return false;
    }

    final boolean isPotLegal(int param0, byte param1, ShotRecord param2) {
        RuntimeException var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9) {
            field_f = 88;
          }
          stackIn_5_0 = (param2.groupBefore == this.ballGroup(param0, 30554));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("vp.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    TimeTrialRules(PoolGameModel param0) {
        super(param0);
    }

    final int[] rackOrder(int param0, byte param1) {
        if (param1 != -32) {
          this.b(79);
        }
        return uj.field_a;
    }

    final boolean isTargetVisible(int param0, int param1) {
        if (param1 >= -28) {
          field_f = -107;
          return false;
        }
        return false;
    }

    final int b(int param0) {
        int var2 = -28 % ((-79 - param0) / 38);
        return 1;
    }

    private final boolean isOnlyEightBallLeft(int param0) {
        int var2 = 0;
        int var3;
        var3 = Pool.field_O;
        for (var2 = 1; this.field_d.balls.length > var2; var2++) {
          if (var2 != 8 &&
            this.field_d.balls[var2].inPlay) {
            return false;
          }
        }
        if (param0 == 24812) {
        }
        return true;
    }

    final boolean isFirstContactLegal(ShotRecord param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -33) {
            field_f = -113;
          }
          stackIn_5_0 = (param0.groupBefore == this.ballGroup(param0.field_n, 30554));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vp.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isBallInGroup(int param0, byte param1, int param2) {
        if (param1 < 122) {
          return true;
        }
        return this.isSameGroupAsBall(param0, param2, (byte) -111);
    }

    final int initialGroup(int param0) {
        if (param0 != -1) {
          field_f = -63;
        }
        return this.isOnlyEightBallLeft(24812) ? 2 : 0;
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
          var3_int = -51 % ((-32 - param1) / 40);
          stackIn_1_0 = -1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("vp.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updateGroupLabels(int param0) {
        if (param0 >= -25) {
          field_f = -12;
        }
    }

    final int ballCount(int param0) {
        if (param0 != 26840) {
          ShotRecord var3 = (ShotRecord) null;
          this.groupMessageIndex((ShotRecord) null, 33);
        }
        return 16;
    }

    final int timeoutResolution(int param0) {
        if (param0 != -1) {
          this.updateGroupLabels(-66);
        }
        return 0;
    }

    final int initialBallInHandMode(boolean param0) {
        if (param0) {
          field_f = -51;
          return 1;
        }
        return 1;
    }

    final static void configureClientConnection(int param0, int param1, byte param2, boolean param3, int param4, int param5, boolean param6, String param7, PlatformTaskDispatcher param8, int param9, int param10, int param11, int param12, long param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            PlayerContextMenu.field_e = new CipherPacketBuffer(param9);
            JaggrabDownloader.field_j = new CipherPacketBuffer(param11);
            TextLineLayout.field_d = param0;
            LobbyGame.field_uc = param4;
            MarkerSliderPainter.field_a = param8;
            if (param2 < 71) {
              return;
            }
            cq.field_a = param5;
            kc.field_c = param12;
            NanoTickClock.field_s = param6;
            PlayerContextMenu.field_j = param13;
            UsernameSuggestionsPanel.field_S = param7;
            CushionSegment.field_g = param3;
            lf.field_b = param10;
            LobbyPlayer.field_ec = param1;
            if (MarkerSliderPainter.field_a.field_b != null) {
              try {
                nl.field_c = new BufferedFile(MarkerSliderPainter.field_a.field_b, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("vp.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            if (param7 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (param8 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void p(int param0) {
        playerNameYouHaveAnExtraShot = null;
        if (param0 != -9) {
          TimeTrialRules.configureClientConnection(89, 15, (byte) -50, true, -63, 93, true, (String) null, (PlatformTaskDispatcher) null, -10, -14, -81, -56, -98L);
        }
    }

    final Sprite targetBallSprite(ShotRecord param0, int param1) {
        RuntimeException var3 = null;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = (Sprite) null;
            return stackIn_2_0;
          }
          if (param0.groupBefore != -1) {
            stackIn_6_0 = dq.field_a.field_e[2];
          } else {
            stackIn_6_0 = dq.field_a.field_e[0];
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vp.JA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean isSameGroupAsBall(int param0, int param1, byte param2) {
        if (param2 != -111) {
          field_f = 46;
        }
        return param0 == this.ballGroup(param1, 30554) ? true : false;
    }

    final byte ballGroup(int param0, int param1) {
        if (param0 == 0) {
          return (byte) -1;
        }
        if (param0 == 8) {
          return (byte) 2;
        }
        if (param1 != 30554) {
          field_f = -105;
          return (byte) 0;
        }
        return (byte) 0;
    }

    final int evaluateShot(byte param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        IntrusiveDequeCursor var7;
        PotEvent var8;
        int var9;
        ShotRecord var10;
        ShotRecord var11;
        var9 = Pool.field_O;
        var10 = this.field_d.currentShot(90);
        var11 = var10;
        var3 = -60 / ((-37 - param0) / 60);
        if (var11 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        }
        if (var11.phase != 2) {
          throw new IllegalStateException("Shot not finished yet, foo!");
        }
        var4 = var11.groupBefore;
        var5 = 0;
        if (this.field_d.isCueBallPotted((byte) 74)) {
          var11.addEvent(3, -14, new int[]{var10.playerIndex});
          var11.field_w = (byte)(var11.field_w - 1);
          var11.field_t = true;
          var5 = var5 | (AccountWelcomePanel.field_R | (um.field_c | OptionsScreen.field_I));
        }
        if (8 == var11.field_n &&
          var4 != 2) {
          var11.addEvent(2, -14, new int[]{var10.playerIndex});
          var5 = var5 | OptionsScreen.field_I;
          var11.field_w = (byte)(var11.field_w - 1);
          var11.field_t = true;
        } else {
          if (var11.field_n == -1) {
            var11.addEvent(7, -14, new int[]{var10.playerIndex});
            var11.field_t = true;
            var11.field_w = (byte)(var11.field_w - 1);
            var5 = var5 | OptionsScreen.field_I;
          }
        }
        var6 = var11.pottedBalls.size(30);
        if (var5 == 0 &&
          var6 == 1 &&
          ((PotEvent) (var11.pottedBalls.last((byte) 62))).ballIndex == 8 &&
          var4 == 2) {
          return ag.field_e;
        }
        var7 = new IntrusiveDequeCursor(var11.pottedBalls);
        var8 = (PotEvent) (var7.last((byte) -92));
        while (var8 != null) {
          if (var8.ballIndex == 8) {
            var11.addEvent(5, -14, new int[]{this.field_d.field_A});
            return Quaternion.field_e;
          }
          if (0 != var8.ballIndex) {
            var11.field_w = (byte)(var11.field_w + 1);
          }
          var8 = (PotEvent) (var7.previous(-101));
        }
        return var5;
    }

    static {
        playerNameYouHaveAnExtraShot = "<%0>: You have an extra shot!";
    }
}
