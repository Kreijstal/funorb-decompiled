/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends hf {
    private oi field_eb;
    static String field_db;
    private int field_hb;
    static int field_ib;
    private boolean field_gb;
    static String[] field_cb;
    private double field_bb;
    private double field_ab;
    private double field_fb;

    public static void n(int param0) {
        field_db = null;
        if (param0 < 111) {
          cf.n(-57);
          field_cb = null;
          return;
        }
        field_cb = null;
    }

    final void a(mn param0, byte param1) {
        try {
          this.field_eb.field_o = this.field_t;
          this.field_eb.field_p = this.field_D;
          this.field_eb.field_u = 0.5;
          this.field_eb.field_t = this.field_E;
          param0.a((rk) (this.field_eb), (byte) 93);
          int var3_int = -39 % ((-2 - param1) / 62);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cf.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_bb = this.field_E;
        this.field_hb = this.field_hb + 1;
        this.field_fb = this.field_D;
        if (param0 != 11878) {
          mn var4 = (mn) null;
          this.a((mn) null, (byte) -102);
          this.field_ab = this.field_t;
          super.a(param0 + 0, param1);
          if (this.field_D >= this.field_A.field_x.field_r[this.field_A.field_x.field_a - 1]) {
            this.field_z = true;
            this.field_s = 2;
            return;
          }
          return;
        }
        this.field_ab = this.field_t;
        super.a(param0 + 0, param1);
        if (!(this.field_D >= this.field_A.field_x.field_r[this.field_A.field_x.field_a - 1])) {
          return;
        }
        this.field_z = true;
        this.field_s = 2;
    }

    cf(hn param0, ee param1, double[] param2, double[] param3, double param4, double param5, boolean param6, boolean param7, boolean param8) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, 0.9, 0.003, param1, 0.75, 0.01);
        double dupTemp$0 = 0.0;
        double dupTemp$1 = 0.0;
        double dupTemp$2 = 0.0;
        double var12_double = 0.0;
        if (!param7) {
        }
        this.field_hb = 0;
        this.field_eb = new oi((pm) (this));
        try {
          this.field_gb = param8 ? true : false;
          dupTemp$0 = this.field_E + (param3[1] * param2[6] + param2[3] * param3[0] + param3[2] * param2[9]);
          this.field_E = dupTemp$0;
          this.field_bb = dupTemp$0;
          param5 = param5 * 0.8;
          if (this.field_gb) {
            this.field_M = 0.01;
            this.field_V = this.field_V * 3.0;
          }
          dupTemp$1 = this.field_t + (param2[7] * param3[1] + param2[4] * param3[0] + param3[2] * param2[10]);
          this.field_t = dupTemp$1;
          this.field_ab = dupTemp$1;
          param4 = param4 * 0.8;
          dupTemp$2 = this.field_D + (param3[2] * param2[11] + (param2[5] * param3[0] + param2[8] * param3[1]));
          this.field_D = dupTemp$2;
          this.field_fb = dupTemp$2;
          this.field_L = param2[5] * param4 + param1.field_L + param5 * param2[8] + param2[11] * 0.8;
          this.field_G = param2[10] * 0.8 + (param4 * param2[4] + param1.field_G + param2[7] * param5);
          this.field_K = param2[9] * 0.8 + (param1.field_K + param4 * param2[3] + param2[6] * param5);
          if (param6) {
            var12_double = Math.sqrt(this.field_L * this.field_L + (this.field_G * this.field_G + this.field_K * this.field_K));
            if (0.001 > var12_double) {
              var12_double = 0.001;
            }
            this.field_W = param1.a(this.field_K / var12_double, this.field_G / var12_double, this.field_L / var12_double, false);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void g(int param0) {
        this.field_C = !this.field_gb ? 0.1 : 0.2;
        if (param0 == 26402) {
          this.a((byte) -95, !this.field_gb ? og.field_f : vb.field_f, 3.0);
          return;
        }
    }

    final void b(ee param0, int param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_double = param0.field_E - this.field_bb;
          var5 = -this.field_ab + param0.field_t;
          if (param1 >= -122) {
            return;
          }
          var7 = param0.field_D - this.field_fb;
          var9 = this.field_E - this.field_bb;
          var11 = -this.field_ab + this.field_t;
          var13 = -this.field_fb + this.field_D;
          var15 = var7 * var13 + (var11 * var5 + var9 * var3_double);
          if (0.0 < var15) {
            var15 = var15 / (var9 * var9 + var11 * var11 + var13 * var13);
            if (!(1.0 <= var15)) {
              var7 = var7 - var15 * var13;
              var3_double = var3_double - var15 * var9;
              var5 = var5 - var15 * var11;
            } else {
              var5 = var5 - var11;
              var3_double = var3_double - var9;
              var7 = var7 - var13;
            }
          }
          var17 = param0.field_C + 0.1;
          if (!(var17 * var17 > var7 * var7 + (var5 * var5 + var3_double * var3_double))) {
            return;
          }
          super.b(param0, -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var14Lifetime1;
        double var16Lifetime1;
        double var18Lifetime1;
        if (param0 != 256) {
          cf.n(-92);
          var14 = param3 - this.field_E;
          var16 = param1 - this.field_t;
          var18 = param5 - this.field_D;
          if (0.010000000000000002 > var14 * var14 + var16 * var16 + var18 * var18) {
            this.d(10797);
            return;
          }
          return;
        }
        var14Lifetime1 = param3 - this.field_E;
        var16Lifetime1 = param1 - this.field_t;
        var18Lifetime1 = param5 - this.field_D;
        if (!(0.010000000000000002 > var14Lifetime1 * var14Lifetime1 + var16Lifetime1 * var16Lifetime1 + var18Lifetime1 * var18Lifetime1)) {
          return;
        }
        this.d(10797);
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int var7_int = 0;
        double var8 = 0.0;
        double stackIn_10_1 = 0.0;
        nf stackIn_13_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param2 >= -5) {
            this.field_ab = -0.4533094940135883;
          }
          var7_int = 256;
          if (this.field_Q > 0) {
            if (this.field_Q > 1) {
              return;
            }
            var7_int = 128;
          }
          var8 = this.field_C;
          if (!this.field_gb) {
            stackIn_10_1 = 0.1;
          } else {
            stackIn_10_1 = 0.2;
          }
          this.field_C = stackIn_10_1;
          if (this.field_gb) {
            stackIn_13_1 = rm.field_K;
          } else {
            stackIn_13_1 = aa.field_b[(14 & this.field_hb) >> 2];
          }
          this.a(stackIn_13_1, var7_int, param3, (byte) 91, param1);
          this.field_C = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("cf.QA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_db = "F";
        field_cb = new String[16];
    }
}
