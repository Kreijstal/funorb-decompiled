/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends pe implements qd {
    static long field_E;
    private ha field_H;
    static String field_G;
    private pl[] field_I;
    private String[] field_F;

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = wizardrun.field_H;
          var6 = 0;
          if (param0 == -18905) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= ((wj) this).field_F.length) {
            L2: {
              if (((wj) this).field_I[((wj) this).field_F.length] == param1) {
                ((wj) this).field_H.a(2147483647);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (param1 == ((wj) this).field_I[var6]) {
              ((wj) this).field_H.a(((wj) this).field_F[var6], (byte) 88);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        int var2 = param0.length();
        int var3 = 0;
        for (var4 = 0; var2 > var4; var4++) {
            var3 = nf.a(26614, param0.charAt(var4)) + (var3 << -1868718555) - var3;
        }
        if (param1 != 2148) {
            String discarded$0 = wj.g(-126);
        }
        return var3;
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        if (!(!super.a(param0, param1, (byte) -97, param3))) {
            return true;
        }
        if (!(98 != param1)) {
            return ((wj) this).a((byte) -117, param3);
        }
        if (param1 == 99) {
            return ((wj) this).b(param3, 1);
        }
        if (param2 >= -96) {
            o[] discarded$0 = wj.b(35, 113, -120, 21);
            return false;
        }
        return false;
    }

    final static String g(int param0) {
        if (!(-3 >= (ri.field_a ^ -1))) {
            return jf.field_f;
        }
        if (!(qh.field_c == null)) {
            if (!qh.field_c.b(param0 + 495)) {
                return bl.field_c;
            }
            return td.field_e;
        }
        if (!ub.field_x.b(17820)) {
            return qb.field_q;
        }
        if (!(ub.field_x.a((byte) 29, "commonui"))) {
            return tk.field_e + " - " + ub.field_x.a(0, "commonui") + "%";
        }
        if (!vj.field_b.b(param0 ^ 1585)) {
            return hj.field_d;
        }
        if (!vj.field_b.a((byte) 29, "commonui")) {
            return mj.field_d + " - " + vj.field_b.a(0, "commonui") + "%";
        }
        if (!(cc.field_a.b(17820))) {
            return nh.field_o;
        }
        if (param0 != 17325) {
            boolean discarded$0 = wj.a(113);
        }
        if (!(cc.field_a.d(-97))) {
            return od.field_s + " - " + cc.field_a.a((byte) 75) + "%";
        }
        return u.field_u;
    }

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var2 = null;
            int discarded$2 = wj.a((CharSequence) null, -18);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == jc.field_H) {
              break L2;
            } else {
              if (wh.field_j != hi.field_l) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static o[] b(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            return null;
        }
        return ei.a(param2, param0, param1, 1, 20230);
    }

    public static void d(boolean param0) {
        if (param0) {
            field_G = null;
        }
        field_G = null;
    }

    final static boolean g(byte param0) {
        if (param0 >= -77) {
            String discarded$0 = wj.g(-18);
        }
        return !we.field_c.a(true) ? true : false;
    }

    wj(ha param0) {
        super(0, 0, 0, 0, (bf) null);
        ((wj) this).field_H = param0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (-1 != (param2 ^ -1)) {
            return;
        }
        vd var5 = gh.field_b;
        if (null != ((wj) this).field_F) {
            int discarded$0 = var5.a(ml.field_p, param0 - -((wj) this).field_o, param3 - -((wj) this).field_l, ((wj) this).field_r, 20, 16777215, -1, 0, 0, var5.field_B + var5.field_M);
        }
    }

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        tk var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = wizardrun.field_H;
          ((wj) this).field_A.a(false);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length == 0) {
              break L0;
            } else {
              L1: {
                var3 = param1.length;
                ((wj) this).field_F = new String[var3];
                if (param0 == 87) {
                  break L1;
                } else {
                  ((wj) this).a(-86, 120, 101, 56);
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                if (var4_int >= var3) {
                  var4 = new tk(gh.field_b, 0, 1);
                  ((wj) this).field_I = new pl[var3 - -1];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((wj) this).field_I[var3] = new pl(eg.field_t, (ce) this);
                      ((wj) this).field_I[var3].field_w = (bf) (Object) var4;
                      ((wj) this).field_I[var3].a(param0 ^ 44, 16 * var3 - -36, 15, 100, 0);
                      ((wj) this).a((ub) (Object) ((wj) this).field_I[var3], (byte) 71);
                      return;
                    } else {
                      ((wj) this).field_I[var5] = new pl(((wj) this).field_F[var5], (ce) this);
                      ((wj) this).field_I[var5].field_w = (bf) (Object) var4;
                      ((wj) this).field_I[var5].field_p = ni.field_a;
                      ((wj) this).field_I[var5].a(109, 20 - -(var5 * 16), 15, 80, 0);
                      ((wj) this).a((ub) (Object) ((wj) this).field_I[var5], (byte) 64);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((wj) this).field_F[var4_int] = oe.a((byte) 27, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L2;
                }
              }
            }
          }
        }
        ((wj) this).field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Loading...";
        field_E = 20000000L;
    }
}
