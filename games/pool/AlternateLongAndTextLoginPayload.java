/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateLongAndTextLoginPayload extends LongAndTextLoginPayload {
    static UiComponent field_q;
    static String playerListVsPlayerList;
    static UiComponent field_n;
    static boolean field_p;

    public static void releaseStatics(boolean param0) {
        field_n = null;
        if (!param0) {
          return;
        }
        try {
          playerListVsPlayerList = null;
          field_q = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ub.J(" + param0 + ')');
        }
    }

    final static void a(eh param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        CipherPacketBuffer var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = JaggrabDownloader.field_j;
          var3.writeCipheredOpcode(false, param1);
          var3.writeByte(5, false);
          var3.writeByte(0, false);
          if (param2 >= -113) {
            field_p = false;
          }
          var3.writeShort((byte) -81, param0.field_A);
          var3.writeByte(param0.field_r, false);
          var3.writeByte(param0.field_v, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ub.O(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final LoginPayloadKind payloadKind(byte param0) {
        LoginPayloadKind stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -87 % ((-54 - param0) / 43);
          stackIn_1_0 = MidiPcmStream.field_db;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ub.A(" + param0 + ')');
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        String stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 3) {
            stackIn_4_0 = ti.muEnteredOtherGame;
            return stackIn_4_0;
          }
          if (param1 == 6) {
            stackIn_9_0 = MouseHandler.muGameIsFull;
            return stackIn_9_0;
          }
          if (param1 == 7) {
            stackIn_12_0 = wb.muGameHasStarted;
            return stackIn_12_0;
          }
          if (param1 == 8) {
            stackIn_15_0 = EightBallRules.muYouDeclinedInvite;
            return stackIn_15_0;
          }
          if (param1 == 9) {
            stackIn_20_0 = CachedArchiveSource.muInviteWithdrawn;
            return stackIn_20_0;
          }
          if (!param2) {
            stackIn_23_0 = (String) null;
            return stackIn_23_0;
          }
          if (param1 == 10) {
            stackIn_28_0 = ViewportController.muRequestDeclined;
            return stackIn_28_0;
          }
          if (param1 == 11) {
            stackIn_33_0 = PlasmaBallSkin.muRequestWithdrawn;
            return stackIn_33_0;
          }
          if (param1 != 14) {
            stackIn_38_0 = null;
            return (String) (stackIn_38_0);
          }
          stackIn_36_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{param0}, -1, PacketBuffer.muAllPlayersHaveLeft);
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("ub.N(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, int param2, String param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        CipherPacketBuffer var7 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 125 % ((param0 + 54) / 62);
          var7 = JaggrabDownloader.field_j;
          var7.writeCipheredOpcode(false, param2);
          var7.position = var7.position + 1;
          var8 = var7.position;
          var7.writeByte(param4, false);
          if (2 == param4) {
            var7.a(-9946, param3);
          }
          if (param1 == null) {
            var7.writeShort((byte) -81, param5);
          } else {
            LobbyPlayer.a(var7, (byte) 75, param1);
          }
          var7.writeByteLengthPrefix(-var8 + var7.position, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("ub.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static TextWidgetPainter c(int param0) {
        RuntimeException var1 = null;
        TextWidgetPainter stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 4) {
            field_p = false;
          }
          if (ContentTransitionDialog.field_mb == null) {
            ContentTransitionDialog.field_mb = new TextWidgetPainter(PoolUiText.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, PoolUiText.field_a.maxAscent, -1, 2147483647, true);
          }
          stackIn_8_0 = ContentTransitionDialog.field_mb;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "ub.M(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pool.field_O;
        try {
          var3_int = param2;
          var4 = PasswordValidator.field_n;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3_int < dq.field_j.length)))) {
            var5 = IterableNodeHashTable.field_c[var3_int];
            stackIn_16_0 = ~var5;
            if (var8 == 0) {
              if (stackIn_16_0 > -1) {
                var4 = var4 + ShotRecord.field_y;
              } else {
                var6 = WidgetContainer.a(dq.field_j[var3_int], true, false);
                var7 = nn.field_c - (var6 >> 1);
                var4 = var4 + IterableDualLinkDeque.field_e;
                if (ResizableDialog.a(param0, -23, (NineBallRules.field_h << 1) + WidgetContainer.field_I, param1, (rm.field_b << 1) + var6, var4, var7 - rm.field_b)) {
                  stackIn_12_0 = var5;
                  return stackIn_12_0;
                }
                var4 = var4 + ((NineBallRules.field_h << 1) + IterableDualLinkDeque.field_e + WidgetContainer.field_I);
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = -1;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "ub.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(UiComponent param0, BitmapFont param1, UiComponent param2, VerticalScrollbar param3, UiComponent param4, UiComponent param5, UiComponent param6, UiComponent param7, boolean param8, UiComponent param9, UiComponent param10, byte param11) {
        String stackIn_13_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Sprite[] var16 = null;
        UiComponent var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        int var18Lifetime1;
        var20 = Pool.field_O;
        try {
          Ball.field_F[0] = 16764000;
          m.field_c = param1;
          TickClock.field_h = param5;
          Ball.field_F[2] = 9474303;
          Ball.field_F[3] = 16736511;
          JaggrabDownloader.field_l = param8;
          Ball.field_F[4] = 16711935;
          Ball.field_F[1] = 6356832;
          ThreeSliceButtonPainter.field_A[2] = 16736352;
          Ball.field_F[4] = 16711935;
          ThreeSliceButtonPainter.field_A[0] = 16764000;
          ThreeSliceButtonPainter.field_A[1] = 6356832;
          FreePlayRules.field_g = 8421504;
          ThreeSliceButtonPainter.field_A[3] = 16736511;
          var12 = new Sprite(4, 4);
          var13 = var12.field_D;
          var14 = var12.field_D;
          var12.field_D[15] = 7368816;
          var15 = var12.field_D;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var14[5] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          fl.field_q = new UiComponent(0L, param0);
          ProgressDialog.field_hb = new UiComponent(0L, param10);
          fl.field_q.addChild(-1, ProgressDialog.field_hb);
          var17 = new UiComponent(0L, (UiComponent) null);
          var17.children = new IntrusiveDeque();
          Js5ArchiveManager.field_b = new ScrollPane(0L, var17, param9, param3);
          ProgressDialog.field_hb.addChild(15, Js5ArchiveManager.field_b);
          ph.field_d = new UiComponent(0L, param6);
          ProgressDialog.field_hb.addChild(-3, ph.field_d);
          TimeTrialSelectScreen.field_J = new UiComponent(0L, param4);
          TimeTrialSelectScreen.field_J.font = m.field_c;
          ph.field_d.addChild(-125, TimeTrialSelectScreen.field_J);
          ph.field_d.markDescendantsToInheritVisualState((byte) -128);
          NineBallRules.field_j = new UiComponent(0L, (UiComponent) null);
          NineBallRules.field_j.frameSprites = var16;
          ph.field_d.addChild(17, NineBallRules.field_j);
          AlignedIconLabel.field_Mb = new UiComponent[5];
          il.field_g = new UiComponent[5];
          ln.field_v = new UiComponent[5];
          ta.field_b = new UiComponent[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_35_0 = -1;
            stackIn_35_1 = ~var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_35_0 == stackIn_35_1) {
                if (JaggrabDownloader.field_l) {
                  stackIn_13_0 = BirthDateValidator.muChatLobby;
                } else {
                  stackIn_13_0 = SingleChildWidget.muChatPublic;
                }
                var19 = stackIn_13_0;
              } else if (var18 == 1 &&
                JaggrabDownloader.field_l) {
                var19 = Camera.muChatGame;
              } else {
                decompiledFrameRemainder0 = (var18 == 2);
                if (decompiledFrameRemainder0) {
                  var19 = MidiPcmStream.muChatPrivate;
                }
              }
              if (decompiledFrameRemainder0) {
                il.field_g[var18] = new UiComponent(0L, param2);
                ln.field_v[var18] = new UiComponent(0L, TickClock.field_h, var19);
                AlignedIconLabel.field_Mb[var18] = new UiComponent(0L, (UiComponent) null);
                AlignedIconLabel.field_Mb[var18].verticalAlignment = 1;
                ta.field_b[var18] = new UiComponent(0L, TickClock.field_h);
                ta.field_b[var18].verticalAlignment = 1;
                il.field_g[var18].addChild(-98, ln.field_v[var18]);
                il.field_g[var18].addChild(68, AlignedIconLabel.field_Mb[var18]);
                il.field_g[var18].addChild(72, ta.field_b[var18]);
                il.field_g[var18].markDescendantsToInheritVisualState((byte) -126);
                fl.field_q.addChild(104, il.field_g[var18]);
                bq.field_m = bq.field_m + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            d.field_e = new UiComponent(0L, param7);
            d.field_e.text = HuffmanCodec.reportabuse;
            fl.field_q.addChild(25, d.field_e);
            if (!mg.a(61) ||
              ea.field_z) {
              ThemeSelectScreen.field_J = new jj(0, 0, 0, 0);
            }
            stackIn_35_0 = -31;
            stackIn_35_1 = (-73 - param11) / 49;
          }
          var18Lifetime1 = stackIn_35_0 / stackIn_35_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_40_0 = var12_ref;
          stackIn_40_1 = new StringBuilder().append("ub.L(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param4 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',');
          if (param5 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param6 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param7 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param10 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param11).append(')').toString());
        }
    }

    AlternateLongAndTextLoginPayload(long param0, String param1) {
        super(param0, param1);
    }

    static {
        playerListVsPlayerList = "<%0><br>versus<br><%1>";
    }
}
