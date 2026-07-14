/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private int field_f;
    static volatile boolean field_e;
    static byte[][] field_b;
    private uf field_g;
    private uf[] field_d;
    private int field_c;
    private uf field_a;

    final static void a(int param0, ci param1) {
        ja.c((byte) -52);
        if (param0 != 1) {
            Object var3 = null;
            il.a(74, (ci) null);
            l.a(param1.field_z, param1.field_q, param1.field_u);
            return;
        }
        l.a(param1.field_z, param1.field_q, param1.field_u);
    }

    final void a(uf param0, long param1, byte param2) {
        uf var5 = null;
        if (param2 >= -62) {
            uf discarded$8 = ((il) this).a(false);
            if (!(null == param0.field_a)) {
                param0.b((byte) 12);
            }
            var5 = ((il) this).field_d[(int)((long)(((il) this).field_c - 1) & param1)];
            param0.field_d = var5;
            param0.field_a = var5.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            param0.field_g = param1;
            return;
        }
        if (!(null == param0.field_a)) {
            param0.b((byte) 12);
        }
        var5 = ((il) this).field_d[(int)((long)(((il) this).field_c - 1) & param1)];
        param0.field_d = var5;
        param0.field_a = var5.field_a;
        param0.field_a.field_d = param0;
        param0.field_d.field_a = param0;
        param0.field_g = param1;
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = 117 / ((50 - param0) / 52);
    }

    final static ci a(String param0, String param1, fa param2, int param3) {
        int var4 = param2.c(param3, param1);
        int var5 = param2.a(-117, var4, param0);
        return hl.a(param2, var5, (byte) -90, var4);
    }

    final uf a(byte param0, long param1) {
        uf var4 = null;
        uf var5 = null;
        int var6 = 0;
        uf var7 = null;
        uf var8 = null;
        var6 = Terraphoenix.field_V;
        if (param0 == 46) {
          var7 = ((il) this).field_d[(int)((long)(-1 + ((il) this).field_c) & param1)];
          var4 = var7;
          ((il) this).field_g = var7.field_d;
          L0: while (true) {
            if (var4 == ((il) this).field_g) {
              ((il) this).field_g = null;
              return null;
            } else {
              if (((il) this).field_g.field_g == param1) {
                var5 = ((il) this).field_g;
                ((il) this).field_g = ((il) this).field_g.field_d;
                return var5;
              } else {
                ((il) this).field_g = ((il) this).field_g.field_d;
                continue L0;
              }
            }
          }
        } else {
          ((il) this).field_g = null;
          var8 = ((il) this).field_d[(int)((long)(-1 + ((il) this).field_c) & param1)];
          var4 = var8;
          ((il) this).field_g = var8.field_d;
          L1: while (true) {
            if (var4 == ((il) this).field_g) {
              ((il) this).field_g = null;
              return null;
            } else {
              if (((il) this).field_g.field_g == param1) {
                var5 = ((il) this).field_g;
                ((il) this).field_g = ((il) this).field_g.field_d;
                return var5;
              } else {
                ((il) this).field_g = ((il) this).field_g.field_d;
                continue L1;
              }
            }
          }
        }
    }

    final uf a(byte param0) {
        ((il) this).field_f = 0;
        if (param0 != 117) {
            return null;
        }
        return ((il) this).a(true);
    }

    final uf a(boolean param0) {
        int var3 = 0;
        uf var4 = null;
        uf var5 = null;
        uf var9 = null;
        uf var12 = null;
        var3 = Terraphoenix.field_V;
        if ((((il) this).field_f ^ -1) < -1) {
          if (((il) this).field_a != ((il) this).field_d[-1 + ((il) this).field_f]) {
            var12 = ((il) this).field_a;
            ((il) this).field_a = var12.field_d;
            return var12;
          } else {
            if (!param0) {
              return null;
            } else {
              L0: while (true) {
                if (((il) this).field_f < ((il) this).field_c) {
                  ((il) this).field_f = ((il) this).field_f + 1;
                  var4 = ((il) this).field_d[((il) this).field_f].field_d;
                  var9 = var4;
                  if (var4 == ((il) this).field_d[((il) this).field_f - 1]) {
                    continue L0;
                  } else {
                    ((il) this).field_a = var9.field_d;
                    return var9;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          if (!param0) {
            return null;
          } else {
            L1: while (true) {
              if (((il) this).field_f < ((il) this).field_c) {
                ((il) this).field_f = ((il) this).field_f + 1;
                var4 = ((il) this).field_d[((il) this).field_f].field_d;
                var5 = var4;
                if (var4 == ((il) this).field_d[((il) this).field_f - 1]) {
                  continue L1;
                } else {
                  ((il) this).field_a = var5.field_d;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 < 70) {
            Object var3 = null;
            ci discarded$0 = il.a((String) null, (String) null, (fa) null, -14);
            return nj.field_i.a("", param1, -21653);
        }
        return nj.field_i.a("", param1, -21653);
    }

    il(int param0) {
        int var2 = 0;
        uf var3 = null;
        ((il) this).field_f = 0;
        ((il) this).field_d = new uf[param0];
        ((il) this).field_c = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new uf();
            ((il) this).field_d[var2] = new uf();
            var3.field_d = var3;
            var3.field_a = var3;
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
        field_b = new byte[1000][];
        field_e = true;
    }
}
