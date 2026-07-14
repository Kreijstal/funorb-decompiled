/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static dm field_c;
    static rh field_b;
    static int field_d;
    static String field_a;
    static String field_e;

    final static void a(vd param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= oj.field_b) {
                if (param1 == 31274) {
                  p.field_o[param0.c(125)] = p.field_o[param0.c(125)] + 1;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (oj.field_b <= var3) {
                      oj.field_b = var2;
                      oj.field_b = oj.field_b + 1;
                      n.field_k[oj.field_b] = param0;
                      return;
                    } else {
                      L3: {
                        if (param0.field_f == n.field_k[var3].field_f) {
                          var4 = n.field_k[var3].c(124);
                          if (p.field_o[var4] > pc.field_v) {
                            p.field_o[var4] = p.field_o[var4] - 1;
                            var3++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var2++;
                      n.field_k[var2] = n.field_k[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (n.field_k[var2].field_f == param0.field_f) {
                  p.field_o[n.field_k[var2].c(124)] = p.field_o[n.field_k[var2].c(124)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            p.field_o[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != -64) {
            Object var2 = null;
            ki.a((vd) null, -13);
        }
    }

    final static void a(int param0) {
        r.a(rh.field_i, (byte) -61, true, oj.field_a);
        int var1 = -30 % ((param0 - -30) / 36);
        mi.field_I = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dm(540, 140);
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
