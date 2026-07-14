/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fpb extends mfb {
    static String field_b;
    static String field_c;
    static byte[][] field_d;

    final int k(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((fpb) this).f((byte) -51);
            return 0;
        }
        return 0;
    }

    final int a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((fpb) this).b(true);
        }
        return sbb.field_p;
    }

    final static void a(pgb param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var2 = param1;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ou.field_q) {
                dca.field_q[param0.a(1)] = dca.field_q[param0.a(1)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (ou.field_q <= var3) {
                    ou.field_q = var2;
                    ou.field_q = ou.field_q + 1;
                    nrb.field_b[ou.field_q] = param0;
                    return;
                  } else {
                    L3: {
                      if (nrb.field_b[var3].field_a == param0.field_a) {
                        var4 = nrb.field_b[var3].a(1);
                        if (dca.field_q[var4] <= hab.field_k) {
                          break L3;
                        } else {
                          dca.field_q[var4] = dca.field_q[var4] - 1;
                          var3++;
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    nrb.field_b[var2] = nrb.field_b[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param0.field_a == nrb.field_b[var2].field_a) {
                  dca.field_q[nrb.field_b[var2].a(param1 ^ 1)] = dca.field_q[nrb.field_b[var2].a(param1 ^ 1)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            dca.field_q[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void l(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 <= 21) {
            field_d = null;
        }
    }

    final int b(int param0) {
        int var2 = -52 / ((param0 - 7) / 47);
        return sib.field_i;
    }

    final static String d(boolean param0) {
        if (!param0) {
            field_d = null;
        }
        if (!(dw.field_c != dn.field_r)) {
            return mqb.field_x;
        }
        return ht.field_h;
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((fpb) this).k(-51);
        }
        return 35;
    }

    final int g(byte param0) {
        if (param0 > -12) {
            return 70;
        }
        return aea.field_a;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            field_d = null;
        }
        return adb.field_a;
    }

    final int b(boolean param0) {
        if (param0) {
            field_d = null;
        }
        return fd.field_p;
    }

    fpb() {
    }

    final int f(byte param0) {
        if (param0 < 0) {
            int discarded$0 = ((fpb) this).d((byte) -39);
        }
        return ujb.field_h;
    }

    final int c(int param0) {
        if (param0 != 0) {
            return 14;
        }
        return qca.field_wb;
    }

    final int g(int param0) {
        if (param0 != 2769) {
            field_c = null;
        }
        return ls.field_p;
    }

    final int a(byte param0) {
        int var2 = 43 / ((param0 - -48) / 43);
        return oq.field_x;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> cannot join; the game is full.";
        field_c = "Hold the component to deplete the enemy's score";
        field_d = new byte[1000][];
    }
}
