/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci extends vg {
    fk field_h;
    boolean field_g;
    static int field_k;
    mv field_i;
    static ij field_l;
    int field_f;
    ci[] field_j;

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if ((((ci) this).field_f ^ -1) != param2) {
            stackOut_2_0 = ((ci) this).field_f;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (((ci) this).field_g) {
          ((ci) this).field_i = new mv(var4, param1, param0);
          return;
        } else {
          ((ci) this).field_h = new fk(var4, param1, param0);
          return;
        }
    }

    final int[] c(int param0, int param1, int param2) {
        if (param1 <= -3) {
          if (((ci) this).field_j[param0].field_g) {
            return ((ci) this).field_j[param0].c(1, param2);
          } else {
            return ((ci) this).field_j[param0].b(param2, -1)[0];
          }
        } else {
          ((ci) this).field_f = 54;
          if (((ci) this).field_j[param0].field_g) {
            return ((ci) this).field_j[param0].c(1, param2);
          } else {
            return ((ci) this).field_j[param0].b(param2, -1)[0];
          }
        }
    }

    void a(byte param0, uia param1, int param2) {
        if (param0 != 107) {
            int[] discarded$0 = ((ci) this).c(1, -94);
        }
    }

    final int[][] a(int param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
        if (param2 == -1) {
          if (((ci) this).field_j[param1].field_g) {
            var6 = ((ci) this).field_j[param1].c(1, param0);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[2] = var6;
            var5[0] = var6;
            return var5;
          } else {
            return ((ci) this).field_j[param1].b(param0, -1);
          }
        } else {
          return null;
        }
    }

    final static roa a(int param0, int param1) {
        roa var2 = tt.a(param1, param0);
        var2.field_r = param0;
        var2.field_q = var2.field_p;
        return var2;
    }

    void b(byte param0) {
        if (param0 != 116) {
            int discarded$0 = ((ci) this).c((byte) 122);
        }
    }

    int[][] b(int param0, int param1) {
        if (param1 != -1) {
            return null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    int a(int param0) {
        if (param0 <= 96) {
            ((ci) this).field_h = null;
            return -1;
        }
        return -1;
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 >= -69) {
            Object var2 = null;
            kg discarded$0 = ci.a((byte[]) null, (byte) 54);
        }
    }

    void b(int param0) {
        if (!((ci) this).field_g) {
          ((ci) this).field_h.a(2);
          ((ci) this).field_h = null;
          if (param0 < -32) {
            return;
          } else {
            ((ci) this).b((byte) 31);
            return;
          }
        } else {
          ((ci) this).field_i.a(false);
          ((ci) this).field_i = null;
          if (param0 < -32) {
            return;
          } else {
            ((ci) this).b((byte) 31);
            return;
          }
        }
    }

    int[] c(int param0, int param1) {
        if (param0 != 1) {
            int[] discarded$0 = ((ci) this).c(-21, -6);
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    ci(int param0, boolean param1) {
        ((ci) this).field_j = new ci[param0];
        ((ci) this).field_g = param1 ? true : false;
    }

    final static kg a(byte[] param0, byte param1) {
        kg var2 = null;
        int var3 = 0;
        if (param0 == null) {
          return null;
        } else {
          var2 = new kg(param0, ak.field_p, pg.field_C, mq.field_b, iga.field_m, mga.field_g, ck.field_c);
          loa.a((byte) -70);
          var3 = -23 % ((-28 - param1) / 37);
          return var2;
        }
    }

    int c(byte param0) {
        if (param0 != -117) {
            ((ci) this).b((byte) -6);
            return -1;
        }
        return -1;
    }

    static {
    }
}
