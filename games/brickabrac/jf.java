/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String[] field_d;
    private int field_h;
    private int field_j;
    int field_i;
    static mf field_c;
    private ah field_a;
    private int field_e;
    static String field_g;
    private int field_f;
    static mh field_k;
    private boolean field_b;

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = 107 / ((0 - param2) / 63);
          if (99 != param0) {
            if ((param0 ^ -1) == -99) {
              ((jf) this).field_i = ((jf) this).field_i - 1;
              ((jf) this).field_b = true;
              break L0;
            } else {
              break L0;
            }
          } else {
            ((jf) this).field_i = ((jf) this).field_i + 1;
            ((jf) this).field_b = true;
            break L0;
          }
        }
        L1: {
          if (((jf) this).field_i < 0) {
            break L1;
          } else {
            if (((jf) this).field_i < ((jf) this).field_f) {
              return false;
            } else {
              break L1;
            }
          }
        }
        ((jf) this).field_i = -1;
        ((jf) this).field_b = false;
        return true;
    }

    final static jp[] a(jp param0, int param1) {
        int var3 = 48 / ((param1 - 55) / 32);
        jp[] var4 = new jp[9];
        jp[] var2 = var4;
        var4[4] = param0;
        return var2;
    }

    final static void d(int param0) {
        ii var1_ref = null;
        if (param0 != -99) {
            field_g = null;
        }
        ii var1 = (ii) (Object) fr.field_M.a(127);
        if (!(var1 != null)) {
            var1_ref = new ii();
        }
        var1_ref.a(lb.field_l, lb.field_i, lb.field_c, lb.field_d, param0 ^ 194, lb.field_f, lb.field_b, lb.field_j);
        hi.field_v.a((nm) (Object) var1_ref, (byte) 3);
    }

    final static mp a(int param0, String param1) {
        String var2 = null;
        mp var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (tf.field_d != null) {
          L0: {
            var7 = (CharSequence) (Object) param1;
            var2 = gb.a(var7, 85);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var7;
              break L0;
            }
          }
          L1: {
            if (param0 == 0) {
              break L1;
            } else {
              var6 = null;
              mp discarded$2 = jf.a(-82, (String) null);
              break L1;
            }
          }
          var3 = (mp) (Object) tf.field_d.a((long)var2.hashCode(), -1);
          L2: while (true) {
            if (var3 != null) {
              L3: {
                var8 = (CharSequence) (Object) var3.field_Rb;
                var4 = gb.a(var8, param0 + 55);
                if (var4 == null) {
                  var4 = var3.field_Rb;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (!var4.equals((Object) (Object) var2)) {
                var3 = (mp) (Object) tf.field_d.a((byte) -43);
                continue L2;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void b(int param0) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = 26 % ((param0 - 50) / 56);
        q var2 = ((jf) this).field_a.field_m[((jf) this).field_h];
        int var4 = var2.field_c;
        int var5 = var2.field_a;
        for (var6 = 0; var6 < ((jf) this).field_f; var6++) {
            if (!(((jf) this).field_i != var6)) {
                nb.a(-111, var5, var4, cm.field_r[var6]);
                ik.field_f[var6].f(var4, var5 - 1, 256);
            }
            da.field_E[var6].c(var4, var5);
            var5 = var5 + (20 - -da.field_E[var6].field_z);
        }
    }

    final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        q var7 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (((jf) this).field_a.field_h.field_j == ((jf) this).field_h) {
            var7 = ((jf) this).field_a.field_m[((jf) this).field_h];
            if (((jf) this).field_b) {
                // if_icmpne L66
                // if_icmpne L66
            } else {
                var3 = var7.field_c;
                var4 = var7.field_a;
                for (var5 = 0; ((jf) this).field_f > var5; var5++) {
                    if (da.field_E[var5].d(var3, var4, pq.field_k, po.field_a)) {
                        ((jf) this).field_i = var5;
                        break;
                    }
                    var4 = var4 + (da.field_E[var5].field_z + 20);
                }
            }
            ((jf) this).field_e = pq.field_k;
            ((jf) this).field_j = po.field_a;
        } else {
            ((jf) this).field_e = -1;
            ((jf) this).field_b = false;
            ((jf) this).field_j = -1;
            ((jf) this).field_i = -1;
        }
        if (param0 <= 84) {
            ((jf) this).field_h = 25;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_d = null;
        field_c = null;
        field_k = null;
        field_g = null;
    }

    final void c(int param0) {
        ((jf) this).field_i = param0 + ((jf) this).field_f;
        ((jf) this).field_j = po.field_a;
        ((jf) this).field_e = pq.field_k;
        ((jf) this).field_b = true;
    }

    final void a(byte param0) {
        ((jf) this).field_b = true;
        ((jf) this).field_j = po.field_a;
        if (param0 <= 32) {
            return;
        }
        ((jf) this).field_e = pq.field_k;
        ((jf) this).field_i = 0;
    }

    jf(ah param0, int param1, int param2) {
        ((jf) this).field_i = -1;
        ((jf) this).field_f = param2;
        ((jf) this).field_h = param1;
        ((jf) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Levels"};
        field_g = "Quit";
    }
}
