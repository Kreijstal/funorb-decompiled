/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends kf {
    static int field_z;
    static gi field_y;
    static hl[] field_B;
    static int field_C;
    static volatile int field_D;
    int field_w;
    static pf field_x;
    static hl[] field_A;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param0 != 0) {
          return;
        }
        if (null == this.field_t) {
          return;
        }
        if (this.field_w == 0) {
          return;
        }
        if (this.field_w == 256) {
          this.field_t.a(param0, param1 + this.field_s, (byte) 49, param3 + this.field_j);
          return;
        }
        hl var6 = new hl(this.field_t.field_i, this.field_t.field_f);
        bc.a(var6, 26095);
        this.field_t.a(param0, 0, param2, 0);
        wf.a(-110);
        var6.e(this.field_s + param1, this.field_j + param3, this.field_w);
    }

    public static void h(int param0) {
        field_y = null;
        field_x = null;
        if (param0 == 24288) {
          field_A = null;
          field_B = null;
          return;
        }
        String[] var2 = (String[]) null;
        ie.a(-11, (String) null, (String[]) null, -43);
        field_A = null;
        field_B = null;
    }

    ie(uj param0) {
        super(param0.field_s, param0.field_j, param0.field_i, param0.field_f, (de) null, (qg) null);
        try {
          param0.a(0, this.field_i, (byte) 117, this.field_f, 0);
          this.field_w = 256;
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        String[] var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          field_x = s.field_f;
          if (param0 > -99) {
            ie.g(-121);
          }
          if (param3 == 255) {
            stackIn_6_0 = !(qb.field_a >= 13);
            mf.field_a = cf.a(stackIn_6_0, false);
            var5 = (String[]) null;
            dl.a((byte) -12, (String[]) null);
            return;
          }
          if (param3 >= 100 &&
            param3 <= 105) {
            var4 = param2;
            dl.a((byte) -12, var4);
            mf.field_a = hc.a(param2, 0);
            return;
          }
          mf.field_a = fb.a(param1, param3, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("ie.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void g(int param0) {
        if (param0 != -1) {
          field_y = (gi) null;
        }
    }

    public ie() {
        super(0, 0, 0, 0, (de) null, (qg) null);
        this.field_w = 256;
    }

    static {
        field_D = 0;
        field_C = 0;
    }
}
