/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ulb implements dja {
    final static void a(int param0) {
        int var1 = 0;
        wfb var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        var10 = VoidHunters.field_G;
        if (!er.field_o) {
          return;
        } else {
          L0: {
            na.field_p = new ka[hsb.field_a.length];
            if (param0 == 100) {
              break L0;
            } else {
              ulb.a(-114);
              break L0;
            }
          }
          var1 = 0;
          L1: while (true) {
            if (var1 >= na.field_p.length) {
              dm.field_b = true;
              nkb.a(false, "Finished building models");
              return;
            } else {
              if (hsb.field_a[var1] != null) {
                na.field_p[var1] = og.field_r.a(hsb.field_a[var1], -1, -1, 100, 100);
                if (!dm.field_b) {
                  L2: {
                    L3: {
                      var2 = hab.field_g[var1];
                      var14 = ela.a((byte) -109, var2.field_v);
                      var4 = -var14[0] + var14[1];
                      var5 = var14[3] + -var14[2];
                      var6 = na.field_p[var1].RA() - na.field_p[var1].V();
                      var7 = na.field_p[var1].G() - na.field_p[var1].HA();
                      if (var2.field_b != 0) {
                        break L3;
                      } else {
                        if (0 != var2.field_i) {
                          break L3;
                        } else {
                          var8 = var6 * var14[0] / var4;
                          na.field_p[var1].H(var8, 0, 0);
                          break L2;
                        }
                      }
                    }
                    var8 = var2.field_b * var6 / var4;
                    var9 = -var2.field_i * var7 / var5;
                    na.field_p[var1].H(var8, 0, var9);
                    break L2;
                  }
                  na.field_p[var1].O(144, 144, 144);
                  var1++;
                  continue L1;
                } else {
                  var1++;
                  continue L1;
                }
              } else {
                var1++;
                continue L1;
              }
            }
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new jsb[param1];
    }

    public final tv a(byte param0) {
        int var2 = 34 % ((param0 - -64) / 50);
        return (tv) (Object) new jsb();
    }

    static {
    }
}
