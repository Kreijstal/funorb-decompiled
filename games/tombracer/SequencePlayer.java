/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SequencePlayer {
    private int field_j;
    private int field_g;
    private int field_c;
    private int field_l;
    private int field_d;
    int frame;
    boolean frameChanged;
    private AnimationSequence[] field_h;
    private int[] field_e;
    static String field_a;
    private boolean field_n;
    private int field_i;
    private int loopsPlayed;
    private AnimationSequence sequence;
    private int field_k;

    final void setFrame(int param0, byte param1) {
        this.frame = param0;
        this.frameChanged = true;
        this.field_g = this.sequence.frameIds[this.frame];
        this.field_c = this.sequence.frameIds[(1 + this.frame) % this.getFrameCount(param1)];
        this.field_d = 0;
    }

    private final int getFrameCount(byte param0) {
        int var2 = 118 % ((param0 - 43) / 36);
        return this.sequence.frameIds.length;
    }

    private final boolean advanceFrame(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        this.frameChanged = true;
        if (param0 >= -43) {
          this.field_i = 78;
        }
        if (this.sequence.field_i) {
          this.field_j = 1 + this.frame;
          if (this.sequence.frameIds.length <= this.field_j) {
            this.loopsPlayed = this.loopsPlayed + 1;
            if (!this.sequence.field_f &&
              this.sequence.field_j <= this.loopsPlayed) {
              return true;
            }
            if (this.sequence.field_b >= 0 &&
              this.sequence.field_b < this.getFrameCount((byte) -76)) {
              this.field_j = this.sequence.field_b;
            } else {
              this.field_j = 0;
            }
          }
          this.field_c = this.sequence.frameIds[this.field_j];
        }
        this.frame = this.frame + 1;
        if (this.sequence.frameIds.length <= this.frame) {
          if (!this.sequence.field_i) {
            this.loopsPlayed = this.loopsPlayed + 1;
          }
          if (!this.sequence.field_f &&
            this.loopsPlayed >= this.sequence.field_j) {
            return true;
          }
          if (this.sequence.field_b >= 0 &&
            this.sequence.field_b < this.sequence.frameIds.length) {
            this.frame = this.sequence.field_b;
          } else {
            this.frame = 0;
          }
        }
        this.field_g = this.sequence.frameIds[this.frame];
        int dupTemp$0 = this.sequence.frameDurations[this.frame];
        this.field_d = dupTemp$0;
        this.field_i = dupTemp$0;
        return false;
    }

    final static boolean hasMask24OrAll544(int param0, int param1, int param2) {
        if (param1 >= -9) {
          return false;
        }
        return (((24 & param2) != 0 ? 1 : 0) | (544 == (544 & param2) ? 1 : 0)) != 0;
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, int param2, boolean param3, ResourceArchive param4) {
        try {
          if (param2 != 1) {
            ResourceArchive var6 = (ResourceArchive) null;
            SequencePlayer.a((ResourceArchive) null, (ResourceArchive) null, -57, true, (ResourceArchive) null);
          }
          DefaultRoomObjectRenderer.field_b = ai.createAvailabilityQuery((byte) 121, "");
          DefaultRoomObjectRenderer.field_b.complete(-71, false);
          fha.loadCommonUiSprites(true, param1, param0, param4);
          CharacterChoiceFactory.initializeDialogStack(117);
          LegacyOpenGlTexture.field_a = fta.field_c;
          wt.field_d = fta.field_c;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cra.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void reset(byte param0) {
        this.loopsPlayed = 0;
        this.field_j = 0;
        this.frameChanged = false;
        this.field_d = 0;
        this.field_c = 0;
        this.frame = 0;
        if (param0 > -63) {
          this.loopsPlayed = 101;
        }
        this.field_g = 0;
        this.field_i = 1;
    }

    final boolean tick(int param0) {
        int dupTemp$0 = 0;
        int var2 = 0;
        if (this.field_n) {
          return false;
        }
        this.frameChanged = false;
        if (null != this.field_h &&
          0 <= this.field_k) {
          dupTemp$0 = this.field_e[this.field_k];
          this.field_e[this.field_k] = dupTemp$0 - 1;
          if (0 > dupTemp$0) {
            var2 = this.field_k;
            this.play(this.field_h[this.field_k], -30988);
            this.field_k = var2;
            this.field_h[this.field_k] = null;
            this.field_k = this.field_k + 1;
            if (this.field_k == this.field_h.length) {
              this.field_k = 0;
            }
            if (this.field_h[this.field_k] == null) {
              this.field_k = -1;
            }
          }
        }
        if (param0 < 6) {
          return true;
        }
        if (this.sequence == null) {
          return true;
        }
        this.field_d = this.field_d - 1;
        if (this.field_d <= 0) {
          return this.advanceFrame(-99);
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 > -59) {
          field_a = (String) null;
        }
    }

    final void applyToModel(int param0, ToolkitModel param1) {
        int var3_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -103 / ((param0 + 36) / 51);
          if (!this.sequence.field_i) {
            param1.animate(-121, hba.field_c, -1, this.field_g, 0, (AnimationFrameSet) null, 0, this.sequence.field_h, 0);
          } else {
            param1.animate(-124, hba.field_c, this.field_c, this.field_g, this.field_i - this.field_d, hba.field_c, this.field_i, this.sequence.field_h, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cra.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean isFinished(boolean param0) {
        boolean stackIn_8_0 = false;
        if (param0) {
          this.field_g = 93;
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.sequence && (this.sequence.field_f ||
          !(this.loopsPlayed >= this.sequence.field_j))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final void play(AnimationSequence param0, int param1) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        try {
          this.reset((byte) -91);
          this.sequence = param0;
          this.frame = -1;
          if (param1 != -30988) {
            discarded$0 = this.advanceFrame(102);
          }
          discarded$1 = this.advanceFrame(-95);
          this.field_k = -1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cra.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void queue(AnimationSequence param0, int param1, int param2) {
        boolean discarded$0 = false;
        try {
          if (this.field_h == null) {
            throw new RuntimeException();
          }
          this.field_h[this.field_l] = param0;
          if (param2 != 8198) {
            discarded$0 = this.advanceFrame(16);
          }
          this.field_e[this.field_l] = param1;
          if (0 > this.field_k) {
            this.field_k = this.field_l;
          }
          this.field_l = this.field_l + 1;
          if (this.field_h.length == this.field_l) {
            this.field_l = 0;
          }
          this.frameChanged = true;
          this.field_i = 1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "cra.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public SequencePlayer() {
        this.frameChanged = false;
    }

    SequencePlayer(int param0) {
        this.frameChanged = false;
        this.field_e = new int[param0];
        this.field_k = -1;
        this.field_h = new AnimationSequence[param0];
    }

    static {
        field_a = "There are no valid types of game that match your preferences.";
    }
}
