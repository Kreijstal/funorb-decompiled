/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rhb extends rqa {
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 225) {
            Object var2 = null;
            boolean discarded$0 = rhb.a(52, (int[]) null);
        }
    }

    rhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int[] param1) {
        long var2 = 0L;
        c var4_ref_c = null;
        int var4 = 0;
        int var5_int = 0;
        c var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (tc.field_c == sp.field_o) {
          L0: {
            var2 = wt.a(false);
            if (param0 == cd.field_c) {
              break L0;
            } else {
              if (-1 < (kcb.field_p ^ -1)) {
                var4_ref_c = (c) (Object) mlb.field_q.d(param0 + 0);
                if (var4_ref_c == null) {
                  break L0;
                } else {
                  if (var4_ref_c.field_e < var2) {
                    var4_ref_c.b(-3846);
                    vja.field_a = var4_ref_c.field_f.length;
                    qga.field_b.field_e = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (var5_int >= vja.field_a) {
                        iq.field_a = foa.field_o;
                        foa.field_o = fd.field_r;
                        fd.field_r = ow.field_a;
                        ow.field_a = var4_ref_c.field_d;
                        return true;
                      } else {
                        qga.field_b.field_h[var5_int] = var4_ref_c.field_f[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: while (true) {
            L3: {
              if (0 <= kcb.field_p) {
                break L3;
              } else {
                qga.field_b.field_e = 0;
                if (boa.a(1, 30000)) {
                  kcb.field_p = qga.field_b.o(255);
                  qga.field_b.field_e = 0;
                  vja.field_a = param1[kcb.field_p];
                  break L3;
                } else {
                  return false;
                }
              }
            }
            if (!ci.b((byte) 51)) {
              return false;
            } else {
              if (cd.field_c == 0) {
                iq.field_a = foa.field_o;
                foa.field_o = fd.field_r;
                fd.field_r = ow.field_a;
                ow.field_a = kcb.field_p;
                kcb.field_p = -1;
                return true;
              } else {
                L4: {
                  var4 = cd.field_c;
                  if (aib.field_c == 0.0) {
                    break L4;
                  } else {
                    var4 = (int)((double)var4 + jeb.field_b.nextGaussian() * aib.field_c);
                    if (var4 >= 0) {
                      break L4;
                    } else {
                      var4 = 0;
                      break L4;
                    }
                  }
                }
                var5 = new c((long)var4 + var2, kcb.field_p, new byte[vja.field_a]);
                var6 = 0;
                L5: while (true) {
                  if (var6 >= vja.field_a) {
                    mlb.field_q.b(param0 ^ -10258, (ksa) (Object) var5);
                    kcb.field_p = -1;
                    continue L2;
                  } else {
                    var5.field_f[var6] = qga.field_b.field_h[var6];
                    var6++;
                    continue L5;
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(225, 79));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Real-life threats";
    }
}
