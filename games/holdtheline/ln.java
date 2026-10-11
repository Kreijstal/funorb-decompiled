/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ln extends hl {
    static jn field_k;
    long field_i;
    ln field_n;
    static String field_j;
    static String field_m;
    ln field_l;

    final static float a(int param0, float param1) {
        if (param0 != -29407) {
          return -0.6477053165435791f;
        }
        if (param1 > 0.0f) {
          return 1.0f;
        }
        if (param1 < 0.0f) {
          return -1.0f;
        }
        return 0.0f;
    }

    final static e a(int param0, byte param1) {
        int var3 = 0;
        e[] var2;
        int var4;
        e[] var5;
        var4 = HoldTheLine.field_D;
        if (param1 >= -50) {
          field_k = (jn) null;
        }
        var5 = wg.a(4);
        var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
          if (param0 == var5[var3].field_f) {
            return var5[var3];
          }
        }
        return null;
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 0) {
          return;
        }
        field_j = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            ln.a(11, 0.5669122934341431f);
          }
          stackIn_3_0 = tl.field_w.a(param0, false, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ln.DB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (this.field_l == null) {
          return;
        }
        if (param0 != -42) {
          field_j = (String) null;
        }
        this.field_l.field_n = this.field_n;
        this.field_n.field_l = this.field_l;
        this.field_n = null;
        this.field_l = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = HoldTheLine.field_D;
        try {
          if (param0 < 92) {
            ln.a(11, -0.14343492686748505f);
          }
          if (ii.a((byte) -118)) {
            r.field_a.a(ab.field_lb, di.field_r, true, false);
            r.field_a.g((byte) -59);
            while (qh.c(-44)) {
              r.field_a.a(aa.field_n, pk.field_M, (byte) 117);
            }
            return;
          }
          if (null != cc.field_w &&
            cc.field_w.field_a) {
            ij.c(4);
            r.field_a.a(new rf(r.field_a, sk.field_a), false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "ln.EB(" + param0 + ')');
        }
    }

    protected ln() {
    }

    static {
        field_j = "Achieved";
        field_m = "DNF";
    }
}
