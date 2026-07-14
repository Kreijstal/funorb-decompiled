/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends vf {
    private pn field_v;
    static vf field_y;
    static mn field_w;
    static fi field_x;
    private pn[] field_B;
    static String field_u;
    static String field_z;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        pn var7 = null;
        pn var9 = null;
        rg var10 = null;
        pn var11 = null;
        pn var12 = null;
        pn var13 = null;
        pn var14 = null;
        fj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        fj stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof rg)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (fj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (fj) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (rg) (Object) stackIn_3_0;
          lc.a(param1 + param3.field_q, param3.field_F + (param1 - -param3.field_q), param4 - (-param3.field_m + -param3.field_z), param4 + param3.field_m, 14907);
          if (var10 != null) {
            param2 = param2 & var10.field_L;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((qh) this).field_B[0];
          ((qh) this).field_v.b(2585);
          var7.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
          if (param0 < -97) {
            break L2;
          } else {
            ((qh) this).field_B = null;
            break L2;
          }
        }
        L3: {
          if (var10 != null) {
            L4: {
              if (var10.field_O) {
                var11 = ((qh) this).field_B[1];
                if (var11 == null) {
                  break L4;
                } else {
                  var11.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (!var10.field_w) {
              break L3;
            } else {
              L5: {
                var12 = ((qh) this).field_B[3];
                if (var10.field_o == 0) {
                  break L5;
                } else {
                  if (var12 == null) {
                    break L5;
                  } else {
                    var12.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                    break L3;
                  }
                }
              }
              var9 = ((qh) this).field_B[2];
              if (var9 != null) {
                var9.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (param3.e((byte) -125)) {
            var13 = ((qh) this).field_B[5];
            if (var13 == null) {
              break L6;
            } else {
              var13.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (!param2) {
            var14 = ((qh) this).field_B[4];
            if (var14 != null) {
              var14.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
              break L7;
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((qh) this).field_v.a(param1, param4, param3, (byte) 100, (qh) this);
        ib.b(false);
    }

    final static jb a(boolean param0, byte param1) {
        int var3 = 0;
        bd var4 = null;
        bd var5 = null;
        bd var6 = null;
        int var7 = 0;
        jb var8 = null;
        bd var9 = null;
        jb var10 = null;
        bd var11 = null;
        bd var12 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          if (!pa.field_c) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          al.field_d = stackIn_3_0;
          var8 = new jb(7);
          var10 = var8;
          var10.field_b = 277;
          var10.field_s = 70;
          var10.field_c = 50;
          var10.field_k = 500;
          var3 = 20 + var10.field_c - -var10.field_b;
          if (tj.a(true)) {
            var11 = new bd(16, ba.field_Q, (ok) (Object) pn.field_a);
            var11.field_b = var3;
            var11.field_j = -(var11.field_f / 2) + 320;
            var10.a((byte) -53, var11);
            break L1;
          } else {
            var10.a((byte) -83, new bd(18, ca.field_s, (ok) (Object) pn.field_a));
            var10.a((byte) -84, new bd(18, kk.field_a, (ok) (Object) pn.field_a));
            var8.a((byte) -103, new bd(19, dn.field_e[0], (ok) (Object) pn.field_a));
            var8.a((byte) -90, new bd(19, dn.field_e[1], (ok) (Object) pn.field_a));
            var8.a((byte) -123, new bd(19, dn.field_e[2], (ok) (Object) pn.field_a));
            var8.field_h[1].field_f = 200;
            var9 = var8.field_h[0];
            var4 = var9;
            var9.field_f = 200;
            var8.field_h[0].field_j = -(var8.field_h[0].field_f / 2) + 200;
            var8.field_h[1].field_b = var3;
            var8.field_h[0].field_b = var3;
            var8.field_h[1].field_j = -(var8.field_h[1].field_f / 2) + 440;
            var3 += 40;
            var5 = var8.field_h[2];
            var8.field_h[4].field_f = 145;
            var6 = var8.field_h[3];
            var6.field_f = 145;
            var5.field_f = 145;
            var8.field_h[2].field_j = 160 + -(var8.field_h[2].field_f / 2);
            var8.field_h[3].field_j = 320 + -(var8.field_h[3].field_f / 2);
            var8.field_h[4].field_j = -(var8.field_h[4].field_f / 2) + 480;
            var8.field_h[4].field_b = var3;
            var8.field_h[3].field_b = var3;
            var8.field_h[2].field_b = var3;
            break L1;
          }
        }
        var3 += 40;
        var12 = new bd(14, fl.field_b, (ok) (Object) pn.field_a);
        var12.field_b = var3;
        if (param1 >= 102) {
          L2: {
            var12.field_j = 320 - var12.field_f / 2;
            var10.a((byte) -60, var12);
            if (!tj.a(true)) {
              var10.a(param0, 26206, 2 - -h.field_W);
              break L2;
            } else {
              var10.a(param0, 26206, 0);
              break L2;
            }
          }
          return var10;
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_w = null;
        if (param0 <= 103) {
            field_x = null;
        }
        field_u = null;
        field_z = null;
        field_x = null;
        field_y = null;
    }

    final void a(int param0, nf param1) {
        pn[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        pn var6 = null;
        int var7 = 0;
        pn[] var8 = null;
        var7 = Confined.field_J ? 1 : 0;
        var4 = -100 % ((param0 - 1) / 59);
        var8 = ((qh) this).field_B;
        var3 = var8;
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            return;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_d = param1;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, nf[] param1) {
        pn[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        pn var6 = null;
        int var7 = 0;
        pn[] var8 = null;
        var7 = Confined.field_J ? 1 : 0;
        var8 = ((qh) this).field_B;
        var3 = var8;
        var4 = -37 / ((param0 - 45) / 52);
        var5 = 0;
        L0: while (true) {
          if (var5 >= var8.length) {
            return;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_g = param1;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public qh() {
        ((qh) this).field_B = new pn[6];
        ((qh) this).field_v = new pn();
        ((qh) this).field_B[0] = new pn();
        pn var1 = new pn();
        var1.b(2585);
    }

    final static void c(int param0) {
        if (!(dn.field_d != null)) {
            return;
        }
        if (param0 != 4) {
            qh.d(89);
        }
        fa.a((java.awt.Canvas) (Object) dn.field_d, param0 + 65);
        dn.field_d.a(-94, ki.field_d);
        dn.field_d = null;
        if (null != gg.field_m) {
            gg.field_m.a((byte) -127);
        }
        fb.field_b.requestFocus();
    }

    private final void a(int param0, qh param1, boolean param2) {
        int var4 = 0;
        pn var5 = null;
        pn var6 = null;
        pn var6_ref = null;
        int var7 = 0;
        pn stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pn stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pn stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        pn stackIn_11_2 = null;
        pn stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pn stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        pn stackOut_10_2 = null;
        pn stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pn stackOut_9_2 = null;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          super.a(false, (vf) (Object) param1);
          if (param0 == -29066) {
            break L0;
          } else {
            qh.d(-13);
            break L0;
          }
        }
        L1: {
          if (param2) {
            var4 = 0;
            L2: while (true) {
              if (6 <= var4) {
                break L1;
              } else {
                var5 = ((qh) this).field_B[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L3: {
                    var6_ref = param1.field_B[var4];
                    stackOut_8_0 = (pn) var5;
                    stackOut_8_1 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var6_ref != null) {
                      stackOut_10_0 = (pn) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (pn) var6_ref;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L3;
                    } else {
                      param1.field_B[var4] = new pn();
                      stackOut_9_0 = (pn) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = new pn();
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L3;
                    }
                  }
                  ((pn) (Object) stackIn_11_0).a(stackIn_11_1 != 0, stackIn_11_2);
                  var4++;
                  continue L2;
                } else {
                  param1.field_B[var4] = null;
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            lj.a((Object[]) (Object) ((qh) this).field_B, 0, (Object[]) (Object) param1.field_B, 0, 6);
            break L1;
          }
        }
    }

    final pn b(int param0, int param1) {
        if (param1 > -34) {
            jb discarded$0 = qh.a(true, (byte) 21);
        }
        ((qh) this).field_B[param0] = new pn();
        return new pn();
    }

    qh(qh param0, boolean param1) {
        this();
        param0.a(-29066, (qh) this, param1);
    }

    final void a(byte param0, nf[] param1, int param2) {
        int var4 = param2;
        if (null == ((qh) this).field_B[var4]) {
            ((qh) this).field_B[var4] = new pn();
        }
        ((qh) this).field_B[param2].field_g = param1;
        var4 = -53 % ((2 - param0) / 55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new fi();
        field_z = "Congratulations. #You have done well.";
        field_u = "Unpacking music";
    }
}
