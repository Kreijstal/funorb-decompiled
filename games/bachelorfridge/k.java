/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends bw {
    pr field_j;
    k[] field_g;
    eia field_h;
    int field_i;
    boolean field_f;

    int[] a(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    final static pp a(boolean param0, lu param1) {
        nq var2 = null;
        int var3 = 0;
        if (param0) {
          return null;
        } else {
          var2 = qi.a(param1, (byte) 60);
          var3 = param1.b(16711935);
          return (pp) (Object) new kt(var2, var3);
        }
    }

    int a(int param0) {
        if (param0 != -2359) {
            Object var3 = null;
            ((k) this).a((byte) 23, (lu) null, 74);
            return -1;
        }
        return -1;
    }

    int c(byte param0) {
        if (param0 <= 35) {
            ((k) this).field_j = null;
            return -1;
        }
        return -1;
    }

    void b(int param0) {
        if (!((k) this).field_f) {
          ((k) this).field_h.a(false);
          ((k) this).field_h = null;
          if (param0 == -256) {
            return;
          } else {
            ((k) this).field_f = false;
            return;
          }
        } else {
          ((k) this).field_j.b(0);
          ((k) this).field_j = null;
          if (param0 == -256) {
            return;
          } else {
            ((k) this).field_f = false;
            return;
          }
        }
    }

    void d(byte param0) {
        if (param0 != -68) {
            ((k) this).field_i = 42;
        }
    }

    final int[] a(int param0, int param1, byte param2) {
        if (param2 > 104) {
          if (!((k) this).field_g[param0].field_f) {
            return ((k) this).field_g[param0].a(false, param1)[0];
          } else {
            return ((k) this).field_g[param0].a(param1, 0);
          }
        } else {
          ((k) this).field_j = null;
          if (!((k) this).field_g[param0].field_f) {
            return ((k) this).field_g[param0].a(false, param1)[0];
          } else {
            return ((k) this).field_g[param0].a(param1, 0);
          }
        }
    }

    int[][] a(boolean param0, int param1) {
        if (param0) {
            int[][] discarded$0 = ((k) this).a((byte) 115, -14, 40);
            throw new IllegalStateException("This operation does not have a colour output");
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    k(int param0, boolean param1) {
        ((k) this).field_g = new k[param0];
        ((k) this).field_f = param1 ? true : false;
    }

    final int[][] a(byte param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
        if (param0 < -57) {
          if (!((k) this).field_g[param1].field_f) {
            return ((k) this).field_g[param1].a(false, param2);
          } else {
            var6 = ((k) this).field_g[param1].a(param2, 0);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[0] = var6;
            var5[2] = var6;
            return var5;
          }
        } else {
          return null;
        }
    }

    void a(byte param0, lu param1, int param2) {
        if (param0 != -71) {
            Object var5 = null;
            pp discarded$0 = k.a(false, (lu) null);
        }
    }

    void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 < -9) {
          L0: {
            if ((((k) this).field_i ^ -1) != -256) {
              stackOut_4_0 = ((k) this).field_i;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var4 = stackIn_5_0;
          if (((k) this).field_f) {
            ((k) this).field_j = new pr(var4, param0, param2);
            return;
          } else {
            ((k) this).field_h = new eia(var4, param0, param2);
            return;
          }
        } else {
          return;
        }
    }

    final static void c(int param0) {
        eia.field_d = dg.field_k;
        jf.field_m = dg.field_f;
        tq.field_r = dg.field_h;
        if (param0 != 3685) {
            return;
        }
        mm.field_D = dg.field_j;
    }

    static {
    }
}
