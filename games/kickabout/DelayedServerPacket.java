/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedServerPacket extends IntrusiveNode {
    static int field_e;
    byte[] data;
    static Sprite[] field_i;
    static int field_h;
    int opcode;
    long dueTime;
    static ArgbSprite field_g;

    final static RasterBuffer a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          RasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          RasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 < 49) {
                DelayedServerPacket.a(93, true, 85);
              }
              var4 = Class.forName("BufferedImageRasterBuffer");
              var5 = (RasterBuffer) (var4.newInstance());
              var5.initialize(30, param1, param2, param3);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).initialize(30, param1, param2, param3);
              stackIn_5_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("jm.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (param0 <= 25) {
          DelayedServerPacket.a(111);
          pc.field_c = nj.a(82);
          cv.field_d = 0;
          return;
        }
        pc.field_c = nj.a(82);
        cv.field_d = 0;
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_74_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ManagerAction var7 = null;
        IntrusiveDeque var8 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        try {
          if (null != GameModesHelpScreen.field_G) {
            cv.a((byte) 78);
          }
          if (AuctionLogEntry.field_h.screenId == param0) {
            return;
          }
          if (AuctionLogEntry.field_h instanceof TeamManagementScreen &&
            nb.a(param2 + 66)) {
            RasterBuffer.a(false);
            return;
          }
          if (AuctionLogEntry.field_h instanceof MatchScreen &&
            null != um.field_e &&
            um.field_e.d((byte) 95)) {
            var8 = um.field_e.e((byte) -123);
            if (var8 != null &&
              var8.a(false) > 0) {
              or.field_d.b(81, (byte) 127);
              or.field_d.field_n = or.field_d.field_n + 2;
              var4 = or.field_d.field_n;
              or.field_d.writeByte(param2 ^ -106, var8.a(false));
              var7 = (ManagerAction) (var8.g(24009));
              while (var7 != null) {
                var7.writeToPacket(1, or.field_d);
                var7 = (ManagerAction) (var8.c(param2 ^ -33));
              }
              or.field_d.backpatchShortLength(-var4 + or.field_d.field_n, 62);
            }
          }
          GameModesHelpScreen.field_G = DebouncedValidationProvider.a(param0, 24939);
          if (26 == AuctionLogEntry.field_h.screenId &&
            !(GameModesHelpScreen.field_G instanceof MatchScreen) &&
            !PlayArea.a(param2 ^ -102)) {
            or.field_d.b(91, (byte) 114);
          }
          boolean decompiledFrameRemainder0 = true;
          if (AuctionLogEntry.field_h.screenId == 12) {
            if (sk.a((byte) 97) == GameLoopApplet.field_E.field_p &&
              IntrusiveNode.b((byte) -110) == GameLoopApplet.field_E.field_F) {
              stackIn_31_0 = (GameLoopApplet.field_E.field_A) ? 0 : 1;
              if (stackIn_31_0 != (ei.field_n ? 1 : 0)) {
                stackIn_35_0 = (GameLoopApplet.field_E.field_d) ? 0 : 1;
                if (pf.field_c) {
                  stackIn_38_1 = 0;
                } else {
                  stackIn_38_1 = 1;
                }
                if ((stackIn_35_0 == stackIn_38_1 && (tb.field_v != 1 ||
                  GameLoopApplet.field_E.field_L)) &&
                  (decompiledFrameRemainder0 = (tb.field_v == 0))) {
                  decompiledFrameRemainder0 = !(!GameLoopApplet.field_E.field_L);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              var3_int = 0;
              if (ei.field_n) {
                var3_int = var3_int | 1;
              }
              if (tb.field_v == 1) {
                var3_int = var3_int | 2;
              }
              if (pf.field_c) {
                var3_int = var3_int | 4;
              }
              var4Lifetime1 = IntrusiveNode.b((byte) -65);
              if (255 < var4Lifetime1) {
                var4Lifetime1 = 255;
              }
              var5 = sk.a((byte) 97);
              if (var5 > 255) {
                var5 = 255;
              }
              if (!PlayArea.a(100)) {
                or.field_d.b(65, (byte) 119);
                or.field_d.writeByte(103, var5);
                or.field_d.writeByte(param2 ^ -113, var4Lifetime1);
                or.field_d.writeByte(param2 + 119, var3_int);
              }
              GameLoopApplet.field_E.field_p = sk.a((byte) 97);
              GameLoopApplet.field_E.field_F = IntrusiveNode.b((byte) -95);
              GameLoopApplet.field_E.field_d = pf.field_c;
              GameLoopApplet.field_E.field_A = ei.field_n;
            }
          }
          if (param2 != -2) {
            field_e = -71;
          }
          if (!(AuctionLogEntry.field_h instanceof ButtonMenuScreen)) {
            GameModesHelpScreen.field_G.previousScreenId = AuctionLogEntry.field_h.screenId;
          } else {
            if (!(GameModesHelpScreen.field_G instanceof ButtonMenuScreen)) {
              GameModesHelpScreen.field_G.previousScreenId = AuctionLogEntry.field_h.screenId;
            } else {
              if (!((ButtonMenuScreen) (GameModesHelpScreen.field_G)).isShallowerThan((ButtonMenuScreen) (AuctionLogEntry.field_h), -4319)) {
                GameModesHelpScreen.field_G.previousScreenId = AuctionLogEntry.field_h.screenId;
              }
            }
          }
          if (AuctionLogEntry.field_h instanceof ButtonMenuScreen &&
            GameModesHelpScreen.field_G instanceof ButtonMenuScreen) {
            stackIn_74_0 = (!((ButtonMenuScreen) (GameModesHelpScreen.field_G)).isShallowerThan((ButtonMenuScreen) (AuctionLogEntry.field_h), -4319)) ? 55 : 56;
            var3_intLifetime1 = stackIn_74_0;
            ShopPlayerSlot.c(var3_intLifetime1, -119);
          } else if (!(GameModesHelpScreen.field_G instanceof ButtonMenuScreen) &&
            AuctionLogEntry.field_h instanceof ButtonMenuScreen) {
            ShopPlayerSlot.c(55, 22);
          } else {
            if (!(AuctionLogEntry.field_h instanceof ButtonMenuScreen) &&
              GameModesHelpScreen.field_G instanceof ButtonMenuScreen) {
              ShopPlayerSlot.c(56, 49);
            }
          }
          BuyPlayerDialog.field_I = 0;
          if (GameModesHelpScreen.field_G instanceof UnreadMessagesScreen) {
            ((ButtonMenuScreen) (GameModesHelpScreen.field_G)).enterScreen(0, -1, param1);
            eq.a(1, param1);
            return;
          }
          if (!(GameModesHelpScreen.field_G instanceof ButtonMenuScreen)) {
            return;
          }
          ((ButtonMenuScreen) (GameModesHelpScreen.field_G)).enterScreen(param2 + 2, 0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "jm.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var8 = 0;
        long var3 = nj.a(-127);
        int var8Lifetime1;
        if (var3 < PlayerStats.field_b) {
          return;
        }
        PlayerStats.field_b = var3 + 25L;
        float var5 = (float)param2 / (float)param0;
        int var6 = vr.a(-2, rl.field_r);
        int var7 = vr.a(-2, 1 + rl.field_r);
        if (param1 == 9863) {
          var8 = var7 - var6;
          TextInputWidget.field_R = (float)var6 + (float)var8 * var5;
          SquadGridWidget.field_Db = dg.field_c + ": " + (int)TextInputWidget.field_R + "%";
          nm.field_g.paintFrame((byte) 63);
          return;
        }
        field_h = -66;
        var8Lifetime1 = var7 - var6;
        TextInputWidget.field_R = (float)var6 + (float)var8Lifetime1 * var5;
        SquadGridWidget.field_Db = dg.field_c + ": " + (int)TextInputWidget.field_R + "%";
        nm.field_g.paintFrame((byte) 63);
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        int var1 = 43 / ((32 - param0) / 58);
    }

    DelayedServerPacket(long param0, int param1, byte[] param2) {
        try {
          this.dueTime = param0;
          this.opcode = param1;
          this.data = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jm.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
