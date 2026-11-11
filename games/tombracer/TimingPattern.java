/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimingPattern {
    private int phaseOffset;
    static int[] field_h;
    private int ticksLeft;
    private int[] durations;
    private int stepIndex;
    private boolean constant;
    static String field_k;
    private boolean field_d;
    static IntrusiveDeque field_b;
    static int[] field_g;
    private boolean toggled;
    static int[] field_e;

    final static int a(int param0) {
        if (param0 >= -41) {
          field_h = (int[]) null;
        }
        return HardwareModelVertexStream.field_f;
    }

    private TimingPattern(int param0, int param1) {
        this(new int[]{param0, param0}, param1);
        this.phaseOffset = param1;
    }

    final void encode(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          param1.writeBits((byte) 86, this.durations.length, 4);
          for (var3_int = 0; this.durations.length > var3_int; var3_int++) {
            param1.writeBits((byte) -25, this.durations[var3_int], 12);
          }
          if (param0 != 15637) {
            BitPacketBuffer var5 = (BitPacketBuffer) null;
            this.encode(-109, (BitPacketBuffer) null);
          }
          param1.writeBits((byte) -36, this.phaseOffset, 12);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasToggled(int param0) {
        if (param0 != 0) {
          field_e = (int[]) null;
        }
        return this.toggled;
    }

    TimingPattern(int[] param0) {
        this(param0, 0);
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_k = null;
        field_b = null;
        field_g = null;
        if (param0 != 9980) {
          return;
        }
        field_e = null;
    }

    public TimingPattern() {
        this(50);
    }

    final void tick(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.toggled = false;
        if (param0 != 0) {
          TimingPattern.a(-118);
        }
        if (this.field_d) {
          this.field_d = false;
          this.toggled = true;
        }
        if (this.constant) {
          if (this.ticksLeft == -1) {
            this.toggled = true;
            this.ticksLeft = 0;
            return;
          }
          this.toggled = false;
          return;
        }
        if (-1 == this.ticksLeft) {
          this.ticksLeft = this.durations[0];
        }
        this.ticksLeft = this.ticksLeft - 1;
        if (this.ticksLeft > 0) {
          return;
        }
        do {
          this.stepIndex = this.stepIndex + 1;
          if (this.durations.length <= this.stepIndex) {
            this.stepIndex = 0;
          }
          this.ticksLeft = this.durations[this.stepIndex];
          this.toggled = !this.toggled ? true : false;
        } while (this.ticksLeft == 0);
    }

    final int getTotalDuration(byte param0) {
        if (null == this.durations) {
          return 0;
        }
        if (param0 != -94) {
          TimingPattern.a(44);
        }
        return GameApplet.sum(param0 + 104, this.durations);
    }

    final void setPhaseOffset(boolean param0, int param1) {
        int var3;
        int var4;
        int stackIn_13_0 = 0;
        boolean stackIn_17_1 = false;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.constant) {
          return;
        }
        this.phaseOffset = param1;
        if (param0) {
          this.stepIndex = 38;
        }
        if (param1 > 0) {
          param1 = param1 % GameApplet.sum(10, this.durations);
          var3 = 0;
          while (param1 > 0) {
            this.tick(0);
            param1--;
            if (!this.toggled) {
              continue;
            }
            stackIn_13_0 = (var3 != 0) ? 0 : 1;
            var3 = stackIn_13_0;
          }
          stackIn_17_1 = (var3 != 0);
          this.field_d = stackIn_17_1;
        }
    }

    final int getCurrentDuration(boolean param0) {
        if (param0) {
          return 7;
        }
        if (null == this.durations) {
          return 0;
        }
        if (0 < this.durations.length) {
          return this.durations[this.stepIndex];
        }
        return 0;
    }

    final static boolean hasAnyMask34(byte param0, int param1, int param2) {
        if (param0 != -53) {
          field_k = (String) null;
        }
        return (param2 & 34) != 0 ? true : false;
    }

    final int getTicksLeft(int param0) {
        if (param0 != 12) {
          TimingPattern.releaseStatics(6);
        }
        return this.ticksLeft;
    }

    private TimingPattern(int[] param0, int param1) {
        this.ticksLeft = -1;
        try {
          this.phaseOffset = param1;
          this.durations = param0;
          this.constant = 0 == this.getTotalDuration((byte) -94) ? true : false;
          this.setPhaseOffset(false, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    TimingPattern(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        this.ticksLeft = -1;
        try {
          var3_int = param1.readBits((byte) 44, 4);
          this.durations = new int[var3_int];
          if (param0 <= 9) {
            for (var4 = 0; var3_int > var4; var4++) {
              this.durations[var4] = param1.readBits((byte) 44, 8);
            }
            this.phaseOffset = param1.readBits((byte) 44, 8);
          } else {
            for (var4 = 0; var4 < var3_int; var4++) {
              this.durations[var4] = param1.readBits((byte) 44, 12);
            }
            this.phaseOffset = param1.readBits((byte) 44, 12);
          }
          this.setPhaseOffset(false, this.phaseOffset);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TimingPattern(int param0) {
        this(param0, 0);
    }

    static {
        field_h = new int[1];
        field_k = "Room: <%0>/<%1>";
        field_g = new int[2];
        field_b = new IntrusiveDeque();
        field_e = new int[8192];
    }
}
