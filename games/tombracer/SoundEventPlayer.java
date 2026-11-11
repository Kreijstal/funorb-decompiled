/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEventPlayer extends SoundEventQueue {
    private boolean muted;
    int[] playingCounts;
    int listenerY;
    int listenerX;
    private IntrusiveDeque playing;
    static Sprite[] field_f;
    static String field_d;

    private final void resetCounts(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        int var2Lifetime1;
        if (param0) {
          for (var2 = 0; this.playingCounts.length > var2; var2++) {
            this.playingCounts[var2] = 0;
          }
          return;
        }
        this.playing = (IntrusiveDeque) null;
        for (var2Lifetime1 = 0; this.playingCounts.length > var2Lifetime1; var2Lifetime1++) {
          this.playingCounts[var2Lifetime1] = 0;
        }
    }

    final void stopAll(byte param0) {
        PlayingSound var4 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        PlayingSound var4Lifetime1;
        if (param0 >= -118) {
          this.playing = (IntrusiveDeque) null;
        } else {
          var4 = (PlayingSound) (this.playing.first(-80));
          while (var4 != null) {
            rs.queueSoundRelease(var4, 107);
            var4 = (PlayingSound) (this.playing.next(107));
          }
          this.playing.clear(8);
          this.resetCounts(true);
          return;
        }
        var4Lifetime1 = (PlayingSound) (this.playing.first(-80));
        while (var4Lifetime1 != null) {
          rs.queueSoundRelease(var4Lifetime1, 107);
          var4Lifetime1 = (PlayingSound) (this.playing.next(107));
        }
        this.playing.clear(8);
        this.resetCounts(true);
    }

    final static int a(PacketBuffer param0, int param1, IntrusiveDeque param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = new StringBuilder(8);
          var4 = 0;
          var5 = -1;
          while (true) {
            if (param0.position < param0.payload.length) {
              var5 = param0.readUnsignedByte(255);
              if ((~var5 != ~HelloCommand.field_q ||
                var4 != 0) &&
                (!NetworkArchiveRequest.a(param0, mga.field_j, var5, true) ||
                var4 != 0)) {
                if (ConstrainToCircleLocomotor.field_w != var5) {
                  discarded$2 = var8.append((char)var5);
                  continue;
                }
                boolean decompiledFrameRemainder0 = true;
                if (var4 != 0) {
                  if (param0.payload.length == param0.position + 1) {
                    throw new RuntimeException("Unterminated quote!");
                  }
                  var6 = param0.readByte((byte) 52);
                  if (!NetworkArchiveRequest.a(param0, mga.field_j, var6, true) &&
                    HelloCommand.field_q != var6) {
                    if (ConstrainToCircleLocomotor.field_w == var6) {
                      discarded$0 = var8.append((char)var6);
                    } else {
                      param0.position = param0.position - 1;
                      discarded$1 = var8.append((char)var5);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    param0.position = param0.position - 1;
                  }
                }
                stackIn_26_0 = (var4 != 0) ? 0 : 1;
                var4 = stackIn_26_0;
                continue;
              }
            }
            break;
          }
          param2.addLast((byte) -59, new gka(var8.toString()));
          if (param1 != -58) {
            field_d = (String) null;
          }
          stackIn_30_0 = var5;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("w.O(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final PlayingSound play(SoundEvent param0, int param1) {
        Object stackIn_11_0 = null;
        Object stackIn_20_0 = null;
        PlayingSound stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vb var11 = null;
        PlayingSound var12 = null;
        try {
          var3_int = param0.getSoundId(9800);
          if (this.muted) {
            return null;
          }
          if (this.playing.size((byte) -16) >= 15) {
            return null;
          }
          if (var3_int < 0) {
            return null;
          }
          if (var3_int >= 98) {
            return null;
          }
          if (this.playingCounts[var3_int] >= QueuedPlayerEvent.field_f[var3_int]) {
            stackIn_11_0 = null;
            return (PlayingSound) (stackIn_11_0);
          }
          if (26 == var3_int) {
            this.enqueue(-101, new SoundEvent(28, param0.getX(param1 - 43), param0.getY(-127), param0.getParameter(4)));
          }
          if (this.triggersFollowUpSound(-123, var3_int)) {
            this.enqueue(param1 ^ 86, new SoundEvent(89, param0.getX(param1 + 105), param0.getY(-121), param0.getParameter(param1 ^ -62)));
          }
          var4 = to.field_j[var3_int];
          if (var4 == -1) {
            stackIn_20_0 = null;
            return (PlayingSound) (stackIn_20_0);
          }
          var5 = to.field_i[var3_int];
          if (0 < var5) {
            var4 = var4 + uca.cosmeticRandom.nextBounded(var5, 0);
          }
          var6 = 0;
          if (var3_int == 28) {
            var6 = 300;
          }
          if (param1 == ~var3_int) {
            var6 = 300;
          }
          if (var3_int == 89) {
            var6 = 300;
          }
          var7 = to.field_m[var3_int] ? 1 : 0;
          var8 = to.field_k[var3_int] ? 1 : 0;
          var9 = -1;
          var10 = to.field_n[var3_int];
          if (var8 == 0) {
            var9 = AgeValidator.a(this.listenerX, true, param0.getX(param1 - 52));
            var10 = ol.computeDistanceVolume(param0.getX(-118), var3_int, (byte) -91, this.listenerX, param0.getY(-121), this.listenerY);
          }
          var11 = MatchProtocol.a(100, (byte) -58, var9, var4, var6, var10);
          if (var7 != 0) {
            var11.field_f.setLoopCount(-1);
          }
          var12 = new PlayingSound(var11, var3_int, var7 != 0, var4, var10, var9);
          this.playing.addLast((byte) -100, var12);
          this.playingCounts[var3_int] = this.playingCounts[var3_int] + 1;
          stackIn_37_0 = var12;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("w.H(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 < 9) {
          this.playing = (IntrusiveDeque) null;
        }
    }

    final void setMuted(boolean param0, int param1) {
        if (param1 == 0) {
          this.muted = param0 ? true : false;
          return;
        }
        this.playQueuedEvents(110, true);
        this.muted = param0 ? true : false;
    }

    private final boolean triggersFollowUpSound(int param0, int param1) {
        if (param0 > -89) {
          this.playing = (IntrusiveDeque) null;
          if (param1 == 85) {
            return true;
          }
          if (param1 == 86) {
            return true;
          }
          if (87 == param1) {
            return true;
          }
          if (88 != param1) {
            return false;
          }
          return true;
        }
        if (param1 == 85) {
          return true;
        }
        if (param1 == 86) {
          return true;
        }
        if (87 == param1) {
          return true;
        }
        if (88 != param1) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        if (param0 > -26) {
          field_f = (Sprite[]) null;
          field_d = null;
          field_f = null;
          return;
        }
        field_d = null;
        field_f = null;
    }

    final void setListenerPosition(int param0, int param1, int param2) {
        this.listenerX = param1;
        if (param2 != 89) {
          field_d = (String) null;
          this.listenerY = param0;
          return;
        }
        this.listenerY = param0;
    }

    final void playQueuedEvents(int param0, boolean param1) {
        boolean discarded$1 = false;
        PlayingSound var6 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        SoundEvent var5 = (SoundEvent) (this.events.first(-80));
        PlayingSound var6Lifetime1;
        while (var5 != null) {
          this.play(var5, -58);
          var5.unlink(15);
          var5 = (SoundEvent) (this.events.next(124));
        }
        if (param0 < 75) {
          discarded$1 = this.triggersFollowUpSound(53, -23);
        } else {
          var6 = (PlayingSound) (this.playing.first(-80));
          while (var6 != null) {
            var6.update(564550600, this, param1);
            var6 = (PlayingSound) (this.playing.next(110));
          }
          return;
        }
        var6Lifetime1 = (PlayingSound) (this.playing.first(-80));
        while (var6Lifetime1 != null) {
          var6Lifetime1.update(564550600, this, param1);
          var6Lifetime1 = (PlayingSound) (this.playing.next(110));
        }
    }

    public SoundEventPlayer() {
        this.playingCounts = new int[98];
        this.playing = new IntrusiveDeque();
    }

    static {
        field_d = "Offering Rematch";
    }
}
