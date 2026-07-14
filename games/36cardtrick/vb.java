/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    private int field_d;
    static bk field_e;
    private qb field_i;
    private qb field_g;
    static int[] field_a;
    private int field_j;
    private qb[] field_f;
    static int field_b;
    static kc field_k;
    static ej field_h;
    static bk field_c;

    final qb b(int param0) {
        if (param0 >= -31) {
            return (qb) null;
        }
        ((vb) this).field_j = 0;
        return ((vb) this).a(true);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_k = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_h = null;
    }

    final qb a(boolean param0) {
        int var3 = 0;
        qb var4 = null;
        qb var5 = null;
        qb var36 = null;
        qb var37 = null;
        qb var38 = null;
        qb var39 = null;
        qb var42 = null;
        var3 = Main.field_T;
        if (param0) {
          if ((((vb) this).field_j ^ -1) < -1) {
            if (((vb) this).field_f[((vb) this).field_j + -1] != ((vb) this).field_i) {
              var42 = ((vb) this).field_i;
              ((vb) this).field_i = ((qb) var42).field_d;
              return var42;
            } else {
              L0: while (true) {
                if (((vb) this).field_j < ((vb) this).field_d) {
                  ((vb) this).field_j = ((vb) this).field_j + 1;
                  var4 = ((vb) this).field_f[((vb) this).field_j].field_d;
                  var39 = var4;
                  if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                    continue L0;
                  } else {
                    ((vb) this).field_i = ((qb) var39).field_d;
                    return var39;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L1: while (true) {
              if (((vb) this).field_j < ((vb) this).field_d) {
                ((vb) this).field_j = ((vb) this).field_j + 1;
                var4 = ((vb) this).field_f[((vb) this).field_j].field_d;
                var38 = var4;
                if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                  continue L1;
                } else {
                  ((vb) this).field_i = ((qb) var38).field_d;
                  return var38;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          ((vb) this).field_g = (qb) null;
          if ((((vb) this).field_j ^ -1) < -1) {
            if (((vb) this).field_f[((vb) this).field_j + -1] != ((vb) this).field_i) {
              var36 = ((vb) this).field_i;
              ((vb) this).field_i = ((qb) var36).field_d;
              return var36;
            } else {
              L2: while (true) {
                if (((vb) this).field_j < ((vb) this).field_d) {
                  ((vb) this).field_j = ((vb) this).field_j + 1;
                  var4 = ((vb) this).field_f[((vb) this).field_j].field_d;
                  var37 = var4;
                  if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                    continue L2;
                  } else {
                    ((vb) this).field_i = ((qb) var37).field_d;
                    return var37;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (((vb) this).field_j < ((vb) this).field_d) {
                ((vb) this).field_j = ((vb) this).field_j + 1;
                var4 = ((vb) this).field_f[((vb) this).field_j].field_d;
                var5 = var4;
                if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                  continue L3;
                } else {
                  ((vb) this).field_i = ((qb) var5).field_d;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final void a(long param0, byte param1, qb param2) {
        qb var5 = null;
        if (((qb) param2).field_a != null) {
            param2.c(106);
            var5 = ((vb) this).field_f[(int)((long)(-1 + ((vb) this).field_d) & param0)];
            param2.field_d = var5;
            param2.field_a = ((qb) var5).field_a;
            ((qb) param2).field_a.field_d = param2;
            ((qb) param2).field_d.field_a = param2;
            param2.field_e = param0;
            if (param1 >= 24) {
                return;
            }
            qb discarded$0 = ((vb) this).a(true);
            return;
        }
        var5 = ((vb) this).field_f[(int)((long)(-1 + ((vb) this).field_d) & param0)];
        param2.field_d = var5;
        param2.field_a = ((qb) var5).field_a;
        ((qb) param2).field_a.field_d = param2;
        ((qb) param2).field_d.field_a = param2;
        param2.field_e = param0;
        if (param1 >= 24) {
            return;
        }
        qb discarded$1 = ((vb) this).a(true);
    }

    final static void a(byte param0) {
        if (param0 < 1) {
            return;
        }
        Main.field_G = 0;
        ti.field_a = -1;
        t.field_e = null;
        k.field_b = false;
        p.field_k = -1;
    }

    final qb a(boolean param0, long param1) {
        qb var4 = null;
        qb var5 = null;
        int var6 = 0;
        qb var7 = null;
        qb var8 = null;
        qb var9 = null;
        var6 = Main.field_T;
        if (!param0) {
          var8 = ((vb) this).field_f[(int)(param1 & (long)(((vb) this).field_d - 1))];
          var4 = var8;
          ((vb) this).field_g = ((qb) var8).field_d;
          L0: while (true) {
            if (var4 == ((vb) this).field_g) {
              ((vb) this).field_g = null;
              return null;
            } else {
              if ((((vb) this).field_g.field_e ^ -1L) == (param1 ^ -1L)) {
                var5 = ((vb) this).field_g;
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                return var5;
              } else {
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                continue L0;
              }
            }
          }
        } else {
          var7 = (qb) null;
          ((vb) this).a(47L, (byte) 72, (qb) null);
          var9 = ((vb) this).field_f[(int)(param1 & (long)(((vb) this).field_d - 1))];
          var4 = var9;
          ((vb) this).field_g = ((qb) var9).field_d;
          L1: while (true) {
            if (var4 == ((vb) this).field_g) {
              ((vb) this).field_g = null;
              return null;
            } else {
              if ((((vb) this).field_g.field_e ^ -1L) == (param1 ^ -1L)) {
                var5 = ((vb) this).field_g;
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                return var5;
              } else {
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                continue L1;
              }
            }
          }
        }
    }

    vb(int param0) {
        int var2 = 0;
        qb var3 = null;
        ((vb) this).field_j = 0;
        ((vb) this).field_f = new qb[param0];
        ((vb) this).field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new qb();
            ((vb) this).field_f[var2] = new qb();
            var3.field_d = (qb) var3;
            var3.field_a = (qb) var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{65527, 65528};
        field_e = new bk();
        field_c = new bk();
    }
}
