/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EffectSwitchBehaviour extends Behaviour implements SwitchSource {
    private int field_v;
    private int field_n;
    private int field_w;
    static long[] field_r;
    private int field_s;
    private FlagSet field_u;
    private SwitchState field_q;
    private FlagSet field_t;
    static String field_o;
    private int field_p;

    final void encode(boolean param0, BitPacketBuffer param1) {
        super.encode(param0, param1);
        this.field_q.encode(this.getScope((byte) 116), (byte) 111, param1);
        param1.writeBits((byte) 42, this.field_w, 8);
        param1.writeBits((byte) -128, this.field_v, 8);
        param1.writeBits((byte) 70, this.field_n, 4);
        this.field_u.encode(param1, (byte) -128);
        if (param0) {
          return;
        }
        try {
          this.field_t.encode(param1, (byte) -124);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eia.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getMaxLevel(int param0) {
        int var2 = -12 % ((param0 + 46) / 45);
        return this.field_w;
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        if (param0 <= 1) {
          field_r = (long[]) null;
        }
        field_r = null;
    }

    final int hashState(int param0, int param1) {
        if (param1 > -48) {
          Trap var4 = (Trap) null;
          this.attachToTrap(false, (Trap) null);
        }
        param0 = CurveOperator.mixHash((byte) 87, param0, this.field_s);
        param0 = CurveOperator.mixHash((byte) 82, param0, this.field_p);
        return this.field_q.hashState(89, param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != -2029) {
          return;
        }
        this.field_v = param0;
        this.field_n = param1;
        this.field_w = param2;
    }

    final void resolveSwitchLinks(int param0) {
        super.resolveSwitchLinks(param0 ^ 0);
        this.field_q.resolveLinks((byte) 48, this.getScope((byte) 110));
        if (param0 != -2) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(false, (BitPacketBuffer) null);
        }
    }

    final void setTriggeringType(boolean param0, int param1, byte param2) {
        boolean discarded$0 = false;
        if (param2 >= -119) {
          discarded$0 = this.isTriggeringType(true, -31);
        }
        this.field_u.set(param1, -17075, param0);
    }

    private final boolean isTriggeringType(boolean param0, int param1) {
        if (!param0) {
          this.tick(85);
        }
        if (!this.field_u.get(0, param1)) {
          return false;
        }
        return true;
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          return -122;
        }
        return 18;
    }

    private final boolean isTriggeredBy(byte param0, int param1) {
        if (param0 >= -109) {
          this.field_q = (SwitchState) null;
        }
        if (!this.field_t.get(0, param1)) {
          return false;
        }
        return true;
    }

    EffectSwitchBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var6Lifetime1;
        this.field_s = 0;
        try {
          this.field_q = new SwitchState(15, param0, param1);
          this.field_w = param1.readBits((byte) 44, 8);
          this.field_v = param1.readBits((byte) 44, 8);
          this.field_n = param1.readBits((byte) 44, 4);
          if (param0.formatVersion < 9) {
            var4_int = param1.readBits((byte) 44, 3);
            var12 = new int[var4_int];
            var10 = var12;
            var5 = var10;
            for (var6 = 0; var4_int > var6; var6++) {
              var5[var6] = param1.readBits((byte) 44, 4);
            }
            var6Lifetime1 = param1.readBits((byte) 44, 3);
            var13 = new int[var6Lifetime1];
            var11 = var13;
            var7 = var11;
            for (var8 = 0; var8 < var6Lifetime1; var8++) {
              var7[var8] = param1.readBits((byte) 44, 4);
            }
            this.field_u = new FlagSet(6);
            this.field_u.setAll(var12, 0);
            this.field_t = new FlagSet(6);
            this.field_t.setAll(var13, 0);
            return;
          }
          this.field_u = new FlagSet(6, param0.formatVersion, param1);
          this.field_t = new FlagSet(6, param0.formatVersion, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("eia.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int onAreaEffect(int param0, int param1, Effect param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -56 % ((62 - param4) / 52);
          stackIn_1_0 = this.reactToEffect((byte) 14, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("eia.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int onProjectileEffect(int param0, Projectile param1, Effect param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25940) {
            this.field_w = 2;
          }
          stackIn_3_0 = this.reactToEffect((byte) 14, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("eia.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final int reactToEffect(byte param0, Effect param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          var3_int = param1.type;
          if (this.isTriggeringType(true, var3_int)) {
            this.field_p = 3;
            this.field_s = this.field_s + param1.size;
            stackIn_5_0 = param1.size;
            return stackIn_5_0;
          }
          if (!this.isTriggeredBy((byte) -127, var3_int)) {
            stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          this.field_p = -3;
          this.field_s = this.field_s - param1.size;
          stackIn_8_0 = param1.size;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("eia.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final int getDimColour(int param0) {
        if (param0 != 17832) {
          this.field_u = (FlagSet) null;
        }
        return 1131537;
    }

    public final int getLevel(byte param0) {
        if (param0 != -108) {
          Effect var3 = (Effect) null;
          this.onProjectileEffect(-122, (Projectile) null, (Effect) null);
        }
        return this.field_s;
    }

    public final SwitchState getSwitchState(byte param0) {
        if (param0 >= -67) {
          return (SwitchState) null;
        }
        return this.field_q;
    }

    public final int getLitColour(byte param0) {
        if (param0 != -108) {
          return -2;
        }
        return 12320699;
    }

    final void setTriggeredBy(boolean param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_t.set(param1, -17075, param0);
        if (param2 > -32) {
          Effect var5 = (Effect) null;
          discarded$0 = this.reactToEffect((byte) -27, (Effect) null);
        }
    }

    final void attachToTrap(boolean param0, Trap param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          super.attachToTrap(param0, param1);
          for (var3_int = 0; var3_int < 6; var3_int++) {
            if (this.field_u.get(0, var3_int) ||
              this.field_t.get(0, var3_int)) {
              param1.setHandlesEffectType(26492, true, var3_int);
            }
          }
          if (4 > this.getRoom(true).formatVersion) {
            param1.setObstructionLevel(3, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("eia.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void tick(int param0) {
        if (this.field_q.f((byte) -56)) {
          this.stop(false);
        }
        this.field_s = this.field_s - this.field_n;
        if (this.field_s < 0) {
          this.field_s = 0;
        } else {
          if (this.field_v < this.field_s) {
            this.field_s = this.field_v;
          }
        }
        int var2 = this.field_s >= this.field_w ? 1 : 0;
        this.field_q.setInput((byte) -14, var2 != 0);
        if (0 < this.field_p) {
          this.field_p = this.field_p - 1;
        }
        if (this.field_p < 0) {
          this.field_p = this.field_p + 1;
        }
        if (param0 != 5418) {
          this.field_v = 52;
        }
    }

    EffectSwitchBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_s = 0;
        try {
          this.field_q = new SwitchState(15);
          this.field_v = 100;
          this.field_w = 50;
          this.field_u = new FlagSet(6);
          this.field_t = new FlagSet(6);
          this.field_n = 1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int onBeamEffect(int param0, Effect param1, BeamSegment param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -85) {
            stackIn_4_0 = this.reactToEffect((byte) 14, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 59;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("eia.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_r = new long[32];
        field_o = "Unable to add name - system busy";
    }
}
