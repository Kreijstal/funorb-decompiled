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

    private final void b() {
        ((vn) this).field_d = new ia(((vn) this).field_b, ((vn) this).field_m, ((vn) this).field_i, "Attacker", 0, 0);
        ((vn) this).field_h = new ia(((vn) this).field_b, ((vn) this).field_m, ((vn) this).field_i, "Defender", 0, 0);
        ((vn) this).field_a = new ia(((vn) this).field_b, ((vn) this).field_m, ((vn) this).field_i, "Run Attack", 0, 0);
        ((vn) this).field_l = new r[6];
        ((vn) this).field_l[0] = new r(((vn) this).field_b, ((vn) this).field_f, ((vn) this).field_m, ((vn) this).field_i, af.field_a, 0, 0);
        ((vn) this).field_l[1] = new r(((vn) this).field_b, ((vn) this).field_f, ((vn) this).field_m, ((vn) this).field_i, af.field_a, 0, 0);
        ((vn) this).field_l[2] = new r(((vn) this).field_b, ((vn) this).field_f, ((vn) this).field_m, ((vn) this).field_i, ts.field_d, 0, 0);
        ((vn) this).field_l[3] = new r(((vn) this).field_b, ((vn) this).field_f, ((vn) this).field_m, ((vn) this).field_i, ts.field_d, 0, 0);
        ((vn) this).field_l[4] = new r(((vn) this).field_b, ((vn) this).field_f, ((vn) this).field_m, ((vn) this).field_i, hm.field_i, 0, 0);
        ((vn) this).field_l[5] = new r(((vn) this).field_b, ((vn) this).field_f, ((vn) this).field_m, ((vn) this).field_i, hm.field_i, 0, 0);
    }

    private final int a(int param0, byte param1) {
        if (param0 == 0) {
            return ((vn) this).field_d.c(-29408);
        }
        if (!(param0 != 1)) {
            return ((vn) this).field_l[0].n(-18332);
        }
        if (!(param0 != 2)) {
            return ((vn) this).field_l[2].n(-18332);
        }
        if (!(param0 != 3)) {
            return ((vn) this).field_h.c(-29408);
        }
        if (!(4 != param0)) {
            return ((vn) this).field_l[1].n(-18332);
        }
        if (!(param0 != 5)) {
            return ((vn) this).field_l[3].n(-18332);
        }
        if (!(6 != param0)) {
            return ((vn) this).field_a.c(-29408);
        }
        if (param0 == 7) {
            return ((vn) this).field_l[4].n(-18332);
        }
        if (param0 != 8) {
            return 0;
        }
        return ((vn) this).field_l[5].n(-18332);
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (((vn) this).field_l.length <= var2) {
            var4 = 0;
            var2 = var4;
            L1: while (true) {
              if (var4 >= ((vn) this).field_l.length) {
                return;
              } else {
                if (((vn) this).field_l[var4].g((byte) 97)) {
                  ((vn) this).field_l[var4].f((byte) -55);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            if (!((vn) this).field_l[var2].g((byte) 97)) {
              ((vn) this).field_l[var2].f((byte) 124);
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
        if (!(param2 != 0)) {
            ((vn) this).field_d.a(param3, (byte) 55, param0);
        }
        if (param2 == 1) {
            ((vn) this).field_l[0].e(-84, param0, param3);
        }
        if (!(param2 != 2)) {
            ((vn) this).field_l[2].e(-71, param0, param3);
        }
        if (!(param2 != 3)) {
            ((vn) this).field_h.a(param3, (byte) 127, param0);
        }
        if (param2 == 4) {
            ((vn) this).field_l[1].e(-59, param0, param3);
        }
        if (param1 > -41) {
            this.a(-21);
        }
        if (param2 == 5) {
            ((vn) this).field_l[3].e(87, param0, param3);
        }
        if (param2 == 6) {
            ((vn) this).field_a.a(param3, (byte) 107, param0);
        }
        if (!(param2 != 7)) {
            ((vn) this).field_l[4].e(-57, param0, param3);
        }
        if (!(param2 != 8)) {
            ((vn) this).field_l[5].e(-87, param0, param3);
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
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
        jd var18 = null;
        jd var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        jd stackIn_23_0 = null;
        jd stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        jd stackIn_24_0 = null;
        jd stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        jd stackIn_25_0 = null;
        jd stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        jd stackIn_26_0 = null;
        jd stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        jd stackIn_27_0 = null;
        jd stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        jd stackIn_28_0 = null;
        jd stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        jd stackOut_22_0 = null;
        jd stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        jd stackOut_24_0 = null;
        jd stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        jd stackOut_23_0 = null;
        jd stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        jd stackOut_25_0 = null;
        jd stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        jd stackOut_27_0 = null;
        jd stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        jd stackOut_26_0 = null;
        jd stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        var24 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a((byte) -121, param2, param4);
        var7 = 0;
        var8 = 0;
        L0: while (true) {
          if (~var8 <= ~((vn) this).field_l.length) {
            L1: {
              if (var7 == 0) {
                break L1;
              } else {
                this.c((byte) -95);
                break L1;
              }
            }
            L2: {
              if (!((vn) this).field_a.a(param4, 0, param2)) {
                break L2;
              } else {
                if (!param0) {
                  break L2;
                } else {
                  L3: {
                    var8 = ((vn) this).field_l[0].h(5);
                    var9 = ((vn) this).field_l[1].h(5);
                    var10 = ((vn) this).field_l[2].h(5);
                    var11 = ((vn) this).field_l[3].h(5);
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
                    if (var9 == 76) {
                      var12 = 1;
                      var9 = 7;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var8 == 75) {
                      var8 = 34;
                      var13 = 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var8 != 76) {
                      break L6;
                    } else {
                      var13 = 1;
                      var8 = 7;
                      break L6;
                    }
                  }
                  L7: {
                    var14 = bw.field_m[var8][4];
                    var15 = var14 / (1 + ((vn) this).field_l[4].h(5));
                    var16 = bw.field_m[var9][4];
                    var17 = var16 / (1 + ((vn) this).field_l[5].h(5));
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
                    stackOut_22_0 = null;
                    stackOut_22_1 = null;
                    stackOut_22_2 = 0;
                    stackOut_22_3 = 0;
                    stackOut_22_4 = var8;
                    stackOut_22_5 = 0;
                    stackOut_22_6 = var14;
                    stackOut_22_7 = var15;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_24_6 = stackOut_22_6;
                    stackIn_24_7 = stackOut_22_7;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    stackIn_23_4 = stackOut_22_4;
                    stackIn_23_5 = stackOut_22_5;
                    stackIn_23_6 = stackOut_22_6;
                    stackIn_23_7 = stackOut_22_7;
                    if (var13 == 0) {
                      stackOut_24_0 = null;
                      stackOut_24_1 = null;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3;
                      stackOut_24_4 = stackIn_24_4;
                      stackOut_24_5 = stackIn_24_5;
                      stackOut_24_6 = stackIn_24_6;
                      stackOut_24_7 = stackIn_24_7;
                      stackOut_24_8 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      stackIn_25_7 = stackOut_24_7;
                      stackIn_25_8 = stackOut_24_8;
                      break L9;
                    } else {
                      stackOut_23_0 = null;
                      stackOut_23_1 = null;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = stackIn_23_3;
                      stackOut_23_4 = stackIn_23_4;
                      stackOut_23_5 = stackIn_23_5;
                      stackOut_23_6 = stackIn_23_6;
                      stackOut_23_7 = stackIn_23_7;
                      stackOut_23_8 = 8;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackIn_25_4 = stackOut_23_4;
                      stackIn_25_5 = stackOut_23_5;
                      stackIn_25_6 = stackOut_23_6;
                      stackIn_25_7 = stackOut_23_7;
                      stackIn_25_8 = stackOut_23_8;
                      break L9;
                    }
                  }
                  L10: {
                    var18 = new jd(stackIn_25_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                    stackOut_25_0 = null;
                    stackOut_25_1 = null;
                    stackOut_25_2 = 0;
                    stackOut_25_3 = 0;
                    stackOut_25_4 = var9;
                    stackOut_25_5 = 0;
                    stackOut_25_6 = var16;
                    stackOut_25_7 = var17;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    stackIn_27_6 = stackOut_25_6;
                    stackIn_27_7 = stackOut_25_7;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    stackIn_26_4 = stackOut_25_4;
                    stackIn_26_5 = stackOut_25_5;
                    stackIn_26_6 = stackOut_25_6;
                    stackIn_26_7 = stackOut_25_7;
                    if (var12 == 0) {
                      stackOut_27_0 = null;
                      stackOut_27_1 = null;
                      stackOut_27_2 = stackIn_27_2;
                      stackOut_27_3 = stackIn_27_3;
                      stackOut_27_4 = stackIn_27_4;
                      stackOut_27_5 = stackIn_27_5;
                      stackOut_27_6 = stackIn_27_6;
                      stackOut_27_7 = stackIn_27_7;
                      stackOut_27_8 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      stackIn_28_3 = stackOut_27_3;
                      stackIn_28_4 = stackOut_27_4;
                      stackIn_28_5 = stackOut_27_5;
                      stackIn_28_6 = stackOut_27_6;
                      stackIn_28_7 = stackOut_27_7;
                      stackIn_28_8 = stackOut_27_8;
                      break L10;
                    } else {
                      stackOut_26_0 = null;
                      stackOut_26_1 = null;
                      stackOut_26_2 = stackIn_26_2;
                      stackOut_26_3 = stackIn_26_3;
                      stackOut_26_4 = stackIn_26_4;
                      stackOut_26_5 = stackIn_26_5;
                      stackOut_26_6 = stackIn_26_6;
                      stackOut_26_7 = stackIn_26_7;
                      stackOut_26_8 = 8;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      stackIn_28_3 = stackOut_26_3;
                      stackIn_28_4 = stackOut_26_4;
                      stackIn_28_5 = stackOut_26_5;
                      stackIn_28_6 = stackOut_26_6;
                      stackIn_28_7 = stackOut_26_7;
                      stackIn_28_8 = stackOut_26_8;
                      break L10;
                    }
                  }
                  L11: {
                    var19 = new jd(stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, 0, 0, (ha) null, 0, 0, -1, true, 0);
                    var20 = bw.field_m[var8][0];
                    var21 = bw.field_m[var9][0];
                    var22 = ri.field_c[var11] * (var15 * fk.field_d[var20][var21]) / 10000;
                    if (~var22 < ~var17) {
                      var22 = var17;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var23 = (var17 + -var22) * (fk.field_d[var21][var20] * ri.field_c[var10]) / 10000;
                  ((vn) this).field_k = new sk((ha) null, (v) null, (vb) null);
                  ((vn) this).field_k.a(var22, var19, var23, true, var18);
                  le.field_b = new cg();
                  break L2;
                }
              }
            }
            return;
          } else {
            ((vn) this).field_l[var8].a(param0, -18596, param4, param2, param3, param1);
            var7 = var7 != 0 | ((vn) this).field_l[var8].a((byte) 122) ? 1 : 0;
            var8++;
            continue L0;
          }
        }
    }

    final static void a(wk param0) {
        try {
            int discarded$0 = -56;
            rq.a();
            qn.a(param0.field_B, param0.field_A, param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vn.F(" + (param0 != null ? "{...}" : "null") + 44 + 3 + 41);
        }
    }

    private final void a(int param0) {
        int var2 = so.field_b.field_a >> 1;
        int var3 = -((vn) this).field_m.field_H + so.field_b.field_g + -(((vn) this).field_m.field_L << 1);
        int var4 = ((vn) this).field_i[param0];
        ((vn) this).field_m.c("Press Esc to return to the main menu", var2, var3, var4, -1);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((vn) this).field_l.length) {
            var5 = 67;
            var7 = 0;
            var4 = var7;
            L1: while (true) {
              if (var7 >= ((vn) this).field_l.length) {
                return;
              } else {
                if (var7 == 0) {
                  ((vn) this).field_l[var7].j(0);
                  var7++;
                  continue L1;
                } else {
                  ((vn) this).field_l[var7].e(32);
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            if (((vn) this).field_l[var4].b(param1, 2, param2)) {
              var5 = 0;
              L2: while (true) {
                if (var5 >= ((vn) this).field_l.length) {
                  return;
                } else {
                  if (var4 != var5) {
                    ((vn) this).field_l[var5].e(32);
                    var5++;
                    continue L2;
                  } else {
                    ((vn) this).field_l[var5].j(0);
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
        ((vn) this).field_c = 0;
        try {
            ((vn) this).field_b = param0;
            ((vn) this).field_m = param2;
            ((vn) this).field_i = param3;
            ((vn) this).field_f = param1;
            int discarded$0 = -49;
            this.b();
            this.c((byte) -103);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void c(int param0) {
        if (null != ((vn) this).field_k) {
            ((vn) this).field_k.c((byte) -120);
        } else {
            ((vn) this).field_d.a(113);
            ((vn) this).field_h.a(71);
            ((vn) this).field_a.a(53);
            this.b(0);
        }
        this.a(0);
        if (param0 != 2) {
            return;
        }
        if (null != le.field_b) {
            le.field_b.a(8, ((vn) this).field_c);
        }
    }

    private final int a(byte param0, int param1) {
        if (0 == param1) {
            return ((vn) this).field_d.a((byte) -25);
        }
        if (param1 == 1) {
            return ((vn) this).field_l[0].e(true);
        }
        if (param1 == 2) {
            return ((vn) this).field_l[2].e(true);
        }
        if (param1 == 3) {
            return ((vn) this).field_h.a((byte) -63);
        }
        if (!(param1 != 4)) {
            return ((vn) this).field_l[1].e(true);
        }
        if (param1 == 5) {
            return ((vn) this).field_l[3].e(true);
        }
        if (!(6 != param1)) {
            return ((vn) this).field_a.a((byte) -127);
        }
        if (!(param1 != 7)) {
            return ((vn) this).field_l[4].e(true);
        }
        if (param1 == 8) {
            return ((vn) this).field_l[5].e(true);
        }
        return 0;
    }

    private final void c(byte param0) {
        L0: {
          this.a(10, -50, 0, 10);
          this.a(10, -45, 1, this.a((byte) -101, 0) + 10);
          this.a(10, -44, 2, this.a((byte) -101, 0) + (10 + this.a((byte) -101, 1)));
          if (param0 <= -56) {
            break L0;
          } else {
            this.a(-9);
            break L0;
          }
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
            ((vn) this).field_c = 0;
        }
        if (!(le.field_b == null)) {
            ((vn) this).field_c = ((vn) this).field_c + 1;
            if (!(50 >= ((vn) this).field_c)) {
                le.field_b = null;
                ((vn) this).field_c = 0;
            }
        }
        if (!(null == ((vn) this).field_k)) {
            ((vn) this).field_k.b((oj) null, (byte) -121);
            if (!(!((vn) this).field_k.b(8865))) {
                ((vn) this).field_k = null;
                le.field_b = new cg();
            }
            return;
        }
        int discarded$0 = 0;
        this.a(param3, param0, param4, param5, param2);
    }

    public static void a() {
        field_j = null;
        field_e = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Most kills";
        field_e = "Play the game without logging in just yet";
        field_j = new pf("email");
    }
}
