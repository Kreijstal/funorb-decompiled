/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends l {
    int field_h;
    boolean field_q;
    int field_j;
    static km field_o;
    int field_k;
    static int[] field_p;
    static String field_m;
    static boolean field_i;
    static String[] field_l;
    int field_n;
    int field_g;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fa var4_ref_fa = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        cm var8 = null;
        hg var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 26360) {
                break L1;
              } else {
                fb.a(-72);
                break L1;
              }
            }
            var9 = sh.field_qb;
            var2 = var9.g(11132);
            if (var2 == 0) {
              var8 = (cm) (Object) di.field_v.a((byte) -51);
              if (var8 == null) {
                tn.a(false);
                return;
              } else {
                L2: {
                  var4 = var9.g(11132);
                  if (var4 != 0) {
                    var13 = new byte[var4];
                    var9.a(0, var4, true, var13);
                    break L2;
                  } else {
                    var5 = null;
                    break L2;
                  }
                }
                var9.field_l = var9.field_l + 4;
                if (var9.e(-29449)) {
                  var8.a(false);
                  break L0;
                } else {
                  tn.a(false);
                  return;
                }
              }
            } else {
              if (var2 != 1) {
                int discarded$2 = 1;
                int discarded$3 = 1;
                en.a("A1: " + rg.a(), (Throwable) null);
                tn.a(false);
                return;
              } else {
                var3 = var9.d((byte) 122);
                var4_ref_fa = (fa) (Object) oi.field_a.a((byte) -65);
                L3: while (true) {
                  L4: {
                    if (var4_ref_fa == null) {
                      break L4;
                    } else {
                      if (var3 == var4_ref_fa.field_i) {
                        break L4;
                      } else {
                        var4_ref_fa = (fa) (Object) oi.field_a.a(16213);
                        continue L3;
                      }
                    }
                  }
                  if (var4_ref_fa != null) {
                    var4_ref_fa.a(false);
                    return;
                  } else {
                    tn.a(false);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "fb.A(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 != 21) {
          fb.a((byte) -26);
          field_l = null;
          field_o = null;
          field_m = null;
          field_p = null;
          return;
        } else {
          field_l = null;
          field_o = null;
          field_m = null;
          field_p = null;
          return;
        }
    }

    fb(int param0, int param1, boolean param2) {
        ((fb) this).field_j = 0;
        ((fb) this).field_g = param1;
        ((fb) this).field_q = param2 ? true : false;
        ((fb) this).field_h = 0;
        ((fb) this).field_k = param0;
    }

    fb(bi param0, boolean param1) {
        try {
            ((fb) this).field_q = param1 ? true : false;
            ((fb) this).field_j = 0;
            ((fb) this).field_g = param0.field_b;
            ((fb) this).field_h = 0;
            ((fb) this).field_n = 0;
            ((fb) this).field_k = param0.field_a;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "fb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[16];
        field_p = new int[8192];
    }
}
