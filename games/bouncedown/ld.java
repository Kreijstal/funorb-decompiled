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

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        gf var4_ref_gf = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        bi var8 = null;
        ii var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            var9 = jc.field_g;
            var2 = var9.d((byte) -125);
            if (0 == var2) {
              var8 = (bi) (Object) kk.field_n.a((byte) -123);
              if (var8 != null) {
                L1: {
                  var4 = var9.d((byte) -124);
                  if (0 != var4) {
                    var13 = new byte[var4];
                    var9.a((byte) 124, var4, var13, 0);
                    break L1;
                  } else {
                    var5 = null;
                    break L1;
                  }
                }
                var9.field_h = var9.field_h + 4;
                if (var9.h(-19)) {
                  var8.c(2);
                  break L0;
                } else {
                  int discarded$8 = 18;
                  kc.a();
                  return;
                }
              } else {
                int discarded$9 = 18;
                kc.a();
                return;
              }
            } else {
              if (var2 == 1) {
                var3 = var9.j(-3);
                var4_ref_gf = (gf) (Object) ud.field_k.a((byte) -92);
                L2: while (true) {
                  L3: {
                    if (var4_ref_gf == null) {
                      break L3;
                    } else {
                      if (var3 == var4_ref_gf.field_i) {
                        break L3;
                      } else {
                        var4_ref_gf = (gf) (Object) ud.field_k.d((byte) -73);
                        continue L2;
                      }
                    }
                  }
                  if (var4_ref_gf != null) {
                    var4_ref_gf.c(2);
                    return;
                  } else {
                    int discarded$10 = 18;
                    kc.a();
                    return;
                  }
                }
              } else {
                ti.a((Throwable) null, (byte) 100, "A1: " + la.a(-119));
                int discarded$11 = 18;
                kc.a();
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "ld.C(" + 120 + 41);
        }
    }

    public static void a() {
        field_j = null;
        field_h = null;
        field_l = null;
    }

    ld() {
        ((ld) this).field_g = false;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param2)) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        return tb.field_r[var4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
    }
}
