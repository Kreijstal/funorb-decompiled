/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CarouselGameClient {
    private IntrusiveDeque bufferedOutgoing;
    private int pingMillis;
    private boolean ready;
    private int eventFlushCounter;
    private int pendingDisconnectedPlayerMask;
    private IntrusiveDeque bufferedIncoming;
    ChunkedDataSender dataSender;
    private boolean serverUpdatesSuspended;
    private boolean readyEventSent;
    private boolean receivingGameState;
    private boolean checksumFailureReported;
    private int[] playerPingMillis;
    private int readyTick;
    ChunkedDataReceiver dataReceiver;
    private boolean stoppedWhileReceivingGameState;
    private int lastSubmittedEventTick;
    static String field_g;

    final int getPlayerPingMillis(boolean param0, int param1) {
        if (param1 >= 0 &&
          null != this.playerPingMillis &&
          param1 < this.playerPingMillis.length) {
          if (param0) {
            return this.playerPingMillis[param1];
          }
          return 123;
        }
        return -1;
    }

    final void finishReceivingGameState(byte param0) {
        this.receivingGameState = false;
        int var2 = -6 % ((param0 + 48) / 43);
    }

    final int startGame(boolean param0, int param1) {
        this.receivingGameState = false;
        this.serverUpdatesSuspended = false;
        this.bufferedIncoming.clear(110);
        int var3 = this.pendingDisconnectedPlayerMask;
        this.pendingDisconnectedPlayerMask = 0;
        this.bufferedOutgoing = new IntrusiveDeque();
        if (param1 != -13027) {
          this.dataReceiver = (ChunkedDataReceiver) null;
        }
        GetSniperCannonAimarc.a(-6940, "Called Carousel_clientgame.start_game(), resetting any buffered events");
        this.eventFlushCounter = 0;
        this.readyTick = 2147483647;
        if (!param0) {
          this.playerPingMillis = null;
          this.pingMillis = 0;
        }
        this.lastSubmittedEventTick = 0;
        this.readyEventSent = false;
        this.checksumFailureReported = false;
        return var3;
    }

    private final void setPingMillis(byte param0, int param1) {
        if (param0 != 85) {
          this.bufferedOutgoing = (IntrusiveDeque) null;
        }
        this.pingMillis = param1;
    }

    final byte[] receiveGameStateChunk(IsaacPacketBuffer param0, int param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.dataReceiver.receiveChunk(param0, param1 ^ 900, SetPointDefenceLaserProjectileDamage.field_o);
          if (param1 != 1000) {
            this.isReceivingGameState(-52);
          }
          this.receivingGameState = true;
          var4 = this.dataReceiver.takeCompletedData(-30223);
          var3 = var4;
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("kda.BA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void checkServerChecksum(CarouselCommongameInfo param0, int param1, int param2, int param3, boolean param4) {
        CarouselCommongameInfo stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CarouselEvent var11 = null;
        CarouselSlot var11_ref = null;
        int var12 = 0;
        CarouselSlotStateDump var13 = null;
        lla var14 = null;
        int var16 = 0;
        byte[] var20 = null;
        var16 = VoidHunters.field_G;
        try {
          if (param4) {
            param3 = param3 - lla.field_e;
          }
          if (this.readyTick >= param3) {
            return;
          }
          var6_int = -param0.tick + param3;
          var7 = this.getPingMillis(param2 - 1000) / 2;
          var8 = GetBombletSprayProjectileOndamageParticles.field_p * var7 / param2;
          var9 = SetMissionResnetResourceTickTime.field_q / 2 + 2 * var8;
          if (-var9 > var6_int) {
            var10 = -var6_int + shb.field_k;
            if (var10 >= param0.getHistoryLength((byte) 114)) {
              GetSniperCannonAimarc.a(param2 ^ -6388, "Carousel_clientgame_Info.check_servercrc_against_clientcrc was going to look " + var10 + " steps back");
              return;
            }
            var11 = (CarouselEvent) (param0.events.first(0));
            while (var11 != null) {
              if (!var11.isConfirmed(115) &&
                -var10 + param0.tick >= var11.tick) {
                GetSniperCannonAimarc.a(-6940, "Carousel_clientgame_Info.check_servercrc_against_clientcrc was going to look " + var10 + " steps back when unconfirmed event was back by " + (-var11.tick + param0.tick));
                return;
              }
              var11 = (CarouselEvent) (param0.events.next((byte) 36));
            }
            var11_ref = param0.getStateStepsAgo(var10, param2 ^ -949);
            var12 = SetTestActionLag.a(var11_ref, (byte) -70);
            stackIn_22_0 = (CarouselCommongameInfo) (param0);
            stackIn_23_1 = (var12 != param1);
            stackIn_22_0.outOfSync = stackIn_23_1;
            if (param0.outOfSync &&
              !this.checksumFailureReported) {
              if (!lw.field_f) {
                return;
              }
              this.checksumFailureReported = true;
              GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Now out of sync for server tick " + param3 + ", which is " + -var6_int + " ticks back, so dumping state");
              if (null == this.dataSender) {
                this.dataSender = new ChunkedDataSender(OpenGlPostProcessor.field_v);
              }
              if (this.dataSender.isIdle(param2 - 1000)) {
                GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Sending the state dump to the server");
                var13 = new CarouselSlotStateDump(-var10 + param0.tick, bk.field_w);
                var14 = new lla();
                var14.a(84, 0, var13.field_d, var13.field_d.length);
                var20 = GameApplet.copyWrittenBytes((byte) 10, var14.field_f);
                this.dataSender.setData(var20, 0);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("kda.U(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean isTooFarBehind(CarouselCommongameInfo param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.getPingMillis(0) * GetBombletSprayProjectileOndamageParticles.field_p / param1;
          var4 = wsb.field_f - var3_int;
          if (param0.ticksBehind <= var4) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kda.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean sendReadyIfNeeded(byte param0, CarouselCommongameInfo param1, int param2, IsaacPacketBuffer param3) {
        CarouselEvent var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.ready &&
            param2 >= 0 &&
            !this.readyEventSent) {
            GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Sending ready packet");
            var5 = (CarouselEvent) (IntrusiveDequeIterator.field_a.create((byte) 77));
            var5.tick = param1.tick;
            var5.setPlayerReadyEvent(param2, -125);
            this.sendEvent(var5, param3, 1000);
            this.readyEventSent = true;
          }
          if (param0 == 110) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("kda.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void requestNewestBlackBoxRecording(int param0, IsaacPacketBuffer param1) {
        DebugMessage var3 = null;
        if (param0 != -32339) {
          return;
        }
        try {
          var3 = new DebugMessage();
          var3.field_b = (DebugSendable) ((Object) new DebugRequest("<RequestNewestBlackBox>"));
          SetBuildViewAutozoomEndOnAction.a(0, var3, param1, fk.field_e);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kda.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void submitLocalEvent(boolean param0, CarouselEvent param1, CarouselCommongameInfo param2, boolean param3, boolean param4, int param5, IsaacPacketBuffer param6) {
        CarouselEvent stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        CarouselEvent var8 = null;
        RuntimeException var8_ref = null;
        CarouselCommongameInfo var9 = null;
        try {
          if (param4 &&
            !this.ready) {
            return;
          }
          if (!param2.isReplay(1)) {
            stackIn_8_0 = (CarouselEvent) (param1);
            stackIn_9_1 = !(param4);
            stackIn_8_0.confirmed = stackIn_9_1;
            if (!param0) {
              var9 = (CarouselCommongameInfo) null;
              this.startBlackBoxReplay((CarouselCommongameInfo) null, 33);
            }
            param1.tick = -param5 + param2.tick;
            if (PlayerAction.field_s == 1 &&
              this.lastSubmittedEventTick >= param1.tick) {
              return;
            }
            if (this.isTooFarBehind(param2, 1000)) {
              return;
            }
            this.lastSubmittedEventTick = param1.tick;
            if (param4) {
              if (param3) {
                var8 = (CarouselEvent) (IntrusiveDequeIterator.field_a.create((byte) 49));
                param1.copyTo((byte) 75, var8);
                this.bufferedOutgoing.addLast(-10258, var8);
              } else {
                this.sendEvent(param1, param6, 1000);
              }
            }
            if (!param2.addEvent(1, param1)) {
              SetDebrisGrabbingRange.a((byte) -101, "Carousel_clientgame: Added an action off your own carousel! " + param1);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_27_0 = var8_ref;
          stackIn_27_1 = new StringBuilder().append("kda.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void sendEvent(CarouselEvent param0, IsaacPacketBuffer param1, int param2) {
        try {
          if (param2 != 1000) {
            this.receivingGameState = true;
          }
          SetDebrisProjectileCollision.field_o = false;
          SetBuildViewAutozoomEndOnAction.a(0, param0, param1, GetMissionTimeLimit.field_o);
          SetDebrisProjectileCollision.field_o = true;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kda.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_g = null;
        if (param0 <= 4) {
          CarouselGameClient.clearSharedReferences(-77);
        }
    }

    final int getPingMillis(int param0) {
        if (param0 != 0) {
          field_g = (String) null;
        }
        return this.pingMillis;
    }

    final boolean handlePacket(IsaacPacketBuffer param0, IsaacPacketBuffer param1, boolean param2, byte param3, int param4, CarouselCommongameInfo param5) {
        boolean discarded$0 = false;
        int var10 = 0;
        Object stackIn_22_0;
        CarouselCommongameInfo stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        Object stackIn_23_0;
        boolean stackIn_23_5;
        CarouselCommongameInfo stackIn_76_0 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        int var8_int = 0;
        IsaacPacketBuffer var8 = null;
        int var9_int = 0;
        Exception var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        CarouselCommongameInfo var14 = null;
        BlackBoxRecording var15 = null;
        ServerTick var16 = null;
        Object var17 = null;
        CarouselEvent var17_ref = null;
        String var18 = null;
        byte[] var19 = null;
        DebugMessage var20 = null;
        Object var21 = null;
        DebugRequest var21_ref = null;
        byte[] var22 = null;
        int var7_intLifetime1;
        int var8_intLifetime1;
        int var9_intLifetime1;
        var17 = null;
        var21 = null;
        var13 = VoidHunters.field_G;
        try {
          if (param4 == GetSniperCannonFiringLeeway.field_o) {
            var16 = new ServerTick();
            param1.beginBitRead(-23497);
            var16.readState(param1, false);
            param1.endBitRead((byte) -38);
            if (param5 != null &&
              param5.isReplay(1)) {
              return true;
            }
            if (param5 != null &&
              !this.receivingGameState) {
              if (this.serverUpdatesSuspended) {
                return true;
              }
              var8_int = var16.field_f;
              if (param2) {
                var8_int = var8_int + SetMissionResnetResourceTickTime.field_q;
              }
              param5.requestCatchUpToTick(var8_int, var16.field_e, 0);
              if (!var16.field_e) {
                if (this.ready) {
                  stackIn_22_0 = this;
                  stackIn_22_1 = (CarouselCommongameInfo) (param5);
                  stackIn_22_2 = var16.field_g;
                  stackIn_22_3 = param3 ^ 1007;
                  stackIn_22_4 = var16.field_f;
                  if (param2) {
                    stackIn_23_0 = this;
                    stackIn_23_5 = false;
                  } else {
                    stackIn_23_0 = this;
                    stackIn_23_5 = true;
                  }
                  this.checkServerChecksum(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4, stackIn_23_5);
                }
              } else {
                GetSniperCannonAimarc.a(param3 ^ -6941, "Carousel_clientgame: Handling catchup packet here, where targettick=" + var8_int + ",(+ " + (-param5.tick + var8_int) + "), playinggame=" + param2);
                param5.catchUp(-1);
                GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Tick is now " + param5.tick);
                if (!this.ready) {
                  GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Is ready");
                }
                this.readyTick = param5.tick;
                this.ready = true;
              }
            }
            return true;
          }
          if (pr.field_d == param4) {
            var17_ref = (CarouselEvent) (IntrusiveDequeIterator.field_a.create((byte) -126));
            param1.beginBitRead(-23497);
            var17_ref.readState(param1, false);
            param1.endBitRead((byte) -114);
            if (param5 != null &&
              param5.isReplay(1)) {
              return true;
            }
            if (param5 != null &&
              !this.receivingGameState &&
              !this.serverUpdatesSuspended) {
              if (!param5.addEvent(1, var17_ref)) {
                var9_int = -1;
                if (var17_ref instanceof CarouselPlayerEvent) {
                  var9_int = ((CarouselPlayerEvent) (var17_ref)).field_k;
                }
                var18 = param5.getPlayerNames(param3 + 101).getPlayerName(param3 ^ 6, var9_int);
                SetDebrisGrabbingRange.a((byte) -92, "I'm " + IntIndexTable.field_a + ", and an action from " + var18 + " is off carousel so dropping connection");
                ifb.l(-118);
              }
            } else if (!var17_ref.isSystemEvent(120) ||
              !var17_ref.systemEvent.field_c) {
              this.bufferedIncoming.addLast(-10258, var17_ref);
            }
            return true;
          }
          if (param3 != 7) {
            var14 = (CarouselCommongameInfo) null;
            discarded$0 = this.isTooFarBehind((CarouselCommongameInfo) null, -70);
          }
          if (ehb.field_g == param4) {
            var7_int = param1.readInt(94);
            if (param5 != null &&
              !this.receivingGameState &&
              !this.serverUpdatesSuspended) {
              param0.writeIsaacByte(24335, PrintSettings.field_o);
              param0.writeInt(var7_int, 332614536);
              param0.writeInt(param5.tick, 332614536);
            }
            return true;
          }
          if (GetSniperCannonAimarc.field_o == param4) {
            var7_intLifetime1 = param1.readInt(98);
            var8_intLifetime1 = param1.readInt(74);
            var9_intLifetime1 = param1.readUnsignedByte((byte) -121);
            for (var10 = 0; var10 < var9_intLifetime1; var10++) {
              var11 = param1.readInt(95);
              var12 = param1.readInt(95);
              if (param5 != null &&
                !this.receivingGameState &&
                !this.serverUpdatesSuspended &&
                !param5.isReplay(1)) {
                this.setPlayerPingMillis(var12, false, var11);
              }
            }
            if (param5 != null &&
              !this.receivingGameState &&
              !this.serverUpdatesSuspended) {
              stackIn_76_0 = (CarouselCommongameInfo) (param5);
              if (!((CarouselCommongameInfo) (Object) stackIn_76_0).isReplay(1)) {
                param5.adjustTickOffset(false, var7_intLifetime1);
                this.setPingMillis((byte) 85, var8_intLifetime1);
              }
            }
            return true;
          }
          if (param4 != GetAngleset.field_o) {
            return false;
          }
          this.dataReceiver.receiveChunk(param1, 90, SetPointDefenceLaserProjectileDamage.field_o);
          var22 = this.dataReceiver.takeCompletedData(param3 ^ -30218);
          var19 = var22;
          var7 = var19;
          if (var7 != null) {
            var8 = SetCountermeasuresPulseRadius.a(9, var22);
            try {
              var20 = new DebugMessage();
              var8.beginBitRead(-23497);
              var20.readState(var8, false);
              var8.endBitRead((byte) -33);
              if (var20.field_b instanceof BlackBoxRecording) {
                GetSniperCannonAimarc.a(param3 - 6947, "Received black box recording");
                var15 = (BlackBoxRecording) (var20.field_b);
                param5.recording = var15;
                this.startBlackBoxReplay(param5, -125);
              } else {
                if (var20.field_b instanceof DebugRequest) {
                  var21_ref = (DebugRequest) (var20.field_b);
                  GetSniperCannonAimarc.a(-6940, "The newest black box recording=" + var21_ref.field_i);
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var9 = (Exception) (Object) decompiledCaughtException;
              GetSniperCannonAimarc.a(param3 - 6947, "Error reading in debug response");
              var9.printStackTrace();
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var7_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_95_0 = var7_ref;
          stackIn_95_1 = new StringBuilder().append("kda.D(");
          if (param0 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',');
          if (param1 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    final boolean pollStoppedWhileReceivingGameState(byte param0) {
        int var2 = this.stoppedWhileReceivingGameState ? 1 : 0;
        this.stoppedWhileReceivingGameState = false;
        int var3 = -118 / ((-41 - param0) / 55);
        return var2 != 0;
    }

    final void bufferDisconnectedPlayerMask(int param0, int param1) {
        if (param0 != -29804) {
          return;
        }
        this.pendingDisconnectedPlayerMask = param1;
    }

    final void suspendServerUpdates(byte param0) {
        this.serverUpdatesSuspended = true;
        if (param0 != -94) {
          IsaacPacketBuffer var3 = (IsaacPacketBuffer) null;
          this.requestNewestBlackBoxRecording(-3, (IsaacPacketBuffer) null);
        }
    }

    final void handleGameStopped(boolean param0) {
        if (this.receivingGameState) {
          this.stoppedWhileReceivingGameState = true;
        }
        if (!param0) {
          this.playerPingMillis = (int[]) null;
        }
    }

    final boolean isReceivingGameState(int param0) {
        if (param0 != -28208) {
          this.readyTick = 115;
        }
        return this.receivingGameState;
    }

    final void applyBufferedEventsAndCatchUp(int param0, boolean param1, CarouselCommongameInfo param2) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IntrusiveNode var6 = null;
        ServerTick var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CarouselEvent var12 = null;
        CarouselEvent var13 = null;
        var10 = VoidHunters.field_G;
        try {
          if (this.ready) {
            GetSniperCannonAimarc.a(-6940, "Carousel_clientgame:Not ready");
          }
          this.ready = false;
          this.readyTick = 2147483647;
          var4_int = 0;
          var5 = 0;
          var6 = this.bufferedIncoming.first(param0);
          while (var6 != null) {
            if (!(var6 instanceof CarouselEvent)) {
              if (var6 instanceof ServerTick) {
                var7 = (ServerTick) (var6);
                var8 = var7.field_f;
                var9 = var8;
                if (param1) {
                  GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Adding the server follow time...");
                  var9 = var9 + SetMissionResnetResourceTickTime.field_q;
                }
                if (var7.field_e) {
                  SetDebrisGrabbingRange.a((byte) -122, "Carousel_clientgame: Recieved a client catchup packet which still connecting");
                }
                var5++;
                param2.requestCatchUpToTick(var9, false, 0);
              }
            } else {
              var12 = (CarouselEvent) (var6);
              var13 = var12;
              if (MonochromeRowCacheEntry.field_e) {
                var13.pendingApplication = false;
              }
              var4_int++;
              param2.addEvent(param0 ^ 1, (CarouselEvent) (var6));
            }
            var6 = this.bufferedIncoming.next((byte) 62);
          }
          GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Adding all the way with " + var4_int + " actions, and " + var5 + " server ticks. Tick=" + param2.tick + ", Ticks behind=" + param2.ticksBehind);
          param2.catchUp(param0 - 1);
          GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Tick is now " + param2.tick);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("kda.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void sendCarouselConstant(IsaacPacketBuffer param0, int param1, String param2) {
        DebugMessage var4 = null;
        try {
          var4 = new DebugMessage();
          var4.field_b = (DebugSendable) ((Object) new DebugRequest("<SetCarouselConstant>" + param2));
          SetBuildViewAutozoomEndOnAction.a(param1 ^ param1, var4, param0, fk.field_e);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kda.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void setPlayerPingMillis(int param0, boolean param1, int param2) {
        int var5 = 0;
        int[] var4;
        int var6;
        int[] var7;
        var6 = VoidHunters.field_G;
        if (param2 < 0) {
          return;
        }
        if (param1) {
          this.pingMillis = 52;
        }
        if (null == this.playerPingMillis) {
          this.playerPingMillis = new int[1 + param2];
        } else {
          if (this.playerPingMillis.length <= param2) {
            var7 = new int[param2 + 1];
            var4 = var7;
            for (var5 = 0; this.playerPingMillis.length > var5; var5++) {
              var7[var5] = this.playerPingMillis[var5];
            }
            this.playerPingMillis = var4;
          }
        }
        this.playerPingMillis[param2] = param0;
    }

    final void sendDebugRequest(byte param0, String param1, IsaacPacketBuffer param2) {
        DebugMessage var4 = null;
        try {
          if (param0 < 63) {
            this.setPingMillis((byte) -70, -117);
          }
          var4 = new DebugMessage();
          var4.field_b = (DebugSendable) ((Object) new DebugRequest(param1));
          SetBuildViewAutozoomEndOnAction.a(0, var4, param2, fk.field_e);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kda.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateNetwork(IsaacPacketBuffer param0, int param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        CarouselEvent var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        try {
          if (!SocketNetworkArchiveClient.g(-121)) {
            if (this.ready) {
              GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Not ready");
            }
            this.ready = false;
          }
          var3_int = 80 / ((-42 - param1) / 46);
          if (this.receivingGameState) {
            if (this.ready) {
              GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Not ready");
            }
            this.ready = false;
          }
          if (null != this.dataSender) {
            this.dataSender.sendNextChunk(param0, SetPointDefenceLaserProjectileDamage.field_o, 126);
            if (this.dataSender.isIdle(0)) {
              this.dataSender = null;
              GetSniperCannonAimarc.a(-6940, "Carousel_clientgame: Finished sending from Carousel_clientgame.dataSender");
            }
          }
          this.eventFlushCounter = (1 + this.eventFlushCounter) % 5;
          if (this.bufferedOutgoing.size(3) > 0 &&
            this.eventFlushCounter == 0) {
            var4 = (CarouselEvent) (this.bufferedOutgoing.first(0));
            while (var4 != null) {
              this.sendEvent(var4, param0, 1000);
              var4.unlink(-3846);
              var4 = (CarouselEvent) (this.bufferedOutgoing.next((byte) 100));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("kda.M(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final void startBlackBoxReplay(CarouselCommongameInfo param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 >= -117) {
            return;
          }
          if (param0.recording != null) {
            param0.recording.getServerCarousel(108).copyTo((byte) 96, param0);
            param0.rewindToOldestState(-64);
            param0.replay = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kda.O(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public CarouselGameClient() {
        this.readyTick = 2147483647;
        this.bufferedIncoming = new IntrusiveDeque();
        this.dataReceiver = new ChunkedDataReceiver();
        this.serverUpdatesSuspended = true;
        this.ready = false;
        this.receivingGameState = false;
        this.bufferedOutgoing = new IntrusiveDeque();
        this.eventFlushCounter = 0;
        this.stoppedWhileReceivingGameState = false;
        this.lastSubmittedEventTick = 0;
        this.readyEventSent = false;
    }

    static {
        field_g = "Click";
    }
}
