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
              if ((var3 ^ -1) == -3) {
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
              if ((var3 ^ -1) == -3) {
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
        ca.field_d = param1;
        lj.a(param0, 39);
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_n = null;
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (param2 == -8) {
          L0: {
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
            if (param1) {
              var4++;
              return fd.field_f[var4];
            } else {
              return fd.field_f[var4];
            }
          }
        } else {
          L1: {
            field_l = false;
            if (param0) {
              var4 += 4;
              break L1;
            } else {
              break L1;
            }
          }
          if (param3) {
            var4 += 2;
            if (!param1) {
              return fd.field_f[var4];
            } else {
              var4++;
              return fd.field_f[var4];
            }
          } else {
            if (param1) {
              var4++;
              return fd.field_f[var4];
            } else {
              return fd.field_f[var4];
            }
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = EscapeVector.field_A;
        dj.field_b = null;
        if (param0) {
          ei.field_i = false;
          if (!eb.field_H) {
            var1 = am.field_g;
            if (-1 > (var1 ^ -1)) {
              if ((var1 ^ -1) == -2) {
                dj.field_b = cf.field_a;
                dj.field_b = s.a((byte) -31, new CharSequence[3]);
                be.field_b.o(-18861);
                cg.d(32);
                return;
              } else {
                dj.field_b = r.a(mi.field_j, -63, new String[1]);
                dj.field_b = s.a((byte) -31, new CharSequence[3]);
                be.field_b.o(-18861);
                cg.d(32);
                return;
              }
            } else {
              be.field_b.o(-18861);
              cg.d(32);
              return;
            }
          } else {
            be.field_b.r(94);
            return;
          }
        } else {
          field_n = null;
          ei.field_i = false;
          if (!eb.field_H) {
            var1 = am.field_g;
            if (-1 > (var1 ^ -1)) {
              if ((var1 ^ -1) == -2) {
                dj.field_b = cf.field_a;
                dj.field_b = s.a((byte) -31, new CharSequence[3]);
                be.field_b.o(-18861);
                cg.d(32);
                return;
              } else {
                dj.field_b = r.a(mi.field_j, -63, new String[1]);
                dj.field_b = s.a((byte) -31, new CharSequence[3]);
                be.field_b.o(-18861);
                cg.d(32);
                return;
              }
            } else {
              be.field_b.o(-18861);
              cg.d(32);
              return;
            }
          } else {
            be.field_b.r(94);
            return;
          }
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
