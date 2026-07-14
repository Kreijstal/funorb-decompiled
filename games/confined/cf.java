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
        ((cf) this).field_eb.field_o = ((cf) this).field_t;
        ((cf) this).field_eb.field_p = ((cf) this).field_D;
        ((cf) this).field_eb.field_u = 0.5;
        ((cf) this).field_eb.field_t = ((cf) this).field_E;
        param0.a((rk) (Object) ((cf) this).field_eb, (byte) 93);
        int var3 = -39 % ((-2 - param1) / 62);
    }

    final void a(int param0, int param1) {
        Object var4 = null;
        ((cf) this).field_bb = ((cf) this).field_E;
        ((cf) this).field_hb = ((cf) this).field_hb + 1;
        ((cf) this).field_fb = ((cf) this).field_D;
        if (param0 == 11878) {
          ((cf) this).field_ab = ((cf) this).field_t;
          super.a(param0 + 0, param1);
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
          super.a(param0 + 0, param1);
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
        double var12 = 0.0;
        Object stackIn_1_0 = null;
        hn stackIn_1_1 = null;
        double stackIn_1_2 = 0.0;
        double stackIn_1_3 = 0.0;
        double stackIn_1_4 = 0.0;
        double stackIn_1_5 = 0.0;
        double stackIn_1_6 = 0.0;
        ee stackIn_1_7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_0_0 = null;
        hn stackOut_0_1 = null;
        double stackOut_0_2 = 0.0;
        double stackOut_0_3 = 0.0;
        double stackOut_0_4 = 0.0;
        double stackOut_0_5 = 0.0;
        double stackOut_0_6 = 0.0;
        ee stackOut_0_7 = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
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
        L1: {
          ((cf) this).field_hb = 0;
          ((cf) this).field_eb = new oi((pm) this);
          stackOut_1_0 = this;
          stackIn_3_0 = stackOut_1_0;
          stackIn_2_0 = stackOut_1_0;
          if (!param8) {
            stackOut_3_0 = this;
            stackOut_3_1 = 0;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            break L1;
          } else {
            stackOut_2_0 = this;
            stackOut_2_1 = 1;
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            break L1;
          }
        }
        L2: {
          ((cf) this).field_gb = stackIn_4_1 != 0;
          ((cf) this).field_E = ((cf) this).field_E + (param3[1] * param2[6] + param2[3] * param3[0] + param3[2] * param2[9]);
          ((cf) this).field_bb = ((cf) this).field_E + (param3[1] * param2[6] + param2[3] * param3[0] + param3[2] * param2[9]);
          param5 = param5 * 0.8;
          if (!((cf) this).field_gb) {
            break L2;
          } else {
            ((cf) this).field_M = 0.01;
            ((cf) this).field_V = ((cf) this).field_V * 3.0;
            break L2;
          }
        }
        L3: {
          ((cf) this).field_t = ((cf) this).field_t + (param2[7] * param3[1] + param2[4] * param3[0] + param3[2] * param2[10]);
          ((cf) this).field_ab = ((cf) this).field_t + (param2[7] * param3[1] + param2[4] * param3[0] + param3[2] * param2[10]);
          param4 = param4 * 0.8;
          ((cf) this).field_D = ((cf) this).field_D + (param3[2] * param2[11] + (param2[5] * param3[0] + param2[8] * param3[1]));
          ((cf) this).field_fb = ((cf) this).field_D + (param3[2] * param2[11] + (param2[5] * param3[0] + param2[8] * param3[1]));
          ((cf) this).field_L = param2[5] * param4 + param1.field_L + param5 * param2[8] + param2[11] * 0.8;
          ((cf) this).field_G = param2[10] * 0.8 + (param4 * param2[4] + param1.field_G + param2[7] * param5);
          ((cf) this).field_K = param2[9] * 0.8 + (param1.field_K + param4 * param2[3] + param2[6] * param5);
          if (!param6) {
            break L3;
          } else {
            L4: {
              var12 = Math.sqrt(((cf) this).field_L * ((cf) this).field_L + (((cf) this).field_G * ((cf) this).field_G + ((cf) this).field_K * ((cf) this).field_K));
              if (0.001 <= var12) {
                break L4;
              } else {
                var12 = 0.001;
                break L4;
              }
            }
            ((cf) this).field_W = param1.a(((cf) this).field_K / var12, ((cf) this).field_G / var12, ((cf) this).field_L / var12, false);
            break L3;
          }
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
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        var3 = param0.field_E - ((cf) this).field_bb;
        var5 = -((cf) this).field_ab + param0.field_t;
        if (param1 < -122) {
          L0: {
            var7 = param0.field_D - ((cf) this).field_fb;
            var9 = ((cf) this).field_E - ((cf) this).field_bb;
            var11 = -((cf) this).field_ab + ((cf) this).field_t;
            var13 = -((cf) this).field_fb + ((cf) this).field_D;
            var15 = var7 * var13 + (var11 * var5 + var9 * var3);
            if (0.0 >= var15) {
              break L0;
            } else {
              var15 = var15 / (var9 * var9 + var11 * var11 + var13 * var13);
              if (1.0 > var15) {
                var7 = var7 - var15 * var13;
                var3 = var3 - var15 * var9;
                var5 = var5 - var15 * var11;
                break L0;
              } else {
                var5 = var5 - var11;
                var3 = var3 - var9;
                var7 = var7 - var13;
                var17 = param0.field_C + 0.1;
                if (var17 * var17 <= var7 * var7 + (var5 * var5 + var3 * var3)) {
                  return;
                } else {
                  super.b(param0, -126);
                  return;
                }
              }
            }
          }
          var17 = param0.field_C + 0.1;
          if (var17 * var17 > var7 * var7 + (var5 * var5 + var3 * var3)) {
            super.b(param0, -126);
            return;
          } else {
            return;
          }
        } else {
          return;
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
        int var7 = 0;
        double var8 = 0.0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        double stackIn_5_1 = 0.0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        nf stackIn_8_1 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        double stackIn_13_1 = 0.0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        nf stackIn_16_1 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        double stackIn_23_1 = 0.0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        nf stackIn_26_1 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        double stackIn_31_1 = 0.0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        nf stackIn_34_1 = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        double stackOut_30_1 = 0.0;
        Object stackOut_29_0 = null;
        double stackOut_29_1 = 0.0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        nf stackOut_33_1 = null;
        Object stackOut_32_0 = null;
        nf stackOut_32_1 = null;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        double stackOut_22_1 = 0.0;
        Object stackOut_21_0 = null;
        double stackOut_21_1 = 0.0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        nf stackOut_25_1 = null;
        Object stackOut_24_0 = null;
        nf stackOut_24_1 = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        double stackOut_12_1 = 0.0;
        Object stackOut_11_0 = null;
        double stackOut_11_1 = 0.0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        nf stackOut_15_1 = null;
        Object stackOut_14_0 = null;
        nf stackOut_14_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        double stackOut_4_1 = 0.0;
        Object stackOut_3_0 = null;
        double stackOut_3_1 = 0.0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        nf stackOut_7_1 = null;
        Object stackOut_6_0 = null;
        nf stackOut_6_1 = null;
        if (param2 < -5) {
          var7 = 256;
          if (((cf) this).field_Q < -1) {
            if (-2 < ((cf) this).field_Q) {
              return;
            } else {
              L0: {
                var7 = 128;
                var8 = ((cf) this).field_C;
                stackOut_28_0 = this;
                stackIn_30_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (!((cf) this).field_gb) {
                  stackOut_30_0 = this;
                  stackOut_30_1 = 0.1;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  break L0;
                } else {
                  stackOut_29_0 = this;
                  stackOut_29_1 = 0.2;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  break L0;
                }
              }
              L1: {
                ((cf) this).field_C = stackIn_31_1;
                stackOut_31_0 = this;
                stackIn_33_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (((cf) this).field_gb) {
                  stackOut_33_0 = this;
                  stackOut_33_1 = rm.field_K;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L1;
                } else {
                  stackOut_32_0 = this;
                  stackOut_32_1 = aa.field_b[(14 & ((cf) this).field_hb) >> -150292062];
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  break L1;
                }
              }
              ((cf) this).a(stackIn_34_1, var7, param3, (byte) 91, param1);
              ((cf) this).field_C = var8;
              return;
            }
          } else {
            L2: {
              var8 = ((cf) this).field_C;
              stackOut_20_0 = this;
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (!((cf) this).field_gb) {
                stackOut_22_0 = this;
                stackOut_22_1 = 0.1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L2;
              } else {
                stackOut_21_0 = this;
                stackOut_21_1 = 0.2;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L2;
              }
            }
            L3: {
              ((cf) this).field_C = stackIn_23_1;
              stackOut_23_0 = this;
              stackIn_25_0 = stackOut_23_0;
              stackIn_24_0 = stackOut_23_0;
              if (((cf) this).field_gb) {
                stackOut_25_0 = this;
                stackOut_25_1 = rm.field_K;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                break L3;
              } else {
                stackOut_24_0 = this;
                stackOut_24_1 = aa.field_b[(14 & ((cf) this).field_hb) >> -150292062];
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L3;
              }
            }
            ((cf) this).a(stackIn_26_1, var7, param3, (byte) 91, param1);
            ((cf) this).field_C = var8;
            return;
          }
        } else {
          ((cf) this).field_ab = -0.4533094940135883;
          var7 = 256;
          if (((cf) this).field_Q < -1) {
            if (-2 < ((cf) this).field_Q) {
              return;
            } else {
              L4: {
                var7 = 128;
                var8 = ((cf) this).field_C;
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!((cf) this).field_gb) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0.1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L4;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 0.2;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L4;
                }
              }
              L5: {
                ((cf) this).field_C = stackIn_13_1;
                stackOut_13_0 = this;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (((cf) this).field_gb) {
                  stackOut_15_0 = this;
                  stackOut_15_1 = rm.field_K;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L5;
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = aa.field_b[(14 & ((cf) this).field_hb) >> -150292062];
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L5;
                }
              }
              ((cf) this).a(stackIn_16_1, var7, param3, (byte) 91, param1);
              ((cf) this).field_C = var8;
              return;
            }
          } else {
            L6: {
              var8 = ((cf) this).field_C;
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!((cf) this).field_gb) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0.1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L6;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 0.2;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L6;
              }
            }
            L7: {
              ((cf) this).field_C = stackIn_5_1;
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (((cf) this).field_gb) {
                stackOut_7_0 = this;
                stackOut_7_1 = rm.field_K;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L7;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = aa.field_b[(14 & ((cf) this).field_hb) >> -150292062];
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L7;
              }
            }
            ((cf) this).a(stackIn_8_1, var7, param3, (byte) 91, param1);
            ((cf) this).field_C = var8;
            return;
          }
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
