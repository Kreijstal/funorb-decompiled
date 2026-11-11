/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModelAnimator {
    private float frameAccumulator;
    private int field_b;
    private int scale;
    private int field_j;
    private int field_a;
    private int field_l;
    private float speed;
    static UiComponent field_g;
    private int field_e;
    static String field_c;
    private SequencePlayer player;
    private int field_d;

    final void playAnimation(int param0, int param1, int param2, boolean param3, int param4, float param5) {
        int var8 = TombRacer.field_G ? 1 : 0;
        this.speed = param5;
        if (~param4 == param1) {
          this.stop(110);
          return;
        }
        if (param0 == -1) {
          this.stop(110);
          return;
        }
        if (param3) {
          this.field_a = param2;
          this.field_j = param0;
          this.field_e = param4;
          if (null != this.player) {
            this.player.reset((byte) -105);
            this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
            return;
          }
          if (this.field_l <= 0) {
            this.player = new SequencePlayer();
            this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
            return;
          }
          this.player = new SequencePlayer(this.field_l);
          this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
          return;
        }
        if (param4 != this.field_e) {
          this.field_a = param2;
          this.field_j = param0;
          this.field_e = param4;
          if (null != this.player) {
            this.player.reset((byte) -105);
            this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
            return;
          }
          if (this.field_l <= 0) {
            this.player = new SequencePlayer();
            this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
            return;
          }
          this.player = new SequencePlayer(this.field_l);
          this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
          return;
        }
        if (param2 != this.field_a) {
          this.field_a = param2;
          this.field_j = param0;
          this.field_e = param4;
          if (null != this.player) {
            this.player.reset((byte) -105);
            this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
            return;
          }
          if (this.field_l <= 0) {
            this.player = new SequencePlayer();
            this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
            return;
          }
          this.player = new SequencePlayer(this.field_l);
          this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
          return;
        }
        if (param0 == this.field_j) {
          return;
        }
        this.field_a = param2;
        this.field_j = param0;
        this.field_e = param4;
        if (null != this.player) {
          this.player.reset((byte) -105);
          this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
          return;
        }
        if (this.field_l > 0) {
          this.player = new SequencePlayer(this.field_l);
          this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
          return;
        }
        this.player = new SequencePlayer();
        this.player.play(LegacyOpenGlUnlitEffect.getAnimationSequence(param1 ^ -2, param0, param2, param4), -30988);
    }

    final void tick(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
          this.speed = -0.3097847104072571f;
          if (this.player != null) {
            this.frameAccumulator = this.frameAccumulator + this.speed;
            while (1.0f <= this.frameAccumulator) {
              this.player.tick(param0 + 22);
              this.frameAccumulator = this.frameAccumulator - 1.0f;
            }
            return;
          }
          return;
        }
        if (this.player != null) {
          this.frameAccumulator = this.frameAccumulator + this.speed;
          while (1.0f <= this.frameAccumulator) {
            this.player.tick(param0 + 22);
            this.frameAccumulator = this.frameAccumulator - 1.0f;
          }
          return;
        }
    }

    final void queueAnimation(int param0, int param1, int param2, int param3, int param4) {
        if (param0 >= 41) {
          this.player.queue(LegacyOpenGlUnlitEffect.getAnimationSequence(-2, param3, param2, param4), param1, 8198);
          return;
        }
        this.queueAnimation(57, -19, 81, -80, -19);
        this.player.queue(LegacyOpenGlUnlitEffect.getAnimationSequence(-2, param3, param2, param4), param1, 8198);
    }

    final boolean isFinished(int param0) {
        if (param0 != 0) {
          this.field_e = 72;
          return this.player.isFinished(false);
        }
        return this.player.isFinished(false);
    }

    final boolean hasFrameChanged(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.player == null ? false : this.player.frameChanged;
    }

    final static int cos2048(int param0, int param1) {
        if (param0 != 0) {
          return 9;
        }
        return TriangleRasterizer.cosTable[2047 & param1];
    }

    final int getFrame(int param0) {
        if (param0 == 0) {
          return null == this.player ? 0 : this.player.frame;
        }
        this.field_b = -41;
        return null == this.player ? 0 : this.player.frame;
    }

    ModelAnimator(int param0, int param1) {
        this(param0, param1, 0);
    }

    final ka buildModel(boolean param0, int param1, boolean param2, byte param3) {
        ka var5;
        ka var6;
        ka var7;
        ka var8;
        var5 = ScoreSubmission.a(this.field_d, param0, param2, param1 + 3, this.field_b);
        if (var5 == null) {
          return var5;
        }
        if (null != this.player) {
          var7 = rga.a(var5, param3, 124);
          var6 = var7;
          if (param1 != -1) {
            field_c = (String) null;
          }
          if (null != this.player) {
            this.player.applyToModel(-101, var7);
          }
          if (128 == this.scale) {
            return var7;
          }
          var7.O(this.scale, this.scale, this.scale);
          return var7;
        }
        if (this.scale == 128) {
          return var5;
        }
        var8 = rga.a(var5, param3, 124);
        if (param1 != -1) {
          field_c = (String) null;
        }
        if (null != this.player) {
          this.player.applyToModel(-101, var8);
        }
        if (128 == this.scale) {
          return var8;
        }
        var8.O(this.scale, this.scale, this.scale);
        return var8;
    }

    final void setFrame(int param0, int param1) {
        this.player.setFrame(param1, (byte) 109);
        int var3 = 48 / ((param0 - 20) / 57);
    }

    final void setScale(boolean param0, int param1) {
        this.scale = param1;
        if (!param0) {
          return;
        }
        this.frameAccumulator = 1.865414023399353f;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 <= 55) {
          ModelAnimator.cos2048(56, 48);
          field_g = null;
          return;
        }
        field_g = null;
    }

    final int getCurrentAnimationLength(byte param0) {
        int var2 = 88 % ((-47 - param0) / 34);
        return this.getAnimationLength(this.field_a, (byte) 66, this.field_e, this.field_j);
    }

    final ka getModel(byte param0) {
        if (param0 != 74) {
          return (ka) null;
        }
        return this.buildModel(false, param0 ^ -75, false, (byte) 1);
    }

    final void setModelIds(int param0, int param1, int param2) {
        this.field_d = param2;
        this.field_b = param0;
        if (param1 == -23308) {
          return;
        }
        this.frameAccumulator = 0.5494057536125183f;
    }

    final int getAnimationLength(int param0, byte param1, int param2, int param3) {
        AnimationSequence var5 = null;
        AnimationSequence var5Lifetime1;
        if (param1 != 66) {
          field_g = (UiComponent) null;
          var5 = LegacyOpenGlUnlitEffect.getAnimationSequence(-2, param3, param0, param2);
          if (var5 == null) {
            return 0;
          }
          return var5.getTotalDuration((byte) 117, true);
        }
        var5Lifetime1 = LegacyOpenGlUnlitEffect.getAnimationSequence(-2, param3, param0, param2);
        if (var5Lifetime1 == null) {
          return 0;
        }
        return var5Lifetime1.getTotalDuration((byte) 117, true);
    }

    private final void stop(int param0) {
        this.field_e = -1;
        this.player = null;
        if (param0 > 97) {
          this.field_j = -1;
          return;
        }
        field_g = (UiComponent) null;
        this.field_j = -1;
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4) {
        this.playAnimation(param3, 0, param0, param4, param2, 1.0f);
        if (!param1) {
          return;
        }
        this.field_b = -21;
    }

    final void a(int param0, boolean param1, byte param2, int param3) {
        this.a(-1, false, param0, param3, param1);
        int var5 = 35 / ((param2 + 34) / 41);
    }

    ModelAnimator(int param0, int param1, int param2) {
        this.scale = 128;
        this.setModelIds(param0, -23308, param1);
        this.field_l = param2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.queueAnimation(79, param1, param3, param0, param2);
    }

    static {
        field_c = "New Game";
    }
}
