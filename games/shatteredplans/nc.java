/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends oh {
    nc field_k;
    float field_h;
    ln field_q;
    nc field_r;
    static int field_t;
    static pf field_v;
    static int[] field_p;
    float field_o;
    ln field_u;
    float field_i;
    float field_l;
    float field_j;
    static String field_m;
    float field_s;
    static String field_n;

    final static int a(int param0) {
        if (param0 >= -77) {
            return 20;
        }
        return 1;
    }

    final static void a(nf param0, int param1) {
        int var2 = 0;
        nf var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == 2) {
            break L0;
          } else {
            var5 = null;
            nc.a((nf) null, 0);
            break L0;
          }
        }
        if (param0.field_k == null) {
          return;
        } else {
          L1: {
            L2: {
              if (param0.field_l != 0) {
                break L2;
              } else {
                if (-1 != (param0.field_e ^ -1)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L3: while (true) {
              if (var2 >= da.field_g) {
                break L1;
              } else {
                var3 = wm.field_d[var2];
                if (2 == var3.field_n) {
                  if (param0.field_l == var3.field_l) {
                    if (param0.field_e == var3.field_e) {
                      return;
                    } else {
                      var2++;
                      continue L3;
                    }
                  } else {
                    var2++;
                    continue L3;
                  }
                } else {
                  var2++;
                  continue L3;
                }
              }
            }
          }
          L4: {
            if (param0.field_f != null) {
              jj.field_o = param0.field_b;
              bq.field_e = param0.field_p;
              uo.field_f = param0.field_f;
              tl.field_D = param0.field_n;
              break L4;
            } else {
              break L4;
            }
          }
          ei.a((byte) 70, param0);
          return;
        }
    }

    final static String a(String param0, bc param1, int param2, String param3) {
        if (!param1.b((byte) 115)) {
            return param0;
        }
        int var4 = -57 % ((-25 - param2) / 51);
        return param3 + " - " + param1.d(100) + "%";
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void d(int param0) {
        field_v = null;
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 != -1) {
            field_t = 125;
        }
    }

    nc(ln param0, ln param1) {
        ((nc) this).field_k = null;
        ((nc) this).field_q = param0;
        ((nc) this).field_u = param1;
        ((nc) this).field_r = null;
        ((nc) this).field_o = 10000.0f;
        ((nc) this).field_i = (float)(-((nc) this).field_q.field_S + ((nc) this).field_u.field_S);
        ((nc) this).field_l = (float)(((nc) this).field_u.field_S + ((nc) this).field_q.field_S) / 2.0f;
        ((nc) this).field_s = (float)(((nc) this).field_q.field_A - ((nc) this).field_u.field_A);
        ((nc) this).field_j = -10000.0f;
        ((nc) this).field_h = (float)(((nc) this).field_q.field_A - -((nc) this).field_u.field_A) / 2.0f;
    }

    nc(ln param0, nc param1, nc param2, int param3, int param4, int param5, int param6) {
        ((nc) this).field_h = (float)(param5 + param3) / 2.0f;
        ((nc) this).field_j = -1.0f;
        ((nc) this).field_s = (float)(-param4 + param6) / 2.0f;
        ((nc) this).field_l = (float)(param4 + param6) / 2.0f;
        ((nc) this).field_i = (float)(param5 - param3) / 2.0f;
        ((nc) this).field_k = param2;
        ((nc) this).field_o = 1.0f;
        ((nc) this).field_r = param1;
        ((nc) this).field_u = null;
        ((nc) this).field_q = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = null;
        field_p = new int[12];
        field_m = "Create your own free Jagex account";
        field_n = "You need to play <%0> more rated games to unlock this option.";
        field_t = 0;
    }
}
