/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jma extends at {
    private rv field_j;
    static String field_m;
    private int field_k;
    private gj field_l;

    final boolean c(byte param0) {
        pp var2 = null;
        int var3 = 0;
        ad var3_ref_ad = null;
        oha var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        int fieldTemp$1 = ((jma) this).field_k - 1;
        ((jma) this).field_k = ((jma) this).field_k - 1;
        if (0 >= fieldTemp$1) {
          var2 = (pp) (Object) ((jma) this).field_j.field_m.b((byte) 90);
          L0: while (true) {
            if (var2 == null) {
              var3 = -99 % ((param0 - 71) / 47);
              return true;
            } else {
              if (null != var2.field_h) {
                L1: {
                  var3_ref_ad = var2.field_h.a(-27449, ((jma) this).field_l);
                  if (var3_ref_ad == null) {
                    break L1;
                  } else {
                    L2: {
                      var2.a((aga) null, ((jma) this).field_l.field_h, 12);
                      if (var2 instanceof mh) {
                        ((jma) this).a(27799, (at) (Object) new jk(((jma) this).field_l, var3_ref_ad, (mh) (Object) var2));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (!(var2 instanceof ks)) {
                      if (var2 instanceof kt) {
                        var4 = al.a(101, var3_ref_ad.field_s.field_o.field_g.field_b[var3_ref_ad.field_s.field_m[((kt) (Object) var2).field_l]]);
                        if (((jma) this).field_l.field_n == var3_ref_ad.field_s.field_D) {
                          var3_ref_ad.a(24831, 97, lga.a(true, new String[1], rh.field_a));
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (var2.field_f >= 0) {
                          if (0 >= var2.field_f) {
                            if (!(var2 instanceof lia)) {
                              break L1;
                            } else {
                              if (-1 != ((lia) (Object) var2).field_k) {
                                var3_ref_ad.a(24831, 17, kna.field_g[((lia) (Object) var2).field_k]);
                                break L1;
                              } else {
                                var2 = (pp) (Object) ((jma) this).field_j.field_m.c(0);
                                continue L0;
                              }
                            }
                          } else {
                            ((jma) this).a(27799, (at) (Object) new ek(((jma) this).field_l, var3_ref_ad, var2.field_f));
                            break L1;
                          }
                        } else {
                          var3_ref_ad.a(65280, 22, Integer.toString(-var2.field_f));
                          break L1;
                        }
                      }
                    } else {
                      var3_ref_ad.a(65280, 63, hs.field_c);
                      break L1;
                    }
                  }
                }
                var2 = (pp) (Object) ((jma) this).field_j.field_m.c(0);
                continue L0;
              } else {
                var2 = (pp) (Object) ((jma) this).field_j.field_m.c(0);
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void d(int param0) {
        field_m = null;
    }

    jma(gj param0, rv param1) {
        try {
            ((jma) this).field_l = param0;
            ((jma) this).field_k = 25;
            ((jma) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jma.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Resign";
    }
}
