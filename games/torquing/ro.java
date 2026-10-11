/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ro extends am {
    int[] field_s;
    static String field_t;
    int field_u;
    static int field_w;
    static long field_v;
    int field_x;
    private int field_y;

    int[][] a(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        var11 = Torquing.field_u;
        var14 = this.field_r.a(15142, param1);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (this.field_r.field_b &&
          this.c(-31292)) {
          var4 = var14[0];
          var5 = var14[1];
          var6 = var14[2];
          if (this.field_u == um.field_o) {
            stackIn_6_0 = param1;
          } else {
            stackIn_6_0 = this.field_u * param1 / um.field_o;
          }
          var7 = stackIn_6_0 * this.field_x;
          if (this.field_x != ci.field_c) {
            for (var8 = 0; var8 < ci.field_c; var8++) {
              var9 = var8 * this.field_x / ci.field_c;
              var10 = this.field_s[var7 + var9];
              var6[var8] = ie.a(255, var10) << 4;
              var5[var8] = ie.a(65280, var10) >> 4;
              var4[var8] = ie.a(16711680, var10) >> 12;
            }
          } else {
            for (var8 = 0; var8 < ci.field_c; var8++) {
              incrementValue$0 = var7;
              var7++;
              var9 = this.field_s[incrementValue$0];
              var6[var8] = ie.a(255, var9) << 4;
              var5[var8] = ie.a(65280, var9) >> 4;
              var4[var8] = ie.a(16711680, var9) >> 12;
            }
          }
        }
        if (param0 == -29116) {
          return var3;
        }
        return (int[][]) null;
    }

    final int e(byte param0) {
        if (param0 <= 26) {
          return -10;
        }
        return this.field_y;
    }

    final static String b(int param0) {
        if (2 > b.field_x) {
          return ip.field_c;
        }
        if (null != je.field_f) {
          if (!je.field_f.a(-12749)) {
            return Torquing.field_w;
          }
          return md.field_b;
        }
        if (!lp.field_a.a(-12749)) {
          return bo.field_i;
        }
        if (!lp.field_a.a(true, "commonui")) {
          return db.field_d + " - " + lp.field_a.a((byte) 102, "commonui") + "%";
        }
        if (param0 > -93) {
          field_t = (String) null;
        }
        if (!eg.field_v.a(-12749)) {
          return ol.field_e;
        }
        if (!eg.field_v.a(true, "commonui")) {
          return l.field_c + " - " + eg.field_v.a((byte) 50, "commonui") + "%";
        }
        if (!kb.field_a.a(-12749)) {
          return ci.field_d;
        }
        if (!kb.field_a.c(-19375)) {
          return la.field_b + " - " + kb.field_a.a((byte) -32) + "%";
        }
        return pm.field_p;
    }

    public static void g(byte param0) {
        field_t = null;
        if (param0 < 112) {
          field_w = 110;
        }
    }

    final boolean c(int param0) {
        if (this.field_s != null) {
          return true;
        }
        if (param0 != -31292) {
          return true;
        }
        if (this.field_y < 0) {
          return false;
        }
        tc var2 = 0 <= po.field_u ? tc.a(vf.field_a, po.field_u, this.field_y) : tc.a(vf.field_a, this.field_y);
        var2.b();
        this.field_s = var2.c();
        this.field_u = var2.field_e;
        this.field_x = var2.field_d;
        return true;
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != 35) {
            this.field_x = -83;
          }
          if (0 == param2) {
            this.field_y = param0.i(7088);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ro.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var2 = -128 % ((-63 - param0) / 62);
        super.d((byte) 91);
        this.field_s = null;
    }

    public ro() {
        super(0, false);
        this.field_y = -1;
    }

    final static boolean a(byte param0, la param1, la param2, la param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a(-12749)) {
            return false;
          }
          if (!param1.a(true, "commonui")) {
            return false;
          }
          if (param3.a(-12749) &&
            param3.a(true, "commonui")) {
            var4_int = -28 / ((param0 + 42) / 52);
            if (param2.a(-12749) &&
              param2.a(true, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ro.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_w = -1;
        field_t = "LOW";
    }
}
