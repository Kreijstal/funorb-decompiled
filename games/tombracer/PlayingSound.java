/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayingSound extends IntrusiveNode {
    private int field_j;
    private int field_m;
    private int field_l;
    private int field_k;
    private int field_n;
    private int field_g;
    vb field_i;
    int field_h;
    static IntrusiveDeque field_f;

    final void releaseFromPlayer(SoundEventPlayer param0, byte param1) {
        try {
          if (param1 > -32) {
            this.field_l = 53;
          }
          if (!(0 >= param0.playingCounts[this.field_l])) {
            param0.playingCounts[this.field_l] = param0.playingCounts[this.field_l] - 1;
          }
          this.unlink(25);
          rs.queueSoundRelease(this, -110);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fla.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void update(int param0, SoundEventPlayer param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 564550600) {
            this.updateVolumeAndPan(0, -104, 21, 61, -117);
          }
          if (param2 &&
            this.field_h > 0) {
            this.fadeOutStep(-90);
          }
          if (!param2 &&
            this.field_j >> 8 != this.field_h) {
            this.fadeInStep(4216);
          }
          if (this.field_i == null) {
            this.release(-91, param1);
            return;
          }
          if (this.field_i.field_f == null) {
            this.release(-91, param1);
            return;
          }
          if (this.field_i.field_f.isOutOfRange()) {
            this.release(-91, param1);
            return;
          }
          if (this.field_i.isLinked((byte) 103)) {
            return;
          }
          this.release(-91, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("fla.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 != 0) {
          field_f = (IntrusiveDeque) null;
        }
    }

    final void fadeOutStep(int param0) {
        this.field_g = this.field_g - this.field_n;
        int var2 = -91 % ((param0 + 18) / 36);
        if (0 <= this.field_g) {
          this.field_h = this.field_g >> 8;
          this.field_i.a(this.field_m, this.field_h, (byte) -21);
          return;
        }
        this.field_g = 0;
        this.field_h = this.field_g >> 8;
        this.field_i.a(this.field_m, this.field_h, (byte) -21);
    }

    final void updateVolumeAndPan(int param0, int param1, int param2, int param3, int param4) {
        this.field_h = ol.computeDistanceVolume(param0, this.field_l, (byte) -91, param3, param4, param1);
        if (param2 <= -127) {
          this.field_m = AgeValidator.a(param3, true, param0);
          this.field_i.a(this.field_m, this.field_h, (byte) -21);
          return;
        }
        SoundEventPlayer var7 = (SoundEventPlayer) null;
        this.update(-1, (SoundEventPlayer) null, false);
        this.field_m = AgeValidator.a(param3, true, param0);
        this.field_i.a(this.field_m, this.field_h, (byte) -21);
    }

    final void release(int param0, SoundEventPlayer param1) {
        try {
          int var3_int = 54 % ((-44 - param0) / 44);
          if (!(0 >= param1.playingCounts[this.field_l])) {
            param1.playingCounts[this.field_l] = param1.playingCounts[this.field_l] - 1;
          }
          this.unlink(18);
          rs.queueSoundRelease(this, -77);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fla.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    PlayingSound(vb param0, int param1, boolean param2, int param3, int param4, int param5) {
        this(param0, param4, param5);
        try {
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    PlayingSound(vb param0, int param1, int param2) {
        try {
          this.field_i = param0;
          this.field_h = param1;
          this.field_m = param2;
          this.field_g = this.field_h << 8;
          this.field_j = this.field_g;
          this.field_k = 50;
          this.field_n = this.field_g / this.field_k;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void fadeInStep(int param0) {
        this.field_g = this.field_g + this.field_n;
        if (this.field_g >= this.field_j) {
          this.field_g = this.field_j;
        }
        if (param0 == 4216) {
          this.field_h = this.field_g >> 8;
          this.field_i.a(this.field_m, this.field_h, (byte) -21);
          return;
        }
        this.fadeInStep(22);
        this.field_h = this.field_g >> 8;
        this.field_i.a(this.field_m, this.field_h, (byte) -21);
    }

    static {
    }
}
