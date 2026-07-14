/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fda extends pp {
    static java.awt.Frame field_j;
    static kv field_m;
    static vr field_l;
    static qh field_i;
    static vr field_k;

    fda(nq param0) {
        ((fda) this).field_h = param0;
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (param0 != -1) {
            int discarded$0 = fda.b(-55);
        }
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = tea.a(var10, param1, 50);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = 1 + var8;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    final static int a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            fda.a((gs) null, 109);
        }
        return (int)(1000000000L / fe.field_h);
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = BachelorFridge.field_y;
        boolean discarded$10 = gja.field_m.a(true, hk.field_e, tq.field_q, param0 ^ 6380);
        gja.field_m.i(0);
        while (kaa.b(127)) {
            boolean discarded$11 = gja.field_m.a(dla.field_j, (byte) 7, gf.field_k);
        }
        if ((la.field_r ^ -1) != 0) {
            var1 = la.field_r;
            ep.a(-1, param0 + 8191);
            return var1;
        }
        if (!(!eea.field_b)) {
            return 3;
        }
        if (!(kq.field_j != dka.field_G)) {
            return 1;
        }
        if (!ut.field_m.a(false)) {
            return 1;
        }
        if (param0 != 1) {
            return -103;
        }
        if (!(kq.field_j != ola.field_p)) {
            return 2;
        }
        return -1;
    }

    public static void d(byte param0) {
        if (param0 != 25) {
            field_j = null;
        }
        field_m = null;
        field_l = null;
        field_i = null;
        field_k = null;
        field_j = null;
    }

    final void a(aga param0, op param1, int param2) {
        aga var4 = ((fda) this).field_h.a(103, param1);
        if (!(var4 != null)) {
            return;
        }
        var4.field_A = false;
        var4.j(param2 ^ -98);
        if (param2 != 12) {
            field_l = null;
        }
    }

    final void a(lu param0, byte param1) {
        er.a(((fda) this).field_h, 109, param0);
        int var3 = -94 % ((param1 - 34) / 58);
    }

    final static void a(gs param0, int param1) {
        int var2 = 0;
        gs var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0.field_n != null) {
          if (param1 == 3100) {
            L0: {
              L1: {
                if (param0.field_m != 0) {
                  break L1;
                } else {
                  if (param0.field_j == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= qs.field_n) {
                  break L0;
                } else {
                  var3 = kw.field_k[var2];
                  if ((var3.field_p ^ -1) == -3) {
                    if (var3.field_m == param0.field_m) {
                      if (var3.field_j == param0.field_j) {
                        return;
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param0.field_o != null) {
                dda.field_l = param0.field_g;
                cp.field_d = param0.field_p;
                w.field_g = param0.field_a;
                fl.field_p = param0.field_o;
                break L3;
              } else {
                break L3;
              }
            }
            ija.a((byte) -100, param0);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
