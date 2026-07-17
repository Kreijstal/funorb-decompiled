/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static boolean field_b;
    private double field_c;
    private double field_f;
    static String field_a;
    private double field_d;
    static boolean field_i;
    static bi field_g;
    static vc field_j;
    static int field_h;
    private double field_k;
    static jb field_e;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        if (param3 <= -75) {
          if (param7 > param2) {
            if (param7 >= param4) {
              if (param2 < param4) {
                mb.a(param7, param6, param4, param2, param1, fn.field_h, param5, param0, (byte) 112);
                return;
              } else {
                mb.a(param7, param6, param2, param4, param0, fn.field_h, param5, param1, (byte) 112);
                return;
              }
            } else {
              mb.a(param4, param6, param7, param2, param1, fn.field_h, param0, param5, (byte) 112);
              return;
            }
          } else {
            if (param4 <= param2) {
              if (param4 > param7) {
                mb.a(param2, param6, param4, param7, param5, fn.field_h, param1, param0, (byte) 112);
                return;
              } else {
                mb.a(param2, param6, param7, param4, param0, fn.field_h, param1, param5, (byte) 112);
                return;
              }
            } else {
              mb.a(param4, param6, param2, param7, param5, fn.field_h, param0, param1, (byte) 112);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(double param0, byte param1) {
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        var4 = Math.sqrt(((da) this).field_f * ((da) this).field_f + ((da) this).field_c * ((da) this).field_c + ((da) this).field_d * ((da) this).field_d);
        if (var4 <= 0.0001) {
          return;
        } else {
          if (param1 != -65) {
            ((da) this).field_k = -1.916192409169927;
            var6 = Math.atan2(var4, ((da) this).field_k);
            var8 = ((da) this).field_f / var4;
            var10 = ((da) this).field_c / var4;
            var6 = var6 * param0;
            var12 = ((da) this).field_d / var4;
            ((da) this).field_k = Math.cos(var6);
            var4 = Math.sin(var6);
            ((da) this).field_c = var4 * var10;
            ((da) this).field_f = var4 * var8;
            ((da) this).field_d = var4 * var12;
            return;
          } else {
            var6 = Math.atan2(var4, ((da) this).field_k);
            var8 = ((da) this).field_f / var4;
            var10 = ((da) this).field_c / var4;
            var6 = var6 * param0;
            var12 = ((da) this).field_d / var4;
            ((da) this).field_k = Math.cos(var6);
            var4 = Math.sin(var6);
            ((da) this).field_c = var4 * var10;
            ((da) this).field_f = var4 * var8;
            ((da) this).field_d = var4 * var12;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_g = null;
        field_a = null;
        field_e = null;
    }

    final void a(byte param0, da param1, double param2) {
        RuntimeException var5 = null;
        double var5_double = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        Object var16 = null;
        double stackIn_6_0 = 0.0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_5_0 = 0.0;
        double stackOut_4_0 = 0.0;
        double stackOut_3_0 = 0.0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var15 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_double = ((da) this).field_d * param1.field_d + (param1.field_k * ((da) this).field_k + param1.field_f * ((da) this).field_f + ((da) this).field_c * param1.field_c);
            if (1.0 <= var5_double) {
              stackOut_5_0 = 0.0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              if (-1.0 < var5_double) {
                stackOut_4_0 = Math.acos(var5_double);
                stackIn_6_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 3.141592653589793;
                stackIn_6_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          L1: {
            L2: {
              var7 = stackIn_6_0;
              if (var7 < 0.0001) {
                break L2;
              } else {
                if (var7 > 3.141492653589793) {
                  break L2;
                } else {
                  var9 = Math.sin(var7);
                  var11 = Math.sin(var7 * (1.0 - param2)) / var9;
                  var13 = Math.sin(var7 * param2) / var9;
                  ((da) this).field_d = ((da) this).field_d * var11 + param1.field_d * var13;
                  ((da) this).field_f = param1.field_f * var13 + var11 * ((da) this).field_f;
                  ((da) this).field_c = param1.field_c * var13 + var11 * ((da) this).field_c;
                  ((da) this).field_k = ((da) this).field_k * var11 + param1.field_k * var13;
                  break L1;
                }
              }
            }
            ((da) this).field_d = ((da) this).field_d + (param1.field_d - ((da) this).field_d) * param2;
            ((da) this).field_k = ((da) this).field_k + param2 * (-((da) this).field_k + param1.field_k);
            ((da) this).field_f = ((da) this).field_f + param2 * (param1.field_f - ((da) this).field_f);
            ((da) this).field_c = ((da) this).field_c + (param1.field_c - ((da) this).field_c) * param2;
            break L1;
          }
          L3: {
            if (param0 == 116) {
              break L3;
            } else {
              var16 = null;
              ((da) this).a(87, (da) null);
              break L3;
            }
          }
          var9 = ((da) this).field_d * ((da) this).field_d + (((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k));
          if (1e-7 > var9) {
            ((da) this).field_k = 1.0;
            ((da) this).field_c = 0.0;
            ((da) this).field_f = 0.0;
            ((da) this).field_d = 0.0;
            return;
          } else {
            var9 = 1.0 / var9;
            ((da) this).field_k = ((da) this).field_k * var9;
            ((da) this).field_f = ((da) this).field_f * var9;
            ((da) this).field_c = ((da) this).field_c * var9;
            ((da) this).field_d = ((da) this).field_d * var9;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("da.B(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
    }

    final void a(int[] param0, int param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
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
            var3_double = ((da) this).field_k * ((da) this).field_k;
            var5 = ((da) this).field_f * ((da) this).field_k;
            var7 = ((da) this).field_c * ((da) this).field_k;
            var9 = ((da) this).field_k * ((da) this).field_d;
            var11 = ((da) this).field_f * ((da) this).field_f;
            var13 = ((da) this).field_c * ((da) this).field_f;
            var15 = ((da) this).field_f * ((da) this).field_d;
            var19 = -87 % ((-38 - param1) / 58);
            var17 = ((da) this).field_c * ((da) this).field_c;
            var20 = ((da) this).field_c * ((da) this).field_d;
            var22 = ((da) this).field_d * ((da) this).field_d;
            param0[11] = (int)(65536.0 * (-var11 + (var22 + var3_double - var17)));
            param0[9] = (int)(65536.0 * (var7 + (var15 + var7 + var15)));
            param0[8] = (int)((var20 + (var5 + var20) + var5) * 65536.0);
            param0[4] = (int)((var9 + var13 + var13 + var9) * 65536.0);
            param0[7] = (int)((-var22 + (var17 + var3_double - var11)) * 65536.0);
            param0[3] = (int)(65536.0 * (var11 + var3_double - var22 - var17));
            param0[6] = (int)((-var9 + (var13 - var9) + var13) * 65536.0);
            param0[5] = (int)(65536.0 * (-var7 + var15 - var7 + var15));
            param0[10] = (int)((var20 + (-var5 + (-var5 + var20))) * 65536.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("da.A(");
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
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
    }

    final void a(byte param0, double[] param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3_double = ((da) this).field_k * ((da) this).field_k;
            var5 = ((da) this).field_f * ((da) this).field_k;
            var7 = ((da) this).field_c * ((da) this).field_k;
            var9 = ((da) this).field_k * ((da) this).field_d;
            var11 = ((da) this).field_f * ((da) this).field_f;
            var13 = ((da) this).field_f * ((da) this).field_c;
            var15 = ((da) this).field_f * ((da) this).field_d;
            var17 = ((da) this).field_c * ((da) this).field_c;
            var19 = ((da) this).field_d * ((da) this).field_c;
            var21 = ((da) this).field_d * ((da) this).field_d;
            param1[3] = -var17 + (var3_double + var11 - var21);
            param1[5] = -var7 + (var15 - var7) + var15;
            param1[11] = -var11 + (var3_double + var21 - var17);
            param1[8] = var5 + (var19 + var5 + var19);
            param1[4] = var9 + (var13 + var9 + var13);
            param1[9] = var15 + (var7 + var15) + var7;
            param1[7] = var17 + var3_double - var11 - var21;
            if (param0 > 19) {
              param1[6] = var13 - var9 - var9 + var13;
              param1[10] = var19 + (-var5 + (-var5 + var19));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("da.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void a(double param0, double param1, double param2, double param3, int param4) {
        double var10 = 0.0;
        double var12 = 0.0;
        param0 = param0 * 0.5;
        var10 = Math.sin(param0);
        var12 = Math.cos(param0);
        ((da) this).field_k = var12;
        if (param4 != 7) {
          field_a = null;
          ((da) this).field_d = param1 * var10;
          ((da) this).field_f = var10 * param2;
          ((da) this).field_c = var10 * param3;
          return;
        } else {
          ((da) this).field_d = param1 * var10;
          ((da) this).field_f = var10 * param2;
          ((da) this).field_c = var10 * param3;
          return;
        }
    }

    final void a(int param0, da param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3_double = -(param1.field_f * ((da) this).field_f) + ((da) this).field_k * param1.field_k - ((da) this).field_c * param1.field_c - ((da) this).field_d * param1.field_d;
            var5 = -(((da) this).field_c * param1.field_d) + (((da) this).field_d * param1.field_c + (param1.field_f * ((da) this).field_k + ((da) this).field_f * param1.field_k));
            var7 = ((da) this).field_k * param1.field_c + param1.field_k * ((da) this).field_c + param1.field_d * ((da) this).field_f - param1.field_f * ((da) this).field_d;
            ((da) this).field_d = param1.field_f * ((da) this).field_c + (param1.field_k * ((da) this).field_d + ((da) this).field_k * param1.field_d) - param1.field_c * ((da) this).field_f;
            ((da) this).field_k = var3_double;
            ((da) this).field_f = var5;
            ((da) this).field_c = var7;
            if (param0 <= -6) {
              var9 = 1.0 / Math.sqrt(((da) this).field_c * ((da) this).field_c + (((da) this).field_f * ((da) this).field_f + ((da) this).field_k * ((da) this).field_k) + ((da) this).field_d * ((da) this).field_d);
              ((da) this).field_d = ((da) this).field_d * var9;
              ((da) this).field_k = ((da) this).field_k * var9;
              ((da) this).field_c = ((da) this).field_c * var9;
              ((da) this).field_f = ((da) this).field_f * var9;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("da.J(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void a(int param0) {
        ((da) this).field_k = 1.0;
        ((da) this).field_d = (double)param0;
        ((da) this).field_f = 0.0;
        ((da) this).field_c = 0.0;
    }

    final static void a(int param0, int param1, bi param2, boolean param3, pm param4) {
        gk var5 = null;
        try {
            var5 = new gk(param4, param2, param1);
            var5.field_m = param0;
            var5.field_o = param3 ? true : false;
            var5.e(6466);
            var5.field_t = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "da.G(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    da() {
        ((da) this).field_k = 1.0;
    }

    da(da param0) {
        try {
            ((da) this).field_c = param0.field_c;
            ((da) this).field_k = param0.field_k;
            ((da) this).field_d = param0.field_d;
            ((da) this).field_f = param0.field_f;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "da.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_i = true;
        field_a = "Upgrade controls";
    }
}
