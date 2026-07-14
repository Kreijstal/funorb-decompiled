/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends ll {
    static int field_I;
    int field_L;
    static int field_F;
    sk field_K;
    static int field_H;
    static String field_J;
    byte[] field_G;

    final static al g(int param0) {
        if (param0 == -1) {
          if (null == pg.field_d) {
            pg.field_d = new al(dh.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, dh.field_d.field_N, -1, 2147483647, true);
            return pg.field_d;
          } else {
            return pg.field_d;
          }
        } else {
          fd.h(43);
          if (null != pg.field_d) {
            return pg.field_d;
          } else {
            pg.field_d = new al(dh.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, dh.field_d.field_N, -1, 2147483647, true);
            return pg.field_d;
          }
        }
    }

    public static void h(int param0) {
        if (param0 != -1) {
            return;
        }
        field_J = null;
    }

    final static void a(int param0, int param1, v param2) {
        bc var3 = nd.field_Lb;
        var3.f(param1, (byte) -92);
        int var4 = 76 % ((12 - param0) / 62);
        var3.a(param2.field_n, false);
        var3.a(param2.field_q, false);
    }

    final static kh[] a(boolean param0, int param1, int param2, ah param3) {
        if (ia.a(param1, param3, param2, -93)) {
          if (param0) {
            field_J = null;
            return e.a((byte) 123);
          } else {
            return e.a((byte) 123);
          }
        } else {
          return null;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 <= 72) {
            return true;
        }
        if (param0 < 48) {
            return false;
        }
        if (param0 > 57) {
            return false;
        }
        return true;
    }

    final static boolean a(int param0, byte param1) {
        if (param1 == 99) {
          if (qb.a(param0, (byte) 114)) {
            if ((param0 ^ -1) == 1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_F = 86;
          if (qb.a(param0, (byte) 114)) {
            if ((param0 ^ -1) == 1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          if (((fd) this).field_v) {
            return 0;
          } else {
            return 100;
          }
        } else {
          ((fd) this).field_G = null;
          if (((fd) this).field_v) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    fd() {
    }

    final byte[] c(boolean param0) {
        if (param0) {
          if (((fd) this).field_v) {
            throw new RuntimeException();
          } else {
            return ((fd) this).field_G;
          }
        } else {
          al discarded$5 = fd.g(-4);
          if (((fd) this).field_v) {
            throw new RuntimeException();
          } else {
            return ((fd) this).field_G;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 0;
    }
}
