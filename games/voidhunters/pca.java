/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pca extends uqb implements ntb {
    int field_k;
    static uj[] field_i;
    static String field_l;
    static int field_j;
    static int field_m;

    public void b(faa param0, int param1) {
        super.b(param0, -121);
        if (param1 >= -109) {
          field_m = -29;
          this.a((byte) -121, param0);
          return;
        } else {
          this.a((byte) -121, param0);
          return;
        }
    }

    private final void a(faa param0, int param1) {
        Object var4 = null;
        if (param1 == 0) {
          if (em.field_o) {
            ((pca) this).field_k = param0.i(param1 + 0, hab.field_h);
            return;
          } else {
            return;
          }
        } else {
          var4 = null;
          ((pca) this).b((faa) null, -21);
          if (!em.field_o) {
            return;
          } else {
            ((pca) this).field_k = param0.i(param1 + 0, hab.field_h);
            return;
          }
        }
    }

    public void b(byte param0, tv param1) {
        if (param0 < 54) {
            return;
        }
        pca var5 = (pca) (Object) param1;
        pca var6 = var5;
        super.b((byte) 126, param1);
        var6.field_k = var5.field_k;
    }

    private final void a(byte param0, faa param1) {
        if (param0 >= -116) {
          L0: {
            boolean discarded$12 = pca.a(-90, -61, 89);
            if (em.field_o) {
              param1.a(-632, ((pca) this).field_k, hab.field_h);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (em.field_o) {
              param1.a(-632, ((pca) this).field_k, hab.field_h);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    protected pca() {
    }

    public void a(tv param0, int param1) {
        pca var3 = null;
        int var4 = 0;
        super.a(param0, -22);
        var3 = (pca) (Object) param0;
        var4 = 0;
        if (param1 <= -19) {
          L0: {
            if (var3.field_k == var3.field_k) {
              break L0;
            } else {
              iva.a(-6940, "int playerid has changed. before=" + var3.field_k + ", now=" + var3.field_k);
              var4 = 1;
              break L0;
            }
          }
          if (var4 != 0) {
            iva.a(-6940, "This instance of CarouselPlayerEvent has changed");
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3 = 0;
        pca var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = -110 / ((param0 - 22) / 59);
        var4 = (pca) (Object) param1;
        if (!super.a((byte) -50, param1)) {
          if (var4.field_k != var4.field_k) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public void a(faa param0, boolean param1) {
        Object var4 = null;
        if (param1) {
          var4 = null;
          ((pca) this).a((tv) null, -35);
          super.a(param0, param1);
          this.a(param0, 0);
          return;
        } else {
          super.a(param0, param1);
          this.a(param0, 0);
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 1) {
          L0: {
            pca.d(40);
            if (0 == (param1 & 34)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == (param1 & 34)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void d(int param0) {
        field_l = null;
        field_i = null;
        int var1 = -58 % ((-48 - param0) / 44);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "More standard weapons";
        field_j = 0;
        field_m = 1;
    }
}
