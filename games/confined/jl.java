/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jl extends rk {
    static int[] field_p;
    static String field_n;
    jl field_o;
    static String field_m;
    long field_r;
    jl field_q;

    final void b(boolean param0) {
        if (null == this.field_q) {
          return;
        }
        this.field_q.field_o = this.field_o;
        this.field_o.field_q = this.field_q;
        this.field_o = null;
        this.field_q = null;
        if (!param0) {
          field_p = (int[]) null;
        }
    }

    final static nf[] a(int param0, int param1, int param2, mi param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -5744) {
            field_p = (int[]) null;
          }
          if (mc.a(param2, param1, param3, (byte) 119)) {
            return si.a((byte) -9);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jl.VC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        ki.field_b = new ke();
        int var1 = 18 % ((param0 + 84) / 36);
        dn.field_b.a((fj) (ki.field_b), (byte) -72);
    }

    final static bm a(int[] param0, bm param1, int param2) {
        bm var3 = null;
        RuntimeException var3_ref = null;
        bm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new bm(param2, 0, 0);
          var3.field_e = param1.field_e;
          var3.field_m = param0;
          var3.field_a = param1.field_a;
          var3.field_i = param1.field_i;
          var3.field_h = param1.field_h;
          var3.field_c = param1.field_c;
          var3.field_n = param1.field_n;
          var3.field_g = param1.field_g;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("jl.TC(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 == 9898) {
          field_p = null;
          field_m = null;
          field_n = null;
          return;
        }
        jl.a((byte) -120);
        field_p = null;
        field_m = null;
        field_n = null;
    }

    protected jl() {
    }

    static {
        field_n = "Loading animations";
        field_m = "Type your password again to make sure it's correct";
    }
}
