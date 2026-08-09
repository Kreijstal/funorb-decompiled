/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    private int[] field_i;
    sk field_k;
    private wk[] field_f;
    private int field_c;
    static pf field_j;
    private ia field_d;
    private ia field_a;
    private r[] field_l;
    private tu field_m;
    private ia field_h;
    static String field_g;
    static String field_e;
    private wk[] field_b;

    private final void b(byte param0) {
        this.field_d = new ia(this.field_b, this.field_m, this.field_i, "Attacker", 0, 0);
        this.field_h = new ia(this.field_b, this.field_m, this.field_i, "Defender", 0, 0);
        this.field_a = new ia(this.field_b, this.field_m, this.field_i, "Run Attack", 0, 0);
        this.field_l = new r[6];
        this.field_l[0] = new r(this.field_b, this.field_f, this.field_m, this.field_i, af.field_a, 0, 0);
        this.field_l[1] = new r(this.field_b, this.field_f, this.field_m, this.field_i, af.field_a, 0, 0);
        this.field_l[2] = new r(this.field_b, this.field_f, this.field_m, this.field_i, ts.field_d, 0, 0);
        this.field_l[3] = new r(this.field_b, this.field_f, this.field_m, this.field_i, ts.field_d, 0, 0);
        this.field_l[4] = new r(this.field_b, this.field_f, this.field_m, this.field_i, hm.field_i, 0, 0);
        if (param0 != -49) {
            this.field_a = (ia) null;
        }
        this.field_l[5] = new r(this.field_b, this.field_f, this.field_m, this.field_i, hm.field_i, 0, 0);
    }

    private final int a(int param0, byte param1) {
        if (-1 == (param0 ^ -1)) {
            return this.field_d.c(-29408);
        }
        if (param1 != -42) {
            field_j = (pf) null;
        }
        if (!(-2 != (param0 ^ -1))) {
            return this.field_l[0].n(-18332);
        }
        if (!(-3 != (param0 ^ -1))) {
            return this.field_l[2].n(-18332);
        }
        if (!(param0 != 3)) {
            return this.field_h.c(-29408);
        }
        if (!(4 != param0)) {
            return this.field_l[1].n(-18332);
        }
        if (!(-6 != (param0 ^ -1))) {
            return this.field_l[3].n(-18332);
        }
        if (!(6 != param0)) {
            return this.field_a.c(-29408);
        }
        if (-8 == (param0 ^ -1)) {
            return this.field_l[4].n(-18332);
        }
        if (param0 != 8) {
            return 0;
        }
        return this.field_l[5].n(-18332);
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (this.field_l.length <= var2) {
            var4 = 0;
            var2 = var4;
            L1: while (true) {
              if (var4 >= this.field_l.length) {
                return;
              } else {
                if (this.field_l[var4].g((byte) 97)) {
                  this.field_l[var4].f((byte) -55);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            if (!this.field_l[var2].g((byte) 97)) {
              this.field_l[var2].f((byte) 124);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (!(-1 != (param2 ^ -1))) {
            this.field_d.a(param3, (byte) 55, param0);
        }
        if (param2 == 1) {
            this.field_l[0].e(-84, param0, param3);
        }
        if (!(param2 != 2)) {
            this.field_l[2].e(-71, param0, param3);
        }
        if (!(param2 != 3)) {
            this.field_h.a(param3, (byte) 127, param0);
        }
        if (param2 == 4) {
            this.field_l[1].e(-59, param0, param3);
        }
        if (param1 > -41) {
            this.a(-21);
        }
        if ((param2 ^ -1) == -6) {
            this.field_l[3].e(87, param0, param3);
        }
        if ((param2 ^ -1) == -7) {
            this.field_a.a(param3, (byte) 107, param0);
        }
        if (!((param2 ^ -1) != -8)) {
            this.field_l[4].e(-57, param0, param3);
        }
        if (!(param2 != 8)) {
            this.field_l[5].e(-87, param0, param3);
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        jd stackIn_24_0;
        jd stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        jd stackIn_25_0 = null;
        jd stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        jd stackIn_27_0;
        jd stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        jd stackIn_28_0 = null;
        jd stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        jd var18;
        jd var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        var24 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a((byte) -121, param2, param4);
        var7 = param5 ? 1 : 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= this.field_l.length) {
            L1: {
              if (var7 == 0) {
                break L1;
              } else {
                this.c((byte) -95);
                break L1;
              }
            }
            L2: {
              if (!this.field_a.a(param4, 0, param2)) {
                break L2;
              } else {
                if (!param0) {
                  break L2;
                } else {
                  L3: {
                    var8 = this.field_l[0].h(5);
                    var9 = this.field_l[1].h(5);
                    var10 = this.field_l[2].h(5);
                    var11 = this.field_l[3].h(5);
                    var12 = 0;
                    var13 = 0;
                    if (75 != var9) {
                      break L3;
                    } else {
                      var9 = 34;
                      var12 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (-77 == (var9 ^ -1)) {
                      var12 = 1;
                      var9 = 7;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var8 ^ -1) == -76) {
                      var8 = 34;
                      var13 = 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-77 != (var8 ^ -1)) {
                      break L6;
                    } else {
                      var13 = 1;
                      var8 = 7;
                      break L6;
                    }
                  }
                  L7: {
                    var14 = bw.field_m[var8][4];
                    var15 = var14 / (1 + this.field_l[4].h(5));
                    var16 = bw.field_m[var9][4];
                    var17 = var16 / (1 + this.field_l[5].h(5));
                    if (var15 == 0) {
                      var15++;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var17 != 0) {
                      break L8;
                    } else {
                      var17++;
                      break L8;
                    }
                  }
                  L9: {
                    stackIn_24_0 = null;

                    stackIn_24_1 = null;

                    stackIn_24_2 = 0;

                    stackIn_24_3 = 0;

                    stackIn_24_4 = var8;

                    stackIn_24_5 = 0;

                    stackIn_24_6 = var14;

                    stackIn_24_7 = var15;

                    if (var13 == 0) {
                      stackIn_25_0 = null;
                      stackIn_25_1 = null;
                      stackIn_25_2 = stackIn_24_2;
                      stackIn_25_3 = stackIn_24_3;
                      stackIn_25_4 = stackIn_24_4;
                      stackIn_25_5 = stackIn_24_5;
                      stackIn_25_6 = stackIn_24_6;
                      stackIn_25_7 = stackIn_24_7;
                      stackIn_25_8 = 0;
                      break L9;
                    } else {
                      stackIn_25_0 = null;
                      stackIn_25_1 = null;
                      stackIn_25_2 = stackIn_24_2;
                      stackIn_25_3 = stackIn_24_3;
                      stackIn_25_4 = stackIn_24_4;
                      stackIn_25_5 = stackIn_24_5;
                      stackIn_25_6 = stackIn_24_6;
                      stackIn_25_7 = stackIn_24_7;
                      stackIn_25_8 = 8;
                      break L9;
                    }
                  }
                  L10: {
                    var18 = new jd(stackIn_25_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                    stackIn_27_0 = null;

                    stackIn_27_1 = null;

                    stackIn_27_2 = 0;

                    stackIn_27_3 = 0;

                    stackIn_27_4 = var9;

                    stackIn_27_5 = 0;

                    stackIn_27_6 = var16;

                    stackIn_27_7 = var17;

                    if (var12 == 0) {
                      stackIn_28_0 = null;
                      stackIn_28_1 = null;
                      stackIn_28_2 = stackIn_27_2;
                      stackIn_28_3 = stackIn_27_3;
                      stackIn_28_4 = stackIn_27_4;
                      stackIn_28_5 = stackIn_27_5;
                      stackIn_28_6 = stackIn_27_6;
                      stackIn_28_7 = stackIn_27_7;
                      stackIn_28_8 = 0;
                      break L10;
                    } else {
                      stackIn_28_0 = null;
                      stackIn_28_1 = null;
                      stackIn_28_2 = stackIn_27_2;
                      stackIn_28_3 = stackIn_27_3;
                      stackIn_28_4 = stackIn_27_4;
                      stackIn_28_5 = stackIn_27_5;
                      stackIn_28_6 = stackIn_27_6;
                      stackIn_28_7 = stackIn_27_7;
                      stackIn_28_8 = 8;
                      break L10;
                    }
                  }
                  L11: {
                    var19 = new jd(stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                    var20 = bw.field_m[var8][0];
                    var21 = bw.field_m[var9][0];
                    var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                    if (var22 > var17) {
                      var22 = var17;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                  this.field_k = new sk((ha) null, (v) null, (vb) null);
                  this.field_k.a(var22, var19, var23, true, var18);
                  le.field_b = new cg();
                  break L2;
                }
              }
            }
            return;
          } else {
            this.field_l[var8].a(param0, -18596, param4, param2, param3, param1);
            var7 = var7 != 0 | this.field_l[var8].a((byte) 122) ? 1 : 0;
            var8++;
            continue L0;
          }
        }
    }

    final static void a(wk param0, int param1) {
        if (param1 != 3) {
            return;
        }
        try {
            rq.a((byte) -56);
            qn.a(param0.field_B, param0.field_A, param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vn.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int var2 = so.field_b.field_a >> -703583551;
        int var3 = -this.field_m.field_H + so.field_b.field_g + -(this.field_m.field_L << -7884543);
        int var4 = this.field_i[param0];
        this.field_m.c("Press Esc to return to the main menu", var2, var3, var4, -1);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_l.length) {
            var5 = 67 / ((-58 - param0) / 63);
            var7 = 0;
            var4 = var7;
            L1: while (true) {
              if (var7 >= this.field_l.length) {
                return;
              } else {
                if (var7 == 0) {
                  this.field_l[var7].j(0);
                  var7++;
                  continue L1;
                } else {
                  this.field_l[var7].e(32);
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            if (this.field_l[var4].b(param1, 2, param2)) {
              var5 = 0;
              L2: while (true) {
                if (var5 >= this.field_l.length) {
                  return;
                } else {
                  if (var4 != var5) {
                    this.field_l[var5].e(32);
                    var5++;
                    continue L2;
                  } else {
                    this.field_l[var5].j(0);
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    vn(wk[] param0, wk[] param1, tu param2, int[] param3, int param4, int param5) {
        this.field_c = 0;
        try {
            this.field_b = param0;
            this.field_m = param2;
            this.field_i = param3;
            this.field_f = param1;
            this.b((byte) -49);
            this.c((byte) -103);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(int param0) {
        if (null != this.field_k) {
            this.field_k.c((byte) -120);
        } else {
            this.field_d.a(113);
            this.field_h.a(71);
            this.field_a.a(53);
            this.b(0);
        }
        this.a(0);
        if (param0 != 2) {
            return;
        }
        if (null != le.field_b) {
            le.field_b.a(8, this.field_c);
        }
    }

    private final int a(byte param0, int param1) {
        if (0 == param1) {
            return this.field_d.a((byte) -25);
        }
        if ((param1 ^ -1) == -2) {
            return this.field_l[0].e(true);
        }
        if ((param1 ^ -1) == -3) {
            return this.field_l[2].e(true);
        }
        if ((param1 ^ -1) == -4) {
            return this.field_h.a((byte) -63);
        }
        if (!(-5 != (param1 ^ -1))) {
            return this.field_l[1].e(true);
        }
        if (-6 == (param1 ^ -1)) {
            return this.field_l[3].e(true);
        }
        if (!(6 != param1)) {
            return this.field_a.a((byte) -127);
        }
        if (!((param1 ^ -1) != -8)) {
            return this.field_l[4].e(true);
        }
        if (param0 != -101) {
            this.a(true, 53, -58, false, -8, false);
        }
        if ((param1 ^ -1) == -9) {
            return this.field_l[5].e(true);
        }
        return 0;
    }

    private final void c(byte param0) {
        this.a(10, -50, 0, 10);
        this.a(10, -45, 1, this.a((byte) -101, 0) + 10);
        this.a(10, -44, 2, this.a((byte) -101, 0) + (10 + this.a((byte) -101, 1)));
        if (param0 > -56) {
            this.a(-9);
        }
        this.a(10, -82, 7, this.a((byte) -101, 0) + 10 - (-this.a((byte) -101, 1) + -this.a((byte) -101, 3)));
        this.a(630 - this.a(3, (byte) -42), -64, 3, 10);
        this.a(-this.a(4, (byte) -42) + 630, -75, 4, this.a((byte) -101, 3) + 10);
        this.a(630 + -this.a(5, (byte) -42), -112, 5, 10 - (-this.a((byte) -101, 3) - this.a((byte) -101, 4)));
        this.a(630 - this.a(8, (byte) -42), -100, 8, this.a((byte) -101, 3) + 10 - -this.a((byte) -101, 4) + this.a((byte) -101, 5));
        this.a(320 + -(this.a(6, (byte) -42) / 2), -84, 6, 360);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        if (param1 != 5) {
            this.field_c = 0;
        }
        if (!(le.field_b == null)) {
            this.field_c = this.field_c + 1;
            if (!(50 >= this.field_c)) {
                le.field_b = null;
                this.field_c = 0;
            }
        }
        if (!(null == this.field_k)) {
            this.field_k.b((oj) null, (byte) -121);
            if (!(!this.field_k.b(8865))) {
                this.field_k = null;
                le.field_b = new cg();
            }
            return;
        }
        this.a(param3, param0, param4, param5, param2, false);
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -8) {
            field_e = (String) null;
        }
        field_e = null;
        field_g = null;
    }

    static {
        field_g = "Most kills";
        field_e = "Play the game without logging in just yet";
        field_j = new pf("email");
    }
}
