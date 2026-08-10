/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends wi {
    static ak field_w;
    private bi field_r;
    int field_z;
    private String field_q;
    int field_y;
    private bi field_v;
    boolean field_t;
    static int field_s;
    static int[] field_u;
    fa field_x;

    final static int e(int param0) {
        if (param0 != 24089) {
            return 10;
        }
        return ng.field_c;
    }

    public static void d(int param0) {
        field_w = null;
        field_u = null;
        if (param0 <= 107) {
            field_u = (int[]) null;
        }
    }

    final void c(int param0) {
        if (param0 <= 8) {
            String var3 = (String) null;
            rk.a((String) null, 32);
        }
        if (!(this.field_k)) {
            this.field_c = false;
            return;
        }
        if (!this.a((byte) 122)) {
            return;
        }
        if (!this.field_c && (kc.field_f ^ -1) == -2) {
            this.field_t = !this.field_t ? true : false;
        }
        this.field_c = (kc.field_f ^ -1) == -2 ? true : false;
    }

    final void b(byte param0) {
        gb.a(ia.field_q);
        gb.a(this.field_l, this.field_a, this.field_n + this.field_l, this.field_a - -this.field_d);
        bi var2 = this.field_t ? this.field_r : this.field_v;
        var2.a(this.field_l, this.field_a);
        if (param0 >= -17) {
            String var3 = (String) null;
            rk.a((String) null, -66);
        }
        if (null != this.field_x) {
            this.field_x.c(this.field_q, this.field_l + var2.field_c - -5, this.field_x.field_N / 2 + (this.field_a + var2.field_a / 2), this.field_y, this.field_z);
        }
        gb.b(ia.field_q);
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                L2: {
                  if (param1 == 5) {
                    break L2;
                  } else {
                    field_w = (ak) null;
                    break L2;
                  }
                }
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[-var4 + (-1 + var2_int)] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("rk.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    rk(int param0, int param1, bi param2, bi param3, String param4, fa param5) {
        this.field_t = false;
        try {
            this.field_q = param4;
            this.field_x = param5;
            this.field_r = param3;
            this.field_l = param0;
            this.field_v = param2;
            this.field_a = param1;
            this.field_n = this.field_r.field_c + 5 - -this.field_x.b(this.field_q);
            this.field_d = this.field_r.field_a;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "rk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new ak();
        field_u = new int[5];
    }
}
