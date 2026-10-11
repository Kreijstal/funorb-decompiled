/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ib field_e;
    private long field_f;
    private bf[] field_c;
    static int[] field_a;
    private bf field_d;
    private int field_b;

    final void a(bf param0, long param1, int param2) {
        if (param0.field_e != null) {
          param0.a(7847);
        }
        bf var5 = this.field_c[(int)(param1 & (long)(-1 + this.field_b))];
        param0.field_g = var5;
        if (param2 >= -55) {
          return;
        }
        try {
          param0.field_e = var5.field_e;
          param0.field_e.field_g = param0;
          param0.field_f = param1;
          param0.field_g.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "vd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final bf b(int param0) {
        bf var3 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_d == null) {
          return null;
        }
        bf var2 = this.field_c[(int)(this.field_f & (long)(this.field_b - 1))];
        while (var2 != this.field_d) {
          if (~this.field_f == ~this.field_d.field_f) {
            var3 = this.field_d;
            this.field_d = this.field_d.field_g;
            return var3;
          }
          this.field_d = this.field_d.field_g;
        }
        this.field_d = null;
        if (param0 < -28) {
          return null;
        }
        vd.a(true);
        return null;
    }

    final static String a(CharSequence[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -115) {
            field_e = (ib) null;
          }
          stackIn_3_0 = k.a(0, param0.length, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vd.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final bf a(long param0, boolean param1) {
        bf var4;
        bf var5;
        int var6;
        bf var4Lifetime1;
        bf var5Lifetime1;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!param1) {
          this.field_f = param0;
          var4 = this.field_c[(int)((long)(-1 + this.field_b) & param0)];
          this.field_d = var4.field_g;
          while (true) {
            if (var4 == this.field_d) {
              this.field_d = null;
              return null;
            }
            if (~param0 != ~this.field_d.field_f) {
              this.field_d = this.field_d.field_g;
              continue;
            }
            break;
          }
          var5 = this.field_d;
          this.field_d = this.field_d.field_g;
          return var5;
        }
        this.field_d = (bf) null;
        this.field_f = param0;
        var4Lifetime1 = this.field_c[(int)((long)(-1 + this.field_b) & param0)];
        this.field_d = var4Lifetime1.field_g;
        while (true) {
          if (var4Lifetime1 == this.field_d) {
            this.field_d = null;
            return null;
          }
          if (~param0 != ~this.field_d.field_f) {
            this.field_d = this.field_d.field_g;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_d;
        this.field_d = this.field_d.field_g;
        return var5Lifetime1;
    }

    final static mj a(boolean param0) {
        if (param0) {
          field_e = (ib) null;
          return k.field_f;
        }
        return k.field_f;
    }

    final static vk a(boolean param0, String param1, ad param2, ad param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vk stackIn_2_0 = null;
        vk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.c(param1, (byte) -105);
          if (!param0) {
            stackIn_2_0 = (vk) null;
            return stackIn_2_0;
          }
          var6 = param3.a(param4, var5_int, -28459);
          stackIn_4_0 = n.a(param3, param2, (byte) 125, var5_int, var6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vd.G(").append(param0).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    vd(int param0) {
        int var2 = 0;
        bf dupTemp$0 = null;
        bf var3 = null;
        this.field_c = new bf[param0];
        this.field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new bf();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.field_e = var3;
          var3.field_g = var3;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 <= 106) {
          vd.a(-53);
        }
    }

    static {
        field_a = new int[8192];
        field_e = new ib();
    }
}
