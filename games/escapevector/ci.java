/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    boolean field_h;
    ed field_e;
    static int field_g;
    boolean field_f;
    int field_b;
    private int field_c;
    static om field_d;
    static hh field_a;

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 4) {
          ci.a(-111, 38, 24, -46);
        }
    }

    final static oc a(byte param0, hh param1, int param2, ed param3, boolean param4, int param5) {
        oc var6 = null;
        RuntimeException var6_ref = null;
        oc stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        oc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new oc(param3, param5, param2, param1);
          if (param0 != -43) {
            ci.b(68);
          }
          stackIn_4_0 = var6;
          stackIn_5_1 = (param4);
          stackIn_4_0.field_q = stackIn_5_1;
          stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("ci.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!ce.field_f.b(param0 + 117)) {
          if (null == de.field_i) {
            if (param0 != 0) {
              field_d = (om) null;
              return;
            }
            return;
          }
          kh.a(lh.b((byte) 116), param0 - 1230, true);
          if (param0 != 0) {
            field_d = (om) null;
            return;
          }
          return;
        }
        nf.a(-106, true);
        if (param0 == 0) {
          return;
        }
        field_d = (om) null;
    }

    final static ll a(int param0, int param1, int param2, int param3) {
        ll var4 = new ll();
        var4.field_i = param1;
        var4.field_g = param0;
        jl.field_n.a(-12328, var4);
        if (param2 == -1) {
          ma.a(-100, param3, var4);
          return var4;
        }
        field_g = 109;
        ma.a(-100, param3, var4);
        return var4;
    }

    final boolean a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 > -56) {
          return false;
        }
        if (bj.e((byte) -52)) {
          var3 = 1 << param0;
          var4 = 0 != (this.field_c & var3) ? 1 : 0;
          return var4 != 0;
        }
        if (this.field_h) {
          return false;
        }
        var3Lifetime1 = 1 << param0;
        var4Lifetime1 = 0 != (this.field_c & var3Lifetime1) ? 1 : 0;
        return var4Lifetime1 != 0;
    }

    ci(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        this.field_e = jb.field_w;
        this.field_h = param1 ? true : false;
        this.field_b = param0;
        this.field_f = param2 ? true : false;
        this.field_c = param3;
    }

    static {
        field_g = -1;
        field_d = new om(6, 0, 4, 2);
    }
}
