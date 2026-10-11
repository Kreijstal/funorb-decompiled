/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    int field_l;
    int field_k;
    static String field_c;
    static tk field_b;
    static vh field_f;
    static String field_m;
    static String[] field_a;
    private int field_g;
    static int field_e;
    boolean field_h;
    boolean field_j;
    int field_d;
    static dd field_i;

    final boolean a(byte param0, int param1, al param2) {
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != -8) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_h && (!param2.field_l[this.field_g].field_s ||
            param1 == this.field_g)) {
            stackIn_9_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_9_0 = true;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("df.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static String a(byte param0) {
        if (sf.field_y < 2) {
          return kg.field_q;
        }
        if (null != wh.field_a) {
          if (!wh.field_a.d(84)) {
            return ir.field_b;
          }
          return ud.field_F;
        }
        if (!uj.field_d.d(101)) {
          return rp.field_c;
        }
        if (!uj.field_d.a("commonui", 0)) {
          return oj.field_t + " - " + uj.field_d.a(100, "commonui") + "%";
        }
        if (!vf.field_nb.d(-127)) {
          return gh.field_Q;
        }
        if (param0 != 84) {
          return (String) null;
        }
        if (!vf.field_nb.a("commonui", 0)) {
          return kb.field_a + " - " + vf.field_nb.a(100, "commonui") + "%";
        }
        if (!rg.field_r.d(66)) {
          return de.field_e;
        }
        if (!rg.field_r.c(-63)) {
          return cf.field_c + " - " + rg.field_r.b(0) + "%";
        }
        return cl.field_j;
    }

    final void a(int param0, pq param1, al param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        long var6 = 0L;
        int[] var8_ref_int__ = null;
        long var8 = 0L;
        int[] var10 = null;
        pq var11 = null;
        try {
          if (this.field_h) {
            var11 = param2.field_l[this.field_g];
            var4_long = (long)param1.field_g - (long)var11.field_g;
            var6 = -(long)var11.field_k + (long)param1.field_k;
            var4_long = var4_long >> 8;
            var6 = var6 >> 8;
          } else {
            var10 = param2.field_e[this.field_g];
            var8_ref_int__ = var10;
            var4_long = -(long)var10[0] + (long)param1.field_g;
            var4_long = var4_long >> 8;
            var6 = (long)param1.field_k - (long)var10[1];
            var6 = var6 >> 8;
          }
          var8 = bm.a(-119, var4_long * var4_long + var6 * var6);
          if (-2147483648L <= var8 &&
            var8 <= 2147483647L) {
            if (param0 != 1763073386) {
              field_e = 62;
            }
            this.field_l = (int)var8;
            return;
          }
          throw new IllegalStateException("dist too big when checking for visibility.");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("df.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 >= 82) {
          field_a = null;
          field_c = null;
          field_i = null;
          field_f = null;
          field_m = null;
          return;
        }
        df.a((byte) -85);
        field_a = null;
        field_c = null;
        field_i = null;
        field_f = null;
        field_m = null;
    }

    final void a(int param0, boolean param1, boolean param2) {
        this.field_h = param1 ? true : false;
        if (param2) {
          this.field_g = param0;
          return;
        }
        this.field_g = -112;
        this.field_g = param0;
    }

    final int a(al param0, pq param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        pq var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -6661) {
            field_i = (dd) null;
          }
          if (this.field_h) {
            var6 = param0.field_l[this.field_g];
            stackIn_4_0 = 8191 & tj.c(var6.field_g - param1.field_g >> 10, var6.field_k - param1.field_k >> 10, 4096);
            return stackIn_4_0;
          }
          var5 = param0.field_e[this.field_g];
          var4 = var5;
          stackIn_6_0 = 8191 & tj.c(var5[0] - param1.field_g >> 10, -param1.field_k + var5[1] >> 10, 4096);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("df.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != 1048576) {
          return -61;
        }
        return dn.a(lh.a(this.field_l, (byte) -112, this.field_h ? 1048576L : 524288L), false);
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = "Passwords must be between 5 and 20 letters and numbers";
        field_m = "Cancel rematch";
    }
}
