/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends vg {
    boolean field_g;
    int[] field_f;

    final static void a(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2, uia param3, uia param4) {
        uu.a(param4.field_h, (byte) -81, param4.field_g, param2, param3, param0, 0);
        if (param1) {
            bna.a((byte) 109);
        }
    }

    final static void a(byte param0) {
        pha var1 = null;
        ht var1_ref = null;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        var1 = (pha) (Object) uma.field_b.f(-80);
        L0: while (true) {
          if (var1 == null) {
            if (param0 == 10) {
              var1_ref = (ht) (Object) asa.field_j.f(-80);
              L1: while (true) {
                if (var1_ref == null) {
                  var1 = (pha) (Object) qha.field_g.f(param0 ^ -70);
                  L2: while (true) {
                    if (var1 == null) {
                      return;
                    } else {
                      L3: {
                        if ((var1.field_xb ^ -1) >= -1) {
                          break L3;
                        } else {
                          var1.field_xb = var1.field_xb - 1;
                          if (var1.field_xb == 0) {
                            var1.field_Lb = 0;
                            if (var1.f(162)) {
                              var1.p(72);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var1 = (pha) (Object) qha.field_g.e(param0 + 101);
                            continue L2;
                          }
                        }
                      }
                      var1 = (pha) (Object) qha.field_g.e(param0 + 101);
                      continue L2;
                    }
                  }
                } else {
                  L4: {
                    if (var1_ref.field_zb <= 0) {
                      break L4;
                    } else {
                      var1_ref.field_zb = var1_ref.field_zb - 1;
                      if (var1_ref.field_zb != 0) {
                        break L4;
                      } else {
                        var1_ref.field_Ib = 0;
                        if (!var1_ref.g(0)) {
                          break L4;
                        } else {
                          var1_ref.p(59);
                          break L4;
                        }
                      }
                    }
                  }
                  var1_ref = (ht) (Object) asa.field_j.e(120);
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            L5: {
              if (var1.field_xb <= 0) {
                break L5;
              } else {
                var1.field_xb = var1.field_xb - 1;
                if (-1 != (var1.field_xb ^ -1)) {
                  break L5;
                } else {
                  var1.field_Lb = 0;
                  if (!var1.f(param0 ^ 168)) {
                    break L5;
                  } else {
                    var1.p(19);
                    break L5;
                  }
                }
              }
            }
            var1 = (pha) (Object) uma.field_b.e(122);
            continue L0;
          }
        }
    }

    bna() {
        ((bna) this).field_g = false;
    }

    static {
    }
}
