/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends RuntimeException {
    static tv field_c;
    static String field_e;
    Throwable field_b;
    static java.awt.Frame field_f;
    String field_g;
    static String field_a;
    static String field_d;

    public static void c(int param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != 1) {
            field_a = null;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 != -85) {
            return;
        }
        lm.field_g = param2;
        bt.field_g = param1;
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != -1) {
            g.a((byte) 1, -105, -40);
        }
        if (param1 <= -4097) {
            return -6145 > param1 ? -e.field_a[-param1 + 6144] : e.field_a[-6144 + param1];
        }
        return (param1 ^ -1) <= -2049 ? -e.field_a[-2048 + param1] : e.field_a[2048 + -param1];
    }

    final static void a(int param0, kl param1) {
        je var3 = null;
        Object var4 = null;
        je var6 = null;
        je var7 = null;
        L0: {
          tl.field_e = ic.a("display_name_changed", (byte) 51, "basic", param1);
          mw.field_E = new mp(0L, br.field_g, h.field_b, wp.field_y);
          sc.field_g = new mp(0L, br.field_g, lm.field_a, jm.field_u);
          su.field_d = new je(0L, (je) null);
          bn.field_c = new je(0L, eq.field_h);
          bn.field_c.field_Eb = 1;
          wn.field_kb = new je(0L, te.field_p, su.field_b);
          ek.field_a = new je(0L, br.field_e, nl.field_C);
          hm.field_f = new je(0L, ms.field_k);
          su.field_d.a(bn.field_c, 49);
          su.field_d.a(wn.field_kb, 109);
          su.field_d.a(ek.field_a, 49);
          su.field_d.a((je) (Object) mw.field_E, 105);
          su.field_d.a(hm.field_f, 56);
          mw.field_E.field_Kb.field_Nb.a(param0 + 6145, eq.field_h);
          mw.field_E.field_Kb.field_Nb.field_Fb = 1;
          var6 = mw.field_E.field_Kb.field_Nb;
          var7 = var6;
          var7.field_Eb = 1;
          sc.field_g.field_Kb.field_Nb.a(0, eq.field_h);
          if (param0 == -6145) {
            break L0;
          } else {
            var4 = null;
            g.a(-105, (kl) null);
            break L0;
          }
        }
        sc.field_g.field_Kb.field_Nb.field_Fb = 1;
        var3 = sc.field_g.field_Kb.field_Nb;
        var3.field_Eb = 1;
    }

    final static void b(int param0) {
        int var2 = 0;
        L0: {
          var2 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 < gk.field_J) {
            gk.field_J = gk.field_J - 1;
            break L0;
          } else {
            if (-1 <= (bd.field_r ^ -1)) {
              if (rk.field_D >= -1) {
                break L0;
              } else {
                rk.field_D = rk.field_D - 1;
                break L0;
              }
            } else {
              bd.field_r = bd.field_r - 1;
              break L0;
            }
          }
        }
        L1: {
          if (-1 < gk.field_J) {
            bh.d(false);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 > bd.field_r) {
            qb.a(bd.field_r, -71);
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 == -6145) {
          L3: {
            if (-1 >= rk.field_D) {
              break L3;
            } else {
              qb.a(rk.field_D, param0 + 6255);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    g(Throwable param0, String param1) {
        ((g) this).field_b = param0;
        ((g) this).field_g = param1;
    }

    final static boolean a(int param0) {
        dc var1 = null;
        int var2 = 0;
        int var3 = 0;
        dc var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = (dc) (Object) tp.field_e.e((byte) 115);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          L0: {
            if (param0 == -17211) {
              break L0;
            } else {
              field_e = null;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (var2 >= var1.field_p) {
              return true;
            } else {
              L2: {
                if (var4.field_k[var2] != null) {
                  if (-1 == (var4.field_k[var2].field_g ^ -1)) {
                    return false;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (var4.field_r[var2] != null) {
                if (0 == var4.field_r[var2].field_g) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tv();
        field_e = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4>-<%5></col>  Cost:<nbsp><col=ff0000><%6></col>";
        field_a = "If you are not, please change your password to something more obscure!";
        field_d = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
