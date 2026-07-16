/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static uk field_c;
    double field_e;
    double field_b;
    double field_d;
    double field_a;

    final void a(ed param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        L0: {
          if (param1 == 65536) {
            break L0;
          } else {
            ((ed) this).a(true);
            break L0;
          }
        }
        var3 = -(((ed) this).field_e * param0.field_e) + (-(((ed) this).field_b * param0.field_b) + (((ed) this).field_a * param0.field_a - ((ed) this).field_d * param0.field_d));
        var5 = -(param0.field_e * ((ed) this).field_b) + (((ed) this).field_e * param0.field_b + (((ed) this).field_d * param0.field_a + param0.field_d * ((ed) this).field_a));
        var7 = ((ed) this).field_d * param0.field_e + (((ed) this).field_b * param0.field_a - ((ed) this).field_e * param0.field_d + ((ed) this).field_a * param0.field_b);
        ((ed) this).field_e = ((ed) this).field_b * param0.field_d + ((ed) this).field_e * param0.field_a - param0.field_b * ((ed) this).field_d + param0.field_e * ((ed) this).field_a;
        ((ed) this).field_b = var7;
        ((ed) this).field_d = var5;
        ((ed) this).field_a = var3;
        ((ed) this).a((byte) -126);
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = 60 / ((74 - param0) / 42);
    }

    final void a(byte param0) {
        double var2 = 0.0;
        L0: {
          if (param0 <= -120) {
            break L0;
          } else {
            ((ed) this).a((byte) -88);
            break L0;
          }
        }
        var2 = ((ed) this).field_e * ((ed) this).field_e + (((ed) this).field_b * ((ed) this).field_b + (((ed) this).field_a * ((ed) this).field_a + ((ed) this).field_d * ((ed) this).field_d));
        if (0.999999999999 <= var2) {
          if (1.000000000001 < var2) {
            var2 = 1.0 / Math.sqrt(var2);
            ((ed) this).field_d = ((ed) this).field_d * var2;
            ((ed) this).field_a = ((ed) this).field_a * var2;
            ((ed) this).field_b = ((ed) this).field_b * var2;
            ((ed) this).field_e = ((ed) this).field_e * var2;
            return;
          } else {
            return;
          }
        } else {
          var2 = 1.0 / Math.sqrt(var2);
          ((ed) this).field_d = ((ed) this).field_d * var2;
          ((ed) this).field_a = ((ed) this).field_a * var2;
          ((ed) this).field_b = ((ed) this).field_b * var2;
          ((ed) this).field_e = ((ed) this).field_e * var2;
          return;
        }
    }

    final void a(double param0, double param1, double param2, byte param3, double param4) {
        double var10 = 0.0;
        double var12 = 0.0;
        param4 = param4 * 0.5;
        var10 = Math.sin(param4);
        var12 = Math.cos(param4);
        ((ed) this).field_a = var12;
        ((ed) this).field_e = var10 * param2;
        ((ed) this).field_b = param1 * var10;
        ((ed) this).field_d = param0 * var10;
        if (param3 >= 40) {
          return;
        } else {
          ((ed) this).a(-0.2909420168175892, 1.7307005239419224, 1.1204517456254055, (byte) -67, 0.31408591430502103);
          return;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if (0 == (param1 & 7)) {
            break L0;
          } else {
            var2 = -(7 & param1) + 8;
            break L0;
          }
        }
        var3 = param1 - -var2;
        if (param0 != 72) {
          return 76;
        } else {
          return var3;
        }
    }

    final void a(int[] param0, byte param1) {
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
        L0: {
          var3 = ((ed) this).field_a * ((ed) this).field_a;
          var5 = ((ed) this).field_a * ((ed) this).field_d;
          var7 = ((ed) this).field_a * ((ed) this).field_b;
          var9 = ((ed) this).field_a * ((ed) this).field_e;
          var11 = ((ed) this).field_d * ((ed) this).field_d;
          var13 = ((ed) this).field_b * ((ed) this).field_d;
          var15 = ((ed) this).field_d * ((ed) this).field_e;
          if (param1 >= 112) {
            break L0;
          } else {
            ed.b((byte) -77);
            break L0;
          }
        }
        var17 = ((ed) this).field_b * ((ed) this).field_b;
        var19 = ((ed) this).field_e * ((ed) this).field_b;
        var21 = ((ed) this).field_e * ((ed) this).field_e;
        param0[10] = (int)((-var5 + var19 - var5 + var19) * 65536.0);
        param0[11] = (int)((-var11 + (-var17 + (var3 + var21))) * 65536.0);
        param0[5] = (int)((var15 + (-var7 + (var15 - var7))) * 65536.0);
        param0[4] = (int)((var9 + (var9 + var13 + var13)) * 65536.0);
        param0[8] = (int)(65536.0 * (var5 + (var19 + var5 + var19)));
        param0[6] = (int)((var13 - var9 - var9 + var13) * 65536.0);
        param0[7] = (int)((var3 + var17 - var11 - var21) * 65536.0);
        param0[9] = (int)((var15 + (var15 + var7) + var7) * 65536.0);
        param0[3] = (int)((-var21 + (var3 + var11) - var17) * 65536.0);
    }

    final static void a(int param0) {
        int var1 = 0;
        ik var2 = null;
        int var3 = 0;
        var3 = Torquing.field_u;
        var1 = 0;
        var2 = (ik) (Object) qc.field_Y.b(param0);
        L0: while (true) {
          if (var2 != null) {
            L1: {
              var2.a(-2857);
              if (!var2.e(17)) {
                var1++;
                break L1;
              } else {
                break L1;
              }
            }
            var2 = (ik) (Object) qc.field_Y.f(-24059);
            continue L0;
          } else {
            L2: while (true) {
              int incrementValue$4 = var1;
              var1--;
              if (0 < incrementValue$4) {
                sn.b((byte) 88);
                continue L2;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        ((ed) this).field_b = 0.0;
        if (!param0) {
          ((ed) this).field_d = 0.15882867363028105;
          ((ed) this).field_d = 0.0;
          ((ed) this).field_a = 1.0;
          ((ed) this).field_e = 0.0;
          return;
        } else {
          ((ed) this).field_d = 0.0;
          ((ed) this).field_a = 1.0;
          ((ed) this).field_e = 0.0;
          return;
        }
    }

    public ed() {
        ((ed) this).field_a = 1.0;
    }

    static {
    }
}
