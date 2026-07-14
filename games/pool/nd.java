/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd implements fp {
    static String field_g;
    private int field_o;
    private int field_n;
    private static int field_e;
    private int field_p;
    static ko field_i;
    private int field_f;
    private int field_d;
    private int field_k;
    static int field_j;
    static int field_m;
    static int field_l;
    static sj field_a;
    static String field_b;
    private lr field_h;
    static vh field_c;

    final static so a(int param0, eg param1, int[] param2) {
        if (param0 < 2) {
            return null;
        }
        so var3 = new so();
        var3.field_d = il.a((byte) 112, param2);
        var3.field_i = param1;
        uk.a(var3.field_d, -123, var3.field_i);
        return var3;
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 122 % ((-31 - param0) / 53);
        field_g = null;
        field_b = null;
        field_i = null;
        field_a = null;
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        va var13 = null;
        ei stackIn_3_0 = null;
        ei stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var12 = Pool.field_O;
          if (param4 instanceof va) {
            stackOut_2_0 = (ei) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ei) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = (va) (Object) stackIn_3_0;
          if (var13 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        qh.f(param1 - -param4.field_C, param3 - -param4.field_D, param4.field_l, param4.field_y, ((nd) this).field_n);
        var7 = -(2 * var13.field_Q) + param4.field_l;
        var8 = var13.field_Q + (param4.field_C + param1);
        var9 = param3 - (-param4.field_D - var13.field_R);
        qh.d(var8, var9, var7 + var8, var9, ((nd) this).field_p);
        var10 = 87 % ((param2 - 2) / 41);
        var11 = var13.g(0) + -1;
        L2: while (true) {
          if (-1 < (var11 ^ -1)) {
            L3: {
              if (null != ((nd) this).field_h) {
                ((nd) this).field_h.b(var13.field_m, var7 / 2 + var8, var9 + (((nd) this).field_h.field_G + var13.field_R), ((nd) this).field_o, ((nd) this).field_k);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            qh.a(var7 * var13.b((byte) -37, var11) / var13.f(0) + var8, var9, ((nd) this).field_f, ((nd) this).field_d);
            var11--;
            continue L2;
          }
        }
    }

    final static void b(byte param0) {
        db.field_Sb = lo.b(14);
        wd.field_Ub = new lq();
        if (param0 > -82) {
            field_i = null;
        }
        t.a(110, true, true);
    }

    final static void a(eg param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        L0: {
          var27 = Pool.field_O;
          d.a(param0, -23109);
          if (param1 == -37) {
            break L0;
          } else {
            nd.b((byte) 33);
            break L0;
          }
        }
        var2 = (param0.field_w + param0.field_D) / 2;
        var3 = (param0.field_S + param0.field_y) / 2;
        var4 = (param0.field_x + param0.field_V) / 2;
        var5 = 0;
        L1: while (true) {
          if (var5 >= param0.field_l) {
            param0.a();
            return;
          } else {
            L2: {
              var6 = param0.field_g[param0.field_p[var5]];
              var7 = param0.field_Y[param0.field_p[var5]];
              var8 = param0.field_q[param0.field_p[var5]];
              var9 = -var6 + param0.field_g[param0.field_H[var5]];
              var10 = -var7 + param0.field_Y[param0.field_H[var5]];
              var11 = -var8 + param0.field_q[param0.field_H[var5]];
              var12 = -var6 + param0.field_g[param0.field_C[var5]];
              var13 = -var7 + param0.field_Y[param0.field_C[var5]];
              var14 = param0.field_q[param0.field_C[var5]] + -var8;
              var15 = Math.sqrt((double)(var11 * var11 + var9 * var9 - -(var10 * var10)));
              var17 = Math.sqrt((double)(var12 * var12 - -(var13 * var13) + var14 * var14));
              var19 = (double)(var2 - var6);
              var21 = (double)(var3 + -var7);
              var23 = (double)(-var8 + var4);
              var25 = (int)Math.floor(((double)var11 * var23 + ((double)var9 * var19 + (double)var10 * var21)) / var15 / var15);
              var26 = (int)Math.floor(((double)var14 * var23 + (var21 * (double)var13 + var19 * (double)var12)) / var17 / var17);
              if (var25 != 0) {
                break L2;
              } else {
                if (var26 != 0) {
                  break L2;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
            L3: {
              if (0 != var25) {
                var7 = var7 + var10 * var25;
                var6 = var6 + var25 * var9;
                var8 = var8 + var11 * var25;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var26 != 0) {
                var6 = var6 + var26 * var12;
                var8 = var8 + var14 * var26;
                var7 = var7 + var26 * var13;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (kh.a(-3, param0, (int) param0.field_p[var5])) {
                param0.field_p[var5] = (short)param0.a(var6, var7, var8);
                break L5;
              } else {
                param0.field_g[param0.field_p[var5]] = var6;
                param0.field_Y[param0.field_p[var5]] = var7;
                param0.field_q[param0.field_p[var5]] = var8;
                break L5;
              }
            }
            L6: {
              if (!kh.a(-3, param0, (int) param0.field_p[var5])) {
                param0.field_g[param0.field_H[var5]] = var9 + var6;
                param0.field_Y[param0.field_H[var5]] = var7 + var10;
                param0.field_q[param0.field_H[var5]] = var8 - -var11;
                break L6;
              } else {
                param0.field_p[var5] = (short)param0.a(var6 + var9, var7 + var10, var8 + var11);
                break L6;
              }
            }
            if (!kh.a(-3, param0, (int) param0.field_p[var5])) {
              param0.field_g[param0.field_C[var5]] = var12 + var6;
              param0.field_Y[param0.field_C[var5]] = var7 + var13;
              param0.field_q[param0.field_C[var5]] = var14 + var8;
              var5++;
              continue L1;
            } else {
              param0.field_p[var5] = (short)param0.a(var6 + var12, var13 + var7, var8 + var14);
              var5++;
              continue L1;
            }
          }
        }
    }

    nd(lr param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((nd) this).field_h = param0;
        ((nd) this).field_k = param2;
        ((nd) this).field_d = param6;
        ((nd) this).field_p = param3;
        ((nd) this).field_o = param1;
        ((nd) this).field_n = param4;
        ((nd) this).field_f = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 1;
        field_g = "You have lost!";
        field_j = 1 << field_e;
        field_b = "Withdraw request to join <%0>'s game";
        field_i = new ko();
    }
}
