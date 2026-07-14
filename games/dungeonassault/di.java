/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    String field_g;
    int field_h;
    int field_a;
    String field_c;
    String field_i;
    static boolean field_e;
    int field_f;
    int field_j;
    static String field_k;
    int field_b;
    static int field_d;
    static cn[] field_l;

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        ao var4_ref_ao = null;
        int var4 = 0;
        int var5_int = 0;
        ao var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = DungeonAssault.field_K;
        if (pd.field_A == qa.field_c) {
          L0: {
            if (param1 == -1) {
              break L0;
            } else {
              var8 = null;
              boolean discarded$1 = di.a((int[]) null, -88);
              break L0;
            }
          }
          L1: {
            var2 = kd.c(-2456);
            if (pm.field_p == 0) {
              break L1;
            } else {
              if (0 <= pp.field_J) {
                break L1;
              } else {
                var4_ref_ao = (ao) (Object) nl.field_e.e(-24172);
                if (var4_ref_ao == null) {
                  break L1;
                } else {
                  if ((var2 ^ -1L) < (var4_ref_ao.field_l ^ -1L)) {
                    var4_ref_ao.a(false);
                    nj.field_b = var4_ref_ao.field_m.length;
                    ra.field_c.field_o = 0;
                    var5_int = 0;
                    L2: while (true) {
                      if (var5_int >= nj.field_b) {
                        wl.field_f = oc.field_E;
                        oc.field_E = rd.field_C;
                        rd.field_C = hc.field_c;
                        hc.field_c = var4_ref_ao.field_j;
                        return true;
                      } else {
                        ra.field_c.field_m[var5_int] = var4_ref_ao.field_m[var5_int];
                        var5_int++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L3: while (true) {
            L4: {
              if (-1 >= (pp.field_J ^ -1)) {
                break L4;
              } else {
                ra.field_c.field_o = 0;
                if (!oi.a(-12929, 1)) {
                  return false;
                } else {
                  pp.field_J = ra.field_c.m(255);
                  ra.field_c.field_o = 0;
                  nj.field_b = param0[pp.field_J];
                  break L4;
                }
              }
            }
            if (!kh.d((byte) -117)) {
              return false;
            } else {
              if (pm.field_p == 0) {
                wl.field_f = oc.field_E;
                oc.field_E = rd.field_C;
                rd.field_C = hc.field_c;
                hc.field_c = pp.field_J;
                pp.field_J = -1;
                return true;
              } else {
                L5: {
                  var4 = pm.field_p;
                  if (qi.field_a != 0.0) {
                    var4 = (int)((double)var4 + bl.field_i.nextGaussian() * qi.field_a);
                    if ((var4 ^ -1) > -1) {
                      var4 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var5 = new ao((long)var4 + var2, pp.field_J, new byte[nj.field_b]);
                var6 = 0;
                L6: while (true) {
                  if (nj.field_b <= var6) {
                    nl.field_e.a((ne) (Object) var5, false);
                    pp.field_J = -1;
                    continue L3;
                  } else {
                    var5.field_m[var6] = ra.field_c.field_m[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final void a(ec param0, int param1) {
        ((di) this).field_i = param0.a(-21030);
        if (param1 != -1) {
            Object var4 = null;
            ((di) this).a((ec) null, -21);
        }
        ((di) this).field_g = param0.a(-21030);
        ((di) this).field_c = param0.a(-21030);
        String discarded$0 = param0.a(param1 ^ 21029);
        ((di) this).field_j = rm.a(param0, 6065);
        int discarded$1 = rm.a(param0, 6065);
        int discarded$2 = rm.a(param0, param1 + 6066);
        ((di) this).field_a = param0.f(param1 + -101);
        ((di) this).field_f = param0.f(param1 ^ 125);
        ((di) this).field_h = param0.f(-117);
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != -78) {
            field_k = null;
        }
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_k = "This password contains repeated characters, and would be easy to guess";
    }
}
