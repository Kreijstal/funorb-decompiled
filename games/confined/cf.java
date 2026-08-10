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
        mn var4;
        this.field_bb = this.field_E;
        this.field_hb = this.field_hb + 1;
        this.field_fb = this.field_D;
        if (param0 == 11878) {
          this.field_ab = this.field_t;
          super.a(param0 + 0, param1);
          if (this.field_D >= this.field_A.field_x.field_r[this.field_A.field_x.field_a + -1]) {
            this.field_z = true;
            this.field_s = 2;
            return;
          } else {
            return;
          }
        } else {
          var4 = (mn) null;
          this.a((mn) null, (byte) -102);
          this.field_ab = this.field_t;
          super.a(param0 + 0, param1);
          if (this.field_D < this.field_A.field_x.field_r[this.field_A.field_x.field_a + -1]) {
            return;
          } else {
            this.field_z = true;
            this.field_s = 2;
            return;
          }
        }
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        double stackIn_3_1 = 0.0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        bi stackIn_7_2 = null;
        L0: {
          stackIn_2_0 = this;

          if (this.field_gb) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0.2;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 0.1;
            break L0;
          }
        }
        ((cf) (this)).field_C = stackIn_3_1;
        if (param0 != 26402) {
          return;
        } else {
          L1: {
            stackIn_6_0 = this;

            stackIn_6_1 = -95;

            if (this.field_gb) {
              stackIn_7_0 = this;
              stackIn_7_1 = stackIn_6_1;
              stackIn_7_2 = vb.field_f;
              break L1;
            } else {
              stackIn_7_0 = this;
              stackIn_7_1 = stackIn_6_1;
              stackIn_7_2 = og.field_f;
              break L1;
            }
          }
          this.a((byte) stackIn_7_1, stackIn_7_2, 3.0);
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_double = param0.field_E - this.field_bb;
            var5 = -this.field_ab + param0.field_t;
            if (param1 < -122) {
              L1: {
                var7 = param0.field_D - this.field_fb;
                var9 = this.field_E - this.field_bb;
                var11 = -this.field_ab + this.field_t;
                var13 = -this.field_fb + this.field_D;
                var15 = var7 * var13 + (var11 * var5 + var9 * var3_double);
                if (0.0 >= var15) {
                  break L1;
                } else {
                  var15 = var15 / (var9 * var9 + var11 * var11 + var13 * var13);
                  if (1.0 > var15) {
                    var7 = var7 - var15 * var13;
                    var3_double = var3_double - var15 * var9;
                    var5 = var5 - var15 * var11;
                    break L1;
                  } else {
                    var5 = var5 - var11;
                    var3_double = var3_double - var9;
                    var7 = var7 - var13;
                    break L1;
                  }
                }
              }
              var17 = param0.field_C + 0.1;
              if (var17 * var17 <= var7 * var7 + (var5 * var5 + var3_double * var3_double)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                super.b(param0, -126);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("cf.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        double var14;
        double var16;
        double var18;
        if (param0 == 256) {
          var14 = param3 - this.field_E;
          var16 = param1 - this.field_t;
          var18 = param5 - this.field_D;
          if (0.010000000000000002 > var14 * var14 + var16 * var16 + var18 * var18) {
            this.d(10797);
            return;
          } else {
            return;
          }
        } else {
          cf.n(-92);
          var14 = param3 - this.field_E;
          var16 = param1 - this.field_t;
          var18 = param5 - this.field_D;
          if (0.010000000000000002 <= var14 * var14 + var16 * var16 + var18 * var18) {
            return;
          } else {
            this.d(10797);
            return;
          }
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int var7_int = 0;
        double var8 = 0.0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        double stackIn_10_1 = 0.0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        nf stackIn_13_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param2 < -5) {
                break L1;
              } else {
                this.field_ab = -0.4533094940135883;
                break L1;
              }
            }
            L2: {
              var7_int = 256;
              if ((this.field_Q ^ -1) >= -1) {
                break L2;
              } else {
                if (-2 <= (this.field_Q ^ -1)) {
                  var7_int = 128;
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              var8 = this.field_C;
              stackIn_9_0 = this;

              if (!this.field_gb) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0.1;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 0.2;
                break L3;
              }
            }
            L4: {
              ((cf) (this)).field_C = stackIn_10_1;
              stackIn_12_0 = this;

              if (this.field_gb) {
                stackIn_13_0 = this;
                stackIn_13_1 = rm.field_K;
                break L4;
              } else {
                stackIn_13_0 = this;
                stackIn_13_1 = aa.field_b[(14 & this.field_hb) >> -150292062];
                break L4;
              }
            }
            this.a(stackIn_13_1, var7_int, param3, (byte) 91, param1);
            this.field_C = var8;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7);

            stackIn_17_1 = new StringBuilder().append("cf.QA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_db = "F";
        field_cb = new String[16];
    }
}
