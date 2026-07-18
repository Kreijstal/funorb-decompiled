/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ah {
    static int[][] field_bb;
    private pm field_ib;
    private oi field_db;
    static int[][] field_eb;
    static String field_hb;
    static String field_fb;
    static int[] field_cb;
    static int[] field_gb;

    public static void m(int param0) {
        field_fb = null;
        field_bb = null;
        field_cb = null;
        field_eb = null;
        if (param0 != -27552) {
            return;
        }
        field_gb = null;
        field_hb = null;
    }

    final void a(mn param0, byte param1) {
        double[] var15 = null;
        double[] var14 = null;
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        try {
            var15 = new double[12];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            double[] var3 = var11;
            ((mm) this).field_ab.a((byte) 54, var15);
            var4 = var15[9];
            var6 = var15[10];
            ((mm) this).field_db.field_t = -(((mm) this).field_C * var4) + ((mm) this).field_E;
            var8 = var15[11];
            ((mm) this).field_db.field_o = -(var6 * ((mm) this).field_C) + ((mm) this).field_t;
            ((mm) this).field_db.field_u = 10.0;
            int var10 = 25 / ((param1 - -2) / 62);
            ((mm) this).field_db.field_p = ((mm) this).field_D - ((mm) this).field_C * var8;
            ((mm) this).field_db.field_v = -var8;
            ((mm) this).field_db.field_m = -var4;
            ((mm) this).field_db.field_w = true;
            ((mm) this).field_db.field_x = -var6;
            param0.a((rk) (Object) ((mm) this).field_db, (byte) 104);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "mm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mm(hn param0, ee param1, da param2, pm param3) {
        super(param0, 0.2, 0.003, 16.0, param1, pl.field_y);
        RuntimeException var5 = null;
        double[] var5_array = null;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double[] var37 = null;
        double[] var38 = null;
        double[] var39 = null;
        double[] var40 = null;
        double[] var41 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
        ((mm) this).field_db = new oi((pm) this);
        try {
          L0: {
            L1: {
              ((mm) this).field_ab = new da(param2);
              var41 = new double[12];
              var40 = var41;
              var39 = var40;
              var38 = var39;
              var37 = var38;
              var5_array = var37;
              ((mm) this).field_ab.a((byte) 66, var41);
              var6 = var41[9];
              var8 = var41[10];
              var10 = var41[11];
              if (param3 == null) {
                var16 = -0.999 + 1.998 * Math.random();
                var18 = Math.sqrt(-(var16 * var16) + 1.0);
                var20 = 2.0 * (3.141592653589793 * Math.random());
                var12 = var18 * Math.sin(var20);
                var14 = Math.cos(var20) * var18;
                break L1;
              } else {
                var16 = param3.field_D - ((mm) this).field_D;
                var12 = param3.field_E - ((mm) this).field_E;
                var14 = -((mm) this).field_t + param3.field_t;
                break L1;
              }
            }
            L2: {
              var18 = var10 * var16 + (var6 * var12 + var8 * var14);
              var20 = -(var8 * var16) + var10 * var14;
              var22 = -(var12 * var10) + var16 * var6;
              var24 = var12 * var8 - var6 * var14;
              var26 = Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24);
              if (var26 < 0.0001) {
                var24 = var41[8];
                var22 = var41[7];
                var20 = var41[6];
                break L2;
              } else {
                var24 = var24 / var26;
                var22 = var22 / var26;
                var20 = var20 / var26;
                break L2;
              }
            }
            var28 = Math.atan2(var26, var18);
            hd.field_e.a(-var28, var24, var20, var22, 7);
            ((mm) this).field_ab.a(-43, hd.field_e);
            var24 = -0.999 + Math.random() * 1.998;
            var30 = Math.sqrt(1.0 - var24 * var24);
            var32 = 2.0 * (Math.random() * 3.141592653589793);
            var20 = Math.sin(var32) * var30;
            var22 = Math.cos(var32) * var30;
            hd.field_e.a(0.1 * Math.random(), var24, var20, var22, 7);
            ((mm) this).field_ab.a(-60, hd.field_e);
            ((mm) this).field_ab.a((byte) 30, var41);
            var34 = 0.05 + 0.05 * Math.random();
            ((mm) this).field_L = var34 * var41[11];
            ((mm) this).field_ib = param3;
            ((mm) this).field_G = var34 * var41[10];
            ((mm) this).field_K = var41[9] * var34;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("mm.<init>(");
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
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
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final void a(mm param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (((mm) this).field_Y == param0.field_Y) {
              return;
            } else {
              L1: {
                ((mm) this).a(105, (ah) (Object) param0);
                if (!param1) {
                  break L1;
                } else {
                  ((mm) this).field_ib = null;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("mm.DC(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        ka var2 = ((mm) this).a((byte) -126, kj.field_b, 1.5);
        if (param0 != 26402) {
            mm.m(42);
        }
        var2.field_M.field_w = 0.5;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException var7 = null;
        double[] var7_array = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        double[] var18 = null;
        double[] var19 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((mm) this).field_N) {
              L1: {
                var19 = new double[12];
                var18 = var19;
                var17 = var18;
                var16 = var17;
                var15 = var16;
                var7_array = var15;
                ((mm) this).field_ab.a((byte) 105, var19);
                var8 = var19[9];
                var10 = var19[10];
                var12 = var19[11];
                if (var8 * param3.field_P + param3.field_H * var10 + param3.field_N * var12 <= 0.0) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var14 = stackIn_5_0;
                if (var14 != 0) {
                  ((mm) this).a(tk.field_a, ((mm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                pa.a(((mm) this).field_E - var8 * ((mm) this).field_C, 0.2 * ((mm) this).field_C, (byte) -11, 256, -(var12 * ((mm) this).field_C) + ((mm) this).field_D, ((mm) this).field_t - ((mm) this).field_C * var10, wb.field_a, param1, param3);
                if (var14 != 0) {
                  break L3;
                } else {
                  ((mm) this).a(tk.field_a, ((mm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                  break L3;
                }
              }
              L4: {
                if (param2 <= -5) {
                  break L4;
                } else {
                  ((mm) this).field_ib = null;
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("mm.QA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static void a(int param0, int param1, nf[] param2, nf[] param3, nf[] param4, int param5, byte param6, int param7, int param8, int param9, int param10, int param11, ok param12, int param13, ok param14) {
        int var21_int = 0;
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            int discarded$3 = 20;
            int discarded$4 = 16777215;
            int discarded$5 = 240;
            ai.a(param12, new ji(param3), 16, 30, 4243584, 20, 9805732, 480, new ji(param2), 16, 50, 20, -78, new ji(param4), 0, 320, 5, param14);
            var21_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("mm.EC(").append(480).append(',').append(320).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(4243584).append(',').append(-126).append(',').append(240).append(',').append(9805732).append(',').append(30).append(',').append(5).append(',').append(16777215).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param12 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(20).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param14 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 16 + ',' + 50 + ',' + 20 + ',' + 0 + ',' + 20 + ',' + 16 + ')');
        }
    }

    final void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        L0: {
          if (((mm) this).field_ib == null) {
            break L0;
          } else {
            L1: {
              var3 = Math.sqrt(((mm) this).field_G * ((mm) this).field_G + ((mm) this).field_K * ((mm) this).field_K + ((mm) this).field_L * ((mm) this).field_L);
              if (0.001 > var3) {
                var3 = 0.001;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = ((mm) this).field_K / var3;
              var7 = ((mm) this).field_G / var3;
              var9 = ((mm) this).field_L / var3;
              if (!((mm) this).a(var9, ((mm) this).field_ib, var5, 1, var7)) {
                break L2;
              } else {
                pm dupTemp$2 = ((mm) this).a(var5, var7, var9, false);
                ((mm) this).field_ib = dupTemp$2;
                if (null == dupTemp$2) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            ((mm) this).b(((mm) this).field_ib, (byte) 106);
            ((mm) this).a(((mm) this).field_ab, true);
            break L0;
          }
        }
        L3: {
          if (param0 == 11878) {
            break L3;
          } else {
            mm.m(-44);
            break L3;
          }
        }
        super.a(param0, param1);
    }

    final void a(pm param0, int param1) {
        try {
            if (param1 > -81) {
                Object var4 = null;
                ((mm) this).a((mn) null, (byte) 122);
            }
            param0.a((mm) this, false);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "mm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_eb = new int[][]{new int[28], new int[8], new int[12], new int[26], new int[20], new int[12], new int[26], new int[24], new int[12], new int[14]};
        field_bb = new int[field_eb.length][];
        for (var0 = 0; var0 < field_eb.length; var0++) {
            field_bb[var0] = new int[field_eb[var0].length];
        }
        field_fb = "<col=FFFFFF>Cluster missiles:</col> upon impact, these release five shells that aim for and home in on nearby targets. Tap <col=FFFFFF><%0></col> to fire one; hold <col=FFFFFF><%0></col> to fire many. You get four at once but can only carry 10.";
        field_gb = new int[256];
        field_hb = "Play free version";
        field_cb = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0 * var0 >> 8;
            var2 = var1 * var1 >> 8;
            field_gb[var0] = nl.a(var1, nl.a(var2 << 16, var0 << 8));
            field_cb[var0] = nl.a(nl.a(var0 << 16, var1 << 8), var2);
        }
    }
}
