/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ulb implements dja {
    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        wfb var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            if (!er.field_o) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                na.field_p = new ka[hsb.field_a.length];
                if (param0 == 100) {
                  break L1;
                } else {
                  ulb.a(-114);
                  break L1;
                }
              }
              var1_int = 0;
              L2: while (true) {
                if (var1_int >= na.field_p.length) {
                  dm.field_b = true;
                  nkb.a(false, "Finished building models");
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (hsb.field_a[var1_int] != null) {
                    na.field_p[var1_int] = og.field_r.a(hsb.field_a[var1_int], -1, -1, 100, 100);
                    if (!dm.field_b) {
                      L3: {
                        L4: {
                          var2 = hab.field_g[var1_int];
                          var14 = ela.a((byte) -109, var2.field_v);
                          var4 = -var14[0] + var14[1];
                          var5 = var14[3] + -var14[2];
                          var6 = na.field_p[var1_int].RA() - na.field_p[var1_int].V();
                          var7 = na.field_p[var1_int].G() - na.field_p[var1_int].HA();
                          if (var2.field_b != 0) {
                            break L4;
                          } else {
                            if (0 != var2.field_i) {
                              break L4;
                            } else {
                              var8 = var6 * var14[0] / var4;
                              na.field_p[var1_int].H(var8, 0, 0);
                              break L3;
                            }
                          }
                        }
                        var8 = var2.field_b * var6 / var4;
                        var9 = -var2.field_i * var7 / var5;
                        na.field_p[var1_int].H(var8, 0, var9);
                        break L3;
                      }
                      na.field_p[var1_int].O(144, 144, 144);
                      var1_int++;
                      continue L2;
                    } else {
                      var1_int++;
                      continue L2;
                    }
                  } else {
                    var1_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ulb.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new jsb[param1]);
    }

    public final tv a(byte param0) {
        int var2 = 34 % ((param0 - -64) / 50);
        return (tv) ((Object) new jsb());
    }

    static {
    }
}
