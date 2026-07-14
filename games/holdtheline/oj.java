/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    final static void a(byte param0) {
        vi var1 = null;
        vi var1_ref = null;
        int var2 = 0;
        vi var3 = null;
        var2 = HoldTheLine.field_D;
        if (param0 >= 78) {
          if (null != bd.field_Q) {
            if (-1 != ab.field_jb) {
              L0: {
                var1 = gh.field_n[ab.field_jb];
                if (var1 != null) {
                  break L0;
                } else {
                  var3 = vi.a(bd.field_Q, em.field_m[ab.field_jb], "");
                  var1_ref = var3;
                  if (vi.a(bd.field_Q, em.field_m[ab.field_jb], "") != null) {
                    gh.field_n[ab.field_jb] = var3;
                    break L0;
                  } else {
                    return;
                  }
                }
              }
              if (vl.field_d.field_q.a(22050, jh.field_a, var1_ref, false, pd.field_f)) {
                i.field_k[ab.field_jb] = var1_ref;
                ab.field_jb = -1;
                oc.field_a = oc.field_a - 1;
                if (-1 != (oc.field_a - 1 ^ -1)) {
                  if (bi.field_e != 2) {
                    if (1 == bi.field_e) {
                      if (lc.field_d != null) {
                        if (!ai.field_a.a(-98, lc.field_d)) {
                          gn.a(true, var1_ref, (byte) 69, 30);
                          lc.field_d = null;
                          return;
                        } else {
                          ec.field_D = var1_ref;
                          return;
                        }
                      } else {
                        gn.a(true, var1_ref, (byte) 69, 30);
                        lc.field_d = null;
                        return;
                      }
                    } else {
                      gn.a(true, var1_ref, (byte) 69, 30);
                      lc.field_d = null;
                      return;
                    }
                  } else {
                    lc.field_d = var1_ref;
                    gn.a(false, var1_ref, (byte) 69, 30);
                    return;
                  }
                } else {
                  vl.field_d.field_q.e(0);
                  jh.field_a = null;
                  if (bi.field_e != 2) {
                    if (1 == bi.field_e) {
                      if (lc.field_d != null) {
                        if (!ai.field_a.a(-98, lc.field_d)) {
                          gn.a(true, var1_ref, (byte) 69, 30);
                          lc.field_d = null;
                          return;
                        } else {
                          ec.field_D = var1_ref;
                          return;
                        }
                      } else {
                        gn.a(true, var1_ref, (byte) 69, 30);
                        lc.field_d = null;
                        return;
                      }
                    } else {
                      gn.a(true, var1_ref, (byte) 69, 30);
                      lc.field_d = null;
                      return;
                    }
                  } else {
                    lc.field_d = var1_ref;
                    gn.a(false, var1_ref, (byte) 69, 30);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(hj[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        if (param0 != null) {
          if (param5 > 0) {
            var6 = param0[0].field_o;
            var7 = param0[2].field_o;
            var8 = param0[1].field_o;
            param0[0].a(param2, param3, param1);
            param0[2].a(-var7 + (param5 + param2), param3, param1);
            tc.b(hi.field_W);
            tc.e(param2 - -var6, param3, param2 - -param5 + -var7, param3 - -param0[1].field_v);
            var9 = var6 + param2;
            var10 = param2 - (-param5 - -var7);
            if (param4 > -73) {
              return;
            } else {
              param2 = var9;
              L0: while (true) {
                if (param2 >= var10) {
                  tc.a(hi.field_W);
                  return;
                } else {
                  param0[1].a(param2, param3, param1);
                  param2 = param2 + var8;
                  continue L0;
                }
              }
            }
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
