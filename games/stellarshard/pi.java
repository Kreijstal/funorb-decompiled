/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    double field_c;
    double field_d;
    double field_a;
    double field_b;

    final static void a(boolean param0) {
        if (ei.field_G != null) {
          ei.field_G.o(3);
          pd.field_e = new lj();
          sf.field_f.b((rj) (Object) pd.field_e, 23143);
          return;
        } else {
          pd.field_e = new lj();
          sf.field_f.b((rj) (Object) pd.field_e, 23143);
          return;
        }
    }

    final void a(double[] param0, int param1) {
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
            L1: {
              var3_double = ((pi) this).field_b * ((pi) this).field_b;
              var5 = ((pi) this).field_b * ((pi) this).field_d;
              var7 = ((pi) this).field_b * ((pi) this).field_c;
              var9 = ((pi) this).field_b * ((pi) this).field_a;
              var11 = ((pi) this).field_d * ((pi) this).field_d;
              var13 = ((pi) this).field_d * ((pi) this).field_c;
              var15 = ((pi) this).field_a * ((pi) this).field_d;
              if (param1 == 8) {
                break L1;
              } else {
                ((pi) this).field_c = 1.09697255862232;
                break L1;
              }
            }
            var17 = ((pi) this).field_c * ((pi) this).field_c;
            var19 = ((pi) this).field_a * ((pi) this).field_c;
            var21 = ((pi) this).field_a * ((pi) this).field_a;
            param0[7] = var3_double + var17 - var11 - var21;
            param0[10] = -var5 + (var19 - var5) + var19;
            param0[5] = var15 + (-var7 + var15 - var7);
            param0[6] = var13 + (-var9 + (-var9 + var13));
            param0[4] = var9 + (var13 + (var9 + var13));
            param0[9] = var15 + var7 + var15 + var7;
            param0[8] = var19 + (var5 + var19) + var5;
            param0[11] = -var11 + (-var17 + (var3_double + var21));
            param0[3] = -var17 + (-var21 + (var3_double + var11));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pi.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final void a(double param0, double param1, double param2, byte param3, double param4) {
        double var10 = 0.0;
        double var12 = 0.0;
        param4 = param4 * 0.5;
        if (param3 != -20) {
          ((pi) this).field_d = 0.35249815946659313;
          var10 = Math.sin(param4);
          var12 = Math.cos(param4);
          ((pi) this).field_b = var12;
          ((pi) this).field_c = var10 * param2;
          ((pi) this).field_a = var10 * param1;
          ((pi) this).field_d = param0 * var10;
          return;
        } else {
          var10 = Math.sin(param4);
          var12 = Math.cos(param4);
          ((pi) this).field_b = var12;
          ((pi) this).field_c = var10 * param2;
          ((pi) this).field_a = var10 * param1;
          ((pi) this).field_d = param0 * var10;
          return;
        }
    }

    final void a(pi param0, int param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
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
            var3_double = -(((pi) this).field_c * param0.field_c) + (((pi) this).field_b * param0.field_b - param0.field_d * ((pi) this).field_d) - ((pi) this).field_a * param0.field_a;
            var5 = param0.field_c * ((pi) this).field_a + (((pi) this).field_b * param0.field_d + param0.field_b * ((pi) this).field_d) - param0.field_a * ((pi) this).field_c;
            var7 = ((pi) this).field_d * param0.field_a + (((pi) this).field_c * param0.field_b - ((pi) this).field_a * param0.field_d + param0.field_c * ((pi) this).field_b);
            ((pi) this).field_a = -(((pi) this).field_d * param0.field_c) + (param0.field_d * ((pi) this).field_c + param0.field_b * ((pi) this).field_a) + param0.field_a * ((pi) this).field_b;
            ((pi) this).field_b = var3_double;
            ((pi) this).field_d = var5;
            ((pi) this).field_c = var7;
            var9 = 23 % ((-63 - param1) / 61);
            this.a((byte) -75);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("pi.E(");
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
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        double var2 = 0.0;
        var2 = ((pi) this).field_c * ((pi) this).field_c + (((pi) this).field_d * ((pi) this).field_d + ((pi) this).field_b * ((pi) this).field_b) + ((pi) this).field_a * ((pi) this).field_a;
        if (0.999999999999 <= var2) {
          if (var2 <= 1.000000000001) {
            return;
          } else {
            var2 = 1.0 / Math.sqrt(var2);
            ((pi) this).field_a = ((pi) this).field_a * var2;
            ((pi) this).field_c = ((pi) this).field_c * var2;
            ((pi) this).field_b = ((pi) this).field_b * var2;
            ((pi) this).field_d = ((pi) this).field_d * var2;
            return;
          }
        } else {
          var2 = 1.0 / Math.sqrt(var2);
          ((pi) this).field_a = ((pi) this).field_a * var2;
          ((pi) this).field_c = ((pi) this).field_c * var2;
          ((pi) this).field_b = ((pi) this).field_b * var2;
          ((pi) this).field_d = ((pi) this).field_d * var2;
          return;
        }
    }

    public pi() {
        ((pi) this).field_b = 1.0;
    }

    final static String a(String param0, pf param1, String param2, int param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
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
        try {
          L0: {
            if (param1.a((byte) -36)) {
              stackOut_3_0 = param0 + " - " + param1.b((byte) 1) + "%";
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param2;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("pi.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 1 + ')');
        }
        return stackIn_4_0;
    }

    static {
    }
}
