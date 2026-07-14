/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends vd implements lja {
    private String[] field_F;
    static String field_G;
    private uja field_D;
    private hf[] field_E;
    static boolean field_H;

    dd(uja param0) {
        super(0, 0, 0, 0, (qda) null);
        ((dd) this).field_D = param0;
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var6 = 0;
        L0: while (true) {
          if (((dd) this).field_F.length <= var6) {
            if (param1 != ((dd) this).field_E[((dd) this).field_F.length]) {
              if (param3 <= 50) {
                ((dd) this).a((byte) -38, -88, -30, 94);
                return;
              } else {
                return;
              }
            } else {
              ((dd) this).field_D.a(14322);
              if (param3 > 50) {
                return;
              } else {
                ((dd) this).a((byte) -38, -88, -30, 94);
                return;
              }
            }
          } else {
            if (((dd) this).field_E[var6] == param1) {
              ((dd) this).field_D.a(((dd) this).field_F[var6], (byte) -114);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static void d(byte param0) {
        Object var2 = null;
        rt.a("", (String) null, 9);
        if (param0 >= -10) {
            field_H = true;
        }
    }

    final void a(String[] param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        pka var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = BachelorFridge.field_y;
        ((dd) this).field_A.d(67);
        if (param0 != null) {
          if (param0.length != 0) {
            var3 = param0.length;
            ((dd) this).field_F = new String[var3];
            var4_int = 0;
            L0: while (true) {
              if (var3 <= var4_int) {
                var4 = new pka(jca.field_a, 0, 1);
                ((dd) this).field_E = new hf[1 + var3];
                var5 = 0;
                L1: while (true) {
                  if (var3 <= var5) {
                    ((dd) this).field_E[var3] = new hf(mt.field_t, (pl) this);
                    ((dd) this).field_E[var3].field_f = (qda) (Object) var4;
                    ((dd) this).field_E[var3].a(0, 15, (byte) 59, 100, 20 + var3 * 16 + 16);
                    if (param1 >= -19) {
                      var7 = null;
                      boolean discarded$2 = ((dd) this).a(28, 90, '￺', (wj) null);
                      ((dd) this).c((wj) (Object) ((dd) this).field_E[var3], 112);
                      return;
                    } else {
                      ((dd) this).c((wj) (Object) ((dd) this).field_E[var3], 112);
                      return;
                    }
                  } else {
                    ((dd) this).field_E[var5] = new hf(((dd) this).field_F[var5], (pl) this);
                    ((dd) this).field_E[var5].field_f = (qda) (Object) var4;
                    ((dd) this).field_E[var5].field_h = a.field_p;
                    ((dd) this).field_E[var5].a(0, 15, (byte) 59, 80, 16 * var5 + 20);
                    ((dd) this).c((wj) (Object) ((dd) this).field_E[var5], -125);
                    var5++;
                    continue L1;
                  }
                }
              } else {
                ((dd) this).field_F[var4_int] = lu.a((CharSequence) (Object) param0[var4_int], 7995).replace(' ', ' ');
                var4_int++;
                continue L0;
              }
            }
          } else {
            ((dd) this).field_F = null;
            return;
          }
        } else {
          ((dd) this).field_F = null;
          return;
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 0) {
            field_H = true;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        po var5 = null;
        int var6 = 0;
        this.a((byte) 108, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          var6 = -102 / ((-20 - param0) / 54);
          var5 = jca.field_a;
          if (((dd) this).field_F != null) {
            int discarded$2 = var5.a(oja.field_b, ((dd) this).field_s + param3, ((dd) this).field_v + param1, ((dd) this).field_p, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_B);
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        if (this.a(param0 ^ 0, param1, param2, param3)) {
          return true;
        } else {
          if (param1 != 98) {
            if (param0 == 10) {
              if ((param1 ^ -1) == -100) {
                return ((dd) this).b(param3, 1);
              } else {
                return false;
              }
            } else {
              ((dd) this).a((byte) 70, -46, 111, 92);
              if ((param1 ^ -1) == -100) {
                return ((dd) this).b(param3, 1);
              } else {
                return false;
              }
            }
          } else {
            return ((dd) this).a(-124, param3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = false;
    }
}
