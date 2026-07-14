/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iia extends jm {
    static int field_p;
    static sna field_m;
    static String field_o;
    private int field_r;
    static String field_q;
    static String field_n;

    final void a(boolean param0, op param1) {
        if (param0) {
          field_q = null;
          param1.field_S[((iia) this).field_r].field_c = true;
          return;
        } else {
          param1.field_S[((iia) this).field_r].field_c = true;
          return;
        }
    }

    final void a(ub param0, int param1) {
        gj var3 = null;
        gj var4 = null;
        var4 = param0.field_o;
        var3 = var4;
        if (param1 > -2) {
          return;
        } else {
          var4.field_T[((iia) this).field_r] = 0;
          ((iia) this).a(false, var3.field_h);
          return;
        }
    }

    iia(int param0) {
        ((iia) this).field_j = 0;
        ((iia) this).field_r = param0;
    }

    final static void a(int param0, vr param1) {
        le var2 = null;
        var2 = le.a(param1, "", "fridge4");
        if (param0 != -167571320) {
          return;
        } else {
          ni.field_l = (ss) (Object) var2.a(0, 485, 0, -5120, 12800);
          ni.field_l.a(128, 122, 128);
          return;
        }
    }

    final static void a(byte param0, int param1, int param2, kv param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = BachelorFridge.field_y;
          var6 = (-param2 + param4 << 1118039656) / param3.field_n;
          param5 = param5 + param3.field_t;
          param1 = param1 + param3.field_u;
          var7 = (param2 << 218447976) + param3.field_t * var6;
          var8 = param1 * dg.field_i + param5;
          var9 = 0;
          var10 = param3.field_p;
          var12 = 41 % ((61 - param0) / 61);
          var11 = param3.field_q;
          var13 = -var11 + dg.field_i;
          if (param1 >= dg.field_j) {
            break L0;
          } else {
            var15 = dg.field_j - param1;
            var9 = var9 + var11 * var15;
            param1 = dg.field_j;
            var8 = var8 + dg.field_i * var15;
            var10 = var10 - var15;
            break L0;
          }
        }
        L1: {
          var14 = 0;
          if (param5 < dg.field_f) {
            var15 = -param5 + dg.field_f;
            var7 = var7 + var15 * var6;
            var13 = var13 + var15;
            var14 = var14 + var15;
            var8 = var8 + var15;
            param5 = dg.field_f;
            var11 = var11 - var15;
            var9 = var9 + var15;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (dg.field_k >= var10 + param1) {
            break L2;
          } else {
            var10 = var10 - (-dg.field_k + (param1 - -var10));
            break L2;
          }
        }
        L3: {
          if (dg.field_h < var11 + param5) {
            var15 = var11 + param5 - dg.field_h;
            var11 = var11 - var15;
            var13 = var13 + var15;
            var14 = var14 + var15;
            break L3;
          } else {
            break L3;
          }
        }
        if (var11 > 0) {
          if (var10 >= -1) {
            return;
          } else {
            param1 = -var10;
            L4: while (true) {
              if (-1 >= param1) {
                return;
              } else {
                var15 = var7;
                param5 = -var11;
                L5: while (true) {
                  if (-1 <= param5) {
                    var8 = var8 + var13;
                    var9 = var9 + var14;
                    param1++;
                    continue L4;
                  } else {
                    var16 = var15 >> -167571320;
                    var15 = var15 + var6;
                    var17 = -var16 + 256;
                    if (var16 >= 0) {
                      var9++;
                      var18 = param3.field_v[var9];
                      if (var18 != 0) {
                        if ((var16 ^ -1) < -256) {
                          dg.field_e[var8] = var18;
                          var8++;
                          param5++;
                          continue L5;
                        } else {
                          var19 = dg.field_e[var8];
                          var20 = (16711935 & var18) * var16 + (16711935 & var19) * var17 >> 1314859432 & 16711935;
                          dg.field_e[var8] = var20 - -dda.a(var17 * dda.a(65280, var19) + var16 * dda.a(var18, 65280) >> -677565880, 65280);
                          var8++;
                          param5++;
                          continue L5;
                        }
                      } else {
                        var8++;
                        param5++;
                        continue L5;
                      }
                    } else {
                      var8++;
                      var9++;
                      param5++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(pia param0, int param1) {
        hl.field_C = param0;
        int var2 = 1000;
        int var3 = 6 + (hl.field_C.field_F - -hl.field_C.field_B);
        if (!((1 & var3) != param1)) {
            var3++;
        }
        cea.field_i = new kv(var2, var3);
        oa.field_Bb = new kv(var2, var3);
    }

    iia(lu param0) {
        ((iia) this).field_j = 0;
        ((iia) this).field_r = param0.b(16711935);
    }

    final void b(lu param0, byte param1) {
        int var3 = -120 / ((37 - param1) / 38);
        param0.d(((iia) this).field_r, 0);
    }

    public static void a(int param0) {
        field_o = null;
        field_n = null;
        field_q = null;
        field_m = null;
        if (param0 != 1314859432) {
            field_q = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Accept rematch";
        field_n = "Owner";
        field_q = "To <%0>: ";
    }
}
