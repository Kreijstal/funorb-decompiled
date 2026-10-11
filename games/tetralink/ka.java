/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka extends hm {
    static String[] field_g;
    static String field_i;
    private long field_j;
    static af field_l;
    static String field_m;
    static double[] field_h;
    private String field_k;

    final void a(int param0, bh param1) {
        try {
          param1.a(-1, this.field_j);
          param1.a((byte) -127, this.field_k);
          if (param0 != -22017) {
            ka.a(-61, '￶');
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ka.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_13_0 = false;
        if (param0 != 65) {
          ka.b((byte) -100);
        }
        stackIn_13_0 = ((!(param1 < 48) &&
          !(57 < param1)) ||
          (!(65 > param1) &&
          !(param1 > 90)) ||
          (!(97 > param1) &&
          !(param1 > 122)));
        return stackIn_13_0;
    }

    final static void c(int param0) {
        jl.field_b = null;
        me.field_d = false;
        ah.field_j = null;
        fi.field_Ab = null;
        if (param0 < 76) {
          ka.c((byte) 76);
        }
        qc.field_db = null;
    }

    final static void b(int param0) {
        int stackIn_44_0 = 0;
        ei stackIn_63_0 = null;
        ei stackIn_67_0 = null;
        double stackIn_67_1 = 0.0;
        boolean stackIn_68_2 = false;
        double stackIn_70_3;
        boolean stackIn_71_4;
        int var1;
        double var2_double;
        ei var2;
        int var3;
        double var4;
        double var6;
        int var8;
        double var4Lifetime1;
        double var6Lifetime1;
        var8 = TetraLink.field_J;
        if (0 == ko.field_s &&
          !ud.c(false) &&
          !pj.b((byte) 90) &&
          !dg.c(-70)) {
          if (tm.field_t != 0 &&
            ed.field_O == 10) {
            bb.a(param0 ^ 4, true);
          }
          if (tm.field_t != 0) {
            dd.field_a = ed.a((byte) 101, ci.field_B, li.field_o);
            if (dd.field_a == 0 &&
              wk.field_u != 0) {
              if (2 > qe.field_g) {
                qe.field_g = oi.field_c;
              } else {
                qe.field_g = 0;
              }
              wb.a(qb.a(kb.field_t, (byte) 114), param0 ^ -7865);
            } else {
              if (wk.field_u == 2 &&
                5 == dd.field_a) {
                sa.a(-107, true);
              }
            }
          }
          if (param0 != 4) {
            return;
          }
          dd.field_a = ed.a((byte) 101, aa.field_Nb, a.field_a);
          if (ho.field_X != 0 &&
            wk.field_u == 2) {
            if (1 != dd.field_a) {
              if (dd.field_a != 2) {
                if (3 != dd.field_a) {
                  if (dd.field_a == 4) {
                    ca.a(-8.0f, 0.0f, -2452);
                  }
                } else {
                  ca.a(8.0f, 0.0f, param0 ^ -2456);
                }
              } else {
                ca.a(0.0f, -0.029999999329447746f, -2452);
              }
            } else {
              ca.a(0.0f, 0.029999999329447746f, -2452);
            }
          }
          if (ed.field_O == kb.field_t &&
            ~hm.field_a == ~af.field_h &&
            kb.field_t != 10 &&
            -1 == dd.field_a) {
            stackIn_44_0 = 0;
          } else {
            stackIn_44_0 = 1;
          }
          var1 = stackIn_44_0;
          if (wk.field_i.field_c) {
            var2_double = (double)(-(ra.field_f >> 1) + aa.field_Nb) / 512.0;
            var4 = (double)(a.field_a - ik.field_a) / 512.0;
            var6 = -field_h[2] / (var2_double * field_h[5] + var4 * field_h[8] + field_h[11]);
            wh.field_c = (var6 * (field_h[9] + (var4 * field_h[6] + field_h[3] * var2_double)) + field_h[0]) * 4.0;
            if (!(0.0 > field_h[11])) {
              wh.field_c = 320.0 + wh.field_c;
            } else {
              wh.field_c = 320.0 - wh.field_c;
            }
            ua.field_i = (double)(440 - (ra.field_e >> 1)) + 4.0 * (field_h[1] + (field_h[10] + (field_h[7] * var4 + field_h[4] * var2_double)) * var6);
            if (oj.field_a.field_z > a.field_a) {
              if ((2 == ho.field_X ||
                sn.field_a[81]) &&
                (ab.field_T != -1 &&
                aa.field_Nb != -1)) {
                ca.a(0.0f, 0.004999999888241291f * (float)(-ab.field_T + aa.field_Nb), -2452);
              }
              if (hc.field_p != 0) {
                ca.a((float)(hc.field_p * 24), 0.0f, -2452);
              }
            }
          } else {
            ua.field_i = (double)(200 + (-ik.field_a + a.field_a));
            wh.field_c = (double)aa.field_Nb;
          }
          if (null == aa.field_bc) {
            stackIn_63_0 = ud.field_Qb;
          } else {
            stackIn_63_0 = aa.field_bc;
          }
          var2 = stackIn_63_0;
          if (var2 != null) {
            stackIn_67_0 = var2;
            stackIn_67_1 = ua.field_i;
            stackIn_68_2 = (!(0.0 > field_h[11])) ? false : true;
            stackIn_70_3 = wh.field_c;
            stackIn_71_4 = (-1 != kb.field_t) ? false : true;
            ((ei) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_68_2, stackIn_70_3, stackIn_71_4, (byte) -115, var1 != 0, ho.field_X, tm.field_t);
          }
          if (fd.a(kb.field_t, (byte) 99)) {
            kk.field_X[kb.field_t].a(var1 != 0, ua.field_i, tm.field_t, wh.field_c, tm.field_t, -128);
          }
          if (qd.field_T &&
            wk.field_i.field_d &&
            ab.field_T != -1 &&
            aa.field_Nb != -1) {
            if (a.field_a == -1) {
              ab.field_T = aa.field_Nb;
              wh.field_i = a.field_a;
              return;
            }
            var3 = Math.abs(aa.field_Nb - ab.field_T) + Math.abs(a.field_a - wh.field_i);
            var4Lifetime1 = wh.field_c;
            var6Lifetime1 = ua.field_i;
            if (var4Lifetime1 > 110.0 &&
              var4Lifetime1 < 530.0 &&
              0.0 < var6Lifetime1 &&
              400.0 > var6Lifetime1) {
              eg.field_J.a(new ko((int)(16.0 * var4Lifetime1), (int)(var6Lifetime1 * 16.0), Math.min(wk.field_i.field_h, wk.field_i.field_i + var3 * wk.field_i.field_p)), false);
            }
          }
          ab.field_T = aa.field_Nb;
          wh.field_i = a.field_a;
          return;
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_g = null;
        field_i = null;
        if (param0 != 86) {
          ka.a(-23, 'ﾵ');
        }
        field_m = null;
        field_h = null;
    }

    df a(byte param0) {
        if (param0 >= -77) {
          this.field_k = (String) null;
        }
        return qf.field_h;
    }

    final static String c(byte param0) {
        if (ma.field_d == ll.field_C) {
          return ek.field_s;
        }
        int var1 = -115 % ((-27 - param0) / 33);
        return ll.field_w;
    }

    ka(long param0, String param1) {
        try {
          this.field_k = param1;
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ka.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Passwords must be between 5 and 20 characters long";
        field_g = new String[]{"By rating", "By win percentage"};
        field_l = new af();
    }
}
