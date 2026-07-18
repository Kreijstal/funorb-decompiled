/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends ah {
    static ok field_cb;
    static int[] field_bb;
    private oi field_db;
    private pm field_eb;

    gm(hn param0, ee param1, double[] param2, double param3, double param4, double param5) {
        super(param0, param1, 0.4, 0.02, 8.0, param2, param3, param4, param5, fj.field_G);
        ((gm) this).field_db = new oi((pm) this);
        try {
            ((gm) this).field_eb = (pm) (Object) param0.field_B;
            ((gm) this).field_eb.h(17086);
            kj.a(ul.field_P, 96, (pm) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        if (((gm) this).field_eb != null) {
          L0: {
            var3 = Math.sqrt(((gm) this).field_L * ((gm) this).field_L + (((gm) this).field_K * ((gm) this).field_K + ((gm) this).field_G * ((gm) this).field_G));
            if (var3 < 0.001) {
              var3 = 0.001;
              break L0;
            } else {
              break L0;
            }
          }
          var5 = ((gm) this).field_K / var3;
          var7 = ((gm) this).field_G / var3;
          var9 = ((gm) this).field_L / var3;
          if (((gm) this).a(var9, ((gm) this).field_eb, var5, 1, var7)) {
            ((gm) this).field_eb.f((byte) -119);
            ((gm) this).field_eb = ((gm) this).a(var5, var7, var9, false);
            if (null == ((gm) this).field_eb) {
              super.a(param0, param1);
              if (((gm) this).field_z) {
                if (((gm) this).field_eb == null) {
                  return;
                } else {
                  ((gm) this).field_eb.f((byte) -123);
                  ((gm) this).field_eb = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              ((gm) this).field_eb.h(17086);
              ((gm) this).b(((gm) this).field_eb, (byte) 106);
              ((gm) this).a(((gm) this).field_ab, true);
              super.a(param0, param1);
              if (((gm) this).field_z) {
                if (((gm) this).field_eb == null) {
                  return;
                } else {
                  ((gm) this).field_eb.f((byte) -123);
                  ((gm) this).field_eb = null;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((gm) this).b(((gm) this).field_eb, (byte) 106);
            ((gm) this).a(((gm) this).field_ab, true);
            super.a(param0, param1);
            if (((gm) this).field_z) {
              if (((gm) this).field_eb == null) {
                return;
              } else {
                ((gm) this).field_eb.f((byte) -123);
                ((gm) this).field_eb = null;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          super.a(param0, param1);
          if (((gm) this).field_z) {
            if (((gm) this).field_eb == null) {
              return;
            } else {
              ((gm) this).field_eb.f((byte) -123);
              ((gm) this).field_eb = null;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(mn param0, byte param1) {
        double[] var3 = null;
        RuntimeException var3_ref = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        double[] var11 = null;
        double[] var12 = null;
        double[] var13 = null;
        double[] var14 = null;
        double[] var15 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var15 = new double[12];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var3 = var11;
            ((gm) this).field_ab.a((byte) 112, var15);
            var4 = var15[9];
            var6 = var15[10];
            ((gm) this).field_db.field_t = -(((gm) this).field_C * var4 * 0.8) + ((gm) this).field_E;
            var8 = var15[11];
            var10 = 117 / ((-2 - param1) / 62);
            ((gm) this).field_db.field_o = ((gm) this).field_t - 0.8 * (var6 * ((gm) this).field_C);
            ((gm) this).field_db.field_v = -var8;
            ((gm) this).field_db.field_w = true;
            ((gm) this).field_db.field_u = 15.0;
            ((gm) this).field_db.field_m = -var4;
            ((gm) this).field_db.field_x = -var6;
            ((gm) this).field_db.field_p = -(var8 * ((gm) this).field_C * 0.8) + ((gm) this).field_D;
            param0.a((rk) (Object) ((gm) this).field_db, (byte) -88);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("gm.OA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        Object var3 = null;
        if (param0 == 26402) {
          if (null != ((gm) this).field_eb) {
            ((gm) this).field_eb.f((byte) -125);
            int discarded$4 = 4;
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5));
            return;
          } else {
            int discarded$5 = 4;
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5));
            return;
          }
        } else {
          var3 = null;
          ((gm) this).a((mn) null, 0.183731807417079, -74, (vg) null, (oi) null);
          if (null == ((gm) this).field_eb) {
            int discarded$6 = 4;
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5));
            return;
          } else {
            ((gm) this).field_eb.f((byte) -125);
            int discarded$7 = 4;
            fl.a(((gm) this).a(-2384, bn.field_b, 1.5, 0.002, 0.5));
            return;
          }
        }
    }

    gm(hn param0, dj param1) {
        super(param0, param1, 0.4, 0.02, 64.0, fj.field_G);
        double[] var4 = null;
        ((gm) this).field_db = new oi((pm) this);
        try {
            var4 = new double[12];
            double[] var3 = var4;
            ((gm) this).field_ab.a((byte) 81, var4);
            ((gm) this).field_eb = param1.a(var4[9], var4[10], var4[11], false);
            if (null != ((gm) this).field_eb) {
                ((gm) this).field_eb.h(17086);
            }
            kj.a(ul.field_P, 96, (pm) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        if (param0 != 15) {
            gm.m(-41);
            field_cb = null;
            field_bb = null;
            return;
        }
        field_cb = null;
        field_bb = null;
    }

    final static void i() {
        int discarded$2 = -58;
        if (!ka.k()) {
            return;
        }
        q.a(4, false, (byte) -101);
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
        int stackIn_7_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param2 <= -5) {
              if (!((gm) this).field_N) {
                L1: {
                  var19 = new double[12];
                  var18 = var19;
                  var17 = var18;
                  var16 = var17;
                  var15 = var16;
                  var7_array = var15;
                  ((gm) this).field_ab.a((byte) 123, var19);
                  var8 = var19[9];
                  var10 = var19[10];
                  var12 = var19[11];
                  if (var12 * param3.field_N + (param3.field_H * var10 + param3.field_P * var8) <= 0.0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L1;
                  }
                }
                L2: {
                  var14 = stackIn_7_0;
                  if (var14 != 0) {
                    ((gm) this).a(h.field_Y, ((gm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                pa.a(-(((gm) this).field_C * var8 * 0.8) + ((gm) this).field_E, 0.2 * ((gm) this).field_C, (byte) -11, 256, ((gm) this).field_D - var12 * ((gm) this).field_C * 0.8, ((gm) this).field_t - 0.8 * (var10 * ((gm) this).field_C), wb.field_a, param1, param3);
                if (var14 == 0) {
                  ((gm) this).a(h.field_Y, ((gm) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7;
            stackOut_14_1 = new StringBuilder().append("gm.QA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new int[8192];
    }
}
