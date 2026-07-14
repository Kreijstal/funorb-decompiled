/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class le extends ksa {
    int field_h;
    rt field_d;
    boolean field_g;
    le[] field_e;
    gab field_f;

    final int[][] a(byte param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
        if (param0 >= 30) {
          if (((le) this).field_e[param1].field_g) {
            var6 = ((le) this).field_e[param1].a(param2, true);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[2] = var6;
            var5[0] = var6;
            return var5;
          } else {
            return ((le) this).field_e[param1].a(255, param2);
          }
        } else {
          return null;
        }
    }

    void c(int param0) {
        if (((le) this).field_g) {
          ((le) this).field_f.a(false);
          ((le) this).field_f = null;
          if (param0 <= -23) {
            return;
          } else {
            ((le) this).field_g = true;
            return;
          }
        } else {
          ((le) this).field_d.a(1);
          ((le) this).field_d = null;
          if (param0 <= -23) {
            return;
          } else {
            ((le) this).field_g = true;
            return;
          }
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 == -9163) {
          L0: {
            if (255 == ((le) this).field_h) {
              stackOut_10_0 = param2;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((le) this).field_h;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          var4 = stackIn_11_0;
          if (!((le) this).field_g) {
            ((le) this).field_d = new rt(var4, param2, param1);
            return;
          } else {
            ((le) this).field_f = new gab(var4, param2, param1);
            return;
          }
        } else {
          L1: {
            int[][] discarded$14 = ((le) this).a(-12, 12);
            if (255 == ((le) this).field_h) {
              stackOut_3_0 = param2;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((le) this).field_h;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var4 = stackIn_4_0;
          if (!((le) this).field_g) {
            ((le) this).field_d = new rt(var4, param2, param1);
            return;
          } else {
            ((le) this).field_f = new gab(var4, param2, param1);
            return;
          }
        }
    }

    final int[] a(int param0, int param1, int param2) {
        if (param2 == 255) {
          if (!((le) this).field_e[param0].field_g) {
            return ((le) this).field_e[param0].a(255, param1)[0];
          } else {
            return ((le) this).field_e[param0].a(param1, true);
          }
        } else {
          int discarded$7 = ((le) this).d((byte) -6);
          if (!((le) this).field_e[param0].field_g) {
            return ((le) this).field_e[param0].a(255, param1)[0];
          } else {
            return ((le) this).field_e[param0].a(param1, true);
          }
        }
    }

    int d(byte param0) {
        if (param0 <= 62) {
            ((le) this).field_d = null;
            return -1;
        }
        return -1;
    }

    int a(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            ((le) this).a(97, 76, (ds) null);
            return -1;
        }
        return -1;
    }

    int[] a(int param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((le) this).a(-12);
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    void c(byte param0) {
        if (param0 >= -35) {
            ((le) this).c((byte) -62);
        }
    }

    int[][] a(int param0, int param1) {
        Object var4 = null;
        if (param0 != 255) {
          var4 = null;
          ((le) this).a(-96, -51, (ds) null);
          throw new IllegalStateException("This operation does not have a colour output");
        } else {
          throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    final static arb a(asb param0, byte param1, asb param2, int param3, int param4) {
        Object var6 = null;
        if (param1 <= -21) {
          if (!pa.a(param4, 2, param0, param3)) {
            return null;
          } else {
            return coa.a(param2.a(param4, param3, (byte) 13), 11);
          }
        } else {
          var6 = null;
          arb discarded$6 = le.a((asb) null, (byte) 32, (asb) null, -82, 9);
          if (!pa.a(param4, 2, param0, param3)) {
            return null;
          } else {
            return coa.a(param2.a(param4, param3, (byte) 13), 11);
          }
        }
    }

    le(int param0, boolean param1) {
        ((le) this).field_e = new le[param0];
        ((le) this).field_g = param1 ? true : false;
    }

    void a(int param0, int param1, ds param2) {
        if (param1 > -60) {
            ((le) this).field_g = false;
        }
    }

    static {
    }
}
