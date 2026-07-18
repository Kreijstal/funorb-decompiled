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
            ((cf) this).field_eb.field_o = ((cf) this).field_t;
            ((cf) this).field_eb.field_p = ((cf) this).field_D;
            ((cf) this).field_eb.field_u = 0.5;
            ((cf) this).field_eb.field_t = ((cf) this).field_E;
            param0.a((rk) (Object) ((cf) this).field_eb, (byte) 93);
            int var3_int = -39 % ((-2 - param1) / 62);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cf.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        Object var4 = null;
        ((cf) this).field_bb = ((cf) this).field_E;
        ((cf) this).field_hb = ((cf) this).field_hb + 1;
        ((cf) this).field_fb = ((cf) this).field_D;
        if (param0 == 11878) {
          ((cf) this).field_ab = ((cf) this).field_t;
          super.a(param0, param1);
          if (((cf) this).field_D >= ((cf) this).field_A.field_x.field_r[((cf) this).field_A.field_x.field_a + -1]) {
            ((cf) this).field_z = true;
            ((cf) this).field_s = 2;
            return;
          } else {
            return;
          }
        } else {
          var4 = null;
          ((cf) this).a((mn) null, (byte) -102);
          ((cf) this).field_ab = ((cf) this).field_t;
          super.a(param0, param1);
          if (((cf) this).field_D < ((cf) this).field_A.field_x.field_r[((cf) this).field_A.field_x.field_a + -1]) {
            return;
          } else {
            ((cf) this).field_z = true;
            ((cf) this).field_s = 2;
            return;
          }
        }
    }

    cf(hn param0, ee param1, double[] param2, double[] param3, double param4, double param5, boolean param6, boolean param7, boolean param8) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, 0.9, 0.003, param1, 0.75, 0.01);
        RuntimeException var12 = null;
        double var12_double = 0.0;
        Object stackIn_1_0 = null;
        hn stackIn_1_1 = null;
        double stackIn_1_2 = 0.0;
        double stackIn_1_3 = 0.0;
        double stackIn_1_4 = 0.0;
        double stackIn_1_5 = 0.0;
        double stackIn_1_6 = 0.0;
        ee stackIn_1_7 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        hn stackOut_0_1 = null;
        double stackOut_0_2 = 0.0;
        double stackOut_0_3 = 0.0;
        double stackOut_0_4 = 0.0;
        double stackOut_0_5 = 0.0;
        double stackOut_0_6 = 0.0;
        ee stackOut_0_7 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        L0: {
          stackOut_0_0 = this;
          stackOut_0_1 = (hn) param0;
          stackOut_0_2 = param1.field_E;
          stackOut_0_3 = param1.field_t;
          stackOut_0_4 = param1.field_D;
          stackOut_0_5 = 0.9;
          stackOut_0_6 = 0.003;
          stackOut_0_7 = (ee) param1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          stackIn_1_5 = stackOut_0_5;
          stackIn_1_6 = stackOut_0_6;
          stackIn_1_7 = stackOut_0_7;
          if (param7) {
            break L0;
          } else {
            break L0;
          }
        }
        ((cf) this).field_hb = 0;
        ((cf) this).field_eb = new oi((pm) this);
        try {
          L1: {
            L2: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param8) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            L3: {
              ((cf) this).field_gb = stackIn_5_1 != 0;
              double fieldTemp$3 = ((cf) this).field_E + (param3[1] * param2[6] + param2[3] * param3[0] + param3[2] * param2[9]);
              ((cf) this).field_E = ((cf) this).field_E + (param3[1] * param2[6] + param2[3] * param3[0] + param3[2] * param2[9]);
              ((cf) this).field_bb = fieldTemp$3;
              param5 = param5 * 0.8;
              if (!((cf) this).field_gb) {
                break L3;
              } else {
                ((cf) this).field_M = 0.01;
                ((cf) this).field_V = ((cf) this).field_V * 3.0;
                break L3;
              }
            }
            L4: {
              double fieldTemp$4 = ((cf) this).field_t + (param2[7] * param3[1] + param2[4] * param3[0] + param3[2] * param2[10]);
              ((cf) this).field_t = ((cf) this).field_t + (param2[7] * param3[1] + param2[4] * param3[0] + param3[2] * param2[10]);
              ((cf) this).field_ab = fieldTemp$4;
              param4 = param4 * 0.8;
              double fieldTemp$5 = ((cf) this).field_D + (param3[2] * param2[11] + (param2[5] * param3[0] + param2[8] * param3[1]));
              ((cf) this).field_D = ((cf) this).field_D + (param3[2] * param2[11] + (param2[5] * param3[0] + param2[8] * param3[1]));
              ((cf) this).field_fb = fieldTemp$5;
              ((cf) this).field_L = param2[5] * param4 + param1.field_L + param5 * param2[8] + param2[11] * 0.8;
              ((cf) this).field_G = param2[10] * 0.8 + (param4 * param2[4] + param1.field_G + param2[7] * param5);
              ((cf) this).field_K = param2[9] * 0.8 + (param1.field_K + param4 * param2[3] + param2[6] * param5);
              if (!param6) {
                break L4;
              } else {
                L5: {
                  var12_double = Math.sqrt(((cf) this).field_L * ((cf) this).field_L + (((cf) this).field_G * ((cf) this).field_G + ((cf) this).field_K * ((cf) this).field_K));
                  if (0.001 <= var12_double) {
                    break L5;
                  } else {
                    var12_double = 0.001;
                    break L5;
                  }
                }
                ((cf) this).field_W = param1.a(((cf) this).field_K / var12_double, ((cf) this).field_G / var12_double, ((cf) this).field_L / var12_double, false);
                break L4;
              }
            }
            break L1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("cf.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          L7: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void g(int param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        double stackIn_3_1 = 0.0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        bi stackIn_7_2 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        double stackOut_2_1 = 0.0;
        Object stackOut_1_0 = null;
        double stackOut_1_1 = 0.0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        bi stackOut_6_2 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        bi stackOut_5_2 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((cf) this).field_gb) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0.2;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 0.1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((cf) this).field_C = stackIn_3_1;
        if (param0 != 26402) {
          return;
        } else {
          L1: {
            stackOut_4_0 = this;
            stackOut_4_1 = -95;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (((cf) this).field_gb) {
              stackOut_6_0 = this;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = vb.field_f;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = og.field_f;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          ka discarded$2 = ((cf) this).a((byte) stackIn_7_1, stackIn_7_2, 3.0);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3_double = param0.field_E - ((cf) this).field_bb;
            var5 = -((cf) this).field_ab + param0.field_t;
            if (param1 < -122) {
              L1: {
                var7 = param0.field_D - ((cf) this).field_fb;
                var9 = ((cf) this).field_E - ((cf) this).field_bb;
                var11 = -((cf) this).field_ab + ((cf) this).field_t;
                var13 = -((cf) this).field_fb + ((cf) this).field_D;
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
                break L0;
              } else {
                super.b(param0, -126);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cf.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        if (param0 == 256) {
          var14 = param3 - ((cf) this).field_E;
          var16 = param1 - ((cf) this).field_t;
          var18 = param5 - ((cf) this).field_D;
          if (0.010000000000000002 > var14 * var14 + var16 * var16 + var18 * var18) {
            ((cf) this).d(10797);
            return;
          } else {
            return;
          }
        } else {
          cf.n(-92);
          var14 = param3 - ((cf) this).field_E;
          var16 = param1 - ((cf) this).field_t;
          var18 = param5 - ((cf) this).field_D;
          if (0.010000000000000002 <= var14 * var14 + var16 * var16 + var18 * var18) {
            return;
          } else {
            ((cf) this).d(10797);
            return;
          }
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int var7_int = 0;
        RuntimeException var7 = null;
        double var8 = 0.0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        double stackIn_10_1 = 0.0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        nf stackIn_13_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        double stackOut_9_1 = 0.0;
        Object stackOut_8_0 = null;
        double stackOut_8_1 = 0.0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        nf stackOut_12_1 = null;
        Object stackOut_11_0 = null;
        nf stackOut_11_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < -5) {
                break L1;
              } else {
                ((cf) this).field_ab = -0.4533094940135883;
                break L1;
              }
            }
            L2: {
              var7_int = 256;
              if (((cf) this).field_Q <= 0) {
                break L2;
              } else {
                if (((cf) this).field_Q <= 1) {
                  var7_int = 128;
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              var8 = ((cf) this).field_C;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!((cf) this).field_gb) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0.1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 0.2;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((cf) this).field_C = stackIn_10_1;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (((cf) this).field_gb) {
                stackOut_12_0 = this;
                stackOut_12_1 = rm.field_K;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = aa.field_b[(14 & ((cf) this).field_hb) >> 2];
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            ((cf) this).a(stackIn_13_1, var7_int, param3, (byte) 91, param1);
            ((cf) this).field_C = var8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7;
            stackOut_15_1 = new StringBuilder().append("cf.QA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = "F";
        field_cb = new String[16];
    }
}
