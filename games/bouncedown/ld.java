/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends ai {
    static pk field_l;
    boolean field_g;
    int field_k;
    static tg[] field_h;
    int[] field_i;
    static int[] field_j;

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        gf var4_ref_gf = null;
        Object var5 = null;
        int var6 = 0;
        bi var8 = null;
        ii var9 = null;
        byte[] var13 = null;
        var6 = Bounce.field_N;
        var9 = jc.field_g;
        if (param0 > 36) {
          var2 = var9.d((byte) -125);
          if (0 == var2) {
            var8 = (bi) (Object) kk.field_n.a((byte) -123);
            if (var8 != null) {
              L0: {
                var4 = var9.d((byte) -124);
                if (0 != var4) {
                  var13 = new byte[var4];
                  var9.a((byte) 124, var4, var13, 0);
                  break L0;
                } else {
                  var5 = null;
                  break L0;
                }
              }
              var9.field_h = var9.field_h + 4;
              if (!var9.h(-19)) {
                kc.a((byte) 18);
                return;
              } else {
                var8.c(2);
                return;
              }
            } else {
              kc.a((byte) 18);
              return;
            }
          } else {
            if (var2 == 1) {
              var3 = var9.j(-3);
              var4_ref_gf = (gf) (Object) ud.field_k.a((byte) -92);
              L1: while (true) {
                if (var4_ref_gf != null) {
                  if (var3 != var4_ref_gf.field_i) {
                    var4_ref_gf = (gf) (Object) ud.field_k.d((byte) -73);
                    continue L1;
                  } else {
                    if (var4_ref_gf == null) {
                      kc.a((byte) 18);
                      return;
                    } else {
                      var4_ref_gf.c(2);
                      return;
                    }
                  }
                } else {
                  if (var4_ref_gf == null) {
                    kc.a((byte) 18);
                    return;
                  } else {
                    var4_ref_gf.c(2);
                    return;
                  }
                }
              }
            } else {
              ti.a((Throwable) null, (byte) 100, "A1: " + la.a(-119));
              kc.a((byte) 18);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            ld.a(false);
            field_j = null;
            field_h = null;
            field_l = null;
            return;
        }
        field_j = null;
        field_h = null;
        field_l = null;
    }

    ld() {
        ((ld) this).field_g = false;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param2) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3) {
            var4 += 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (!param1) {
          if (param0 < 36) {
            return null;
          } else {
            return tb.field_r[var4];
          }
        } else {
          var4++;
          if (param0 < 36) {
            return null;
          } else {
            return tb.field_r[var4];
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
    }
}
