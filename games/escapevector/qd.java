/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends hg {
    int field_j;
    int field_k;
    int field_i;
    int field_h;
    int field_m;
    static cn field_n;
    int field_g;
    static volatile boolean field_l;

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 < -85) {
          var2 = dh.field_e.length;
          if (0 <= param0) {
            if (var2 > param0) {
              var3 = dh.field_e[param0];
              if (var3 == 2) {
                if (bj.e((byte) -56)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_n = null;
          var2 = dh.field_e.length;
          if (0 <= param0) {
            if (var2 > param0) {
              var3 = dh.field_e[param0];
              if (var3 == 2) {
                if (!bj.e((byte) -56)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, String param1) {
        try {
            ca.field_d = param1;
            lj.a(param0, 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qd.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b() {
        field_n = null;
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param0) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param3) {
          if (param1) {
            var4++;
            return fd.field_f[var4];
          } else {
            return fd.field_f[var4];
          }
        } else {
          var4 += 2;
          if (!param1) {
            return fd.field_f[var4];
          } else {
            var4++;
            return fd.field_f[var4];
          }
        }
    }

    final static void a() {
        int var1 = 0;
        int var2 = 0;
        var2 = EscapeVector.field_A;
        dj.field_b = null;
        ei.field_i = false;
        if (!eb.field_H) {
          var1 = am.field_g;
          if (var1 > 0) {
            if (var1 == 1) {
              dj.field_b = cf.field_a;
              dj.field_b = s.a((byte) -31, new CharSequence[3]);
              be.field_b.o(-18861);
              int discarded$5 = 32;
              cg.d();
              return;
            } else {
              dj.field_b = r.a(mi.field_j, -63, new String[1]);
              dj.field_b = s.a((byte) -31, new CharSequence[3]);
              be.field_b.o(-18861);
              int discarded$6 = 32;
              cg.d();
              return;
            }
          } else {
            be.field_b.o(-18861);
            int discarded$7 = 32;
            cg.d();
            return;
          }
        } else {
          be.field_b.r(94);
          return;
        }
    }

    qd(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((qd) this).field_j = param4;
        ((qd) this).field_i = param3;
        ((qd) this).field_g = param5;
        ((qd) this).field_k = param2;
        ((qd) this).field_h = param1;
        ((qd) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new cn();
        field_l = true;
    }
}
