/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends f implements bp {
    private dl field_F;
    static wa[] field_J;
    static String field_E;
    static qr field_D;
    static String field_M;
    static int field_L;
    private kg[] field_I;
    static eb field_K;
    static bi field_H;
    private String[] field_G;

    public static void a(int param0) {
        if (param0 != 9075) {
            bj.a(-83);
        }
        field_E = null;
        field_D = null;
        field_M = null;
        field_K = null;
        field_J = null;
        field_H = null;
    }

    final static void k(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = ShatteredPlansClient.field_F ? 1 : 0;
          nm.field_a = -1 + gf.field_k;
          if (param0 == 26987) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        L1: {
          L2: {
            er.field_i = 0;
            if (field_J == null) {
              break L2;
            } else {
              if (gf.field_k > field_J.length) {
                break L2;
              } else {
                var1 = 0;
                L3: while (true) {
                  if (var1 >= gf.field_k) {
                    break L1;
                  } else {
                    field_J[var1] = null;
                    var1++;
                    continue L3;
                  }
                }
              }
            }
          }
          field_J = new wa[gf.field_k];
          break L1;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        nq var5 = gn.field_u;
        if (((bj) this).field_G != null) {
            int discarded$0 = var5.a(da.field_c, param3 + ((bj) this).field_m, ((bj) this).field_q + param2, ((bj) this).field_x, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_J);
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((bj) this).field_G.length) {
            L1: {
              if (param1 == 6) {
                break L1;
              } else {
                ((bj) this).a(105, -29, -115, 86);
                break L1;
              }
            }
            L2: {
              if (((bj) this).field_I[((bj) this).field_G.length] == param0) {
                ((bj) this).field_F.a(2147483647);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (((bj) this).field_I[var6] == param0) {
              ((bj) this).field_F.a(15270, ((bj) this).field_G[var6]);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    bj(dl param0) {
        super(0, 0, 0, 0, (iq) null);
        ((bj) this).field_F = param0;
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ((bj) this).field_A.a(0);
        if (param0 != null) {
            // if_icmpeq L28
        } else {
            ((bj) this).field_G = null;
            return;
        }
        int var3 = param0.length;
        ((bj) this).field_G = new String[var3];
        for (var4_int = param1; var3 > var4_int; var4_int++) {
            ((bj) this).field_G[var4_int] = ih.a((CharSequence) (Object) param0[var4_int], 68).replace(' ', ' ');
        }
        rq var4 = new rq(gn.field_u, 0, 1);
        ((bj) this).field_I = new kg[var3 - -1];
        for (var5 = 0; var3 > var5; var5++) {
            ((bj) this).field_I[var5] = new kg(((bj) this).field_G[var5], (ko) this);
            ((bj) this).field_I[var5].field_p = (iq) (Object) var4;
            ((bj) this).field_I[var5].field_v = ip.field_f;
            ((bj) this).field_I[var5].a(20 - -(var5 * 16), 15, (byte) 112, 0, 80);
            ((bj) this).b((byte) -107, (vg) (Object) ((bj) this).field_I[var5]);
        }
        ((bj) this).field_I[var3] = new kg(vl.field_p, (ko) this);
        ((bj) this).field_I[var3].field_p = (iq) (Object) var4;
        ((bj) this).field_I[var3].a(16 + (var3 * 16 + 20), 15, (byte) 102, 0, 100);
        ((bj) this).b((byte) -65, (vg) (Object) ((bj) this).field_I[var3]);
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        if (!(!super.a(param0, param1, param2 + 0, param3))) {
            return true;
        }
        if (-99 == (param0 ^ -1)) {
            return ((bj) this).a(param3, true);
        }
        if (param2 != 13) {
            return true;
        }
        if (param0 != 99) {
            return false;
        }
        return ((bj) this).a(param3, 116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "<%0> has left.";
    }
}
