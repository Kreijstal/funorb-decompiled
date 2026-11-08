/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeCursor {
    private IntrusiveDeque field_e;
    static int field_d;
    static String field_c;
    static Sprite[] field_a;
    private IntrusiveNode field_f;
    static CommonGame field_b;

    public static void releaseStatics(byte param0) {
        int var1 = 119 / ((34 - param0) / 56);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final IntrusiveNode a(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.field_c.field_b;
          } else {
            var3 = param1;
          }
          if (param0 <= 82) {
            this.field_f = (IntrusiveNode) null;
          }
          if (this.field_e.field_c == var3) {
            this.field_f = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_f = var3.field_b;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("nw.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.field_c.field_d;
          } else {
            var3 = param1;
          }
          if (this.field_e.field_c == var3) {
            this.field_f = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          if (param0 != 395869153) {
            stackIn_9_0 = (IntrusiveNode) null;
            return stackIn_9_0;
          }
          this.field_f = var3.field_d;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("nw.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final IntrusiveNode a(byte param0) {
        int var2 = -27 % ((param0 - 9) / 40);
        IntrusiveNode var3 = this.field_e.field_c.field_d;
        if (var3 == this.field_e.field_c) {
          this.field_f = null;
          return null;
        }
        this.field_f = var3.field_d;
        return var3;
    }

    final static void a(int param0, Sprite param1) {
        try {
          bw.field_e = new Sprite[4];
          bw.field_e[1] = param1;
          bw.field_e[0] = param1.copy();
          bw.field_e[0].flipVertically();
          bw.field_e[2] = param1.copy();
          int var2_int = 50 % ((-82 - param0) / 42);
          bw.field_e[2].rotateClockwise();
          bw.field_e[3] = bw.field_e[2].copyFlippedHorizontally();
          du.field_e = param1.field_q;
          re.field_k = param1.field_w;
          AvailabilityCheckRequest.field_h = du.field_e >> 1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nw.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 0) {
          Sprite var3 = (Sprite) null;
          IntrusiveDequeCursor.a(-36, (Sprite) null);
          var2 = this.field_f;
          if (this.field_e.field_c != var2) {
            this.field_f = var2.field_d;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        var2Lifetime1 = this.field_f;
        if (this.field_e.field_c != var2Lifetime1) {
          this.field_f = var2Lifetime1.field_d;
          return var2Lifetime1;
        }
        this.field_f = null;
        return null;
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = this.field_e.field_c.field_b;
        if (param0 != 0) {
          field_d = -67;
          if (var2 != this.field_e.field_c) {
            this.field_f = var2.field_b;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        if (var2 != this.field_e.field_c) {
          this.field_f = var2.field_b;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final IntrusiveNode b(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 46) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.a((byte) -96, (IntrusiveNode) null);
          var2 = this.field_f;
          if (var2 != this.field_e.field_c) {
            this.field_f = var2.field_b;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        var2Lifetime1 = this.field_f;
        if (var2Lifetime1 != this.field_e.field_c) {
          this.field_f = var2Lifetime1.field_b;
          return var2Lifetime1;
        }
        this.field_f = null;
        return null;
    }

    IntrusiveDequeCursor(IntrusiveDeque param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "increase buyout price by <%0>";
        field_d = 64;
    }
}
