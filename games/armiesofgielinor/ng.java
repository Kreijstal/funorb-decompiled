/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    private boolean field_x;
    private int field_q;
    private int field_r;
    private boolean field_c;
    private int field_k;
    private int field_d;
    private int[] field_b;
    private int field_f;
    private int field_z;
    static String field_s;
    private int field_h;
    private tu field_e;
    private int field_a;
    private String[] field_A;
    private int field_w;
    private int field_g;
    private int field_p;
    static int field_v;
    private int field_u;
    private boolean field_t;
    private int field_m;
    private wk[] field_l;
    private nb field_y;
    private nb field_n;
    private int[] field_j;
    private int field_o;
    private wk[] field_i;

    private final boolean q(int param0) {
        if (!(!this.s(4))) {
            return false;
        }
        if (param0 >= -20) {
            this.C(86);
        }
        if (!this.b((byte) -88)) {
            return true;
        }
        return false;
    }

    private final int k(int param0) {
        int var2 = ((ng) this).field_l[1].field_x;
        int var3 = ((ng) this).field_k + var2;
        if (param0 >= -47) {
            ((ng) this).field_x = true;
        }
        return var3;
    }

    public static void w(int param0) {
        field_s = null;
        if (param0 != 0) {
            field_v = -114;
        }
    }

    private final boolean h(int param0) {
        int var2 = ((ng) this).field_a;
        int var3 = ((ng) this).field_a - -((ng) this).field_d;
        if (!(qn.field_j <= var2)) {
            var3 = var3 + (qn.field_j + -var2);
            if (qn.field_e >= var3) {
                return true;
            }
            return false;
        }
        if (param0 != -2) {
            int discarded$0 = this.i(-95);
        }
        var3 = ((ng) this).field_d + ((ng) this).field_a;
        if (!(qn.field_e >= var3)) {
            var2 = var2 - (-qn.field_e + var3);
            return qn.field_j <= var2 ? true : false;
        }
        return true;
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 0;
          if (param0 >= 109) {
            break L0;
          } else {
            int discarded$2 = this.i(-54);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((ng) this).field_r) {
            return var2;
          } else {
            var4 = ((ng) this).field_A[var3];
            var5 = ((ng) this).field_e.a(var4);
            if (var2 < var5) {
              var2 = var5;
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final boolean d(boolean param0) {
        if (param0) {
            int discarded$0 = ((ng) this).a(5, (byte) 18, -39);
        }
        return ((ng) this).field_x;
    }

    final String a(byte param0, int param1) {
        int var3 = 77 % ((-25 - param0) / 56);
        return ((ng) this).field_A[param1];
    }

    final void e(int param0) {
        if (!((ng) this).field_x) {
            return;
        }
        this.B(7);
        this.a(param0 + -6812);
        if (param0 != 6815) {
            return;
        }
        this.e((byte) -8);
    }

    private final void t(int param0) {
        int var2 = this.o(114);
        int var3 = ((ng) this).field_e.a(' ') << 1773277345;
        int var4 = ((ng) this).field_l[3].field_A + ((ng) this).field_l[5].field_A;
        if (param0 != 0) {
            return;
        }
        int var5 = ((ng) this).field_n.c(param0 ^ 26787);
        ((ng) this).field_d = var2 + (var3 - -var5) + var4;
    }

    final void a(int param0, byte param1) {
        ((ng) this).field_o = param0;
        int var3 = -28 % ((-31 - param1) / 34);
    }

    private final void j(int param0) {
        int var2 = this.d((byte) -88);
        int var3 = this.i(1);
        if (param0 < 9) {
            boolean discarded$0 = this.s(-105);
        }
        int var4 = var3 / var2;
        ((ng) this).field_n.a(0, (byte) 47, var4, ((ng) this).field_r, 1);
        ((ng) this).field_m = ((ng) this).field_n.a(false);
        ((ng) this).field_z = ((ng) this).field_m - -((ng) this).field_n.a((byte) 102);
    }

    private final wk[] c(boolean param0) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = ((ng) this).field_i.length;
        wk[] var3 = new wk[var2];
        if (param0) {
            ((ng) this).field_l = null;
        }
        for (var4 = 0; var2 > var4; var4++) {
            var3[var4] = ((ng) this).field_i[var4].g();
            var3[var4].f();
        }
        return var3;
    }

    private final void a(boolean param0, boolean param1, byte param2, int param3) {
        ((ng) this).field_n.a(param0, param3, -2, param1);
        ((ng) this).field_y.a(param0, param3, -2, param1);
        this.a((byte) 116);
        if (param2 != 16) {
            return;
        }
        ((ng) this).field_c = false;
        if (!((ng) this).field_x) {
            return;
        }
        if (!((ng) this).field_t) {
            return;
        }
        if (!param0) {
            return;
        }
        if (((ng) this).field_u >= 0) {
            ((ng) this).field_o = ((ng) this).field_u;
            ((ng) this).field_c = true;
        }
    }

    final void a(byte param0, String[] param1) {
        ((ng) this).field_A = param1;
        int var3 = 54 % ((15 - param0) / 63);
        ((ng) this).field_o = 0;
        ((ng) this).field_r = ((ng) this).field_A.length;
        this.y(0);
        this.p(-101);
    }

    private final boolean s(int param0) {
        int var2 = ((ng) this).field_h;
        int var3 = ((ng) this).field_h + ((ng) this).field_g;
        if (qn.field_a > var2) {
            return false;
        }
        if (var3 > qn.field_f) {
            return false;
        }
        if (param0 != 4) {
            return true;
        }
        return true;
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 31127) {
          L0: {
            var4 = 0;
            if (!((ng) this).field_y.a(param1, -2, param2)) {
              if (((ng) this).field_n.a(param1, -2, param2)) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          }
          var4 = stackIn_8_0;
          return var4 != 0;
        } else {
          return true;
        }
    }

    final void l(int param0) {
        if (param0 != 0) {
            this.e((byte) 36);
        }
        ((ng) this).field_x = false;
    }

    private final void a(byte param0) {
        if (((ng) this).field_n.b(false)) {
            ((ng) this).field_m = ((ng) this).field_n.a(false);
            ((ng) this).field_z = ((ng) this).field_m + ((ng) this).field_n.a((byte) 76);
        }
        if (!(!((ng) this).field_y.b(false))) {
            ((ng) this).field_p = ((ng) this).field_y.a(false);
        }
        if (param0 <= 46) {
            return;
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        ((ng) this).field_f = ((ng) this).field_d;
        ((ng) this).field_q = ((ng) this).field_a;
        if (this.a(true)) {
            return;
        }
        if (param0 != 0) {
            this.e((byte) 127);
        }
        if (!(!this.h(-2))) {
            var2 = ((ng) this).field_a;
            var3 = ((ng) this).field_a - -((ng) this).field_d;
            if (var2 < qn.field_j) {
                var3 = var3 + (qn.field_j + -var2);
                if (qn.field_e >= var3) {
                    var2 = qn.field_j;
                    ((ng) this).field_f = var3 + -var2;
                    ((ng) this).field_q = var2;
                    return;
                }
            }
            var3 = ((ng) this).field_a - -((ng) this).field_d;
            if (var3 > qn.field_e) {
                var2 = var2 - (var3 + -qn.field_e);
                if (qn.field_j <= var2) {
                    ((ng) this).field_q = var2;
                    var3 = qn.field_e;
                    ((ng) this).field_f = -var2 + var3;
                    return;
                }
            }
        }
        ((ng) this).field_q = qn.field_j;
        ((ng) this).field_f = qn.field_e;
    }

    private final void a(byte param0, int param1, int param2) {
        ((ng) this).field_u = -1;
        if (((ng) this).field_t) {
            if (((ng) this).field_x) {
                ((ng) this).field_u = ((ng) this).a(param2, (byte) -128, param1);
            }
        }
        if (param0 != 58) {
            this.v(104);
        }
        ((ng) this).field_n.b(param2, param1, 0);
        ((ng) this).field_y.b(param2, param1, 0);
    }

    final boolean r(int param0) {
        int var2 = -57 / ((54 - param0) / 50);
        return ((ng) this).field_c;
    }

    private final void f(byte param0) {
        int var2 = this.n(-88);
        int var3 = this.k(-105) - -this.i(1);
        if (param0 <= 21) {
            return;
        }
        int var4 = this.E(1);
        ((ng) this).field_y.b(var3, -128, var2, var4);
    }

    private final int d(byte param0) {
        if (param0 >= -82) {
            ((ng) this).field_u = 47;
        }
        int var2 = ((ng) this).field_e.field_L + ((ng) this).field_e.field_H;
        int var3 = 4;
        int var4 = var3 + var2;
        return var4;
    }

    private final void p(int param0) {
        if (param0 > -16) {
            ((ng) this).field_g = -30;
        }
        this.C(-25621);
        this.j(96);
        this.z(1773277345);
    }

    final void e(boolean param0) {
        if (!param0) {
            ((ng) this).c(-121);
        }
        ((ng) this).field_t = false;
    }

    private final int i(int param0) {
        int var2 = this.k(-123);
        int var3 = ((ng) this).field_y.c(param0 + 26786);
        int var4 = ((ng) this).field_l[7].field_x;
        int var5 = -var3 + (-var4 + (((ng) this).field_k + ((ng) this).field_w));
        int var6 = -var2 + var5 + param0;
        return var6;
    }

    private final void B(int param0) {
        int var2 = ((ng) this).field_q;
        int var3 = ((ng) this).field_k;
        int var4 = ((ng) this).field_f;
        if (param0 != 7) {
            return;
        }
        int var5 = ((ng) this).field_w;
        if (!(((ng) this).field_n.c(false))) {
            var4 = var4 - ((ng) this).field_n.c(26787);
        }
        if (!(((ng) this).field_y.c(false))) {
            var5 = var5 - ((ng) this).field_y.c(26787);
        }
        qn.f(var2, var3, var4, var5, 7829367);
        i.a(((ng) this).field_l, var5, var2, (byte) -47, var3, var4);
    }

    private final void f(int param0) {
        int var2 = this.n(-91) + this.E(1);
        int var3 = this.k(-100);
        if (param0 <= 22) {
            ((ng) this).field_c = false;
        }
        int var4 = this.i(1);
        ((ng) this).field_n.b(var3, -125, var2, var4);
    }

    private final void z(int param0) {
        int var2 = 3;
        int var3 = this.E(1);
        int var4 = var3 / var2;
        ((ng) this).field_y.a(0, (byte) 47, ((ng) this).field_f, var3, var4);
        ((ng) this).field_p = ((ng) this).field_y.a(false);
        if (param0 != 1773277345) {
            ((ng) this).field_y = null;
        }
    }

    private final int n(int param0) {
        if (param0 >= -55) {
            ((ng) this).g(82);
        }
        int var2 = ((ng) this).field_l[3].field_A;
        int var3 = ((ng) this).field_q + var2;
        return var3;
    }

    final boolean D(int param0) {
        if (param0 <= 80) {
            ((ng) this).field_i = null;
        }
        return ((ng) this).field_t;
    }

    final static rn a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0.length();
        if (0 != var2) {
          if (64 >= var2) {
            if (param0.charAt(0) == 34) {
              if (param0.charAt(var2 - 1) != 34) {
                return ov.field_h;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 != 92) {
                      L1: {
                        if (var5 != 34) {
                          break L1;
                        } else {
                          if (var3 != 0) {
                            break L1;
                          } else {
                            return ov.field_h;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L2;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L2;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              if (param1 == 15026) {
                var3 = 0;
                var4 = 0;
                L3: while (true) {
                  if (var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 != 46) {
                      if (-1 == ud.field_Z.indexOf(var5)) {
                        return ov.field_h;
                      } else {
                        var3 = 0;
                        var4++;
                        continue L3;
                      }
                    } else {
                      L4: {
                        if (var4 == 0) {
                          break L4;
                        } else {
                          if (var2 - 1 == var4) {
                            break L4;
                          } else {
                            if (var3 != 0) {
                              break L4;
                            } else {
                              var3 = 1;
                              var4++;
                              continue L3;
                            }
                          }
                        }
                      }
                      return ov.field_h;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return el.field_e;
          }
        } else {
          return hv.field_N;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ng) this).field_h = param2;
        ((ng) this).field_a = param0;
        if (param1 <= 74) {
            boolean discarded$0 = this.A(74);
        }
        this.C(-25621);
    }

    final int u(int param0) {
        int var2 = -10 % ((37 - param0) / 33);
        return ((ng) this).field_r;
    }

    final static void a(dn param0, je param1, int[] param2, String param3, int param4, int param5, int param6, String param7, long param8) {
        int var10 = -119 % ((param5 - -47) / 32);
        pq.field_b = param0;
        tn.field_Z = new tg(param1, param8, param7, param3, param4, param6, param2);
    }

    private final boolean A(int param0) {
        if (!(!this.a(true))) {
            return false;
        }
        if (param0 != 0) {
            boolean discarded$0 = this.h(52);
        }
        if (!this.h(-2)) {
            return true;
        }
        return false;
    }

    final static void b(boolean param0) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        wk var1 = new wk(540, 140);
        vn.a(var1, 3);
        if (!param0) {
            ng.w(33);
        }
        tm.a();
        qn.b();
        ib.field_j = 0;
        rb.e(9);
        wk var2 = var1.g();
        for (var3 = 0; 15 > var3; var3++) {
            var2.a(-2, -2, 16777215);
            qn.c(4, 4, 0, 0, 540, 140);
        }
        kq.field_P.b();
        var1.h(0, 0);
        rf.b(-18862);
    }

    private final void e(byte param0) {
        if (!(!((ng) this).field_n.c(false))) {
            ((ng) this).field_n.f(0);
        }
        if (((ng) this).field_y.c(false)) {
            ((ng) this).field_y.f(0);
        }
        if (param0 != -8) {
            return;
        }
    }

    private final int E(int param0) {
        int var2 = this.n(-128);
        int var3 = ((ng) this).field_n.c(26787);
        int var4 = ((ng) this).field_l[5].field_A;
        int var5 = -var3 + -var4 + (((ng) this).field_q - -((ng) this).field_f);
        int var6 = -var2 + (var5 + param0);
        return var6;
    }

    final void g(int param0) {
        ((ng) this).field_t = true;
        int var2 = -49 % ((param0 - 31) / 52);
    }

    private final void C(int param0) {
        this.c((byte) -4);
        this.m(0);
        this.f(param0 ^ -25718);
        if (param0 != -25621) {
            return;
        }
        this.f((byte) 120);
    }

    final int b(int param0) {
        int var2 = -62 % ((param0 - -13) / 45);
        return ((ng) this).field_o;
    }

    final void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (param3 != 0) {
            field_s = null;
        }
        this.C(param3 + -25621);
        this.v(-1);
        this.a((byte) 58, param4, param0);
        this.a(param2, param1, (byte) 16, param5);
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ((ng) this).field_k = ((ng) this).field_h;
        ((ng) this).field_w = ((ng) this).field_g;
        if (this.s(param0 ^ -8)) {
            return;
        }
        if (!(!this.b((byte) -105))) {
            var2 = ((ng) this).field_h;
            var3 = ((ng) this).field_g + ((ng) this).field_h;
            if (!(qn.field_a <= var2)) {
                var3 = var3 + (-var2 + qn.field_a);
                if (!(qn.field_f < var3)) {
                    var2 = qn.field_a;
                    ((ng) this).field_k = var2;
                    ((ng) this).field_w = var3 + -var2;
                    return;
                }
            }
            var3 = ((ng) this).field_h - -((ng) this).field_g;
            if (!(qn.field_f >= var3)) {
                var2 = var2 - (-qn.field_f + var3);
                if (!(qn.field_a > var2)) {
                    var3 = qn.field_f;
                    ((ng) this).field_k = var2;
                    ((ng) this).field_w = var3 - var2;
                    return;
                }
            }
        }
        if (param0 != -4) {
            return;
        }
        ((ng) this).field_w = qn.field_f;
        ((ng) this).field_k = qn.field_a;
    }

    private final boolean a(boolean param0) {
        int var2 = ((ng) this).field_a;
        if (!param0) {
            return true;
        }
        int var3 = ((ng) this).field_a - -((ng) this).field_d;
        if (qn.field_j > var2) {
            return false;
        }
        if (qn.field_e < var3) {
            return false;
        }
        return true;
    }

    private final void a(int param0) {
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = this.k(param0 + -100);
        if (param0 != 3) {
            return;
        }
        int var3 = var2 + this.i(param0 ^ 2);
        int var4 = this.n(-116);
        int var5 = var4 - -this.E(1);
        int var6 = ((ng) this).field_p;
        qn.b(((ng) this).field_j);
        qn.b(var4, var2, var5, var3);
        var4 = -var6 + var4;
        var2 = var2 - -((ng) this).field_e.field_H;
        int var7 = this.d((byte) -85);
        for (var8 = ((ng) this).field_m; ((ng) this).field_z > var8; var8++) {
            var9 = ((ng) this).field_A[var8];
            var10 = ((ng) this).field_b[0];
            if (!(var8 != ((ng) this).field_u)) {
                var10 = ((ng) this).field_b[1];
            }
            ((ng) this).field_e.b(var9, var4, var2, var10, -1);
            var2 = var2 + var7;
        }
        qn.a(((ng) this).field_j);
    }

    final static void x(int param0) {
        qf.field_e = null;
        mb.field_F = null;
        ed.field_e = null;
        if (jl.field_b != null) {
            qj.field_z = jl.field_b;
            rb.field_b = ew.field_d;
            qj.field_z.field_W = -1;
            qj.field_z.field_T = -1;
            jl.field_b = null;
            ew.field_d = null;
        }
        eu.field_g = null;
        hf.field_c = true;
        sb.field_i = null;
        int var1 = 89 % ((param0 - -51) / 39);
    }

    final static void a(wk param0, int param1, wk param2) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ds.field_a = new wk[op.field_c[param1].length];
        le.field_c = new wk[op.field_c[0].length];
        vo.field_d = param0;
        im.field_y = param2;
        for (var3 = 0; op.field_c[0].length > var3; var3++) {
            ds.field_a[var3] = new wk(vo.field_d.field_y, vo.field_d.field_v);
            le.field_c[var3] = new wk(im.field_y.field_y, im.field_y.field_v);
            ds.field_a[var3].b();
            vo.field_d.d(0, 0, op.field_c[0][var3]);
            le.field_c[var3].b();
            im.field_y.b(0, 0, op.field_c[0][var3]);
        }
    }

    final void c(int param0) {
        ((ng) this).field_x = true;
        if (param0 <= 25) {
            return;
        }
    }

    private final void y(int param0) {
        this.d(124);
        this.t(param0);
    }

    private final void v(int param0) {
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((ng) this).field_x) {
            return;
        }
        if (!(((ng) this).field_t)) {
            return;
        }
        if (!this.A(0)) {
            ((ng) this).field_y.b((byte) -65);
        } else {
            ((ng) this).field_y.d(-97);
        }
        if (param0 != -1) {
            boolean discarded$0 = this.s(100);
        }
        if (!this.q(-87)) {
            ((ng) this).field_n.b((byte) -65);
        } else {
            ((ng) this).field_n.d(-124);
        }
    }

    ng(wk[] param0, wk[] param1, tu param2, int[] param3, String[] param4, int param5, int param6) {
        ((ng) this).field_e = param2;
        ((ng) this).field_b = param3;
        ((ng) this).field_i = param1;
        ((ng) this).field_l = param0;
        ((ng) this).field_n = new nb(((ng) this).field_i, ((ng) this).field_b, 1);
        wk[] var9 = this.c(false);
        ((ng) this).field_y = new nb(var9, ((ng) this).field_b, 0);
        ((ng) this).a((byte) 87, param4);
        ((ng) this).a(param5, 94, param6);
        ((ng) this).g(98);
        ((ng) this).l(0);
        ((ng) this).field_j = new int[4];
    }

    private final boolean b(byte param0) {
        int var2 = ((ng) this).field_h;
        int var4 = 40 / ((param0 - 15) / 45);
        int var3 = ((ng) this).field_h + ((ng) this).field_g;
        if (!(var2 >= qn.field_a)) {
            var3 = var3 + (-var2 + qn.field_a);
            if (var3 > qn.field_f) {
                return false;
            }
            return true;
        }
        var3 = ((ng) this).field_g + ((ng) this).field_h;
        if (qn.field_f < var3) {
            var2 = var2 - (var3 + -qn.field_f);
            if (qn.field_a <= var2) {
                return true;
            }
            return false;
        }
        return true;
    }

    final int a(int param0, byte param1, int param2) {
        int var9 = 0;
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = this.n(-60);
        int var5 = this.k(-101);
        int var6 = this.d((byte) -111);
        int var8 = -30 / ((param1 - -89) / 32);
        int var7 = this.E(1);
        for (var9 = ((ng) this).field_m; ((ng) this).field_z > var9; var9++) {
            if (mo.a(param0, var4, var5, param2, var7, (byte) -101, var6)) {
                return var9;
            }
            var5 = var5 + var6;
        }
        return -1;
    }

    private final void d(int param0) {
        int var2 = this.d((byte) -111);
        int var3 = ((ng) this).field_r * var2;
        if (param0 < 118) {
            ((ng) this).field_y = null;
        }
        int var4 = ((ng) this).field_l[1].field_x - -((ng) this).field_l[7].field_x;
        int var5 = ((ng) this).field_y.c(26787);
        ((ng) this).field_g = var3 + var4 + var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Spells to harm groups of units.";
    }
}
