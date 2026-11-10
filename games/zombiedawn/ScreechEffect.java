/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreechEffect extends IntrusiveNode {
    private int field_l;
    int field_m;
    static PcmSampleStream field_r;
    static int field_j;
    private int field_i;
    static Sprite field_k;
    private int field_s;
    private int field_n;
    int field_q;
    private PcmSampleStream field_o;
    static MusicCrossfadeStream field_p;
    private int field_h;

    final boolean isFinished(int param0) {
        if (param0 < 81) {
          return true;
        }
        if (this.field_n < 750) {
          return false;
        }
        if (this.field_l == 0) {
          return true;
        }
        return false;
    }

    final static void createNoiseTexture(int param0) {
        LogoPoseHelpers.field_b = new OctaveNoiseMap(SpriteEffectHelpers.random.nextInt(), 3, 256, 256, 256, 2.0f, true);
        if (param0 == 11800) {
          SectorCacheStore.field_c = LogoPoseHelpers.field_b.generateMap(256, 256, param0 - 11827);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        if (param0 != -2135443998) {
          ScreechEffect.releaseStatics(30);
          field_r = null;
          field_k = null;
          return;
        }
        field_r = null;
        field_k = null;
    }

    final void update(boolean param0) {
        int fieldTemp$0 = 0;
        WorldObject var2;
        Human var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (this.isFinished(116)) {
          return;
        }
        fieldTemp$0 = this.field_s;
        this.field_s = this.field_s + 1;
        if (fieldTemp$0 <= 10) {
          this.field_i = this.field_i + 7;
          if (param0) {
            return;
          }
          if (256 < this.field_i) {
            this.field_i = 0;
          }
          if (this.field_n >= 750) {
            this.field_l = this.field_l - this.field_h;
          } else {
            if (this.field_l < 256) {
              this.field_l = this.field_l + this.field_h;
            }
            this.field_n = this.field_n + 1;
          }
          if (this.field_l > 256) {
            this.field_l = 256;
          }
          if (0 > this.field_l) {
            this.field_l = 0;
          }
          return;
        }
        this.field_s = 0;
        var2 = (WorldObject) (Js5Archive.field_e.zombies.last((byte) 26));
        while (var2 != null) {
          if (var2 instanceof Human) {
            var3 = (Human) (var2);
            var3.updateScreechReaction(this, -26246);
          }
          var2 = (WorldObject) (Js5Archive.field_e.zombies.previous(false));
        }
        this.field_i = this.field_i + 7;
        if (param0) {
          return;
        }
        if (256 < this.field_i) {
          this.field_i = 0;
        }
        if (this.field_n >= 750) {
          this.field_l = this.field_l - this.field_h;
        } else {
          if (this.field_l < 256) {
            this.field_l = this.field_l + this.field_h;
          }
          this.field_n = this.field_n + 1;
        }
        if (this.field_l > 256) {
          this.field_l = 256;
        }
        if (0 > this.field_l) {
          this.field_l = 0;
        }
        return;
    }

    final void restart(byte param0) {
        this.field_n = 750;
        if (param0 != -64) {
          return;
        }
        this.field_l = 0;
    }

    final static void beginReconnect(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (AccountResultHelpers.field_a == 10) {
          LoginAndPacketHelpers.beginReconnectLogin((byte) 41);
          AccountResultHelpers.field_a = 11;
          MusicPatch.field_p = true;
          var1 = 39 / ((46 - param0) / 34);
          return;
        }
        if (!IntRecordReplyHelpers.alwaysTrue(-23022)) {
          LoginAndPacketHelpers.beginReconnectLogin((byte) 41);
          AccountResultHelpers.field_a = 11;
          MusicPatch.field_p = true;
          var1Lifetime1 = 39 / ((46 - param0) / 34);
          return;
        }
        MusicPatch.field_p = true;
        var1Lifetime2 = 39 / ((46 - param0) / 34);
    }

    final void draw(Camera param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.worldToScreenX(this.field_m, (byte) -61);
          var4 = param0.worldToScreenY(this.field_q, 0);
          this.field_o.setVolume(ArchiveRequest.getPositionalVolume(var4, 51, var3_int));
          if (!param1) {
            return;
          }
          if (var3_int >= -256 &&
            -256 <= var4 &&
            var3_int <= WhirlpoolHasher.field_e + 256 &&
            256 + DropdownList.field_P >= var4) {
            if (this.field_l < 256) {
              stackIn_11_0 = (-this.field_i + 256) * this.field_l >> 10;
            } else {
              stackIn_11_0 = -this.field_i + 256 >> 2;
            }
            var5 = stackIn_11_0;
            Rasterizer.fillCircleBlended(var3_int, var4, this.field_i, 0, var5);
            SpriteEffectHelpers.drawTransparent(Camera.field_o, -256 + var3_int, -256 + var4, this.field_l);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("nc.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    ScreechEffect(int param0, int param1) {
        this.field_s = 0;
        this.field_o = null;
        this.field_i = 0;
        this.field_l = 0;
        this.field_q = param1;
        this.field_n = 0;
        this.field_h = 3;
        this.field_m = param0;
        this.field_o = EmptyWidgetPainter.queueSoundEffect(17, false);
    }

    static {
        field_r = null;
        field_j = 0;
    }
}
