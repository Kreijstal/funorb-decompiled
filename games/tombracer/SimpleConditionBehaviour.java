/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SimpleConditionBehaviour extends Behaviour {
    private boolean field_s;
    static String field_q;
    static int[] field_o;
    private int field_t;
    private SwitchState field_n;
    static UiComponent[] field_p;
    static long field_r;

    final static MidiPatch loadInstrumentPatch(ResourceArchive param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        MidiPatch stackIn_2_0 = null;
        MidiPatch stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 15) {
            stackIn_2_0 = (MidiPatch) null;
            return stackIn_2_0;
          }
          var4 = param0.getFileById(param1, 105);
          var3 = var4;
          if (var4 == null) {
            return null;
          }
          stackIn_7_0 = new MidiPatch(var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rb.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void tick(int param0) {
        this.evaluateCondition((byte) 79);
        this.field_n.setInput((byte) -14, this.field_s);
        if (param0 != 5418) {
          this.stop(false);
        }
    }

    SimpleConditionBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_t = param1.readBits((byte) 44, 4);
          this.field_n = new SwitchState(15, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= -116) {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
        SimpleConditionBehaviour.releaseStatics((byte) 32);
        field_q = null;
        field_o = null;
        field_p = null;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        if (param0) {
          return;
        }
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -127, this.field_t, 4);
          this.field_n.encode(this.getScope((byte) 119), (byte) 88, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "rb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void evaluateCondition(byte param0) {
        boolean stackIn_8_1 = false;
        int var2;
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_t;
        if (var3 == 0) {
          this.field_s = this.isStopped((byte) 87);
          if (param0 == 79) {
            return;
          }
          this.resolveSwitchLinks(91);
          return;
        }
        if (var3 == 1) {
          this.field_s = this.trap.hasMovedThisTick(50, false);
          if (param0 == 79) {
            return;
          }
          this.resolveSwitchLinks(91);
          return;
        }
        if (var3 != 2) {
          if (var3 == 3) {
            this.field_s = this.getSimulation(12340).isEffectActive(8, 10915);
          }
          if (param0 == 79) {
            return;
          }
          this.resolveSwitchLinks(91);
          return;
        }
        var2 = this.getRoom(true).sumSurfaceCoverage(this.trap.getY(9648), this.trap.getWidth(-96), param0 ^ 79, 2, this.trap.getHeight((byte) 55), this.trap.getX(param0 - 76), this.getRoot(6));
        stackIn_8_1 = !(var2 < (this.trap.getWidth(param0 ^ -51) >> 16) * (this.trap.getHeight((byte) 55) >> 16));
        this.field_s = stackIn_8_1;
        if (param0 == 79) {
          return;
        }
        this.resolveSwitchLinks(91);
        return;
    }

    final void stop(boolean param0) {
        super.stop(param0);
        if (this.field_t == 0) {
          this.field_n.setInput((byte) -14, true);
        }
    }

    final int hashState(int param0, int param1) {
        if (param1 <= -48) {
          param0 = RatingTable.mixHashBoolean(this.field_s, param0, (byte) -53);
          return param0;
        }
        BitPacketBuffer var4 = (BitPacketBuffer) null;
        this.encode(false, (BitPacketBuffer) null);
        param0 = RatingTable.mixHashBoolean(this.field_s, param0, (byte) -53);
        return param0;
    }

    final void resolveSwitchLinks(int param0) {
        super.resolveSwitchLinks(param0);
        this.field_n.resolveLinks((byte) 48, this.getScope((byte) 116));
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.field_n = (SwitchState) null;
          return 13;
        }
        return 13;
    }

    static {
        field_q = "Played";
        field_o = SwitchComponent.e(true);
    }
}
