/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrianglePulse {
    static String field_a;
    private TickCounter counter;
    private int minimum;
    int maximum;
    static RgbSprite field_d;
    static String field_j;
    static nc field_i;
    static int field_c;
    static int[] statusProtectionMasks;
    private int value;
    static RgbSprite field_f;

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        field_j = null;
        field_f = null;
        statusProtectionMasks = null;
        if (param0 != 16) {
          return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        vs.a(256, wn.field_jb);
        if (param0 < 113) {
          field_d = (RgbSprite) null;
        }
    }

    final void advance(byte obfuscationGuard) {
        if (obfuscationGuard != -66) {
          return;
        }
        if (this.counter == null) {
          this.value = 127;
          return;
        }
        if (this.counter.advanceAndCheck(obfuscationGuard ^ 65)) {
          this.counter.reset(17);
        }
        int halfPhase = this.counter.elapsedTicks;
        int halfPeriod = this.counter.limit;
        halfPeriod = halfPeriod >> 1;
        int risingHalf = halfPhase <= halfPeriod ? 1 : 0;
        halfPhase = risingHalf != 0 ? halfPhase : -halfPeriod + halfPhase;
        int phaseStart = risingHalf == 0 ? this.maximum : this.minimum;
        int phaseEnd = risingHalf == 0 ? this.minimum : this.maximum;
        this.value = phaseStart + halfPhase * (-phaseStart + phaseEnd) / halfPeriod;
        if (this.value < this.minimum) {
          this.value = this.minimum;
        }
        if (this.maximum < this.value) {
          this.value = this.maximum;
        }
    }

    final static void a(int param0, int param1, um param2, boolean param3) {
        if (param0 != -16147) {
          return;
        }
        try {
          lk.field_e.a(256, !param3 ? true : false, param2, -1, param1, 1000000);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hh.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void configure(int minimum, byte obfuscationGuard, int maximum, int period) {
        if (period < 0) {
          period = 100;
        }
        if (minimum < 0 ||
          minimum > 255) {
          minimum = 32;
        }
        this.counter = new TickCounter(period);
        if (obfuscationGuard < 117) {
          return;
        }
        this.minimum = minimum;
        if (maximum < 0 ||
          maximum > 255 ||
          maximum < minimum) {
          maximum = 224;
        }
        this.maximum = maximum;
        this.value = this.maximum + this.minimum >> 1;
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (0 == param2) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param2 == 1) {
            var10 = param0[param3];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param3 + param2;
          var5 = param1;
          for (var6_int = param3; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param3; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 == null) {
              discarded$3 = var6.append("null");
            } else {
              discarded$4 = var6.append(var8);
            }
          }
          stackIn_23_0 = var6.toString();
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("hh.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(au param0, boolean param1, PacketBuffer param2, int param3) {
        int var8 = 0;
        au stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        au stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        au stackIn_11_0 = null;
        int stackIn_12_1 = 0;
        au stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        au stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        au stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1) {
            param0.field_Ub = param2.readUnsignedByte(0);
          }
          param0.field_nc = param2.readUnsignedByte(0);
          param0.field_Tb = param2.readUnsignedByte(0);
          var4_int = param2.readUnsignedByte(0);
          stackIn_5_0 = (au) (param0);
          stackIn_6_1 = (0 != (128 & var4_int));
          stackIn_5_0.field_uc = stackIn_6_1;
          stackIn_8_0 = (au) (param0);
          stackIn_9_1 = ((var4_int & 64) != 0);
          stackIn_8_0.field_kc = stackIn_9_1;
          stackIn_11_0 = (au) (param0);
          if ((16 & var4_int) != 0) {
            stackIn_12_1 = 2;
          } else {
            stackIn_12_1 = 1;
          }
          stackIn_11_0.field_ac = stackIn_12_1;
          stackIn_15_0 = (au) (param0);
          stackIn_16_1 = (param0.field_uc) && (param0.field_Ub < param0.field_nc);
          stackIn_15_0.field_Sb = stackIn_16_1;
          stackIn_18_0 = (au) (param0);
          stackIn_19_1 = (0 != (8 & var4_int));
          stackIn_18_0.field_tc = stackIn_19_1;
          stackIn_21_0 = (au) (param0);
          stackIn_22_1 = ((32 & var4_int) != 0);
          stackIn_21_0.field_vc = stackIn_22_1;
          stackIn_25_0 = (0 == (var4_int & 4)) ? 0 : 1;
          var5 = stackIn_25_0;
          stackIn_28_0 = ((var4_int & 2) == 0) ? 0 : 1;
          var6 = stackIn_28_0;
          param2.readBytes(0, param0.field_pc.length, 0, param0.field_pc);
          param0.field_qc = param2.readUnsignedShort((byte) -104);
          param0.field_Mb = vi.b(39) - (long)param2.readInt(1);
          if (var5 == 0) {
            param0.field_bc = -1;
          } else {
            param0.field_bc = param2.readInt(1);
          }
          param0.field_dc = param2.j((byte) -2);
          var7 = param2.position;
          if (param3 < 73) {
            return;
          }
          param0.field_rc = param2.g(1);
          if (var6 != 0) {
            param0.field_jc = new String[param0.field_Ub];
            param2.position = var7;
            for (var8 = 0; var8 < param0.field_Ub; var8++) {
              param0.field_jc[var8] = param2.g(1);
            }
            return;
          }
          param0.field_jc = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("hh.E(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean isRisingHalf(int obfuscationGuard) {
        if (obfuscationGuard > -121) {
          this.getValue(103);
        }
        return this.counter.elapsedTicks <= this.counter.limit >> 1 ? true : false;
    }

    final int getValue(int obfuscationGuard) {
        if (obfuscationGuard != -1953891327) {
          return 4;
        }
        if (this.value >= 0 &&
          this.value <= 255) {
          return this.value;
        }
        return 127;
    }

    TrianglePulse(int minimum, int maximum, int period) {
        this.configure(minimum, (byte) 127, maximum, period);
    }

    static {
        field_a = "You have 1 unread message!";
        field_j = "Confirm Email:";
        statusProtectionMasks = new int[]{0, 1, 2, 4, 8, 31, 16, 0, 0};
        field_c = 0;
    }
}
