/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FadingSoundPlayer extends IntrusiveNode {
    static String field_e;
    private int field_t;
    private PcmSampleStream stream;
    private int soundId;
    private int field_i;
    private int field_f;
    private int field_u;
    private boolean field_r;
    private int field_x;
    private boolean field_j;
    static boolean field_q;
    static ArgbSprite field_p;
    static int field_w;
    private int field_s;
    static String field_v;
    static String field_h;
    private int field_l;
    private int startDelay;
    private boolean field_o;
    private boolean field_g;

    final void startFadeIn(int param0, boolean param1) {
        this.field_u = param0;
        this.field_o = param1 ? true : false;
        this.field_t = 0;
        this.stream.setVolume(0);
    }

    final static void linkAuctionItemsToLog(byte param0, ReceivedAuctionItem[] param1) {
        int var2_int = 0;
        long var3 = 0L;
        AuctionLogEntry var5 = null;
        int var6 = Kickabout.field_G;
        if (param0 <= 66) {
          return;
        }
        try {
          for (var2_int = 0; var2_int < param1.length; var2_int++) {
            var3 = param1[var2_int].field_a;
            var5 = (AuctionLogEntry) (ic.field_h.auctionLog.g(24009));
            while (var5 != null) {
              if (~var5.auctionId == ~var3) {
                MessageDialog.field_A[var5.slotIndex] = param1[var2_int];
                break;
              }
              var5 = (AuctionLogEntry) (ic.field_h.auctionLog.c(33));
            }
          }
          gb.field_F = true;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "wh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        if (this.field_r) {
          LobbyPlayerRow.a(this.stream, true);
        } else {
          mj.a(true, this.stream);
        }
        if (param0 <= 67) {
          this.update((byte) 6);
        }
    }

    private final void a(byte param0) {
        int var2 = this.field_i * mn.field_a >> 8;
        if (param0 != 99) {
          this.stepFadeOut(81);
        }
        this.stream = PcmSampleStream.createAtRatePercentQ6(TextFieldNode.field_Db[this.soundId].field_l, 100, var2, this.field_f);
        if (this.field_j) {
          this.stream.playBackwardFromEnd();
        }
        if (!this.field_r) {
          TextInputWidget.a(this.stream, 114);
        } else {
          DialogOverlay.a(this.stream, param0 ^ 14);
        }
        this.startDelay = this.startDelay - 1;
        this.field_o = false;
    }

    private final void stepFadeIn(byte param0) {
        int var2 = 0;
        if (param0 >= -73) {
          this.stepFadeOut(84);
        }
        if (this.field_t < this.field_u) {
          var2 = this.field_t * (this.field_x / this.field_u);
          var2 = var2 * mn.field_a >> 8;
          this.stream.setVolume(var2 >> 8);
        }
        this.field_t = this.field_t + 1;
    }

    private final void stepFadeOut(int param0) {
        int var3 = 0;
        int var2 = ((PcmSample) (this.stream.field_h)).field_i.length;
        if (!(this.stream.g() < -(this.field_s << 9) + var2)) {
          if (this.field_l < this.field_s) {
            var3 = -(this.field_l * (this.field_x / this.field_s)) + this.field_x;
            var3 = var3 * mn.field_a >> 8;
            this.stream.setVolume(var3 >> 8);
          }
          this.field_l = this.field_l + 1;
        }
        if (param0 != 1681431816) {
          this.startDelay = -78;
        }
    }

    final void startFadeOut(int param0, byte param1) {
        if (param1 != -4) {
          field_e = (String) null;
        }
        this.field_l = 0;
        this.field_s = param0;
        this.field_g = true;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          FadingSoundPlayer.a(11);
        }
        field_h = null;
        field_p = null;
        field_v = null;
        field_e = null;
    }

    final void update(byte param0) {
        if (this.stream.isSamplePositionOutOfRange()) {
          if (0 == this.startDelay) {
            this.c((byte) -109);
          } else {
            this.a((byte) 99);
          }
        }
        if (param0 >= -124) {
          return;
        }
        if (this.field_o) {
          this.stepFadeIn((byte) -101);
        }
        if (this.field_g &&
          this.startDelay == 0) {
          this.stepFadeOut(1681431816);
        }
    }

    final void setStartDelay(int param0, int param1) {
        this.startDelay = param0;
        if (param1 != 0) {
          this.stepFadeOut(9);
        }
    }

    final int getSoundId(boolean param0) {
        if (param0) {
          field_h = (String) null;
        }
        return this.soundId;
    }

    FadingSoundPlayer(int param0, int param1, int param2, boolean param3, boolean param4) {
        this.soundId = param0;
        this.field_i = param1;
        this.field_j = param3 ? true : false;
        this.field_x = this.field_i << 8;
        this.field_r = param4 ? true : false;
        this.startDelay = 1;
        this.field_f = param2;
        this.a((byte) 99);
    }

    static {
        field_q = true;
        field_w = 0;
        field_v = "<%0> is not a member, and cannot play with the current options.";
        field_h = "by win %";
        field_e = "auto-assign";
    }
}
