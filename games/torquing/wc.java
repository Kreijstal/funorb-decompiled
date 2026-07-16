/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends q {
    int field_r;
    int field_m;
    static String field_s;
    int field_o;
    static String field_t;
    long field_l;
    int field_p;
    int field_j;
    int[] field_k;
    int field_n;
    int field_q;

    final static void a(int param0, hi param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= kb.field_b) {
                int dupTemp$4 = param1.a((byte) -72);
                oc.field_b[dupTemp$4] = oc.field_b[dupTemp$4] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (kb.field_b <= var3) {
                    L3: {
                      if (param0 == 10842) {
                        break L3;
                      } else {
                        field_s = null;
                        break L3;
                      }
                    }
                    kb.field_b = var2;
                    int fieldTemp$5 = kb.field_b;
                    kb.field_b = kb.field_b + 1;
                    hi.field_j[fieldTemp$5] = param1;
                    return;
                  } else {
                    L4: {
                      if (param1.field_f == hi.field_j[var3].field_f) {
                        var4 = hi.field_j[var3].a((byte) -72);
                        if (kl.field_r < oc.field_b[var4]) {
                          oc.field_b[var4] = oc.field_b[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    int incrementValue$6 = var2;
                    var2++;
                    hi.field_j[incrementValue$6] = hi.field_j[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (hi.field_j[var2].field_f == param1.field_f) {
                  int dupTemp$7 = hi.field_j[var2].a((byte) -72);
                  oc.field_b[dupTemp$7] = oc.field_b[dupTemp$7] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            oc.field_b[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var5 = Torquing.field_u;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = -var3 + ((var3 << -1583276603) - -ka.a(false, param1.charAt(var4)));
        }
        var4 = -59 % ((-3 - param0) / 47);
        return var3;
    }

    public static void a(int param0) {
        field_s = null;
        if (param0 != 0) {
            wc.a(47);
        }
        field_t = null;
    }

    final static boolean a(boolean param0, int param1) {
        if ((fa.field_b & 1 << param1) != 0) {
            return true;
        }
        if ((m.field_w[param1] ^ -1) == 0) {
            return true;
        }
        if (param0) {
            boolean discarded$0 = wc.a(false, -49);
        }
        if (!ia.a(-22426, m.field_w[param1])) {
            return false;
        }
        return true;
    }

    final static void a(qp param0, byte param1, int param2) {
        tl.field_p.a((byte) 54, (q) (Object) param0);
        if (param1 != 99) {
            field_s = null;
        }
        l.a(param2, param0, 1);
    }

    wc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((wc) this).field_m = param1;
        ((wc) this).field_k = param6;
        ((wc) this).field_r = param3;
        ((wc) this).field_p = param2;
        ((wc) this).field_j = param5;
        ((wc) this).field_o = param4;
        int fieldTemp$0 = cq.field_u;
        cq.field_u = cq.field_u + 1;
        ((wc) this).field_q = 65535 & fieldTemp$0;
        ((wc) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Names can only contain letters, numbers, spaces and underscores";
        field_t = "From only <%0>/month";
    }
}
