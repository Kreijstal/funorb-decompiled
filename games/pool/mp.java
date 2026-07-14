/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends ch implements tb {
    static int[] field_P;
    static String field_Q;
    static String field_X;
    private String[] field_T;
    static ko field_R;
    static dd[] field_N;
    private jn field_Y;
    static String field_S;
    static int field_V;
    static int field_O;
    private fe[] field_U;
    static int field_W;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 52 / ((param1 - -42) / 53);
        super.a(param0, (byte) -102, param2, param3);
        if (!(-1 == (param0 ^ -1))) {
            return;
        }
        lr var6 = lc.field_O;
        if (!(((mp) this).field_T == null)) {
            int discarded$0 = var6.a(oc.field_h, ((mp) this).field_C + param2, ((mp) this).field_D + param3, ((mp) this).field_l, 20, 16777215, -1, 0, 0, var6.field_w + var6.field_C);
        }
    }

    mp(jn param0) {
        super(0, 0, 0, 0, (fp) null);
        ((mp) this).field_Y = param0;
    }

    final void a(boolean param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        pd var4 = null;
        int var5 = 0;
        L0: {
          ((mp) this).field_F.d((byte) 87);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              var3 = param1.length;
              ((mp) this).field_T = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= var3) {
                  var4 = new pd(lc.field_O, 0, 1);
                  ((mp) this).field_U = new fe[1 + var3];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var3) {
                      ((mp) this).field_U[var3] = new fe(be.field_J, (cc) this);
                      ((mp) this).field_U[var3].field_z = (fp) (Object) var4;
                      ((mp) this).field_U[var3].a(100, 0, 15, param0, 20 - (-(16 * var3) - 16));
                      ((mp) this).a(true, (ei) (Object) ((mp) this).field_U[var3]);
                      return;
                    } else {
                      ((mp) this).field_U[var5] = new fe(((mp) this).field_T[var5], (cc) this);
                      ((mp) this).field_U[var5].field_z = (fp) (Object) var4;
                      ((mp) this).field_U[var5].field_p = ab.field_i;
                      ((mp) this).field_U[var5].a(80, 0, 15, false, 20 - -(16 * var5));
                      ((mp) this).a(true, (ei) (Object) ((mp) this).field_U[var5]);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  ((mp) this).field_T[var4_int] = ch.a(false, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((mp) this).field_T = null;
    }

    final static boolean g(byte param0) {
        if (param0 >= -77) {
            mp.a(9);
        }
        return !hr.field_y ? true : false;
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(param1 != 98)) {
            return ((mp) this).a(param3, 3);
        }
        if ((param1 ^ -1) != -100) {
            return false;
        }
        return ((mp) this).b(param3, 0);
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var11 = 0;
        var11 = Pool.field_O;
        if (param5 == 13375) {
          L0: {
            if (param4) {
              break L0;
            } else {
              L1: {
                if (fr.field_s != qh.field_l) {
                  break L1;
                } else {
                  if (qh.field_f == f.field_h) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (qh.field_f != sh.field_P.field_k) {
                break L0;
              } else {
                if (sh.field_P.field_e != qh.field_l) {
                  break L0;
                } else {
                  if (null == em.field_L) {
                    if (tp.field_e == null) {
                      f.a(48);
                      break L0;
                    } else {
                      al.a(true, 0);
                      break L0;
                    }
                  } else {
                    al.a(false, 0);
                    break L0;
                  }
                }
              }
            }
          }
          L2: {
            if (!param4) {
              tn.field_u = (fr.field_s - 640) / 2;
              break L2;
            } else {
              tn.field_u = fd.field_I;
              break L2;
            }
          }
          L3: {
            pf.a(param4, param5 ^ -13418);
            if (-1 > (hb.field_a ^ -1)) {
              ie.a(param4, param1, param5 + -13502, param9);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            gi.field_o.field_tb = pa.field_M.field_tb;
            gi.field_o.field_Fb = 1;
            if (uf.field_z <= 0) {
              break L4;
            } else {
              wk.a(param4, param9, param1, 112);
              break L4;
            }
          }
          L5: {
            if (-1 <= (nj.field_b ^ -1)) {
              break L5;
            } else {
              fe.a(param8, param4, param1, -102, param9);
              break L5;
            }
          }
          L6: {
            L7: {
              if (!nr.field_bb) {
                break L7;
              } else {
                if (em.field_L.field_Nb <= em.field_L.field_mc) {
                  ci.field_c.field_Sb.field_nb = ro.field_p;
                  c.field_e.field_pb = false;
                  mq.a(ci.field_c.field_Rb, (byte) 109);
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            c.field_e.field_pb = true;
            ci.field_c.field_Sb.field_nb = null;
            rk.a(param7, param0, ci.field_c, param9, (byte) -83);
            break L6;
          }
          mk.a(param3, 0, param9, param7, param6, param2, param0);
          rk.a(param7, param0, wo.field_f, param9, (byte) -83);
          va.field_V = va.field_V + 1;
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_N = null;
        field_Q = null;
        if (param0 != 160) {
            return;
        }
        field_S = null;
        field_R = null;
        field_X = null;
        field_P = null;
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        if (param0) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((mp) this).field_T.length) {
              L1: {
                if (param3 == ((mp) this).field_U[((mp) this).field_T.length]) {
                  ((mp) this).field_Y.a(16777215);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              if (((mp) this).field_U[var6] == param3) {
                ((mp) this).field_Y.a(((mp) this).field_T[var6], 35);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, nm param2, int param3) {
        kp.field_d = param1;
        qe.field_o = param0;
        int var4 = 87 % ((40 - param3) / 48);
        db.field_Vb = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new int[8192];
        field_Q = "ss.ff";
        field_R = null;
        field_X = "EXCLUSIVE";
    }
}
