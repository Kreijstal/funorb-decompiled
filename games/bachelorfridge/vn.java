/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends lka implements mca {
    static int[] field_M;
    private int field_P;
    private qu field_N;

    final String c(byte param0) {
        if (((vn) this).field_t) {
          if (null != ((vn) this).field_h) {
            if (param0 != 16) {
              ((vn) this).field_P = 104;
              ha.a(gd.field_m, mk.field_p - (((vn) this).field_P + -((vn) this).field_p), false);
              return ((vn) this).field_h;
            } else {
              ha.a(gd.field_m, mk.field_p - (((vn) this).field_P + -((vn) this).field_p), false);
              return ((vn) this).field_h;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final qu a(int param0) {
        if (param0 != 16728128) {
            return null;
        }
        return ((vn) this).field_N;
    }

    final void i(byte param0) {
        if (param0 >= -87) {
          L0: {
            ((vn) this).field_N = null;
            this.i((byte) -111);
            if (((vn) this).field_N != null) {
              ((vn) this).field_N.a(574);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.i((byte) -111);
            if (((vn) this).field_N != null) {
              ((vn) this).field_N.a(574);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        this.a(param0, param1, param2, param3);
        ((vn) this).field_P = mk.field_p - ((vn) this).field_s + -param0;
    }

    public static void k(int param0) {
        field_M = null;
        if (param0 != -9063) {
            Object var2 = null;
            boolean discarded$0 = vn.a((byte) -1, (CharSequence) null);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 < 106) {
            vn.k(-80);
            return bf.a(10, -44, true, param1);
        }
        return bf.a(10, -44, true, param1);
    }

    final void a(int param0, qu param1) {
        if (param0 != 7) {
            qu discarded$0 = ((vn) this).a(-10);
            ((vn) this).field_N = param1;
            return;
        }
        ((vn) this).field_N = param1;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -9938) {
          return 66;
        } else {
          L0: {
            var2 = 0;
            if (0 != (param1 & 7)) {
              var2 = 8 + -(param1 & 7);
              break L0;
            } else {
              break L0;
            }
          }
          var3 = param1 - -var2;
          return var3;
        }
    }

    vn(String param0, pl param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[]{16777215, 16728128, 16744448, 16776960};
    }
}
