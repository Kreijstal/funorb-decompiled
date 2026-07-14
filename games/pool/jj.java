/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends fm implements tb {
    private fe field_O;
    private co field_N;
    static String field_P;
    static dd[] field_S;
    static String field_R;
    static int field_F;
    static String field_Q;

    final static ie a(int param0, String param1) {
        int var6 = 0;
        String var7 = null;
        ie var8 = null;
        int var9 = Pool.field_O;
        int var2 = param1.length();
        if (!(0 != var2)) {
            return uj.field_e;
        }
        if (!((var2 ^ -1) >= -256)) {
            return la.field_h;
        }
        String[] var3 = jc.a(30634, param1, '.');
        if (!(var3.length >= 2)) {
            return uj.field_e;
        }
        int var4 = -7 % ((3 - param0) / 47);
        String[] var5 = var3;
        for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            var8 = dl.a(105, var7);
            if (var8 != null) {
                return var8;
            }
        }
        return la.a(0, var3[var3.length + -1]);
    }

    jj(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (fp) null);
        ((jj) this).field_N = new co((fp) (Object) new om(10000536), nm.field_b, 0, 0, 140, 25);
        ((jj) this).field_N.a(-15309, new sn());
        ((jj) this).field_O = new fe(fg.field_c, (cc) this);
        ((jj) this).field_L = new ei[]{(ei) (Object) ((jj) this).field_N, (ei) (Object) ((jj) this).field_O};
        ((jj) this).field_O.field_z = (fp) (Object) new ng();
        ((jj) this).e((byte) -72);
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        nm var9 = null;
        Object var10 = null;
        int stackIn_10_0 = 0;
        nm stackIn_15_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        nm stackOut_14_0 = null;
        nm stackOut_13_0 = null;
        var1 = -kk.field_z + gp.field_c;
        kk.field_z = -(var1 >> 298864001) + ad.field_u;
        gp.field_c = kk.field_z - -var1;
        ba.field_wb = m.field_f + -(er.field_R >> -1413223935);
        var2 = ba.field_wb;
        var3 = 0;
        L0: while (true) {
          if (var3 >= qp.field_Sb.length) {
            L1: {
              if (param0 == -9395) {
                break L1;
              } else {
                var10 = null;
                byte[] discarded$1 = jj.a((byte[]) null, (byte) -29);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var4 = ll.field_a[var3];
              if ((var4 ^ -1) <= -1) {
                if (un.field_f.field_h == var4) {
                  var5 = bg.field_d;
                  break L2;
                } else {
                  var5 = hd.field_H;
                  break L2;
                }
              } else {
                var5 = lq.field_V;
                break L2;
              }
            }
            L3: {
              var6 = qp.field_Sb[var3];
              if (-1 < (var4 ^ -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var7 = wm.a(stackIn_10_0 != 0, param0 ^ -9377, var6);
              var8 = ad.field_u - (var7 >> -1289697951);
              if (-1 >= (var4 ^ -1)) {
                L5: {
                  var2 = var2 + bj.field_m;
                  if (un.field_f.field_h == var4) {
                    stackOut_14_0 = uk.field_d;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = rm.field_e;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = stackIn_15_0;
                  if (var9 == null) {
                    break L6;
                  } else {
                    var9.a((qi.field_g << 1558756801) + var7, var2, -6316, -qi.field_g + var8, (oc.field_B << -883765759) + kh.field_yc);
                    break L6;
                  }
                }
                var2 = var2 + oc.field_B;
                break L4;
              } else {
                break L4;
              }
            }
            if (-1 >= (var4 ^ -1)) {
              qa.field_t.d(var6, var8, var2 + qr.field_g, var5, -1);
              var2 = var2 + (kh.field_yc + (oc.field_B - -bj.field_m));
              var3++;
              continue L0;
            } else {
              qp.field_ec.d(var6, var8, un.field_h + var2, var5, -1);
              var2 = var2 + ob.field_u;
              var3++;
              continue L0;
            }
          }
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((jj) this).field_O.field_I = ((jj) this).field_N.a(param1 + -997).c(-31873) == kr.field_e ? true : false;
    }

    public static void i(int param0) {
        field_S = null;
        field_R = null;
        field_P = null;
        field_Q = null;
        if (param0 != 100) {
            field_S = null;
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (!(((jj) this).field_N.a(-41).c(-31873) == kr.field_e)) {
            return;
        }
        if (!param0) {
            jj.i(82);
        }
        wm.a(-121, ((jj) this).field_N.h(37), ((jj) this).field_N.j(25), ((jj) this).field_N.h((byte) -119));
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        if (param1 != 91) {
            field_S = null;
        }
        qn.a(param0, 0, var3, 0, var2);
        return var3;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 17 % ((-42 - param1) / 53);
        super.a(param0, (byte) 110, param2, param3);
        qk.field_a.d(bl.field_t, ((jj) this).field_C + (param2 + 4), 4 + (param3 + ((jj) this).field_D) + qk.field_a.field_C, 16777215, -1);
    }

    final void f(byte param0) {
        int var2 = 250;
        ((jj) this).field_N.a(140, -var2 + ((jj) this).field_l >> -314276639, 25, false, -25 + (20 + ((jj) this).field_y) >> -1564239647);
        ((jj) this).field_O.a(100, (((jj) this).field_l - var2 >> 212438881) + 140 + 10, 30, false, 2 + (((jj) this).field_y - -20 - 30 >> 1113247201));
        if (param0 > -68) {
            Object var3 = null;
            ((jj) this).a((ei) null, 99, -2, 11);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Enter name of player to delete from list";
        field_P = "Hide players in <%0>'s game";
        field_Q = "Basics Tutorial";
    }
}
