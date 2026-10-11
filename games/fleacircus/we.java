/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static int field_c;
    private lh field_a;
    private vc field_b;

    final static void a(int param0, int param1) {
        hd.field_c = param0 * 100 / 150;
        hd.field_g = param0 * 400 / 150;
        int var2 = 115 % ((-69 - param1) / 53);
        hd.field_b = (param0 << 16) / 150;
    }

    final lh b(int param0) {
        lh var2 = this.field_b.field_e.field_h;
        int var3 = -111 / ((-1 - param0) / 58);
        if (this.field_b.field_e == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_h;
        return var2;
    }

    final lh a(byte param0, lh param1) {
        lh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -117 % ((param0 - 66) / 60);
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_b.field_e.field_h;
          }
          if (this.field_b.field_e != var3) {
            this.field_a = var3.field_h;
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          this.field_a = null;
          stackIn_5_0 = null;
          return (lh) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("we.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final lh a(byte param0) {
        lh var2 = this.field_b.field_e.field_a;
        if (this.field_b.field_e == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_a;
        if (param0 == 106) {
          return var2;
        }
        this.a(true);
        return var2;
    }

    final static void a(int param0) {
        uh var1 = (uh) (fk.field_z.a((byte) -60));
        if (var1 == null) {
          var1 = new uh();
        }
        var1.a(3, gb.field_a, gb.field_l, gb.field_k, gb.field_h, gb.field_i, gb.field_b, gb.field_d);
        fg.field_t.a(false, var1);
        if (param0 < -56) {
          return;
        }
        field_c = 106;
    }

    final lh c(int param0) {
        lh var2 = this.field_a;
        if (this.field_b.field_e == var2) {
          this.field_a = null;
          return null;
        }
        if (param0 == -6144) {
          this.field_a = var2.field_h;
          return var2;
        }
        this.field_a = (lh) null;
        this.field_a = var2.field_h;
        return var2;
    }

    final lh b(byte param0, lh param1) {
        lh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        lh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_b.field_e.field_a;
          }
          if (param0 >= -107) {
            this.field_a = (lh) null;
          }
          if (this.field_b.field_e == var3) {
            this.field_a = null;
            stackIn_8_0 = null;
            return (lh) (stackIn_8_0);
          }
          this.field_a = var3.field_a;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("we.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final lh a(boolean param0) {
        lh var2 = null;
        lh var2Lifetime1;
        if (!param0) {
          this.field_b = (vc) null;
          var2 = this.field_a;
          if (var2 == this.field_b.field_e) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_a;
        if (var2Lifetime1 == this.field_b.field_e) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final static int a(byte param0, int param1) {
        int var2 = 71 / ((param0 - 0) / 55);
        param1 = param1 & 8191;
        if (4096 > param1) {
          return param1 < 2048 ? dk.field_D[-param1 + 2048] : -dk.field_D[param1 - 2048];
        }
        return param1 < 6144 ? -dk.field_D[-param1 + 6144] : dk.field_D[param1 - 6144];
    }

    we(vc param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
    }
}
