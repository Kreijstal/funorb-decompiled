/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    double field_c;
    double field_d;
    double field_a;
    double field_b;

    final static void a(boolean param0) {
        if (ei.field_G == null) {
          pd.field_e = new lj();
          if (param0) {
            return;
          } else {
            sf.field_f.b((rj) (Object) pd.field_e, 23143);
            return;
          }
        } else {
          ei.field_G.o(3);
          pd.field_e = new lj();
          if (param0) {
            return;
          } else {
            sf.field_f.b((rj) (Object) pd.field_e, 23143);
            return;
          }
        }
    }

    final void a(double[] param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        var3 = ((pi) this).field_b * ((pi) this).field_b;
        var5 = ((pi) this).field_b * ((pi) this).field_d;
        var7 = ((pi) this).field_b * ((pi) this).field_c;
        var9 = ((pi) this).field_b * ((pi) this).field_a;
        var11 = ((pi) this).field_d * ((pi) this).field_d;
        var13 = ((pi) this).field_d * ((pi) this).field_c;
        var15 = ((pi) this).field_a * ((pi) this).field_d;
        if (param1 != 8) {
          ((pi) this).field_c = 1.09697255862232;
          var17 = ((pi) this).field_c * ((pi) this).field_c;
          var19 = ((pi) this).field_a * ((pi) this).field_c;
          var21 = ((pi) this).field_a * ((pi) this).field_a;
          param0[7] = var3 + var17 - var11 - var21;
          param0[10] = -var5 + (var19 - var5) + var19;
          param0[5] = var15 + (-var7 + var15 - var7);
          param0[6] = var13 + (-var9 + (-var9 + var13));
          param0[4] = var9 + (var13 + (var9 + var13));
          param0[9] = var15 + var7 + var15 + var7;
          param0[8] = var19 + (var5 + var19) + var5;
          param0[11] = -var11 + (-var17 + (var3 + var21));
          param0[3] = -var17 + (-var21 + (var3 + var11));
          return;
        } else {
          var17 = ((pi) this).field_c * ((pi) this).field_c;
          var19 = ((pi) this).field_a * ((pi) this).field_c;
          var21 = ((pi) this).field_a * ((pi) this).field_a;
          param0[7] = var3 + var17 - var11 - var21;
          param0[10] = -var5 + (var19 - var5) + var19;
          param0[5] = var15 + (-var7 + var15 - var7);
          param0[6] = var13 + (-var9 + (-var9 + var13));
          param0[4] = var9 + (var13 + (var9 + var13));
          param0[9] = var15 + var7 + var15 + var7;
          param0[8] = var19 + (var5 + var19) + var5;
          param0[11] = -var11 + (-var17 + (var3 + var21));
          param0[3] = -var17 + (-var21 + (var3 + var11));
          return;
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
        double var3 = -(((pi) this).field_c * param0.field_c) + (((pi) this).field_b * param0.field_b - param0.field_d * ((pi) this).field_d) - ((pi) this).field_a * param0.field_a;
        double var5 = param0.field_c * ((pi) this).field_a + (((pi) this).field_b * param0.field_d + param0.field_b * ((pi) this).field_d) - param0.field_a * ((pi) this).field_c;
        double var7 = ((pi) this).field_d * param0.field_a + (((pi) this).field_c * param0.field_b - ((pi) this).field_a * param0.field_d + param0.field_c * ((pi) this).field_b);
        ((pi) this).field_a = -(((pi) this).field_d * param0.field_c) + (param0.field_d * ((pi) this).field_c + param0.field_b * ((pi) this).field_a) + param0.field_a * ((pi) this).field_b;
        ((pi) this).field_b = var3;
        ((pi) this).field_d = var5;
        ((pi) this).field_c = var7;
        int var9 = 23 % ((-63 - param1) / 61);
        this.a((byte) -75);
    }

    private final void a(byte param0) {
        double var2 = 0.0;
        if (param0 < -10) {
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
        } else {
          ((pi) this).field_a = -0.5088910191033775;
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
    }

    public pi() {
        ((pi) this).field_b = 1.0;
    }

    final static String a(String param0, pf param1, String param2, int param3) {
        Object var5 = null;
        if (param1.a((byte) -36)) {
          if (param3 != 1) {
            var5 = null;
            String discarded$2 = pi.a((String) null, (pf) null, (String) null, 1);
            return param0 + " - " + param1.b((byte) 1) + "%";
          } else {
            return param0 + " - " + param1.b((byte) 1) + "%";
          }
        } else {
          return param2;
        }
    }

    static {
    }
}
