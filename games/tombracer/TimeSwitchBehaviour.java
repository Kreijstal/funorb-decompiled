/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TimeSwitchBehaviour extends Behaviour implements SwitchSource {
    static String field_p;
    private SwitchState field_s;
    static int field_r;
    private TimingPattern field_o;
    static long[] field_q;
    static SpriteData field_n;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          while (true) {
            param1--;
            if (param1 < 0) {
              if (param3 == 1535993377) {
                return;
              }
              TimeSwitchBehaviour.a((byte) 72, -101, -90, -85, 66, 71, -106, -32);
              return;
            }
            var9 = param4;
            var5 = var9;
            var6 = param0;
            var7 = param2;
            var9[var6] = var7 + (SnakePitBehaviour.bitwiseAnd(16711422, var9[var6]) >> 1);
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("tl.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_s.encode(this.getScope((byte) 123), (byte) 76, param1);
          this.field_o.encode(15637, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getDimColour(int param0) {
        if (param0 != 17832) {
          this.getSwitchState((byte) 44);
          return 5570594;
        }
        return 5570594;
    }

    final int hashState(int param0, int param1) {
        if (param1 < -48) {
          return this.field_s.hashState(86, param0);
        }
        this.field_o = (TimingPattern) null;
        return this.field_s.hashState(86, param0);
    }

    final void resolveSwitchLinks(int param0) {
        super.resolveSwitchLinks(param0);
        this.field_s.resolveLinks((byte) 48, this.getScope((byte) 119));
    }

    final void a(TimingPattern param0, byte param1) {
        if (param1 >= -60) {
          return;
        }
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tl.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param0 >= -32) {
          field_q = (long[]) null;
          if (param1 < pka.field_b) {
            pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
            return;
          }
          if (DiskCacheWorker.field_c < param3) {
            pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
            return;
          }
          if (gca.field_d > param2) {
            pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
            return;
          }
          if (param4 <= hc.field_h) {
            rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
            return;
          }
          pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
          return;
        }
        if (param1 < pka.field_b) {
          pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
          return;
        }
        if (DiskCacheWorker.field_c < param3) {
          pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
          return;
        }
        if (gca.field_d > param2) {
          pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
          return;
        }
        if (param4 <= hc.field_h) {
          rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
          return;
        }
        pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
    }

    public final int getMaxLevel(int param0) {
        int var2 = -99 % ((-46 - param0) / 45);
        return this.field_o.getCurrentDuration(false);
    }

    TimeSwitchBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_s = new SwitchState(15);
          this.field_o = new TimingPattern();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final SwitchState getSwitchState(byte param0) {
        if (param0 >= -67) {
          return (SwitchState) null;
        }
        return this.field_s;
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.field_s = (SwitchState) null;
          return 21;
        }
        return 21;
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        field_p = null;
        field_q = null;
        if (param0 != 16711422) {
          field_q = (long[]) null;
        }
    }

    public final int getLevel(byte param0) {
        if (param0 == -108) {
          return this.field_o.getCurrentDuration(false) - this.field_o.getTicksLeft(12);
        }
        field_p = (String) null;
        return this.field_o.getCurrentDuration(false) - this.field_o.getTicksLeft(12);
    }

    public final int getLitColour(byte param0) {
        if (param0 != -108) {
          return 116;
        }
        return 16711782;
    }

    TimeSwitchBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_s = new SwitchState(15, param0, param1);
          this.field_o = new TimingPattern(param0.formatVersion, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void tick(int param0) {
        if (param0 != 5418) {
          this.getMaxLevel(27);
          if (this.field_s.f((byte) -56)) {
            this.stop(false);
            this.field_o.tick(0);
            this.field_s.setInput((byte) -14, this.field_o.hasToggled(0));
            return;
          }
          this.field_o.tick(0);
          this.field_s.setInput((byte) -14, this.field_o.hasToggled(0));
          return;
        }
        if (!this.field_s.f((byte) -56)) {
          this.field_o.tick(0);
          this.field_s.setInput((byte) -14, this.field_o.hasToggled(0));
          return;
        }
        this.stop(false);
        this.field_o.tick(0);
        this.field_s.setInput((byte) -14, this.field_o.hasToggled(0));
    }

    static {
        field_p = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
